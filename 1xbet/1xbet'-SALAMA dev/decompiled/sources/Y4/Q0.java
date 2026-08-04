package Y4;

import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 extends com.google.protobuf.C {
    private static final Q0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.protobuf.J transformResults_ = C0874n0.f12243d;
    private com.google.protobuf.z0 updateTime_;

    static {
        Q0 q1 = new Q0();
        DEFAULT_INSTANCE = q1;
        com.google.protobuf.C.t(Q0.class, q1);
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", I0.class});
            case 3:
                return new Q0();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (Q0.class) {
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
