package com.paypal.oslo.feature.notificationcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "NEW", "PRESENTED", "IMPRESSED", "CLICKED", "DISMISSED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationStatus {
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus CLICKED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus DISMISSED;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus IMPRESSED;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus NEW;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus PRESENTED;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus[] getHighSpeedVideoSizes;
    private final java.lang.String value;

    private NotificationStatus(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus("NEW", 0, "NEW");
        NEW = notificationStatus;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus2 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus("PRESENTED", 1, "PRESENTED");
        PRESENTED = notificationStatus2;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus3 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus("IMPRESSED", 2, "IMPRESSED");
        IMPRESSED = notificationStatus3;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus4 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus("CLICKED", 3, "CLICKED");
        CLICKED = notificationStatus4;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus5 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus("DISMISSED", 4, "DISMISSED");
        DISMISSED = notificationStatus5;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus6 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus("UNKNOWN", 5, "UNKNOWN");
        UNKNOWN = notificationStatus6;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus[] notificationStatusArr = {notificationStatus, notificationStatus2, notificationStatus3, notificationStatus4, notificationStatus5, notificationStatus6};
        getHighSpeedVideoSizes = notificationStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(notificationStatusArr);
        INSTANCE = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus$Companion;", "", "<init>", "()V", "", "status", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;", "", "isUnread", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationStatus;)Z", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus fromString(java.lang.String status) {
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus notificationStatus;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus[] values = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    notificationStatus = null;
                    break;
                }
                notificationStatus = values[i];
                if (kotlin.text.StringsKt.equals(notificationStatus.getValue(), status, true)) {
                    break;
                }
                i++;
            }
            return notificationStatus == null ? com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.UNKNOWN : notificationStatus;
        }

        public final boolean isUnread(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus status) {
            return status == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.NEW || status == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.PRESENTED;
        }

        public final boolean isUnread(java.lang.String status) {
            return isUnread(status != null ? com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.INSTANCE.fromString(status) : null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus[] values() {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
