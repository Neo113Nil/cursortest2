package com.ingo.sdk.android.ux.feature.transaction.confirm_amount;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountFragmentDirections;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmCheckAmountFragmentDirections {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragmentDirections.Companion INSTANCE = new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragmentDirections.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountFragmentDirections$Companion;", "", "<init>", "()V", "Landroidx/navigation/NavDirections;", "actionConfirmAmountFragmentToEnterAmountFragment", "()Landroidx/navigation/NavDirections;", "actionConfirmAmountFragmentToFundsTimingFragment"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.view.NavDirections actionConfirmAmountFragmentToEnterAmountFragment() {
            return new androidx.view.ActionOnlyNavDirections(com.ingo.sdk.android.R.id.action_confirmAmountFragment_to_enterAmountFragment);
        }

        public final androidx.view.NavDirections actionConfirmAmountFragmentToFundsTimingFragment() {
            return new androidx.view.ActionOnlyNavDirections(com.ingo.sdk.android.R.id.action_confirmAmountFragment_to_fundsTimingFragment);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ConfirmCheckAmountFragmentDirections() {
    }
}
