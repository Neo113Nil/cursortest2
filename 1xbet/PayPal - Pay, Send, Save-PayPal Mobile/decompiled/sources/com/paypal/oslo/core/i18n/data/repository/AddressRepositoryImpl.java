package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/AddressRepositoryImpl;", "Lcom/paypal/oslo/core/i18n/domain/repository/AddressRepository;", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "networkRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lkotlinx/serialization/json/Json;)V", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Ljava/util/Locale;", "locale", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/AddressMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;", "getAddressMetadata", "(Ljava/lang/String;Ljava/util/Locale;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddressRepositoryImpl implements com.paypal.oslo.core.i18n.domain.repository.AddressRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.i18n.data.repository.NetworkRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AddressRepositoryImpl(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoFpsRanges = networkRepository;
        this.getHighSpeedVideoFpsRangesFor = localeResolverCache;
        this.getHighSpeedVideoSizes = json;
    }

    @Override // com.paypal.oslo.core.i18n.domain.repository.AddressRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, com.paypal.oslo.core.i18n.domain.model.AddressMetadata>> getAddressMetadata(java.lang.String country, java.util.Locale locale) {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1(this, country, locale, null));
    }

    public static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressMetadata access$processMetadata(com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl addressRepositoryImpl, kotlinx.serialization.json.JsonObject jsonObject, kotlinx.serialization.json.JsonObject jsonObject2, java.util.Locale locale, java.lang.String str) {
        java.lang.String str2;
        java.lang.String languageTag;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonObject jsonObject4;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonObject jsonObject5;
        kotlinx.serialization.json.JsonObject jsonObject6;
        com.paypal.oslo.core.i18n.domain.model.CountryValidationMetadata countryValidationMetadata;
        kotlinx.serialization.json.JsonObject jsonObject7;
        java.util.Locale orNull = addressRepositoryImpl.getHighSpeedVideoFpsRangesFor.getUserLocale().getOrNull();
        if (str == null) {
            str2 = locale != null ? locale.getCountry() : null;
            if (str2 == null) {
                str2 = orNull != null ? orNull.getCountry() : null;
            }
        } else {
            str2 = str;
        }
        if (locale == null || (languageTag = locale.toLanguageTag()) == null) {
            languageTag = orNull != null ? orNull.toLanguageTag() : null;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Processing metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str2), kotlin.TuplesKt.to("locale", languageTag)), null, 4, null);
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get("supplemental");
        if (jsonElement2 == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) == null) {
            throw new java.lang.IllegalStateException("Missing 'supplemental' field in country metadata".toString());
        }
        kotlinx.serialization.json.Json json = addressRepositoryImpl.getHighSpeedVideoSizes;
        kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.CountryMetadata> serializer = com.paypal.oslo.core.i18n.domain.model.CountryMetadata.INSTANCE.serializer();
        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "addresses");
        if (jsonElement3 != null && (jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement3)) != null && (jsonElement = jsonObject4.get((java.lang.Object) str2)) != null) {
            com.paypal.oslo.core.i18n.domain.model.CountryMetadata countryMetadata = (com.paypal.oslo.core.i18n.domain.model.CountryMetadata) json.decodeFromJsonElement(serializer, jsonElement);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Country Metadata parsed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str2)), null, 4, null);
            kotlinx.serialization.json.Json json2 = addressRepositoryImpl.getHighSpeedVideoSizes;
            kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.ValidationConfig> serializer2 = com.paypal.oslo.core.i18n.domain.model.ValidationConfig.INSTANCE.serializer();
            kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "addressValidationsConfig");
            if (jsonElement4 != null && (jsonObject5 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4)) != null) {
                com.paypal.oslo.core.i18n.domain.model.ValidationConfig validationConfig = (com.paypal.oslo.core.i18n.domain.model.ValidationConfig) json2.decodeFromJsonElement(serializer2, jsonObject5);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Validation Config parsed successfully", null, null, 6, null);
                kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "addressValidations");
                if (jsonElement5 == null || (jsonObject6 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5)) == null) {
                    throw new java.lang.IllegalStateException("Missing 'addressValidations' field".toString());
                }
                com.paypal.oslo.core.i18n.domain.model.DefaultValidationMetadata defaultValidationMetadata = (com.paypal.oslo.core.i18n.domain.model.DefaultValidationMetadata) addressRepositoryImpl.getHighSpeedVideoSizes.decodeFromJsonElement(com.paypal.oslo.core.i18n.domain.model.DefaultValidationMetadata.INSTANCE.serializer(), jsonObject6);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "DefaultValidation Metadata parsed successfully", null, null, 6, null);
                kotlinx.serialization.json.JsonElement jsonElement6 = jsonObject6.get((java.lang.Object) str2);
                if (jsonElement6 != null) {
                    kotlinx.serialization.json.JsonObject jsonObject8 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement6);
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(jsonObject8.size()));
                    java.util.Iterator<T> it = jsonObject8.entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        linkedHashMap.put(entry.getKey(), (com.paypal.oslo.core.i18n.domain.model.CountryValidation) addressRepositoryImpl.getHighSpeedVideoSizes.decodeFromJsonElement(com.paypal.oslo.core.i18n.domain.model.CountryValidation.INSTANCE.serializer(), (kotlinx.serialization.json.JsonElement) entry.getValue()));
                    }
                    countryValidationMetadata = new com.paypal.oslo.core.i18n.domain.model.CountryValidationMetadata(linkedHashMap);
                } else {
                    countryValidationMetadata = null;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "CountryValidation Metadata parsed successfully", null, null, 6, null);
                kotlin.Pair pair = kotlin.TuplesKt.to(defaultValidationMetadata, countryValidationMetadata);
                com.paypal.oslo.core.i18n.domain.model.DefaultValidationMetadata defaultValidationMetadata2 = (com.paypal.oslo.core.i18n.domain.model.DefaultValidationMetadata) pair.component1();
                com.paypal.oslo.core.i18n.domain.model.CountryValidationMetadata countryValidationMetadata2 = (com.paypal.oslo.core.i18n.domain.model.CountryValidationMetadata) pair.component2();
                kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject2.get("main");
                if (jsonElement7 == null || (jsonObject7 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement7)) == null) {
                    throw new java.lang.IllegalStateException("Missing 'main' field in locale metadata".toString());
                }
                kotlinx.serialization.json.JsonObject jsonObject9 = jsonObject7;
                kotlinx.serialization.json.JsonElement jsonElement8 = jsonObject9.get((java.lang.Object) languageTag);
                if (jsonElement8 == null) {
                    jsonElement8 = jsonObject9.get((java.lang.Object) (languageTag != null ? kotlin.text.StringsKt.substringBefore$default(languageTag, "-", (java.lang.String) null, 2, (java.lang.Object) null) : null));
                    if (jsonElement8 == null) {
                        throw new java.lang.IllegalStateException("Missing locale data".toString());
                    }
                }
                kotlinx.serialization.json.Json json3 = addressRepositoryImpl.getHighSpeedVideoSizes;
                kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.AddressLabelMetadata> serializer3 = com.paypal.oslo.core.i18n.domain.model.AddressLabelMetadata.INSTANCE.serializer();
                kotlinx.serialization.json.JsonElement jsonElement9 = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement8).get((java.lang.Object) "addresses");
                if (jsonElement9 != null) {
                    com.paypal.oslo.core.i18n.domain.model.AddressLabelMetadata addressLabelMetadata = (com.paypal.oslo.core.i18n.domain.model.AddressLabelMetadata) json3.decodeFromJsonElement(serializer3, jsonElement9);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Label Metadata parsed successfully", null, null, 6, null);
                    return new com.paypal.oslo.core.i18n.domain.model.AddressMetadata(countryMetadata, validationConfig, defaultValidationMetadata2, countryValidationMetadata2, addressLabelMetadata);
                }
                throw new java.lang.IllegalStateException("Missing 'addresses' field in label metadata".toString());
            }
            throw new java.lang.IllegalStateException("Missing 'addressValidationsConfig' field".toString());
        }
        throw new java.lang.IllegalStateException("Missing country data".toString());
    }
}
