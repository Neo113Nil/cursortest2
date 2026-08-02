package com.paypal.oslo.feature.home.data.accountsnapshot.balance;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProviderImpl;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getEstimatedBalance", "()Ljava/lang/String;", "getPayPalBalance", "getNegativeBalance", "amount", "getBalanceOnHold", "(Ljava/lang/String;)Ljava/lang/String;", "getDebitCardLocked", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BalanceStringProviderImpl implements com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    @javax.inject.Inject
    public BalanceStringProviderImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider
    public final java.lang.String getEstimatedBalance() {
        java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.home.R.string.feature_home_multicurrency_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider
    public final java.lang.String getPayPalBalance() {
        java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.home.R.string.feature_home_balance_product_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider
    public final java.lang.String getNegativeBalance() {
        java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.home.R.string.feature_home_negative_balance_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider
    public final java.lang.String getBalanceOnHold(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.home.R.string.feature_home_balance_on_hold_status, amount);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider
    public final java.lang.String getDebitCardLocked() {
        java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.home.R.string.feature_home_debit_card_locked_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
