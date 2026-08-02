package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/DocumentRepositoryImpl;", "Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "networkRepository", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;Lkotlinx/serialization/json/Json;)V", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/DocumentMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentMetadata;", "getDocumentMetadata", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lkotlinx/serialization/json/JsonObject;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentRepositoryImpl implements com.paypal.oslo.core.i18n.domain.repository.DocumentRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.data.repository.NetworkRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DocumentRepositoryImpl(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighResolutionOutputSizeshNQ4ISI = networkRepository;
        this.Camera2StreamConfigurationMap = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.core.i18n.domain.repository.DocumentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDocumentMetadata(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError, com.paypal.oslo.core.i18n.domain.model.DocumentMetadata>> continuation) {
        com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getDocumentMetadata$1 documentRepositoryImpl$getDocumentMetadata$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either left;
        com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.ParsingFailure parsingFailure;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonObject jsonObject3;
        if (continuation instanceof com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getDocumentMetadata$1) {
            documentRepositoryImpl$getDocumentMetadata$1 = (com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getDocumentMetadata$1) continuation;
            if ((documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoFpsRanges = str;
                    documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoSizes = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(str, documentRepositoryImpl$getDocumentMetadata$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    kotlinx.serialization.json.JsonObject jsonObject4 = (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either).getValue();
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    try {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Processing document metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str)), null, 4, null);
                        jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject4.get((java.lang.Object) "supplemental");
                    } catch (java.lang.Throwable th) {
                        left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
                    }
                    if (jsonElement == null || (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null) {
                        throw new java.lang.IllegalStateException("Missing 'supplemental' field in document metadata".toString());
                    }
                    kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "documentIdentifier");
                    if (jsonElement2 == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) == null) {
                        throw new java.lang.IllegalStateException("Missing 'documentIdentifier' field in supplemental metadata".toString());
                    }
                    java.util.Locale locale = java.util.Locale.ROOT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = str.toUpperCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) upperCase);
                    if (jsonElement3 == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement3)) == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing country data for '");
                        sb.append(upperCase);
                        sb.append("' in documentIdentifier");
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    java.util.Map map = (java.util.Map) this.Camera2StreamConfigurationMap.decodeFromJsonElement(kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.StringCompanionObject.INSTANCE), com.paypal.oslo.core.i18n.domain.model.DocumentValidation.INSTANCE.serializer())), jsonObject3);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "DocumentMetadata deserialized successfully", null, null, 6, null);
                    left = new arrow.core.Either.Right(new com.paypal.oslo.core.i18n.domain.model.DocumentMetadata(map));
                    arrow.core.Either either2 = left;
                    if (either2 instanceof arrow.core.Either.Left) {
                        java.lang.Throwable th2 = (java.lang.Throwable) ((arrow.core.Either.Left) either2).getValue();
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to process document metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str)), null, th2, 4, null);
                        if (th2 instanceof kotlinx.serialization.SerializationException) {
                            java.lang.String message = th2.getMessage();
                            if (message == null) {
                                message = "Unknown serialization error";
                            }
                            parsingFailure = new com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.ParsingFailure(message, th2);
                        } else if (th2 instanceof java.lang.IllegalStateException) {
                            java.lang.String message2 = th2.getMessage();
                            if (message2 == null) {
                                message2 = "Invalid document metadata structure";
                            }
                            parsingFailure = new com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.ParsingFailure(message2, th2);
                        } else {
                            java.lang.String message3 = th2.getMessage();
                            if (message3 == null) {
                                message3 = "Unexpected error during metadata processing";
                            }
                            parsingFailure = new com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.ParsingFailure(message3, th2);
                        }
                        return new arrow.core.Either.Left(parsingFailure);
                    }
                    if (either2 instanceof arrow.core.Either.Right) {
                        return new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        documentRepositoryImpl$getDocumentMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getDocumentMetadata$1(this, continuation);
        java.lang.Object obj2 = documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = documentRepositoryImpl$getDocumentMetadata$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError, kotlinx.serialization.json.JsonObject>> continuation) {
        com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getCountryMetadata$1 documentRepositoryImpl$getCountryMetadata$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either left;
        if (continuation instanceof com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getCountryMetadata$1) {
            documentRepositoryImpl$getCountryMetadata$1 = (com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getCountryMetadata$1) continuation;
            if ((documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Locale locale = java.util.Locale.ROOT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase = str.toUpperCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Resolved country code for country metadata fetch", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", upperCase)), null, 4, null);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/wr-i18n-metadata/4/supplemental/documentIdentifier/regions/");
                    sb.append(upperCase);
                    sb.append(".json");
                    java.lang.String obj2 = sb.toString();
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, kotlinx.serialization.json.JsonObject>> fetchData = this.getHighResolutionOutputSizeshNQ4ISI.fetchData(obj2);
                    documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    documentRepositoryImpl$getCountryMetadata$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(upperCase);
                    documentRepositoryImpl$getCountryMetadata$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                    documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoSizes = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(fetchData, documentRepositoryImpl$getCountryMetadata$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either != null) {
                    if (either instanceof arrow.core.Either.Right) {
                        left = arrow.core.EitherKt.right((kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either).getValue());
                    } else if (either instanceof arrow.core.Either.Left) {
                        left = arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue()));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (left != null) {
                        return left;
                    }
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No data emitted from network repository"))));
            }
        }
        documentRepositoryImpl$getCountryMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getCountryMetadata$1(this, continuation);
        java.lang.Object obj3 = documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = documentRepositoryImpl$getCountryMetadata$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (either != null) {
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError.MetadataFetchError(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No data emitted from network repository"))));
    }
}
