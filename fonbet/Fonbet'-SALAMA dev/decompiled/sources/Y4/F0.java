package Y4;

import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class F0 extends com.google.protobuf.C {
    private static final F0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
    private AbstractC0911k retryTransaction_ = AbstractC0911k.f12212b;

    static {
        F0 f02 = new F0();
        DEFAULT_INSTANCE = f02;
        com.google.protobuf.C.t(F0.class, f02);
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
            case 3:
                return new F0();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (F0.class) {
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
