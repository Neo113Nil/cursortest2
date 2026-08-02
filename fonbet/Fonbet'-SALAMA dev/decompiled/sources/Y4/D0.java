package Y4;

import a5.C0622a;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class D0 extends com.google.protobuf.C {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final D0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C0622a cause_;
    private com.google.protobuf.z0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private com.google.protobuf.I targetIds_ = com.google.protobuf.G.f12107d;
    private AbstractC0911k resumeToken_ = AbstractC0911k.f12212b;

    static {
        D0 d02 = new D0();
        DEFAULT_INSTANCE = d02;
        com.google.protobuf.C.t(D0.class, d02);
    }

    public static D0 w() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return ((com.google.protobuf.G) this.targetIds_).size();
    }

    public final com.google.protobuf.I B() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new D0();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (D0.class) {
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

    public final C0622a v() {
        C0622a c0622a = this.cause_;
        return c0622a == null ? C0622a.w() : c0622a;
    }

    public final com.google.protobuf.z0 x() {
        com.google.protobuf.z0 z0Var = this.readTime_;
        return z0Var == null ? com.google.protobuf.z0.x() : z0Var;
    }

    public final AbstractC0911k y() {
        return this.resumeToken_;
    }

    public final C0 z() {
        int i7 = this.targetChangeType_;
        C0 c0 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? null : C0.RESET : C0.CURRENT : C0.REMOVE : C0.ADD : C0.NO_CHANGE;
        return c0 == null ? C0.UNRECOGNIZED : c0;
    }
}
