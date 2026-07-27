package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4404f6 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f8192a;
    private final int b;
    private final boolean c;
    private final long d;
    private final List<C4518ld> e;
    private final C4576p f;
    private final int g;
    private final Integer h;

    /* JADX WARN: Multi-variable type inference failed */
    public C4404f6(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C4518ld> placements, C4576p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        this.f8192a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = i2;
        this.h = num;
    }

    public final Map<String, List<String>> a() {
        return this.f8192a;
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
        if (!(obj instanceof C4404f6)) {
            return false;
        }
        C4404f6 c4404f6 = (C4404f6) obj;
        return Intrinsics.areEqual(this.f8192a, c4404f6.f8192a) && this.b == c4404f6.b && this.c == c4404f6.c && this.d == c4404f6.d && Intrinsics.areEqual(this.e, c4404f6.e) && Intrinsics.areEqual(this.f, c4404f6.f) && this.g == c4404f6.g && Intrinsics.areEqual(this.h, c4404f6.h);
    }

    public final C4576p f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final Integer h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f8192a.hashCode() * 31) + Integer.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((((hashCode + i) * 31) + Long.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.g)) * 31;
        Integer num = this.h;
        return hashCode2 + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.c;
    }

    public final C4576p k() {
        return this.f;
    }

    public final long l() {
        return this.d;
    }

    public final Integer m() {
        return this.h;
    }

    public final int n() {
        return this.b;
    }

    public final List<C4518ld> o() {
        return this.e;
    }

    public final Map<String, List<String>> p() {
        return this.f8192a;
    }

    public String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.f8192a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutSecs=" + this.g + ", expiredDurationMins=" + this.h + ")";
    }

    public final C4404f6 a(Map<String, ? extends List<String>> providerOrder, int i, boolean z, long j, List<C4518ld> placements, C4576p auction, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        Intrinsics.checkNotNullParameter(placements, "placements");
        Intrinsics.checkNotNullParameter(auction, "auction");
        return new C4404f6(providerOrder, i, z, j, placements, auction, i2, num);
    }
}
