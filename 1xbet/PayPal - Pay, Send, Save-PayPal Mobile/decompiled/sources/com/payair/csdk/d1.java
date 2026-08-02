package com.payair.csdk;

/* loaded from: classes4.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4241a;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = hceRemoteRepositoryImpl;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.d1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.d1(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4241a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tokenizationTimestampStorage = this.b.d;
            java.lang.String str = this.c;
            this.f4241a = 1;
            if (tokenizationTimestampStorage.delete(str, this) == coroutine_suspended) {
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
