package com.inmobi.media;

/* renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2882xe extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5550a;
    public final /* synthetic */ com.inmobi.media.Be b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2882xe(com.inmobi.media.Be be, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = be;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2882xe(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2882xe(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5550a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.InterfaceC2772t9 l = this.b.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            kotlinx.coroutines.flow.Flow b = ((com.inmobi.media.Nd) this.b.b.k.getValue()).f4855a.b();
            com.inmobi.media.C2856we c2856we = new com.inmobi.media.C2856we(null);
            this.f5550a = 1;
            if (kotlinx.coroutines.flow.FlowKt.first(b, c2856we, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.inmobi.media.InterfaceC2772t9 l2 = this.b.l();
        if (l2 != null) {
            ((com.inmobi.media.C2799u9) l2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        com.inmobi.media.Ce ce = this.b.b;
        ce.b.d = true;
        java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(((com.inmobi.media.Lc) ce.g.f.getValue()).f4817a);
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("MRCViewable50Rendered", a2, com.inmobi.media.EnumC2728rk.f5431a);
        this.b.b.f.b.g.a(com.inmobi.media.C2302bf.f5123a);
        ((com.inmobi.media.Nd) this.b.b.k.getValue()).f4855a.a();
        return kotlin.Unit.INSTANCE;
    }
}
