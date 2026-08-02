package com.paypal.oslo.feature.subscriptions.shared.domain;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "", "isEnabled", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BalancePreferenceKt {
    public static final boolean isEnabled(com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        return balancePreference == com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED;
    }
}
