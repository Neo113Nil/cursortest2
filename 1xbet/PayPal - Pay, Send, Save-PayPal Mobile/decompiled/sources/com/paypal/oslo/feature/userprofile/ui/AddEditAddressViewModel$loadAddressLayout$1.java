package com.paypal.oslo.feature.userprofile.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel$loadAddressLayout$1", f = "AddEditAddressViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m = "invokeSuspend", n = {}, nl = {171}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditAddressViewModel$loadAddressLayout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase;
        com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler addressErrorHandler;
        java.util.Map map;
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.toString = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Loading.INSTANCE);
            getAddressLayoutUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase.invoke$default(getAddressLayoutUseCase, this.getHighResolutionOutputSizeshNQ4ISI, null, null, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.Pair pair = (kotlin.Pair) obj;
        com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) pair.component1();
        java.lang.String str2 = (java.lang.String) pair.component2();
        if (addressLayout == null) {
            addressErrorHandler = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            com.paypal.oslo.feature.userprofile.ui.AddressFormUiState mapAddressLayoutError = addressErrorHandler.mapAddressLayoutError(str2);
            if (str2 != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "NoInternet", false, 2, (java.lang.Object) null)) {
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackNetworkError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getAddress(), com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel.access$getAnalyticsScreenName(this.getHighSpeedVideoFpsRangesFor), "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.ErrorCodes.LAYOUT_LOAD_FAILED, null, "Failed to load address layout: no internet", null, null, 104, null);
            } else {
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getAddress(), com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel.access$getAnalyticsScreenName(this.getHighSpeedVideoFpsRangesFor), "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.AddressManagement.ErrorCodes.LAYOUT_LOAD_FAILED, null, "Failed to load address layout. ".concat(java.lang.String.valueOf(str2)), null, null, 104, null);
            }
            this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.setValue(mapAddressLayoutError);
        } else {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row> rows = addressLayout.getRows();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) it.next()).getComponents());
            }
            java.util.ArrayList<com.paypal.oslo.core.i18n.domain.model.AddressComponent> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (!((com.paypal.oslo.core.i18n.domain.model.AddressComponent) obj2).getHidden()) {
                    arrayList2.add(obj2);
                }
            }
            com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel addEditAddressViewModel = this.getHighSpeedVideoFpsRangesFor;
            for (com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent : arrayList2) {
                map = addEditAddressViewModel.isOutputSupportedForhNQ4ISI;
                java.lang.String fieldKey = com.paypal.oslo.feature.userprofile.ui.utils.AddressUtilsKt.getFieldKey(addressComponent.getField());
                java.lang.String label = addressComponent.getLabel();
                java.lang.String str3 = "";
                if (label != null) {
                    str = label.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                } else {
                    str = null;
                }
                if (str != null) {
                    str3 = str;
                }
                map.put(fieldKey, str3);
            }
            this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.userprofile.ui.AddressFormUiState.Success(addressLayout, this.getHighResolutionOutputSizeshNQ4ISI));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel$loadAddressLayout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel$loadAddressLayout$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditAddressViewModel$loadAddressLayout$1(com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel addEditAddressViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel$loadAddressLayout$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addEditAddressViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
