package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u001d\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/PaymentRepositoryImpl;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/PaymentRepository;", "<init>", "()V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "observePayment", "()Lkotlinx/coroutines/flow/Flow;", "", "isListedAsPaymentApp", "()Z", "show", "", "showAsPaymentApp", "(Z)V", "isDefaultPaymentApp", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "setDefaultPaymentApp", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Landroid/app/Activity;", "activity", "setPreferredAppForOneTimeUse", "(Landroid/app/Activity;)Z", "unsetPreferredAppForOneTimeUse", "isForegroundSettingEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentRepositoryImpl implements com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isDefaultPaymentApp() {
        return false;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isForegroundSettingEnabled() {
        return false;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean isListedAsPaymentApp() {
        return false;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final void showAsPaymentApp(boolean show) {
    }

    @javax.inject.Inject
    public PaymentRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState> observePayment() {
        return kotlinx.coroutines.flow.FlowKt.emptyFlow();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean unsetPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return false;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setPreferredAppForOneTimeUse(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return false;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository
    public final boolean setDefaultPaymentApp(androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        return false;
    }
}
