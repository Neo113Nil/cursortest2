package H;

/* loaded from: classes.dex */
public final class k extends androidx.datastore.preferences.protobuf.AbstractC0086w {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final H.k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile androidx.datastore.preferences.protobuf.S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private java.lang.Object value_;

    static {
        H.k kVar = new H.k();
        DEFAULT_INSTANCE = kVar;
        androidx.datastore.preferences.protobuf.AbstractC0086w.l(H.k.class, kVar);
    }

    public static H.i F() {
        return (H.i) ((androidx.datastore.preferences.protobuf.AbstractC0084u) DEFAULT_INSTANCE.e(5));
    }

    public static void n(H.k kVar, long j2) {
        kVar.valueCase_ = 4;
        kVar.value_ = java.lang.Long.valueOf(j2);
    }

    public static void o(H.k kVar, java.lang.String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void p(H.k kVar, H.h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void q(H.k kVar, double d2) {
        kVar.valueCase_ = 7;
        kVar.value_ = java.lang.Double.valueOf(d2);
    }

    public static void r(H.k kVar, androidx.datastore.preferences.protobuf.C0071g c0071g) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c0071g;
    }

    public static void s(H.k kVar, boolean z2) {
        kVar.valueCase_ = 1;
        kVar.value_ = java.lang.Boolean.valueOf(z2);
    }

    public static void t(H.k kVar, float f2) {
        kVar.valueCase_ = 2;
        kVar.value_ = java.lang.Float.valueOf(f2);
    }

    public static void u(H.k kVar, int i2) {
        kVar.valueCase_ = 3;
        kVar.value_ = java.lang.Integer.valueOf(i2);
    }

    public static H.k x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((java.lang.Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((java.lang.Long) this.value_).longValue();
        }
        return 0L;
    }

    public final java.lang.String C() {
        return this.valueCase_ == 5 ? (java.lang.String) this.value_ : "";
    }

    public final H.h D() {
        return this.valueCase_ == 6 ? (H.h) this.value_ : H.h.o();
    }

    public final int E() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0086w
    public final java.lang.Object e(int i2) {
        switch (H.j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new androidx.datastore.preferences.protobuf.V(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new java.lang.Object[]{"value_", "valueCase_", H.h.class});
            case 3:
                return new H.k();
            case 4:
                return new H.i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.S s2 = PARSER;
                if (s2 == null) {
                    synchronized (H.k.class) {
                        try {
                            s2 = PARSER;
                            if (s2 == null) {
                                s2 = new androidx.datastore.preferences.protobuf.C0085v();
                                PARSER = s2;
                            }
                        } finally {
                        }
                    }
                }
                return s2;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((java.lang.Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.C0071g w() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.C0071g) this.value_ : androidx.datastore.preferences.protobuf.C0071g.f2301c;
    }

    public final double y() {
        return this.valueCase_ == 7 ? ((java.lang.Double) this.value_).doubleValue() : com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((java.lang.Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
