package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class r extends AbstractC0886w {
    private static final r DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0873i keyValue_ = AbstractC0873i.f11779b;
    private C0479v params_;
    private int version_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        AbstractC0886w.v(r.class, rVar);
    }

    public static void A(r rVar, C0872h c0872h) {
        rVar.getClass();
        rVar.keyValue_ = c0872h;
    }

    public static C0475q E() {
        return (C0475q) DEFAULT_INSTANCE.j();
    }

    public static r F(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (r) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(r rVar) {
        rVar.version_ = 0;
    }

    public static void z(r rVar, C0479v c0479v) {
        rVar.getClass();
        c0479v.getClass();
        rVar.params_ = c0479v;
    }

    public final AbstractC0873i B() {
        return this.keyValue_;
    }

    public final C0479v C() {
        C0479v c0479v = this.params_;
        return c0479v == null ? C0479v.z() : c0479v;
    }

    public final int D() {
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
                return new r();
            case 4:
                return new C0475q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (r.class) {
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
