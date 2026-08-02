package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0597u extends com.google.protobuf.C {
    private static final C0597u DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    private int bitField0_;
    private com.google.protobuf.z0 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private com.google.protobuf.I removedTargetIds_ = com.google.protobuf.G.f12107d;

    static {
        C0597u c0597u = new C0597u();
        DEFAULT_INSTANCE = c0597u;
        com.google.protobuf.C.t(C0597u.class, c0597u);
    }

    public static C0597u v() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001Ȉ\u0004ဉ\u0000\u0006'", new Object[]{"bitField0_", "document_", "readTime_", "removedTargetIds_"});
            case 3:
                return new C0597u();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0597u.class) {
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

    public final String w() {
        return this.document_;
    }

    public final com.google.protobuf.z0 x() {
        com.google.protobuf.z0 z0Var = this.readTime_;
        return z0Var == null ? com.google.protobuf.z0.x() : z0Var;
    }

    public final com.google.protobuf.I y() {
        return this.removedTargetIds_;
    }
}
