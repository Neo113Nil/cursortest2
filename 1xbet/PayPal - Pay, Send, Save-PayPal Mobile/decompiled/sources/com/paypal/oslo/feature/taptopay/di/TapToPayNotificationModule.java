package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/TapToPayNotificationModule;", "", "", "Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContentProvider;", "bindProviderSet", "()Ljava/util/Set;", "Lcom/paypal/oslo/feature/taptopay/ui/transaction/notification/DefaultTapToPayNotificationContentProvider;", "impl", "bindDefaultProvider", "(Lcom/paypal/oslo/feature/taptopay/ui/transaction/notification/DefaultTapToPayNotificationContentProvider;)Lcom/paypal/oslo/feature/taptopay/api/notification/TapToPayNotificationContentProvider;", "Lcom/paypal/oslo/feature/taptopay/ui/transaction/notification/TapToPayNotificationClickHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClickHandler;", "bindClickHandler", "(Lcom/paypal/oslo/feature/taptopay/ui/transaction/notification/TapToPayNotificationClickHandler;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationClickHandler;", "Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesPushNotificationHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "bindThalesPushNotificationHandler", "(Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesPushNotificationHandler;)Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface TapToPayNotificationModule {
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.pushnotification.domain.notification.NotificationClickHandler bindClickHandler(com.paypal.oslo.feature.taptopay.ui.transaction.notification.TapToPayNotificationClickHandler impl);

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider bindDefaultProvider(com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider impl);

    @dagger.multibindings.Multibinds
    java.util.Set<com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContentProvider> bindProviderSet();

    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler bindThalesPushNotificationHandler(com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler impl);
}
