package M;

import androidx.datastore.preferences.protobuf.AbstractC0127b;
import androidx.datastore.preferences.protobuf.AbstractC0145u;
import androidx.datastore.preferences.protobuf.AbstractC0147w;
import androidx.datastore.preferences.protobuf.AbstractC0149y;
import androidx.datastore.preferences.protobuf.C0146v;
import androidx.datastore.preferences.protobuf.InterfaceC0148x;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0147w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0148x strings_ = U.f2193d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0147w.j(h.class, hVar);
    }

    public static void l(h hVar, Set set) {
        InterfaceC0148x interfaceC0148x = hVar.strings_;
        if (!((AbstractC0127b) interfaceC0148x).f2215a) {
            U u3 = (U) interfaceC0148x;
            int i3 = u3.f2195c;
            hVar.strings_ = u3.d(i3 == 0 ? 10 : i3 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0149y.f2300a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((U) randomAccess).f2195c);
        }
        U u4 = (U) randomAccess;
        int i4 = u4.f2195c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (u4.f2195c - i4) + " is null.";
                for (int i5 = u4.f2195c - 1; i5 >= i4; i5--) {
                    u4.remove(i5);
                }
                throw new NullPointerException(str);
            }
            u4.add(obj);
        }
    }

    public static h m() {
        return DEFAULT_INSTANCE;
    }

    public static g o() {
        return (g) ((AbstractC0145u) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0147w
    public final Object c(int i3) {
        S s3;
        switch (j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (h.class) {
                    try {
                        s3 = PARSER;
                        if (s3 == null) {
                            s3 = new C0146v();
                            PARSER = s3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0148x n() {
        return this.strings_;
    }
}
