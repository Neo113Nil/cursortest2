package Y4;

import com.google.protobuf.AbstractC0891a;
import com.google.protobuf.AbstractC0893b;
import com.google.protobuf.C0918n0;
import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;
import java.util.ArrayList;

/* renamed from: Y4.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0572f0 extends com.google.protobuf.C {
    private static final C0572f0 DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC0912k0 PARSER;
    private com.google.protobuf.J filters_ = C0918n0.f12243d;
    private int op_;

    static {
        C0572f0 c0572f0 = new C0572f0();
        DEFAULT_INSTANCE = c0572f0;
        com.google.protobuf.C.t(C0572f0.class, c0572f0);
    }

    public static C0568d0 A() {
        return (C0568d0) DEFAULT_INSTANCE.i();
    }

    public static void v(C0572f0 c0572f0, EnumC0570e0 enumC0570e0) {
        c0572f0.getClass();
        c0572f0.op_ = enumC0570e0.a();
    }

    public static void w(C0572f0 c0572f0, ArrayList arrayList) {
        com.google.protobuf.J j = c0572f0.filters_;
        if (!((AbstractC0893b) j).f12176a) {
            c0572f0.filters_ = com.google.protobuf.C.p(j);
        }
        AbstractC0891a.b(arrayList, c0572f0.filters_);
    }

    public static C0572f0 x() {
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
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", C0590o0.class});
            case 3:
                return new C0572f0();
            case 4:
                return new C0568d0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0572f0.class) {
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

    public final com.google.protobuf.J y() {
        return this.filters_;
    }

    public final EnumC0570e0 z() {
        int i7 = this.op_;
        EnumC0570e0 enumC0570e0 = i7 != 0 ? i7 != 1 ? i7 != 2 ? null : EnumC0570e0.OR : EnumC0570e0.AND : EnumC0570e0.OPERATOR_UNSPECIFIED;
        return enumC0570e0 == null ? EnumC0570e0.UNRECOGNIZED : enumC0570e0;
    }
}
