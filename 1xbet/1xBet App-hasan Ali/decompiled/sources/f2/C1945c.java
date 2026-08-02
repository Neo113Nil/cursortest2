package f2;

import android.os.Build;
import u.AbstractC2462i;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1945c {
    public static final C1945c i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16983b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16984c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16985d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16986e;

    /* renamed from: a, reason: collision with root package name */
    public int f16982a = 1;
    public long f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f16987g = -1;

    /* renamed from: h, reason: collision with root package name */
    public C1947e f16988h = new C1947e();

    static {
        C1947e c1947e = new C1947e();
        C1945c c1945c = new C1945c();
        c1945c.f16982a = 1;
        c1945c.f = -1L;
        c1945c.f16987g = -1L;
        c1945c.f16988h = new C1947e();
        c1945c.f16983b = false;
        int i5 = Build.VERSION.SDK_INT;
        c1945c.f16984c = false;
        c1945c.f16982a = 1;
        c1945c.f16985d = false;
        c1945c.f16986e = false;
        if (i5 >= 24) {
            c1945c.f16988h = c1947e;
            c1945c.f = -1L;
            c1945c.f16987g = -1L;
        }
        i = c1945c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1945c.class != obj.getClass()) {
            return false;
        }
        C1945c c1945c = (C1945c) obj;
        if (this.f16983b == c1945c.f16983b && this.f16984c == c1945c.f16984c && this.f16985d == c1945c.f16985d && this.f16986e == c1945c.f16986e && this.f == c1945c.f && this.f16987g == c1945c.f16987g && this.f16982a == c1945c.f16982a) {
            return this.f16988h.equals(c1945c.f16988h);
        }
        return false;
    }

    public final int hashCode() {
        int b3 = ((((((((AbstractC2462i.b(this.f16982a) * 31) + (this.f16983b ? 1 : 0)) * 31) + (this.f16984c ? 1 : 0)) * 31) + (this.f16985d ? 1 : 0)) * 31) + (this.f16986e ? 1 : 0)) * 31;
        long j5 = this.f;
        int i5 = (b3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f16987g;
        return this.f16988h.f16991a.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }
}
