package com.paypal.oslo.feature.searchandintelligence.data.parser;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/parser/SseResponseParser;", "Lcom/paypal/oslo/core/network/sse/SseParser;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/Json;)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "parse", "(Ljava/lang/String;)Larrow/core/Either;", "p0", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SseResponseParser implements com.paypal.oslo.core.network.sse.SseParser<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SseResponseParser(kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.Camera2StreamConfigurationMap = json;
    }

    @Override // com.paypal.oslo.core.network.sse.SseParser
    public final arrow.core.Either<com.paypal.oslo.core.network.sse.domain.error.SseError, com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> parse(java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return getHighSpeedVideoFpsRangesFor(data);
    }

    private final arrow.core.Either<com.paypal.oslo.core.network.sse.domain.error.SseError, com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived errorReceived;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser sseResponseParser = this;
            kotlinx.serialization.json.Json json = this.Camera2StreamConfigurationMap;
            json.getSerializersModule();
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventKt.toCloudSseEvent((com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventRaw) json.decodeFromString(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventRaw.INSTANCE.serializer(), p0)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            return m23439exceptionOrNullimpl instanceof kotlinx.serialization.SerializationException ? arrow.core.EitherKt.left(new com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError(m23439exceptionOrNullimpl, p0)) : arrow.core.EitherKt.left(new com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError(m23439exceptionOrNullimpl));
        }
        com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent cloudSseEvent = (com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent) m23436constructorimpl;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Parsed CloudEvents SSE response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cloudSseEvent.getClass()).getSimpleName())), null, 4, null);
        if (cloudSseEvent instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started) {
            errorReceived = new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted(((com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started) cloudSseEvent).getId());
        } else if (cloudSseEvent instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component) {
            com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component component = (com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component) cloudSseEvent;
            errorReceived = new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component(component.getId(), component.getComponents(), component.isFinalEvent());
        } else if (cloudSseEvent instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed) {
            errorReceived = new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted(((com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed) cloudSseEvent).getId());
        } else if (cloudSseEvent instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing) {
            errorReceived = new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing(((com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing) cloudSseEvent).getId());
        } else {
            if (!(cloudSseEvent instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            errorReceived = new com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived(((com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error) cloudSseEvent).getId());
        }
        return arrow.core.EitherKt.right(errorReceived);
    }
}
