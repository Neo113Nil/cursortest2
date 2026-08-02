package com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1", f = "SubscriptionsHubViewModel.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {121, 135}, m = "invokeSuspend", n = {"this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$fold", "$i$a$-fold-SubscriptionsHubViewModel$loadSubscriptions$1$2", "$i$f$map", "$i$f$mapTo", "$i$a$-map-SubscriptionsHubViewModel$loadSubscriptions$1$2$1"}, nl = {148, 152}, s = {"L$0", "L$2", "L$3", "L$5", "L$6", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class SubscriptionsHubViewModel$loadSubscriptions$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
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
    java.lang.Object toString;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel unwrapAs;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0168 -> B:6:0x0170). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase getSubscriptionsUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel;
        com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability subscriptionsWithAvailability;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        int i2;
        int i3;
        arrow.core.Either either;
        int i4;
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i5 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Loading subscriptions", null, null, 6, null);
            mutableStateFlow = this.unwrapAs.Camera2StreamConfigurationMap;
            if (!(mutableStateFlow.getValue() instanceof com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Loading)) {
                mutableStateFlow2 = this.unwrapAs.Camera2StreamConfigurationMap;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Loading.INSTANCE);
                getSubscriptionsUseCase = this.unwrapAs.getHighSpeedVideoFpsRanges;
                this.getValidOutputFormatsForInputhNQ4ISI = 1;
                invoke = getSubscriptionsUseCase.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Already loading subscriptions, skipping", null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
        } else if (i5 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        } else {
            if (i5 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.getHighSpeedVideoSizes;
            i = this.getHighSpeedVideoFpsRanges;
            i2 = this.getHighSpeedVideoFpsRangesFor;
            i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            arrayList = (java.util.Collection) this.getOutputMinFrameDuration;
            java.util.Iterator it2 = (java.util.Iterator) this.getOutputMinFrameDurationlomOqCM;
            java.util.Collection collection = (java.util.Collection) this.getOutputSizeshNQ4ISI;
            java.lang.Object obj4 = (java.lang.Iterable) this.getOutputStallDuration;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6 = (kotlinx.coroutines.flow.MutableStateFlow) this.getOutputStallDurationlomOqCM;
            java.lang.Object obj5 = (java.lang.Iterable) this.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability subscriptionsWithAvailability2 = (com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability) this.getInputFormats;
            com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel2 = (com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel) this.getOutputFormats;
            either = (arrow.core.Either) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel3 = subscriptionsHubViewModel2;
            com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability subscriptionsWithAvailability3 = subscriptionsWithAvailability2;
            java.lang.Object obj6 = obj5;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7 = mutableStateFlow6;
            java.lang.Object obj7 = obj4;
            java.util.Iterator it3 = it2;
            java.util.Collection collection2 = collection;
            char c = 2;
            java.lang.Object obj8 = coroutine_suspended;
            java.lang.Object uiModel = obj;
            arrayList.add((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) uiModel);
            coroutine_suspended = obj8;
            arrayList = collection2;
            it = it3;
            obj2 = obj7;
            mutableStateFlow5 = mutableStateFlow7;
            obj3 = obj6;
            subscriptionsWithAvailability = subscriptionsWithAvailability3;
            subscriptionsHubViewModel = subscriptionsHubViewModel3;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem subscriptionItem = (com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem) next;
                java.lang.Object obj9 = coroutine_suspended;
                formatHelper = subscriptionsHubViewModel.getHighSpeedVideoSizes;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = subscriptionsHubViewModel;
                this.getInputFormats = subscriptionsWithAvailability;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                this.getOutputStallDurationlomOqCM = mutableStateFlow5;
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                this.getOutputSizeshNQ4ISI = arrayList;
                this.getOutputMinFrameDurationlomOqCM = it;
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                this.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(subscriptionItem);
                this.getOutputMinFrameDuration = arrayList;
                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                this.getHighSpeedVideoFpsRangesFor = i2;
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighSpeedVideoSizes = i4;
                this.Camera2StreamConfigurationMap = 0;
                c = 2;
                this.getValidOutputFormatsForInputhNQ4ISI = 2;
                uiModel = com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt.toUiModel(subscriptionItem, formatHelper, this);
                obj8 = obj9;
                if (uiModel == obj8) {
                    return obj8;
                }
                subscriptionsHubViewModel3 = subscriptionsHubViewModel;
                subscriptionsWithAvailability3 = subscriptionsWithAvailability;
                obj6 = obj3;
                mutableStateFlow7 = mutableStateFlow5;
                obj7 = obj2;
                it3 = it;
                collection2 = arrayList;
                arrayList.add((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) uiModel);
                coroutine_suspended = obj8;
                arrayList = collection2;
                it = it3;
                obj2 = obj7;
                mutableStateFlow5 = mutableStateFlow7;
                obj3 = obj6;
                subscriptionsWithAvailability = subscriptionsWithAvailability3;
                subscriptionsHubViewModel = subscriptionsHubViewModel3;
                if (it.hasNext()) {
                    mutableStateFlow5.setValue(new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Success((java.util.List) arrayList, subscriptionsWithAvailability.getShouldShowLinkEntryPoints()));
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        arrow.core.Either either2 = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel4 = this.unwrapAs;
        if (either2 instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability subscriptionsWithAvailability4 = (com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability) ((arrow.core.Either.Right) either2).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Subscriptions loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(subscriptionsWithAvailability4.getSubscriptions().size())), kotlin.TuplesKt.to("shouldShowLinkEntryPoints", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(subscriptionsWithAvailability4.getShouldShowLinkEntryPoints()))), null, 4, null);
            mutableStateFlow4 = subscriptionsHubViewModel4.Camera2StreamConfigurationMap;
            java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> subscriptions = subscriptionsWithAvailability4.getSubscriptions();
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subscriptions, 10));
            it = subscriptions.iterator();
            mutableStateFlow5 = mutableStateFlow4;
            subscriptionsHubViewModel = subscriptionsHubViewModel4;
            subscriptionsWithAvailability = subscriptionsWithAvailability4;
            obj2 = subscriptions;
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
                mutableStateFlow3 = subscriptionsHubViewModel4.Camera2StreamConfigurationMap;
                mutableStateFlow3.setValue(new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionsHubUiState.Error(subscriptionsError.toErrorContext()));
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1(this.unwrapAs, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionsHubViewModel$loadSubscriptions$1(com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel subscriptionsHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel$loadSubscriptions$1> continuation) {
        super(2, continuation);
        this.unwrapAs = subscriptionsHubViewModel;
    }
}
