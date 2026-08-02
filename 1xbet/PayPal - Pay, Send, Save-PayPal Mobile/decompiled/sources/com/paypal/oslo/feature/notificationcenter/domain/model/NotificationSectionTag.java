package com.paypal.oslo.feature.notificationcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationSectionTag;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ALL", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.URGENT}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationSectionTag {
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag ALL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.Companion INSTANCE;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag URGENT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag[] getHighSpeedVideoSizes;
    private final java.lang.String value;

    private NotificationSectionTag(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag notificationSectionTag = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag("ALL", 0, "ALL");
        ALL = notificationSectionTag;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag notificationSectionTag2 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.URGENT, 1, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.URGENT);
        URGENT = notificationSectionTag2;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag[] notificationSectionTagArr = {notificationSectionTag, notificationSectionTag2};
        getHighSpeedVideoSizes = notificationSectionTagArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(notificationSectionTagArr);
        INSTANCE = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationSectionTag$Companion;", "", "<init>", "()V", "", "tag", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationSectionTag;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationSectionTag;", "", "isUrgent", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationSectionTag;)Z", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag fromString(java.lang.String tag) {
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag notificationSectionTag;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag[] values = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    notificationSectionTag = null;
                    break;
                }
                notificationSectionTag = values[i];
                if (kotlin.text.StringsKt.equals(notificationSectionTag.getValue(), tag, true)) {
                    break;
                }
                i++;
            }
            return notificationSectionTag == null ? com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.ALL : notificationSectionTag;
        }

        public final boolean isUrgent(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag tag) {
            return tag == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.URGENT;
        }

        public final boolean isUrgent(java.lang.String tag) {
            return isUrgent(tag != null ? com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.INSTANCE.fromString(tag) : null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag[] values() {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag) java.lang.Enum.valueOf(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
