package Y4;

import com.google.protobuf.C0876o0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: renamed from: Y4.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0590o0 extends com.google.protobuf.C {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final C0590o0 DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;

    static {
        C0590o0 c0590o0 = new C0590o0();
        DEFAULT_INSTANCE = c0590o0;
        com.google.protobuf.C.t(C0590o0.class, c0590o0);
    }

    public static C0586m0 D() {
        return (C0586m0) DEFAULT_INSTANCE.i();
    }

    public static void v(C0590o0 c0590o0, C0580j0 c0580j0) {
        c0590o0.getClass();
        c0590o0.filterType_ = c0580j0;
        c0590o0.filterTypeCase_ = 2;
    }

    public static void w(C0590o0 c0590o0, u0 u0Var) {
        c0590o0.getClass();
        c0590o0.filterType_ = u0Var;
        c0590o0.filterTypeCase_ = 3;
    }

    public static void x(C0590o0 c0590o0, C0572f0 c0572f0) {
        c0590o0.getClass();
        c0590o0.filterType_ = c0572f0;
        c0590o0.filterTypeCase_ = 1;
    }

    public static C0590o0 z() {
        return DEFAULT_INSTANCE;
    }

    public final C0580j0 A() {
        return this.filterTypeCase_ == 2 ? (C0580j0) this.filterType_ : C0580j0.y();
    }

    public final EnumC0588n0 B() {
        int i7 = this.filterTypeCase_;
        if (i7 == 0) {
            return EnumC0588n0.f7737d;
        }
        if (i7 == 1) {
            return EnumC0588n0.f7734a;
        }
        if (i7 == 2) {
            return EnumC0588n0.f7735b;
        }
        if (i7 != 3) {
            return null;
        }
        return EnumC0588n0.f7736c;
    }

    public final u0 C() {
        return this.filterTypeCase_ == 3 ? (u0) this.filterType_ : u0.x();
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", C0572f0.class, C0580j0.class, u0.class});
            case 3:
                return new C0590o0();
            case 4:
                return new C0586m0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (C0590o0.class) {
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

    public final C0572f0 y() {
        return this.filterTypeCase_ == 1 ? (C0572f0) this.filterType_ : C0572f0.x();
    }
}
