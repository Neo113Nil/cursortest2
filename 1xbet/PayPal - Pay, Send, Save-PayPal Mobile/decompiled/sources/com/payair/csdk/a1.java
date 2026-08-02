package com.payair.csdk;

/* loaded from: classes10.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4226a;
    public final /* synthetic */ com.payair.logic.remote.repositories.HceRemoteRepositoryImpl b;
    public final /* synthetic */ com.payair.model.CompleteTokenizeData c;
    public final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, com.payair.model.CompleteTokenizeData completeTokenizeData, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = hceRemoteRepositoryImpl;
        this.c = completeTokenizeData;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.a1(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.a1) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if (r9.deleteCurrent(r8) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r9.store(r1, r6, r8) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r9 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.access$insertIntoDb(r9, r1, r8) != r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage;
        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage2;
        com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4226a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl = this.b;
            com.payair.model.CompleteTokenizeData completeTokenizeData = this.c;
            this.f4226a = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Map map = (java.util.Map) obj;
            if (map != null) {
                java.lang.String str = this.d;
                com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl2 = this.b;
                com.payair.model.CompleteTokenizeData completeTokenizeData2 = this.c;
                java.lang.Long l = (java.lang.Long) map.get(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.Long.parseLong(str)));
                if (l != null) {
                    long longValue = l.longValue();
                    tokenizationTimestampStorage2 = hceRemoteRepositoryImpl2.d;
                    java.lang.String networkTokenReference = completeTokenizeData2.getNetworkTokenReference();
                    this.f4226a = 3;
                }
            }
            enrollmentIdStorage = this.b.f;
            this.f4226a = 4;
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            enrollmentIdStorage = this.b.f;
            this.f4226a = 4;
        }
        tokenizationTimestampStorage = this.b.d;
        kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Long, java.lang.Long>> timestampMap = tokenizationTimestampStorage.getTimestampMap();
        this.f4226a = 2;
        obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(timestampMap, this);
    }
}
