package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 "}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/ValidateDocumentIdUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;", "documentRepository", "Lcom/paypal/oslo/core/i18n/domain/util/ValidateDocumentUtil;", "validateDocumentUtil", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;Lcom/paypal/oslo/core/i18n/domain/util/ValidateDocumentUtil;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;)V", "", "documentId", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationConfig;", "docIdConfig", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError;", "", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation;", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationConfig;Ljava/util/Map;Ljava/lang/String;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/util/ValidateDocumentUtil;", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidateDocumentIdUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.DocumentRepository Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.i18n.domain.util.ValidateDocumentUtil getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ValidateDocumentIdUseCase(com.paypal.oslo.core.i18n.domain.repository.DocumentRepository documentRepository, com.paypal.oslo.core.i18n.domain.util.ValidateDocumentUtil validateDocumentUtil, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateDocumentUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        this.Camera2StreamConfigurationMap = documentRepository;
        this.getHighSpeedVideoSizes = validateDocumentUtil;
        this.getHighSpeedVideoFpsRanges = localeResolverCache;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(3:10|11|12)(2:36|37))(5:38|39|(1:41)|42|(1:44)(1:45))|13|14|(4:16|(1:18)(2:22|(1:24)(2:25|(1:27)(1:28)))|19|20)(2:29|(2:31|32)(2:33|34))))|51|6|7|(0)(0)|13|14|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0121, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        r10.complete();
        r2 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(r0, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        r10.complete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig documentIDValidationConfig, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError, kotlin.Unit>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase$invoke$1 validateDocumentIdUseCase$invoke$1;
        int i;
        arrow.core.Either left;
        com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound metadataNotFound;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String m11410getCountryCodeiSWX8ZM;
        java.lang.String name2;
        com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig documentIDValidationConfig2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase$invoke$1) {
            validateDocumentIdUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase$invoke$1) continuation;
            if ((validateDocumentIdUseCase$invoke$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                validateDocumentIdUseCase$invoke$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = validateDocumentIdUseCase$invoke$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = validateDocumentIdUseCase$invoke$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "ValidateDocumentId UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("documentType", documentIDValidationConfig.getDocumentType().name())), null, 4, null);
                    m11410getCountryCodeiSWX8ZM = documentIDValidationConfig.m11410getCountryCodeiSWX8ZM();
                    if (m11410getCountryCodeiSWX8ZM == null) {
                        m11410getCountryCodeiSWX8ZM = ((java.util.Locale) defaultRaise2.bind(this.getHighSpeedVideoFpsRanges.getUserLocale())).getCountry();
                    }
                    name2 = documentIDValidationConfig.getDocumentType().name();
                    com.paypal.oslo.core.i18n.domain.repository.DocumentRepository documentRepository = this.Camera2StreamConfigurationMap;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(m11410getCountryCodeiSWX8ZM);
                    validateDocumentIdUseCase$invoke$1.Camera2StreamConfigurationMap = str;
                    documentIDValidationConfig2 = documentIDValidationConfig;
                    validateDocumentIdUseCase$invoke$1.getInputFormats = documentIDValidationConfig2;
                    validateDocumentIdUseCase$invoke$1.getOutputFormats = defaultRaise;
                    validateDocumentIdUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise2;
                    validateDocumentIdUseCase$invoke$1.getOutputMinFrameDuration = name2;
                    validateDocumentIdUseCase$invoke$1.getHighSpeedVideoSizesFor = m11410getCountryCodeiSWX8ZM;
                    validateDocumentIdUseCase$invoke$1.getOutputStallDuration = defaultRaise2;
                    validateDocumentIdUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    validateDocumentIdUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    validateDocumentIdUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    validateDocumentIdUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    validateDocumentIdUseCase$invoke$1.getOutputSizes = 1;
                    java.lang.Object documentMetadata = documentRepository.getDocumentMetadata(m11410getCountryCodeiSWX8ZM, validateDocumentIdUseCase$invoke$1);
                    if (documentMetadata == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    raise = defaultRaise2;
                    raise2 = raise;
                    obj = documentMetadata;
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = validateDocumentIdUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = validateDocumentIdUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i4 = validateDocumentIdUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i5 = validateDocumentIdUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) validateDocumentIdUseCase$invoke$1.getOutputStallDuration;
                    m11410getCountryCodeiSWX8ZM = (java.lang.String) validateDocumentIdUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    name2 = (java.lang.String) validateDocumentIdUseCase$invoke$1.getOutputMinFrameDuration;
                    raise2 = (arrow.core.raise.Raise) validateDocumentIdUseCase$invoke$1.getInputSizeshNQ4ISI;
                    defaultRaise = (arrow.core.raise.DefaultRaise) validateDocumentIdUseCase$invoke$1.getOutputFormats;
                    com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig documentIDValidationConfig3 = (com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig) validateDocumentIdUseCase$invoke$1.getInputFormats;
                    str2 = (java.lang.String) validateDocumentIdUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    documentIDValidationConfig2 = documentIDValidationConfig3;
                }
                java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation> map = ((com.paypal.oslo.core.i18n.domain.model.DocumentMetadata) raise.bind((arrow.core.Either) obj)).getDocumentType().get(name2);
                kotlin.jvm.internal.Intrinsics.checkNotNull(m11410getCountryCodeiSWX8ZM);
                raise2.bind(getHighResolutionOutputSizeshNQ4ISI(str2, documentIDValidationConfig2, map, m11410getCountryCodeiSWX8ZM));
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Document ID validation successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", m11410getCountryCodeiSWX8ZM), kotlin.TuplesKt.to("documentType", name2)), null, 4, null);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                defaultRaise.complete();
                left = new arrow.core.Either.Right(unit);
                if (!(left instanceof arrow.core.Either.Left)) {
                    java.lang.Object value = ((arrow.core.Either.Left) left).getValue();
                    if (value instanceof com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError) {
                        metadataNotFound = new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError(((com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError) value).getNetworkError());
                    } else if (value instanceof com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.ParsingFailure) {
                        metadataNotFound = new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound(((com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.ParsingFailure) value).getMessage());
                    } else {
                        metadataNotFound = value instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError ? (com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError) value : new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound("Failed to resolve locale: ".concat(java.lang.String.valueOf(value)));
                    }
                    return new arrow.core.Either.Left(metadataNotFound);
                }
                if (left instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) left).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        validateDocumentIdUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = validateDocumentIdUseCase$invoke$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validateDocumentIdUseCase$invoke$1.getOutputSizes;
        if (i != 0) {
        }
        java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation> map2 = ((com.paypal.oslo.core.i18n.domain.model.DocumentMetadata) raise.bind((arrow.core.Either) obj2)).getDocumentType().get(name2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m11410getCountryCodeiSWX8ZM);
        raise2.bind(getHighResolutionOutputSizeshNQ4ISI(str2, documentIDValidationConfig2, map2, m11410getCountryCodeiSWX8ZM));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Document ID validation successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", m11410getCountryCodeiSWX8ZM), kotlin.TuplesKt.to("documentType", name2)), null, 4, null);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        defaultRaise.complete();
        left = new arrow.core.Either.Right(unit2);
        if (!(left instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig p1, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation> p2, java.lang.String p3) {
        arrow.core.Either.Left left;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String name2;
        arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
        try {
            defaultRaise = defaultRaise2;
            name2 = p1.getDocumentType().name();
            try {
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise2.complete();
                left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                if (left.isLeft()) {
                }
                return left;
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise2.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        if (p2 != null) {
            com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType = p1.getDocumentSubType();
            java.lang.String name3 = documentSubType != null ? documentSubType.name() : null;
            if (name3 == null) {
                name3 = "";
            }
            com.paypal.oslo.core.i18n.domain.model.DocumentValidation documentValidation = p2.get(name3);
            if (documentValidation != null) {
                com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex = documentValidation.getValidationRegex();
                if (validationRegex != null) {
                    java.lang.String pattern = validationRegex.getPattern();
                    if (pattern != null) {
                        if (!this.getHighSpeedVideoSizes.validatePattern$i18n_release(p0, pattern, validationRegex.getFlag())) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Document ID does not match validation pattern for type: ");
                            sb.append(name2);
                            defaultRaise.raise(new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError(sb.toString()));
                            throw new kotlin.KotlinNothingValueException();
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(documentValidation.getAdvancedValidation(), java.lang.Boolean.TRUE)) {
                            java.lang.String upperCase = p3.toUpperCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            if (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.COUNTRY_BR) && !com.paypal.oslo.core.i18n.domain.util.DocumentChecksumAlgorithms.INSTANCE.validateCNPJ(p0)) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Document ID checksum validation failed for type: ");
                                sb2.append(name2);
                                defaultRaise.raise(new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError(sb2.toString()));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        defaultRaise2.complete();
                        left = new arrow.core.Either.Right(unit);
                        if (left.isLeft()) {
                            com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError documentIDValidationError = (com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError) ((arrow.core.Either.Left) left).getValue();
                            if ((documentIDValidationError instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError) || (documentIDValidationError instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError)) {
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Document ID validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", p3), kotlin.TuplesKt.to("documentType", p1.getDocumentType().name())), null, null, 12, null);
                            } else {
                                if (!(documentIDValidationError instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound) && !(documentIDValidationError instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Document ID validation metadata not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", p3), kotlin.TuplesKt.to("documentType", p1.getDocumentType().name())), null, 4, null);
                            }
                        }
                        return left;
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("No validation pattern found for type: ");
                    sb3.append(name2);
                    defaultRaise.raise(new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound(sb3.toString()));
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("No validation regex found for type: ");
                sb4.append(name2);
                defaultRaise.raise(new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound(sb4.toString()));
                throw new kotlin.KotlinNothingValueException();
            }
        }
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType2 = p1.getDocumentSubType();
        java.lang.String name4 = documentSubType2 != null ? documentSubType2.name() : null;
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("No validation rules found for type: ");
        sb5.append(name2);
        sb5.append(", subtype: ");
        sb5.append(name4);
        defaultRaise.raise(new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound(sb5.toString()));
        throw new kotlin.KotlinNothingValueException();
    }
}
