package com.inmobi.media;

/* renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2554l4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5308a;
    public final /* synthetic */ com.inmobi.media.C2580m4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2554l4(com.inmobi.media.C2580m4 c2580m4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2580m4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2554l4(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2554l4(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5308a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.C2580m4 c2580m4 = this.b;
            this.f5308a = 1;
            java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.flow(new com.inmobi.media.Dh(new com.inmobi.media.Eh((com.inmobi.media.C2370e4) c2580m4.b.b.getValue()), null)).collect(new com.inmobi.media.C2476i4(c2580m4), this);
            if (collect != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                collect = kotlin.Unit.INSTANCE;
            }
            if (collect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
