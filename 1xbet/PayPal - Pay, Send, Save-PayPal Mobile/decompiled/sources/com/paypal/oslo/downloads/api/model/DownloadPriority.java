package com.paypal.oslo.downloads.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/DownloadPriority;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "LOW", "NORMAL", "HIGH", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.URGENT}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadPriority {
    public static final com.paypal.oslo.downloads.api.model.DownloadPriority HIGH;
    public static final com.paypal.oslo.downloads.api.model.DownloadPriority LOW;
    public static final com.paypal.oslo.downloads.api.model.DownloadPriority NORMAL;
    public static final com.paypal.oslo.downloads.api.model.DownloadPriority URGENT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadPriority[] getHighSpeedVideoFpsRanges;
    private final int value;

    private DownloadPriority(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.downloads.api.model.DownloadPriority downloadPriority = new com.paypal.oslo.downloads.api.model.DownloadPriority("LOW", 0, 0);
        LOW = downloadPriority;
        com.paypal.oslo.downloads.api.model.DownloadPriority downloadPriority2 = new com.paypal.oslo.downloads.api.model.DownloadPriority("NORMAL", 1, 50);
        NORMAL = downloadPriority2;
        com.paypal.oslo.downloads.api.model.DownloadPriority downloadPriority3 = new com.paypal.oslo.downloads.api.model.DownloadPriority("HIGH", 2, 100);
        HIGH = downloadPriority3;
        com.paypal.oslo.downloads.api.model.DownloadPriority downloadPriority4 = new com.paypal.oslo.downloads.api.model.DownloadPriority(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.URGENT, 3, 200);
        URGENT = downloadPriority4;
        com.paypal.oslo.downloads.api.model.DownloadPriority[] downloadPriorityArr = {downloadPriority, downloadPriority2, downloadPriority3, downloadPriority4};
        getHighSpeedVideoFpsRanges = downloadPriorityArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(downloadPriorityArr);
    }

    public static com.paypal.oslo.downloads.api.model.DownloadPriority[] values() {
        return (com.paypal.oslo.downloads.api.model.DownloadPriority[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.downloads.api.model.DownloadPriority valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.api.model.DownloadPriority) java.lang.Enum.valueOf(com.paypal.oslo.downloads.api.model.DownloadPriority.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.api.model.DownloadPriority> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
