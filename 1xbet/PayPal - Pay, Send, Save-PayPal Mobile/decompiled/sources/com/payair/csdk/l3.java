package com.payair.csdk;

/* loaded from: classes4.dex */
public final class l3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4280a;
    public final /* synthetic */ com.payair.logic.managers.TokenListManagerSuspendImpl b;
    public final /* synthetic */ com.payair.db.token.TokenDetailsEntry c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl, com.payair.db.token.TokenDetailsEntry tokenDetailsEntry, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = tokenListManagerSuspendImpl;
        this.c = tokenDetailsEntry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.l3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.l3(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4280a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.payair.logic.managers.TokenListManagerSuspendImpl tokenListManagerSuspendImpl = this.b;
        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = this.c;
        this.f4280a = 1;
        java.lang.Object access$updateToken = com.payair.logic.managers.TokenListManagerSuspendImpl.access$updateToken(tokenListManagerSuspendImpl, tokenDetailsEntry, this);
        return access$updateToken == coroutine_suspended ? coroutine_suspended : access$updateToken;
    }
}
