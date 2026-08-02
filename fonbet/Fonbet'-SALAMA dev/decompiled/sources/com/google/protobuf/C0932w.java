package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0932w {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12283c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0929t0 f12284a = new C0929t0(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f12285b;

    static {
        new C0932w(0);
    }

    public C0932w() {
    }

    public static void b(AbstractC0923q abstractC0923q, S0 s02, int i7, Object obj) {
        if (s02 == S0.f12149d) {
            abstractC0923q.K0(i7, 3);
            ((AbstractC0891a) obj).e(abstractC0923q);
            abstractC0923q.K0(i7, 4);
            return;
        }
        abstractC0923q.K0(i7, s02.f12153b);
        switch (s02.ordinal()) {
            case 0:
                abstractC0923q.D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC0923q.B0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC0923q.O0(((Long) obj).longValue());
                break;
            case 3:
                abstractC0923q.O0(((Long) obj).longValue());
                break;
            case 4:
                abstractC0923q.F0(((Integer) obj).intValue());
                break;
            case 5:
                abstractC0923q.D0(((Long) obj).longValue());
                break;
            case 6:
                abstractC0923q.B0(((Integer) obj).intValue());
                break;
            case 7:
                abstractC0923q.v0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC0911k)) {
                    abstractC0923q.J0((String) obj);
                    break;
                } else {
                    abstractC0923q.z0((AbstractC0911k) obj);
                    break;
                }
            case 9:
                ((AbstractC0891a) obj).e(abstractC0923q);
                break;
            case 10:
                abstractC0923q.H0((AbstractC0891a) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0911k)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC0923q.x0(bArr.length, bArr);
                    break;
                } else {
                    abstractC0923q.z0((AbstractC0911k) obj);
                    break;
                }
            case 12:
                abstractC0923q.M0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof H)) {
                    abstractC0923q.F0(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC0923q.F0(((H) obj).a());
                    break;
                }
            case 14:
                abstractC0923q.B0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0923q.D0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                abstractC0923q.M0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                abstractC0923q.O0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        C0929t0 c0929t0;
        if (this.f12285b) {
            return;
        }
        int i7 = 0;
        while (true) {
            c0929t0 = this.f12284a;
            if (i7 >= c0929t0.f12276b.size()) {
                break;
            }
            Map.Entry c3 = c0929t0.c(i7);
            if (c3.getValue() instanceof C) {
                C c4 = (C) c3.getValue();
                c4.getClass();
                C0916m0 c0916m0 = C0916m0.f12232c;
                c0916m0.getClass();
                c0916m0.a(c4.getClass()).b(c4);
                c4.o();
            }
            i7++;
        }
        if (!c0929t0.f12278d) {
            if (c0929t0.f12276b.size() > 0) {
                c0929t0.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c0929t0.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c0929t0.f12278d) {
            c0929t0.f12277c = c0929t0.f12277c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0929t0.f12277c);
            c0929t0.f12280f = c0929t0.f12280f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c0929t0.f12280f);
            c0929t0.f12278d = true;
        }
        this.f12285b = true;
    }

    public final Object clone() {
        C0932w c0932w = new C0932w();
        C0929t0 c0929t0 = this.f12284a;
        if (c0929t0.f12276b.size() > 0) {
            Map.Entry c3 = c0929t0.c(0);
            if (c3.getKey() != null) {
                throw new ClassCastException();
            }
            c3.getValue();
            throw null;
        }
        Iterator it = c0929t0.d().iterator();
        if (!it.hasNext()) {
            return c0932w;
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
        if (obj instanceof C0932w) {
            return this.f12284a.equals(((C0932w) obj).f12284a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12284a.hashCode();
    }

    public C0932w(int i7) {
        a();
        a();
    }
}
