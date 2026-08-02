package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0879o;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class n0 extends AbstractC0886w {
    private static final n0 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER;
    private String keyUri_ = "";

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        AbstractC0886w.v(n0.class, n0Var);
    }

    public static n0 A(AbstractC0873i abstractC0873i, C0879o c0879o) {
        return (n0) AbstractC0886w.t(DEFAULT_INSTANCE, abstractC0873i, c0879o);
    }

    public static n0 y() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new n0();
            case 4:
                return new K(DEFAULT_INSTANCE, 2);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (n0.class) {
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

    public final String z() {
        return this.keyUri_;
    }
}
