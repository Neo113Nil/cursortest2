package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/downloads/impl/DownloadStateValue;", "", "<init>", "()V", "", com.paypal.oslo.downloads.impl.DownloadStateValue.QUEUED, "Ljava/lang/String;", com.paypal.oslo.downloads.impl.DownloadStateValue.DOWNLOADING, com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, com.paypal.oslo.downloads.impl.DownloadStateValue.WAITING_FOR_RETRY, com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, "", "ACTIVE_STATES", "Ljava/util/List;", "getACTIVE_STATES", "()Ljava/util/List;", "TERMINAL_STATES", "getTERMINAL_STATES"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DownloadStateValue {
    public static final java.lang.String COMPLETED = "COMPLETED";
    public static final java.lang.String NO_NETWORK = "NO_NETWORK";
    public static final java.lang.String PAUSED = "PAUSED";
    public static final java.lang.String WAITING_FOR_RETRY = "WAITING_FOR_RETRY";
    public static final com.paypal.oslo.downloads.impl.DownloadStateValue INSTANCE = new com.paypal.oslo.downloads.impl.DownloadStateValue();
    public static final java.lang.String QUEUED = "QUEUED";
    public static final java.lang.String DOWNLOADING = "DOWNLOADING";
    private static final java.util.List<java.lang.String> ACTIVE_STATES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{QUEUED, DOWNLOADING});
    public static final java.lang.String FAILED = "FAILED";
    public static final java.lang.String CANCELLED = "CANCELLED";
    private static final java.util.List<java.lang.String> TERMINAL_STATES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"COMPLETED", FAILED, CANCELLED});

    private DownloadStateValue() {
    }

    public final java.util.List<java.lang.String> getACTIVE_STATES() {
        return ACTIVE_STATES;
    }

    public final java.util.List<java.lang.String> getTERMINAL_STATES() {
        return TERMINAL_STATES;
    }
}
