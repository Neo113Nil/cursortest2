package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class S extends com.google.protobuf.C {
    private static final S DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER;
    private int bitField0_;
    private C0584l0 field_;

    static {
        S s7 = new S();
        DEFAULT_INSTANCE = s7;
        com.google.protobuf.C.t(S.class, s7);
    }

    public static void v(S s7, C0584l0 c0584l0) {
        s7.getClass();
        s7.field_ = c0584l0;
        s7.bitField0_ |= 1;
    }

    public static Q w() {
        return (Q) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
            case 3:
                return new S();
            case 4:
                return new Q(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (S.class) {
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
