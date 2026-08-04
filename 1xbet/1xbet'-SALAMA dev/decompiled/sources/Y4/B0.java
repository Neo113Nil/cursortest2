package Y4;

import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends com.google.protobuf.C {
    private static final B0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.google.protobuf.E expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static {
        B0 b7 = new B0();
        DEFAULT_INSTANCE = b7;
        com.google.protobuf.C.t(B0.class, b7);
    }

    public static void A(B0 b7, com.google.protobuf.E e7) {
        b7.getClass();
        b7.expectedCount_ = e7;
        b7.bitField0_ |= 1;
    }

    public static w0 B() {
        return (w0) DEFAULT_INSTANCE.i();
    }

    public static void v(B0 b7, A0 a2) {
        b7.getClass();
        b7.targetType_ = a2;
        b7.targetTypeCase_ = 2;
    }

    public static void w(B0 b7, y0 y0Var) {
        b7.getClass();
        b7.targetType_ = y0Var;
        b7.targetTypeCase_ = 3;
    }

    public static void x(B0 b7, AbstractC0867k abstractC0867k) {
        b7.getClass();
        abstractC0867k.getClass();
        b7.resumeTypeCase_ = 4;
        b7.resumeType_ = abstractC0867k;
    }

    public static void y(B0 b7, com.google.protobuf.z0 z0Var) {
        b7.getClass();
        b7.resumeType_ = z0Var;
        b7.resumeTypeCase_ = 11;
    }

    public static void z(B0 b7, int i7) {
        b7.targetId_ = i7;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", A0.class, y0.class, "targetId_", "once_", com.google.protobuf.z0.class, "expectedCount_"});
            case 3:
                return new B0();
            case 4:
                return new w0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (B0.class) {
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
}
