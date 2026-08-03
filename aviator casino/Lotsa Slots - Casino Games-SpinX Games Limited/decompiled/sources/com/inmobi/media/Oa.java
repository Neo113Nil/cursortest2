package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Oa extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4873a;
    public final /* synthetic */ com.inmobi.media.Sa b;
    public final /* synthetic */ com.inmobi.media.M2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(com.inmobi.media.Sa sa, com.inmobi.media.M2 m2, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = sa;
        this.c = m2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Oa(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new com.inmobi.media.Oa(this.b, this.c, (kotlin.coroutines.Continuation) obj).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4873a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Sa sa = this.b;
            com.inmobi.media.M2 m2 = this.c;
            this.f4873a = 1;
            if (com.inmobi.media.Sa.a(sa, m2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.b.a();
        return kotlin.Unit.INSTANCE;
    }
}
