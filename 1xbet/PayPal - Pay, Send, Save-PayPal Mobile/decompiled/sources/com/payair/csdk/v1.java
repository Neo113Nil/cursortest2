package com.payair.csdk;

/* loaded from: classes10.dex */
public final class v1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    public v1(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.v1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        new com.payair.csdk.v1((kotlin.coroutines.Continuation) obj2);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(unit);
        com.payair.hce.HCEInitializer.postInitializationCleanup();
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.payair.hce.HCEInitializer.postInitializationCleanup();
        return kotlin.Unit.INSTANCE;
    }
}
