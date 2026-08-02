package com.payair.csdk;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4292a;

    public o0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.o0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.o0((kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4292a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.google.android.gms.tasks.Task<java.lang.String> token = com.google.firebase.messaging.FirebaseMessaging.getInstance().getToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(token, "");
                this.f4292a = 1;
                obj = kotlinx.coroutines.tasks.TasksKt.await(token, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return (java.lang.String) obj;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.payair.logging.LoggerKt.getLog(), "Error while generating push token ".concat(java.lang.String.valueOf(e)), null, null, null, 14, null);
            return null;
        }
    }
}
