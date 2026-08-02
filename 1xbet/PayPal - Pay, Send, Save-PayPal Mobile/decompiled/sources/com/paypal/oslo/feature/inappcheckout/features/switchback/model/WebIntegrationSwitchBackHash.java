package com.paypal.oslo.feature.inappcheckout.features.switchback.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/WebIntegrationSwitchBackHash;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Approve", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebIntegrationSwitchBackHash {
    public static final com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash Approve;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash Cancel;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private WebIntegrationSwitchBackHash(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash webIntegrationSwitchBackHash = new com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash("Approve", 0, "onApprove");
        Approve = webIntegrationSwitchBackHash;
        com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash webIntegrationSwitchBackHash2 = new com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, 1, "onCancel");
        Cancel = webIntegrationSwitchBackHash2;
        com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash[] webIntegrationSwitchBackHashArr = {webIntegrationSwitchBackHash, webIntegrationSwitchBackHash2};
        Camera2StreamConfigurationMap = webIntegrationSwitchBackHashArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(webIntegrationSwitchBackHashArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash[] values() {
        return (com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.features.switchback.model.WebIntegrationSwitchBackHash> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
