package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/repository/NameRepositoryImpl;", "Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "networkRepository", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lkotlinx/serialization/json/Json;)V", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Ljava/util/Locale;", "locale", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/NameMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/name/NameMetadata;", "getNameMetadata", "(Ljava/lang/String;Ljava/util/Locale;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonObject;", "p0", "p1", "p2", "p3", "Lcom/paypal/oslo/core/i18n/domain/model/name/NameLabelMetadata;", "getHighSpeedVideoFpsRanges", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/name/NameLabelMetadata;", "Lkotlinx/serialization/json/JsonElement;", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/data/repository/NetworkRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NameRepositoryImpl implements com.paypal.oslo.core.i18n.domain.repository.NameRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.data.repository.NetworkRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoSizes;

    @javax.inject.Inject
    public NameRepositoryImpl(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoFpsRanges = networkRepository;
        this.getHighSpeedVideoSizes = localeResolverCache;
        this.getHighResolutionOutputSizeshNQ4ISI = json;
    }

    private final com.paypal.oslo.core.i18n.domain.model.name.NameLabelMetadata getHighSpeedVideoFpsRanges(kotlinx.serialization.json.JsonObject p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, p1);
        kotlinx.serialization.json.Json json = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.name.NameLabelMetadata> serializer = com.paypal.oslo.core.i18n.domain.model.name.NameLabelMetadata.INSTANCE.serializer();
        kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) kotlinx.serialization.json.JsonElementKt.getJsonObject(highSpeedVideoFpsRangesFor).get((java.lang.Object) "peopleNames");
        if (jsonElement2 != null && (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement2)) != null && (jsonElement = jsonObject.get((java.lang.Object) p2)) != null) {
            com.paypal.oslo.core.i18n.domain.model.name.NameLabelMetadata nameLabelMetadata = (com.paypal.oslo.core.i18n.domain.model.name.NameLabelMetadata) json.decodeFromJsonElement(serializer, jsonElement);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Label Metadata parsed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("entryKey", p2)), null, 4, null);
            return nameLabelMetadata;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing ");
        sb.append(p3);
        sb.append(" entry in 'peopleNames' field in label metadata");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    private static kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRangesFor(kotlinx.serialization.json.JsonObject p0, java.lang.String p1) {
        kotlinx.serialization.json.JsonObject jsonObject;
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) p0.get("main");
        if (jsonElement == null || (jsonObject = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement)) == null) {
            throw new java.lang.IllegalStateException("Missing 'main' field in locale metadata".toString());
        }
        kotlinx.serialization.json.JsonObject jsonObject2 = jsonObject;
        kotlinx.serialization.json.JsonElement jsonElement2 = jsonObject2.get((java.lang.Object) p1);
        if (jsonElement2 != null) {
            return jsonElement2;
        }
        kotlinx.serialization.json.JsonElement jsonElement3 = jsonObject2.get((java.lang.Object) (p1 != null ? kotlin.text.StringsKt.substringBefore$default(p1, "-", (java.lang.String) null, 2, (java.lang.Object) null) : null));
        if (jsonElement3 != null) {
            return jsonElement3;
        }
        throw new java.lang.IllegalStateException("Missing locale data".toString());
    }

    public static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.name.NameMetadata access$processMetadata(com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl nameRepositoryImpl, kotlinx.serialization.json.JsonObject jsonObject, kotlinx.serialization.json.JsonObject jsonObject2, java.util.Locale locale, java.lang.String str) {
        java.lang.String str2;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonObject jsonObject4;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonObject jsonObject5;
        kotlinx.serialization.json.JsonElement jsonElement2;
        kotlinx.serialization.json.JsonObject jsonObject6;
        kotlinx.serialization.json.JsonElement jsonElement3;
        java.lang.String languageTag;
        java.util.Locale orNull = nameRepositoryImpl.getHighSpeedVideoSizes.getUserLocale().getOrNull();
        java.lang.String str3 = null;
        if (str == null) {
            str2 = locale != null ? locale.getCountry() : null;
            if (str2 == null) {
                str2 = orNull != null ? orNull.getCountry() : null;
            }
        } else {
            str2 = str;
        }
        if (locale != null && (languageTag = locale.toLanguageTag()) != null) {
            str3 = languageTag;
        } else if (orNull != null) {
            str3 = orNull.toLanguageTag();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Processing metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str2), kotlin.TuplesKt.to("locale", str3)), null, 4, null);
        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("supplemental");
        if (jsonElement4 == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4)) == null) {
            throw new java.lang.IllegalStateException("Missing 'supplemental' field in country metadata".toString());
        }
        kotlinx.serialization.json.Json json = nameRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata> serializer = com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata.INSTANCE.serializer();
        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "personNameData");
        if (jsonElement5 != null && (jsonObject4 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5)) != null && (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject4.get((java.lang.Object) "DEFAULT")) != null) {
            com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata personNameMetadata = (com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata) json.decodeFromJsonElement(serializer, jsonElement);
            kotlinx.serialization.json.Json json2 = nameRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata> serializer2 = com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata.INSTANCE.serializer();
            kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "personNameData");
            if (jsonElement6 != null && (jsonObject5 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement6)) != null && (jsonElement2 = jsonObject5.get((java.lang.Object) str2)) != null) {
                com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata personNameMetadata2 = (com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata) json2.decodeFromJsonElement(serializer2, jsonElement2);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Person Name Metadata parsed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, str2)), null, 4, null);
                kotlinx.serialization.json.Json json3 = nameRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.name.BusinessNameMetadata> serializer3 = com.paypal.oslo.core.i18n.domain.model.name.BusinessNameMetadata.INSTANCE.serializer();
                kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "businessNameData");
                if (jsonElement7 != null && (jsonObject6 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement7)) != null && (jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject6.get((java.lang.Object) com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT)) != null) {
                    return new com.paypal.oslo.core.i18n.domain.model.name.NameMetadata(personNameMetadata, personNameMetadata2, (com.paypal.oslo.core.i18n.domain.model.name.BusinessNameMetadata) json3.decodeFromJsonElement(serializer3, jsonElement3), nameRepositoryImpl.getHighSpeedVideoFpsRanges(jsonObject2, str3, com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX, "default '00'"), nameRepositoryImpl.getHighSpeedVideoFpsRanges(jsonObject2, str3, str2, "country-specific"));
                }
                throw new java.lang.IllegalStateException("Missing default business name data".toString());
            }
            throw new java.lang.IllegalStateException("Missing country data".toString());
        }
        throw new java.lang.IllegalStateException("Missing default person name data".toString());
    }

    @Override // com.paypal.oslo.core.i18n.domain.repository.NameRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.NameMetadataError, com.paypal.oslo.core.i18n.domain.model.name.NameMetadata>> getNameMetadata(java.lang.String country, java.util.Locale locale) {
        return kotlinx.coroutines.flow.FlowKt.combine(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getCountryMetadata$1(country, this, null)), kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getLabelMetadata$1(locale, this, null)), new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl$getNameMetadata$1(this, locale, country, null));
    }
}
