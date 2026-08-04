package Y4;

import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0876o0;
import com.google.protobuf.EnumC0866j0;
import com.google.protobuf.InterfaceC0868k0;

/* JADX INFO: loaded from: classes2.dex */
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
    private static volatile InterfaceC0868k0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        I0 i7 = new I0();
        DEFAULT_INSTANCE = i7;
        com.google.protobuf.C.t(I0.class, i7);
    }

    public static void A(C0569e c0569e, I0 i7) {
        i7.getClass();
        c0569e.getClass();
        i7.valueType_ = c0569e;
        i7.valueTypeCase_ = 9;
    }

    public static void B(I0 i7, K k7) {
        i7.getClass();
        k7.getClass();
        i7.valueType_ = k7;
        i7.valueTypeCase_ = 6;
    }

    public static void C(I0 i7) {
        EnumC0866j0 enumC0866j0 = EnumC0866j0.NULL_VALUE;
        i7.getClass();
        i7.valueType_ = Integer.valueOf(enumC0866j0.a());
        i7.valueTypeCase_ = 11;
    }

    public static void D(I0 i7, boolean z4) {
        i7.valueTypeCase_ = 1;
        i7.valueType_ = Boolean.valueOf(z4);
    }

    public static void E(I0 i7, long j) {
        i7.valueTypeCase_ = 2;
        i7.valueType_ = Long.valueOf(j);
    }

    public static void F(I0 i7, double d7) {
        i7.valueTypeCase_ = 3;
        i7.valueType_ = Double.valueOf(d7);
    }

    public static I0 J() {
        return DEFAULT_INSTANCE;
    }

    public static H0 S() {
        return (H0) DEFAULT_INSTANCE.i();
    }

    public static void v(I0 i7, com.google.protobuf.z0 z0Var) {
        i7.getClass();
        i7.valueType_ = z0Var;
        i7.valueTypeCase_ = 10;
    }

    public static void w(I0 i7, String str) {
        i7.getClass();
        str.getClass();
        i7.valueTypeCase_ = 17;
        i7.valueType_ = str;
    }

    public static void x(I0 i7, AbstractC0867k abstractC0867k) {
        i7.getClass();
        abstractC0867k.getClass();
        i7.valueTypeCase_ = 18;
        i7.valueType_ = abstractC0867k;
    }

    public static void y(I0 i7, String str) {
        i7.getClass();
        str.getClass();
        i7.valueTypeCase_ = 5;
        i7.valueType_ = str;
    }

    public static void z(I0 i7, p015b5.b bVar) {
        i7.getClass();
        i7.valueType_ = bVar;
        i7.valueTypeCase_ = 8;
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

    public final AbstractC0867k I() {
        return this.valueTypeCase_ == 18 ? (AbstractC0867k) this.valueType_ : AbstractC0867k.f12212b;
    }

    public final double K() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final p015b5.b L() {
        return this.valueTypeCase_ == 8 ? (p015b5.b) this.valueType_ : p015b5.b.x();
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
        switch (p136t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C0876o0(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", K.class, p015b5.b.class, C0569e.class, com.google.protobuf.z0.class});
            case 3:
                return new I0();
            case 4:
                return new H0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0868k0 b7 = PARSER;
                if (b7 == null) {
                    synchronized (I0.class) {
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
}
