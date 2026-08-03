package com.ironsource;

/* loaded from: classes5.dex */
public final class Ta {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Ta f5983a = new com.ironsource.Ta();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f5984a;
        private final long b;
        private final long c;

        public a(boolean z, long j, long j2) {
            this.f5984a = z;
            this.b = j;
            this.c = j2;
        }

        public final boolean a() {
            return this.f5984a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.b;
        }

        public final long e() {
            return this.c;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.ironsource.Ta.a)) {
                return false;
            }
            com.ironsource.Ta.a aVar = (com.ironsource.Ta.a) obj;
            return this.f5984a == aVar.f5984a && this.b == aVar.b && this.c == aVar.c;
        }

        public final boolean f() {
            return this.f5984a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.f5984a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c);
        }

        public java.lang.String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f5984a + ", refreshInterval=" + this.b + ", visibilityCheckerInterval=" + this.c + ")";
        }

        public final com.ironsource.Ta.a a(boolean z, long j, long j2) {
            return new com.ironsource.Ta.a(z, j, j2);
        }

        public static /* synthetic */ com.ironsource.Ta.a a(com.ironsource.Ta.a aVar, boolean z, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f5984a;
            }
            if ((i & 2) != 0) {
                j = aVar.b;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = aVar.c;
            }
            return aVar.a(z, j3, j2);
        }
    }

    private Ta() {
    }

    public final com.ironsource.InterfaceC3365xa a(com.ironsource.C3212p0 adTools, com.ironsource.W2 bannerContainer, com.ironsource.Ta.a config, com.ironsource.J2 bannerAdProperties, com.ironsource.InterfaceC3383ya strategyListener, com.ironsource.N2 bannerAdUnitFactory, com.ironsource.InterfaceC3216p4 timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + config.f() + ", refreshInterval: " + config.d());
        if (config.f()) {
            return new com.ironsource.Ba(adTools, bannerContainer, config.d(), config.e(), bannerAdProperties, strategyListener, bannerAdUnitFactory, null, timeProvider, com.ironsource.Jb.u.d().h().y(), 128, null);
        }
        com.ironsource.Na na = new com.ironsource.Na(adTools, bannerContainer, bannerAdUnitFactory);
        na.a(strategyListener);
        return na;
    }
}
