package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import e1.k;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l3.C1389a;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    com.google.android.gms.common.a zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    b zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z4) {
            this.zza = str;
            this.zzb = z4;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z4 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z4);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            D.h("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            b bVar = advertisingIdClient.zze;
                            if (bVar == null || !bVar.f10717d) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e7) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                        }
                    }
                    D.i(advertisingIdClient.zza);
                    D.i(advertisingIdClient.zzb);
                    try {
                        zzd = advertisingIdClient.zzb.zzd();
                    } catch (RemoteException e8) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z4) {
    }

    private final Info zzd(int i7) {
        Info info;
        D.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        b bVar = this.zze;
                        if (bVar == null || !bVar.f10717d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e7) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                    }
                }
                D.i(this.zza);
                D.i(this.zzb);
                try {
                    info = new Info(this.zzb.zzc(), this.zzb.zze(true));
                } catch (RemoteException e8) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            b bVar = this.zze;
            if (bVar != null) {
                bVar.f10716c.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new b(this, j);
            }
        }
    }

    public final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return zzd(-1);
    }

    public void start() {
        zzb(true);
    }

    public final void zza() {
        D.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        C1389a.a().b(this.zzg, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z4) {
        D.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int d7 = d.f11217b.d(context, g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (d7 != 0 && d7 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C1389a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = aVar;
                        try {
                            this.zzb = zze.zza(aVar.a(TimeUnit.MILLISECONDS));
                            this.zzc = true;
                            if (z4) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(Info info, boolean z4, float f7, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap m7 = k.m("app_context", "1");
        if (info != null) {
            m7.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                m7.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            m7.put("error", th.getClass().getName());
        }
        m7.put("tag", "AdvertisingIdClient");
        m7.put("time_spent", Long.toString(j));
        new a(m7).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j, boolean z4, boolean z7) {
        Context applicationContext;
        this.zzd = new Object();
        D.i(context);
        if (z4 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }
}
