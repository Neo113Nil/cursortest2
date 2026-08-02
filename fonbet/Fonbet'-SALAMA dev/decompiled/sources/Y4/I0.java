package Y4;

import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0920o0;
import com.google.protobuf.EnumC0910j0;
import com.google.protobuf.InterfaceC0912k0;

/* loaded from: classes2.dex */
public final class I0 extends com.google.protobuf.C {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final I0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC0912k0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        I0 i02 = new I0();
        DEFAULT_INSTANCE = i02;
        com.google.protobuf.C.t(I0.class, i02);
    }

    public static void A(C0569e c0569e, I0 i02) {
        i02.getClass();
        c0569e.getClass();
        i02.valueType_ = c0569e;
        i02.valueTypeCase_ = 9;
    }

    public static void B(I0 i02, K k7) {
        i02.getClass();
        k7.getClass();
        i02.valueType_ = k7;
        i02.valueTypeCase_ = 6;
    }

    public static void C(I0 i02) {
        EnumC0910j0 enumC0910j0 = EnumC0910j0.NULL_VALUE;
        i02.getClass();
        i02.valueType_ = Integer.valueOf(enumC0910j0.a());
        i02.valueTypeCase_ = 11;
    }

    public static void D(I0 i02, boolean z4) {
        i02.valueTypeCase_ = 1;
        i02.valueType_ = Boolean.valueOf(z4);
    }

    public static void E(I0 i02, long j) {
        i02.valueTypeCase_ = 2;
        i02.valueType_ = Long.valueOf(j);
    }

    public static void F(I0 i02, double d7) {
        i02.valueTypeCase_ = 3;
        i02.valueType_ = Double.valueOf(d7);
    }

    public static I0 J() {
        return DEFAULT_INSTANCE;
    }

    public static H0 S() {
        return (H0) DEFAULT_INSTANCE.i();
    }

    public static void v(I0 i02, com.google.protobuf.z0 z0Var) {
        i02.getClass();
        i02.valueType_ = z0Var;
        i02.valueTypeCase_ = 10;
    }

    public static void w(I0 i02, String str) {
        i02.getClass();
        str.getClass();
        i02.valueTypeCase_ = 17;
        i02.valueType_ = str;
    }

    public static void x(I0 i02, AbstractC0911k abstractC0911k) {
        i02.getClass();
        abstractC0911k.getClass();
        i02.valueTypeCase_ = 18;
        i02.valueType_ = abstractC0911k;
    }

    public static void y(I0 i02, String str) {
        i02.getClass();
        str.getClass();
        i02.valueTypeCase_ = 5;
        i02.valueType_ = str;
    }

    public static void z(I0 i02, b5.b bVar) {
        i02.getClass();
        i02.valueType_ = bVar;
        i02.valueTypeCase_ = 8;
    }

    public final C0569e G() {
        return this.valueTypeCase_ == 9 ? (C0569e) this.valueType_ : C0569e.y();
    }

    public final boolean H() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final AbstractC0911k I() {
        return this.valueTypeCase_ == 18 ? (AbstractC0911k) this.valueType_ : AbstractC0911k.f12212b;
    }

    public final double K() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final b5.b L() {
        return this.valueTypeCase_ == 8 ? (b5.b) this.valueType_ : b5.b.x();
    }

    public final long M() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final K N() {
        return this.valueTypeCase_ == 6 ? (K) this.valueType_ : K.w();
    }

    public final String O() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public final String P() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public final com.google.protobuf.z0 Q() {
        return this.valueTypeCase_ == 10 ? (com.google.protobuf.z0) this.valueType_ : com.google.protobuf.z0.x();
    }

    public final int R() {
        int i7 = this.valueTypeCase_;
        if (i7 == 0) {
            return 12;
        }
        if (i7 == 1) {
            return 2;
        }
        int i8 = 3;
        if (i7 != 2) {
            if (i7 == 3) {
                return 4;
            }
            if (i7 == 5) {
                return 8;
            }
            i8 = 6;
            if (i7 == 6) {
                return 11;
            }
            if (i7 != 17) {
                if (i7 == 18) {
                    return 7;
                }
                switch (i7) {
                    case 8:
                        return 9;
                    case 9:
                        return 10;
                    case 10:
                        return 5;
                    case 11:
                        return 1;
                    default:
                        return 0;
                }
            }
        }
        return i8;
    }

    @Override // com.google.protobuf.C
    public final Object j(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0920o0(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", K.class, b5.b.class, C0569e.class, com.google.protobuf.z0.class});
            case 3:
                return new I0();
            case 4:
                return new H0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0912k0 interfaceC0912k0 = PARSER;
                if (interfaceC0912k0 == null) {
                    synchronized (I0.class) {
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
