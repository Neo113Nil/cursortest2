package com.paypal.oslo.feature.identity.passwordrecovery.controller;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1", f = "PasswordRecoveryFlowCoordinator.kt", i = {1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, 312}, m = "invokeSuspend", n = {"resultFlow"}, nl = {300, 317}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PasswordRecoveryFlowCoordinator$setupStepupResultListener$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r12, new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass2(r11.getHighResolutionOutputSizeshNQ4ISI, null), r11) == r0) goto L24;
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
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                navResultManager2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = 1;
                if (kotlinx.coroutines.flow.FlowKt.first(navResultManager2.m11583observeRequestRegistrationDpEMydE(this.Camera2StreamConfigurationMap), new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass1(null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    navResultManager4 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                    navResultManager4.m11580cleanupRequestDpEMydE(this.Camera2StreamConfigurationMap);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            navResultManager3 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = navResultManager3.m11582getScopedResultFlowInternalDpEMydE(this.Camera2StreamConfigurationMap);
            if (m11582getScopedResultFlowInternalDpEMydE == null) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                str = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                com.paypal.android.logger.Logger.w$default(logger, "Stepup result flow not registered - skipping listener setup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", str)), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11582getScopedResultFlowInternalDpEMydE);
            this.getHighSpeedVideoSizes = 2;
        } finally {
            navResultManager = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            navResultManager.m11580cleanupRequestDpEMydE(this.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1$1", f = "PasswordRecoveryFlowCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        int getHighSpeedVideoFpsRangesFor;
        /* synthetic */ boolean getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean z = this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass1) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass1(continuation);
            anonymousClass1.getHighSpeedVideoSizes = ((java.lang.Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "navResult", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1$2", f = "PasswordRecoveryFlowCoordinator.kt", i = {0}, l = {313}, m = "invokeSuspend", n = {"navResult"}, nl = {314}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult passwordRecoveryStepUpNavResult = obj2 instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult ? (com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult) obj2 : null;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                this.getHighSpeedVideoSizes = 1;
                if (com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.access$handleStepupNavResult(passwordRecoveryFlowCoordinator, passwordRecoveryStepUpNavResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass2) create(obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = passwordRecoveryFlowCoordinator;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryFlowCoordinator$setupStepupResultListener$1(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = passwordRecoveryFlowCoordinator;
        this.Camera2StreamConfigurationMap = str;
    }
}
