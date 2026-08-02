package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class M extends com.google.protobuf.C {
    private static final M DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        M m7 = new M();
        DEFAULT_INSTANCE = m7;
        com.google.protobuf.C.t(M.class, m7);
    }

    public static L B() {
        return (L) DEFAULT_INSTANCE.i();
    }

    public static void v(M m7, boolean z4) {
        m7.conditionTypeCase_ = 1;
        m7.conditionType_ = Boolean.valueOf(z4);
    }

    public static void w(M m7, com.google.protobuf.z0 z0Var) {
        m7.getClass();
        m7.conditionType_ = z0Var;
        m7.conditionTypeCase_ = 2;
    }

    public static M y() {
        return DEFAULT_INSTANCE;
    }

    public final com.google.protobuf.z0 A() {
        return this.conditionTypeCase_ == 2 ? (com.google.protobuf.z0) this.conditionType_ : com.google.protobuf.z0.x();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", com.google.protobuf.z0.class});
            case 3:
                return new M();
            case 4:
                return new L(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (M.class) {
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

    public final int x() {
        int i7 = this.conditionTypeCase_;
        if (i7 == 0) {
            return 3;
        }
        if (i7 != 1) {
            return i7 != 2 ? 0 : 2;
        }
        return 1;
    }

    public final boolean z() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }
}
