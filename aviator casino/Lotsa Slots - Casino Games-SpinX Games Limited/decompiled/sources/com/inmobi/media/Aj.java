package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Aj extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Tj f4605a;
    public int b;
    public final /* synthetic */ com.inmobi.media.Ej c;
    public final /* synthetic */ com.inmobi.media.Ii d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aj(com.inmobi.media.Ej ej, com.inmobi.media.Ii ii, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = ej;
        this.d = ii;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.Aj(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.Aj(this.c, this.d, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.inmobi.media.Tj tj = this.f4605a;
            kotlin.ResultKt.throwOnFailure(obj);
            return tj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.Tj tj2 = new com.inmobi.media.Tj(this.c.f4688a);
        com.inmobi.media.Ej ej = this.c;
        java.lang.String str = this.d.f4767a;
        this.f4605a = tj2;
        this.b = 1;
        return com.inmobi.media.Ej.a(ej, str, tj2, this) == coroutine_suspended ? coroutine_suspended : tj2;
    }
}
