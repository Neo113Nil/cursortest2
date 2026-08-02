package com.payair.csdk;

/* loaded from: classes10.dex */
public final class t0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4315a;
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl b;
    public final /* synthetic */ java.util.Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.util.Set set, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = firebaseNotificationHandlerImpl;
        this.c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.t0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.t0(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.TokenManager tokenManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4315a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tokenManager = this.b.d;
            java.util.Set<com.payair.model.NetworkTokenReference> set = this.c;
            this.f4315a = 1;
            if (tokenManager.refreshTokens(set, this) == coroutine_suspended) {
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
