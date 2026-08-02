package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$2$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ObserveShippingAddresses$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress shippingAddress;
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveShippingAddresses$lambda$0(this.getHighSpeedVideoFpsRanges).getUpdateReceiverAttempt();
        if (updateReceiverAttempt == null) {
            return kotlin.Unit.INSTANCE;
        }
        int hashCode = updateReceiverAttempt.hashCode();
        java.lang.Integer access$ObserveShippingAddresses$lambda$4 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveShippingAddresses$lambda$4(this.getHighSpeedVideoFpsRangesFor);
        if (access$ObserveShippingAddresses$lambda$4 != null && hashCode == access$ObserveShippingAddresses$lambda$4.intValue()) {
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoFpsRangesFor.setValue(kotlin.coroutines.jvm.internal.Boxing.boxInt(hashCode));
        java.lang.String selectedShippingAddressId = updateReceiverAttempt.getSelectedShippingAddressId();
        if (selectedShippingAddressId == null) {
            java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> shippingAddresses = updateReceiverAttempt.getShippingAddresses();
            if (shippingAddresses != null) {
                java.util.Iterator<T> it = shippingAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) obj2).isDefault()) {
                        break;
                    }
                }
                com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress shippingAddress2 = (com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) obj2;
                if (shippingAddress2 != null) {
                    selectedShippingAddressId = shippingAddress2.getId();
                    if (selectedShippingAddressId == null) {
                        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> shippingAddresses2 = updateReceiverAttempt.getShippingAddresses();
                        selectedShippingAddressId = (shippingAddresses2 == null || (shippingAddress = (com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) shippingAddresses2)) == null) ? null : shippingAddress.getId();
                    }
                }
            }
            selectedShippingAddressId = null;
            if (selectedShippingAddressId == null) {
            }
        }
        this.Camera2StreamConfigurationMap.getShippingAccordionViewModel().syncFromBackend(updateReceiverAttempt.getShippingAddresses(), selectedShippingAddressId);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenKt$ObserveShippingAddresses$2$1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState> state, androidx.compose.runtime.MutableState<java.lang.Integer> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = reviewScreenViewModels;
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
