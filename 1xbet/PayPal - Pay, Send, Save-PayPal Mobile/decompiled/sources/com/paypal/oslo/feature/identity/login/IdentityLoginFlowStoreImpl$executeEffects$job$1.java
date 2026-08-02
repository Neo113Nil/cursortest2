package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$executeEffects$job$1", f = "IdentityLoginFlowStoreImpl.kt", i = {1}, l = {154, 156}, m = "invokeSuspend", n = {"resultAction"}, nl = {155, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowStoreImpl$executeEffects$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r6 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutor identityLoginFlowEffectExecutor;
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            identityLoginFlowEffectExecutor = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = identityLoginFlowEffectExecutor.execute(this.getHighSpeedVideoSizes, this);
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
        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction authFlowAction = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction) obj;
        if (authFlowAction != null) {
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authFlowAction);
            this.getHighSpeedVideoFpsRangesFor = 2;
            Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(authFlowAction, this);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$executeEffects$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$executeEffects$job$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityLoginFlowStoreImpl$executeEffects$job$1(com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl identityLoginFlowStoreImpl, com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect identityLoginFlowEffect, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$executeEffects$job$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = identityLoginFlowStoreImpl;
        this.getHighSpeedVideoSizes = identityLoginFlowEffect;
    }
}
