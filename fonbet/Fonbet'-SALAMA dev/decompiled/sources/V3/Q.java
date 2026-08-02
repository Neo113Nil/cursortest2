package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class Q extends AbstractC0886w {
    private static final Q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0873i keyValue_ = AbstractC0873i.f11779b;
    private V params_;
    private int version_;

    static {
        Q q7 = new Q();
        DEFAULT_INSTANCE = q7;
        AbstractC0886w.v(Q.class, q7);
    }

    public static void A(Q q7, C0872h c0872h) {
        q7.getClass();
        q7.keyValue_ = c0872h;
    }

    public static Q B() {
        return DEFAULT_INSTANCE;
    }

    public static P F() {
        return (P) DEFAULT_INSTANCE.j();
    }

    public static Q G(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (Q) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static void y(Q q7) {
        q7.version_ = 0;
    }

    public static void z(Q q7, V v6) {
        q7.getClass();
        v6.getClass();
        q7.params_ = v6;
    }

    public final AbstractC0873i C() {
        return this.keyValue_;
    }

    public final V D() {
        V v6 = this.params_;
        return v6 == null ? V.A() : v6;
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
                return new Q();
            case 4:
                return new P(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (Q.class) {
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
