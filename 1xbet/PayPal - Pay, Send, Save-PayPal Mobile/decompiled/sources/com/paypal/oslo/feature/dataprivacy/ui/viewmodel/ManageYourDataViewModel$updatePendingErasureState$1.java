package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel", f = "ManageYourDataViewModel.kt", i = {}, l = {83}, m = "updatePendingErasureState$data_privacy_prodRelease", n = {}, nl = {84}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ManageYourDataViewModel$updatePendingErasureState$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.updatePendingErasureState$data_privacy_prodRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageYourDataViewModel$updatePendingErasureState$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel manageYourDataViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$updatePendingErasureState$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = manageYourDataViewModel;
    }
}
