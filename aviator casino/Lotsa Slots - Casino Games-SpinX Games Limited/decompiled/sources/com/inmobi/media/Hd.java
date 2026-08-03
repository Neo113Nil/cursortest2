package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hd extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4744a;
    public final /* synthetic */ com.inmobi.media.A6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hd(com.inmobi.media.A6 a6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = a6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Hd(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Hd(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4744a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.A6 a6 = this.b;
        this.f4744a = 1;
        java.lang.Object a2 = a6.a(this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
