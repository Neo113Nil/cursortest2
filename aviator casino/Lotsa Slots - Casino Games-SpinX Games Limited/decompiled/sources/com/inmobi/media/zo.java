package com.inmobi.media;

/* loaded from: classes5.dex */
public final class zo extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5599a;
    public final /* synthetic */ com.inmobi.media.InterfaceC2772t9 b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ kotlinx.coroutines.Deferred d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, java.lang.String str, kotlinx.coroutines.Deferred deferred, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = interfaceC2772t9;
        this.c = str;
        this.d = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.zo(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.zo) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5599a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("WebResourceHandler", "Waiting for response to finish download: " + this.c);
        }
        kotlinx.coroutines.Deferred deferred = this.d;
        this.f5599a = 1;
        java.lang.Object await = deferred.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }
}
