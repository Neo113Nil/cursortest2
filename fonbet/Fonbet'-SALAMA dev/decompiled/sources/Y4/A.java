package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class A extends com.google.protobuf.C {
    public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
    private static final A DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int INCREMENT_FIELD_NUMBER = 3;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 5;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
    public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
    private Object transformType_;
    private int transformTypeCase_ = 0;
    private String fieldPath_ = "";

    static {
        A a2 = new A();
        DEFAULT_INSTANCE = a2;
        com.google.protobuf.C.t(A.class, a2);
    }

    public static C0601y G() {
        return (C0601y) DEFAULT_INSTANCE.i();
    }

    public static void v(A a2, C0569e c0569e) {
        a2.getClass();
        a2.transformType_ = c0569e;
        a2.transformTypeCase_ = 6;
    }

    public static void w(A a2, String str) {
        a2.getClass();
        str.getClass();
        a2.fieldPath_ = str;
    }

    public static void x(A a2, C0569e c0569e) {
        a2.getClass();
        a2.transformType_ = c0569e;
        a2.transformTypeCase_ = 7;
    }

    public static void y(A a2) {
        EnumC0602z enumC0602z = EnumC0602z.REQUEST_TIME;
        a2.getClass();
        a2.transformType_ = Integer.valueOf(enumC0602z.a());
        a2.transformTypeCase_ = 2;
    }

    public static void z(A a2, I0 i02) {
        a2.getClass();
        i02.getClass();
        a2.transformType_ = i02;
        a2.transformTypeCase_ = 3;
    }

    public final C0569e A() {
        return this.transformTypeCase_ == 6 ? (C0569e) this.transformType_ : C0569e.y();
    }

    public final String B() {
        return this.fieldPath_;
    }

    public final I0 C() {
        return this.transformTypeCase_ == 3 ? (I0) this.transformType_ : I0.J();
    }

    public final C0569e D() {
        return this.transformTypeCase_ == 7 ? (C0569e) this.transformType_ : C0569e.y();
    }

    public final EnumC0602z E() {
        int i7 = this.transformTypeCase_;
        EnumC0602z enumC0602z = EnumC0602z.SERVER_VALUE_UNSPECIFIED;
        if (i7 != 2) {
            return enumC0602z;
        }
        int intValue = ((Integer) this.transformType_).intValue();
        if (intValue != 0) {
            enumC0602z = intValue != 1 ? null : EnumC0602z.REQUEST_TIME;
        }
        return enumC0602z == null ? EnumC0602z.UNRECOGNIZED : enumC0602z;
    }

    public final int F() {
        int i7 = this.transformTypeCase_;
        if (i7 == 0) {
            return 7;
        }
        switch (i7) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", I0.class, I0.class, I0.class, C0569e.class, C0569e.class});
            case 3:
                return new A();
            case 4:
                return new C0601y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (A.class) {
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
