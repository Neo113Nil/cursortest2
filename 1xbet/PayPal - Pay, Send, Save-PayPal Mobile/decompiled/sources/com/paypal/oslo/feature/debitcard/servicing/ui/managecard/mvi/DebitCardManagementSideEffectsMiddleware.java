package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001KB[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001cH\u0094@¢\u0006\u0004\b\u001f\u0010 J,\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b$\u0010%J>\u0010*\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u00022\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b*\u0010+J'\u0010*\u001a\u00020-2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010#\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b*\u0010.J<\u00101\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020/2\u0006\u0010#\u001a\u00020-2\u0006\u0010(\u001a\u0002002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b1\u00102J/\u00103\u001a\u00020/2\u0006\u0010\"\u001a\u00020/2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b3\u00104J4\u0010*\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00022\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b*\u00105J4\u00106\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00022\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b6\u00105R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u00106\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u00103\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010?R\u0014\u00109\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u0016\u0010C\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010A\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010D\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010FR\u0014\u0010;\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010GR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010I"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;", "getDebitInstrumentsUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;", "lockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;", "unlockCardUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;", "debitCardI18nFormatter", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "flowIntent", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/CardConnectHandler;", "cardConnectHandler", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;Landroid/content/Context;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/CardConnectHandler;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoaded;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoaded;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;", "", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentsResponse;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getInputFormats", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitInstrumentsUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/LockCardUseCase;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/UnlockCardUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;", "Landroid/content/Context;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", "getOutputFormats", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/CardConnectHandler;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "", "Z", "getOutputSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardManagementSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getOutputSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware.Companion Companion = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Map<com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.REQUEST_PHYSICAL_CARD, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REQUEST_PHYSICAL_CARD), kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.STAR_PAY, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.PUSH_PROVISION));

    public DebitCardManagementSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, android.content.Context context, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler cardConnectHandler, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitInstrumentsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlockCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardI18nFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRangesFor = debitCardProductName;
        this.getHighSpeedVideoSizes = getDebitInstrumentsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = lockCardUseCase;
        this.Camera2StreamConfigurationMap = unlockCardUseCase;
        this.getHighSpeedVideoFpsRanges = debitCardI18nFormatter;
        this.getInputFormats = context;
        this.getOutputFormats = debitCardFlow;
        this.getHighSpeedVideoSizesFor = debitCardFlowIntent;
        this.getOutputMinFrameDuration = cardConnectHandler;
        this.getInputSizeshNQ4ISI = featureGateManager;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent debitCardManagementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(debitCardManagementEvent, debitCardManagementState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementSideEffectsMiddleware$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent debitCardManagementEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (debitCardManagementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails) debitCardManagementEvent).getLoadContext(), debitCardManagementState.getCardId(), debitCardManagementState, function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        if ((debitCardManagementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningAndPinSetupSuccessful) || (debitCardManagementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ContactlessDeactivationSuccess)) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards(null, 1, null), debitCardManagementState.getCardId(), debitCardManagementState, function1, continuation);
            return highResolutionOutputSizeshNQ4ISI2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI2 : kotlin.Unit.INSTANCE;
        }
        if (debitCardManagementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected) {
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected cardholderSelected = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected) debitCardManagementEvent;
            java.lang.Object highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId(cardholderSelected.getCardId(), com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.None.INSTANCE), cardholderSelected.getCardId(), debitCardManagementState, function1, continuation);
            return highResolutionOutputSizeshNQ4ISI3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI3 : kotlin.Unit.INSTANCE;
        }
        if (debitCardManagementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded) debitCardManagementEvent, function1, continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
        }
        if (debitCardManagementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled) debitCardManagementEvent).getInstrumentId(), debitCardManagementState, function1, continuation);
            return highResolutionOutputSizeshNQ4ISI4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI4 : kotlin.Unit.INSTANCE;
        }
        if (debitCardManagementEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled) {
            java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled) debitCardManagementEvent).getInstrumentId(), debitCardManagementState, function1, continuation);
            return Camera2StreamConfigurationMap2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap2 : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded cardDetailsLoaded, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj;
        java.lang.Object coroutineScope;
        java.util.Iterator<T> it = cardDetailsLoaded.getAllInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), cardDetailsLoaded.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        return (debitInstrument != null && (coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$handleCardDetailsLoadedEvent$2(this, debitInstrument, function1, cardDetailsLoaded, null), continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0156, code lost:
    
        if (getHighSpeedVideoSizes(r3, r7, r8, r5, r6) == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext loadCardDetailsContext, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$loadCardDetails$1 debitCardManagementSideEffectsMiddleware$loadCardDetails$1;
        int i;
        java.lang.String cardId;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest debitInstrumentsRequest;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function12;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$loadCardDetails$1) {
            debitCardManagementSideEffectsMiddleware$loadCardDetails$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$loadCardDetails$1) continuation;
            if ((debitCardManagementSideEffectsMiddleware$loadCardDetails$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                debitCardManagementSideEffectsMiddleware$loadCardDetails$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$loadCardDetails$1 debitCardManagementSideEffectsMiddleware$loadCardDetails$12 = debitCardManagementSideEffectsMiddleware$loadCardDetails$1;
                java.lang.Object obj = debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (loadCardDetailsContext instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards) {
                        cardId = null;
                    } else {
                        if (!(loadCardDetailsContext instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        cardId = ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId) loadCardDetailsContext).getCardId();
                    }
                    debitInstrumentsRequest = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest(this.getHighSpeedVideoFpsRangesFor.name(), cardId);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase = this.getHighSpeedVideoSizes;
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoFpsRangesFor = loadCardDetailsContext;
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.Camera2StreamConfigurationMap = str;
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoFpsRanges = debitCardManagementState;
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighResolutionOutputSizeshNQ4ISI = function1;
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoSizes = cardId;
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentsRequest);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputStallDurationlomOqCM = 1;
                    java.lang.Object invoke2 = getDebitInstrumentsUseCase.invoke2(debitInstrumentsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse>>) debitCardManagementSideEffectsMiddleware$loadCardDetails$12);
                    if (invoke2 != coroutine_suspended) {
                        function12 = function1;
                        str2 = str;
                        str3 = cardId;
                        obj = invoke2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest debitInstrumentsRequest2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest) debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputMinFrameDuration;
                str3 = (java.lang.String) debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighResolutionOutputSizeshNQ4ISI;
                debitCardManagementState = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState) debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoFpsRanges;
                str2 = (java.lang.String) debitCardManagementSideEffectsMiddleware$loadCardDetails$12.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext loadCardDetailsContext2 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext) debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                debitInstrumentsRequest = debitInstrumentsRequest2;
                function12 = function13;
                loadCardDetailsContext = loadCardDetailsContext2;
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse debitInstrumentsResponse = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData();
                    if (debitInstrumentsResponse.getInstruments().isEmpty()) {
                        function12.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL, "empty_list"));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(debitInstrumentsResponse, debitCardManagementState.getCachedInstruments(), str3);
                    if (highSpeedVideoFpsRanges.getInstruments().isEmpty()) {
                        function12.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL, "empty_list"));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges.getInstruments(), str2);
                    com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction = loadCardDetailsContext.getPostLoadAction();
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loadCardDetailsContext);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardManagementState);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentsRequest);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentsResponse);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRanges);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highResolutionOutputSizeshNQ4ISI);
                    debitCardManagementSideEffectsMiddleware$loadCardDetails$12.getOutputStallDurationlomOqCM = 2;
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    function12.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), error.getTag()));
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        debitCardManagementSideEffectsMiddleware$loadCardDetails$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$loadCardDetails$1(this, continuation);
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$loadCardDetails$1 debitCardManagementSideEffectsMiddleware$loadCardDetails$122 = debitCardManagementSideEffectsMiddleware$loadCardDetails$1;
        java.lang.Object obj2 = debitCardManagementSideEffectsMiddleware$loadCardDetails$122.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardManagementSideEffectsMiddleware$loadCardDetails$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
    }

    private static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> p0, java.lang.String p1) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = null;
        if (p1 == null) {
            java.util.Iterator<T> it = p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj2).getPrimary()) {
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj2;
            p1 = debitInstrument != null ? debitInstrument.getId() : null;
            if (p1 == null) {
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) p0);
                p1 = debitInstrument2 != null ? debitInstrument2.getId() : null;
            }
        }
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list = p0;
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), p1)) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument3 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument3 != null) {
            return debitInstrument3;
        }
        java.util.Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next = it3.next();
            if (((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) next).getPrimary()) {
                obj3 = next;
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument4 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj3;
        return debitInstrument4 == null ? (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) kotlin.collections.CollectionsKt.first((java.util.List) p0) : debitInstrument4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse debitInstrumentsResponse, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1 debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1) {
            debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1) continuation;
            if ((debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1 debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12 = debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1;
                java.lang.Object obj = debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter = this.getHighSpeedVideoFpsRanges;
                    android.content.Context context = this.getInputFormats;
                    boolean isAdditionalCardholderManagementEnabled = this.getInputSizeshNQ4ISI.isAdditionalCardholderManagementEnabled();
                    debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighSpeedVideoSizes = debitInstrumentsResponse;
                    debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighSpeedVideoFpsRanges = debitInstrument;
                    debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighResolutionOutputSizeshNQ4ISI = postLoadAction;
                    debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.Camera2StreamConfigurationMap = function1;
                    debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.mapDebitInstrumentsToUiSections(debitCardProductName, debitInstrumentsResponse, debitInstrument, debitCardI18nFormatter, context, isAdditionalCardholderManagementEnabled, debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.Camera2StreamConfigurationMap;
                    postLoadAction = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction) debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighResolutionOutputSizeshNQ4ISI;
                    debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighSpeedVideoFpsRanges;
                    debitInstrumentsResponse = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse) debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded((java.util.List) obj, debitInstrument.getId(), debitInstrumentsResponse.getInstruments(), postLoadAction));
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1(this, continuation);
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1 debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$122 = debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$1;
        java.lang.Object obj2 = debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardManagementSideEffectsMiddleware$dispatchLoadSuccessEvent$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded((java.util.List) obj2, debitInstrument.getId(), debitInstrumentsResponse.getInstruments(), postLoadAction));
        return kotlin.Unit.INSTANCE;
    }

    private static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse p0, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> p1, java.lang.String p2) {
        if (p2 == null || p1.isEmpty()) {
            return p0;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) p0.getInstruments());
        if (debitInstrument == null) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse.copy$default(p0, p1, null, 2, null);
        }
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list = p1;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2 : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(debitInstrument2.getId(), debitInstrument.getId())) {
                debitInstrument2 = debitInstrument;
            }
            arrayList.add(debitInstrument2);
        }
        return com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsResponse.copy$default(p0, arrayList, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$lockCard$1 debitCardManagementSideEffectsMiddleware$lockCard$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$lockCard$1) {
            debitCardManagementSideEffectsMiddleware$lockCard$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$lockCard$1) continuation;
            if ((debitCardManagementSideEffectsMiddleware$lockCard$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                debitCardManagementSideEffectsMiddleware$lockCard$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = debitCardManagementSideEffectsMiddleware$lockCard$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardManagementSideEffectsMiddleware$lockCard$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(debitCardManagementState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success) && !(debitCardManagementState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest lockCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardRequest(str);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    debitCardManagementSideEffectsMiddleware$lockCard$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    debitCardManagementSideEffectsMiddleware$lockCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardManagementState);
                    debitCardManagementSideEffectsMiddleware$lockCard$1.Camera2StreamConfigurationMap = function1;
                    debitCardManagementSideEffectsMiddleware$lockCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(lockCardRequest);
                    debitCardManagementSideEffectsMiddleware$lockCard$1.getHighSpeedVideoSizes = 1;
                    obj = lockCardUseCase.invoke2(lockCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.lockcard.model.LockCardResult>>) debitCardManagementSideEffectsMiddleware$lockCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardManagementSideEffectsMiddleware$lockCard$1.Camera2StreamConfigurationMap;
                    str = (java.lang.String) debitCardManagementSideEffectsMiddleware$lockCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId(str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardLockedToast.INSTANCE)));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    if (error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.AlreadyDeactivatedError) {
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId(str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyLockedToast.INSTANCE)));
                    } else {
                        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error);
                        java.lang.String errorMessage = error.getErrorMessage();
                        if (errorMessage == null) {
                            errorMessage = "Failed to lock card";
                        }
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed(debitErrorType, errorMessage));
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardManagementSideEffectsMiddleware$lockCard$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$lockCard$1(this, continuation);
        java.lang.Object obj2 = debitCardManagementSideEffectsMiddleware$lockCard$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardManagementSideEffectsMiddleware$lockCard$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$unlockCard$1 debitCardManagementSideEffectsMiddleware$unlockCard$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$unlockCard$1) {
            debitCardManagementSideEffectsMiddleware$unlockCard$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$unlockCard$1) continuation;
            if ((debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = debitCardManagementSideEffectsMiddleware$unlockCard$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(debitCardManagementState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success) && !(debitCardManagementState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest unlockCardRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardRequest(str, null, null, 6, null);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase = this.Camera2StreamConfigurationMap;
                    debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighSpeedVideoFpsRangesFor = str;
                    debitCardManagementSideEffectsMiddleware$unlockCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardManagementState);
                    debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighSpeedVideoFpsRanges = function1;
                    debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unlockCardRequest);
                    debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = unlockCardUseCase.invoke2(unlockCardRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.unlockcard.model.UnlockCardResult>>) debitCardManagementSideEffectsMiddleware$unlockCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId(str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardUnlockedToast.INSTANCE)));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    if (error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.AlreadyActivatedError) {
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshByCardId(str, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyUnlockedToast.INSTANCE)));
                    } else {
                        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error);
                        java.lang.String errorMessage = error.getErrorMessage();
                        if (errorMessage == null) {
                            errorMessage = "Failed to unlock card";
                        }
                        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed(debitErrorType, errorMessage));
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardManagementSideEffectsMiddleware$unlockCard$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware$unlockCard$1(this, continuation);
        java.lang.Object obj2 = debitCardManagementSideEffectsMiddleware$unlockCard$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardManagementSideEffectsMiddleware$unlockCard$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleActivateFlow(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, kotlin.jvm.functions.Function1 function1) {
        if (!debitInstrument.getOperations().contains(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.ACTIVATE)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Flow intent not supported", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, debitCardFlow.getValue()), kotlin.TuplesKt.to("requiredOperation", "ACTIVATE")), null, 4, null);
        } else {
            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived(debitCardFlow, debitCardManagementSideEffectsMiddleware.getHighSpeedVideoSizesFor));
        }
    }

    public static final /* synthetic */ void access$handleReceivedFlowIntent(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementSideEffectsMiddleware debitCardManagementSideEffectsMiddleware, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation = Camera2StreamConfigurationMap.get(debitCardFlowIntent);
        if (debitInstrumentOperation == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Unknown or unsupported flow intent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("flowIntent", debitCardFlowIntent.getValue())), null, 4, null);
        } else if (!debitInstrument.getOperations().contains(debitInstrumentOperation)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Flow intent not supported", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("flowIntent", debitCardFlowIntent.getValue()), kotlin.TuplesKt.to("requiredOperation", debitInstrumentOperation.name())), null, 4, null);
        } else {
            function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived(debitCardFlow, debitCardFlowIntent));
        }
    }
}
