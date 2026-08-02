package Y4;

import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0577i extends com.google.protobuf.C {
    private static final C0577i DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.protobuf.z0 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private AbstractC0911k transaction_ = AbstractC0911k.f12212b;

    static {
        C0577i c0577i = new C0577i();
        DEFAULT_INSTANCE = c0577i;
        com.google.protobuf.C.t(C0577i.class, c0577i);
    }

    public static C0577i v() {
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
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", C0595s.class, "transaction_", "readTime_"});
            case 3:
                return new C0577i();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0577i.class) {
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

    public final C0595s w() {
        return this.resultCase_ == 1 ? (C0595s) this.result_ : C0595s.y();
    }

    public final String x() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    public final com.google.protobuf.z0 y() {
        com.google.protobuf.z0 z0Var = this.readTime_;
        return z0Var == null ? com.google.protobuf.z0.x() : z0Var;
    }

    public final int z() {
        int i7 = this.resultCase_;
        if (i7 == 0) {
            return 3;
        }
        if (i7 != 1) {
            return i7 != 2 ? 0 : 2;
        }
        return 1;
    }
}
