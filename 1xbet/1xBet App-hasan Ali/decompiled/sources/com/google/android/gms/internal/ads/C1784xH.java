package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784xH {

    /* renamed from: a, reason: collision with root package name */
    public long f16281a;

    /* renamed from: b, reason: collision with root package name */
    public long f16282b;

    /* renamed from: c, reason: collision with root package name */
    public long f16283c;

    /* renamed from: d, reason: collision with root package name */
    public long f16284d;

    /* renamed from: e, reason: collision with root package name */
    public long f16285e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f16286g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f16287h;

    public final void a(long j5) {
        long j6 = this.f16284d;
        if (j6 == 0) {
            this.f16281a = j5;
        } else if (j6 == 1) {
            long j7 = j5 - this.f16281a;
            this.f16282b = j7;
            this.f = j7;
            this.f16285e = 1L;
        } else {
            long j8 = j5 - this.f16283c;
            long abs = Math.abs(j8 - this.f16282b);
            int i = (int) (j6 % 15);
            boolean[] zArr = this.f16286g;
            if (abs <= 1000000) {
                this.f16285e++;
                this.f += j8;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f16287h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f16287h++;
            }
        }
        this.f16284d++;
        this.f16283c = j5;
    }

    public final void b() {
        this.f16284d = 0L;
        this.f16285e = 0L;
        this.f = 0L;
        this.f16287h = 0;
        Arrays.fill(this.f16286g, false);
    }

    public final boolean c() {
        return this.f16284d > 15 && this.f16287h == 0;
    }
}
