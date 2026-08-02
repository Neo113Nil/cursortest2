package com.payair.csdk;

/* loaded from: classes10.dex */
public final class y0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4337a;
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl b;
    public final /* synthetic */ java.util.Set c;
    public final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.util.Set set, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = firebaseNotificationHandlerImpl;
        this.c = set;
        this.d = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.y0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.y0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r7.setNetworkTokenReferencesPendingUpdate(r1, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7.setNetworkTokenReferences(r1, r6) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.storage.StorageService storageService;
        com.payair.logic.managers.TokenRefreshManager tokenRefreshManager;
        com.payair.logic.managers.TokenManager tokenManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4337a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            storageService = this.b.f4461a;
            java.util.Set<com.payair.model.NetworkTokenReference> set = this.c;
            this.f4337a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = this.d;
        tokenRefreshManager = this.b.e;
        booleanRef.element = tokenRefreshManager.refreshTokens(this.c);
        if (this.d.element) {
            java.util.Set set2 = this.c;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
            java.util.Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(com.payair.model.NetworkTokenReference.copy$default((com.payair.model.NetworkTokenReference) it.next(), null, true, 1, null));
            }
            tokenManager = this.b.d;
            java.util.Set<com.payair.model.NetworkTokenReference> set3 = kotlin.collections.CollectionsKt.toSet(arrayList);
            this.f4337a = 2;
        }
        return kotlin.Unit.INSTANCE;
    }
}
