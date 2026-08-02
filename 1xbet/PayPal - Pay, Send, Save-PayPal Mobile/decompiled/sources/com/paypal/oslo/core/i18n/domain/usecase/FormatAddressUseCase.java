package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "addressRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/util/AddressFormattingUtil;", "formattingUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/util/AddressFormattingUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;", "addressConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/util/AddressFormattingUtil;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatAddressUseCase {
    private final com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.i18n.domain.repository.AddressRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FormatAddressUseCase(com.paypal.oslo.core.i18n.domain.repository.AddressRepository addressRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil addressFormattingUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFormattingUtil, "");
        this.getHighSpeedVideoFpsRangesFor = addressRepository;
        this.getHighSpeedVideoSizes = localeResolverCache;
        this.Camera2StreamConfigurationMap = addressFormattingUtil;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            addressConfiguration = null;
        }
        return formatAddressUseCase.invoke(address, addressConfiguration, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(2:3|(18:5|6|7|(1:(3:10|11|12)(2:70|71))(6:72|73|(1:85)|(1:84)|80|(1:82)(1:83))|13|(1:15)(1:69)|16|(1:18)(1:68)|19|(1:21)|(1:67)(1:25)|26|(1:28)(1:66)|(1:30)(1:65)|(3:60|(1:62)(1:64)|63)(7:(1:34)(1:59)|35|(1:37)(1:58)|38|(6:41|(1:43)|44|(3:46|47|48)(1:50)|49|39)|51|52)|53|54|55))|91|6|7|(0)(0)|13|(0)(0)|16|(0)(0)|19|(0)|(1:23)|67|26|(0)(0)|(0)(0)|(0)|60|(0)(0)|63|53|54|55|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021a, code lost:
    
        r10.complete();
        r2 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(r0, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0064, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0212, code lost:
    
        r10.complete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0219, code lost:
    
        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0104 A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TryCatch #2 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:11:0x0058, B:13:0x00f3, B:15:0x0104, B:16:0x010b, B:18:0x012f, B:19:0x0136, B:23:0x013e, B:26:0x014b, B:28:0x0164, B:34:0x017d, B:35:0x0184, B:38:0x018b, B:39:0x01ae, B:41:0x01b4, B:44:0x01d1, B:47:0x01d5, B:52:0x01d9, B:53:0x0207, B:60:0x01f1, B:63:0x01fc, B:65:0x016f, B:67:0x0146, B:73:0x007a, B:75:0x007f, B:78:0x0093, B:80:0x009d, B:84:0x0099, B:85:0x0085), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TryCatch #2 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:11:0x0058, B:13:0x00f3, B:15:0x0104, B:16:0x010b, B:18:0x012f, B:19:0x0136, B:23:0x013e, B:26:0x014b, B:28:0x0164, B:34:0x017d, B:35:0x0184, B:38:0x018b, B:39:0x01ae, B:41:0x01b4, B:44:0x01d1, B:47:0x01d5, B:52:0x01d9, B:53:0x0207, B:60:0x01f1, B:63:0x01fc, B:65:0x016f, B:67:0x0146, B:73:0x007a, B:75:0x007f, B:78:0x0093, B:80:0x009d, B:84:0x0099, B:85:0x0085), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0164 A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TryCatch #2 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:11:0x0058, B:13:0x00f3, B:15:0x0104, B:16:0x010b, B:18:0x012f, B:19:0x0136, B:23:0x013e, B:26:0x014b, B:28:0x0164, B:34:0x017d, B:35:0x0184, B:38:0x018b, B:39:0x01ae, B:41:0x01b4, B:44:0x01d1, B:47:0x01d5, B:52:0x01d9, B:53:0x0207, B:60:0x01f1, B:63:0x01fc, B:65:0x016f, B:67:0x0146, B:73:0x007a, B:75:0x007f, B:78:0x0093, B:80:0x009d, B:84:0x0099, B:85:0x0085), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: all -> 0x0064, RaiseCancellationException -> 0x0067, TryCatch #2 {RaiseCancellationException -> 0x0067, all -> 0x0064, blocks: (B:11:0x0058, B:13:0x00f3, B:15:0x0104, B:16:0x010b, B:18:0x012f, B:19:0x0136, B:23:0x013e, B:26:0x014b, B:28:0x0164, B:34:0x017d, B:35:0x0184, B:38:0x018b, B:39:0x01ae, B:41:0x01b4, B:44:0x01d1, B:47:0x01d5, B:52:0x01d9, B:53:0x0207, B:60:0x01f1, B:63:0x01fc, B:65:0x016f, B:67:0x0146, B:73:0x007a, B:75:0x007f, B:78:0x0093, B:80:0x009d, B:84:0x0099, B:85:0x0085), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r0v25, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError, java.lang.String>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase$invoke$1 formatAddressUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.util.Locale locale;
        java.lang.String country;
        arrow.core.raise.Raise raise;
        java.lang.Object obj;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        com.paypal.oslo.core.i18n.domain.model.Label label;
        java.lang.String countryCode;
        com.paypal.oslo.core.i18n.domain.model.Address.Resolution resolution;
        java.lang.String lowResolution;
        int i2;
        java.lang.String processLayoutLine;
        java.lang.String highResolution;
        com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration2 = addressConfiguration;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase$invoke$1) {
            formatAddressUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase$invoke$1) continuation;
            if ((formatAddressUseCase$invoke$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                formatAddressUseCase$invoke$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj2 = formatAddressUseCase$invoke$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatAddressUseCase$invoke$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    defaultRaise2 = defaultRaise;
                    if (addressConfiguration2 == null || (locale = addressConfiguration.getLocale()) == null) {
                        locale = (java.util.Locale) defaultRaise2.bind(this.getHighSpeedVideoSizes.getUserLocale());
                    }
                    if (addressConfiguration2 == null || (country = addressConfiguration.getRegion()) == null) {
                        country = locale.getCountry();
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "FormatAddress UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("locale", locale), kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, country)), null, 4, null);
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, com.paypal.oslo.core.i18n.domain.model.AddressMetadata>> addressMetadata = this.getHighSpeedVideoFpsRangesFor.getAddressMetadata(country, locale);
                    formatAddressUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = address;
                    formatAddressUseCase$invoke$1.getOutputFormats = addressConfiguration2;
                    formatAddressUseCase$invoke$1.getInputFormats = defaultRaise;
                    formatAddressUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise2;
                    formatAddressUseCase$invoke$1.getOutputMinFrameDuration = country;
                    formatAddressUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    formatAddressUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressMetadata);
                    formatAddressUseCase$invoke$1.getOutputSizeshNQ4ISI = defaultRaise2;
                    formatAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    formatAddressUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    formatAddressUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    formatAddressUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    formatAddressUseCase$invoke$1.getOutputStallDuration = 1;
                    java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(addressMetadata, formatAddressUseCase$invoke$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    raise = defaultRaise2;
                    obj = first;
                    address2 = address;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = formatAddressUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i4 = formatAddressUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i5 = formatAddressUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i6 = formatAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    ?? r0 = (arrow.core.raise.Raise) formatAddressUseCase$invoke$1.getOutputSizeshNQ4ISI;
                    java.lang.String str = (java.lang.String) formatAddressUseCase$invoke$1.getOutputMinFrameDuration;
                    raise = (arrow.core.raise.Raise) formatAddressUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) formatAddressUseCase$invoke$1.getInputFormats;
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration3 = (com.paypal.oslo.core.i18n.domain.model.AddressConfiguration) formatAddressUseCase$invoke$1.getOutputFormats;
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) formatAddressUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    defaultRaise2 = r0;
                    addressConfiguration2 = addressConfiguration3;
                    country = str;
                    obj = obj2;
                }
                com.paypal.oslo.core.i18n.domain.model.AddressMetadata addressMetadata2 = (com.paypal.oslo.core.i18n.domain.model.AddressMetadata) defaultRaise2.bind((arrow.core.Either) obj);
                com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil addressFormattingUtil = this.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(country);
                kotlin.Pair pair = (kotlin.Pair) raise.bind(addressFormattingUtil.getLayoutAndLabel(addressMetadata2, country, addressConfiguration2 == null ? addressConfiguration2.getStyle() : null));
                com.paypal.oslo.core.i18n.domain.model.LayoutMetadata layoutMetadata = (com.paypal.oslo.core.i18n.domain.model.LayoutMetadata) pair.component1();
                label = (com.paypal.oslo.core.i18n.domain.model.Label) pair.component2();
                countryCode = addressMetadata2.getCountryMetadata().getPreset().getCountryCode();
                resolution = addressConfiguration2 == null ? addressConfiguration2.getResolution() : null;
                if (resolution != com.paypal.oslo.core.i18n.domain.model.Address.Resolution.HIGH) {
                    resolution = null;
                }
                lowResolution = (resolution != null || (highResolution = layoutMetadata.getHighResolution()) == null) ? layoutMetadata.getLowResolution() : highResolution;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Layout for formatting address", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, lowResolution)), null, 4, null);
                com.paypal.oslo.core.i18n.domain.model.Address.Style style = addressConfiguration2 == null ? addressConfiguration2.getStyle() : null;
                i2 = style != null ? -1 : com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                if (i2 == 1 && i2 != 2) {
                    boolean z = (addressConfiguration2 != null ? addressConfiguration2.getStyle() : null) == com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_MULTILINE;
                    java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) lowResolution, new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE}, false, 0, 6, (java.lang.Object) null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = split$default.iterator();
                    while (it.hasNext()) {
                        java.lang.String processLayoutLine2 = this.Camera2StreamConfigurationMap.processLayoutLine((java.lang.String) it.next(), address2, z, label, countryCode);
                        if (kotlin.text.StringsKt.isBlank(processLayoutLine2)) {
                            processLayoutLine2 = null;
                        }
                        java.lang.String str2 = processLayoutLine2;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    processLayoutLine = kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
                } else {
                    processLayoutLine = this.Camera2StreamConfigurationMap.processLayoutLine(lowResolution, address2, addressConfiguration2.getStyle() != com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_SINGLELINE, label, countryCode);
                }
                defaultRaise.complete();
                arrow.core.Either.Left left = new arrow.core.Either.Right(processLayoutLine);
                return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(left, "FormatAddressUseCase");
            }
        }
        formatAddressUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase$invoke$1(this, continuation);
        java.lang.Object obj22 = formatAddressUseCase$invoke$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatAddressUseCase$invoke$1.getOutputStallDuration;
        if (i != 0) {
        }
        com.paypal.oslo.core.i18n.domain.model.AddressMetadata addressMetadata22 = (com.paypal.oslo.core.i18n.domain.model.AddressMetadata) defaultRaise2.bind((arrow.core.Either) obj);
        com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil addressFormattingUtil2 = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(country);
        kotlin.Pair pair2 = (kotlin.Pair) raise.bind(addressFormattingUtil2.getLayoutAndLabel(addressMetadata22, country, addressConfiguration2 == null ? addressConfiguration2.getStyle() : null));
        com.paypal.oslo.core.i18n.domain.model.LayoutMetadata layoutMetadata2 = (com.paypal.oslo.core.i18n.domain.model.LayoutMetadata) pair2.component1();
        label = (com.paypal.oslo.core.i18n.domain.model.Label) pair2.component2();
        countryCode = addressMetadata22.getCountryMetadata().getPreset().getCountryCode();
        if (addressConfiguration2 == null) {
        }
        if (resolution != com.paypal.oslo.core.i18n.domain.model.Address.Resolution.HIGH) {
        }
        if (resolution != null) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Layout for formatting address", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, lowResolution)), null, 4, null);
        if (addressConfiguration2 == null) {
        }
        if (style != null) {
        }
        if (i2 == 1) {
        }
        processLayoutLine = this.Camera2StreamConfigurationMap.processLayoutLine(lowResolution, address2, addressConfiguration2.getStyle() != com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_SINGLELINE, label, countryCode);
        defaultRaise.complete();
        arrow.core.Either.Left left2 = new arrow.core.Either.Right(processLayoutLine);
        return com.paypal.oslo.core.i18n.domain.usecase.AddressUseCaseExtensionsKt.mapAddressError(left2, "FormatAddressUseCase");
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.Address.Style.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Address.Style.SINGLELINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.Address.Style.INTERNATIONAL_SINGLELINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
