package com.paypal.oslo.feature.taptopay.api.notification;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContentProvider;", "", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;", "context", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationData;", "provideContent", "(Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContext;)Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationData;", "", "getPriority", "()I", "priority"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface TapToPayNotificationContentProvider {
    default int getPriority() {
        return 0;
    }

    com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationData provideContent(com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext context);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static int getPriority(com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider tapToPayNotificationContentProvider) {
            return com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider.super.getPriority();
        }
    }
}
