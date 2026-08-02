package okhttp3.internal.platform;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR(\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/platform/PlatformRegistry;", "", "<init>", "()V", "Lokhttp3/internal/platform/Platform;", "findPlatform", "()Lokhttp3/internal/platform/Platform;", "", "isAndroid", "()Z", "Landroid/content/Context;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "applicationContext"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlatformRegistry {
    public static final okhttp3.internal.platform.PlatformRegistry INSTANCE = new okhttp3.internal.platform.PlatformRegistry();

    public final boolean isAndroid() {
        return true;
    }

    private PlatformRegistry() {
    }

    public final okhttp3.internal.platform.Platform findPlatform() {
        okhttp3.internal.platform.android.AndroidLog.INSTANCE.enable();
        okhttp3.internal.platform.Platform buildIfSupported = okhttp3.internal.platform.Android10Platform.INSTANCE.buildIfSupported();
        if (buildIfSupported == null) {
            buildIfSupported = okhttp3.internal.platform.AndroidPlatform.INSTANCE.buildIfSupported();
        }
        if (buildIfSupported != null) {
            return buildIfSupported;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected Android API level 21+ but was ");
        sb.append(android.os.Build.VERSION.SDK_INT);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public final android.content.Context getApplicationContext() {
        java.lang.Object obj = okhttp3.internal.platform.Platform.INSTANCE.get();
        okhttp3.internal.platform.ContextAwarePlatform contextAwarePlatform = obj instanceof okhttp3.internal.platform.ContextAwarePlatform ? (okhttp3.internal.platform.ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            return contextAwarePlatform.getApplicationContext();
        }
        return null;
    }

    public final void setApplicationContext(android.content.Context context) {
        java.lang.Object obj = okhttp3.internal.platform.Platform.INSTANCE.get();
        okhttp3.internal.platform.ContextAwarePlatform contextAwarePlatform = obj instanceof okhttp3.internal.platform.ContextAwarePlatform ? (okhttp3.internal.platform.ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            contextAwarePlatform.setApplicationContext(context);
        }
    }
}
