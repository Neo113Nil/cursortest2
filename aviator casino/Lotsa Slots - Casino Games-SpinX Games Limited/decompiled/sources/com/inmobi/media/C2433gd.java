package com.inmobi.media;

/* renamed from: com.inmobi.media.gd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2433gd extends com.inmobi.media.S6 {
    public final com.inmobi.media.C2867x f;
    public final com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse g;
    public final com.inmobi.media.AbstractC2735s1 h;
    public final com.inmobi.media.Pc i;
    public final com.inmobi.media.Ic j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2433gd(com.inmobi.media.C2867x adComponent, com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse inMobiJsonResponse, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Pc nativeCallback, com.inmobi.media.Ic stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adComponent;
        this.g = inMobiJsonResponse;
        this.h = adUnitTimeout;
        this.i = nativeCallback;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        com.inmobi.media.InterfaceC2772t9 l2 = l();
        if (l2 != null) {
            ((com.inmobi.media.C2799u9) l2).a("AUM-FetchedState", "Initialize Called");
        }
        this.c.getClass();
        com.inmobi.media.C2867x c2867x = this.f5559a;
        com.inmobi.media.C2576m0 c2576m0 = c2867x.f5538a.f;
        com.inmobi.media.G adContext = c2867x.b;
        c2576m0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContext, "adContext");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2576m0.f5324a, null, null, new com.inmobi.media.C2472i0(adContext, c2576m0, null), 3, null);
        com.inmobi.media.T4.a(k(), new com.inmobi.media.R6(this, null));
    }
}
