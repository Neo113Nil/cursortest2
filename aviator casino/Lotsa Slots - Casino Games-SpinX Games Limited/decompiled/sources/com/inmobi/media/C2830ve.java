package com.inmobi.media;

/* renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2830ve extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5509a;
    public final /* synthetic */ com.inmobi.media.Be b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2830ve(com.inmobi.media.Be be, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = be;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2830ve(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2830ve(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5509a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.InterfaceC2772t9 l = this.b.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            kotlinx.coroutines.flow.Flow b = ((com.inmobi.media.C2617nd) this.b.b.j.getValue()).b();
            com.inmobi.media.C2804ue c2804ue = new com.inmobi.media.C2804ue(null);
            this.f5509a = 1;
            if (kotlinx.coroutines.flow.FlowKt.first(b, c2804ue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.b.m();
        ((com.inmobi.media.C2617nd) this.b.b.j.getValue()).a();
        return kotlin.Unit.INSTANCE;
    }
}
