package com.payair.csdk;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4297a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, byte[] bArr, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = firebaseNotificationHandlerImpl;
        this.d = bArr;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.p0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.p0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        if (com.payair.logic.storage.EnrollmentIdStorage.DefaultImpls.markEnrollmentDone$default(r4, r5, false, r10, 2, null) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r11.replenishToken(r1, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r11 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r11.replenishToken(r1, r10) != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface;
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface2;
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface3;
        com.payair.db.Database database;
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface4;
        com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4297a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.b;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "MASTERCARD")) {
                hceSDKInterface3 = this.c.g;
                hceSDKInterface3.activateCardForToken(this.d);
                database = this.c.i;
                com.payair.db.token.TokenDetailsDao tokenDetailsDao = database.getTokenDetailsDao();
                java.lang.String str2 = this.e;
                this.f4297a = 1;
                obj = tokenDetailsDao.getByNetworkTokenReference(str2, this);
            } else {
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, "VISA")) {
                    hceSDKInterface = this.c.g;
                    hceSDKInterface.activateVisaCardForToken(this.d);
                    hceSDKInterface2 = this.c.g;
                    byte[] bArr = this.d;
                    this.f4297a = 3;
                }
                com.payair.logic.notifications.FirebaseNotificationHandlerImpl.access$resetTransactionData(this.c, this.e);
                enrollmentIdStorage = this.c.k;
                java.lang.String str3 = this.e;
                this.f4297a = 4;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
            if ((tokenDetailsEntry != null ? tokenDetailsEntry.getTokenStatus() : null) == com.payair.model.TokenStatus.SUSPENDED) {
                hceSDKInterface4 = this.c.g;
                byte[] bArr2 = this.d;
                this.f4297a = 2;
            }
            com.payair.logic.notifications.FirebaseNotificationHandlerImpl.access$resetTransactionData(this.c, this.e);
            enrollmentIdStorage = this.c.k;
            java.lang.String str32 = this.e;
            this.f4297a = 4;
        } else if (i == 2 || i == 3) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.payair.logic.notifications.FirebaseNotificationHandlerImpl.access$resetTransactionData(this.c, this.e);
            enrollmentIdStorage = this.c.k;
            java.lang.String str322 = this.e;
            this.f4297a = 4;
        } else {
            if (i != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
