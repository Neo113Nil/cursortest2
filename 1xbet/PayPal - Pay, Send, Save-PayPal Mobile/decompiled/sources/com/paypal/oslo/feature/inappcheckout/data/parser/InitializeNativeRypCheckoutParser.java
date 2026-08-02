package com.paypal.oslo.feature.inappcheckout.data.parser;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001c\u0010 J!\u0010\u0018\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020!H\u0002¢\u0006\u0004\b\u0018\u0010#R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;", "", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/BuyerInfoEntityMapper;", "buyerInfoMapper", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;", "fundingSelectionMapper", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/InitializeCheckoutEntityMapper;", "initializeCheckoutMapper", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lkotlinx/serialization/json/Json;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/BuyerInfoEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/InitializeCheckoutEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "", "rawJson", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;", "parse", "(Ljava/lang/String;)Larrow/core/Either;", "Larrow/core/raise/Raise;", "p0", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeNativeRypCheckoutResponseDTO;", "getHighSpeedVideoFpsRanges", "(Larrow/core/raise/Raise;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeNativeRypCheckoutResponseDTO;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/BuyerInfoDTO;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Camera2StreamConfigurationMap", "(Larrow/core/raise/Raise;Lcom/paypal/oslo/feature/inappcheckout/data/dto/BuyerInfoDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "(Larrow/core/raise/Raise;Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "(Larrow/core/raise/Raise;Lcom/paypal/oslo/feature/inappcheckout/data/dto/InitializeCheckoutDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeCheckoutEntity;", "Lkotlinx/serialization/json/Json;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/BuyerInfoEntityMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/InitializeCheckoutEntityMapper;", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InitializeNativeRypCheckoutParser {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public InitializeNativeRypCheckoutParser(kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper buyerInfoEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper initializeCheckoutEntityMapper, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buyerInfoEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeCheckoutEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = json;
        this.getHighSpeedVideoSizes = buyerInfoEntityMapper;
        this.getHighSpeedVideoFpsRangesFor = fundingSelectionEntityMapper;
        this.Camera2StreamConfigurationMap = initializeCheckoutEntityMapper;
        this.getHighSpeedVideoFpsRanges = checkoutLogger;
    }

    private final com.paypal.oslo.feature.inappcheckout.data.dto.InitializeNativeRypCheckoutResponseDTO getHighSpeedVideoFpsRanges(arrow.core.raise.Raise<? super com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity> raise, java.lang.String str) {
        try {
            kotlinx.serialization.json.Json json = this.getHighResolutionOutputSizeshNQ4ISI;
            json.getSerializersModule();
            return (com.paypal.oslo.feature.inappcheckout.data.dto.InitializeNativeRypCheckoutResponseDTO) json.decodeFromString(com.paypal.oslo.feature.inappcheckout.data.dto.InitializeNativeRypCheckoutResponseDTO.INSTANCE.serializer(), str);
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRanges, "Failed to parse InitializeNativeRypCheckout response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.toString())), null, 4, null);
            raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("JSON_PARSING_ERROR", "Failed to parse response: ".concat(java.lang.String.valueOf(e.getMessage())), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity Camera2StreamConfigurationMap(arrow.core.raise.Raise<? super com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity> raise, com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO buyerInfoDTO) {
        try {
            return this.getHighSpeedVideoSizes.convert(buyerInfoDTO);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRanges, "Failed to convert BuyerInfo DTO to Entity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.toString())), null, 4, null);
            raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("BUYER_INFO_CONVERSION_ERROR", "Failed to convert buyerInfo: ".concat(java.lang.String.valueOf(e.getMessage())), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity Camera2StreamConfigurationMap(arrow.core.raise.Raise<? super com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity> raise, com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO fundingSelectionDTO) {
        try {
            return this.getHighSpeedVideoFpsRangesFor.convert(fundingSelectionDTO);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRanges, "Failed to convert FundingSelection DTO to Entity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.toString())), null, 4, null);
            raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("FUNDING_SELECTION_CONVERSION_ERROR", "Failed to convert fundingSelection: ".concat(java.lang.String.valueOf(e.getMessage())), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity getHighSpeedVideoFpsRanges(arrow.core.raise.Raise<? super com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity> raise, com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO initializeCheckoutDTO) {
        try {
            return this.Camera2StreamConfigurationMap.convert(initializeCheckoutDTO);
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRanges, "Failed to convert InitializeCheckout DTO to Entity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.toString())), null, 4, null);
            raise.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INITIALIZE_CHECKOUT_CONVERSION_ERROR", "Failed to convert initializeCheckout: ".concat(java.lang.String.valueOf(e.getMessage())), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[Catch: all -> 0x01a1, RaiseCancellationException -> 0x01aa, TryCatch #2 {RaiseCancellationException -> 0x01aa, all -> 0x01a1, blocks: (B:3:0x000b, B:6:0x001b, B:8:0x002b, B:12:0x0061, B:14:0x006d, B:16:0x0079, B:18:0x007f, B:22:0x008a, B:24:0x0090, B:26:0x0098, B:28:0x00a0, B:29:0x00d2, B:33:0x00d3, B:35:0x00d9, B:37:0x00df, B:39:0x00e5, B:41:0x0123, B:42:0x013b, B:43:0x013c, B:44:0x0154, B:45:0x0155, B:46:0x016d, B:47:0x016e, B:48:0x01a0, B:49:0x0033, B:51:0x0039, B:52:0x003f, B:54:0x0047, B:56:0x0057), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e A[Catch: all -> 0x01a1, RaiseCancellationException -> 0x01aa, TryCatch #2 {RaiseCancellationException -> 0x01aa, all -> 0x01a1, blocks: (B:3:0x000b, B:6:0x001b, B:8:0x002b, B:12:0x0061, B:14:0x006d, B:16:0x0079, B:18:0x007f, B:22:0x008a, B:24:0x0090, B:26:0x0098, B:28:0x00a0, B:29:0x00d2, B:33:0x00d3, B:35:0x00d9, B:37:0x00df, B:39:0x00e5, B:41:0x0123, B:42:0x013b, B:43:0x013c, B:44:0x0154, B:45:0x0155, B:46:0x016d, B:47:0x016e, B:48:0x01a0, B:49:0x0033, B:51:0x0039, B:52:0x003f, B:54:0x0047, B:56:0x0057), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity> parse(java.lang.String rawJson) {
        java.lang.String name2;
        java.lang.String str;
        java.lang.String str2;
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO> details;
        com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO errorDetailDTO;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawJson, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.inappcheckout.data.dto.InitializeNativeRypCheckoutResponseDTO highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(defaultRaise2, rawJson);
            com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionErrorDTO fundingSelectionError = highSpeedVideoFpsRanges.getFundingSelectionError();
            java.lang.String str3 = com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_FUNDING_SELECTION_ERROR;
            if (fundingSelectionError != null) {
                com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionErrorItemDTO fundingSelectionErrorItemDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionErrorItemDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) highSpeedVideoFpsRanges.getFundingSelectionError().getErrors());
                if (fundingSelectionErrorItemDTO != null) {
                    name2 = fundingSelectionErrorItemDTO.getName();
                }
                if (str3 == null) {
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRanges, "API returned fundingSelectionError", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", str3)), null, 4, null);
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str3, com.paypal.oslo.feature.inappcheckout.Constants.ERROR_FUNDING_SELECTION_DESCRIPTION_PREFIX.concat(java.lang.String.valueOf(str3)), false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                if (!highSpeedVideoFpsRanges.getErrors().isEmpty()) {
                    com.paypal.oslo.feature.inappcheckout.data.dto.InitializeNativeRypErrorDTO initializeNativeRypErrorDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.InitializeNativeRypErrorDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) highSpeedVideoFpsRanges.getErrors());
                    com.paypal.oslo.feature.inappcheckout.data.dto.ErrorExtensionsDTO extensions = initializeNativeRypErrorDTO != null ? initializeNativeRypErrorDTO.getExtensions() : null;
                    if (extensions == null || (str = extensions.getName()) == null) {
                        str = com.paypal.oslo.feature.inappcheckout.Constants.UNKNOWN_API_ERROR;
                    }
                    java.lang.String str4 = str;
                    if (extensions == null || (details = extensions.getDetails()) == null || (errorDetailDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.ErrorDetailDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) details)) == null || (str2 = errorDetailDTO.getDescription()) == null) {
                        str2 = "No error details provided";
                    }
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRanges, "API returned initializeNativeRypCheckout error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, str2)), null, 4, null);
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str4, "API returned errors: ".concat(java.lang.String.valueOf(str2)), false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO buyerInfo = highSpeedVideoFpsRanges.getBuyerInfo();
                if (buyerInfo == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_BUYER_INFO", "buyerInfo section is missing from response", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO fundingSelection = highSpeedVideoFpsRanges.getFundingSelection();
                if (fundingSelection == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_FUNDING_SELECTION", "fundingSelection section is missing from response", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO initializeCheckout = highSpeedVideoFpsRanges.getInitializeCheckout();
                if (initializeCheckout != null) {
                    kotlin.Triple triple = new kotlin.Triple(buyerInfo, fundingSelection, initializeCheckout);
                    com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity(Camera2StreamConfigurationMap(defaultRaise2, (com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO) triple.component1()), Camera2StreamConfigurationMap(defaultRaise2, (com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO) triple.component2()), getHighSpeedVideoFpsRanges(defaultRaise2, (com.paypal.oslo.feature.inappcheckout.data.dto.InitializeCheckoutDTO) triple.component3()));
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRanges, "Successfully parsed InitializeNativeRypCheckout response", null, null, 6, null);
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(initializeNativeRypCheckoutResponseEntity);
                }
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_INITIALIZE_CHECKOUT", "initializeCheckout section is missing from response", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO fundingSelection2 = highSpeedVideoFpsRanges.getFundingSelection();
            if (kotlin.jvm.internal.Intrinsics.areEqual(fundingSelection2 != null ? fundingSelection2.getTypename() : null, "FundingSelectionErrorResponse")) {
                com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionErrorItemDTO fundingSelectionErrorItemDTO2 = (com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionErrorItemDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) highSpeedVideoFpsRanges.getFundingSelection().getErrors());
                if (fundingSelectionErrorItemDTO2 != null && (name2 = fundingSelectionErrorItemDTO2.getName()) != null) {
                    str3 = name2;
                }
            } else {
                str3 = null;
            }
            if (str3 == null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
