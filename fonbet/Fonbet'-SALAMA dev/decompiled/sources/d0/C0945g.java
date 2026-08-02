package d0;

import androidx.datastore.preferences.protobuf.AbstractC0678b;
import androidx.datastore.preferences.protobuf.AbstractC0694s;
import androidx.datastore.preferences.protobuf.AbstractC0696u;
import androidx.datastore.preferences.protobuf.AbstractC0698w;
import androidx.datastore.preferences.protobuf.C0695t;
import androidx.datastore.preferences.protobuf.InterfaceC0697v;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945g extends AbstractC0696u {
    private static final C0945g DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0697v strings_ = S.f9139d;

    static {
        C0945g c0945g = new C0945g();
        DEFAULT_INSTANCE = c0945g;
        AbstractC0696u.l(C0945g.class, c0945g);
    }

    public static void n(C0945g c0945g, Set set) {
        InterfaceC0697v interfaceC0697v = c0945g.strings_;
        if (!((AbstractC0678b) interfaceC0697v).f9165a) {
            S s7 = (S) interfaceC0697v;
            int i7 = s7.f9141c;
            c0945g.strings_ = s7.t(i7 == 0 ? 10 : i7 * 2);
        }
        RandomAccess randomAccess = c0945g.strings_;
        Charset charset = AbstractC0698w.f9255a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((S) randomAccess).f9141c);
        }
        S s8 = (S) randomAccess;
        int i8 = s8.f9141c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (s8.f9141c - i8) + " is null.";
                for (int i9 = s8.f9141c - 1; i9 >= i8; i9--) {
                    s8.remove(i9);
                }
                throw new NullPointerException(str);
            }
            s8.add(obj);
        }
    }

    public static C0945g o() {
        return DEFAULT_INSTANCE;
    }

    public static C0944f q() {
        return (C0944f) ((AbstractC0694s) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0696u
    public final Object e(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C0945g();
            case 4:
                return new C0944f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p5 = PARSER;
                if (p5 == null) {
                    synchronized (C0945g.class) {
                        try {
                            p5 = PARSER;
                            if (p5 == null) {
                                p5 = new C0695t();
                                PARSER = p5;
                            }
                        } finally {
                        }
                    }
                }
                return p5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0697v p() {
        return this.strings_;
    }
}
