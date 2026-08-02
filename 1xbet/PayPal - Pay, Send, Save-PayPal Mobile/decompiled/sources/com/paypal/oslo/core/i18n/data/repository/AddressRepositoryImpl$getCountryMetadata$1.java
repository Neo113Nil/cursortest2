package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/AddressMetadataError;", "Lkotlinx/serialization/json/JsonObject;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getCountryMetadata$1", f = "AddressRepositoryImpl.kt", i = {0, 0, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 238}, m = "invokeSuspend", n = {"$this$flow", "countryCode", "$this$flow", "countryCode", "endpoint"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class AddressRepositoryImpl$getCountryMetadata$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends kotlinx.serialization.json.JsonObject>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r12 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r0.emit(arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.AddressMetadataError.ParsingFailure("Unable to resolve country code", null, 2, null)), r11) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        if (r3.fetchData(r2).collect(new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getCountryMetadata$1.AnonymousClass1<>(), r11) == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache;
        java.lang.String country;
        com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository;
        final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (str != null) {
            country = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "");
        }
        localeResolverCache = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        java.util.Locale orNull = localeResolverCache.getUserLocale().getOrNull();
        country = orNull != null ? orNull.getCountry() : null;
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Fetching Address Country metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", country)), null, 4, null);
        if (country == null) {
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(country);
            this.Camera2StreamConfigurationMap = 1;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/wr-i18n-metadata/4/supplemental/address/regions/");
            sb.append(country);
            sb.append(".json");
            java.lang.String obj2 = sb.toString();
            networkRepository = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(country);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.Camera2StreamConfigurationMap = 2;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends kotlinx.serialization.json.JsonObject>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getCountryMetadata$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getCountryMetadata$1 addressRepositoryImpl$getCountryMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getCountryMetadata$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        addressRepositoryImpl$getCountryMetadata$1.getOutputMinFrameDuration = obj;
        return addressRepositoryImpl$getCountryMetadata$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressRepositoryImpl$getCountryMetadata$1(java.lang.String str, com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl addressRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getCountryMetadata$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = addressRepositoryImpl;
    }
}
