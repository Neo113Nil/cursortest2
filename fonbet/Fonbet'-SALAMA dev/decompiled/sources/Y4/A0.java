package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class A0 extends com.google.protobuf.C {
    private static final A0 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        A0 a02 = new A0();
        DEFAULT_INSTANCE = a02;
        com.google.protobuf.C.t(A0.class, a02);
    }

    public static z0 A() {
        return (z0) DEFAULT_INSTANCE.i();
    }

    public static void v(A0 a02, v0 v0Var) {
        a02.getClass();
        a02.queryType_ = v0Var;
        a02.queryTypeCase_ = 2;
    }

    public static void w(A0 a02, String str) {
        a02.getClass();
        str.getClass();
        a02.parent_ = str;
    }

    public static A0 x() {
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
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", v0.class});
            case 3:
                return new A0();
            case 4:
                return new z0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (A0.class) {
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

    public final String y() {
        return this.parent_;
    }

    public final v0 z() {
        return this.queryTypeCase_ == 2 ? (v0) this.queryType_ : v0.B();
    }
}
