package V3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0842w;
import com.google.crypto.tink.shaded.protobuf.C0841v;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends AbstractC0842w {
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
        AbstractC0842w.v(f0.class, f0Var);
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
        r0 r0VarA = r0.a(this.outputPrefixType_);
        return r0VarA == null ? r0.UNRECOGNIZED : r0VarA;
    }

    public final Z F() {
        Z z4;
        int i7 = this.status_;
        if (i7 == 0) {
            z4 = Z.UNKNOWN_STATUS;
        } else if (i7 == 1) {
            z4 = Z.ENABLED;
        } else if (i7 != 2) {
            z4 = i7 != 3 ? null : Z.DESTROYED;
        } else {
            z4 = Z.DISABLED;
        }
        return z4 == null ? Z.UNRECOGNIZED : z4;
    }

    public final boolean G() {
        return this.keyData_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0842w
    public final Object k(int i7) {
        switch (p136t.e.e(i7)) {
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
                com.google.crypto.tink.shaded.protobuf.X c0841v = PARSER;
                if (c0841v == null) {
                    synchronized (f0.class) {
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
