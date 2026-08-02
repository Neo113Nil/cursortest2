package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class u0 extends com.google.protobuf.C {
    private static final u0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        com.google.protobuf.C.t(u0.class, u0Var);
    }

    public static s0 A() {
        return (s0) DEFAULT_INSTANCE.i();
    }

    public static void v(u0 u0Var, t0 t0Var) {
        u0Var.getClass();
        u0Var.op_ = t0Var.a();
    }

    public static void w(u0 u0Var, C0584l0 c0584l0) {
        u0Var.getClass();
        u0Var.operandType_ = c0584l0;
        u0Var.operandTypeCase_ = 2;
    }

    public static u0 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", C0584l0.class});
            case 3:
                return new u0();
            case 4:
                return new s0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (u0.class) {
                        try {
                            interfaceC0912k0 = PARSER;
                            if (interfaceC0912k0 == null) {
                                interfaceC0912k0 = new com.google.protobuf.B(DEFAULT_INSTANCE);
                                PARSER = interfaceC0912k0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0912k0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C0584l0 y() {
        return this.operandTypeCase_ == 2 ? (C0584l0) this.operandType_ : C0584l0.w();
    }

    public final t0 z() {
        int i7 = this.op_;
        t0 t0Var = i7 != 0 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? null : t0.IS_NOT_NULL : t0.IS_NOT_NAN : t0.IS_NULL : t0.IS_NAN : t0.OPERATOR_UNSPECIFIED;
        return t0Var == null ? t0.UNRECOGNIZED : t0Var;
    }
}
