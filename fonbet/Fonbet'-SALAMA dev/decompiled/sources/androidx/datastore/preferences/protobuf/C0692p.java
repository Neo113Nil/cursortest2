package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9227c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final W f9228a = W.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f9229b;

    static {
        new C0692p(0);
    }

    public C0692p() {
    }

    public static void b(C0687k c0687k, p0 p0Var, int i7, Object obj) {
        if (p0Var == p0.f9231d) {
            c0687k.e1(i7, 3);
            ((AbstractC0677a) obj).b(c0687k);
            c0687k.e1(i7, 4);
            return;
        }
        c0687k.e1(i7, p0Var.f9235b);
        switch (p0Var.ordinal()) {
            case 0:
                c0687k.Z0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0687k.X0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0687k.i1(((Long) obj).longValue());
                break;
            case 3:
                c0687k.i1(((Long) obj).longValue());
                break;
            case 4:
                c0687k.b1(((Integer) obj).intValue());
                break;
            case 5:
                c0687k.Z0(((Long) obj).longValue());
                break;
            case 6:
                c0687k.X0(((Integer) obj).intValue());
                break;
            case 7:
                c0687k.R0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0683g)) {
                    c0687k.d1((String) obj);
                    break;
                } else {
                    c0687k.V0((C0683g) obj);
                    break;
                }
            case 9:
                ((AbstractC0677a) obj).b(c0687k);
                break;
            case 10:
                AbstractC0677a abstractC0677a = (AbstractC0677a) obj;
                c0687k.getClass();
                c0687k.g1(((AbstractC0696u) abstractC0677a).a(null));
                abstractC0677a.b(c0687k);
                break;
            case 11:
                if (!(obj instanceof C0683g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0687k.g1(length);
                    c0687k.S0(bArr, 0, length);
                    break;
                } else {
                    c0687k.V0((C0683g) obj);
                    break;
                }
            case 12:
                c0687k.g1(((Integer) obj).intValue());
                break;
            case 13:
                c0687k.b1(((Integer) obj).intValue());
                break;
            case 14:
                c0687k.X0(((Integer) obj).intValue());
                break;
            case 15:
                c0687k.Z0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0687k.g1((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0687k.i1((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f9229b) {
            return;
        }
        W w7 = this.f9228a;
        int size = w7.f9150a.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry c3 = w7.c(i7);
            if (c3.getValue() instanceof AbstractC0696u) {
                AbstractC0696u abstractC0696u = (AbstractC0696u) c3.getValue();
                abstractC0696u.getClass();
                Q q7 = Q.f9136c;
                q7.getClass();
                q7.a(abstractC0696u.getClass()).b(abstractC0696u);
                abstractC0696u.j();
            }
        }
        if (!w7.f9152c) {
            if (w7.f9150a.size() > 0) {
                w7.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = w7.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!w7.f9152c) {
            w7.f9151b = w7.f9151b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(w7.f9151b);
            w7.f9154e = w7.f9154e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(w7.f9154e);
            w7.f9152c = true;
        }
        this.f9229b = true;
    }

    public final Object clone() {
        C0692p c0692p = new C0692p();
        W w7 = this.f9228a;
        if (w7.f9150a.size() > 0) {
            Map.Entry c3 = w7.c(0);
            if (c3.getKey() != null) {
                throw new ClassCastException();
            }
            c3.getValue();
            throw null;
        }
        Iterator it = w7.d().iterator();
        if (!it.hasNext()) {
            return c0692p;
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
        if (obj instanceof C0692p) {
            return this.f9228a.equals(((C0692p) obj).f9228a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9228a.hashCode();
    }

    public C0692p(int i7) {
        a();
        a();
    }
}
