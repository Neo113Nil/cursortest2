package com.paypal.oslo.feature.searchandintelligence.domain.model.sse;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\"\b\u0007\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponentDeserializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponent;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "Lkotlin/jvm/JvmSuppressWildcards;", "componentRegistry", "<init>", "(Ljava/util/Map;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CloudDisplayComponentDeserializer implements kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> {

    @java.lang.Deprecated
    public static final int MAX_LOG_PAYLOAD_LENGTH = 200;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer> getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer.Companion Companion = new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CloudDisplayComponentDeserializer(java.util.Map<java.lang.String, com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoSizes = map;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildClassSerialDescriptor$default("CloudDisplayComponent", new kotlinx.serialization.descriptors.SerialDescriptor[0], null, 4, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f6, code lost:
    
        if (r1 != null) goto L34;
     */
    @Override // kotlinx.serialization.DeserializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        com.paypal.oslo.feature.searchandintelligence.domain.model.ui.ParseError parseError;
        arrow.core.Either<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError, com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> deserialize;
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        if (!(decoder instanceof kotlinx.serialization.json.JsonDecoder)) {
            throw new java.lang.IllegalArgumentException("This serializer can only be used with JSON".toString());
        }
        kotlinx.serialization.json.JsonDecoder jsonDecoder = (kotlinx.serialization.json.JsonDecoder) decoder;
        java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.firstOrNull(kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonDecoder.decodeJsonElement()).entrySet());
        if (entry != null) {
            java.lang.String str = (java.lang.String) entry.getKey();
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) entry.getValue();
            com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer uiComponentDeserializer = this.getHighSpeedVideoSizes.get(str);
            if (uiComponentDeserializer != null && (deserialize = uiComponentDeserializer.deserialize(jsonElement, jsonDecoder)) != null) {
                if (deserialize instanceof arrow.core.Either.Right) {
                    parseError = (com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent) ((arrow.core.Either.Right) deserialize).getValue();
                } else if (deserialize instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError deserializationError = (com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError) ((arrow.core.Either.Left) deserialize).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.searchandintelligence.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("component_type", str);
                    if (deserializationError instanceof com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField) {
                        message = "Missing fields: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(((com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField) deserializationError).getMissingFields(), null, null, null, 0, null, null, 63, null)));
                    } else if (deserializationError instanceof com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure) {
                        message = ((com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure) deserializationError).getMessage();
                    } else {
                        if (!(deserializationError instanceof com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        message = ((com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError) deserializationError).getMessage();
                    }
                    pairArr[1] = kotlin.TuplesKt.to("error_message", message);
                    com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.searchandintelligence.domain.LogActions.COMPONENT_PARSER_ERROR, kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("raw_payload", kotlin.text.StringsKt.take(jsonElement.toString(), 200))), null, 8, null);
                    parseError = com.paypal.oslo.feature.searchandintelligence.domain.model.ui.ParseError.INSTANCE;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.oslo.feature.searchandintelligence.domain.LogActions.COMPONENT_PARSER_MISSING, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("component_type", str)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("raw_payload", kotlin.text.StringsKt.take(jsonElement.toString(), 200))), null, 8, null);
            parseError = com.paypal.oslo.feature.searchandintelligence.domain.model.ui.ParseError.INSTANCE;
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent(parseError);
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.oslo.feature.searchandintelligence.domain.LogActions.COMPONENT_PARSER_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", "Empty component wrapper")), null, null, 12, null);
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent(com.paypal.oslo.feature.searchandintelligence.domain.model.ui.ParseError.INSTANCE);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        throw new kotlin.NotImplementedError("Serialization is not implemented");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponentDeserializer$Companion;", "", "<init>", "()V", "", "MAX_LOG_PAYLOAD_LENGTH", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
