package Y4;

import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class B0 extends com.google.protobuf.C {
    private static final B0 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC0912k0 PARSER = null;
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
        B0 b02 = new B0();
        DEFAULT_INSTANCE = b02;
        com.google.protobuf.C.t(B0.class, b02);
    }

    public static void A(B0 b02, com.google.protobuf.E e7) {
        b02.getClass();
        b02.expectedCount_ = e7;
        b02.bitField0_ |= 1;
    }

    public static w0 B() {
        return (w0) DEFAULT_INSTANCE.i();
    }

    public static void v(B0 b02, A0 a02) {
        b02.getClass();
        b02.targetType_ = a02;
        b02.targetTypeCase_ = 2;
    }

    public static void w(B0 b02, y0 y0Var) {
        b02.getClass();
        b02.targetType_ = y0Var;
        b02.targetTypeCase_ = 3;
    }

    public static void x(B0 b02, AbstractC0911k abstractC0911k) {
        b02.getClass();
        abstractC0911k.getClass();
        b02.resumeTypeCase_ = 4;
        b02.resumeType_ = abstractC0911k;
    }

    public static void y(B0 b02, com.google.protobuf.z0 z0Var) {
        b02.getClass();
        b02.resumeType_ = z0Var;
        b02.resumeTypeCase_ = 11;
    }

    public static void z(B0 b02, int i7) {
        b02.targetId_ = i7;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", A0.class, y0.class, "targetId_", "once_", com.google.protobuf.z0.class, "expectedCount_"});
            case 3:
                return new B0();
            case 4:
                return new w0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (B0.class) {
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
}
