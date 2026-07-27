package j0;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.t;

/* loaded from: classes.dex */
public abstract class e {
    static {
        t.a(e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
