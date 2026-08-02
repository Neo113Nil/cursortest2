package Y4;

import com.google.protobuf.AbstractC0891a;
import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Z extends com.google.protobuf.C {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final Z DEFAULT_INSTANCE;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private com.google.protobuf.J aggregations_ = C0918n0.f12243d;

    static {
        Z z4 = new Z();
        DEFAULT_INSTANCE = z4;
        com.google.protobuf.C.t(Z.class, z4);
    }

    public static void v(Z z4, v0 v0Var) {
        z4.getClass();
        v0Var.getClass();
        z4.queryType_ = v0Var;
        z4.queryTypeCase_ = 1;
    }

    public static void w(Z z4, ArrayList arrayList) {
        com.google.protobuf.J j = z4.aggregations_;
        if (!((AbstractC0893b) j).f12176a) {
            z4.aggregations_ = com.google.protobuf.C.p(j);
        }
        AbstractC0891a.b(arrayList, z4.aggregations_);
    }

    public static Y x() {
        return (Y) DEFAULT_INSTANCE.i();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", v0.class, "aggregations_", X.class});
            case 3:
                return new Z();
            case 4:
                return new Y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (Z.class) {
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
