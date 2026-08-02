package com.paypal.oslo.feature.inappcheckout.data.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/NativeRypDataConverterImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/converter/NativeRypDataConverter;", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;", "parser", "<init>", "(Lkotlinx/serialization/json/Json;Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;)V", "", "nativeRypData", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "convert", "(Ljava/lang/String;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NativeRypDataConverterImpl implements com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public NativeRypDataConverterImpl(kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser initializeNativeRypCheckoutParser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeNativeRypCheckoutParser, "");
        this.Camera2StreamConfigurationMap = json;
        this.getHighSpeedVideoSizes = initializeNativeRypCheckoutParser;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.converter.NativeRypDataConverter
    public final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse> convert(java.lang.String nativeRypData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeRypData, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            try {
                kotlinx.serialization.json.Json json = this.Camera2StreamConfigurationMap;
                json.getSerializersModule();
                kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) json.decodeFromString(kotlinx.serialization.json.JsonObject.INSTANCE.serializer(), nativeRypData);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"xoData", "initializeNativeRypCheckout", "rawJson"});
                kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get(listOf.get(0));
                int size = listOf.size();
                int i = 1;
                while (true) {
                    if (i < size) {
                        if (jsonElement instanceof kotlinx.serialization.json.JsonObject) {
                            jsonElement = (kotlinx.serialization.json.JsonElement) ((kotlinx.serialization.json.JsonObject) jsonElement).get(listOf.get(i));
                            i++;
                        } else {
                            java.lang.Object obj = listOf.get(i - 1);
                            java.lang.Class<?> cls = jsonElement != null ? jsonElement.getClass() : null;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected JsonObject for key: ");
                            sb.append(obj);
                            sb.append(", but found ");
                            sb.append(cls);
                            defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("ParsingError", sb.toString(), false, null, null, 24, null));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        if (jsonElement instanceof kotlinx.serialization.json.JsonPrimitive) {
                            arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity> parse = this.getHighSpeedVideoSizes.parse(((kotlinx.serialization.json.JsonPrimitive) jsonElement).getContent());
                            if (parse instanceof arrow.core.Either.Left) {
                                defaultRaise2.raise(((arrow.core.Either.Left) parse).getValue());
                                throw new kotlin.KotlinNothingValueException();
                            }
                            if (!(parse instanceof arrow.core.Either.Right)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse(((com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) ((arrow.core.Either.Right) parse).getValue()).getInitializeCheckout(), ((com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) ((arrow.core.Either.Right) parse).getValue()).getFundingSelection(), ((com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) ((arrow.core.Either.Right) parse).getValue()).getBuyerInfo());
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(authenticationXOResponse);
                        }
                        defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("ParsingError", "Expected JsonPrimitive for key: rawJson, but found ".concat(java.lang.String.valueOf(jsonElement != null ? jsonElement.getClass() : null)), false, null, null, 24, null));
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            } catch (kotlinx.serialization.SerializationException e) {
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to decode nativeRypData into JsonObject: ");
                sb2.append(message);
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("ParsingError", sb2.toString(), false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e2, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
