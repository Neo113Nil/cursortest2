package com.inmobi.media;

/* loaded from: classes5.dex */
public final class A9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4597a;
    public final /* synthetic */ com.inmobi.media.B9 b;
    public final /* synthetic */ com.inmobi.media.Ue c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A9(com.inmobi.media.B9 b9, com.inmobi.media.Ue ue, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = b9;
        this.c = ue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.A9(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.A9(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4597a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.B4 b4 = this.b.f4618a;
        com.inmobi.media.Ue ue = this.c;
        this.f4597a = 1;
        java.lang.Object a2 = b4.a(ue, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
