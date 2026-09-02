package x;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class e {
    static {
        n.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
