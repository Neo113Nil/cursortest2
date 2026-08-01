package com.ironsource;

import com.ironsource.InterfaceC4527m4;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ra {

    /* renamed from: a, reason: collision with root package name */
    public static final Ra f7875a = new Ra();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f7876a;
        private final long b;
        private final long c;

        public a(boolean z, long j, long j2) {
            this.f7876a = z;
            this.b = j;
            this.c = j2;
        }

        public final boolean a() {
            return this.f7876a;
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7876a == aVar.f7876a && this.b == aVar.b && this.c == aVar.c;
        }

        public final boolean f() {
            return this.f7876a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.f7876a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f7876a + ", refreshInterval=" + this.b + ", visibilityCheckerInterval=" + this.c + ")";
        }

        public final a a(boolean z, long j, long j2) {
            return new a(z, j, j2);
        }

        public static /* synthetic */ a a(a aVar, boolean z, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f7876a;
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

    private Ra() {
    }

    public static /* synthetic */ InterfaceC4730xa a(Ra ra, C4577p0 c4577p0, U2 u2, a aVar, InterfaceC4748ya interfaceC4748ya, L2 l2, InterfaceC4527m4 interfaceC4527m4, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC4527m4 = new InterfaceC4527m4.a();
        }
        return ra.a(c4577p0, u2, aVar, interfaceC4748ya, l2, interfaceC4527m4);
    }

    public final InterfaceC4730xa a(C4577p0 adTools, U2 bannerContainer, a config, InterfaceC4748ya strategyListener, L2 bannerAdUnitFactory, InterfaceC4527m4 timeProvider) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + config.f() + ", refreshInterval: " + config.d());
        if (config.f()) {
            return new Ba(adTools, bannerContainer, config.d(), config.e(), strategyListener, bannerAdUnitFactory, null, timeProvider, Ib.v.d().h().z(), 64, null);
        }
        La la = new La(adTools, bannerContainer, bannerAdUnitFactory);
        la.a(strategyListener);
        return la;
    }
}
