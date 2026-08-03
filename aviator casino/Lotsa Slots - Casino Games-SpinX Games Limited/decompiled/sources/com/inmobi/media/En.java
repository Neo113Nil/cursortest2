package com.inmobi.media;

/* loaded from: classes5.dex */
public final class En extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4692a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2599mn c;
    public final /* synthetic */ com.inmobi.media.Gn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public En(com.inmobi.media.C2599mn c2599mn, kotlin.coroutines.Continuation continuation, com.inmobi.media.Gn gn) {
        super(2, continuation);
        this.c = c2599mn;
        this.d = gn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.En en = new com.inmobi.media.En(this.c, continuation, this.d);
        en.b = obj;
        return en;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.En) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4692a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            com.inmobi.media.C2599mn c2599mn = this.c;
            com.inmobi.media.Dn dn = new com.inmobi.media.Dn(coroutineScope, this.d);
            this.f4692a = 1;
            if (c2599mn.collect(dn, this) == coroutine_suspended) {
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
