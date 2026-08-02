package com.paypal.android.taptopay.data.thales.di;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/di/TapToPayDataThalesFcmModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "pushNotificationTokenDataSource", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "pushNotificationDataSource", "Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "provideThalesFcmHandler", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;)Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class TapToPayDataThalesFcmModule {
    @dagger.Provides
    public final com.paypal.android.taptopay.data.thales.fcm.FcmHandler provideThalesFcmHandler(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
        return new com.paypal.android.taptopay.data.thales.fcm.FcmHandler(new com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler(context, pushNotificationTokenDataSource, null, 4, null), new com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler(context, pushNotificationDataSource), null, 4, null);
    }
}
