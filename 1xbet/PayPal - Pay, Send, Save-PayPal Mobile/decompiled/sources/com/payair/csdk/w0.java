package com.payair.csdk;

/* loaded from: classes10.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4329a;
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = firebaseNotificationHandlerImpl;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.w0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.w0(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r1.updateFirebaseToken((java.lang.String) r7, r3, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r7.updateFirebaseToken(r1, r5, r6) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.PushManager pushManager;
        com.payair.logic.managers.PushManager pushManager2;
        com.payair.logic.managers.PushManager pushManager3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4329a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pushManager = this.b.b;
            java.lang.String str = this.c;
            com.payair.model.PushTokenType pushTokenType = com.payair.model.PushTokenType.PAYAIR;
            this.f4329a = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            pushManager3 = this.b.b;
            com.payair.model.PushTokenType pushTokenType2 = com.payair.model.PushTokenType.MDES;
            this.f4329a = 3;
        }
        pushManager2 = this.b.b;
        this.f4329a = 2;
        obj = pushManager2.generateMdesPushToken(this);
    }
}
