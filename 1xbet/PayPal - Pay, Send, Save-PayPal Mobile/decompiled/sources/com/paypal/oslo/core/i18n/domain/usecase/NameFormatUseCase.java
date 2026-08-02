package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;", "nameRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/util/NameUtil;", "nameUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/util/NameUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "nameInput", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "nameConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/NameError;", "", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/util/NameUtil;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NameFormatUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.NameRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.NameUtil getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public NameFormatUseCase(com.paypal.oslo.core.i18n.domain.repository.NameRepository nameRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.NameUtil nameUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameUtil, "");
        this.Camera2StreamConfigurationMap = nameRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = localeResolverCache;
        this.getHighSpeedVideoFpsRanges = nameUtil;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase, com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            nameConfiguration = null;
        }
        return nameFormatUseCase.invoke(nameInput, nameConfiguration, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00e4, B:15:0x00ea, B:16:0x011f, B:18:0x012b, B:20:0x013d, B:22:0x0141, B:24:0x0145, B:26:0x014b, B:34:0x016c, B:36:0x0172, B:40:0x018a, B:42:0x0192, B:44:0x01b9, B:46:0x01bd, B:47:0x01e4, B:50:0x01cf, B:52:0x01d3, B:53:0x01ef, B:54:0x01f4, B:55:0x01f5, B:56:0x0210, B:58:0x017a, B:60:0x0180, B:64:0x0155, B:67:0x019a, B:71:0x01a2, B:73:0x01a8, B:75:0x01ae, B:76:0x0211, B:77:0x0216, B:78:0x0131, B:80:0x0137, B:84:0x0111, B:85:0x0217, B:86:0x021c), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0141 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00e4, B:15:0x00ea, B:16:0x011f, B:18:0x012b, B:20:0x013d, B:22:0x0141, B:24:0x0145, B:26:0x014b, B:34:0x016c, B:36:0x0172, B:40:0x018a, B:42:0x0192, B:44:0x01b9, B:46:0x01bd, B:47:0x01e4, B:50:0x01cf, B:52:0x01d3, B:53:0x01ef, B:54:0x01f4, B:55:0x01f5, B:56:0x0210, B:58:0x017a, B:60:0x0180, B:64:0x0155, B:67:0x019a, B:71:0x01a2, B:73:0x01a8, B:75:0x01ae, B:76:0x0211, B:77:0x0216, B:78:0x0131, B:80:0x0137, B:84:0x0111, B:85:0x0217, B:86:0x021c), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b9 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00e4, B:15:0x00ea, B:16:0x011f, B:18:0x012b, B:20:0x013d, B:22:0x0141, B:24:0x0145, B:26:0x014b, B:34:0x016c, B:36:0x0172, B:40:0x018a, B:42:0x0192, B:44:0x01b9, B:46:0x01bd, B:47:0x01e4, B:50:0x01cf, B:52:0x01d3, B:53:0x01ef, B:54:0x01f4, B:55:0x01f5, B:56:0x0210, B:58:0x017a, B:60:0x0180, B:64:0x0155, B:67:0x019a, B:71:0x01a2, B:73:0x01a8, B:75:0x01ae, B:76:0x0211, B:77:0x0216, B:78:0x0131, B:80:0x0137, B:84:0x0111, B:85:0x0217, B:86:0x021c), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f5 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00e4, B:15:0x00ea, B:16:0x011f, B:18:0x012b, B:20:0x013d, B:22:0x0141, B:24:0x0145, B:26:0x014b, B:34:0x016c, B:36:0x0172, B:40:0x018a, B:42:0x0192, B:44:0x01b9, B:46:0x01bd, B:47:0x01e4, B:50:0x01cf, B:52:0x01d3, B:53:0x01ef, B:54:0x01f4, B:55:0x01f5, B:56:0x0210, B:58:0x017a, B:60:0x0180, B:64:0x0155, B:67:0x019a, B:71:0x01a2, B:73:0x01a8, B:75:0x01ae, B:76:0x0211, B:77:0x0216, B:78:0x0131, B:80:0x0137, B:84:0x0111, B:85:0x0217, B:86:0x021c), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00e4, B:15:0x00ea, B:16:0x011f, B:18:0x012b, B:20:0x013d, B:22:0x0141, B:24:0x0145, B:26:0x014b, B:34:0x016c, B:36:0x0172, B:40:0x018a, B:42:0x0192, B:44:0x01b9, B:46:0x01bd, B:47:0x01e4, B:50:0x01cf, B:52:0x01d3, B:53:0x01ef, B:54:0x01f4, B:55:0x01f5, B:56:0x0210, B:58:0x017a, B:60:0x0180, B:64:0x0155, B:67:0x019a, B:71:0x01a2, B:73:0x01a8, B:75:0x01ae, B:76:0x0211, B:77:0x0216, B:78:0x0131, B:80:0x0137, B:84:0x0111, B:85:0x0217, B:86:0x021c), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0137 A[Catch: all -> 0x0048, RaiseCancellationException -> 0x004b, TryCatch #3 {RaiseCancellationException -> 0x004b, all -> 0x0048, blocks: (B:11:0x0043, B:12:0x00e4, B:15:0x00ea, B:16:0x011f, B:18:0x012b, B:20:0x013d, B:22:0x0141, B:24:0x0145, B:26:0x014b, B:34:0x016c, B:36:0x0172, B:40:0x018a, B:42:0x0192, B:44:0x01b9, B:46:0x01bd, B:47:0x01e4, B:50:0x01cf, B:52:0x01d3, B:53:0x01ef, B:54:0x01f4, B:55:0x01f5, B:56:0x0210, B:58:0x017a, B:60:0x0180, B:64:0x0155, B:67:0x019a, B:71:0x01a2, B:73:0x01a8, B:75:0x01ae, B:76:0x0211, B:77:0x0216, B:78:0x0131, B:80:0x0137, B:84:0x0111, B:85:0x0217, B:86:0x021c), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, java.lang.String>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase$invoke$1 nameFormatUseCase$invoke$1;
        int i;
        java.lang.String str;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.Locale orNull;
        com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration2;
        com.paypal.oslo.core.i18n.domain.model.NameInput nameInput2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.core.i18n.domain.model.name.NameMetadata nameMetadata;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata countryMetadata;
        java.lang.String primaryScript;
        com.paypal.oslo.core.i18n.domain.model.name.BusinessNameMetadata businessMetadata;
        java.util.Map<java.lang.String, java.lang.String> layouts;
        java.lang.String fillLayout;
        java.lang.String str2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> layout;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata defaultMetadata;
        java.util.Map<java.lang.String, java.lang.String> map;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata countryMetadata2;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase$invoke$1) {
            nameFormatUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase$invoke$1) continuation;
            if ((nameFormatUseCase$invoke$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                nameFormatUseCase$invoke$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = nameFormatUseCase$invoke$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nameFormatUseCase$invoke$1.getInputSizeshNQ4ISI;
                str = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "NameFormat UseCase invoked", null, null, 6, null);
                        if (nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person) {
                            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person = nameConfiguration instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person ? (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person) nameConfiguration : null;
                            if (person == null || (orNull = person.getLocale()) == null) {
                                orNull = this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale().getOrNull();
                            }
                        } else {
                            if (!(nameInput instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business business = nameConfiguration instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business ? (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Business) nameConfiguration : null;
                            if (business == null || (orNull = business.getLocale()) == null) {
                                orNull = this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale().getOrNull();
                            }
                        }
                        kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.NameMetadataError, com.paypal.oslo.core.i18n.domain.model.name.NameMetadata>> nameMetadata2 = this.Camera2StreamConfigurationMap.getNameMetadata(orNull != null ? orNull.getCountry() : null, orNull);
                        nameFormatUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = nameInput;
                        nameFormatUseCase$invoke$1.getHighSpeedVideoSizesFor = nameConfiguration;
                        nameFormatUseCase$invoke$1.getInputFormats = defaultRaise2;
                        nameFormatUseCase$invoke$1.getOutputFormats = defaultRaise3;
                        nameFormatUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(orNull);
                        nameFormatUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        nameFormatUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        nameFormatUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        nameFormatUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        nameFormatUseCase$invoke$1.getInputSizeshNQ4ISI = 1;
                        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(nameMetadata2, nameFormatUseCase$invoke$1);
                        if (first == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        nameConfiguration2 = nameConfiguration;
                        defaultRaise = defaultRaise2;
                        obj = first;
                        nameInput2 = nameInput;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = nameFormatUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i3 = nameFormatUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i4 = nameFormatUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = nameFormatUseCase$invoke$1.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) nameFormatUseCase$invoke$1.getOutputFormats;
                    defaultRaise = (arrow.core.raise.DefaultRaise) nameFormatUseCase$invoke$1.getInputFormats;
                    nameConfiguration2 = (com.paypal.oslo.core.i18n.domain.model.NameConfiguration) nameFormatUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    nameInput2 = (com.paypal.oslo.core.i18n.domain.model.NameInput) nameFormatUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.core.i18n.domain.error.NameMetadataError nameMetadataError = (com.paypal.oslo.core.i18n.domain.error.NameMetadataError) ((arrow.core.Either.Left) either).getValue();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to fetch metadata: ");
                    sb.append(nameMetadataError);
                    right = new arrow.core.Either.Left(new com.paypal.oslo.core.i18n.domain.model.NameError.FetchError(sb.toString()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                nameMetadata = (com.paypal.oslo.core.i18n.domain.model.name.NameMetadata) raise.bind(right);
                countryMetadata = nameMetadata.getCountryMetadata();
                if (countryMetadata != null || (primaryScript = countryMetadata.getPrimaryScript()) == null) {
                    com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata defaultMetadata2 = nameMetadata.getDefaultMetadata();
                    primaryScript = defaultMetadata2 == null ? defaultMetadata2.getPrimaryScript() : null;
                }
                if (!(nameInput2 instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person)) {
                    com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person person2 = nameConfiguration2 instanceof com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person ? (com.paypal.oslo.core.i18n.domain.model.NameConfiguration.Person) nameConfiguration2 : null;
                    com.paypal.oslo.core.i18n.domain.model.NameStyle style = person2 != null ? person2.getStyle() : null;
                    int i6 = style == null ? -1 : com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                    if (i6 == 1) {
                        str2 = a.b.m;
                    } else if (i6 == 2) {
                        str2 = "informal";
                    } else {
                        str2 = "businessInformal";
                    }
                    if (nameMetadata == null || (countryMetadata2 = nameMetadata.getCountryMetadata()) == null || (layout = countryMetadata2.getLayout()) == null) {
                        layout = (nameMetadata == null || (defaultMetadata = nameMetadata.getDefaultMetadata()) == null) ? null : defaultMetadata.getLayout();
                    }
                    if (primaryScript != null && layout != null && (map = layout.get(str2)) != null) {
                        str = map.get(primaryScript);
                    }
                } else {
                    if (!(nameInput2 instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (primaryScript != null && nameMetadata != null && (businessMetadata = nameMetadata.getBusinessMetadata()) != null && (layouts = businessMetadata.getLayouts()) != null) {
                        str = layouts.get("Latn");
                    }
                }
                if (str != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No Layout Found for script ");
                    sb2.append(primaryScript);
                    raise.raise(new com.paypal.oslo.core.i18n.domain.model.NameError.NoLayoutFound(sb2.toString()));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (!(nameInput2 instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person)) {
                    if (!(nameInput2 instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    final java.lang.String businessName = ((com.paypal.oslo.core.i18n.domain.model.NameInput.Business) nameInput2).getBusinessName();
                    fillLayout = this.getHighSpeedVideoFpsRanges.fillLayout(str, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase.m11565$r8$lambda$x2saCxMTMnTqiGUR6lDqT9TT0o(businessName, (java.lang.String) obj2);
                        }
                    });
                } else {
                    final com.paypal.oslo.core.i18n.domain.model.PersonName name2 = ((com.paypal.oslo.core.i18n.domain.model.NameInput.Person) nameInput2).getName();
                    fillLayout = this.getHighSpeedVideoFpsRanges.fillLayout(str, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase.$r8$lambda$8UUoR0tqLF4HkDhwU_swbn6Wmd4(com.paypal.oslo.core.i18n.domain.model.PersonName.this, (java.lang.String) obj2);
                        }
                    });
                }
                defaultRaise.complete();
                return new arrow.core.Either.Right(fillLayout);
            }
        }
        nameFormatUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = nameFormatUseCase$invoke$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nameFormatUseCase$invoke$1.getInputSizeshNQ4ISI;
        str = null;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        nameMetadata = (com.paypal.oslo.core.i18n.domain.model.name.NameMetadata) raise.bind(right);
        countryMetadata = nameMetadata.getCountryMetadata();
        if (countryMetadata != null) {
        }
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata defaultMetadata22 = nameMetadata.getDefaultMetadata();
        if (defaultMetadata22 == null) {
        }
        if (!(nameInput2 instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person)) {
        }
        if (str != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r4.equals("secondSurname") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r3 = r3.m11448getSecondSurnamedtlYlO0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r4.equals("secondSurName") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r4.equals("surname") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r3 = r3.m11449getSurName5MXJos4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r4.equals("surName") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.String $r8$lambda$8UUoR0tqLF4HkDhwU_swbn6Wmd4(com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1853946629:
                break;
            case -1852993317:
                break;
            case -818219584:
                if (str.equals(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName)) {
                    java.lang.String m11447getMiddleName114sck0 = personName.m11447getMiddleName114sck0();
                    if (m11447getMiddleName114sck0 == null) {
                        return null;
                    }
                    return m11447getMiddleName114sck0;
                }
                return "";
            case -330289689:
                break;
            case -329336377:
                break;
            case 1469046696:
                if (str.equals(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName)) {
                    java.lang.String m11446getGivenNamedfzjkSU = personName.m11446getGivenNamedfzjkSU();
                    if (m11446getGivenNamedfzjkSU == null) {
                        return null;
                    }
                    return m11446getGivenNamedfzjkSU;
                }
                return "";
            default:
                return "";
        }
    }

    /* renamed from: $r8$lambda$x2sa-CxMTMnTqiGUR6lDqT9TT0o, reason: not valid java name */
    public static /* synthetic */ java.lang.String m11565$r8$lambda$x2saCxMTMnTqiGUR6lDqT9TT0o(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "businessName")) {
            return str;
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.NameStyle.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.NameStyle.FULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.NameStyle.INFORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
