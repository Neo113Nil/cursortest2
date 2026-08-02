package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* renamed from: V3.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0470l extends AbstractC0886w {
    private static final C0470l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0873i keyValue_ = AbstractC0873i.f11779b;
    private C0474p params_;
    private int version_;

    static {
        C0470l c0470l = new C0470l();
        DEFAULT_INSTANCE = c0470l;
        AbstractC0886w.v(C0470l.class, c0470l);
    }

    public static void A(C0470l c0470l, C0872h c0872h) {
        c0470l.getClass();
        c0470l.keyValue_ = c0872h;
    }

    public static C0470l B() {
        return DEFAULT_INSTANCE;
    }

    public static C0469k F() {
        return (C0469k) DEFAULT_INSTANCE.j();
    }

    public static void y(C0470l c0470l) {
        c0470l.version_ = 0;
    }

    public static void z(C0470l c0470l, C0474p c0474p) {
        c0470l.getClass();
        c0474p.getClass();
        c0470l.params_ = c0474p;
    }

    public final AbstractC0873i C() {
        return this.keyValue_;
    }

    public final C0474p D() {
        C0474p c0474p = this.params_;
        return c0474p == null ? C0474p.z() : c0474p;
    }

    public final int E() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new C0470l();
            case 4:
                return new C0469k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (C0470l.class) {
                        try {
                            x4 = PARSER;
                            if (x4 == null) {
                                x4 = new C0885v();
                                PARSER = x4;
                            }
                        } finally {
                        }
                    }
                }
                return x4;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
