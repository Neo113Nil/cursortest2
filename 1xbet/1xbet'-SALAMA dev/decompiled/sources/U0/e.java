package U0;

import androidx.window.extensions.WindowExtensionsProvider;
import t6.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        q.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
