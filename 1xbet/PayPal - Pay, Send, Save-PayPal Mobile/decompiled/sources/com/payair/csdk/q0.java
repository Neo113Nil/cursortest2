package com.payair.csdk;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4302a;
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = firebaseNotificationHandlerImpl;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.q0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.payair.csdk.q0(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r6.deleteEnrollmentId(r1, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r6.delete(r1, r5) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.delete(r1, r5) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.db.Database database;
        com.payair.db.Database database2;
        com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4302a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            database = this.b.i;
            com.payair.db.token.TokenDetailsDao tokenDetailsDao = database.getTokenDetailsDao();
            java.lang.String str = this.c;
            this.f4302a = 1;
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
            enrollmentIdStorage = this.b.k;
            java.lang.String str2 = this.c;
            this.f4302a = 3;
        }
        database2 = this.b.i;
        com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryDao = database2.getTransactionHistoryDao();
        java.lang.String str3 = this.c;
        this.f4302a = 2;
    }
}
