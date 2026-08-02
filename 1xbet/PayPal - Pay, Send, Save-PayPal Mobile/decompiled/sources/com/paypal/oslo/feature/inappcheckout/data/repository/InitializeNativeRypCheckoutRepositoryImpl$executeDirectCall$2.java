package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2", f = "InitializeNativeRypCheckoutRepositoryImpl.kt", i = {0, 0}, l = {71}, m = "invokeSuspend", n = {com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY}, nl = {81}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        localeProvider = this.getInputFormats.Camera2StreamConfigurationMap;
        kotlin.Pair<java.lang.String, java.lang.String> countryAndLanguage = com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.getCountryAndLanguage(localeProvider);
        java.lang.String component1 = countryAndLanguage.component1();
        java.lang.String component2 = countryAndLanguage.component2();
        checkoutLogger = this.getInputFormats.getInputSizeshNQ4ISI;
        kotlin.Pair pair = kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, component1);
        kotlin.Pair pair2 = kotlin.TuplesKt.to(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, component2);
        localeProvider2 = this.getInputFormats.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "InitializeNativeRypCheckout API call with locale", kotlin.collections.MapsKt.mapOf(pair, pair2, kotlin.TuplesKt.to("locale", localeProvider2.getUserLocale().toString())), null, 4, null);
        final com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl initializeNativeRypCheckoutRepositoryImpl = this.getInputFormats;
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(component1);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(component2);
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object retryEither$default = com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.retryEither$default(2, 0L, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl.this, (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) obj2);
            }
        }, new com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2.AnonymousClass2(this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, component1, component2, null), this, 6, null);
        return retryEither$default == coroutine_suspended ? coroutine_suspended : retryEither$default;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2$2", f = "InitializeNativeRypCheckoutRepositoryImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this);
            return highResolutionOutputSizeshNQ4ISI == coroutine_suspended ? coroutine_suspended : highResolutionOutputSizeshNQ4ISI;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>> continuation) {
            return ((com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2.AnonymousClass2(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl initializeNativeRypCheckoutRepositoryImpl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2.AnonymousClass2> continuation) {
            super(1, continuation);
            this.getInputSizeshNQ4ISI = initializeNativeRypCheckoutRepositoryImpl;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighSpeedVideoFpsRanges = str3;
            this.Camera2StreamConfigurationMap = str4;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl initializeNativeRypCheckoutRepositoryImpl, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        checkoutLogger = initializeNativeRypCheckoutRepositoryImpl.getInputSizeshNQ4ISI;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, "Retrying InitializeNativeRypCheckout after recoverable error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorName", nativeXOErrorEntity.getErrorName())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2(this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2(com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl initializeNativeRypCheckoutRepositoryImpl, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2> continuation) {
        super(2, continuation);
        this.getInputFormats = initializeNativeRypCheckoutRepositoryImpl;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }
}
