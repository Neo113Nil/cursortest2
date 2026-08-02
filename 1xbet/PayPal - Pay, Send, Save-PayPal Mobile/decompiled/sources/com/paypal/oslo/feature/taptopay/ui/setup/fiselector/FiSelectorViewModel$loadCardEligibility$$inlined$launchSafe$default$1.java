package com.paypal.oslo.feature.taptopay.ui.setup.fiselector;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/paypal/oslo/feature/taptopay/ui/setup/fiselector/FiSelectorViewModel$launchSafe$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1", f = "FiSelectorViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {324, 339, 357, 358}, m = "invokeSuspend", n = {"$completion", "$this$loadCardEligibility_u24lambda_u240_u240", "$i$a$-launchSafe$default-FiSelectorViewModel$loadCardEligibility$1", "$i$a$-run-FiSelectorViewModel$loadCardEligibility$1$digitizedCards$1", "$completion", "digitizedCards", "$i$a$-launchSafe$default-FiSelectorViewModel$loadCardEligibility$1", "$completion", "clientMetadataId", "cardIds", "digitizedCards", "$i$a$-launchSafe$default-FiSelectorViewModel$loadCardEligibility$1", "$completion", "clientMetadataId", "cardIds", "result", "digitizedCards", "$i$a$-launchSafe$default-FiSelectorViewModel$loadCardEligibility$1"}, nl = {325, 340, 358, 366}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes15.dex */
public final class FiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel getOutputMinFrameDurationlomOqCM;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01cd, code lost:
    
        if (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel.access$handleEligibilitySuccess(r9, r10, r2, r22) == r0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019c A[Catch: Exception -> 0x023d, CancellationException -> 0x0269, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0269, Exception -> 0x023d, blocks: (B:9:0x002d, B:16:0x004c, B:18:0x0196, B:20:0x019c, B:25:0x01d4, B:26:0x01fe, B:27:0x0203, B:29:0x005d, B:31:0x00ee, B:34:0x00f4, B:36:0x013c, B:37:0x0150, B:39:0x0156, B:41:0x0164, B:46:0x0120, B:47:0x0204, B:48:0x0209, B:50:0x0070, B:52:0x00a5, B:54:0x00ab, B:55:0x00b4, B:60:0x020e, B:61:0x0236, B:62:0x023b, B:64:0x007a, B:67:0x0083), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[Catch: Exception -> 0x023d, CancellationException -> 0x0269, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0269, Exception -> 0x023d, blocks: (B:9:0x002d, B:16:0x004c, B:18:0x0196, B:20:0x019c, B:25:0x01d4, B:26:0x01fe, B:27:0x0203, B:29:0x005d, B:31:0x00ee, B:34:0x00f4, B:36:0x013c, B:37:0x0150, B:39:0x0156, B:41:0x0164, B:46:0x0120, B:47:0x0204, B:48:0x0209, B:50:0x0070, B:52:0x00a5, B:54:0x00ab, B:55:0x00b4, B:60:0x020e, B:61:0x0236, B:62:0x023b, B:64:0x007a, B:67:0x0083), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156 A[Catch: Exception -> 0x023d, CancellationException -> 0x0269, LOOP:0: B:37:0x0150->B:39:0x0156, LOOP_END, TryCatch #2 {CancellationException -> 0x0269, Exception -> 0x023d, blocks: (B:9:0x002d, B:16:0x004c, B:18:0x0196, B:20:0x019c, B:25:0x01d4, B:26:0x01fe, B:27:0x0203, B:29:0x005d, B:31:0x00ee, B:34:0x00f4, B:36:0x013c, B:37:0x0150, B:39:0x0156, B:41:0x0164, B:46:0x0120, B:47:0x0204, B:48:0x0209, B:50:0x0070, B:52:0x00a5, B:54:0x00ab, B:55:0x00b4, B:60:0x020e, B:61:0x0236, B:62:0x023b, B:64:0x007a, B:67:0x0083), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1 fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1;
        java.util.List list;
        int i;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase;
        java.lang.Object invoke$default;
        java.lang.Object obj2;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel;
        com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase generateRiskDataUseCase;
        java.lang.Object invoke;
        java.util.List list2;
        java.lang.Object obj3;
        int i2;
        arrow.core.Either either;
        java.lang.String str;
        java.util.Iterator it;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase;
        java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType> list3;
        java.lang.Object invoke2;
        java.util.List list4;
        java.util.List list5;
        arrow.core.Either either2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getOutputSizeshNQ4ISI;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(" failed");
            logger.e(sb.toString(), e2);
            this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(null, this.Camera2StreamConfigurationMap));
        }
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1 = this;
            list = this.getHighResolutionOutputSizeshNQ4ISI;
            i = 0;
            if (list == null) {
                com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel2 = this.getOutputStallDuration;
                payPalGetAllCardsUseCase = fiSelectorViewModel2.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1);
                this.getInputSizeshNQ4ISI = fiSelectorViewModel2;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getOutputSizeshNQ4ISI = 1;
                invoke$default = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase.invoke$default(payPalGetAllCardsUseCase, false, false, this, 3, null);
                if (invoke$default != coroutine_suspended) {
                    obj2 = fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1;
                    fiSelectorViewModel = fiSelectorViewModel2;
                }
                return coroutine_suspended;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Fetched digitized cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
            generateRiskDataUseCase = this.getOutputStallDuration.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1);
            this.getInputSizeshNQ4ISI = list;
            this.getHighSpeedVideoSizes = i;
            this.getOutputSizeshNQ4ISI = 2;
            invoke = generateRiskDataUseCase.invoke(this);
            if (invoke != coroutine_suspended) {
                list2 = list;
                obj3 = fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1;
                i2 = i;
                either = (arrow.core.Either) invoke;
                if (!(either instanceof arrow.core.Either.Right)) {
                }
                java.util.List list6 = list2;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list6, 10));
                it = list6.iterator();
                while (it.hasNext()) {
                }
                java.util.ArrayList arrayList2 = arrayList;
                payPalGetCardEligibilityUseCase = this.getOutputStallDuration.Camera2StreamConfigurationMap;
                list3 = this.getOutputStallDuration.getInputFormats;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList2);
                this.getInputFormats = list2;
                this.getHighSpeedVideoSizes = i2;
                this.getOutputSizeshNQ4ISI = 3;
                invoke2 = payPalGetCardEligibilityUseCase.invoke(arrayList2, str, list3, this);
                if (invoke2 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                i2 = this.getHighSpeedVideoSizes;
                list5 = (java.util.List) this.getInputFormats;
                list4 = (java.util.List) this.getOutputFormats;
                str = (java.lang.String) this.getInputSizeshNQ4ISI;
                obj3 = (kotlin.coroutines.Continuation) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                invoke2 = obj;
                either2 = (arrow.core.Either) invoke2;
                if (!(either2 instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel3 = this.getOutputStallDuration;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult cardEligibilityResult = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult) ((arrow.core.Either.Right) either2).getValue();
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list4);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list5);
                    this.getHighSpeedVideoSizes = i2;
                    this.getOutputSizeshNQ4ISI = 4;
                } else {
                    if (!(either2 instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to fetch card eligibility", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((arrow.core.Either.Left) either2).getValue())), null, 4, null);
                    this.getOutputStallDuration.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(null, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.TERMINAL_ERROR));
                }
                return kotlin.Unit.INSTANCE;
            }
            i2 = this.getHighSpeedVideoSizes;
            java.util.List list7 = (java.util.List) this.getInputSizeshNQ4ISI;
            java.lang.Object obj4 = (kotlin.coroutines.Continuation) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            obj3 = obj4;
            list2 = list7;
            invoke = obj;
            either = (arrow.core.Either) invoke;
            if (!(either instanceof arrow.core.Either.Right)) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Risk clientMetadataId generated", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("pairingId", ((arrow.core.Either.Right) either).getValue())), null, 4, null);
                str = (java.lang.String) ((arrow.core.Either.Right) either).getValue();
            } else {
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to generate risk pairing ID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((arrow.core.Either.Left) either).getValue())), null, 4, null);
                str = null;
            }
            java.util.List list62 = list2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list62, 10));
            it = list62.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) it.next()).getDeviceWalletServiceCardId());
            }
            java.util.ArrayList arrayList22 = arrayList3;
            payPalGetCardEligibilityUseCase = this.getOutputStallDuration.Camera2StreamConfigurationMap;
            list3 = this.getOutputStallDuration.getInputFormats;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList22);
            this.getInputFormats = list2;
            this.getHighSpeedVideoSizes = i2;
            this.getOutputSizeshNQ4ISI = 3;
            invoke2 = payPalGetCardEligibilityUseCase.invoke(arrayList22, str, list3, this);
            if (invoke2 != coroutine_suspended) {
                java.util.List list8 = list2;
                list4 = arrayList22;
                list5 = list8;
                either2 = (arrow.core.Either) invoke2;
                if (!(either2 instanceof arrow.core.Either.Right)) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        int i4 = this.getHighSpeedVideoSizes;
        fiSelectorViewModel = (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel) this.getInputSizeshNQ4ISI;
        obj2 = (kotlin.coroutines.Continuation) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        i = i4;
        invoke$default = obj;
        arrow.core.Either either3 = (arrow.core.Either) invoke$default;
        if (!(either3 instanceof arrow.core.Either.Right)) {
            if (!(either3 instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to fetch digitized cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((arrow.core.Either.Left) either3).getValue())), null, 4, null);
            fiSelectorViewModel.getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorUiState.Error(null, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.TERMINAL_ERROR));
            return kotlin.Unit.INSTANCE;
        }
        list = (java.util.List) ((arrow.core.Either.Right) either3).getValue();
        fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1 = obj2;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Fetched digitized cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
        generateRiskDataUseCase = this.getOutputStallDuration.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1);
        this.getInputSizeshNQ4ISI = list;
        this.getHighSpeedVideoSizes = i;
        this.getOutputSizeshNQ4ISI = 2;
        invoke = generateRiskDataUseCase.invoke(this);
        if (invoke != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDurationlomOqCM, this.Camera2StreamConfigurationMap, continuation, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiSelectorViewModel$loadCardEligibility$$inlined$launchSafe$default$1(java.lang.String str, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType, kotlin.coroutines.Continuation continuation, java.util.List list, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.FiSelectorViewModel fiSelectorViewModel2) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getOutputMinFrameDurationlomOqCM = fiSelectorViewModel;
        this.Camera2StreamConfigurationMap = fiSelectorErrorType;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getOutputStallDuration = fiSelectorViewModel2;
    }
}
