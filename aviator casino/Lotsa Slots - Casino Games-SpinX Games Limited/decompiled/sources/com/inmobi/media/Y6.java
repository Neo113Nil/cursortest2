package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Y6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5059a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Z6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y6(com.inmobi.media.Z6 z6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = z6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Y6 y6 = new com.inmobi.media.Y6(this.c, continuation);
        y6.b = obj;
        return y6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Y6 y6 = new com.inmobi.media.Y6(this.c, (kotlin.coroutines.Continuation) obj2);
        y6.b = (kotlinx.coroutines.CoroutineScope) obj;
        return y6.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5059a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            com.inmobi.media.Z6 z6 = this.c;
            z6.d.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z6.b.getWindowVisibility() == 0));
            long j = this.c.c;
            this.b = coroutineScope;
            this.f5059a = 1;
            if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
