package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$initialize$1", f = "PhoneStepViewModel.kt", i = {0, 0, 0, 0}, l = {159}, m = "invokeSuspend", n = {"numericCode", "cosRegion", "localeCountry", "localCountryCode"}, nl = {160}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes13.dex */
final class PhoneStepViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.Phone Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0068, code lost:
    
        if (r12.intValue() > 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Integer num;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider;
        java.lang.String country;
        com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase getCallingCodeUseCase;
        java.lang.String str2;
        com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase getRegionCodeForCallingCodeUseCase;
        java.lang.String m16661getCountryCodedGTghNU;
        java.lang.String m16662getPhoneNumber0u3eDS4;
        java.lang.String str3;
        java.util.List list;
        java.lang.String str4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone = this.Camera2StreamConfigurationMap;
            if (phone != null && (m16661getCountryCodedGTghNU = phone.m16661getCountryCodedGTghNU()) != null) {
                if (kotlin.text.StringsKt.isBlank(m16661getCountryCodedGTghNU)) {
                    m16661getCountryCodedGTghNU = null;
                }
                if (m16661getCountryCodedGTghNU != null) {
                    java.lang.String obj2 = kotlin.text.StringsKt.trim(m16661getCountryCodedGTghNU).toString();
                    if (obj2 != null) {
                        java.lang.String trimStart = kotlin.text.StringsKt.trimStart(obj2, '+');
                        if (trimStart != null) {
                            num = kotlin.text.StringsKt.toIntOrNull(trimStart);
                            if (num != null) {
                            }
                        }
                    }
                }
            }
            num = null;
            if (num != null) {
                com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel = this.getOutputFormats;
                int intValue = num.intValue();
                getRegionCodeForCallingCodeUseCase = phoneStepViewModel.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.core.i18n.domain.model.CountryCode orNull = getRegionCodeForCallingCodeUseCase.invoke(intValue).getOrNull();
                java.lang.String m11369unboximpl = orNull != null ? orNull.m11369unboximpl() : null;
                com.paypal.oslo.core.i18n.domain.model.CountryCode m11363boximpl = m11369unboximpl != null ? com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(m11369unboximpl) : null;
                if (m11363boximpl != null) {
                    str = m11363boximpl.m11369unboximpl();
                    if (num != null || str == null) {
                        localeProvider = this.getOutputFormats.getHighSpeedVideoFpsRanges;
                        country = localeProvider.getUserLocale().getCountry();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(country);
                        if (kotlin.text.StringsKt.isBlank(country)) {
                            country = null;
                        }
                        if (country == null) {
                            country = java.util.Locale.US.getCountry();
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(country);
                        java.lang.String m11364constructorimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(country);
                        getCallingCodeUseCase = this.getOutputFormats.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(num);
                        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(country);
                        this.getHighSpeedVideoSizes = m11364constructorimpl;
                        this.getOutputMinFrameDuration = 1;
                        obj = getCallingCodeUseCase.invoke(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(m11364constructorimpl)), this);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = m11364constructorimpl;
                    } else {
                        this.getOutputFormats.setDialingCode(java.lang.String.valueOf(num.intValue()));
                        this.getOutputFormats.m16814setCountryCodeegl_DS0(str);
                        com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone2 = this.Camera2StreamConfigurationMap;
                        m16662getPhoneNumber0u3eDS4 = phone2 != null ? phone2.m16662getPhoneNumber0u3eDS4() : null;
                        str3 = m16662getPhoneNumber0u3eDS4;
                        if (str3 != null && !kotlin.text.StringsKt.isBlank(str3) && kotlin.text.StringsKt.isBlank(this.getOutputFormats.getPhoneInputState().getRaw())) {
                            this.getOutputFormats.updatePhoneNumber(m16662getPhoneNumber0u3eDS4);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
            str = null;
            if (num != null) {
            }
            localeProvider = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            country = localeProvider.getUserLocale().getCountry();
            kotlin.jvm.internal.Intrinsics.checkNotNull(country);
            if (kotlin.text.StringsKt.isBlank(country)) {
            }
            if (country == null) {
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(country);
            java.lang.String m11364constructorimpl2 = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(country);
            getCallingCodeUseCase = this.getOutputFormats.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(num);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(country);
            this.getHighSpeedVideoSizes = m11364constructorimpl2;
            this.getOutputMinFrameDuration = 1;
            obj = getCallingCodeUseCase.invoke(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(m11364constructorimpl2)), this);
            if (obj != coroutine_suspended) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either.isLeft()) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Locale calling code lookup failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.PhoneNumberError) ((arrow.core.Either.Left) either).getValue()).getMessage())), null, null, 12, null);
        }
        java.util.Map map = (java.util.Map) either.getOrNull();
        if (map != null && (list = (java.util.List) map.get(str2)) != null && (str4 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list)) != null) {
            this.getOutputFormats.setDialingCode(str4);
            this.getOutputFormats.m16814setCountryCodeegl_DS0(str2);
            com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone22 = this.Camera2StreamConfigurationMap;
            if (phone22 != null) {
            }
            str3 = m16662getPhoneNumber0u3eDS4;
            if (str3 != null) {
                this.getOutputFormats.updatePhoneNumber(m16662getPhoneNumber0u3eDS4);
            }
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$initialize$1(this.Camera2StreamConfigurationMap, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneStepViewModel$initialize$1(com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = phone;
        this.getOutputFormats = phoneStepViewModel;
    }
}
