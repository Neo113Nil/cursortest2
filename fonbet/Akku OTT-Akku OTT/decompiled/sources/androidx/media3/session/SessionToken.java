package androidx.media3.session;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.session.legacy.LegacyParcelableUtil;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import com.google.common.collect.M;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class SessionToken {
    private static final String FIELD_IMPL;
    private static final String FIELD_IMPL_TYPE;
    private static final int IMPL_TYPE_BASE = 0;
    private static final int IMPL_TYPE_LEGACY = 1;
    public static final int PLATFORM_SESSION_VERSION = 0;
    static final int TYPE_BROWSER_SERVICE_LEGACY = 101;
    public static final int TYPE_LIBRARY_SERVICE = 2;
    public static final int TYPE_SESSION = 0;
    static final int TYPE_SESSION_LEGACY = 100;
    public static final int TYPE_SESSION_SERVICE = 1;

    @UnstableApi
    public static final int UNKNOWN_INTERFACE_VERSION = 0;
    public static final int UNKNOWN_SESSION_VERSION = 1000000;
    private static final long WAIT_TIME_MS_FOR_SESSION3_TOKEN = 500;
    private final SessionTokenImpl impl;

    public interface SessionTokenImpl {
        @Nullable
        Object getBinder();

        @Nullable
        ComponentName getComponentName();

        Bundle getExtras();

        int getInterfaceVersion();

        int getLibraryVersion();

        String getPackageName();

        @Nullable
        MediaSession.Token getPlatformToken();

        String getServiceName();

        int getType();

        int getUid();

        boolean isLegacySession();

        Bundle toBundle();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenType {
    }

    static {
        MediaLibraryInfo.registerModule("media3.session");
        FIELD_IMPL_TYPE = Util.intToStringMaxRadix(0);
        FIELD_IMPL = Util.intToStringMaxRadix(1);
    }

    public SessionToken(Context context, ComponentName componentName) {
        int i;
        Assertions.checkNotNull(context, "context must not be null");
        Assertions.checkNotNull(componentName, "serviceComponent must not be null");
        PackageManager packageManager = context.getPackageManager();
        int uid = getUid(packageManager, componentName.getPackageName());
        if (isInterfaceDeclared(packageManager, MediaLibraryService.SERVICE_INTERFACE, componentName)) {
            i = 2;
        } else if (isInterfaceDeclared(packageManager, MediaSessionService.SERVICE_INTERFACE, componentName)) {
            i = 1;
        } else {
            if (!isInterfaceDeclared(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                throw new IllegalArgumentException("Failed to resolve SessionToken for " + componentName + ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.");
            }
            i = 101;
        }
        if (i != 101) {
            this.impl = new SessionTokenImplBase(componentName, uid, i);
        } else {
            this.impl = new SessionTokenImplLegacy(componentName, uid);
        }
    }

    private static MediaSessionCompat.Token createCompatToken(Parcelable parcelable) {
        return parcelable instanceof MediaSession.Token ? MediaSessionCompat.Token.fromToken((MediaSession.Token) parcelable) : (MediaSessionCompat.Token) LegacyParcelableUtil.convert(parcelable, MediaSessionCompat.Token.CREATOR);
    }

    public static com.google.common.util.concurrent.u<SessionToken> createSessionToken(Context context, MediaSession.Token token) {
        return createSessionToken(context, MediaSessionCompat.Token.fromToken(token));
    }

    @UnstableApi
    public static SessionToken fromBundle(Bundle bundle) {
        return new SessionToken(bundle, (MediaSession.Token) null);
    }

    public static com.google.common.collect.M<SessionToken> getAllServiceTokens(Context context) {
        ServiceInfo serviceInfo;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent(MediaLibraryService.SERVICE_INTERFACE), 128);
        if (queryIntentServices != null) {
            arrayList.addAll(queryIntentServices);
        }
        List<ResolveInfo> queryIntentServices2 = packageManager.queryIntentServices(new Intent(MediaSessionService.SERVICE_INTERFACE), 128);
        if (queryIntentServices2 != null) {
            arrayList.addAll(queryIntentServices2);
        }
        List<ResolveInfo> queryIntentServices3 = packageManager.queryIntentServices(new Intent("android.media.browse.MediaBrowserService"), 128);
        if (queryIntentServices3 != null) {
            arrayList.addAll(queryIntentServices3);
        }
        int i = com.google.common.collect.M.c;
        M.a aVar = new M.a(4);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                aVar.c(new SessionToken(context, new ComponentName(serviceInfo.packageName, serviceInfo.name)));
            }
        }
        return aVar.h();
    }

    private static boolean isInterfaceDeclared(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (queryIntentServices != null) {
            for (int i = 0; i < queryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = queryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createSessionToken$0(Context context, String str, MediaSessionCompat.Token token, MediaControllerCompat mediaControllerCompat, com.google.common.util.concurrent.x xVar) {
        xVar.set(new SessionToken(token, str, getUid(context.getPackageManager(), str), mediaControllerCompat.getSessionInfo()));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SessionToken) {
            return this.impl.equals(((SessionToken) obj).impl);
        }
        return false;
    }

    @Nullable
    public Object getBinder() {
        return this.impl.getBinder();
    }

    @Nullable
    public ComponentName getComponentName() {
        return this.impl.getComponentName();
    }

    public Bundle getExtras() {
        return this.impl.getExtras();
    }

    @UnstableApi
    public int getInterfaceVersion() {
        return this.impl.getInterfaceVersion();
    }

    public String getPackageName() {
        return this.impl.getPackageName();
    }

    @Nullable
    public MediaSession.Token getPlatformToken() {
        return this.impl.getPlatformToken();
    }

    public String getServiceName() {
        return this.impl.getServiceName();
    }

    public int getSessionVersion() {
        return this.impl.getLibraryVersion();
    }

    public int getType() {
        return this.impl.getType();
    }

    public int getUid() {
        return this.impl.getUid();
    }

    public int hashCode() {
        return this.impl.hashCode();
    }

    public boolean isLegacySession() {
        return this.impl.isLegacySession();
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (this.impl instanceof SessionTokenImplBase) {
            bundle.putInt(FIELD_IMPL_TYPE, 0);
        } else {
            bundle.putInt(FIELD_IMPL_TYPE, 1);
        }
        bundle.putBundle(FIELD_IMPL, this.impl.toBundle());
        return bundle;
    }

    public String toString() {
        return this.impl.toString();
    }

    @UnstableApi
    public static com.google.common.util.concurrent.u<SessionToken> createSessionToken(Context context, Parcelable parcelable) {
        return createSessionToken(context, createCompatToken(parcelable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SessionToken fromBundle(Bundle bundle, MediaSession.Token token) {
        return new SessionToken(bundle, token);
    }

    private static int getUid(PackageManager packageManager, String str) {
        try {
            return packageManager.getApplicationInfo(str, 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @UnstableApi
    public static com.google.common.util.concurrent.u<SessionToken> createSessionToken(Context context, MediaSession.Token token, Looper looper) {
        return createSessionToken(context, MediaSessionCompat.Token.fromToken(token), looper);
    }

    @UnstableApi
    public static com.google.common.util.concurrent.u<SessionToken> createSessionToken(Context context, Parcelable parcelable, Looper looper) {
        return createSessionToken(context, createCompatToken(parcelable), looper);
    }

    private static com.google.common.util.concurrent.u<SessionToken> createSessionToken(Context context, MediaSessionCompat.Token token) {
        HandlerThread handlerThread = new HandlerThread("SessionTokenThread");
        handlerThread.start();
        com.google.common.util.concurrent.u<SessionToken> createSessionToken = createSessionToken(context, token, handlerThread.getLooper());
        createSessionToken.addListener(new F5(handlerThread), com.google.common.util.concurrent.j.a);
        return createSessionToken;
    }

    private static com.google.common.util.concurrent.u<SessionToken> createSessionToken(final Context context, final MediaSessionCompat.Token token, Looper looper) {
        Assertions.checkNotNull(context, "context must not be null");
        Assertions.checkNotNull(token, "compatToken must not be null");
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        final MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(context, token);
        final String str = (String) Assertions.checkNotNull(mediaControllerCompat.getPackageName());
        final Handler handler = new Handler(looper);
        final Runnable runnable = new Runnable() { // from class: androidx.media3.session.G5
            @Override // java.lang.Runnable
            public final void run() {
                SessionToken.lambda$createSessionToken$0(context, str, token, mediaControllerCompat, xVar);
            }
        };
        handler.postDelayed(runnable, 500L);
        mediaControllerCompat.sendCommand("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", null, new ResultReceiver(handler) { // from class: androidx.media3.session.SessionToken.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                handler.removeCallbacksAndMessages(null);
                try {
                    xVar.set(SessionToken.fromBundle(bundle, token.getToken()));
                } catch (RuntimeException unused) {
                    runnable.run();
                }
            }
        });
        return xVar;
    }

    public SessionToken(int i, int i2, int i3, int i4, String str, IMediaSession iMediaSession, Bundle bundle, @Nullable MediaSession.Token token) {
        this.impl = new SessionTokenImplBase(i, i2, i3, i4, str, iMediaSession, bundle, token);
    }

    private SessionToken(MediaSessionCompat.Token token, String str, int i, Bundle bundle) {
        this.impl = new SessionTokenImplLegacy(token, str, i, bundle);
    }

    private SessionToken(Bundle bundle, @Nullable MediaSession.Token token) {
        String str = FIELD_IMPL_TYPE;
        Assertions.checkArgument(bundle.containsKey(str), "Impl type needs to be set.");
        int i = bundle.getInt(str);
        Bundle bundle2 = (Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_IMPL));
        if (i == 0) {
            this.impl = SessionTokenImplBase.fromBundle(bundle2, token);
        } else {
            this.impl = SessionTokenImplLegacy.fromBundle(bundle2);
        }
    }
}
