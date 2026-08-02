package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0566c0 extends com.google.protobuf.C {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final C0566c0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER;
    private boolean allDescendants_;
    private String collectionId_ = "";

    static {
        C0566c0 c0566c0 = new C0566c0();
        DEFAULT_INSTANCE = c0566c0;
        com.google.protobuf.C.t(C0566c0.class, c0566c0);
    }

    public static void v(C0566c0 c0566c0, String str) {
        c0566c0.getClass();
        str.getClass();
        c0566c0.collectionId_ = str;
    }

    public static void w(C0566c0 c0566c0) {
        c0566c0.allDescendants_ = true;
    }

    public static C0564b0 z() {
        return (C0564b0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
            case 3:
                return new C0566c0();
            case 4:
                return new C0564b0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0566c0.class) {
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

    public final boolean x() {
        return this.allDescendants_;
    }

    public final String y() {
        return this.collectionId_;
    }
}
