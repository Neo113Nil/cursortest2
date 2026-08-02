package Y4;

import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class Q0 extends com.google.protobuf.C {
    private static final Q0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.protobuf.J transformResults_ = C0918n0.f12243d;
    private com.google.protobuf.z0 updateTime_;

    static {
        Q0 q02 = new Q0();
        DEFAULT_INSTANCE = q02;
        com.google.protobuf.C.t(Q0.class, q02);
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", I0.class});
            case 3:
                return new Q0();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (Q0.class) {
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

    public final I0 v(int i7) {
        return (I0) this.transformResults_.get(i7);
    }

    public final int w() {
        return this.transformResults_.size();
    }

    public final com.google.protobuf.z0 x() {
        com.google.protobuf.z0 z0Var = this.updateTime_;
        return z0Var == null ? com.google.protobuf.z0.x() : z0Var;
    }
}
