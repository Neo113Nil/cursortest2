package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0671p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9227c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f9228a = W.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9229b;

    static {
        new C0671p(0);
    }

    public C0671p() {
    }

    public static void b(C0666k c0666k, p0 p0Var, int i7, Object obj) {
        if (p0Var == p0.f9231d) {
            c0666k.e1(i7, 3);
            ((AbstractC0656a) obj).b(c0666k);
            c0666k.e1(i7, 4);
            return;
        }
        c0666k.e1(i7, p0Var.f9235b);
        switch (p0Var.ordinal()) {
            case 0:
                c0666k.Z0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0666k.X0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0666k.i1(((Long) obj).longValue());
                break;
            case 3:
                c0666k.i1(((Long) obj).longValue());
                break;
            case 4:
                c0666k.b1(((Integer) obj).intValue());
                break;
            case 5:
                c0666k.Z0(((Long) obj).longValue());
                break;
            case 6:
                c0666k.X0(((Integer) obj).intValue());
                break;
            case 7:
                c0666k.R0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0662g)) {
                    c0666k.d1((String) obj);
                } else {
                    c0666k.V0((C0662g) obj);
                }
                break;
            case 9:
                ((AbstractC0656a) obj).b(c0666k);
                break;
            case 10:
                AbstractC0656a abstractC0656a = (AbstractC0656a) obj;
                c0666k.getClass();
                c0666k.g1(((AbstractC0675u) abstractC0656a).a(null));
                abstractC0656a.b(c0666k);
                break;
            case 11:
                if (!(obj instanceof C0662g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0666k.g1(length);
                    c0666k.S0(bArr, 0, length);
                } else {
                    c0666k.V0((C0662g) obj);
                }
                break;
            case 12:
                c0666k.g1(((Integer) obj).intValue());
                break;
            case 13:
                c0666k.b1(((Integer) obj).intValue());
                break;
            case 14:
                c0666k.X0(((Integer) obj).intValue());
                break;
            case 15:
                c0666k.Z0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0666k.g1((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0666k.i1((jLongValue >> 63) ^ (jLongValue << 1));
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
            Map.Entry entryC = w7.c(i7);
            if (entryC.getValue() instanceof AbstractC0675u) {
                AbstractC0675u abstractC0675u = (AbstractC0675u) entryC.getValue();
                abstractC0675u.getClass();
                Q q7 = Q.f9136c;
                q7.getClass();
                q7.a(abstractC0675u.getClass()).b(abstractC0675u);
                abstractC0675u.j();
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
        C0671p c0671p = new C0671p();
        W w7 = this.f9228a;
        if (w7.f9150a.size() > 0) {
            Map.Entry entryC = w7.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = w7.d().iterator();
        if (!it.hasNext()) {
            return c0671p;
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
        if (obj instanceof C0671p) {
            return this.f9228a.equals(((C0671p) obj).f9228a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9228a.hashCode();
    }

    public C0671p(int i7) {
        a();
        a();
    }
}
