package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$formatSavedAddress$1", f = "PersonalInfoViewModel.kt", i = {0, 1, 1, 1, 1}, l = {225, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m = "invokeSuspend", n = {"defaultAddress", "defaultAddress", "billingAddress", "userAddresses", "addresses"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 236}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$formatSavedAddress$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address billingAddress;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter;
        java.lang.Object formatMultiline;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication creditApplication;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter2;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter3;
        java.lang.Object preformatAddressList;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.BillingAddressUserInfoModel billingAddressUserInfoModel;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication creditApplication2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list2 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccess success = this.getHighResolutionOutputSizeshNQ4ISI.getSuccess();
            billingAddress = (success == null || (creditApplication = success.getCreditApplication()) == null) ? null : creditApplication.getBillingAddress();
            addressFormatter = this.getOutputFormats.getInputFormats;
            this.getHighSpeedVideoFpsRangesFor = billingAddress;
            this.getInputSizeshNQ4ISI = 1;
            formatMultiline = addressFormatter.formatMultiline(billingAddress, this);
            if (formatMultiline == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.BillingAddressUserInfoModel billingAddressUserInfoModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.BillingAddressUserInfoModel) this.getInputFormats;
                com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel) this.getOutputMinFrameDuration;
                java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> list3 = (java.util.List) this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                billingAddressUserInfoModel = billingAddressUserInfoModel2;
                list = list3;
                address = address2;
                preformatAddressList = obj;
                personalInfoUiModel = personalInfoUiModel2;
                this.getOutputFormats.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(personalInfoUiModel, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, billingAddressUserInfoModel, null, null, list, (java.util.List) preformatAddressList, address, false, false, false, false, null, null, null, null, 535003135, null)));
                return kotlin.Unit.INSTANCE;
            }
            billingAddress = (com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            formatMultiline = obj;
        }
        java.lang.String str = (java.lang.String) formatMultiline;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccess success2 = this.getHighResolutionOutputSizeshNQ4ISI.getSuccess();
        if (success2 != null && (creditApplication2 = success2.getCreditApplication()) != null) {
            list2 = creditApplication2.getAddresses();
        }
        addressFormatter2 = this.getOutputFormats.getInputFormats;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> addressesI18n = addressFormatter2.toAddressesI18n(list2);
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel updateFormFieldValueById = this.Camera2StreamConfigurationMap.updateFormFieldValueById(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BILLING_ADDRESS, str);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.BillingAddressUserInfoModel copy$default = com.paypal.oslo.feature.bnplacquisition.ui.common.components.BillingAddressUserInfoModel.copy$default(this.Camera2StreamConfigurationMap.getBillingAddressUserInfoModel(), null, str, null, 5, null);
        addressFormatter3 = this.getOutputFormats.getInputFormats;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> emptyList = list2 == null ? kotlin.collections.CollectionsKt.emptyList() : list2;
        this.getHighSpeedVideoFpsRangesFor = billingAddress;
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
        this.getHighSpeedVideoSizesFor = addressesI18n;
        this.getOutputMinFrameDuration = updateFormFieldValueById;
        this.getInputFormats = copy$default;
        this.getInputSizeshNQ4ISI = 2;
        preformatAddressList = addressFormatter3.preformatAddressList(emptyList, this);
        if (preformatAddressList == coroutine_suspended) {
            return coroutine_suspended;
        }
        address = billingAddress;
        billingAddressUserInfoModel = copy$default;
        list = addressesI18n;
        personalInfoUiModel = updateFormFieldValueById;
        this.getOutputFormats.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressFormatted(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel.copy$default(personalInfoUiModel, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, billingAddressUserInfoModel, null, null, list, (java.util.List) preformatAddressList, address, false, false, false, false, null, null, null, null, 535003135, null)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$formatSavedAddress$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$formatSavedAddress$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$formatSavedAddress$1(com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress saveAddress, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$formatSavedAddress$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = saveAddress;
        this.getOutputFormats = personalInfoViewModel;
        this.Camera2StreamConfigurationMap = personalInfoUiModel;
    }
}
