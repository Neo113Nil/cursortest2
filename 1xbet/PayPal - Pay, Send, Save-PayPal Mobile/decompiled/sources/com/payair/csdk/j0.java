package com.payair.csdk;

/* loaded from: classes4.dex */
public final class j0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4267a;
    public final /* synthetic */ com.payair.listener.DefaultHceEventListenerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.payair.listener.DefaultHceEventListenerImpl defaultHceEventListenerImpl, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = defaultHceEventListenerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.j0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.j0(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4267a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hceSDKInterface = this.b.f4389a;
            this.f4267a = 1;
            if (hceSDKInterface.replenishNextToken(this) == coroutine_suspended) {
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
