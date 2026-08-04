package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0888w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12283c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0885t0 f12284a = new C0885t0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12285b;

    static {
        new C0888w(0);
    }

    public C0888w() {
    }

    public static void b(AbstractC0879q abstractC0879q, S0 s7, int i7, Object obj) {
        if (s7 == S0.f12149d) {
            abstractC0879q.K0(i7, 3);
            ((AbstractC0847a) obj).e(abstractC0879q);
            abstractC0879q.K0(i7, 4);
            return;
        }
        abstractC0879q.K0(i7, s7.f12153b);
        switch (s7.ordinal()) {
            case 0:
                abstractC0879q.D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC0879q.B0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC0879q.O0(((Long) obj).longValue());
                break;
            case 3:
                abstractC0879q.O0(((Long) obj).longValue());
                break;
            case 4:
                abstractC0879q.F0(((Integer) obj).intValue());
                break;
            case 5:
                abstractC0879q.D0(((Long) obj).longValue());
                break;
            case 6:
                abstractC0879q.B0(((Integer) obj).intValue());
                break;
            case 7:
                abstractC0879q.v0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC0867k)) {
                    abstractC0879q.J0((String) obj);
                } else {
                    abstractC0879q.z0((AbstractC0867k) obj);
                }
                break;
            case 9:
                ((AbstractC0847a) obj).e(abstractC0879q);
                break;
            case 10:
                abstractC0879q.H0((AbstractC0847a) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0867k)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC0879q.x0(bArr.length, bArr);
                } else {
                    abstractC0879q.z0((AbstractC0867k) obj);
                }
                break;
            case 12:
                abstractC0879q.M0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof H)) {
                    abstractC0879q.F0(((Integer) obj).intValue());
                } else {
                    abstractC0879q.F0(((H) obj).a());
                }
                break;
            case 14:
                abstractC0879q.B0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0879q.D0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC0879q.M0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC0879q.O0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        C0885t0 c0885t0;
        if (this.f12285b) {
            return;
        }
        int i7 = 0;
        while (true) {
            c0885t0 = this.f12284a;
            if (i7 >= c0885t0.f12276b.size()) {
                break;
            }
            Map.Entry entryC = c0885t0.c(i7);
            if (entryC.getValue() instanceof C) {
                C c3 = (C) entryC.getValue();
                c3.getClass();
                C0872m0 c0872m0 = C0872m0.f12232c;
                c0872m0.getClass();
                c0872m0.a(c3.getClass()).b(c3);
                c3.o();
            }
            i7++;
        }
        if (!c0885t0.f12278d) {
            if (c0885t0.f12276b.size() > 0) {
                c0885t0.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c0885t0.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c0885t0.f12278d) {
            c0885t0.f12277c = c0885t0.f12277c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0885t0.f12277c);
            c0885t0.f12280f = c0885t0.f12280f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0885t0.f12280f);
            c0885t0.f12278d = true;
        }
        this.f12285b = true;
    }

    public final Object clone() {
        C0888w c0888w = new C0888w();
        C0885t0 c0885t0 = this.f12284a;
        if (c0885t0.f12276b.size() > 0) {
            Map.Entry entryC = c0885t0.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = c0885t0.d().iterator();
        if (!it.hasNext()) {
            return c0888w;
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
        if (obj instanceof C0888w) {
            return this.f12284a.equals(((C0888w) obj).f12284a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12284a.hashCode();
    }

    public C0888w(int i7) {
        a();
        a();
    }
}
