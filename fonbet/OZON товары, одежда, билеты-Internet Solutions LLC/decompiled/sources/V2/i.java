package V2;

import V2.h;
import androidx.datastore.preferences.protobuf.AbstractC5362h;
import androidx.datastore.preferences.protobuf.AbstractC5376w;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.Z;

/* loaded from: classes.dex */
public final class i extends AbstractC5376w<i, a> implements S {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Z<i> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC5376w.a<i, a> implements S {
        /* synthetic */ a(int i11) {
            this();
        }

        public final void f(boolean z11) {
            e();
            i.z((i) this.f42625b, z11);
        }

        public final void g(AbstractC5362h abstractC5362h) {
            e();
            i.x((i) this.f42625b, abstractC5362h);
        }

        public final void h(double d11) {
            e();
            i.w((i) this.f42625b, d11);
        }

        public final void i(float f7) {
            e();
            i.A((i) this.f42625b, f7);
        }

        public final void j(int i11) {
            e();
            i.B((i) this.f42625b, i11);
        }

        public final void k(long j11) {
            e();
            i.t((i) this.f42625b, j11);
        }

        public final void l(String str) {
            e();
            i.u((i) this.f42625b, str);
        }

        public final void m(h.a aVar) {
            e();
            i.v((i) this.f42625b, aVar.c());
        }

        private a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);

        private final int value;

        b(int i11) {
            this.value = i11;
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC5376w.s(i.class, iVar);
    }

    private i() {
    }

    static void A(i iVar, float f7) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f7);
    }

    static void B(i iVar, int i11) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i11);
    }

    public static i E() {
        return DEFAULT_INSTANCE;
    }

    public static a M() {
        return DEFAULT_INSTANCE.h();
    }

    static void t(i iVar, long j11) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j11);
    }

    static void u(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    static void v(i iVar, h hVar) {
        iVar.getClass();
        iVar.value_ = hVar;
        iVar.valueCase_ = 6;
    }

    static void w(i iVar, double d11) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d11);
    }

    static void x(i iVar, AbstractC5362h abstractC5362h) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = abstractC5362h;
    }

    static void z(i iVar, boolean z11) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z11);
    }

    public final boolean C() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final AbstractC5362h D() {
        return this.valueCase_ == 8 ? (AbstractC5362h) this.value_ : AbstractC5362h.f42524b;
    }

    public final double F() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float G() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int H() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long I() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String J() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final h K() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.v();
    }

    public final b L() {
        switch (this.valueCase_) {
            case 0:
                return b.VALUE_NOT_SET;
            case 1:
                return b.BOOLEAN;
            case 2:
                return b.FLOAT;
            case 3:
                return b.INTEGER;
            case 4:
                return b.LONG;
            case 5:
                return b.STRING;
            case 6:
                return b.STRING_SET;
            case 7:
                return b.DOUBLE;
            case 8:
                return b.BYTES;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5376w
    protected final Object i(AbstractC5376w.f fVar) {
        Z z11;
        switch (f.f27951a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new a(0);
            case 3:
                return AbstractC5376w.p(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<i> z12 = PARSER;
                if (z12 != null) {
                    return z12;
                }
                synchronized (i.class) {
                    try {
                        z11 = PARSER;
                        if (z11 == null) {
                            z11 = new AbstractC5376w.b(DEFAULT_INSTANCE);
                            PARSER = z11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return z11;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
