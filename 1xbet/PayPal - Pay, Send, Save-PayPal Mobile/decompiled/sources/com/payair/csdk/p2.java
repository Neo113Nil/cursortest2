package com.payair.csdk;

/* loaded from: classes10.dex */
public final class p2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4299a;
    public final /* synthetic */ com.payair.logic.managers.SetupManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.payair.logic.managers.SetupManagerImpl setupManagerImpl, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = setupManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.p2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.p2(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.PushManager pushManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4299a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        pushManager = this.b.c;
        this.f4299a = 1;
        java.lang.Object generateCSDKPushToken = pushManager.generateCSDKPushToken(this);
        return generateCSDKPushToken == coroutine_suspended ? coroutine_suspended : generateCSDKPushToken;
    }
}
