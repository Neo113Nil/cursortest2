package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class X extends com.google.protobuf.C {
    public static final int ALIAS_FIELD_NUMBER = 7;
    public static final int AVG_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final X DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private Object operator_;
    private int operatorCase_ = 0;
    private String alias_ = "";

    static {
        X x4 = new X();
        DEFAULT_INSTANCE = x4;
        com.google.protobuf.C.t(X.class, x4);
    }

    public static void v(X x4, U u4) {
        x4.getClass();
        u4.getClass();
        x4.operator_ = u4;
        x4.operatorCase_ = 1;
    }

    public static void w(X x4, W w7) {
        x4.getClass();
        x4.operator_ = w7;
        x4.operatorCase_ = 2;
    }

    public static void x(X x4, S s7) {
        x4.getClass();
        x4.operator_ = s7;
        x4.operatorCase_ = 3;
    }

    public static void y(X x4, String str) {
        x4.getClass();
        str.getClass();
        x4.alias_ = str;
    }

    public static T z() {
        return (T) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", U.class, W.class, S.class, "alias_"});
            case 3:
                return new X();
            case 4:
                return new T(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (X.class) {
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
