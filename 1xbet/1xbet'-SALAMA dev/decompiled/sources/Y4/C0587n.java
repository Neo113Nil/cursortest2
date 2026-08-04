package Y4;

import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: renamed from: Y4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0587n extends com.google.protobuf.C {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final C0587n DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.protobuf.z0 commitTime_;
    private com.google.protobuf.J writeResults_ = C0874n0.f12243d;

    static {
        C0587n c0587n = new C0587n();
        DEFAULT_INSTANCE = c0587n;
        com.google.protobuf.C.t(C0587n.class, c0587n);
    }

    public static C0587n w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", Q0.class, "commitTime_"});
            case 3:
                return new C0587n();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0587n.class) {
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

    public final com.google.protobuf.z0 v() {
        com.google.protobuf.z0 z0Var = this.commitTime_;
        return z0Var == null ? com.google.protobuf.z0.x() : z0Var;
    }

    public final Q0 x(int i7) {
        return (Q0) this.writeResults_.get(i7);
    }

    public final int y() {
        return this.writeResults_.size();
    }
}
