package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleCountrySelected$1", f = "ContactsViewModel.kt", i = {0, 1, 1}, l = {446, 447}, m = "invokeSuspend", n = {"updatedRecents", "updatedRecents", "updatedQuery"}, nl = {447, 448}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class ContactsViewModel$handleCountrySelected$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0111, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r11 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List access$updateRecentCountries;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.contacts.LoggerKt.log, com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events.COUNTRY_SELECTED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", this.getHighSpeedVideoFpsRanges.getCountry().getId())), null, 4, null);
            access$updateRecentCountries = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.access$updateRecentCountries(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges.getRecentCountries(), this.getHighSpeedVideoFpsRanges.getCountry());
            mviStateStore = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            mviStateStore.onEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateRecentCountries(access$updateRecentCountries));
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$updateRecentCountries);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.access$formatQueryForCountry(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges.getSearchQuery(), this.getHighSpeedVideoFpsRanges.getCountry().getId(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.FormattingResult formattingResult = (com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.FormattingResult) obj;
                com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType = formattingResult.isValidPhone() ? com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.PHONE : com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.OTHER;
                mviStateStore2 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                mviStateStore2.onEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.UpdateFormattingResult(this.getHighSpeedVideoFpsRanges.getCountry().getId(), formattingResult.getDisplayText(), formattingResult.getNormalizedQuery(), searchQueryType));
                mviStateStore3 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                mviStateStore3.onEvent(this.getHighSpeedVideoFpsRanges);
                if (formattingResult.getNormalizedQuery().length() > 0) {
                    mviStateStore4 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                    mviStateStore4.onEvent(new com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.SearchTriggered(formattingResult.getNormalizedQuery()));
                }
                return kotlin.Unit.INSTANCE;
            }
            access$updateRecentCountries = (java.util.List) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        phoneNumberDisplayFormatter = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$updateRecentCountries);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.getHighSpeedVideoFpsRangesFor = 2;
        obj = phoneNumberDisplayFormatter.processInput(str, false, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleCountrySelected$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleCountrySelected$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsViewModel$handleCountrySelected$1(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent.CountrySelected countrySelected, com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel contactsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel$handleCountrySelected$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = countrySelected;
        this.getHighResolutionOutputSizeshNQ4ISI = contactsViewModel;
    }
}
