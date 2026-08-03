package com.inmobi.media;

/* renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2719rb extends com.inmobi.media.AbstractC2892y implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2560la, com.inmobi.media.InterfaceC2419g {
    public final com.inmobi.media.C2867x b;
    public final com.inmobi.media.AbstractC2735s1 c;
    public final com.inmobi.media.Pc d;
    public final com.inmobi.media.Ic e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2719rb(com.inmobi.media.C2867x adComponent, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Pc publisherCallbacks, com.inmobi.media.Ic stateMachine) {
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
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-LoadingState", "Initialize Called");
        }
        this.c.getClass();
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = ((com.inmobi.media.Kd) this).j.b.c;
        com.inmobi.media.C2327cd c2327cd = interfaceC2782tj instanceof com.inmobi.media.C2327cd ? (com.inmobi.media.C2327cd) interfaceC2782tj : null;
        if (c2327cd != null) {
            com.inmobi.media.C2799u9 c2799u9 = c2327cd.f5139a.f4836a.f5538a.c;
            if (c2799u9 != null) {
                c2799u9.a("NativeCreatedState", "Inflate Called");
            }
            c2327cd.b.a(new com.inmobi.media.Ld(c2327cd.f5139a, c2327cd.b), c2327cd);
        }
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC2560la
    public final void e() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), com.inmobi.media.Ze.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-LoadingState", "onDestroy");
        }
        this.e.a(new com.inmobi.media.C2821v5(((com.inmobi.media.Kd) this).j, this.c, this.b), this);
    }

    public final void a(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s));
        }
        this.e.a(new com.inmobi.media.C2615nb(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf(s))), inMobiAdRequestStatus, this.c, this.b, this.d, this.e), this);
    }
}
