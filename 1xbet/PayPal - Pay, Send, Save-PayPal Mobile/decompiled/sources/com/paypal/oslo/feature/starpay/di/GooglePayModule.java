package com.paypal.oslo.feature.starpay.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/starpay/di/GooglePayModule;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcom/google/android/gms/tapandpay/TapAndPayClient;", "provideTapAndPay", "(Landroid/app/Activity;)Lcom/google/android/gms/tapandpay/TapAndPayClient;", "GooglePayAbstractModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class GooglePayModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.starpay.di.GooglePayModule INSTANCE = new com.paypal.oslo.feature.starpay.di.GooglePayModule();

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/starpay/di/GooglePayModule$GooglePayAbstractModule;", "", "Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient;", "googlePay", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "bindGooglePay", "(Lcom/paypal/oslo/feature/starpay/ui/GooglePayClient;)Lcom/paypal/oslo/feature/starpay/api/StarPayClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.Module
    public interface GooglePayAbstractModule {
        @dagger.Binds
        com.paypal.oslo.feature.starpay.api.StarPayClient bindGooglePay(com.paypal.oslo.feature.starpay.ui.GooglePayClient googlePay);
    }

    private GooglePayModule() {
    }

    @dagger.Provides
    public final com.google.android.gms.tapandpay.TapAndPayClient provideTapAndPay(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        com.google.android.gms.tapandpay.TapAndPayClient client = com.google.android.gms.tapandpay.TapAndPay.getClient(activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(client, "");
        return client;
    }
}
