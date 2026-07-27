package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4480c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final X f4481a = X.g();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4482b;

    static {
        new C0222q(0);
    }

    public C0222q() {
    }

    public static void b(C0217l c0217l, q0 q0Var, int i2, Object obj) {
        if (q0Var == q0.f4484d) {
            c0217l.t0(i2, 3);
            ((AbstractC0206a) obj).b(c0217l);
            c0217l.t0(i2, 4);
            return;
        }
        c0217l.t0(i2, q0Var.f4488b);
        switch (q0Var.ordinal()) {
            case 0:
                c0217l.o0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0217l.m0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0217l.x0(((Long) obj).longValue());
                break;
            case 3:
                c0217l.x0(((Long) obj).longValue());
                break;
            case 4:
                c0217l.q0(((Integer) obj).intValue());
                break;
            case 5:
                c0217l.o0(((Long) obj).longValue());
                break;
            case 6:
                c0217l.m0(((Integer) obj).intValue());
                break;
            case 7:
                c0217l.g0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0212g)) {
                    c0217l.s0((String) obj);
                    break;
                } else {
                    c0217l.k0((C0212g) obj);
                    break;
                }
            case 9:
                ((AbstractC0206a) obj).b(c0217l);
                break;
            case 10:
                AbstractC0206a abstractC0206a = (AbstractC0206a) obj;
                c0217l.getClass();
                c0217l.v0(((AbstractC0226v) abstractC0206a).a(null));
                abstractC0206a.b(c0217l);
                break;
            case 11:
                if (!(obj instanceof C0212g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0217l.v0(length);
                    c0217l.h0(bArr, 0, length);
                    break;
                } else {
                    c0217l.k0((C0212g) obj);
                    break;
                }
            case 12:
                c0217l.v0(((Integer) obj).intValue());
                break;
            case 13:
                c0217l.q0(((Integer) obj).intValue());
                break;
            case 14:
                c0217l.m0(((Integer) obj).intValue());
                break;
            case 15:
                c0217l.o0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0217l.v0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0217l.x0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f4482b) {
            return;
        }
        X x5 = this.f4481a;
        int size = x5.f4406a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry d6 = x5.d(i2);
            if (d6.getValue() instanceof AbstractC0226v) {
                AbstractC0226v abstractC0226v = (AbstractC0226v) d6.getValue();
                abstractC0226v.getClass();
                S s2 = S.f4392c;
                s2.getClass();
                s2.a(abstractC0226v.getClass()).d(abstractC0226v);
                abstractC0226v.j();
            }
        }
        if (!x5.f4408c) {
            if (x5.f4406a.size() > 0) {
                x5.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x5.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x5.f4408c) {
            x5.f4407b = x5.f4407b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x5.f4407b);
            x5.f4410e = x5.f4410e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(x5.f4410e);
            x5.f4408c = true;
        }
        this.f4482b = true;
    }

    public final Object clone() {
        C0222q c0222q = new C0222q();
        X x5 = this.f4481a;
        if (x5.f4406a.size() > 0) {
            Map.Entry d6 = x5.d(0);
            if (d6.getKey() != null) {
                throw new ClassCastException();
            }
            d6.getValue();
            throw null;
        }
        Iterator it = x5.e().iterator();
        if (!it.hasNext()) {
            return c0222q;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0222q) {
            return this.f4481a.equals(((C0222q) obj).f4481a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4481a.hashCode();
    }

    public C0222q(int i2) {
        a();
        a();
    }
}
