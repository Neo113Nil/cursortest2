package X4;

import Y4.v0;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import t.e;

/* loaded from: classes2.dex */
public final class c extends C {
    private static final c DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        C.t(c.class, cVar);
    }

    public static a B() {
        return (a) DEFAULT_INSTANCE.i();
    }

    public static c C(byte[] bArr) {
        return (c) C.r(DEFAULT_INSTANCE, bArr);
    }

    public static void v(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.parent_ = str;
    }

    public static void w(c cVar, v0 v0Var) {
        cVar.getClass();
        v0Var.getClass();
        cVar.queryType_ = v0Var;
        cVar.queryTypeCase_ = 2;
    }

    public static void x(c cVar, b bVar) {
        cVar.getClass();
        cVar.limitType_ = bVar.a();
    }

    public final v0 A() {
        return this.queryTypeCase_ == 2 ? (v0) this.queryType_ : v0.B();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", v0.class, "limitType_"});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (c.class) {
                        try {
                            interfaceC0912k0 = PARSER;
                            if (interfaceC0912k0 == null) {
                                interfaceC0912k0 = new B(DEFAULT_INSTANCE);
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

    public final b y() {
        int i7 = this.limitType_;
        b bVar = i7 != 0 ? i7 != 1 ? null : b.LAST : b.FIRST;
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    public final String z() {
        return this.parent_;
    }
}
