package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "addressRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "fieldExtractionUtil", "Lcom/paypal/oslo/core/i18n/domain/util/MetadataUtil;", "metadataUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;Lcom/paypal/oslo/core/i18n/domain/util/MetadataUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;", "addressConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/util/FieldExtractionUtil;", "Lcom/paypal/oslo/core/i18n/domain/util/MetadataUtil;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetAddressLayoutUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.MetadataUtil getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.AddressRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetAddressLayoutUseCase(com.paypal.oslo.core.i18n.domain.repository.AddressRepository addressRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil, com.paypal.oslo.core.i18n.domain.util.MetadataUtil metadataUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldExtractionUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataUtil, "");
        this.Camera2StreamConfigurationMap = addressRepository;
        this.getHighSpeedVideoFpsRanges = localeResolverCache;
        this.getHighResolutionOutputSizeshNQ4ISI = fieldExtractionUtil;
        this.getHighSpeedVideoFpsRangesFor = metadataUtil;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            address = null;
        }
        if ((i & 2) != 0) {
            addressConfiguration = null;
        }
        return getAddressLayoutUseCase.invoke(address, addressConfiguration, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(3:10|11|12)(2:65|66))(6:67|68|(1:80)|(1:79)|75|(1:77)(1:78))|13|14|(10:16|(1:18)(1:55)|19|(1:21)|(1:54)(1:25)|26|(1:28)(9:(1:34)(1:53)|35|(3:(1:38)(1:51)|39|(6:41|42|(1:44)(1:50)|45|(1:47)(1:49)|48))|52|42|(0)(0)|45|(0)(0)|48)|29|30|31)(2:56|57)))|83|6|7|(0)(0)|13|14|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0258, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0259, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0265, code lost:
    
        r11.complete();
        r1 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(r0, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0255, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0256, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x025c, code lost:
    
        r11.complete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0263, code lost:
    
        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0264, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0112 A[Catch: all -> 0x0255, RaiseCancellationException -> 0x0258, TryCatch #4 {RaiseCancellationException -> 0x0258, all -> 0x0255, blocks: (B:14:0x00ee, B:16:0x0112, B:18:0x0133, B:19:0x0139, B:23:0x0140, B:26:0x014b, B:28:0x016c, B:29:0x022e, B:34:0x0198, B:35:0x019e, B:38:0x01a4, B:39:0x01aa, B:42:0x01b1, B:44:0x01b8, B:45:0x01be, B:47:0x01c9, B:48:0x01cf, B:54:0x0147, B:56:0x0239, B:57:0x0254), top: B:13:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8 A[Catch: all -> 0x0255, RaiseCancellationException -> 0x0258, TryCatch #4 {RaiseCancellationException -> 0x0258, all -> 0x0255, blocks: (B:14:0x00ee, B:16:0x0112, B:18:0x0133, B:19:0x0139, B:23:0x0140, B:26:0x014b, B:28:0x016c, B:29:0x022e, B:34:0x0198, B:35:0x019e, B:38:0x01a4, B:39:0x01aa, B:42:0x01b1, B:44:0x01b8, B:45:0x01be, B:47:0x01c9, B:48:0x01cf, B:54:0x0147, B:56:0x0239, B:57:0x0254), top: B:13:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c9 A[Catch: all -> 0x0255, RaiseCancellationException -> 0x0258, TryCatch #4 {RaiseCancellationException -> 0x0258, all -> 0x0255, blocks: (B:14:0x00ee, B:16:0x0112, B:18:0x0133, B:19:0x0139, B:23:0x0140, B:26:0x014b, B:28:0x016c, B:29:0x022e, B:34:0x0198, B:35:0x019e, B:38:0x01a4, B:39:0x01aa, B:42:0x01b1, B:44:0x01b8, B:45:0x01be, B:47:0x01c9, B:48:0x01cf, B:54:0x0147, B:56:0x0239, B:57:0x0254), top: B:13:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0239 A[Catch: all -> 0x0255, RaiseCancellationException -> 0x0258, TryCatch #4 {RaiseCancellationException -> 0x0258, all -> 0x0255, blocks: (B:14:0x00ee, B:16:0x0112, B:18:0x0133, B:19:0x0139, B:23:0x0140, B:26:0x014b, B:28:0x016c, B:29:0x022e, B:34:0x0198, B:35:0x019e, B:38:0x01a4, B:39:0x01aa, B:42:0x01b1, B:44:0x01b8, B:45:0x01be, B:47:0x01c9, B:48:0x01cf, B:54:0x0147, B:56:0x0239, B:57:0x0254), top: B:13:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, com.paypal.oslo.core.i18n.domain.model.AddressLayout>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase$invoke$1 getAddressLayoutUseCase$invoke$1;
        int i;
        java.util.Locale locale;
        java.lang.String country;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration2;
        arrow.core.raise.Raise raise2;
        final com.paypal.oslo.core.i18n.domain.model.Address address2;
        com.paypal.oslo.core.i18n.domain.model.LayoutMetadata layoutMetadata;
        java.lang.String lowResolution;
        boolean z;
        com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase$invoke$1) {
            getAddressLayoutUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase$invoke$1) continuation;
            if ((getAddressLayoutUseCase$invoke$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                getAddressLayoutUseCase$invoke$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = getAddressLayoutUseCase$invoke$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAddressLayoutUseCase$invoke$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                    if (addressConfiguration == null || (locale = addressConfiguration.getLocale()) == null) {
                        locale = (java.util.Locale) defaultRaise3.bind(this.getHighSpeedVideoFpsRanges.getUserLocale());
                    }
                    if (addressConfiguration == null || (country = addressConfiguration.getRegion()) == null) {
                        country = locale.getCountry();
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "GetAddressLayout UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("locale", locale), kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, country)), null, 4, null);
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, com.paypal.oslo.core.i18n.domain.model.AddressMetadata>> addressMetadata = this.Camera2StreamConfigurationMap.getAddressMetadata(country, locale);
                    getAddressLayoutUseCase$invoke$1.Camera2StreamConfigurationMap = address;
                    getAddressLayoutUseCase$invoke$1.getOutputMinFrameDuration = addressConfiguration;
                    getAddressLayoutUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise2;
                    getAddressLayoutUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                    getAddressLayoutUseCase$invoke$1.getInputFormats = country;
                    getAddressLayoutUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    getAddressLayoutUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressMetadata);
                    getAddressLayoutUseCase$invoke$1.getOutputStallDurationlomOqCM = defaultRaise3;
                    getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    getAddressLayoutUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    getAddressLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    getAddressLayoutUseCase$invoke$1.getOutputSizes = 1;
                    java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(addressMetadata, getAddressLayoutUseCase$invoke$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    raise = defaultRaise3;
                    defaultRaise = defaultRaise2;
                    str = country;
                    addressConfiguration2 = addressConfiguration;
                    raise2 = raise;
                    obj = first;
                    address2 = address;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getAddressLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = getAddressLayoutUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i4 = getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    raise2 = (arrow.core.raise.Raise) getAddressLayoutUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    java.lang.String str2 = (java.lang.String) getAddressLayoutUseCase$invoke$1.getInputFormats;
                    raise = (arrow.core.raise.Raise) getAddressLayoutUseCase$invoke$1.getInputSizeshNQ4ISI;
                    arrow.core.raise.DefaultRaise defaultRaise4 = (arrow.core.raise.DefaultRaise) getAddressLayoutUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    addressConfiguration2 = (com.paypal.oslo.core.i18n.domain.model.AddressConfiguration) getAddressLayoutUseCase$invoke$1.getOutputMinFrameDuration;
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) getAddressLayoutUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = defaultRaise4;
                    str = str2;
                }
                final com.paypal.oslo.core.i18n.domain.model.AddressMetadata addressMetadata2 = (com.paypal.oslo.core.i18n.domain.model.AddressMetadata) raise2.bind((arrow.core.Either) obj);
                final java.lang.String primaryScript = addressMetadata2.getCountryMetadata().getPrimaryScript();
                layoutMetadata = addressMetadata2.getCountryMetadata().getLayout().getInputLayout().get(primaryScript);
                if (layoutMetadata != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No layout found for script: ");
                    sb.append(primaryScript);
                    raise.raise(new com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound(sb.toString()));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Address Layout found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str), kotlin.TuplesKt.to("script", primaryScript)), null, 4, null);
                com.paypal.oslo.core.i18n.domain.model.Address.Resolution resolution = addressConfiguration2 != null ? addressConfiguration2.getResolution() : null;
                if (resolution != com.paypal.oslo.core.i18n.domain.model.Address.Resolution.HIGH) {
                    resolution = null;
                }
                if (resolution == null || (lowResolution = layoutMetadata.getHighResolution()) == null) {
                    lowResolution = layoutMetadata.getLowResolution();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "layout for address formatting", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, lowResolution)), null, 4, null);
                java.lang.String str3 = lowResolution;
                if (str3.length() == 0) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Address layout is empty", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str), kotlin.TuplesKt.to("script", primaryScript)), null, 4, null);
                    addressLayout = new com.paypal.oslo.core.i18n.domain.model.AddressLayout(kotlin.collections.CollectionsKt.emptyList());
                } else {
                    if ((addressConfiguration2 != null ? addressConfiguration2.getStyle() : null) != com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_SINGLELINE) {
                        if ((addressConfiguration2 != null ? addressConfiguration2.getStyle() : null) != com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_MULTILINE) {
                            z = false;
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
                            kotlin.Pair[] pairArr = new kotlin.Pair[4];
                            pairArr[0] = kotlin.TuplesKt.to("resolution", addressConfiguration2 == null ? addressConfiguration2.getResolution() : null);
                            pairArr[1] = kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, addressConfiguration2 == null ? addressConfiguration2.getStyle() : null);
                            pairArr[2] = kotlin.TuplesKt.to("isInternational", java.lang.Boolean.valueOf(z));
                            pairArr[3] = kotlin.TuplesKt.to("script", primaryScript);
                            com.paypal.android.logger.Logger.d$default(logger, "Received layout on the basis of resolution", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                            final boolean z2 = z;
                            final java.lang.String str4 = str;
                            addressLayout = new com.paypal.oslo.core.i18n.domain.model.AddressLayout(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE}, false, 0, 6, (java.lang.Object) null)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.$r8$lambda$VvfYD0sAdly1RJ2rGzFhGGB4K3k(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.this, address2, z2, primaryScript, addressMetadata2, str4, (java.lang.String) obj2);
                                }
                            })));
                        }
                    }
                    z = true;
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.i18n.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
                    pairArr2[0] = kotlin.TuplesKt.to("resolution", addressConfiguration2 == null ? addressConfiguration2.getResolution() : null);
                    pairArr2[1] = kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, addressConfiguration2 == null ? addressConfiguration2.getStyle() : null);
                    pairArr2[2] = kotlin.TuplesKt.to("isInternational", java.lang.Boolean.valueOf(z));
                    pairArr2[3] = kotlin.TuplesKt.to("script", primaryScript);
                    com.paypal.android.logger.Logger.d$default(logger2, "Received layout on the basis of resolution", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                    final boolean z22 = z;
                    final java.lang.String str42 = str;
                    addressLayout = new com.paypal.oslo.core.i18n.domain.model.AddressLayout(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.collections.CollectionsKt.asSequence(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE}, false, 0, 6, (java.lang.Object) null)), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.$r8$lambda$VvfYD0sAdly1RJ2rGzFhGGB4K3k(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.this, address2, z22, primaryScript, addressMetadata2, str42, (java.lang.String) obj2);
                        }
                    })));
                }
                defaultRaise.complete();
                arrow.core.Either.Left left = new arrow.core.Either.Right(addressLayout);
                return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(left, "GetAddressLayoutUseCase");
            }
        }
        getAddressLayoutUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getAddressLayoutUseCase$invoke$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAddressLayoutUseCase$invoke$1.getOutputSizes;
        if (i != 0) {
        }
        final com.paypal.oslo.core.i18n.domain.model.AddressMetadata addressMetadata22 = (com.paypal.oslo.core.i18n.domain.model.AddressMetadata) raise2.bind((arrow.core.Either) obj2);
        final java.lang.String primaryScript2 = addressMetadata22.getCountryMetadata().getPrimaryScript();
        layoutMetadata = addressMetadata22.getCountryMetadata().getLayout().getInputLayout().get(primaryScript2);
        if (layoutMetadata != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row $r8$lambda$VvfYD0sAdly1RJ2rGzFhGGB4K3k(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.model.Address address, boolean z, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.AddressMetadata addressMetadata, java.lang.String str2, java.lang.String str3) {
        java.util.Map<java.lang.String, java.lang.String> adminArea2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        com.paypal.oslo.core.i18n.domain.model.CountryMetadata countryMetadata = addressMetadata.getCountryMetadata();
        com.paypal.oslo.core.i18n.domain.model.AddressLabelMetadata labelMetadata = addressMetadata.getLabelMetadata();
        java.util.List<java.lang.String> fieldList = getAddressLayoutUseCase.getHighSpeedVideoFpsRangesFor.getFieldList(str3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = fieldList.iterator();
        while (true) {
            com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str4 = (java.lang.String) it.next();
            com.paypal.oslo.core.i18n.domain.model.Label label = labelMetadata.getAddressLabel().get(str2);
            if (label != null || (label = labelMetadata.getAddressLabel().get(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX)) != null) {
                com.paypal.oslo.core.i18n.domain.model.AddressFieldInfo fieldDetail = getAddressLayoutUseCase.getHighResolutionOutputSizeshNQ4ISI.getFieldDetail(str4, address, z, label, countryMetadata.getPreset().getCountryCode());
                java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.AdminAreaLabel> map = countryMetadata.getSubDivisionData().get(str);
                com.paypal.oslo.core.i18n.domain.model.AdminAreaLabel adminAreaLabel = map != null ? map.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT) : null;
                if (kotlin.jvm.internal.Intrinsics.areEqual(str4, "adminArea1")) {
                    if (adminAreaLabel != null) {
                        adminArea2 = adminAreaLabel.getAdminArea1();
                        java.util.List listOf = adminArea2 != null ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.StateList.MapValue(adminArea2)) : null;
                        com.paypal.oslo.core.i18n.domain.model.Field addressField = fieldDetail.getAddressField();
                        java.lang.String label2 = fieldDetail.getLabel();
                        java.lang.Boolean bool = countryMetadata.getRequired().get(str4);
                        boolean booleanValue = bool == null ? bool.booleanValue() : false;
                        java.lang.Boolean bool2 = countryMetadata.getHidden().get(str4);
                        addressComponent = new com.paypal.oslo.core.i18n.domain.model.AddressComponent(addressField, label2, booleanValue, bool2 == null ? bool2.booleanValue() : false, listOf);
                    }
                    adminArea2 = null;
                    java.util.List listOf2 = adminArea2 != null ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.StateList.MapValue(adminArea2)) : null;
                    com.paypal.oslo.core.i18n.domain.model.Field addressField2 = fieldDetail.getAddressField();
                    java.lang.String label22 = fieldDetail.getLabel();
                    java.lang.Boolean bool3 = countryMetadata.getRequired().get(str4);
                    if (bool3 == null) {
                    }
                    java.lang.Boolean bool22 = countryMetadata.getHidden().get(str4);
                    addressComponent = new com.paypal.oslo.core.i18n.domain.model.AddressComponent(addressField2, label22, booleanValue, bool22 == null ? bool22.booleanValue() : false, listOf2);
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str4, "adminArea2") && adminAreaLabel != null) {
                        adminArea2 = adminAreaLabel.getAdminArea2();
                        java.util.List listOf22 = adminArea2 != null ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.StateList.MapValue(adminArea2)) : null;
                        com.paypal.oslo.core.i18n.domain.model.Field addressField22 = fieldDetail.getAddressField();
                        java.lang.String label222 = fieldDetail.getLabel();
                        java.lang.Boolean bool32 = countryMetadata.getRequired().get(str4);
                        if (bool32 == null) {
                        }
                        java.lang.Boolean bool222 = countryMetadata.getHidden().get(str4);
                        addressComponent = new com.paypal.oslo.core.i18n.domain.model.AddressComponent(addressField22, label222, booleanValue, bool222 == null ? bool222.booleanValue() : false, listOf22);
                    }
                    adminArea2 = null;
                    java.util.List listOf222 = adminArea2 != null ? kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.StateList.MapValue(adminArea2)) : null;
                    com.paypal.oslo.core.i18n.domain.model.Field addressField222 = fieldDetail.getAddressField();
                    java.lang.String label2222 = fieldDetail.getLabel();
                    java.lang.Boolean bool322 = countryMetadata.getRequired().get(str4);
                    if (bool322 == null) {
                    }
                    java.lang.Boolean bool2222 = countryMetadata.getHidden().get(str4);
                    addressComponent = new com.paypal.oslo.core.i18n.domain.model.AddressComponent(addressField222, label2222, booleanValue, bool2222 == null ? bool2222.booleanValue() : false, listOf222);
                }
            }
            if (addressComponent != null) {
                arrayList.add(addressComponent);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            return new com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row(arrayList2);
        }
        return null;
    }
}
