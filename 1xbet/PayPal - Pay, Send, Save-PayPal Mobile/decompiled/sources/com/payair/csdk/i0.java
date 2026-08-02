package com.payair.csdk;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4262a;
    public final /* synthetic */ com.payair.listener.DefaultHceEventListenerImpl b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.payair.listener.DefaultHceEventListenerImpl defaultHceEventListenerImpl, byte[] bArr, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = defaultHceEventListenerImpl;
        this.c = bArr;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.i0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.i0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (com.payair.logic.storage.EnrollmentIdStorage.DefaultImpls.markEnrollmentDone$default(r3, r4, false, r9, 2, null) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r10.replenishToken(r1, r9) != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r10 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.storage.SchemeStorage schemeStorage;
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface;
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface2;
        com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage;
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface3;
        com.payair.logic.managers.TokenRefreshManager tokenRefreshManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4262a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            schemeStorage = this.b.e;
            kotlinx.coroutines.flow.Flow<com.payair.model.CardScheme> currentScheme = schemeStorage.getCurrentScheme();
            this.f4262a = 1;
            obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(currentScheme, this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                hceSDKInterface3 = this.b.f4389a;
                com.payair.listener.ClientListener d = hceSDKInterface3.getD();
                if (d != null) {
                    d.onActivateToken(this.d);
                }
                tokenRefreshManager = this.b.g;
                tokenRefreshManager.refreshTokens(kotlin.collections.SetsKt.setOf(new com.payair.model.NetworkTokenReference(new java.lang.String(this.c, kotlin.text.Charsets.UTF_8), false)));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            enrollmentIdStorage = this.b.f;
            java.lang.String str = this.d;
            this.f4262a = 3;
        }
        if (obj == com.payair.model.CardScheme.VISA) {
            hceSDKInterface = this.b.f4389a;
            hceSDKInterface.activateVisaCardForToken(this.c);
            hceSDKInterface2 = this.b.f4389a;
            byte[] bArr = this.c;
            this.f4262a = 2;
        }
        return kotlin.Unit.INSTANCE;
    }
}
