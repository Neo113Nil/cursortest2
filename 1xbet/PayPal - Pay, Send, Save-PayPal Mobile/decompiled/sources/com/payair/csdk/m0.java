package com.payair.csdk;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.Ref.BooleanRef f4282a;
    public int b;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef c;
    public final /* synthetic */ com.payair.logic.managers.DefaultTokenRefreshManager d;
    public final /* synthetic */ java.util.Set e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlin.jvm.internal.Ref.BooleanRef booleanRef, com.payair.logic.managers.DefaultTokenRefreshManager defaultTokenRefreshManager, java.util.Set set, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = booleanRef;
        this.d = defaultTokenRefreshManager;
        this.e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.m0(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.m0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.TokenManager tokenManager;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = this.c;
            tokenManager = this.d.f4445a;
            java.util.Set<com.payair.model.NetworkTokenReference> set = this.e;
            this.f4282a = booleanRef2;
            this.b = 1;
            java.lang.Object refreshTokens = tokenManager.refreshTokens(set, this);
            if (refreshTokens == coroutine_suspended) {
                return coroutine_suspended;
            }
            booleanRef = booleanRef2;
            obj = refreshTokens;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = this.f4282a;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        booleanRef.element = ((java.lang.Boolean) obj).booleanValue();
        return kotlin.Unit.INSTANCE;
    }
}
