package d0;

import androidx.datastore.preferences.protobuf.AbstractC0694s;
import androidx.datastore.preferences.protobuf.AbstractC0696u;
import androidx.datastore.preferences.protobuf.C0683g;
import androidx.datastore.preferences.protobuf.C0695t;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.T;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947i extends AbstractC0696u {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C0947i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile P PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C0947i c0947i = new C0947i();
        DEFAULT_INSTANCE = c0947i;
        AbstractC0696u.l(C0947i.class, c0947i);
    }

    public static C0946h F() {
        return (C0946h) ((AbstractC0694s) DEFAULT_INSTANCE.e(5));
    }

    public static void n(C0947i c0947i, long j) {
        c0947i.valueCase_ = 4;
        c0947i.value_ = Long.valueOf(j);
    }

    public static void o(C0947i c0947i, String str) {
        c0947i.getClass();
        str.getClass();
        c0947i.valueCase_ = 5;
        c0947i.value_ = str;
    }

    public static void p(C0947i c0947i, C0945g c0945g) {
        c0947i.getClass();
        c0947i.value_ = c0945g;
        c0947i.valueCase_ = 6;
    }

    public static void q(C0947i c0947i, double d7) {
        c0947i.valueCase_ = 7;
        c0947i.value_ = Double.valueOf(d7);
    }

    public static void r(C0947i c0947i, C0683g c0683g) {
        c0947i.getClass();
        c0947i.valueCase_ = 8;
        c0947i.value_ = c0683g;
    }

    public static void s(C0947i c0947i, boolean z4) {
        c0947i.valueCase_ = 1;
        c0947i.value_ = Boolean.valueOf(z4);
    }

    public static void t(C0947i c0947i, float f7) {
        c0947i.valueCase_ = 2;
        c0947i.value_ = Float.valueOf(f7);
    }

    public static void u(C0947i c0947i, int i7) {
        c0947i.valueCase_ = 3;
        c0947i.value_ = Integer.valueOf(i7);
    }

    public static C0947i x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final C0945g D() {
        return this.valueCase_ == 6 ? (C0945g) this.value_ : C0945g.o();
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0696u
    public final Object e(int i7) {
        switch (t.e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C0945g.class});
            case 3:
                return new C0947i();
            case 4:
                return new C0946h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P p5 = PARSER;
                if (p5 == null) {
                    synchronized (C0947i.class) {
                        try {
                            p5 = PARSER;
                            if (p5 == null) {
                                p5 = new C0695t();
                                PARSER = p5;
                            }
                        } finally {
                        }
                    }
                }
                return p5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0683g w() {
        return this.valueCase_ == 8 ? (C0683g) this.value_ : C0683g.f9182c;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
