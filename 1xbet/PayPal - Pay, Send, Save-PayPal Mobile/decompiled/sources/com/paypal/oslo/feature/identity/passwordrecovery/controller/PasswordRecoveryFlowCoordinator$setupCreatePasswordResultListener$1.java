package com.paypal.oslo.feature.identity.passwordrecovery.controller;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1", f = "PasswordRecoveryFlowCoordinator.kt", i = {1}, l = {372, 384}, m = "invokeSuspend", n = {"resultFlow"}, nl = {374, 385}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r12 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3;
        java.lang.String str;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                navResultManager2 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (kotlinx.coroutines.flow.FlowKt.first(navResultManager2.m11583observeRequestRegistrationDpEMydE(this.Camera2StreamConfigurationMap), new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1.AnonymousClass1(null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult passwordRecoveryCreatePasswordNavResult = obj instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult ? (com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult) obj : null;
                    com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.access$handleCreatePasswordNavResult(this.getHighSpeedVideoFpsRanges, passwordRecoveryCreatePasswordNavResult != null ? passwordRecoveryCreatePasswordNavResult.getOutcome() : null);
                    navResultManager4 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                    navResultManager4.m11580cleanupRequestDpEMydE(this.Camera2StreamConfigurationMap);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            navResultManager3 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = navResultManager3.m11582getScopedResultFlowInternalDpEMydE(this.Camera2StreamConfigurationMap);
            if (m11582getScopedResultFlowInternalDpEMydE == null) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                str = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                com.paypal.android.logger.Logger.w$default(logger, "Create password result flow not registered - skipping listener setup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", str)), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11582getScopedResultFlowInternalDpEMydE);
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            obj = kotlinx.coroutines.flow.FlowKt.first(m11582getScopedResultFlowInternalDpEMydE, this);
        } finally {
            navResultManager = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            navResultManager.m11580cleanupRequestDpEMydE(this.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1$1", f = "PasswordRecoveryFlowCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ boolean Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean z = this.Camera2StreamConfigurationMap;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1.AnonymousClass1) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1.AnonymousClass1(continuation);
            anonymousClass1.Camera2StreamConfigurationMap = ((java.lang.Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = passwordRecoveryFlowCoordinator;
        this.Camera2StreamConfigurationMap = str;
    }
}
