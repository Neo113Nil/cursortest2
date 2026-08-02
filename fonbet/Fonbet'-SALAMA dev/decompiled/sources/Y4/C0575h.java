package Y4;

import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0575h extends com.google.protobuf.C {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C0575h DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private C0599w mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private com.google.protobuf.J documents_ = C0918n0.f12243d;

    static {
        C0575h c0575h = new C0575h();
        DEFAULT_INSTANCE = c0575h;
        com.google.protobuf.C.t(C0575h.class, c0575h);
    }

    public static void v(C0575h c0575h, String str) {
        c0575h.getClass();
        str.getClass();
        c0575h.database_ = str;
    }

    public static void w(C0575h c0575h, String str) {
        c0575h.getClass();
        str.getClass();
        com.google.protobuf.J j = c0575h.documents_;
        if (!((AbstractC0893b) j).f12176a) {
            c0575h.documents_ = com.google.protobuf.C.p(j);
        }
        c0575h.documents_.add(str);
    }

    public static C0575h x() {
        return DEFAULT_INSTANCE;
    }

    public static C0573g y() {
        return (C0573g) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", G0.class, com.google.protobuf.z0.class});
            case 3:
                return new C0575h();
            case 4:
                return new C0573g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0575h.class) {
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
