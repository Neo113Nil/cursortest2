package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Kd extends com.inmobi.media.AbstractC2719rb {
    public final com.inmobi.media.C2867x f;
    public final com.inmobi.media.AbstractC2735s1 g;
    public final com.inmobi.media.Pc h;
    public final com.inmobi.media.Ic i;
    public final com.inmobi.media.Nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kd(com.inmobi.media.C2867x adComponent, com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse inMobiJsonResponse, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Pc nativeCallback, com.inmobi.media.Ic stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f = adComponent;
        this.g = adUnitTimeout;
        this.h = nativeCallback;
        this.i = stateMachine;
        this.j = new com.inmobi.media.Nc(new com.inmobi.media.Mc(adComponent, inMobiJsonResponse, stateMachine));
    }

    public final void a(com.inmobi.media.C2511je pubData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubData, "pubData");
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + pubData);
        }
        this.i.a(new com.inmobi.media.C2881xd(pubData, this.f, this.j, this.g, this.h, this.i), this);
    }
}
