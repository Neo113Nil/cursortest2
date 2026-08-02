package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2", f = "DebitCardManagementSideEffectsMiddleware.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2$1", f = "DebitCardManagementSideEffectsMiddleware.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler cardConnectHandler;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                cardConnectHandler = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
                debitCardProductName = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (cardConnectHandler.checkEligibility(debitCardProductName, this.getHighSpeedVideoSizes.getCardId(), this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded cardDetailsLoaded, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = debitCardManagementSideEffectsMiddleware;
            this.getHighSpeedVideoSizes = cardDetailsLoaded;
            this.getHighSpeedVideoFpsRanges = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow2;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), 3, null);
            z = this.getHighSpeedVideoFpsRangesFor.getOutputSizes;
            if (z) {
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoFpsRangesFor.getOutputSizes = true;
            debitCardFlow = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            int i = debitCardFlow == null ? -1 : com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2.WhenMappings.$EnumSwitchMapping$0[debitCardFlow.ordinal()];
            if (i == 1) {
                debitCardFlowIntent = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
                if (debitCardFlowIntent != null) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
                    debitCardFlow2 = debitCardManagementSideEffectsMiddleware.getOutputFormats;
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware.access$handleReceivedFlowIntent(debitCardManagementSideEffectsMiddleware, debitInstrument, debitCardFlow2, debitCardFlowIntent, function1);
                }
            } else if (i == 2) {
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware2 = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2 = this.getHighSpeedVideoFpsRanges;
                debitCardFlow3 = debitCardManagementSideEffectsMiddleware2.getOutputFormats;
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware.access$handleActivateFlow(debitCardManagementSideEffectsMiddleware2, debitInstrument2, debitCardFlow3, this.Camera2StreamConfigurationMap);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.DISPLAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.ACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2 debitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        debitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2.getInputFormats = obj;
        return debitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded cardDetailsLoaded, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = debitCardManagementSideEffectsMiddleware;
        this.getHighSpeedVideoFpsRanges = debitInstrument;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = cardDetailsLoaded;
    }
}
