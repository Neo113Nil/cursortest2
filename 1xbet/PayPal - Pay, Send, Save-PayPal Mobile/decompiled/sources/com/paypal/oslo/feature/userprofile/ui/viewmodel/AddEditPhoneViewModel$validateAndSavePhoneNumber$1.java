package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$validateAndSavePhoneNumber$1", f = "AddEditPhoneViewModel.kt", i = {0, 0, 0}, l = {430}, m = "invokeSuspend", n = {"phoneNumber", "currentCountry", "request"}, nl = {682}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneViewModel$validateAndSavePhoneNumber$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase;
        com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        android.content.Context context;
        java.lang.String str7;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        android.content.Context context2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$clearErrors(this.getHighSpeedVideoFpsRangesFor);
            str = this.getHighSpeedVideoFpsRangesFor.toString;
            com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail access$resolveCurrentCountry = com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$resolveCurrentCountry(this.getHighSpeedVideoFpsRangesFor);
            if (access$resolveCurrentCountry != null) {
                str2 = this.getHighSpeedVideoFpsRangesFor.ArtificialStackFrames;
                if (str2 != null) {
                    str3 = this.getHighSpeedVideoFpsRangesFor.toString;
                    java.lang.String obj2 = kotlin.text.StringsKt.trim(str3).toString();
                    str4 = this.getHighSpeedVideoFpsRangesFor.a;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, kotlin.text.StringsKt.trim(str4).toString())) {
                        str5 = this.getHighSpeedVideoFpsRangesFor.d;
                        str6 = this.getHighSpeedVideoFpsRangesFor.util.h.xy.cb.b.ˊ java.lang.String;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str5, str6)) {
                            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM;
                            context = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                            mutableStateFlow.setValue(context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_make_a_change_to_continue));
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
                com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(access$resolveCurrentCountry.getCountryCode()), null);
                phoneNumberParseUseCase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = str;
                this.Camera2StreamConfigurationMap = access$resolveCurrentCountry;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneNumberRequest);
                this.getHighSpeedVideoSizes = 1;
                java.lang.Object invoke = phoneNumberParseUseCase.invoke(str, phoneNumberRequest, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                countryPhoneDetail = access$resolveCurrentCountry;
                obj = invoke;
            } else {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
                str7 = this.getHighSpeedVideoFpsRangesFor.coroutineCreation;
                if (str7 == null) {
                    str7 = "null";
                }
                logger.w("Cannot validate phone number: No country available", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userCountryCode", str7)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneNumber", str)));
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone(), com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$getAnalyticsScreen(this.getHighSpeedVideoFpsRangesFor), com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$getAnalyticsAction(this.getHighSpeedVideoFpsRangesFor), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.COUNTRY_NOT_RESOLVED, null, "No country available for phone validation", null, null, 104, null);
                mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration;
                context2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                mutableStateFlow2.setValue(context2.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            countryPhoneDetail = (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) this.Camera2StreamConfigurationMap;
            str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$handlePhoneValidationSuccess(addEditPhoneViewModel, (com.paypal.oslo.core.i18n.domain.model.PhoneNumber) ((arrow.core.Either.Right) either).getValue(), str);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel.access$handlePhoneValidationError(addEditPhoneViewModel, (com.paypal.oslo.core.i18n.domain.model.PhoneNumberError) ((arrow.core.Either.Left) either).getValue(), countryPhoneDetail.getCountryCode(), str);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$validateAndSavePhoneNumber$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$validateAndSavePhoneNumber$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneViewModel$validateAndSavePhoneNumber$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel$validateAndSavePhoneNumber$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addEditPhoneViewModel;
    }
}
