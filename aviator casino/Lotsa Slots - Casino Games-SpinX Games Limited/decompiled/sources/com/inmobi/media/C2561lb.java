package com.inmobi.media;

/* renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2561lb extends com.inmobi.media.AbstractC2552l2 {
    public final short d;
    public final com.inmobi.ads.InMobiAdRequestStatus e;
    public final com.inmobi.media.Pc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2561lb(short s, com.inmobi.ads.InMobiAdRequestStatus status, com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.Pc publisherCallbacks, com.inmobi.media.Ic stateMachine) {
        super(null, adManagerComponent, stateMachine);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.d = s;
        this.e = status;
        this.f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 c = this.b.c();
        if (c != null) {
            short s = this.d;
            ((com.inmobi.media.C2799u9) c).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s) + io.ktor.sse.ServerSentEventKt.SPACE + this.e.getStatusCode() + io.ktor.sse.ServerSentEventKt.SPACE + this.e.getMessage());
        }
        com.inmobi.media.T4.a(this.b.a(), new com.inmobi.media.C2534kb(this, null));
        com.inmobi.media.C2576m0 b = this.b.b();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(b.f5324a, null, null, new com.inmobi.media.C2420g0(b, this.d, null), 3, null);
        com.inmobi.media.AbstractC2735s1 abstractC2735s1 = this.f5306a;
        if (abstractC2735s1 != null) {
            abstractC2735s1.a();
        }
        j();
    }
}
