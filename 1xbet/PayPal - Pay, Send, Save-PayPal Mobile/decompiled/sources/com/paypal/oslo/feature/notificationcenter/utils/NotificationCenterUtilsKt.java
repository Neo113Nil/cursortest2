package com.paypal.oslo.feature.notificationcenter.utils;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a'\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\u0007\"\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"", "p0", "p1", "Lcom/paypal/oslo/feature/notificationcenter/utils/NotificationTimeStrings;", "p2", "", "getHighSpeedVideoSizes", "(JJLcom/paypal/oslo/feature/notificationcenter/utils/NotificationTimeStrings;)Ljava/lang/String;", "epochMillis", "currentTimeMillis", "strings", "formatNotificationTime", "formatNotificationTimeAccessibility", "FallbackAvatarUrl", "Ljava/lang/String;", "NoTimestampAvailable", "J"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterUtilsKt {
    public static final java.lang.String FallbackAvatarUrl = "https://www.paypalobjects.com/comms-mobile/Oslo/Notification_center/default_icon.png";
    public static final long NoTimestampAvailable = -1;

    private static final java.lang.String getHighSpeedVideoSizes(long j, long j2, com.paypal.oslo.feature.notificationcenter.utils.NotificationTimeStrings notificationTimeStrings) {
        if (j < 0) {
            return "";
        }
        long j3 = (j2 - j) / 1000;
        long j4 = j3 / 60;
        long j5 = j4 / 60;
        long j6 = j5 / 24;
        long j7 = j6 / 7;
        long j8 = j6 / 30;
        long j9 = j6 / 365;
        if (j3 < 60) {
            return notificationTimeStrings.getJustNow();
        }
        if (j4 < 60) {
            java.lang.String format = java.lang.String.format(notificationTimeStrings.getMinuteFormat(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j4)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }
        if (j5 < 24) {
            java.lang.String format2 = java.lang.String.format(notificationTimeStrings.getHourFormat(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j5)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
            return format2;
        }
        if (j6 < 7) {
            java.lang.String format3 = java.lang.String.format(notificationTimeStrings.getDayFormat(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j6)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
            return format3;
        }
        if (j7 < 4) {
            java.lang.String format4 = java.lang.String.format(notificationTimeStrings.getWeekFormat(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j7)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format4, "");
            return format4;
        }
        if (j8 < 12) {
            java.lang.String format5 = java.lang.String.format(notificationTimeStrings.getMonthFormat(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j8)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format5, "");
            return format5;
        }
        java.lang.String format6 = java.lang.String.format(notificationTimeStrings.getYearFormat(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j9)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format6, "");
        return format6;
    }

    public static final java.lang.String formatNotificationTime(long j, long j2, com.paypal.oslo.feature.notificationcenter.utils.NotificationTimeStrings notificationTimeStrings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationTimeStrings, "");
        return getHighSpeedVideoSizes(j, j2, notificationTimeStrings);
    }

    public static final java.lang.String formatNotificationTimeAccessibility(long j, long j2, com.paypal.oslo.feature.notificationcenter.utils.NotificationTimeStrings notificationTimeStrings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationTimeStrings, "");
        return getHighSpeedVideoSizes(j, j2, notificationTimeStrings);
    }
}
