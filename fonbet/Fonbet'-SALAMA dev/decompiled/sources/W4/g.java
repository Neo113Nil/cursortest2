package W4;

import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import com.google.protobuf.J;

/* loaded from: classes2.dex */
public final class g extends C {
    private static final g DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private J fields_ = C0918n0.f12243d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        C.t(g.class, gVar);
    }

    public static void v(g gVar) {
        f fVar = f.COLLECTION_GROUP;
        gVar.getClass();
        gVar.queryScope_ = fVar.a();
    }

    public static void w(g gVar, e eVar) {
        gVar.getClass();
        J j = gVar.fields_;
        if (!((AbstractC0893b) j).f12176a) {
            gVar.fields_ = C.p(j);
        }
        gVar.fields_.add(eVar);
    }

    public static a y() {
        return (a) DEFAULT_INSTANCE.i();
    }

    public static g z(byte[] bArr) {
        return (g) C.r(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", e.class, "state_"});
            case 3:
                return new g();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (g.class) {
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

    public final J x() {
        return this.fields_;
    }
}
