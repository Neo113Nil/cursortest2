package Y4;

import com.google.protobuf.AbstractC0847a;
import com.google.protobuf.AbstractC0849b;
import com.google.protobuf.C0874n0;
import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;
import java.util.ArrayList;

/* JADX INFO: renamed from: Y4.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0572f0 extends com.google.protobuf.C {
    private static final C0572f0 DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile InterfaceC0868k0 PARSER;
    private com.google.protobuf.J filters_ = C0874n0.f12243d;
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
        if (!((AbstractC0849b) j).f12176a) {
            c0572f0.filters_ = com.google.protobuf.C.p(j);
        }
        AbstractC0847a.b(arrayList, c0572f0.filters_);
    }

    public static C0572f0 x() {
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
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", C0590o0.class});
            case 3:
                return new C0572f0();
            case 4:
                return new C0568d0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0572f0.class) {
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

    public final com.google.protobuf.J y() {
        return this.filters_;
    }

    public final EnumC0570e0 z() {
        EnumC0570e0 enumC0570e0;
        int i7 = this.op_;
        if (i7 == 0) {
            enumC0570e0 = EnumC0570e0.OPERATOR_UNSPECIFIED;
        } else if (i7 != 1) {
            enumC0570e0 = i7 != 2 ? null : EnumC0570e0.OR;
        } else {
            enumC0570e0 = EnumC0570e0.AND;
        }
        return enumC0570e0 == null ? EnumC0570e0.UNRECOGNIZED : enumC0570e0;
    }
}
