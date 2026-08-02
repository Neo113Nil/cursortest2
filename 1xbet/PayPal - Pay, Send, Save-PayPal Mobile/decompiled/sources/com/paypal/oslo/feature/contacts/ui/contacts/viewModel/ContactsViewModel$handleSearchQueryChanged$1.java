package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleSearchQueryChanged$1", f = "ContactsViewModel.kt", i = {}, l = {372}, m = "invokeSuspend", n = {}, nl = {373}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactsViewModel$handleSearchQueryChanged$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            phoneNumberDisplayFormatter = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = phoneNumberDisplayFormatter.processInput(this.getHighResolutionOutputSizeshNQ4ISI.getQuery(), true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.FormattingResult formattingResult = (com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.FormattingResult) obj;
        mviStateStore = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi selectedCountry = ((com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState) mviStateStore.getUiState().getValue()).getPhoneInput().getSelectedCountry();
        java.lang.String str = null;
        if (selectedCountry == null) {
            java.lang.String countryCode = formattingResult.getCountryCode();
            if (countryCode != null) {
                mviStateStore3 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                java.util.Iterator it = ((com.paypal.oslo.feature.contacts.ui.contacts.state.ContactsState) mviStateStore3.getUiState().getValue()).getPhoneInput().getAllCountries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        countryUi = 0;
                        break;
                    }
                    countryUi = it.next();
                    if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi) countryUi).getId(), countryCode, true)) {
                        break;
                    }
                }
                selectedCountry = countryUi;
            } else {
                selectedCountry = null;
            }
        }
        java.lang.String normalizedQuery = formattingResult.getNormalizedQuery();
        int i2 = 0;
        for (int i3 = 0; i3 < normalizedQuery.length(); i3++) {
            if (java.lang.Character.isDigit(normalizedQuery.charAt(i3))) {
                i2++;
            }
        }
        boolean z = i2 >= 10;
        java.lang.String access$computeNormalizedQuery = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.access$computeNormalizedQuery(this.getHighSpeedVideoFpsRangesFor, formattingResult, selectedCountry, z);
        java.lang.String access$computeDisplayText = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.access$computeDisplayText(this.getHighSpeedVideoFpsRangesFor, formattingResult, selectedCountry, z, access$computeNormalizedQuery);
        if (com.paypal.oslo.feature.contacts.ui.utils.SearchQueryUtilsKt.isEmail(this.getHighResolutionOutputSizeshNQ4ISI.getQuery())) {
            searchQueryType = com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.EMAIL;
        } else {
            searchQueryType = formattingResult.isValidPhone() ? com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.PHONE : com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.OTHER;
        }
        mviStateStore2 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
        java.lang.String countryCode2 = formattingResult.getCountryCode();
        if (countryCode2 != null) {
            str = countryCode2;
        } else if (selectedCountry != null) {
            str = selectedCountry.getId();
        }
        mviStateStore2.onEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult(str, access$computeDisplayText, access$computeNormalizedQuery, searchQueryType));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleSearchQueryChanged$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleSearchQueryChanged$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsViewModel$handleSearchQueryChanged$1(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchQueryChanged searchQueryChanged, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleSearchQueryChanged$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = contactsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = searchQueryChanged;
    }
}
