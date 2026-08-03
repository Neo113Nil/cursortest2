package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Q6 extends com.inmobi.media.AbstractC2552l2 {
    public final java.util.Map d;
    public final com.inmobi.ads.InMobiAdRequestStatus e;
    public final com.inmobi.media.Pc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(java.util.Map payload, com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.Pc publisherCallbacks, com.inmobi.media.Ic stateMachine) {
        super(adUnitTimeout, adManagerComponent, stateMachine);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "inMobiAdRequestStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = payload;
        this.e = inMobiAdRequestStatus;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 c = this.b.c();
        if (c != null) {
            ((com.inmobi.media.C2799u9) c).b("AUM-FetchFailedState", "Initialized Called : " + this.d + io.ktor.sse.ServerSentEventKt.SPACE + this.e.getStatusCode() + io.ktor.sse.ServerSentEventKt.SPACE + this.e.getMessage());
        }
        com.inmobi.media.T4.a(this.b.a(), new com.inmobi.media.P6(this, null));
        com.inmobi.media.C2576m0 b = this.b.b();
        java.util.Map payload = this.d;
        b.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(b.f5324a, null, null, new com.inmobi.media.C2497j0(b, payload, null), 3, null);
        com.inmobi.media.AbstractC2735s1 abstractC2735s1 = this.f5306a;
        if (abstractC2735s1 != null) {
            abstractC2735s1.a();
        }
        j();
    }
}
