package com.payair.csdk;

/* loaded from: classes10.dex */
public final class a2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4227a;
    public final /* synthetic */ com.payair.logic.managers.PaymentImpl b;
    public final /* synthetic */ java.util.List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.payair.logic.managers.PaymentImpl paymentImpl, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = paymentImpl;
        this.c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.a2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.a2(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4227a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hceSDKInterface = this.b.f4446a;
            java.util.List<java.lang.String> list = this.c;
            this.f4227a = 1;
            if (hceSDKInterface.queueUpTokensForReplenishAndProcessFirst(list, this) == coroutine_suspended) {
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
