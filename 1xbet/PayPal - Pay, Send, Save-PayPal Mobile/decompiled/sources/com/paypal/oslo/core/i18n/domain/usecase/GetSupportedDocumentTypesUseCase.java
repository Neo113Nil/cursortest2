package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/GetSupportedDocumentTypesUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;", "documentRepository", "Lcom/paypal/oslo/core/i18n/domain/util/DocumentTypeUtil;", "documentTypeUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;Lcom/paypal/oslo/core/i18n/domain/util/DocumentTypeUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/DocumentMetadataError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentTypeInfo;", "invoke-n_l99Nk", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/util/DocumentTypeUtil;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetSupportedDocumentTypesUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.DocumentRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetSupportedDocumentTypesUseCase(com.paypal.oslo.core.i18n.domain.repository.DocumentRepository documentRepository, com.paypal.oslo.core.i18n.domain.util.DocumentTypeUtil documentTypeUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeUtil, "");
        this.Camera2StreamConfigurationMap = documentRepository;
        this.getHighSpeedVideoSizes = documentTypeUtil;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|(1:(4:9|10|11|12)(2:59|60))(4:61|62|63|(1:65)(1:66))|13|14|(5:17|(1:19)(1:26)|(3:21|22|23)(1:25)|24|15)|27|28|29|(4:31|(1:33)(2:37|(1:39)(2:40|41))|34|35)(2:42|(2:44|45)(2:46|47))))|70|6|(0)(0)|13|14|(1:15)|27|28|29|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3 A[Catch: all -> 0x0051, RaiseCancellationException -> 0x012a, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0048, B:14:0x00a2, B:15:0x00bd, B:17:0x00c3, B:19:0x00e3, B:22:0x00ec, B:28:0x00f0), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r2v20, types: [arrow.core.raise.Raise] */
    /* renamed from: invoke-n_l99Nk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m11564invoken_l99Nk(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError, ? extends java.util.List<com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo>>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase$invoke$1 getSupportedDocumentTypesUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.Either left;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase$invoke$1) {
            getSupportedDocumentTypesUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase$invoke$1) continuation;
            if ((getSupportedDocumentTypesUseCase$invoke$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getSupportedDocumentTypesUseCase$invoke$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getSupportedDocumentTypesUseCase$invoke$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getSupportedDocumentTypesUseCase$invoke$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise;
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "GetSupportedDocumentTypes UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", str2)), null, 4, null);
                        com.paypal.oslo.core.i18n.domain.repository.DocumentRepository documentRepository = this.Camera2StreamConfigurationMap;
                        getSupportedDocumentTypesUseCase$invoke$1.getHighSpeedVideoSizes = str2;
                        getSupportedDocumentTypesUseCase$invoke$1.getOutputFormats = defaultRaise;
                        getSupportedDocumentTypesUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise4);
                        getSupportedDocumentTypesUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise4;
                        getSupportedDocumentTypesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getSupportedDocumentTypesUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        getSupportedDocumentTypesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getSupportedDocumentTypesUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getSupportedDocumentTypesUseCase$invoke$1.getInputSizeshNQ4ISI = 1;
                        java.lang.Object documentMetadata = documentRepository.getDocumentMetadata(str2, getSupportedDocumentTypesUseCase$invoke$1);
                        if (documentMetadata == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        defaultRaise3 = defaultRaise4;
                        obj = documentMetadata;
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
                    int i2 = getSupportedDocumentTypesUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i3 = getSupportedDocumentTypesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = getSupportedDocumentTypesUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i5 = getSupportedDocumentTypesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    ?? r2 = (arrow.core.raise.Raise) getSupportedDocumentTypesUseCase$invoke$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) getSupportedDocumentTypesUseCase$invoke$1.getOutputFormats;
                    java.lang.String str3 = (java.lang.String) getSupportedDocumentTypesUseCase$invoke$1.getHighSpeedVideoSizes;
                    try {
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            defaultRaise3 = r2;
                            str2 = str3;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            defaultRaise = defaultRaise2;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        str2 = str3;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        left = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        if (left instanceof arrow.core.Either.Left) {
                        }
                    }
                }
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> documentType = ((com.paypal.oslo.core.i18n.domain.model.DocumentMetadata) defaultRaise3.bind((arrow.core.Either) obj)).getDocumentType();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> entry : documentType.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.util.List<com.paypal.oslo.core.i18n.domain.model.DocumentSubType> documentSubTypes = this.getHighSpeedVideoSizes.getDocumentSubTypes(key, entry.getValue());
                    com.paypal.oslo.core.i18n.domain.model.DocumentType documentType2 = this.getHighSpeedVideoSizes.getDocumentType(key);
                    com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo documentTypeInfo = documentType2 != null ? new com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo(documentType2, documentSubTypes) : null;
                    if (documentTypeInfo != null) {
                        arrayList.add(documentTypeInfo);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Successfully retrieved supported document types", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str2)), kotlin.TuplesKt.to("typeCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(arrayList2.size()))), null, 4, null);
                defaultRaise2.complete();
                left = new arrow.core.Either.Right(arrayList2);
                if (left instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError documentMetadataError = (com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError) ((arrow.core.Either.Left) left).getValue();
                    if (documentMetadataError instanceof com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError) {
                        com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError metadataFetchError = (com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError) documentMetadataError;
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to fetch document metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str2)), kotlin.TuplesKt.to("networkErrorType", metadataFetchError.getNetworkError().getClass().getSimpleName()), kotlin.TuplesKt.to("networkError", metadataFetchError.getNetworkError().toString())), null, 4, null);
                    } else {
                        if (!(documentMetadataError instanceof com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.ParsingFailure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to parse document metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str2))), null, 4, null);
                    }
                    return new arrow.core.Either.Left(documentMetadataError);
                }
                if (left instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) left).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getSupportedDocumentTypesUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getSupportedDocumentTypesUseCase$invoke$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getSupportedDocumentTypesUseCase$invoke$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> documentType3 = ((com.paypal.oslo.core.i18n.domain.model.DocumentMetadata) defaultRaise3.bind((arrow.core.Either) obj2)).getDocumentType();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        while (r0.hasNext()) {
        }
        java.util.ArrayList arrayList22 = arrayList3;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Successfully retrieved supported document types", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str2)), kotlin.TuplesKt.to("typeCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(arrayList22.size()))), null, 4, null);
        defaultRaise2.complete();
        left = new arrow.core.Either.Right(arrayList22);
        if (left instanceof arrow.core.Either.Left) {
        }
    }
}
