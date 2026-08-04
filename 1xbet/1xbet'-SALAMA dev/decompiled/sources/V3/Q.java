package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0835o;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends AbstractC0842w {
    private static final Q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0829i keyValue_ = AbstractC0829i.f11779b;
    private V params_;
    private int version_;

    static {
        Q q7 = new Q();
        DEFAULT_INSTANCE = q7;
        AbstractC0842w.v(Q.class, q7);
    }

    public static void A(Q q7, C0828h c0828h) {
        q7.getClass();
        q7.keyValue_ = c0828h;
    }

    public static Q B() {
        return DEFAULT_INSTANCE;
    }

    public static P F() {
        return (P) DEFAULT_INSTANCE.j();
    }

    public static Q G(AbstractC0829i abstractC0829i, C0835o c0835o) {
        return (Q) AbstractC0842w.t(DEFAULT_INSTANCE, abstractC0829i, c0835o);
    }

    public static void y(Q q7) {
        q7.version_ = 0;
    }

    public static void z(Q q7, V v6) {
        q7.getClass();
        v6.getClass();
        q7.params_ = v6;
    }

    public final AbstractC0829i C() {
        return this.keyValue_;
    }

    public final V D() {
        V v6 = this.params_;
        return v6 == null ? V.A() : v6;
    }

    public final int E() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
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
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (Q.class) {
                        try {
                            c0841v = PARSER;
                            if (c0841v == null) {
                                c0841v = new C0841v();
                                PARSER = c0841v;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0841v;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
