package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleAddressValidationError$1", f = "PersonalInfoViewModel.kt", i = {0}, l = {369}, m = "invokeSuspend", n = {"addressWithoutCountry"}, nl = {com.knotapi.knot.utilities.Constants.ID_KROGER}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$handleAddressValidationError$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Address getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter;
        java.lang.Object preformatBillingAddress;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            m11247copye42MVwM = r4.m11247copye42MVwM((r22 & 1) != 0 ? r4.addressLine1 : null, (r22 & 2) != 0 ? r4.addressLine2 : null, (r22 & 4) != 0 ? r4.addressLine3 : null, (r22 & 8) != 0 ? r4.adminArea4 : null, (r22 & 16) != 0 ? r4.adminArea3 : null, (r22 & 32) != 0 ? r4.adminArea2 : null, (r22 & 64) != 0 ? r4.adminArea1 : null, (r22 & 128) != 0 ? r4.postalCode : null, (r22 & 256) != 0 ? r4.countryCode : null, (r22 & 512) != 0 ? this.getHighResolutionOutputSizeshNQ4ISI.detail : null);
            addressFormatter = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11247copye42MVwM);
            this.getHighSpeedVideoSizes = 1;
            preformatBillingAddress = addressFormatter.preformatBillingAddress(m11247copye42MVwM, this);
            if (preformatBillingAddress == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            preformatBillingAddress = obj;
        }
        this.getHighSpeedVideoFpsRangesFor.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived(this.Camera2StreamConfigurationMap, (java.lang.String) preformatBillingAddress, this.getHighResolutionOutputSizeshNQ4ISI));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleAddressValidationError$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleAddressValidationError$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$handleAddressValidationError$1(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleAddressValidationError$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = address;
        this.getHighSpeedVideoFpsRangesFor = personalInfoViewModel;
        this.Camera2StreamConfigurationMap = personalInfoUiModel;
    }
}
