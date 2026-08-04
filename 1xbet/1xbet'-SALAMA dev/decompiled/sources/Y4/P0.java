package Y4;

import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 extends com.google.protobuf.C {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final P0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.protobuf.z0 commitTime_;
    private String streamId_ = "";
    private AbstractC0867k streamToken_ = AbstractC0867k.f12212b;
    private com.google.protobuf.J writeResults_ = C0874n0.f12243d;

    static {
        P0 p5 = new P0();
        DEFAULT_INSTANCE = p5;
        com.google.protobuf.C.t(P0.class, p5);
    }

    public static P0 w() {
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
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", Q0.class, "commitTime_"});
            case 3:
                return new P0();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (P0.class) {
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

    public final AbstractC0867k x() {
        return this.streamToken_;
    }

    public final Q0 y(int i7) {
        return (Q0) this.writeResults_.get(i7);
    }

    public final int z() {
        return this.writeResults_.size();
    }
}
