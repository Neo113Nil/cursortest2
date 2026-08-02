package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0600x extends com.google.protobuf.C {
    private static final C0600x DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.protobuf.z0 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private com.google.protobuf.I removedTargetIds_ = com.google.protobuf.G.f12107d;

    static {
        C0600x c0600x = new C0600x();
        DEFAULT_INSTANCE = c0600x;
        com.google.protobuf.C.t(C0600x.class, c0600x);
    }

    public static C0600x v() {
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
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0004ဉ\u0000", new Object[]{"bitField0_", "document_", "removedTargetIds_", "readTime_"});
            case 3:
                return new C0600x();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0600x.class) {
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

    public final com.google.protobuf.I x() {
        return this.removedTargetIds_;
    }
}
