package com.tiktok.appevents;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.IOUtils;
import com.tiktok.util.JSON;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTReflect;
import com.tiktok.util.TTUtil;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TTIdentifierFactory {
    private static final int UPDATE_TIMES = 3600000;
    private static volatile boolean sAdTrackingEnabled;
    private static ExecutorService sExecutor;
    private static volatile String sGAID;
    private static final String TAG = "TTIdentifierFactory";
    private static final TTLogger logger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());
    private static final AtomicInteger sMaxRetry = new AtomicInteger(0);
    private static volatile long sNextUpdateTime = SystemClock.elapsedRealtime() + 3600000;

    public static AdIdInfo getGoogleAdIdInfo(Context context) {
        AtomicInteger atomicInteger = sMaxRetry;
        if (atomicInteger.get() > 20) {
            return AdIdInfo.buildDefault();
        }
        AdIdInfo byCache = getByCache(context);
        if (byCache == null) {
            byCache = getByReflect(context);
        }
        if (byCache == null) {
            byCache = getByService(context);
        }
        if (byCache == null) {
            byCache = AdIdInfo.buildDefault();
        }
        if (byCache.from == 10 || byCache.from == 12) {
            updateAdIdInfo(context);
        }
        sendMonitor(byCache);
        if (TextUtils.isEmpty(byCache.adId)) {
            atomicInteger.getAndIncrement();
        }
        return byCache;
    }

    private static void sendMonitor(AdIdInfo info) {
        if (info != null) {
            try {
                JSONObject metaWithTS = TTUtil.getMetaWithTS(null);
                JSON.putLong(metaWithTS, IronSourceConstants.EVENTS_DURATION, info.duration);
                JSON.putInt(metaWithTS, Constants.MessagePayloadKeys.FROM, info.from);
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("gaid_result", metaWithTS, null);
            } catch (Throwable unused) {
            }
        }
    }

    private static void updateAdIdInfo(final Context context) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (sNextUpdateTime > 0 && sNextUpdateTime < elapsedRealtime) {
                logger.info("gaid is not updated yet", new Object[0]);
                return;
            }
            logger.info("gaid is updated", new Object[0]);
            sNextUpdateTime = elapsedRealtime + 3600000;
            if (sExecutor == null) {
                sExecutor = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());
            }
            sExecutor.submit(new Runnable() { // from class: com.tiktok.appevents.TTIdentifierFactory$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TTIdentifierFactory.lambda$updateAdIdInfo$0(context);
                }
            });
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ void lambda$updateAdIdInfo$0(final Context context) {
        if (getByReflect(context) == null) {
            getByService(context);
        }
    }

    private static AdIdInfo getByCache(Context context) {
        if (!TextUtils.isEmpty(sGAID)) {
            AdIdInfo adIdInfo = new AdIdInfo(sGAID, sAdTrackingEnabled);
            adIdInfo.from = 10;
            return adIdInfo;
        }
        if (TextUtils.isEmpty(sGAID)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String gaid = GAIDCache.getInstance(context).getGAID();
            boolean trackEnable = GAIDCache.getInstance(context).trackEnable();
            if (!TextUtils.isEmpty(gaid)) {
                sGAID = gaid;
                sAdTrackingEnabled = trackEnable;
                AdIdInfo adIdInfo2 = new AdIdInfo(sGAID, sAdTrackingEnabled);
                adIdInfo2.from = 12;
                adIdInfo2.duration = SystemClock.elapsedRealtime() - elapsedRealtime;
                return adIdInfo2;
            }
        }
        return null;
    }

    private static AdIdInfo getByReflect(Context context) {
        long elapsedRealtime;
        Object call;
        try {
            elapsedRealtime = SystemClock.elapsedRealtime();
            call = TTReflect.on("com.google.android.gms.ads.identifier.AdvertisingIdClient").findMethod("getAdvertisingIdInfo", Context.class).call(null, context);
        } catch (Throwable unused) {
        }
        if (call == null) {
            return null;
        }
        String str = (String) TTReflect.on(call.getClass()).findMethod("getId", new Class[0]).call(call, new Object[0]);
        Boolean bool = (Boolean) TTReflect.on(call.getClass()).findMethod(U3.j.M, new Class[0]).call(call, new Object[0]);
        if (!TextUtils.isEmpty(str) && bool != null) {
            sGAID = str;
            sAdTrackingEnabled = bool.booleanValue();
            sNextUpdateTime = SystemClock.elapsedRealtime() + 3600000;
            GAIDCache.getInstance(context).update(str, bool.booleanValue());
            AdIdInfo adIdInfo = new AdIdInfo(str, bool.booleanValue());
            adIdInfo.from = 13;
            adIdInfo.duration = SystemClock.elapsedRealtime() - elapsedRealtime;
            return adIdInfo;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AdIdInfo getByService(Context context) {
        AdIdConnection adIdConnection;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            adIdConnection = new AdIdConnection();
            try {
                if (context.bindService(intent, adIdConnection, 1)) {
                    AdIdInterface adIdInterface = new AdIdInterface(adIdConnection.getBinder());
                    String adId = adIdInterface.getAdId();
                    boolean isAdIdTrackingEnabled = adIdInterface.isAdIdTrackingEnabled();
                    if (!TextUtils.isEmpty(adId)) {
                        sGAID = adId;
                        sAdTrackingEnabled = isAdIdTrackingEnabled;
                        sNextUpdateTime = SystemClock.elapsedRealtime() + 3600000;
                        GAIDCache.getInstance(context).update(adId, isAdIdTrackingEnabled);
                        AdIdInfo adIdInfo = new AdIdInfo(adId, isAdIdTrackingEnabled);
                        adIdInfo.from = 14;
                        adIdInfo.duration = SystemClock.elapsedRealtime() - elapsedRealtime;
                        try {
                            context.unbindService(adIdConnection);
                        } catch (Throwable unused) {
                        }
                        return adIdInfo;
                    }
                } else {
                    logger.info("Failed to detect google play identifier service on this phone", new Object[0]);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    logger.error(th, "remote exception", new Object[0]);
                } catch (Throwable th2) {
                    if (adIdConnection != null) {
                        try {
                            context.unbindService(adIdConnection);
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            adIdConnection = null;
        }
        try {
            context.unbindService(adIdConnection);
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static class AdIdInfo {
        public static final int FROM_DEFAULT = 0;
        public static final int FROM_REFLECT = 13;
        public static final int FROM_ROM = 10;
        public static final int FROM_SERVICE = 14;
        public static final int FROM_SP = 12;
        private final String adId;
        public long duration;
        public int from;
        private final boolean isAdTrackingEnabled;

        static AdIdInfo buildDefault() {
            return new AdIdInfo("", true);
        }

        private AdIdInfo(String adId, boolean isAdTrackingEnabled) {
            this.from = 0;
            this.duration = 0L;
            this.adId = adId;
            this.isAdTrackingEnabled = isAdTrackingEnabled;
        }

        public String getAdId() {
            return this.adId;
        }

        public boolean isAdTrackingEnabled() {
            return this.isAdTrackingEnabled;
        }
    }

    private static class GAIDCache {
        private static final String SP_K_GAID = "gaid";
        private static final String SP_K_TRACK = "t_enable";
        private static final String SP_NAME = "com.tiktok.sdk.ids";
        private static volatile GAIDCache sInstance;
        private SharedPreferences mSP;

        public static GAIDCache getInstance(Context context) {
            if (sInstance == null) {
                synchronized (GAIDCache.class) {
                    if (sInstance == null) {
                        sInstance = new GAIDCache(context);
                    }
                }
            }
            return sInstance;
        }

        private GAIDCache(Context context) {
            this.mSP = null;
            try {
                this.mSP = context.getApplicationContext().getSharedPreferences(SP_NAME, 0);
            } catch (Throwable unused) {
            }
        }

        private SharedPreferences mySP() {
            if (this.mSP == null) {
                try {
                    Application applicationContext = TikTokBusinessSdk.getApplicationContext();
                    if (applicationContext != null) {
                        this.mSP = applicationContext.getSharedPreferences(SP_NAME, 0);
                    }
                } catch (Throwable unused) {
                }
            }
            return this.mSP;
        }

        public String getGAID() {
            try {
                return mySP().getString("gaid", null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean trackEnable() {
            try {
                return mySP().getBoolean(SP_K_TRACK, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public void update(String gaid, boolean enable) {
            try {
                mySP().edit().putString("gaid", gaid).putBoolean(SP_K_TRACK, enable).apply();
            } catch (Throwable unused) {
            }
        }
    }

    private static class AdIdConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> queue;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private AdIdConnection() {
            this.queue = new ArrayBlockingQueue(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.queue.put(iBinder);
            } catch (Throwable unused) {
            }
        }

        public IBinder getBinder() {
            try {
                return this.queue.take();
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private static class AdIdInterface implements IInterface {
        private static final int AD_ID_TRANSACTION_CODE = 1;
        private static final int AD_TRACKING_TRANSACTION_CODE = 2;
        private static final String INTERFACE_TOKEN = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        private final IBinder mIBinder;

        private AdIdInterface(IBinder binder) {
            this.mIBinder = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getAdId() {
            Parcel parcel;
            Parcel parcel2;
            String str;
            Parcel parcel3 = null;
            try {
                if (this.mIBinder != null) {
                    parcel = Parcel.obtain();
                    try {
                        parcel2 = Parcel.obtain();
                    } catch (Throwable unused) {
                        parcel2 = null;
                    }
                    try {
                        parcel.writeInterfaceToken(INTERFACE_TOKEN);
                        this.mIBinder.transact(1, parcel, parcel2, 0);
                        parcel2.readException();
                        str = parcel2.readString();
                        parcel3 = parcel;
                    } catch (Throwable unused2) {
                        IOUtils.close(parcel, parcel2);
                        return null;
                    }
                } else {
                    str = null;
                    parcel2 = null;
                }
                IOUtils.close(parcel3, parcel2);
                return str;
            } catch (Throwable unused3) {
                parcel = null;
                parcel2 = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isAdIdTrackingEnabled() {
            Parcel parcel;
            Parcel parcel2;
            boolean z;
            Parcel parcel3 = null;
            try {
                if (this.mIBinder != null) {
                    Parcel obtain = Parcel.obtain();
                    try {
                        parcel3 = Parcel.obtain();
                        obtain.writeInterfaceToken(INTERFACE_TOKEN);
                        obtain.writeInt(1);
                        this.mIBinder.transact(2, obtain, parcel3, 0);
                        parcel3.readException();
                        z = parcel3.readInt() != 0;
                        parcel2 = parcel3;
                        parcel3 = obtain;
                    } catch (Throwable unused) {
                        parcel = parcel3;
                        parcel3 = obtain;
                        IOUtils.close(parcel3, parcel);
                        return true;
                    }
                } else {
                    parcel2 = null;
                    z = true;
                }
                IOUtils.close(parcel3, parcel2);
                return z;
            } catch (Throwable unused2) {
                parcel = null;
            }
        }
    }
}
