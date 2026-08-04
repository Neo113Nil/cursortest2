package p022d0;

import androidx.datastore.preferences.protobuf.AbstractC0657b;
import androidx.datastore.preferences.protobuf.AbstractC0673s;
import androidx.datastore.preferences.protobuf.AbstractC0675u;
import androidx.datastore.preferences.protobuf.AbstractC0677w;
import androidx.datastore.preferences.protobuf.C0674t;
import androidx.datastore.preferences.protobuf.InterfaceC0676v;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0675u {
    private static final g DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0676v strings_ = S.f9139d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0675u.l(g.class, gVar);
    }

    public static void n(g gVar, Set set) {
        InterfaceC0676v interfaceC0676v = gVar.strings_;
        if (!((AbstractC0657b) interfaceC0676v).f9165a) {
            S s7 = (S) interfaceC0676v;
            int i7 = s7.f9141c;
            gVar.strings_ = s7.t(i7 == 0 ? 10 : i7 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = AbstractC0677w.f9255a;
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

    public static g o() {
        return DEFAULT_INSTANCE;
    }

    public static f q() {
        return (f) ((AbstractC0673s) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0675u
    public final Object e(int i7) {
        switch (e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P c0674t = PARSER;
                if (c0674t == null) {
                    synchronized (g.class) {
                        try {
                            c0674t = PARSER;
                            if (c0674t == null) {
                                c0674t = new C0674t();
                                PARSER = c0674t;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0674t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0676v p() {
        return this.strings_;
    }
}
