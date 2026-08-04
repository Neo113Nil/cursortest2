package Y4;

import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends com.google.protobuf.C {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final D0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private p007a5.a cause_;
    private com.google.protobuf.z0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private com.google.protobuf.I targetIds_ = com.google.protobuf.G.f12107d;
    private AbstractC0867k resumeToken_ = AbstractC0867k.f12212b;

    static {
        D0 d7 = new D0();
        DEFAULT_INSTANCE = d7;
        com.google.protobuf.C.t(D0.class, d7);
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
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new D0();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (D0.class) {
                        try {
                            b7 = PARSER;
                            if (b7 == null) {
                                b7 = new com.google.protobuf.B(DEFAULT_INSTANCE);
                                PARSER = b7;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return b7;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final p007a5.a v() {
        p007a5.a aVar = this.cause_;
        return aVar == null ? p007a5.a.w() : aVar;
    }

    public final com.google.protobuf.z0 x() {
        com.google.protobuf.z0 z0Var = this.readTime_;
        return z0Var == null ? com.google.protobuf.z0.x() : z0Var;
    }

    public final AbstractC0867k y() {
        return this.resumeToken_;
    }

    public final C0 z() {
        C0 c0;
        int i7 = this.targetChangeType_;
        if (i7 == 0) {
            c0 = C0.NO_CHANGE;
        } else if (i7 == 1) {
            c0 = C0.ADD;
        } else if (i7 == 2) {
            c0 = C0.REMOVE;
        } else if (i7 != 3) {
            c0 = i7 != 4 ? null : C0.RESET;
        } else {
            c0 = C0.CURRENT;
        }
        return c0 == null ? C0.UNRECOGNIZED : c0;
    }
}
