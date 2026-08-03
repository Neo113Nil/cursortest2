package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2348c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.Y f2349a = androidx.datastore.preferences.protobuf.Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2350b;

    static {
        new androidx.datastore.preferences.protobuf.r(0);
    }

    public r() {
    }

    public static void b(androidx.datastore.preferences.protobuf.C0077m c0077m, androidx.datastore.preferences.protobuf.r0 r0Var, int i2, java.lang.Object obj) {
        if (r0Var == androidx.datastore.preferences.protobuf.r0.f2352d) {
            c0077m.t0(i2, 3);
            ((androidx.datastore.preferences.protobuf.AbstractC0065a) obj).b(c0077m);
            c0077m.t0(i2, 4);
            return;
        }
        c0077m.t0(i2, r0Var.f2356b);
        switch (r0Var.ordinal()) {
            case 0:
                c0077m.o0(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                break;
            case 1:
                c0077m.m0(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                break;
            case 2:
                c0077m.x0(((java.lang.Long) obj).longValue());
                break;
            case 3:
                c0077m.x0(((java.lang.Long) obj).longValue());
                break;
            case 4:
                c0077m.q0(((java.lang.Integer) obj).intValue());
                break;
            case 5:
                c0077m.o0(((java.lang.Long) obj).longValue());
                break;
            case 6:
                c0077m.m0(((java.lang.Integer) obj).intValue());
                break;
            case 7:
                c0077m.g0(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof androidx.datastore.preferences.protobuf.C0071g)) {
                    c0077m.s0((java.lang.String) obj);
                    break;
                } else {
                    c0077m.k0((androidx.datastore.preferences.protobuf.C0071g) obj);
                    break;
                }
            case 9:
                ((androidx.datastore.preferences.protobuf.AbstractC0065a) obj).b(c0077m);
                break;
            case 10:
                androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a = (androidx.datastore.preferences.protobuf.AbstractC0065a) obj;
                c0077m.getClass();
                c0077m.v0(((androidx.datastore.preferences.protobuf.AbstractC0086w) abstractC0065a).a(null));
                abstractC0065a.b(c0077m);
                break;
            case 11:
                if (!(obj instanceof androidx.datastore.preferences.protobuf.C0071g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0077m.v0(length);
                    c0077m.h0(bArr, 0, length);
                    break;
                } else {
                    c0077m.k0((androidx.datastore.preferences.protobuf.C0071g) obj);
                    break;
                }
            case 12:
                c0077m.v0(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                c0077m.q0(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                c0077m.m0(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                c0077m.o0(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                c0077m.v0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                c0077m.x0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f2350b) {
            return;
        }
        androidx.datastore.preferences.protobuf.Y y2 = this.f2349a;
        int size = y2.f2273a.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.Map.Entry c2 = y2.c(i2);
            if (c2.getValue() instanceof androidx.datastore.preferences.protobuf.AbstractC0086w) {
                androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = (androidx.datastore.preferences.protobuf.AbstractC0086w) c2.getValue();
                abstractC0086w.getClass();
                androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
                t.getClass();
                t.a(abstractC0086w.getClass()).h(abstractC0086w);
                abstractC0086w.j();
            }
        }
        if (!y2.f2275c) {
            if (y2.f2273a.size() > 0) {
                y2.c(0).getKey().getClass();
                throw new java.lang.ClassCastException();
            }
            java.util.Iterator it = y2.d().iterator();
            if (it.hasNext()) {
                ((java.util.Map.Entry) it.next()).getKey().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        if (!y2.f2275c) {
            y2.f2274b = y2.f2274b.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(y2.f2274b);
            y2.f2277e = y2.f2277e.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(y2.f2277e);
            y2.f2275c = true;
        }
        this.f2350b = true;
    }

    public final java.lang.Object clone() {
        androidx.datastore.preferences.protobuf.r rVar = new androidx.datastore.preferences.protobuf.r();
        androidx.datastore.preferences.protobuf.Y y2 = this.f2349a;
        if (y2.f2273a.size() > 0) {
            java.util.Map.Entry c2 = y2.c(0);
            if (c2.getKey() != null) {
                throw new java.lang.ClassCastException();
            }
            c2.getValue();
            throw null;
        }
        java.util.Iterator it = y2.d().iterator();
        if (!it.hasNext()) {
            return rVar;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new java.lang.ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.r) {
            return this.f2349a.equals(((androidx.datastore.preferences.protobuf.r) obj).f2349a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2349a.hashCode();
    }

    public r(int i2) {
        a();
        a();
    }
}
