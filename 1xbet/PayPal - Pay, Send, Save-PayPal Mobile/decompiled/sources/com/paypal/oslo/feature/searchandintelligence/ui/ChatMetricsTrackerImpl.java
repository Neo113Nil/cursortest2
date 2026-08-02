package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0016\u0010 \u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMetricsTrackerImpl;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMetricsTracker;", "Lkotlin/time/TimeSource;", "timeSource", "<init>", "(Lkotlin/time/TimeSource;)V", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "error", "", "logSessionCreateFailed", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "", "sessionId", "logSessionCloseFailed", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "input", "setInput", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "response", "trackSseResponse", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;)V", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "onError", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/sse/domain/error/SseError;)V", "logStreamCompletionAndReset", "(Ljava/lang/String;)V", "getOutputMinFrameDuration", "Lkotlin/time/TimeSource;", "getHighSpeedVideoSizes", "Lkotlin/time/TimeMark;", "getInputSizeshNQ4ISI", "Lkotlin/time/TimeMark;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "Camera2StreamConfigurationMap", "", "Z", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatMetricsTrackerImpl implements com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.time.TimeMark getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.time.TimeSource getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ChatMetricsTrackerImpl(kotlin.time.TimeSource timeSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        this.getHighSpeedVideoSizes = timeSource;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker
    public final void logSessionCreateFailed(com.paypal.oslo.core.network.http.error.NetworkError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorCode(error)), kotlin.TuplesKt.to("error_message", com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorMessage(error)), kotlin.TuplesKt.to("error_reason", com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorReason(error)));
        if (com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImplKt.access$isClientNetworkIssue(error)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "sni.session.create.failed", mapOf, null, 4, null);
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "sni.session.create.failed", mapOf, null, null, 12, null);
        }
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker
    public final void logSessionCloseFailed(java.lang.String sessionId, com.paypal.oslo.core.network.http.error.NetworkError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "sni.session.close.failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", sessionId), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorCode(error)), kotlin.TuplesKt.to("error_message", com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorMessage(error)), kotlin.TuplesKt.to("error_reason", com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorReason(error))), null, 4, null);
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker
    public final void setInput(com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        this.Camera2StreamConfigurationMap = input;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker
    public final void trackSseResponse(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (response instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted) {
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.markNow();
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "SSE stream started", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", ((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted) response).getId())), null, 4, null);
            return;
        }
        if (response instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component) {
            com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component component = (com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component) response;
            this.getHighSpeedVideoFpsRangesFor += component.getComponents().size();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "SSE component received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", component.getId()), kotlin.TuplesKt.to("component_count", java.lang.Integer.valueOf(component.getComponents().size())), kotlin.TuplesKt.to("is_final_event", java.lang.Boolean.valueOf(component.isFinalEvent()))), null, 4, null);
        } else {
            if (response instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted) {
                this.getHighSpeedVideoSizesFor = true;
                return;
            }
            if (response instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing) {
                this.getHighResolutionOutputSizeshNQ4ISI++;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "SSE stream processing (ping)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", ((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing) response).getId())), null, 4, null);
            } else {
                if (!(response instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Received an error in the SSE stream", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", ((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived) response).getId())), null, 4, null);
                this.getHighSpeedVideoSizesFor = true;
            }
        }
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker
    public final void onError(java.lang.String sessionId, com.paypal.oslo.core.network.sse.domain.error.SseError error) {
        java.lang.String rawData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        this.getInputSizeshNQ4ISI = true;
        com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput = this.Camera2StreamConfigurationMap;
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", sessionId), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorCode(error)), kotlin.TuplesKt.to("error_message", com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toErrorMessage(error)), kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImplKt.access$toInputType(chatInput)));
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("message_details", com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImplKt.access$toMessageDetails(chatInput));
        com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError parseError = error instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError ? (com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) error : null;
        if (parseError != null && (rawData = parseError.getRawData()) != null) {
            createMapBuilder.put("raw_payload", kotlin.text.StringsKt.take(rawData, 200));
        }
        java.util.Map<java.lang.String, ? extends java.lang.Object> build = kotlin.collections.MapsKt.build(createMapBuilder);
        if (com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImplKt.access$isClientNetworkIssue(error)) {
            com.paypal.oslo.feature.searchandintelligence.LoggerKt.log.w(com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toActionName(error), mapOf, build);
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.oslo.feature.searchandintelligence.domain.logging.LogFunctionsKt.toActionName(error), mapOf, build, null, 8, null);
        }
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker
    public final void logStreamCompletionAndReset(java.lang.String sessionId) {
        kotlin.time.TimeMark timeMark = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus from = com.paypal.oslo.feature.searchandintelligence.ui.StreamCompletionStatus.INSTANCE.from(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.searchandintelligence.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[6];
        pairArr[0] = kotlin.TuplesKt.to("session_id", sessionId);
        pairArr[1] = kotlin.TuplesKt.to("completion_status", from.name());
        pairArr[2] = kotlin.TuplesKt.to("total_components", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor));
        pairArr[3] = kotlin.TuplesKt.to("total_pings", java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        pairArr[4] = kotlin.TuplesKt.to("stream_duration_ms", java.lang.Long.valueOf(timeMark != null ? kotlin.time.Duration.m23953getInWholeMillisecondsimpl(timeMark.mo23933elapsedNowUwyO8pc()) : 0L));
        pairArr[5] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImplKt.access$toInputType(chatInput));
        logger.i("sni.sse.stream.completed", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message_details", com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTrackerImplKt.access$toMessageDetails(chatInput))));
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizesFor = false;
        this.getInputSizeshNQ4ISI = false;
    }
}
