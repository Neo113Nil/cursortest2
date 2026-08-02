package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0584l0 extends com.google.protobuf.C {
    private static final C0584l0 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile InterfaceC0912k0 PARSER;
    private String fieldPath_ = "";

    static {
        C0584l0 c0584l0 = new C0584l0();
        DEFAULT_INSTANCE = c0584l0;
        com.google.protobuf.C.t(C0584l0.class, c0584l0);
    }

    public static void v(C0584l0 c0584l0, String str) {
        c0584l0.getClass();
        str.getClass();
        c0584l0.fieldPath_ = str;
    }

    public static C0584l0 w() {
        return DEFAULT_INSTANCE;
    }

    public static C0582k0 y() {
        return (C0582k0) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
            case 3:
                return new C0584l0();
            case 4:
                return new C0582k0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0584l0.class) {
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

    public final String x() {
        return this.fieldPath_;
    }
}
