package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2274c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f2275a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2276b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0138m c0138m, r0 r0Var, int i3, Object obj) {
        if (r0Var == r0.f2278d) {
            c0138m.J0(i3, 3);
            ((AbstractC0126a) obj).b(c0138m);
            c0138m.J0(i3, 4);
        }
        c0138m.J0(i3, r0Var.f2281b);
        switch (r0Var.ordinal()) {
            case 0:
                c0138m.D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0138m.B0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0138m.N0(((Long) obj).longValue());
                break;
            case 3:
                c0138m.N0(((Long) obj).longValue());
                break;
            case 4:
                c0138m.F0(((Integer) obj).intValue());
                break;
            case 5:
                c0138m.D0(((Long) obj).longValue());
                break;
            case 6:
                c0138m.B0(((Integer) obj).intValue());
                break;
            case 7:
                c0138m.v0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0132g)) {
                    c0138m.I0((String) obj);
                    break;
                } else {
                    c0138m.z0((C0132g) obj);
                    break;
                }
            case 9:
                ((AbstractC0126a) obj).b(c0138m);
                break;
            case 10:
                AbstractC0126a abstractC0126a = (AbstractC0126a) obj;
                c0138m.getClass();
                c0138m.L0(((AbstractC0147w) abstractC0126a).a(null));
                abstractC0126a.b(c0138m);
                break;
            case 11:
                if (!(obj instanceof C0132g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0138m.L0(length);
                    c0138m.w0(bArr, 0, length);
                    break;
                } else {
                    c0138m.z0((C0132g) obj);
                    break;
                }
            case 12:
                c0138m.L0(((Integer) obj).intValue());
                break;
            case 13:
                c0138m.F0(((Integer) obj).intValue());
                break;
            case 14:
                c0138m.B0(((Integer) obj).intValue());
                break;
            case 15:
                c0138m.D0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0138m.L0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0138m.N0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f2276b) {
            return;
        }
        Y y = this.f2275a;
        int size = y.f2203a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry c3 = y.c(i3);
            if (c3.getValue() instanceof AbstractC0147w) {
                AbstractC0147w abstractC0147w = (AbstractC0147w) c3.getValue();
                abstractC0147w.getClass();
                T t3 = T.f2190c;
                t3.getClass();
                t3.a(abstractC0147w.getClass()).d(abstractC0147w);
                abstractC0147w.h();
            }
        }
        if (!y.f2205c) {
            if (y.f2203a.size() > 0) {
                y.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y.f2205c) {
            y.f2204b = y.f2204b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y.f2204b);
            y.f2207e = y.f2207e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y.f2207e);
            y.f2205c = true;
        }
        this.f2276b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y = this.f2275a;
        if (y.f2203a.size() > 0) {
            Map.Entry c3 = y.c(0);
            if (c3.getKey() != null) {
                throw new ClassCastException();
            }
            c3.getValue();
            throw null;
        }
        Iterator it = y.d().iterator();
        if (!it.hasNext()) {
            return rVar;
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
        if (obj instanceof r) {
            return this.f2275a.equals(((r) obj).f2275a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2275a.hashCode();
    }

    public r(int i3) {
        a();
        a();
    }
}
