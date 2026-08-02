package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class UD {

    /* renamed from: a, reason: collision with root package name */
    public final long f11750a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11751b;

    /* renamed from: c, reason: collision with root package name */
    public long f11752c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f11753d = -9223372036854775807L;
    public long f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f11755g = -9223372036854775807L;
    public float i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f11757j = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f11754e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f11756h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f11758k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f11759l = -9223372036854775807L;

    public /* synthetic */ UD(long j5, long j6) {
        this.f11750a = j5;
        this.f11751b = j6;
    }

    public final long a() {
        return this.f11756h;
    }

    public final void b() {
        long j5 = this.f11756h;
        if (j5 == -9223372036854775807L) {
            return;
        }
        long j6 = j5 + this.f11751b;
        this.f11756h = j6;
        long j7 = this.f11755g;
        if (j7 != -9223372036854775807L && j6 > j7) {
            this.f11756h = j7;
        }
        this.f11757j = -9223372036854775807L;
    }

    public final void c() {
        long j5;
        long j6 = this.f11752c;
        if (j6 != -9223372036854775807L) {
            j5 = this.f11753d;
            if (j5 == -9223372036854775807L) {
                long j7 = this.f;
                if (j7 != -9223372036854775807L && j6 < j7) {
                    j6 = j7;
                }
                j5 = this.f11755g;
                if (j5 == -9223372036854775807L || j6 <= j5) {
                    j5 = j6;
                }
            }
        } else {
            j5 = -9223372036854775807L;
        }
        if (this.f11754e == j5) {
            return;
        }
        this.f11754e = j5;
        this.f11756h = j5;
        this.f11758k = -9223372036854775807L;
        this.f11759l = -9223372036854775807L;
        this.f11757j = -9223372036854775807L;
    }
}
