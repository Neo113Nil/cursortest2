package com.inmobi.media;

/* renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2829vd extends com.inmobi.media.AbstractC2694qb {
    public final com.inmobi.media.C2631o1 o;
    public final com.inmobi.media.AbstractC2735s1 p;
    public final com.inmobi.media.Pc q;
    public final com.inmobi.media.Ic r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2829vd(byte[] bArr, com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Pc nativeCallback, com.inmobi.media.Ic stateMachine) {
        super(bArr, adManagerComponent, adUnitTimeout, nativeCallback, stateMachine);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.o = adManagerComponent;
        this.p = adUnitTimeout;
        this.q = nativeCallback;
        this.r = stateMachine;
    }

    @Override // com.inmobi.media.AbstractC2694qb
    public final void a(com.inmobi.media.ads.network.common.model.AdResponse obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "adResponse");
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
            c2799u9.a("AUM-NativeLoadResponseState", "onAdResponseParseSuccess - ad response received: " + com.inmobi.media.AbstractC2773ta.a(obj, com.inmobi.media.ads.network.common.model.AdResponse.class));
        }
        com.inmobi.media.S0.a(this.o, obj, new com.inmobi.media.C2776td(this), new com.inmobi.media.C2803ud(this));
    }
}
