package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel$loadBulkUpdateFiData$1", f = "BulkUpdateFiViewModel.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {65, 73}, m = "invokeSuspend", n = {"result", "this_$iv", "bulkUpdateFiDataList", "$this$mapNotNull$iv", "$this$mapNotNullTo$iv$iv", "destination$iv$iv", "$this$forEach$iv$iv$iv", "element$iv$iv$iv", "element$iv$iv", "it", "$i$f$fold", "$i$a$-fold-BulkUpdateFiViewModel$loadBulkUpdateFiData$1$2", "$i$f$mapNotNull", "$i$f$mapNotNullTo", "$i$f$forEach", "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv", "$i$a$-mapNotNull-BulkUpdateFiViewModel$loadBulkUpdateFiData$1$2$1"}, nl = {66, 200}, s = {"L$0", "L$1", "L$3", "L$4", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6"}, v = 2)
/* loaded from: classes15.dex */
final class BulkUpdateFiViewModel$loadBulkUpdateFiData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel ArtificialStackFrames;
    int Camera2StreamConfigurationMap;
    java.lang.Object CoroutineDebuggingKt;
    int accessartificialFrame;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    java.lang.Object unwrapAs;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x015d  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0153 -> B:6:0x0159). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase getConsumerAgreementsByFundingInstrumentUseCase;
        java.lang.Object invoke;
        arrow.core.Either either;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.util.List list;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i;
        int i2;
        int i3;
        int i4;
        arrow.core.Either either2;
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel;
        int i5;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.accessartificialFrame;
        if (i6 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.ArtificialStackFrames.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Loading.INSTANCE);
            getConsumerAgreementsByFundingInstrumentUseCase = this.ArtificialStackFrames.getHighSpeedVideoSizes;
            this.accessartificialFrame = 1;
            invoke = getConsumerAgreementsByFundingInstrumentUseCase.invoke(this.getHighSpeedVideoFpsRanges, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i6 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        } else {
            if (i6 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = this.getOutputMinFrameDuration;
            int i8 = this.Camera2StreamConfigurationMap;
            int i9 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i10 = this.getHighSpeedVideoFpsRangesFor;
            int i11 = this.getHighSpeedVideoSizes;
            java.util.Iterator it2 = (java.util.Iterator) this.CoroutineDebuggingKt;
            java.lang.Object obj5 = (java.lang.Iterable) this.unwrapAs;
            ?? r11 = (java.util.Collection) this.isOutputSupportedForhNQ4ISI;
            java.lang.Object obj6 = (java.lang.Iterable) this.isOutputSupportedFor;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5 = (kotlinx.coroutines.flow.MutableStateFlow) this.getValidOutputFormatsForInputhNQ4ISI;
            java.lang.Object obj7 = (java.lang.Iterable) this.toString;
            java.util.List list2 = (java.util.List) this.getOutputStallDuration;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel2 = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel) this.getOutputStallDurationlomOqCM;
            arrow.core.Either either3 = (arrow.core.Either) this.getInputSizeshNQ4ISI;
            int i12 = i7;
            arrow.core.Either either4 = (arrow.core.Either) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List list3 = list2;
            obj4 = obj7;
            mutableStateFlow4 = mutableStateFlow5;
            obj3 = obj6;
            arrayList = r11;
            obj2 = obj5;
            it = it2;
            i4 = i11;
            i3 = i10;
            i2 = i9;
            either2 = either3;
            bulkUpdateFiViewModel = bulkUpdateFiViewModel2;
            i = i8;
            arrow.core.Either either5 = either4;
            java.lang.Object obj8 = coroutine_suspended;
            java.lang.Object uiModel = obj;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel bulkUpdateFiDataUiModel = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel) uiModel;
            if (bulkUpdateFiDataUiModel != null) {
                arrayList.add(bulkUpdateFiDataUiModel);
            }
            coroutine_suspended = obj8;
            either = either5;
            i5 = i12;
            list = list3;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                java.lang.Object obj9 = coroutine_suspended;
                com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData bulkUpdateFiData = (com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData) next;
                int i13 = i5;
                formatHelper = bulkUpdateFiViewModel.Camera2StreamConfigurationMap;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                this.getOutputStallDurationlomOqCM = bulkUpdateFiViewModel;
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                this.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                this.getValidOutputFormatsForInputhNQ4ISI = mutableStateFlow4;
                this.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                this.isOutputSupportedForhNQ4ISI = arrayList;
                this.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                this.CoroutineDebuggingKt = it;
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bulkUpdateFiData);
                this.getHighSpeedVideoSizes = i4;
                this.getHighSpeedVideoFpsRangesFor = i3;
                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                this.Camera2StreamConfigurationMap = i;
                this.getOutputMinFrameDuration = i13;
                arrow.core.Either either6 = either;
                this.getHighSpeedVideoSizesFor = 0;
                this.getOutputFormats = 0;
                this.accessartificialFrame = 2;
                uiModel = com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt.toUiModel(bulkUpdateFiData, formatHelper, this);
                obj8 = obj9;
                if (uiModel == obj8) {
                    return obj8;
                }
                list3 = list;
                i12 = i13;
                either5 = either6;
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel bulkUpdateFiDataUiModel2 = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModel) uiModel;
                if (bulkUpdateFiDataUiModel2 != null) {
                }
                coroutine_suspended = obj8;
                either = either5;
                i5 = i12;
                list = list3;
                if (it.hasNext()) {
                    mutableStateFlow4.setValue(new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Success(arrayList, null, 2, null));
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel3 = this.ArtificialStackFrames;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list4 = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Bulk update FI data loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list4.size()))), null, 4, null);
            mutableStateFlow3 = bulkUpdateFiViewModel3.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List list5 = list4;
            list = list4;
            mutableStateFlow4 = mutableStateFlow3;
            obj2 = list5;
            obj3 = obj2;
            obj4 = obj3;
            arrayList = new java.util.ArrayList();
            it = list5.iterator();
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            either2 = either;
            bulkUpdateFiViewModel = bulkUpdateFiViewModel3;
            i5 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Either.Left) either).getValue();
                mutableStateFlow2 = bulkUpdateFiViewModel3.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiState.Error(subscriptionsError.toErrorContext()));
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel$loadBulkUpdateFiData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel$loadBulkUpdateFiData$1(this.ArtificialStackFrames, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BulkUpdateFiViewModel$loadBulkUpdateFiData$1(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel$loadBulkUpdateFiData$1> continuation) {
        super(2, continuation);
        this.ArtificialStackFrames = bulkUpdateFiViewModel;
        this.getHighSpeedVideoFpsRanges = agreementType;
    }
}
