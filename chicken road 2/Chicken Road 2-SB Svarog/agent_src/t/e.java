package t;

import androidx.window.extensions.WindowExtensionsProvider;
import g0.l;

/* loaded from: classes.dex */
public abstract class e {
    static {
        l.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
