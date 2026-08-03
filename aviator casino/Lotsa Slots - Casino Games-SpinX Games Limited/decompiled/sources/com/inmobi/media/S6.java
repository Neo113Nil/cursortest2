package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class S6 extends com.inmobi.media.AbstractC2892y implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2560la, com.inmobi.media.InterfaceC2419g {
    public final com.inmobi.media.C2867x b;
    public final com.inmobi.media.AbstractC2735s1 c;
    public final com.inmobi.media.Pc d;
    public final com.inmobi.media.Ic e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S6(com.inmobi.media.C2867x adComponent, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Pc publisherCallbacks, com.inmobi.media.Ic stateMachine) {
        super(adComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adComponent;
        this.c = adUnitTimeout;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC2560la
    public final void e() {
        com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus = new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.e.a(new com.inmobi.media.C2615nb(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 2138)), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-FetchedState", "onDestroy Called");
        }
        this.e.a(new com.inmobi.media.C2821v5(null, this.c, this.b), this);
    }
}
