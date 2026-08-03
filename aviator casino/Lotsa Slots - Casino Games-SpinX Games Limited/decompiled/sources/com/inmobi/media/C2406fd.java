package com.inmobi.media;

/* renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2406fd implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2392f {

    /* renamed from: a, reason: collision with root package name */
    public final short f5198a;
    public final com.inmobi.ads.InMobiAdRequestStatus b;
    public final com.inmobi.media.Mc c;
    public final com.inmobi.media.Rc d;

    public C2406fd(short s, com.inmobi.ads.InMobiAdRequestStatus status, com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.Rc stateMachine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f5198a = s;
        this.b = status;
        this.c = nativeAdUnitComponent;
        this.d = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.c.f4836a.f5538a.c;
        if (c2799u9 != null) {
            c2799u9.a("NativeFailedState", "Initialize Called");
        }
        this.c.c.a(this.b, this.f5198a);
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC2392f
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2799u9 c2799u9 = this.c.f4836a.f5538a.c;
        if (c2799u9 != null) {
            c2799u9.a("NativeFailedState", "onDestroy");
        }
        java.lang.Object a2 = this.d.a(new com.inmobi.media.C2354dd(), this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
