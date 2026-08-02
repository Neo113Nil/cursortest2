package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2", f = "FundingSelectionApiRepositoryImpl.kt", i = {0, 0, 0}, l = {95}, m = "invokeSuspend", n = {"userLocale", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY}, nl = {105}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class FundingSelectionApiRepositoryImpl$fetch$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        localeProvider = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        java.util.Locale userLocale = localeProvider.getUserLocale();
        java.lang.String country = userLocale.getCountry();
        kotlin.jvm.internal.Intrinsics.checkNotNull(country);
        if (country.length() <= 0) {
            country = null;
        }
        if (country == null) {
            country = java.util.Locale.US.getCountry();
        }
        java.lang.String language = userLocale.getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(language);
        if (language.length() <= 0) {
            language = null;
        }
        if (language == null) {
            language = java.util.Locale.US.getLanguage();
        }
        checkoutLogger = this.Camera2StreamConfigurationMap.getInputFormats;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "FundingSelection API call with locale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, country), kotlin.TuplesKt.to(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, language), kotlin.TuplesKt.to("locale", userLocale.toString())), null, 4, null);
        final com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl fundingSelectionApiRepositoryImpl = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userLocale);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(country);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(language);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object retryEither$default = com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.retryEither$default(2, 0L, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.this, (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) obj2);
            }
        }, new com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2.AnonymousClass2(this.Camera2StreamConfigurationMap, country, language, null), this, 6, null);
        return retryEither$default == coroutine_suspended ? coroutine_suspended : retryEither$default;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2$2", f = "FundingSelectionApiRepositoryImpl.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession;
            java.lang.Object highSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl fundingSelectionApiRepositoryImpl = this.Camera2StreamConfigurationMap;
            appSwitchSession = fundingSelectionApiRepositoryImpl.getHighSpeedVideoFpsRangesFor;
            java.lang.String checkoutTokenValueOrEmpty = appSwitchSession.getCheckoutTokenValueOrEmpty();
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            this.getHighSpeedVideoFpsRangesFor = 1;
            highSpeedVideoFpsRanges = fundingSelectionApiRepositoryImpl.getHighSpeedVideoFpsRanges(checkoutTokenValueOrEmpty, str, str2, this);
            return highSpeedVideoFpsRanges == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRanges;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>> continuation) {
            return ((com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl fundingSelectionApiRepositoryImpl, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2.AnonymousClass2> continuation) {
            super(1, continuation);
            this.Camera2StreamConfigurationMap = fundingSelectionApiRepositoryImpl;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRanges = str2;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl fundingSelectionApiRepositoryImpl, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        checkoutLogger = fundingSelectionApiRepositoryImpl.getInputFormats;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "Retrying funding selection fetch after recoverable error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorName", nativeXOErrorEntity.getErrorName())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundingSelectionApiRepositoryImpl$fetch$2(com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl fundingSelectionApiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = fundingSelectionApiRepositoryImpl;
    }
}
