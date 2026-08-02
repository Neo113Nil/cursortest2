package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086B¢\u0006\u0004\b\u0013\u0010\u0014JS\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010#J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0015\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010,"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;", "currencyRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/util/CurrencyUtil;", "currencyUtil", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAmountUseCase;", "formatAmountUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/util/CurrencyUtil;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAmountUseCase;)V", "Ljava/math/BigDecimal;", "amount", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", "invoke", "(Ljava/math/BigDecimal;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyMetadata;", "p2", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;", "p3", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyCode;", "p4", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyDetail;", "p5", "Ljava/util/Locale;", "p6", "Camera2StreamConfigurationMap", "(Ljava/math/BigDecimal;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyMetadata;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyDetail;Ljava/util/Locale;)Larrow/core/Either;", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencyMetadata;Ljava/lang/String;)Larrow/core/Either;", "getHighSpeedVideoSizes", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/util/CurrencyUtil;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAmountUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatCurrencyUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.i18n.domain.util.CurrencyUtil getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FormatCurrencyUseCase(com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository currencyRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.CurrencyUtil currencyUtil, com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase formatAmountUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAmountUseCase, "");
        this.getHighSpeedVideoFpsRanges = currencyRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = localeResolverCache;
        this.getHighSpeedVideoFpsRangesFor = currencyUtil;
        this.getHighSpeedVideoSizes = formatAmountUseCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|7|(1:(3:10|11|12)(2:51|52))(7:53|54|(1:56)(1:73)|57|(4:59|60|(1:62)(2:64|(1:66)(2:67|68))|63)|69|(1:71)(1:72))|13|14|15|(1:17)(2:41|(1:43)(2:44|45))|18|(1:20)|21|(1:23)(2:36|(1:38)(2:39|40))|24|25|(2:27|28)(2:30|(2:32|33)(2:34|35))))|78|6|7|(0)(0)|13|14|15|(0)(0)|18|(0)|21|(0)(0)|24|25|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0216, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0226, code lost:
    
        r14.complete();
        r1 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(r0, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x021c, code lost:
    
        r14.complete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0223, code lost:
    
        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0224, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0225, code lost:
    
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x021b, code lost:
    
        r14 = r5;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x021b: MOVE (r14 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:77:0x021b */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0225: MOVE (r14 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:75:0x0225 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d A[Catch: RaiseCancellationException -> 0x0216, all -> 0x0218, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x0216, all -> 0x0218, blocks: (B:14:0x0131, B:17:0x015d, B:18:0x0198, B:20:0x01a5, B:21:0x01a7, B:23:0x01bc, B:24:0x01f9, B:36:0x01e7, B:38:0x01eb, B:39:0x020a, B:40:0x020f, B:41:0x0186, B:43:0x018a, B:44:0x0210, B:45:0x0215), top: B:13:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a5 A[Catch: RaiseCancellationException -> 0x0216, all -> 0x0218, TryCatch #4 {RaiseCancellationException -> 0x0216, all -> 0x0218, blocks: (B:14:0x0131, B:17:0x015d, B:18:0x0198, B:20:0x01a5, B:21:0x01a7, B:23:0x01bc, B:24:0x01f9, B:36:0x01e7, B:38:0x01eb, B:39:0x020a, B:40:0x020f, B:41:0x0186, B:43:0x018a, B:44:0x0210, B:45:0x0215), top: B:13:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01bc A[Catch: RaiseCancellationException -> 0x0216, all -> 0x0218, TryCatch #4 {RaiseCancellationException -> 0x0216, all -> 0x0218, blocks: (B:14:0x0131, B:17:0x015d, B:18:0x0198, B:20:0x01a5, B:21:0x01a7, B:23:0x01bc, B:24:0x01f9, B:36:0x01e7, B:38:0x01eb, B:39:0x020a, B:40:0x020f, B:41:0x0186, B:43:0x018a, B:44:0x0210, B:45:0x0215), top: B:13:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e7 A[Catch: RaiseCancellationException -> 0x0216, all -> 0x0218, TryCatch #4 {RaiseCancellationException -> 0x0216, all -> 0x0218, blocks: (B:14:0x0131, B:17:0x015d, B:18:0x0198, B:20:0x01a5, B:21:0x01a7, B:23:0x01bc, B:24:0x01f9, B:36:0x01e7, B:38:0x01eb, B:39:0x020a, B:40:0x020f, B:41:0x0186, B:43:0x018a, B:44:0x0210, B:45:0x0215), top: B:13:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186 A[Catch: RaiseCancellationException -> 0x0216, all -> 0x0218, TryCatch #4 {RaiseCancellationException -> 0x0216, all -> 0x0218, blocks: (B:14:0x0131, B:17:0x015d, B:18:0x0198, B:20:0x01a5, B:21:0x01a7, B:23:0x01bc, B:24:0x01f9, B:36:0x01e7, B:38:0x01eb, B:39:0x020a, B:40:0x020f, B:41:0x0186, B:43:0x018a, B:44:0x0210, B:45:0x0215), top: B:13:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.math.BigDecimal bigDecimal, com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.CurrencyError, java.lang.String>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$invoke$1 formatCurrencyUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.Either left;
        java.math.BigDecimal bigDecimal2;
        com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        java.util.Locale locale;
        arrow.core.Either right;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.CurrencyError, java.lang.String> invoke;
        arrow.core.Either right2;
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.CurrencyError, java.lang.String> Camera2StreamConfigurationMap;
        arrow.core.Either right3;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$invoke$1) {
            formatCurrencyUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$invoke$1) continuation;
            if ((formatCurrencyUseCase$invoke$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                formatCurrencyUseCase$invoke$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = formatCurrencyUseCase$invoke$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatCurrencyUseCase$invoke$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = kotlin.TuplesKt.to("amount", bigDecimal.toPlainString());
                    com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle2 = currencyConfiguration.getCurrencyStyle();
                    pairArr[1] = kotlin.TuplesKt.to("currencyStyle", currencyStyle2 != null ? currencyStyle2.name() : null);
                    pairArr[2] = kotlin.TuplesKt.to("currencyCode", currencyConfiguration.m11393getCurrencyCodehkTgrg());
                    pairArr[3] = kotlin.TuplesKt.to("fractionDigits", kotlin.coroutines.jvm.internal.Boxing.boxInt(currencyConfiguration.getDigits()));
                    com.paypal.android.logger.Logger.i$default(logger, "FormatCurrency UseCase invoked", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    java.util.Locale locale2 = currencyConfiguration.getLocale();
                    if (locale2 == null) {
                        arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> userLocale = this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale();
                        if (userLocale instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.core.i18n.domain.error.I18nError i18nError = (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) userLocale).getValue();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to get user locale: ");
                            sb.append(i18nError);
                            right = new arrow.core.Either.Left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError(sb.toString()));
                        } else {
                            if (!(userLocale instanceof arrow.core.Either.Right)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            right = new arrow.core.Either.Right(((arrow.core.Either.Right) userLocale).getValue());
                        }
                        locale2 = (java.util.Locale) defaultRaise3.bind(right);
                    }
                    bigDecimal2 = bigDecimal;
                    formatCurrencyUseCase$invoke$1.Camera2StreamConfigurationMap = bigDecimal2;
                    currencyConfiguration2 = currencyConfiguration;
                    formatCurrencyUseCase$invoke$1.getHighSpeedVideoSizesFor = currencyConfiguration2;
                    formatCurrencyUseCase$invoke$1.getOutputFormats = defaultRaise2;
                    formatCurrencyUseCase$invoke$1.getInputFormats = defaultRaise3;
                    formatCurrencyUseCase$invoke$1.getOutputMinFrameDuration = locale2;
                    formatCurrencyUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                    formatCurrencyUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    formatCurrencyUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    formatCurrencyUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    formatCurrencyUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    formatCurrencyUseCase$invoke$1.getOutputSizes = 1;
                    java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(locale2, formatCurrencyUseCase$invoke$1);
                    if (highSpeedVideoSizes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    raise = defaultRaise3;
                    raise2 = raise;
                    obj = highSpeedVideoSizes;
                    locale = locale2;
                    defaultRaise = defaultRaise2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = formatCurrencyUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i3 = formatCurrencyUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i4 = formatCurrencyUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = formatCurrencyUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) formatCurrencyUseCase$invoke$1.getInputSizeshNQ4ISI;
                    java.util.Locale locale3 = (java.util.Locale) formatCurrencyUseCase$invoke$1.getOutputMinFrameDuration;
                    arrow.core.raise.Raise raise3 = (arrow.core.raise.Raise) formatCurrencyUseCase$invoke$1.getInputFormats;
                    arrow.core.raise.DefaultRaise defaultRaise4 = (arrow.core.raise.DefaultRaise) formatCurrencyUseCase$invoke$1.getOutputFormats;
                    currencyConfiguration2 = (com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration) formatCurrencyUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    java.math.BigDecimal bigDecimal3 = (java.math.BigDecimal) formatCurrencyUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    locale = locale3;
                    raise2 = raise3;
                    defaultRaise = defaultRaise4;
                    bigDecimal2 = bigDecimal3;
                }
                com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata currencyMetadata = (com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata) raise.bind((arrow.core.Either) obj);
                com.paypal.oslo.core.i18n.domain.model.CurrencyDetail currencyDetail = (com.paypal.oslo.core.i18n.domain.model.CurrencyDetail) raise2.bind(Camera2StreamConfigurationMap(currencyMetadata, currencyConfiguration2.m11393getCurrencyCodehkTgrg()));
                com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase formatAmountUseCase = this.getHighSpeedVideoSizes;
                java.math.BigDecimal abs = bigDecimal2.abs();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(abs, "");
                invoke = formatAmountUseCase.invoke(abs, currencyConfiguration2);
                if (!(invoke instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.core.i18n.domain.model.CurrencyError currencyError = (com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) invoke).getValue();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to format amount ");
                    sb2.append(bigDecimal2);
                    sb2.append(": ");
                    sb2.append(currencyError);
                    right2 = new arrow.core.Either.Left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(sb2.toString()));
                } else {
                    if (!(invoke instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right2 = new arrow.core.Either.Right(((arrow.core.Either.Right) invoke).getValue());
                }
                java.lang.String str = (java.lang.String) raise2.bind(right2);
                currencyStyle = currencyConfiguration2.getCurrencyStyle();
                if (currencyStyle == null) {
                    currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL;
                }
                com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle3 = currencyStyle;
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bigDecimal2, str, currencyMetadata, currencyStyle3, currencyConfiguration2.m11393getCurrencyCodehkTgrg(), currencyDetail, locale);
                if (!(Camera2StreamConfigurationMap instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.core.i18n.domain.model.CurrencyError currencyError2 = (com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) Camera2StreamConfigurationMap).getValue();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to format currency with style ");
                    sb3.append(currencyStyle3);
                    sb3.append(": ");
                    sb3.append(currencyError2);
                    right3 = new arrow.core.Either.Left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(sb3.toString()));
                } else {
                    if (!(Camera2StreamConfigurationMap instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right3 = new arrow.core.Either.Right(((arrow.core.Either.Right) Camera2StreamConfigurationMap).getValue());
                }
                java.lang.String str2 = (java.lang.String) raise2.bind(right3);
                defaultRaise.complete();
                left = new arrow.core.Either.Right(str2);
                if (left instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.CurrencyError currencyError3 = (com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) left).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Received error while executing FormatCurrencyUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currencyError3.getClass()).getSimpleName()), kotlin.TuplesKt.to("errorDescription", currencyError3.getDescription())), null, null, 12, null);
                    return new arrow.core.Either.Left(currencyError3);
                }
                if (left instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) left).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        formatCurrencyUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = formatCurrencyUseCase$invoke$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatCurrencyUseCase$invoke$1.getOutputSizes;
        if (i != 0) {
        }
        com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata currencyMetadata2 = (com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata) raise.bind((arrow.core.Either) obj2);
        com.paypal.oslo.core.i18n.domain.model.CurrencyDetail currencyDetail2 = (com.paypal.oslo.core.i18n.domain.model.CurrencyDetail) raise2.bind(Camera2StreamConfigurationMap(currencyMetadata2, currencyConfiguration2.m11393getCurrencyCodehkTgrg()));
        com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase formatAmountUseCase2 = this.getHighSpeedVideoSizes;
        java.math.BigDecimal abs2 = bigDecimal2.abs();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(abs2, "");
        invoke = formatAmountUseCase2.invoke(abs2, currencyConfiguration2);
        if (!(invoke instanceof arrow.core.Either.Left)) {
        }
        java.lang.String str3 = (java.lang.String) raise2.bind(right2);
        currencyStyle = currencyConfiguration2.getCurrencyStyle();
        if (currencyStyle == null) {
        }
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle32 = currencyStyle;
        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bigDecimal2, str3, currencyMetadata2, currencyStyle32, currencyConfiguration2.m11393getCurrencyCodehkTgrg(), currencyDetail2, locale);
        if (!(Camera2StreamConfigurationMap instanceof arrow.core.Either.Left)) {
        }
        java.lang.String str22 = (java.lang.String) raise2.bind(right3);
        defaultRaise.complete();
        left = new arrow.core.Either.Right(str22);
        if (left instanceof arrow.core.Either.Left) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.Locale locale, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.CurrencyError, com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$fetchCurrencyMetadata$1 formatCurrencyUseCase$fetchCurrencyMetadata$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError metadataFetchError;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$fetchCurrencyMetadata$1) {
            formatCurrencyUseCase$fetchCurrencyMetadata$1 = (com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$fetchCurrencyMetadata$1) continuation;
            if ((formatCurrencyUseCase$fetchCurrencyMetadata$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                formatCurrencyUseCase$fetchCurrencyMetadata$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = formatCurrencyUseCase$fetchCurrencyMetadata$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatCurrencyUseCase$fetchCurrencyMetadata$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository currencyRepository = this.getHighSpeedVideoFpsRanges;
                    formatCurrencyUseCase$fetchCurrencyMetadata$1.Camera2StreamConfigurationMap = locale;
                    formatCurrencyUseCase$fetchCurrencyMetadata$1.getHighSpeedVideoFpsRanges = 1;
                    obj = currencyRepository.getCurrencyMetadata(locale, formatCurrencyUseCase$fetchCurrencyMetadata$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    locale = (java.util.Locale) formatCurrencyUseCase$fetchCurrencyMetadata$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError currencyMetadataError = (com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError) ((arrow.core.Either.Left) either).getValue();
                    if (currencyMetadataError instanceof com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure) {
                        com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure parsingFailure = (com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure) currencyMetadataError;
                        metadataFetchError = new com.paypal.oslo.core.i18n.domain.model.CurrencyError.ParsingFailure(parsingFailure.getMessage(), parsingFailure.getCause());
                    } else {
                        if (!(currencyMetadataError instanceof com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.MetadataFetchError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to fetch currency metadata for locale ");
                        sb.append(locale);
                        sb.append(": ");
                        sb.append(currencyMetadataError);
                        metadataFetchError = new com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError(sb.toString());
                    }
                    return new arrow.core.Either.Left(metadataFetchError);
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        formatCurrencyUseCase$fetchCurrencyMetadata$1 = new com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$fetchCurrencyMetadata$1(this, continuation);
        java.lang.Object obj2 = formatCurrencyUseCase$fetchCurrencyMetadata$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatCurrencyUseCase$fetchCurrencyMetadata$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    private final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.CurrencyError, java.lang.String> Camera2StreamConfigurationMap(java.math.BigDecimal p0, java.lang.String p1, com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata p2, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle p3, java.lang.String p4, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail p5, java.util.Locale p6) {
        java.lang.String str = "";
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(this.getHighSpeedVideoFpsRangesFor.getCurrencyPattern(p3, p2.getCurrencyLayout()), "#", p1, false, 4, (java.lang.Object) null);
            int i = com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase.WhenMappings.$EnumSwitchMapping$0[p3.ordinal()];
            if (i == 1) {
                str = p4;
            } else if (i == 2) {
                str = p5.getSymbol();
            } else if (i == 3) {
                str = p5.getNarrowSymbol();
                if (str == null) {
                    str = p5.getSymbol();
                }
                replace$default = this.getHighSpeedVideoFpsRangesFor.processInternationalFormat$i18n_release(replace$default, p5.getNarrowSymbol(), p5.getSymbol(), p4);
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.i18n.domain.util.CurrencyUtil currencyUtil = this.getHighSpeedVideoFpsRangesFor;
                java.math.BigDecimal abs = p0.abs();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(abs, "");
                java.lang.String currencyName$i18n_release = currencyUtil.getCurrencyName$i18n_release(abs, p4, p6);
                if (currencyName$i18n_release != null) {
                    str = currencyName$i18n_release;
                }
            }
            java.lang.String applyNegativeSign$i18n_release = this.getHighSpeedVideoFpsRangesFor.applyNegativeSign$i18n_release(p0, this.getHighSpeedVideoFpsRangesFor.replacePlaceholders(replace$default, str, p4, p2.getCurrencyLayout().getCurrencySpacing()));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Currency formatting successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", p4), kotlin.TuplesKt.to("currencyStyle", p3.name()), kotlin.TuplesKt.to("formattedResult", applyNegativeSign$i18n_release), kotlin.TuplesKt.to("locale", p6.toString())), null, 4, null);
            defaultRaise.complete();
            return new arrow.core.Either.Right(applyNegativeSign$i18n_release);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    private static arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.CurrencyError, com.paypal.oslo.core.i18n.domain.model.CurrencyDetail> Camera2StreamConfigurationMap(com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata p0, java.lang.String p1) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.core.i18n.domain.model.CurrencyDetail currencyDetail = p0.getCurrencyDetails().getCurrencies().get(p1);
            if (currencyDetail == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Currency detail not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", p1)), null, 4, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Currency detail not found for: ");
                sb.append(p1);
                defaultRaise2.raise(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(sb.toString()));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(currencyDetail);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.INTERNATIONAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.NAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
