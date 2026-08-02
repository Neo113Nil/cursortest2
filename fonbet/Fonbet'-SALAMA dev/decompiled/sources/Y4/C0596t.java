package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0596t extends com.google.protobuf.C {
    private static final C0596t DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private C0595s document_;
    private com.google.protobuf.I removedTargetIds_;
    private com.google.protobuf.I targetIds_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;

    static {
        C0596t c0596t = new C0596t();
        DEFAULT_INSTANCE = c0596t;
        com.google.protobuf.C.t(C0596t.class, c0596t);
    }

    public C0596t() {
        com.google.protobuf.G g3 = com.google.protobuf.G.f12107d;
        this.targetIds_ = g3;
        this.removedTargetIds_ = g3;
    }

    public static C0596t v() {
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
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 3:
                return new C0596t();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0596t.class) {
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

    public final C0595s w() {
        C0595s c0595s = this.document_;
        return c0595s == null ? C0595s.y() : c0595s;
    }

    public final com.google.protobuf.I x() {
        return this.removedTargetIds_;
    }

    public final com.google.protobuf.I y() {
        return this.targetIds_;
    }
}
