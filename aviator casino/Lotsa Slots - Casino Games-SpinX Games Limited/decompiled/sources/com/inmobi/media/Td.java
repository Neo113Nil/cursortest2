package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Td extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4975a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Wd c;
    public final /* synthetic */ com.inmobi.media.C2275ae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Td(com.inmobi.media.Wd wd, kotlin.coroutines.Continuation continuation, com.inmobi.media.C2275ae c2275ae) {
        super(2, continuation);
        this.c = wd;
        this.d = c2275ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Td td = new com.inmobi.media.Td(this.c, continuation, this.d);
        td.b = obj;
        return td;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Td) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4975a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            com.inmobi.media.Wd wd = this.c;
            com.inmobi.media.Sd sd = new com.inmobi.media.Sd(coroutineScope, this.d);
            this.f4975a = 1;
            if (wd.collect(sd, this) == coroutine_suspended) {
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
