package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603Ha {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f9395m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Q3 f9396n;

    /* renamed from: a, reason: collision with root package name */
    public Object f9397a = f9395m;

    /* renamed from: b, reason: collision with root package name */
    public Q3 f9398b = f9396n;

    /* renamed from: c, reason: collision with root package name */
    public long f9399c;

    /* renamed from: d, reason: collision with root package name */
    public long f9400d;

    /* renamed from: e, reason: collision with root package name */
    public long f9401e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9402g;

    /* renamed from: h, reason: collision with root package name */
    public C1052h2 f9403h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f9404j;

    /* renamed from: k, reason: collision with root package name */
    public int f9405k;

    /* renamed from: l, reason: collision with root package name */
    public int f9406l;

    static {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        C1761wv c1761wv = C1761wv.f16184o;
        List list = Collections.EMPTY_LIST;
        C1761wv c1761wv2 = C1761wv.f16184o;
        C0918e3 c0918e3 = C0918e3.f13233a;
        Uri uri = Uri.EMPTY;
        f9396n = new Q3("androidx.media3.common.Timeline", new C1184k1(), uri != null ? new C1859z2(uri, c1761wv2) : null, new C1052h2(), P4.f11040z);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(Q3 q32, boolean z3, boolean z5, C1052h2 c1052h2, long j5) {
        this.f9397a = f9395m;
        if (q32 == null) {
            q32 = f9396n;
        }
        this.f9398b = q32;
        this.f9399c = -9223372036854775807L;
        this.f9400d = -9223372036854775807L;
        this.f9401e = -9223372036854775807L;
        this.f = z3;
        this.f9402g = z5;
        this.f9403h = c1052h2;
        this.f9404j = j5;
        this.f9405k = 0;
        this.f9406l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.f9403h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0603Ha.class.equals(obj.getClass())) {
            return false;
        }
        C0603Ha c0603Ha = (C0603Ha) obj;
        return Objects.equals(this.f9397a, c0603Ha.f9397a) && Objects.equals(this.f9398b, c0603Ha.f9398b) && Objects.equals(this.f9403h, c0603Ha.f9403h) && this.f9399c == c0603Ha.f9399c && this.f9400d == c0603Ha.f9400d && this.f9401e == c0603Ha.f9401e && this.f == c0603Ha.f && this.f9402g == c0603Ha.f9402g && this.i == c0603Ha.i && this.f9404j == c0603Ha.f9404j && this.f9405k == c0603Ha.f9405k && this.f9406l == c0603Ha.f9406l;
    }

    public final int hashCode() {
        int hashCode = ((this.f9397a.hashCode() + 217) * 31) + this.f9398b.hashCode();
        C1052h2 c1052h2 = this.f9403h;
        int hashCode2 = ((hashCode * 961) + (c1052h2 == null ? 0 : c1052h2.hashCode())) * 31;
        long j5 = this.f9399c;
        int i = (hashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f9400d;
        int i5 = (i + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f9401e;
        int i6 = ((((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.f9402g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j8 = this.f9404j;
        return ((((((i6 * 961) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f9405k) * 31) + this.f9406l) * 31;
    }
}
