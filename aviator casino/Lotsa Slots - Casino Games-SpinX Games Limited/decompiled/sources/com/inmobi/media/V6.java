package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class V6 extends com.inmobi.media.AbstractC2366e0 implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2560la, com.inmobi.media.InterfaceC2419g {
    public final com.inmobi.media.C2631o1 h;
    public final com.inmobi.media.Ic i;
    public final com.inmobi.media.AbstractC2735s1 j;
    public final com.inmobi.media.Pc k;
    public final kotlinx.coroutines.CoroutineScope l;
    public final com.inmobi.media.C2828vc m;
    public final com.inmobi.media.Z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6(com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Ic stateMachine, com.inmobi.media.Pc publisherCallbacks) {
        super(adManagerComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        this.h = adManagerComponent;
        this.i = stateMachine;
        this.j = adUnitTimeout;
        this.k = publisherCallbacks;
        this.l = com.inmobi.media.T4.a(this.b);
        com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.MediationConfig X = this.c.getTimeouts().X();
        java.lang.String str = this.d.g;
        this.f5166a.getClass();
        com.inmobi.media.C2828vc a2 = com.inmobi.media.AbstractC2802uc.a(X, str, "native", com.inmobi.media.Yi.b);
        this.m = a2;
        this.n = new com.inmobi.media.Z(adManagerComponent, a2);
    }

    public final void a(com.inmobi.media.Y y) {
        com.inmobi.media.V v = y.b;
        com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = y.f5055a;
        java.util.Objects.toString(v);
        java.util.Objects.toString(inMobiAdRequestStatus);
        com.inmobi.media.V v2 = y.b;
        if (v2 instanceof com.inmobi.media.C2360dj) {
            com.inmobi.media.C2576m0 c2576m0 = this.g;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2576m0.f5324a, null, null, new com.inmobi.media.C2550l0(c2576m0, null), 3, null);
            a(y.f5055a, ((com.inmobi.media.C2360dj) y.b).f5163a);
            return;
        }
        if (v2 instanceof com.inmobi.media.N6) {
            a(y.f5055a, ((com.inmobi.media.N6) v2).f4848a);
        } else if (v2 instanceof com.inmobi.media.O6) {
            a(y.f5055a, (short) ((com.inmobi.media.O6) v2).f4870a);
        } else {
            if (!(v2 instanceof com.inmobi.media.C2306bj)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            a(((com.inmobi.media.C2306bj) v2).f5127a, y.f5055a);
        }
    }

    public abstract void a(com.inmobi.media.ads.network.common.model.AdResponse adResponse);

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
        com.inmobi.media.J3.a(this.l);
    }

    @Override // com.inmobi.media.InterfaceC2560la
    public final void e() {
        a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        this.i.a(new com.inmobi.media.C2821v5(this.h), this);
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.a("AUM-FetchingState", "Initialize Called");
        }
        com.inmobi.media.Qk.b();
        this.j.b();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new com.inmobi.media.U6(this, null), 3, null);
    }

    public final void a(java.util.Map map, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.i.a(new com.inmobi.media.Q6(map, inMobiAdRequestStatus, this.j, this.h, this.k, this.i), this);
    }

    public final void a(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        a(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf(s))), inMobiAdRequestStatus);
    }
}
