package d0;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.r;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0265e {
    static {
        r.a(AbstractC0265e.class).b();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
