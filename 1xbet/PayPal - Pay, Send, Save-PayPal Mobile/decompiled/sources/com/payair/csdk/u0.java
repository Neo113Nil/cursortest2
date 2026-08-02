package com.payair.csdk;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4320a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ java.util.Map g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.String str, com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = firebaseNotificationHandlerImpl;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.u0(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.u0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0101, code lost:
    
        if (r14 != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r14.replenishToken(r1, r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        if (r1.reperso(r4, r5, r14, r13) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.storage.StorageService storageService;
        android.content.Context context;
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4320a;
        try {
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.payair.logging.LoggerKt.getLog(), "Error in reperso: ".concat(java.lang.String.valueOf(e)), null, null, null, 14, null);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.b;
            int hashCode = str.hashCode();
            if (hashCode != -2146807625) {
                if (hashCode != 85156980) {
                    if (hashCode == 1034513230 && str.equals("KEY_STATUS_UPDATED")) {
                        com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Received KEY_STATUS_UPDATED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", this.e)), null, 4, null);
                        hceSDKInterface = this.c.g;
                        byte[] bytes = this.e.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                        this.f4320a = 1;
                    }
                } else if (str.equals("TOKEN_STATUS_UPDATED")) {
                    com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "Updating the token status", null, null, 6, null);
                    this.c.a(this.d, this.e, this.f);
                }
                storageService = this.c.f4461a;
                this.f4320a = 3;
                obj = storageService.getNetworkTokenReferencesPendingHandle(this);
            } else {
                if (str.equals("TOKEN_REPERSO_ADVICE")) {
                    com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Received TOKEN_REPERSO_ADVICE", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", this.e)), null, 4, null);
                    java.lang.String str2 = (java.lang.String) kotlin.collections.MapsKt.getValue(this.g, "notificationId");
                    com.payair.hce.visa.reperso.VisaReperso create = com.payair.hce.visa.reperso.VisaRepersoInitializer.create();
                    context = this.c.j;
                    java.lang.String str3 = this.e;
                    this.f4320a = 2;
                }
                storageService = this.c.f4461a;
                this.f4320a = 3;
                obj = storageService.getNetworkTokenReferencesPendingHandle(this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            storageService = this.c.f4461a;
            this.f4320a = 3;
            obj = storageService.getNetworkTokenReferencesPendingHandle(this);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.collections.CollectionsKt.toMutableSet((java.lang.Iterable) obj);
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        storageService = this.c.f4461a;
        this.f4320a = 3;
        obj = storageService.getNetworkTokenReferencesPendingHandle(this);
    }
}
