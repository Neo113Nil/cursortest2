package Y4;

import com.google.protobuf.C0920o0;
import com.google.protobuf.InterfaceC0912k0;

/* renamed from: Y4.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0580j0 extends com.google.protobuf.C {
    private static final C0580j0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C0584l0 field_;
    private int op_;
    private I0 value_;

    static {
        C0580j0 c0580j0 = new C0580j0();
        DEFAULT_INSTANCE = c0580j0;
        com.google.protobuf.C.t(C0580j0.class, c0580j0);
    }

    public static C0576h0 C() {
        return (C0576h0) DEFAULT_INSTANCE.i();
    }

    public static void v(C0580j0 c0580j0, C0584l0 c0584l0) {
        c0580j0.getClass();
        c0580j0.field_ = c0584l0;
        c0580j0.bitField0_ |= 1;
    }

    public static void w(C0580j0 c0580j0, EnumC0578i0 enumC0578i0) {
        c0580j0.getClass();
        c0580j0.op_ = enumC0578i0.a();
    }

    public static void x(C0580j0 c0580j0, I0 i02) {
        c0580j0.getClass();
        i02.getClass();
        c0580j0.value_ = i02;
        c0580j0.bitField0_ |= 2;
    }

    public static C0580j0 y() {
        return DEFAULT_INSTANCE;
    }

    public final EnumC0578i0 A() {
        EnumC0578i0 enumC0578i0;
        switch (this.op_) {
            case 0:
                enumC0578i0 = EnumC0578i0.OPERATOR_UNSPECIFIED;
                break;
            case 1:
                enumC0578i0 = EnumC0578i0.LESS_THAN;
                break;
            case 2:
                enumC0578i0 = EnumC0578i0.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                enumC0578i0 = EnumC0578i0.GREATER_THAN;
                break;
            case 4:
                enumC0578i0 = EnumC0578i0.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                enumC0578i0 = EnumC0578i0.EQUAL;
                break;
            case 6:
                enumC0578i0 = EnumC0578i0.NOT_EQUAL;
                break;
            case 7:
                enumC0578i0 = EnumC0578i0.ARRAY_CONTAINS;
                break;
            case 8:
                enumC0578i0 = EnumC0578i0.IN;
                break;
            case 9:
                enumC0578i0 = EnumC0578i0.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                enumC0578i0 = EnumC0578i0.NOT_IN;
                break;
            default:
                enumC0578i0 = null;
                break;
        }
        return enumC0578i0 == null ? EnumC0578i0.UNRECOGNIZED : enumC0578i0;
    }

    public final I0 B() {
        I0 i02 = this.value_;
        return i02 == null ? I0.J() : i02;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
            case 3:
                return new C0580j0();
            case 4:
                return new C0576h0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (C0580j0.class) {
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

    public final C0584l0 z() {
        C0584l0 c0584l0 = this.field_;
        return c0584l0 == null ? C0584l0.w() : c0584l0;
    }
}
