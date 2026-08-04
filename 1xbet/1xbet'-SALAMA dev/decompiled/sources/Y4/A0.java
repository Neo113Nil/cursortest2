package Y4;

import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 extends com.google.protobuf.C {
    private static final A0 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        A0 a2 = new A0();
        DEFAULT_INSTANCE = a2;
        com.google.protobuf.C.t(A0.class, a2);
    }

    public static z0 A() {
        return (z0) DEFAULT_INSTANCE.i();
    }

    public static void v(A0 a2, v0 v0Var) {
        a2.getClass();
        a2.queryType_ = v0Var;
        a2.queryTypeCase_ = 2;
    }

    public static void w(A0 a2, String str) {
        a2.getClass();
        str.getClass();
        a2.parent_ = str;
    }

    public static A0 x() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", v0.class});
            case 3:
                return new A0();
            case 4:
                return new z0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (A0.class) {
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

    public final String y() {
        return this.parent_;
    }

    public final v0 z() {
        return this.queryTypeCase_ == 2 ? (v0) this.queryType_ : v0.B();
    }
}
