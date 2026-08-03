package W;

/* loaded from: classes.dex */
public abstract class e {
    static {
        kotlin.jvm.internal.q.a(W.e.class).b();
    }

    public static int a() {
        try {
            return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
            return 0;
        }
    }
}
