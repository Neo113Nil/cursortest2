package com.inmobi.media;

/* renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2510jd extends com.inmobi.media.V6 {
    public final com.inmobi.media.C2631o1 o;
    public final com.inmobi.media.AbstractC2735s1 p;
    public final com.inmobi.media.Pc q;
    public final com.inmobi.media.Ic r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2510jd(com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Ic stateMachine, com.inmobi.media.Pc nativeCallback) {
        super(adManagerComponent, adUnitTimeout, stateMachine, nativeCallback);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.o = adManagerComponent;
        this.p = adUnitTimeout;
        this.q = nativeCallback;
        this.r = stateMachine;
    }

    @Override // com.inmobi.media.V6
    public final void a(com.inmobi.media.ads.network.common.model.AdResponse obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "adResponse");
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
            c2799u9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + com.inmobi.media.AbstractC2773ta.a(obj, com.inmobi.media.ads.network.common.model.AdResponse.class));
        }
        com.inmobi.media.S0.a(this.o, obj, new com.inmobi.media.C2459hd(this), new com.inmobi.media.C2485id(this));
    }
}
