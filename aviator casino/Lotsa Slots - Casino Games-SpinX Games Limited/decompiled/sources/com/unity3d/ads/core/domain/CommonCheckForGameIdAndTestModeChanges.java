package com.unity3d.ads.core.domain;

/* compiled from: CommonCheckForGameIdAndTestModeChanges.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096\u0002J,\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCheckForGameIdAndTestModeChanges;", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "legacy", "", "sendDiagnostic", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "tags", "", "isLegacy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges {
    private final com.unity3d.ads.core.domain.GetGameId getGameId;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(com.unity3d.ads.core.domain.GetGameId getGameId, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean legacy) {
        java.lang.String invoke = this.getGameId.invoke();
        if (invoke == null) {
            invoke = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        java.lang.String previousGameId = com.unity3d.services.core.properties.ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        java.util.Map<java.lang.String, java.lang.String> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("previous_game_id", previousGameId), kotlin.TuplesKt.to("game_id", invoke));
        if (kotlin.jvm.internal.Intrinsics.areEqual(previousGameId, kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL)) {
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(invoke, previousGameId)) {
            sendDiagnostic("native_initialize_game_id_changed", mapOf, legacy);
        } else {
            sendDiagnostic("native_initialize_game_id_same", mapOf, legacy);
        }
        boolean isTestMode = com.unity3d.services.core.properties.SdkProperties.isTestMode();
        boolean previousTestMode = com.unity3d.services.core.properties.SdkProperties.getPreviousTestMode();
        java.util.Map<java.lang.String, java.lang.String> mapOf2 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("previous_test_mode", java.lang.String.valueOf(previousTestMode)), kotlin.TuplesKt.to("test_mode", java.lang.String.valueOf(isTestMode)));
        if (isTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", mapOf2, legacy);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", mapOf2, legacy);
        }
    }

    private final void sendDiagnostic(java.lang.String event, java.util.Map<java.lang.String, java.lang.String> tags, boolean isLegacy) {
        if (isLegacy) {
            com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sendMetric(new com.unity3d.services.core.request.metrics.Metric(event, tags, null, 4, null));
        } else {
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, event, null, tags, null, null, null, 58, null);
        }
    }
}
