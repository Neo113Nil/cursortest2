package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0886w;
import com.google.crypto.tink.shaded.protobuf.C0885v;

/* loaded from: classes2.dex */
public final class f0 extends AbstractC0886w {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.X PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private Y keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        AbstractC0886w.v(f0.class, f0Var);
    }

    public static void A(f0 f0Var) {
        Z z4 = Z.ENABLED;
        f0Var.getClass();
        f0Var.status_ = z4.a();
    }

    public static void B(f0 f0Var, int i7) {
        f0Var.keyId_ = i7;
    }

    public static e0 H() {
        return (e0) DEFAULT_INSTANCE.j();
    }

    public static void y(f0 f0Var, Y y4) {
        f0Var.getClass();
        f0Var.keyData_ = y4;
    }

    public static void z(f0 f0Var, r0 r0Var) {
        f0Var.getClass();
        f0Var.outputPrefixType_ = r0Var.b();
    }

    public final Y C() {
        Y y4 = this.keyData_;
        return y4 == null ? Y.B() : y4;
    }

    public final int D() {
        return this.keyId_;
    }

    public final r0 E() {
        r0 a2 = r0.a(this.outputPrefixType_);
        return a2 == null ? r0.UNRECOGNIZED : a2;
    }

    public final Z F() {
        int i7 = this.status_;
        Z z4 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : Z.DESTROYED : Z.DISABLED : Z.ENABLED : Z.UNKNOWN_STATUS;
        return z4 == null ? Z.UNRECOGNIZED : z4;
    }

    public final boolean G() {
        return this.keyData_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0886w
    public final Object k(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.b0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new f0();
            case 4:
                return new e0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.X x4 = PARSER;
                if (x4 == null) {
                    synchronized (f0.class) {
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
