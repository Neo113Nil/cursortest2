package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785xa {

    /* renamed from: a, reason: collision with root package name */
    public Integer f16288a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16289b;

    /* renamed from: c, reason: collision with root package name */
    public int f16290c;

    /* renamed from: d, reason: collision with root package name */
    public long f16291d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16292e;
    public C0832c6 f = C0832c6.f12972b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final long a(int i, int i5) {
        C0736a a5 = this.f.a(i);
        if (a5.f12549a != -1) {
            return a5.f12553e[i5];
        }
        return -9223372036854775807L;
    }

    public final void b(Integer num, Object obj, int i, long j5, boolean z3) {
        C0832c6 c0832c6 = C0832c6.f12972b;
        this.f16288a = num;
        this.f16289b = obj;
        this.f16290c = i;
        this.f16291d = j5;
        this.f = c0832c6;
        this.f16292e = z3;
    }

    public final void c(int i) {
        this.f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1785xa.class.equals(obj.getClass())) {
            return false;
        }
        C1785xa c1785xa = (C1785xa) obj;
        return Objects.equals(this.f16288a, c1785xa.f16288a) && Objects.equals(this.f16289b, c1785xa.f16289b) && this.f16290c == c1785xa.f16290c && this.f16291d == c1785xa.f16291d && this.f16292e == c1785xa.f16292e && Objects.equals(this.f, c1785xa.f);
    }

    public final int hashCode() {
        Integer num = this.f16288a;
        int hashCode = num == null ? 0 : num.hashCode();
        Object obj = this.f16289b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.f16290c;
        long j5 = this.f16291d;
        return this.f.hashCode() + (((((hashCode2 * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 961) + (this.f16292e ? 1 : 0)) * 31);
    }
}
