package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$loadBusinessAgreements$1", f = "BusinessesHubViewModel.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {113, 132}, m = "invokeSuspend", n = {"this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$fold", "$i$a$-fold-BusinessesHubViewModel$loadBusinessAgreements$1$2", "$i$f$map", "$i$f$mapTo", "$i$a$-map-BusinessesHubViewModel$loadBusinessAgreements$1$2$1"}, nl = {166, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {"L$0", "L$2", "L$3", "L$5", "L$6", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class BusinessesHubViewModel$loadBusinessAgreements$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel toString;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x017f -> B:6:0x0187). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase getLinkedBusinessesUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel;
        com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability businessesWithAvailability;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        int i2;
        int i3;
        arrow.core.Either either;
        int i4;
        com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState zeroState;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i5 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.toString.getState().getValue() instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Loading) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "linked businesses is already fetching...", null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Loading linked businesses", null, null, 6, null);
            mutableStateFlow = this.toString.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Loading.INSTANCE);
            getLinkedBusinessesUseCase = this.toString.getHighResolutionOutputSizeshNQ4ISI;
            this.getValidOutputFormatsForInputhNQ4ISI = 1;
            invoke = getLinkedBusinessesUseCase.invoke(this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i5 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        } else {
            if (i5 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.getHighSpeedVideoFpsRangesFor;
            i = this.Camera2StreamConfigurationMap;
            i2 = this.getHighSpeedVideoSizes;
            i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            arrayList = (java.util.Collection) this.getHighSpeedVideoSizesFor;
            java.util.Iterator it2 = (java.util.Iterator) this.getOutputStallDuration;
            java.util.Collection collection = (java.util.Collection) this.getOutputMinFrameDurationlomOqCM;
            java.lang.Object obj4 = (java.lang.Iterable) this.getOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5 = (kotlinx.coroutines.flow.MutableStateFlow) this.getOutputStallDurationlomOqCM;
            java.lang.Object obj5 = (java.lang.Iterable) this.getOutputMinFrameDuration;
            com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability businessesWithAvailability2 = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability) this.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel2 = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel) this.getInputFormats;
            either = (arrow.core.Either) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel3 = businessesHubViewModel2;
            com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability businessesWithAvailability3 = businessesWithAvailability2;
            java.lang.Object obj6 = obj5;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6 = mutableStateFlow5;
            java.lang.Object obj7 = obj4;
            java.util.Iterator it3 = it2;
            java.util.Collection collection2 = collection;
            char c = 2;
            java.lang.Object obj8 = coroutine_suspended;
            java.lang.Object uiModel = obj;
            arrayList.add((com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel) uiModel);
            coroutine_suspended = obj8;
            arrayList = collection2;
            it = it3;
            obj2 = obj7;
            mutableStateFlow4 = mutableStateFlow6;
            obj3 = obj6;
            businessesWithAvailability = businessesWithAvailability3;
            businessesHubViewModel = businessesHubViewModel3;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem linkedBusinessAgreementItem = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem) next;
                java.lang.Object obj9 = coroutine_suspended;
                formatHelper = businessesHubViewModel.Camera2StreamConfigurationMap;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputFormats = businessesHubViewModel;
                this.getInputSizeshNQ4ISI = businessesWithAvailability;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                this.getOutputStallDurationlomOqCM = mutableStateFlow4;
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                this.getOutputMinFrameDurationlomOqCM = arrayList;
                this.getOutputStallDuration = it;
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.isOutputSupportedFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkedBusinessAgreementItem);
                this.getHighSpeedVideoSizesFor = arrayList;
                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                this.getHighSpeedVideoSizes = i2;
                this.Camera2StreamConfigurationMap = i;
                this.getHighSpeedVideoFpsRangesFor = i4;
                this.getHighSpeedVideoFpsRanges = 0;
                c = 2;
                this.getValidOutputFormatsForInputhNQ4ISI = 2;
                uiModel = com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt.toUiModel(linkedBusinessAgreementItem, formatHelper, this);
                obj8 = obj9;
                if (uiModel == obj8) {
                    return obj8;
                }
                businessesHubViewModel3 = businessesHubViewModel;
                businessesWithAvailability3 = businessesWithAvailability;
                obj6 = obj3;
                mutableStateFlow6 = mutableStateFlow4;
                obj7 = obj2;
                it3 = it;
                collection2 = arrayList;
                arrayList.add((com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel) uiModel);
                coroutine_suspended = obj8;
                arrayList = collection2;
                it = it3;
                obj2 = obj7;
                mutableStateFlow4 = mutableStateFlow6;
                obj3 = obj6;
                businessesWithAvailability = businessesWithAvailability3;
                businessesHubViewModel = businessesHubViewModel3;
                if (it.hasNext()) {
                    zeroState = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList((java.util.List) arrayList, businessesWithAvailability.getShouldShowLinkEntryPoints());
                    mutableStateFlow3 = mutableStateFlow4;
                    mutableStateFlow3.setValue(zeroState);
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        arrow.core.Either either2 = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel4 = this.toString;
        if (either2 instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability businessesWithAvailability4 = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability) ((arrow.core.Either.Right) either2).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Linked businesses loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(businessesWithAvailability4.getBusinesses().size())), kotlin.TuplesKt.to("shouldShowLinkEntryPoints", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(businessesWithAvailability4.getShouldShowLinkEntryPoints()))), null, 4, null);
            mutableStateFlow3 = businessesHubViewModel4.getHighSpeedVideoFpsRangesFor;
            if (businessesWithAvailability4.getBusinesses().isEmpty()) {
                zeroState = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState(businessesWithAvailability4.getShouldShowLinkEntryPoints());
                mutableStateFlow3.setValue(zeroState);
                return kotlin.Unit.INSTANCE;
            }
            java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> businesses = businessesWithAvailability4.getBusinesses();
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(businesses, 10));
            it = businesses.iterator();
            mutableStateFlow4 = mutableStateFlow3;
            businessesHubViewModel = businessesHubViewModel4;
            businessesWithAvailability = businessesWithAvailability4;
            obj2 = businesses;
            obj3 = obj2;
            i = 0;
            i2 = 0;
            i3 = 0;
            either = either2;
            i4 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (either2 instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Either.Left) either2).getValue();
                mutableStateFlow2 = businessesHubViewModel4.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error(subscriptionsError.toErrorContext()));
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$loadBusinessAgreements$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$loadBusinessAgreements$1(this.toString, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessesHubViewModel$loadBusinessAgreements$1(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel$loadBusinessAgreements$1> continuation) {
        super(2, continuation);
        this.toString = businessesHubViewModel;
    }
}
