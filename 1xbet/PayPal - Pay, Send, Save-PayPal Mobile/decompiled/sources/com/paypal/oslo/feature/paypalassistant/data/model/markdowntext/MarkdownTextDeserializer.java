package com.paypal.oslo.feature.paypalassistant.data.model.markdowntext;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/data/model/markdowntext/MarkdownTextDeserializer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/UiComponentDeserializer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializerErrorHandler;", "errorHandler", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializerErrorHandler;)V", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/json/JsonDecoder;", "decoder", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/MarkdownText;", "deserialize", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonDecoder;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializerErrorHandler;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarkdownTextDeserializer implements com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer {

    @java.lang.Deprecated
    public static final java.lang.String COMPONENT_NAME = "MarkdownText";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer.Companion Companion = new com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MarkdownTextDeserializer(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler deserializerErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializerErrorHandler, "");
        this.getHighSpeedVideoSizes = deserializerErrorHandler;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer
    public final arrow.core.Either<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError, com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText> deserialize(kotlinx.serialization.json.JsonElement element, kotlinx.serialization.json.JsonDecoder decoder) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer markdownTextDeserializer = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText) decoder.getJson().decodeFromJsonElement(com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText.INSTANCE.serializer(), element));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl == null) {
            return arrow.core.EitherKt.right((com.paypal.oslo.feature.searchandintelligence.api.component.MarkdownText) m23436constructorimpl);
        }
        return this.getHighSpeedVideoSizes.handleError(COMPONENT_NAME, m23439exceptionOrNullimpl);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/data/model/markdowntext/MarkdownTextDeserializer$Companion;", "", "<init>", "()V", "", "COMPONENT_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
