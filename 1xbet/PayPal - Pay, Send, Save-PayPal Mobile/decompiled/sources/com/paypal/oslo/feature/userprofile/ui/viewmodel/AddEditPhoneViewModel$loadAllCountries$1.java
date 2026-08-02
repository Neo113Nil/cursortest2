package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadAllCountries$1", f = "AddEditPhoneViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneViewModel$loadAllCountries$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        r1 = r0.Camera2StreamConfigurationMap(r1, r12);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj2;
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail;
        java.lang.String str3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getCountriesListUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail>> invoke = getCountriesListUseCase.invoke();
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            if (invoke instanceof arrow.core.Either.Right) {
                java.util.List list = (java.util.List) ((arrow.core.Either.Right) invoke).getValue();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "AddEditPhoneViewModel: Loaded all countries from WorldReady", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("totalCountries", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
                mutableStateFlow2 = addEditPhoneViewModel.getOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(list);
                str = addEditPhoneViewModel.coroutineCreation;
                if (str != null) {
                    str2 = addEditPhoneViewModel.accessartificialFrame;
                    if (str2 == null || countryPhoneDetail == null) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            java.lang.String countryCode = ((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj2).getCountryCode();
                            str3 = addEditPhoneViewModel.coroutineCreation;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(countryCode, str3)) {
                                break;
                            }
                        }
                        countryPhoneDetail = (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj2;
                    }
                    mutableStateFlow3 = addEditPhoneViewModel.getOutputMinFrameDurationlomOqCM;
                    mutableStateFlow3.setValue(countryPhoneDetail);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    str4 = addEditPhoneViewModel.coroutineCreation;
                    pairArr[0] = kotlin.TuplesKt.to("userCountryCode", str4);
                    str5 = addEditPhoneViewModel.accessartificialFrame;
                    pairArr[1] = kotlin.TuplesKt.to("editPhoneCountryCode", str5);
                    if (countryPhoneDetail == null || (str6 = countryPhoneDetail.getCountryCode()) == null) {
                        str6 = "not found";
                    }
                    pairArr[2] = kotlin.TuplesKt.to("foundCountry", str6);
                    if (countryPhoneDetail == null || (str7 = countryPhoneDetail.getCountryName()) == null) {
                        str7 = com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA;
                    }
                    pairArr[3] = kotlin.TuplesKt.to("countryName", str7);
                    com.paypal.android.logger.Logger.d$default(logger, "AddEditPhoneViewModel: Set default country (after countries loaded)", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                }
            } else if (invoke instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone(), com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$getAnalyticsScreen(addEditPhoneViewModel), "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.COUNTRY_LOAD_FAILED, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Sources.WORLD_READY_SDK, "Failed to load countries list from WorldReady", null, null, 96, null);
                mutableStateFlow = addEditPhoneViewModel.getOutputSizeshNQ4ISI;
                mutableStateFlow.setValue(kotlin.collections.CollectionsKt.emptyList());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadAllCountries$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadAllCountries$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneViewModel$loadAllCountries$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$loadAllCountries$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addEditPhoneViewModel;
    }
}
