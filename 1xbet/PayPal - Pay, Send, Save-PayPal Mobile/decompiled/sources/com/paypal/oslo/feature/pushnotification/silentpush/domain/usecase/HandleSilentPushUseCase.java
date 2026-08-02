package com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B*\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R%\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/usecase/HandleSilentPushUseCase;", "", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/parser/SilentPushPayloadParser;", "parser", "", "", "Lcom/paypal/oslo/feature/pushnotification/api/silentpush/SilentPushHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "handlers", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/parser/SilentPushPayloadParser;Ljava/util/Map;)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "invoke", "(Ljava/util/Map;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/parser/SilentPushPayloadParser;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandleSilentPushUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public HandleSilentPushUseCase(com.paypal.oslo.feature.pushnotification.silentpush.domain.parser.SilentPushPayloadParser silentPushPayloadParser, java.util.Map<java.lang.String, com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentPushPayloadParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRangesFor = silentPushPayloadParser;
        this.getHighSpeedVideoFpsRanges = map;
    }

    public final void invoke(java.util.Map<java.lang.String, java.lang.String> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        arrow.core.Either<com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError, com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload> parse = this.getHighSpeedVideoFpsRangesFor.parse(data);
        if (!(parse instanceof arrow.core.Either.Right)) {
            if (parse instanceof arrow.core.Either.Left) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Silent push parse failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.MESSAGE_ID)), kotlin.TuplesKt.to("campaign_id", data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.CAMPAIGN_ID)), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError) ((arrow.core.Either.Left) parse).getValue()).toString())), null, 4, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload silentPushPayload = (com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload) ((arrow.core.Either.Right) parse).getValue();
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Silent push received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, silentPushPayload.getMessageId()), kotlin.TuplesKt.to("campaign_id", silentPushPayload.getCampaignId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.TARGET_MODULE, silentPushPayload.getTargetModule()), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, silentPushPayload.getEventType())), null, 4, null);
        com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler silentPushHandler = this.getHighSpeedVideoFpsRanges.get(silentPushPayload.getTargetModule());
        if (silentPushHandler == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "No handler for silent push target module", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, silentPushPayload.getMessageId()), kotlin.TuplesKt.to("campaign_id", silentPushPayload.getCampaignId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.TARGET_MODULE, silentPushPayload.getTargetModule())), null, 4, null);
            return;
        }
        try {
            silentPushHandler.onSilentPushReceived(silentPushPayload.getDataPayload());
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Silent push delivered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, silentPushPayload.getMessageId()), kotlin.TuplesKt.to("campaign_id", silentPushPayload.getCampaignId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.TARGET_MODULE, silentPushPayload.getTargetModule())), null, 4, null);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Silent push handler threw exception", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, silentPushPayload.getMessageId()), kotlin.TuplesKt.to("campaign_id", silentPushPayload.getCampaignId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.TARGET_MODULE, silentPushPayload.getTargetModule())), null, e, 4, null);
        }
    }
}
