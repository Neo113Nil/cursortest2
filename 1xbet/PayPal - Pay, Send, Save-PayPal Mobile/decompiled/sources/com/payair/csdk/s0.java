package com.payair.csdk;

/* loaded from: classes10.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl f4310a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4310a = firebaseNotificationHandlerImpl;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.s0(this.f4310a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.s0(this.f4310a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.NewTransactionNotificationHandler newTransactionNotificationHandler;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        newTransactionNotificationHandler = this.f4310a.f;
        newTransactionNotificationHandler.handleNewTransaction(this.b);
        return kotlin.Unit.INSTANCE;
    }
}
