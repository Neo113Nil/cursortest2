package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086D¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/OkHttp;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "", "initialize", "(Landroid/content/Context;)V", "", "VERSION", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OkHttp {
    public static final okhttp3.OkHttp INSTANCE = new okhttp3.OkHttp();
    public static final java.lang.String VERSION = okhttp3.internal._InternalVersionKt.CONST_VERSION;

    private OkHttp() {
    }

    public final void initialize(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        if (okhttp3.internal.platform.PlatformRegistry.INSTANCE.getApplicationContext() == null) {
            okhttp3.internal.platform.PlatformRegistry.INSTANCE.setApplicationContext(applicationContext.getApplicationContext());
        }
    }
}
