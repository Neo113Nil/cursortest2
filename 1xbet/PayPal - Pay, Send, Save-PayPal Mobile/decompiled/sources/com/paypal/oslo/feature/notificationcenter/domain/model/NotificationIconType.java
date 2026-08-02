package com.paypal.oslo.feature.notificationcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "PPUI", "URL", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationIconType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType PPUI;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType UNKNOWN;
    public static final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType URL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private NotificationIconType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType("PPUI", 0, "PPUI");
        PPUI = notificationIconType;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType2 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType("URL", 1, "URL");
        URL = notificationIconType2;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType3 = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType("UNKNOWN", 2, "UNKNOWN");
        UNKNOWN = notificationIconType3;
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType[] notificationIconTypeArr = {notificationIconType, notificationIconType2, notificationIconType3};
        getHighSpeedVideoFpsRangesFor = notificationIconTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(notificationIconTypeArr);
        INSTANCE = new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType$Companion;", "", "<init>", "()V", "", "iconType", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIconType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType fromString(java.lang.String iconType) {
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType notificationIconType;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconType, "");
            com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType[] values = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    notificationIconType = null;
                    break;
                }
                notificationIconType = values[i];
                if (kotlin.text.StringsKt.equals(notificationIconType.getValue(), iconType, true)) {
                    break;
                }
                i++;
            }
            return notificationIconType == null ? com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.UNKNOWN : notificationIconType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType[] values() {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType) java.lang.Enum.valueOf(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
