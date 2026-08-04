package p022d0;

import androidx.datastore.preferences.protobuf.AbstractC0673s;
import androidx.datastore.preferences.protobuf.AbstractC0675u;
import androidx.datastore.preferences.protobuf.C0662g;
import androidx.datastore.preferences.protobuf.C0674t;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.T;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0675u {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
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
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC0675u.l(i.class, iVar);
    }

    public static h F() {
        return (h) ((AbstractC0673s) DEFAULT_INSTANCE.e(5));
    }

    public static void n(i iVar, long j) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j);
    }

    public static void o(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void p(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void q(i iVar, double d7) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d7);
    }

    public static void r(i iVar, C0662g c0662g) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = c0662g;
    }

    public static void s(i iVar, boolean z4) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z4);
    }

    public static void t(i iVar, float f7) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f7);
    }

    public static void u(i iVar, int i7) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i7);
    }

    public static i x() {
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

    public final g D() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.o();
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0675u
    public final Object e(int i7) {
        switch (e.e(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new T(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 3:
                return new i();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                P c0674t = PARSER;
                if (c0674t == null) {
                    synchronized (i.class) {
                        try {
                            c0674t = PARSER;
                            if (c0674t == null) {
                                c0674t = new C0674t();
                                PARSER = c0674t;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0674t;
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

    public final C0662g w() {
        return this.valueCase_ == 8 ? (C0662g) this.value_ : C0662g.f9182c;
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
