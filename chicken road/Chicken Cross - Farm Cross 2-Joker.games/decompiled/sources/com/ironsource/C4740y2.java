package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4740y2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f8770a;
    private final int b;
    private final boolean c;
    private final long d;
    private final List<C4518ld> e;
    private final C4576p f;
    private final long g;
    private final int h;
    private final long i;

    /* JADX WARN: Multi-variable type inference failed */
    public C4740y2(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C4518ld> placements, C4576p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.f8770a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = j2;
        this.h = i2;
        this.i = j3;
    }

    public final Map<String, List<String>> a() {
        return this.f8770a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final List<C4518ld> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4740y2)) {
            return false;
        }
        C4740y2 c4740y2 = (C4740y2) obj;
        return Intrinsics.areEqual(this.f8770a, c4740y2.f8770a) && this.b == c4740y2.b && this.c == c4740y2.c && this.d == c4740y2.d && Intrinsics.areEqual(this.e, c4740y2.e) && Intrinsics.areEqual(this.f, c4740y2.f) && this.g == c4740y2.g && this.h == c4740y2.h && this.i == c4740y2.i;
    }

    public final C4576p f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f8770a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((hashCode + i) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.g)) * 31) + Integer.hashCode(this.h)) * 31) + Long.hashCode(this.i);
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.g;
    }

    public final boolean k() {
        return this.c;
    }

    public final C4576p l() {
        return this.f;
    }

    public final int m() {
        return this.h;
    }

    public final long n() {
        return this.d;
    }

    public final long o() {
        return this.i;
    }

    public final int p() {
        return this.b;
    }

    public final List<C4518ld> q() {
        return this.e;
    }

    public final Map<String, List<String>> r() {
        return this.f8770a;
    }

    public String toString() {
        return "BannerAdFormatConfig2(providerOrder=" + this.f8770a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutMillis=" + this.g + ", bannerInterval=" + this.h + ", impressionTimeout=" + this.i + ")";
    }

    public final C4740y2 a(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C4518ld> placements, C4576p auction, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new C4740y2(providerOrder, i, z, j, placements, auction, j2, i2, j3);
    }
}
