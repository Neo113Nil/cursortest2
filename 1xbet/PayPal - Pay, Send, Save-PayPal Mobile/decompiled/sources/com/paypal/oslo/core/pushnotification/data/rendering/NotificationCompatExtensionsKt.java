package com.paypal.oslo.core.pushnotification.data.rendering;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;", "Landroidx/core/app/NotificationCompat$Style;", "toCompat", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationStyle;)Landroidx/core/app/NotificationCompat$Style;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;", "", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;)I"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationCompatExtensionsKt {
    public static final androidx.core.app.NotificationCompat.Style toCompat(com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle notificationStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationStyle, "");
        if (notificationStyle instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText) {
            androidx.core.app.NotificationCompat.BigTextStyle bigText = new androidx.core.app.NotificationCompat.BigTextStyle().bigText(((com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigText) notificationStyle).getText());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigText, "");
            return bigText;
        }
        if (notificationStyle instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture) {
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture bigPicture = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.BigPicture) notificationStyle;
            androidx.core.app.NotificationCompat.BigPictureStyle bigPicture2 = new androidx.core.app.NotificationCompat.BigPictureStyle().bigPicture(bigPicture.getPicture());
            java.lang.String summaryText = bigPicture.getSummaryText();
            if (summaryText != null) {
                bigPicture2.setSummaryText(summaryText);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigPicture2, "");
            return bigPicture2;
        }
        if (!(notificationStyle instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.core.app.NotificationCompat.InboxStyle inboxStyle = new androidx.core.app.NotificationCompat.InboxStyle();
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle inboxStyle2 = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationStyle.InboxStyle) notificationStyle;
        java.util.Iterator<T> it = inboxStyle2.getLines().iterator();
        while (it.hasNext()) {
            inboxStyle.addLine((java.lang.String) it.next());
        }
        java.lang.String summaryText2 = inboxStyle2.getSummaryText();
        if (summaryText2 != null) {
            inboxStyle.setSummaryText(summaryText2);
        }
        return inboxStyle;
    }

    public static final int toCompat(com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPriority, "");
        int i = com.paypal.oslo.core.pushnotification.data.rendering.NotificationCompatExtensionsKt.WhenMappings.$EnumSwitchMapping$0[notificationPriority.ordinal()];
        if (i == 1) {
            return -2;
        }
        if (i == 2) {
            return -1;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 2;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.values().length];
            try {
                iArr[com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.MIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.LOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.DEFAULT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.HIGH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.MAX.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
