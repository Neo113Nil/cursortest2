package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/PhoneRepositoryImpl;", "Lcom/paypal/oslo/core/i18n/domain/repository/PhoneRepository;", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "networkRepository", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;Lkotlinx/serialization/json/Json;)V", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "regionCode", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/PhoneMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberMetaData;", "getPhoneMetadata-n_l99Nk", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhoneMetadata", "", "p0", "Lkotlinx/serialization/json/JsonObject;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PhoneRepositoryImpl implements com.paypal.oslo.core.i18n.domain.repository.PhoneRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.data.repository.NetworkRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PhoneRepositoryImpl(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoFpsRangesFor = networkRepository;
        this.Camera2StreamConfigurationMap = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.i18n.domain.repository.PhoneRepository
    /* renamed from: getPhoneMetadata-n_l99Nk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo11235getPhoneMetadatan_l99Nk(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError, com.paypal.oslo.core.i18n.domain.model.PhoneNumberMetaData>> continuation) {
        com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getPhoneMetadata$1 phoneRepositoryImpl$getPhoneMetadata$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either left;
        com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError.ParsingFailure parsingFailure;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonObject jsonObject2;
        if (continuation instanceof com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getPhoneMetadata$1) {
            phoneRepositoryImpl$getPhoneMetadata$1 = (com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getPhoneMetadata$1) continuation;
            if ((phoneRepositoryImpl$getPhoneMetadata$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                phoneRepositoryImpl$getPhoneMetadata$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = phoneRepositoryImpl$getPhoneMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneRepositoryImpl$getPhoneMetadata$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    phoneRepositoryImpl$getPhoneMetadata$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    phoneRepositoryImpl$getPhoneMetadata$1.getHighSpeedVideoSizes = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(str, phoneRepositoryImpl$getPhoneMetadata$1);
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
                if (!(either instanceof arrow.core.Either.Right)) {
                    kotlinx.serialization.json.JsonObject jsonObject3 = (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either).getValue();
                    arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
                    try {
                        jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "supplemental");
                    } catch (java.lang.Throwable th) {
                        left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
                    }
                    if (jsonElement == null || (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null) {
                        throw new java.lang.IllegalStateException("Missing 'supplemental' field in phone metadata".toString());
                    }
                    kotlinx.serialization.json.Json json = this.Camera2StreamConfigurationMap;
                    kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.PhoneNumberMetaData> serializer = com.paypal.oslo.core.i18n.domain.model.PhoneNumberMetaData.INSTANCE.serializer();
                    kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "phoneData");
                    if (jsonElement2 != null && (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) != null) {
                        left = new arrow.core.Either.Right((com.paypal.oslo.core.i18n.domain.model.PhoneNumberMetaData) json.decodeFromJsonElement(serializer, jsonObject2));
                        arrow.core.Either either2 = left;
                        if (either2 instanceof arrow.core.Either.Left) {
                            java.lang.Throwable th2 = (java.lang.Throwable) ((arrow.core.Either.Left) either2).getValue();
                            if (th2 instanceof kotlinx.serialization.SerializationException) {
                                java.lang.String message = th2.getMessage();
                                if (message == null) {
                                    message = "Failed to deserialize phone metadata";
                                }
                                parsingFailure = new com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError.ParsingFailure(message);
                            } else if (th2 instanceof java.lang.IllegalStateException) {
                                java.lang.String message2 = th2.getMessage();
                                if (message2 == null) {
                                    message2 = "Invalid phone metadata structure";
                                }
                                parsingFailure = new com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError.ParsingFailure(message2);
                            } else {
                                java.lang.String message3 = th2.getMessage();
                                if (message3 == null) {
                                    message3 = "Unknown error during metadata processing";
                                }
                                parsingFailure = new com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError.ParsingFailure(message3);
                            }
                            return new arrow.core.Either.Left(parsingFailure);
                        }
                        if (either2 instanceof arrow.core.Either.Right) {
                            return new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    throw new java.lang.IllegalStateException("Missing 'phoneData' field in supplemental metadata".toString());
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        phoneRepositoryImpl$getPhoneMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getPhoneMetadata$1(this, continuation);
        java.lang.Object obj2 = phoneRepositoryImpl$getPhoneMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$getPhoneMetadata$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError, kotlinx.serialization.json.JsonObject>> continuation) {
        com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getMetadata$1 phoneRepositoryImpl$getMetadata$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either left;
        if (continuation instanceof com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getMetadata$1) {
            phoneRepositoryImpl$getMetadata$1 = (com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getMetadata$1) continuation;
            if ((phoneRepositoryImpl$getMetadata$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                phoneRepositoryImpl$getMetadata$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = phoneRepositoryImpl$getMetadata$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = phoneRepositoryImpl$getMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Fetching PhoneNumber metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", str)), null, 4, null);
                    java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.paypalobjects.com/wr-i18n-metadata/1/supplemental/phone/regions/");
                    sb.append(upperCase);
                    sb.append(".json");
                    java.lang.String obj2 = sb.toString();
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, kotlinx.serialization.json.JsonObject>> fetchData = this.getHighSpeedVideoFpsRangesFor.fetchData(obj2);
                    phoneRepositoryImpl$getMetadata$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    phoneRepositoryImpl$getMetadata$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                    phoneRepositoryImpl$getMetadata$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(fetchData, phoneRepositoryImpl$getMetadata$1);
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
                        left = arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError.MetadataFetchError((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue()));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (left != null) {
                        return left;
                    }
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError.MetadataFetchError(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No data emitted from network repository"))));
            }
        }
        phoneRepositoryImpl$getMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getMetadata$1(this, continuation);
        java.lang.Object obj3 = phoneRepositoryImpl$getMetadata$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = phoneRepositoryImpl$getMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (either != null) {
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError.MetadataFetchError(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No data emitted from network repository"))));
    }
}
