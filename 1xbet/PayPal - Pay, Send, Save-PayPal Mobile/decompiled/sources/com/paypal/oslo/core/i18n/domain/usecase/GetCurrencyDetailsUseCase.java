package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/GetCurrencyDetailsUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;", "currencyRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/util/CurrencyUtil;", "currencyUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/util/CurrencyUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;", "currencyConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyInfo;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/repository/CurrencyRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/util/CurrencyUtil;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetCurrencyDetailsUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.CurrencyUtil getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCurrencyDetailsUseCase(com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository currencyRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.CurrencyUtil currencyUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyUtil, "");
        this.getHighSpeedVideoSizes = currencyRepository;
        this.getHighSpeedVideoFpsRangesFor = localeResolverCache;
        this.getHighResolutionOutputSizeshNQ4ISI = currencyUtil;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9 A[Catch: all -> 0x0046, RaiseCancellationException -> 0x0049, TryCatch #3 {RaiseCancellationException -> 0x0049, all -> 0x0046, blocks: (B:11:0x0042, B:12:0x00ad, B:14:0x00c9, B:16:0x00d1, B:17:0x00d5, B:21:0x00e0, B:37:0x00ee, B:38:0x00fd), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee A[Catch: all -> 0x0046, RaiseCancellationException -> 0x0049, TryCatch #3 {RaiseCancellationException -> 0x0049, all -> 0x0046, blocks: (B:11:0x0042, B:12:0x00ad, B:14:0x00c9, B:16:0x00d1, B:17:0x00d5, B:21:0x00e0, B:37:0x00ee, B:38:0x00fd), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.CurrencyError, com.paypal.oslo.core.i18n.domain.model.CurrencyInfo>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase$invoke$1 getCurrencyDetailsUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        java.util.Locale locale;
        com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration2;
        arrow.core.raise.Raise raise2;
        arrow.core.Either left;
        com.paypal.oslo.core.i18n.domain.model.CurrencyDetail currencyDetail;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase$invoke$1) {
            getCurrencyDetailsUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase$invoke$1) continuation;
            if ((getCurrencyDetailsUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                getCurrencyDetailsUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = getCurrencyDetailsUseCase$invoke$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCurrencyDetailsUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "GetCurrencyDetails UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", currencyConfiguration.m11393getCurrencyCodehkTgrg())), null, 4, null);
                        java.util.Locale locale2 = currencyConfiguration.getLocale();
                        if (locale2 == null) {
                            locale2 = (java.util.Locale) defaultRaise3.bind(this.getHighSpeedVideoFpsRangesFor.getUserLocale());
                        }
                        com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository currencyRepository = this.getHighSpeedVideoSizes;
                        getCurrencyDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = currencyConfiguration;
                        getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise;
                        getCurrencyDetailsUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
                        getCurrencyDetailsUseCase$invoke$1.getOutputFormats = locale2;
                        getCurrencyDetailsUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                        getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getCurrencyDetailsUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        getCurrencyDetailsUseCase$invoke$1.getInputFormats = 1;
                        java.lang.Object currencyMetadata = currencyRepository.getCurrencyMetadata(locale2, getCurrencyDetailsUseCase$invoke$1);
                        if (currencyMetadata == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = currencyMetadata;
                        raise = defaultRaise3;
                        locale = locale2;
                        currencyConfiguration2 = currencyConfiguration;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        if (left instanceof arrow.core.Either.Left) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getCurrencyDetailsUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i3 = getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i4 = getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    raise2 = (arrow.core.raise.Raise) getCurrencyDetailsUseCase$invoke$1.getInputSizeshNQ4ISI;
                    locale = (java.util.Locale) getCurrencyDetailsUseCase$invoke$1.getOutputFormats;
                    raise = (arrow.core.raise.Raise) getCurrencyDetailsUseCase$invoke$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) getCurrencyDetailsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    currencyConfiguration2 = (com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration) getCurrencyDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        if (left instanceof arrow.core.Either.Left) {
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata currencyMetadata2 = (com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata) raise2.bind((arrow.core.Either) obj);
                java.lang.String m11393getCurrencyCodehkTgrg = currencyConfiguration2.m11393getCurrencyCodehkTgrg();
                currencyDetail = currencyMetadata2.getCurrencyDetails().getCurrencies().get(m11393getCurrencyCodehkTgrg);
                if (currencyDetail != null) {
                    raise.raise(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.CurrencyDetailsFetchError("No currency details found"));
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String narrowSymbol = currencyDetail.getNarrowSymbol();
                if (narrowSymbol == null) {
                    narrowSymbol = currencyDetail.getSymbol();
                }
                java.lang.String currencyName$i18n_release = this.getHighResolutionOutputSizeshNQ4ISI.getCurrencyName$i18n_release(m11393getCurrencyCodehkTgrg, locale);
                if (currencyName$i18n_release == null) {
                    currencyName$i18n_release = "";
                }
                com.paypal.oslo.core.i18n.domain.model.CurrencyInfo currencyInfo = new com.paypal.oslo.core.i18n.domain.model.CurrencyInfo(m11393getCurrencyCodehkTgrg, narrowSymbol, currencyName$i18n_release, null);
                defaultRaise2.complete();
                left = new arrow.core.Either.Right(currencyInfo);
                if (left instanceof arrow.core.Either.Left) {
                    java.lang.Object value = ((arrow.core.Either.Left) left).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Error fetching currency details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", value.toString())), null, null, 12, null);
                    return new arrow.core.Either.Left(value instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyError ? (com.paypal.oslo.core.i18n.domain.model.CurrencyError) value : new com.paypal.oslo.core.i18n.domain.model.CurrencyError.MetadataFetchError("Failed to get currency metadata"));
                }
                if (left instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) left).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getCurrencyDetailsUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCurrencyDetailsUseCase$invoke$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCurrencyDetailsUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata currencyMetadata22 = (com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata) raise2.bind((arrow.core.Either) obj2);
        java.lang.String m11393getCurrencyCodehkTgrg2 = currencyConfiguration2.m11393getCurrencyCodehkTgrg();
        currencyDetail = currencyMetadata22.getCurrencyDetails().getCurrencies().get(m11393getCurrencyCodehkTgrg2);
        if (currencyDetail != null) {
        }
    }
}
