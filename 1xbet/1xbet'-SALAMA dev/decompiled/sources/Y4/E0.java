package Y4;

import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends com.google.protobuf.C {
    private static final E0 DEFAULT_INSTANCE;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;

    static {
        E0 e7 = new E0();
        DEFAULT_INSTANCE = e7;
        com.google.protobuf.C.t(E0.class, e7);
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", com.google.protobuf.z0.class});
            case 3:
                return new E0();
            case 4:
                return new C0563b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (E0.class) {
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
