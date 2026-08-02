package G10;

import com.google.mlkit.common.sdkinternal.h;
import d9.q;
import n8.InterfaceC8452b;
import n8.e;

/* loaded from: classes7.dex */
public final class a implements e {
    public static void b(String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void e(Object obj) {
        obj.getClass();
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void h(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return new q((h) interfaceC8452b.a(h.class));
    }
}
