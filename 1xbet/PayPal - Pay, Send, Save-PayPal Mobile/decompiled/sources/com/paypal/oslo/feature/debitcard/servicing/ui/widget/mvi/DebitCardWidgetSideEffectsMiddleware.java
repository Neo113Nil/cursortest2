package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00022\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0018H\u0094@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b\u001f\u0010 J:\u0010%\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001e\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b%\u0010&J,\u0010'\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020#2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\"2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b)\u0010*J,\u0010%\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020#2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b%\u0010(J\u0010\u0010\u001f\u001a\u00020+H\u0082@¢\u0006\u0004\b\u001f\u0010,J\u0010\u0010'\u001a\u00020+H\u0082@¢\u0006\u0004\b'\u0010,J\"\u0010'\u001a\u0004\u0018\u00010-2\u0006\u0010\u001d\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020-H\u0082@¢\u0006\u0004\b'\u0010.J\u0013\u0010%\u001a\u00020-*\u00020/H\u0002¢\u0006\u0004\b%\u00100R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00103R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010)\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010;R\u0014\u00107\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010<R\u0014\u00109\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010?R\u0016\u0010=\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010B"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitCardWidgetUseCase;", "getDebitCardWidgetUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;", "dynamicConfigManager", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;", "debitInstrumentProductDefinitionProvider", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;", "bankingBundleEligibilityProvider", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/IsInContextTapToPayEligibleUseCase;", "isInContextTapToPayEligible", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Landroid/content/Context;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitCardWidgetUseCase;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/IsInContextTapToPayEligibleUseCase;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/widget/model/DebitCardWidget;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/widget/model/DebitCardWidget;Lkotlin/jvm/functions/Function1;)V", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;)Ljava/lang/String;", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/core/userstore/UserStore;", "Landroid/content/Context;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetDebitCardWidgetUseCase;", "Camera2StreamConfigurationMap", "getOutputFormats", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/gates/FeatureGateManager;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/debitcard/shared/domain/remoteconfig/dynamicconfig/DynamicConfigManager;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityProvider;", "getInputFormats", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/IsInContextTapToPayEligibleUseCase;", "Z", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;", "getOutputStallDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint getOutputStallDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    public DebitCardWidgetSideEffectsMiddleware(com.paypal.oslo.core.userstore.UserStore userStore, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase getDebitCardWidgetUseCase, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager dynamicConfigManager, com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider debitInstrumentProductDefinitionProvider, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase isInContextTapToPayEligibleUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDebitCardWidgetUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductDefinitionProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankingBundleEligibilityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isInContextTapToPayEligibleUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
        this.getHighSpeedVideoFpsRanges = context;
        this.Camera2StreamConfigurationMap = getDebitCardWidgetUseCase;
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
        this.getHighSpeedVideoSizes = dynamicConfigManager;
        this.getHighSpeedVideoSizesFor = debitInstrumentProductDefinitionProvider;
        this.getOutputFormats = bankingBundleEligibilityProvider;
        this.getOutputMinFrameDuration = isInContextTapToPayEligibleUseCase;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent debitCardWidgetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(debitCardWidgetEvent, debitCardWidgetState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent debitCardWidgetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (debitCardWidgetEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize) {
            if (debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle) {
                this.getOutputStallDuration = ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize) debitCardWidgetEvent).getEntryPoint();
                this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.isWidgetEntrypointEnabled();
                this.getInputFormats = this.getHighSpeedVideoFpsRangesFor.isWidgetAcquisitionEntrypointEnabled();
                java.lang.String eligibilityType = this.getHighSpeedVideoSizes.getEligibilityType();
                java.lang.String[] entryPoints = this.getHighSpeedVideoSizes.getEntryPoints();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
                kotlin.Pair pair = kotlin.TuplesKt.to("entrypointEnabled", java.lang.String.valueOf(this.getInputSizeshNQ4ISI));
                kotlin.Pair pair2 = kotlin.TuplesKt.to("acquisitionEntrypointEnabled", java.lang.String.valueOf(this.getInputFormats));
                kotlin.Pair pair3 = kotlin.TuplesKt.to("eligibilityType", eligibilityType);
                java.lang.String arrays = java.util.Arrays.toString(entryPoints);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
                com.paypal.android.logger.Logger.i$default(logger, "DebitCardWidgetSideEffectsMiddleware: Feature gate checks completed", kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, kotlin.TuplesKt.to("configuredEntryPoints", arrays)), null, 4, null);
                java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(debitCardWidgetState, function1, continuation);
                return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
            }
        } else if ((debitCardWidgetEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData) || (debitCardWidgetEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RetryButtonClicked)) {
            java.lang.Object highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(debitCardWidgetState, function1, continuation);
            return highSpeedVideoFpsRanges2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges2 : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0123, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r8, r5, r1, r3) == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0157, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (r7 != r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleDataFetch$1 debitCardWidgetSideEffectsMiddleware$handleDataFetch$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState2;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName resolveProductName;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest debitInstrumentsRequest;
        java.lang.Object invoke2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function12 = function1;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleDataFetch$1) {
            debitCardWidgetSideEffectsMiddleware$handleDataFetch$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleDataFetch$1) continuation;
            if ((debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getInputSizeshNQ4ISI && !this.getInputFormats) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Both gates disabled → Hidden", null, null, 6, null);
                        function12.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    debitCardWidgetState2 = debitCardWidgetState;
                    if (!(debitCardWidgetState2 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Gates enabled, showing loading", null, null, 6, null);
                        function12.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Loading.INSTANCE);
                    }
                    resolveProductName = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModelKt.resolveProductName(this.getHighResolutionOutputSizeshNQ4ISI);
                    debitInstrumentsRequest = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest(resolveProductName.name(), null);
                    com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase getDebitCardWidgetUseCase = this.Camera2StreamConfigurationMap;
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardWidgetState);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoFpsRangesFor = function12;
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoSizes = resolveProductName;
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentsRequest);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getOutputFormats = 1;
                    invoke2 = getDebitCardWidgetUseCase.invoke2(debitInstrumentsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidgetResponse>>) debitCardWidgetSideEffectsMiddleware$handleDataFetch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest debitInstrumentsRequest2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentsRequest) debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.Camera2StreamConfigurationMap;
                    resolveProductName = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState3 = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState) debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    debitInstrumentsRequest = debitInstrumentsRequest2;
                    function12 = function13;
                    invoke2 = obj;
                    debitCardWidgetState2 = debitCardWidgetState3;
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) invoke2;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget> instruments = ((com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidgetResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()).getInstruments();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Successfully fetched instruments", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("instrumentCount", java.lang.String.valueOf(instruments.size()))), null, 4, null);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardWidgetState2);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resolveProductName);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitInstrumentsRequest);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(instruments);
                    debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getOutputFormats = 2;
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Failed to fetch debit instruments", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult))), null, null, 12, null);
                    function12.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Error.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        debitCardWidgetSideEffectsMiddleware$handleDataFetch$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleDataFetch$1(this, continuation);
        java.lang.Object obj2 = debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardWidgetSideEffectsMiddleware$handleDataFetch$1.getOutputFormats;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) invoke2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget> list, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj;
        if (list.isEmpty()) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(debitCardProductName, function1, continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget) obj).isPrimary(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget debitCardWidget = (com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget) obj;
        if (debitCardWidget != null) {
            getHighSpeedVideoSizes(debitCardWidget, function1);
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(debitCardProductName, function1, continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoInstruments$1 debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1;
        int i;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2;
        java.lang.String str3;
        java.lang.Object obj;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function12;
        com.paypal.oslo.core.userstore.model.User user;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function13;
        java.lang.String str4;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName3;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoInstruments$1) {
            debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoInstruments$1) continuation;
            if ((debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighResolutionOutputSizeshNQ4ISI;
                str = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.core.userstore.model.UserState value = this.getHighResolutionOutputSizeshNQ4ISI.getUserState().getValue();
                    com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
                    if (profileLoaded != null && (user = profileLoaded.getUser()) != null && (str2 = user.getAccountCountryCode()) != null) {
                        if (kotlin.text.StringsKt.isBlank(str2)) {
                            str2 = null;
                        }
                    }
                    str2 = "US";
                    java.lang.String str5 = str2;
                    if (this.getInputFormats) {
                        debitCardProductName2 = debitCardProductName;
                        debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoFpsRangesFor = debitCardProductName2;
                        debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.Camera2StreamConfigurationMap = function1;
                        debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoSizes = str5;
                        debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1);
                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            str3 = str5;
                            obj = highSpeedVideoFpsRanges;
                            function12 = function1;
                        }
                        return coroutine_suspended;
                    }
                    str = "No instruments + acquisition disabled";
                    debitCardProductName2 = debitCardProductName;
                    function12 = function1;
                    str3 = str5;
                    if (str != null) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardWidgetSideEffectsMiddleware: ");
                        sb.append(str);
                        sb.append(" → Hidden");
                        com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                        function12.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: No instruments, showing acquisition widget", null, null, 6, null);
                    debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoFpsRangesFor = debitCardProductName2;
                    debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.Camera2StreamConfigurationMap = function12;
                    debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoSizes = str3;
                    debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(debitCardProductName2, str3, debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1);
                    if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                        function13 = function12;
                        str4 = str3;
                        debitCardProductName3 = debitCardProductName2;
                        obj2 = highSpeedVideoFpsRangesFor;
                        function13.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel.INSTANCE.create(debitCardProductName3, this.getHighSpeedVideoFpsRanges, (java.lang.String) obj2, str4)));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (java.lang.String) debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoSizes;
                    function13 = (kotlin.jvm.functions.Function1) debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.Camera2StreamConfigurationMap;
                    debitCardProductName3 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function13.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel.INSTANCE.create(debitCardProductName3, this.getHighSpeedVideoFpsRanges, (java.lang.String) obj2, str4)));
                    return kotlin.Unit.INSTANCE;
                }
                java.lang.String str6 = (java.lang.String) debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoSizes;
                function12 = (kotlin.jvm.functions.Function1) debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName4 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj2);
                obj = obj2;
                debitCardProductName2 = debitCardProductName4;
                str3 = str6;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    str = "No instruments + ineligible";
                } else if (!this.getOutputMinFrameDuration.invoke(debitCardProductName2, str3)) {
                    str = "DE user + TapToPay disabled";
                }
                if (str != null) {
                }
            }
        }
        debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoInstruments$1(this, continuation);
        java.lang.Object obj22 = debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardWidgetSideEffectsMiddleware$handleNoInstruments$1.getHighResolutionOutputSizeshNQ4ISI;
        str = null;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        if (str != null) {
        }
    }

    private final void getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.domain.widget.model.DebitCardWidget p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> p1) {
        if (this.getInputSizeshNQ4ISI) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Primary instrument found, showing enrolled widget", null, null, 6, null);
            p1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mapper.DebitCardWidgetDomainToUiMapperKt.toWidgetSuccessState(p0, this.getHighSpeedVideoFpsRanges)));
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Primary instrument found + entrypoint disabled → Hidden", null, null, 6, null);
            p1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1 debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1) {
            debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1) continuation;
            if ((debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.Camera2StreamConfigurationMap -= 2147483648;
                obj = debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getInputFormats) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: No primary card + acquisition disabled → Hidden", null, null, 6, null);
                        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.getHighResolutionOutputSizeshNQ4ISI = debitCardProductName;
                    debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.getHighSpeedVideoFpsRanges = function1;
                    debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.Camera2StreamConfigurationMap = 1;
                    obj = getHighSpeedVideoFpsRanges(debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.getHighSpeedVideoFpsRanges;
                    debitCardProductName = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = debitCardProductName;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: No primary card + ineligible → Hidden", null, null, 6, null);
                    function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: No primary card, showing acquisition widget", null, null, 6, null);
                function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel.Companion.create$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel.INSTANCE, debitCardProductName2, this.getHighSpeedVideoFpsRanges, null, null, 12, null)));
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1(this, continuation);
        obj = debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardWidgetSideEffectsMiddleware$handleNoPrimaryCard$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName22 = debitCardProductName;
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.lang.String[] entryPoints = this.getHighSpeedVideoSizes.getEntryPoints();
        com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint = this.getOutputStallDuration;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint2 = null;
        if (debitCardEntryPoint == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            debitCardEntryPoint = null;
        }
        if (!kotlin.collections.ArraysKt.contains(entryPoints, debitCardEntryPoint.getValue())) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint3 = this.getOutputStallDuration;
            if (debitCardEntryPoint3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                debitCardEntryPoint2 = debitCardEntryPoint3;
            }
            pairArr[0] = kotlin.TuplesKt.to("entryPoint", debitCardEntryPoint2.getValue());
            java.lang.String arrays = java.util.Arrays.toString(entryPoints);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
            pairArr[1] = kotlin.TuplesKt.to("configuredEntryPoints", arrays);
            com.paypal.android.logger.Logger.d$default(logger, "DebitCardWidgetSideEffectsMiddleware: Entry point not configured for eligibility check", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
        com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DebitCardEligibilityConfigEligibilityType fromValue = com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DebitCardEligibilityConfigEligibilityType.INSTANCE.fromValue(this.getHighSpeedVideoSizes.getEligibilityType());
        if (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware.WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()] == 1) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Checking bundle eligibility", null, null, 6, null);
            return getHighSpeedVideoFpsRangesFor(continuation);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Skipping eligibility check", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("eligibilityType", fromValue.name())), null, 4, null);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1 debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1) {
            debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1) continuation;
            if ((debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider = this.getOutputFormats;
                    debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = bankingBundleEligibilityProvider.getEligibility(debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult = (com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult) ((arrow.core.Either.Right) either).getValue();
                    int i2 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware.WhenMappings.$EnumSwitchMapping$1[bankingBundleEligibilityResult.getStatus().ordinal()];
                    boolean contains = (i2 == 1 || i2 == 2) ? bankingBundleEligibilityResult.getProducts().contains(com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.CONSUMER_DEBIT_CARD) : false;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Bundle eligibility result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", bankingBundleEligibilityResult.getStatus().name()), kotlin.TuplesKt.to("isEligible", java.lang.String.valueOf(contains))), null, 4, null);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(contains);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Bundle eligibility check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1(this, continuation);
        java.lang.Object obj2 = debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardWidgetSideEffectsMiddleware$checkBundleEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$fetchProductShortName$1 debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$fetchProductShortName$1) {
            debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1 = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$fetchProductShortName$1) continuation;
            if ((debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider debitInstrumentProductDefinitionProvider = this.getHighSpeedVideoSizesFor;
                    debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardProductName);
                    debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.getHighSpeedVideoFpsRanges = 1;
                    obj = debitInstrumentProductDefinitionProvider.getProductDefinition(debitCardProductName, str, false, debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return ((com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionResult) ((arrow.core.Either.Right) either).getValue()).getShortName();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "DebitCardWidgetSideEffectsMiddleware: Failed to fetch product definition", null, null, 6, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetSideEffectsMiddleware$fetchProductShortName$1(this, continuation);
        java.lang.Object obj2 = debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardWidgetSideEffectsMiddleware$fetchProductShortName$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error) {
        java.lang.String str;
        if (!(error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.HttpError)) {
            if (error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoInternet) {
                java.lang.String errorMessage = ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoInternet) error).getErrorMessage();
                return errorMessage == null ? com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR : errorMessage;
            }
            java.lang.String errorMessage2 = error.getErrorMessage();
            return errorMessage2 == null ? "Unknown error occurred" : errorMessage2;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.HttpError httpError = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.HttpError) error;
        int statusCode = httpError.getStatusCode();
        java.lang.String errorMessage3 = httpError.getErrorMessage();
        if (errorMessage3 == null || (str = ": ".concat(java.lang.String.valueOf(errorMessage3))) == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
        sb.append(statusCode);
        sb.append(str);
        return sb.toString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DebitCardEligibilityConfigEligibilityType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DebitCardEligibilityConfigEligibilityType.BUNDLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
