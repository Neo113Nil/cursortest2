package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class m0 extends AbstractC0886w {
    private static final m0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private n0 params_;
    private int version_;

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        AbstractC0886w.v(m0.class, m0Var);
    }

    public static l0 C() {
        return (l0) DEFAULT_INSTANCE.j();
    }

    public static m0 D(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (m0) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(m0 m0Var) {
        m0Var.version_ = 0;
    }

    public static void z(m0 m0Var, n0 n0Var) {
        m0Var.getClass();
        n0Var.getClass();
        m0Var.params_ = n0Var;
    }

    public final n0 A() {
        n0 n0Var = this.params_;
        return n0Var == null ? n0.y() : n0Var;
    }

    public final int B() {
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
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new m0();
            case 4:
                return new l0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (m0.class) {
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
