package com.paypal.oslo.feature.dataprivacy.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "IN_PROGRESS", "AWAITING_VERIFICATION", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "WITHDRAWN", "REJECTED", "OPEN", "CLOSED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureStatus {
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus AWAITING_VERIFICATION;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus CLOSED;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus COMPLETED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus FAILED;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus IN_PROGRESS;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus OPEN;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus PENDING;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus REJECTED;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus UNKNOWN;
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus WITHDRAWN;
    private static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus[] getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus> pendingStatuses;

    private ErasureStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 0);
        PENDING = erasureStatus;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus2 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("IN_PROGRESS", 1);
        IN_PROGRESS = erasureStatus2;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus3 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("AWAITING_VERIFICATION", 2);
        AWAITING_VERIFICATION = erasureStatus3;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus4 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("COMPLETED", 3);
        COMPLETED = erasureStatus4;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus5 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 4);
        FAILED = erasureStatus5;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus6 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("WITHDRAWN", 5);
        WITHDRAWN = erasureStatus6;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus7 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("REJECTED", 6);
        REJECTED = erasureStatus7;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus8 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("OPEN", 7);
        OPEN = erasureStatus8;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus9 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("CLOSED", 8);
        CLOSED = erasureStatus9;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus10 = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus("UNKNOWN", 9);
        UNKNOWN = erasureStatus10;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus[] erasureStatusArr = {erasureStatus, erasureStatus2, erasureStatus3, erasureStatus4, erasureStatus5, erasureStatus6, erasureStatus7, erasureStatus8, erasureStatus9, erasureStatus10};
        getHighSpeedVideoFpsRangesFor = erasureStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(erasureStatusArr);
        INSTANCE = new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.Companion(null);
        pendingStatuses = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus[]{erasureStatus8, erasureStatus, erasureStatus2, erasureStatus3});
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureStatus;", "pendingStatuses", "Ljava/util/Set;", "getPendingStatuses", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus> getPendingStatuses() {
            return com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.pendingStatuses;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus[] values() {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
