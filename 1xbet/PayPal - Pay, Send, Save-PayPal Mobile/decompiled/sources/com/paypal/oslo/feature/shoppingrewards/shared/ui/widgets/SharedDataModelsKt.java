package com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;", "BUTTON_STATE_ENABLED", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;", "getBUTTON_STATE_ENABLED", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;", "BUTTON_STATE_DISABLED", "getBUTTON_STATE_DISABLED", "getAsLoading", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;)Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;", "asLoading", "getAsNormal", "asNormal"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SharedDataModelsKt {
    private static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState BUTTON_STATE_ENABLED = new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState(true, false);
    private static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState BUTTON_STATE_DISABLED = new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState(false, false);

    public static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState getBUTTON_STATE_ENABLED() {
        return BUTTON_STATE_ENABLED;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState getBUTTON_STATE_DISABLED() {
        return BUTTON_STATE_DISABLED;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState getAsLoading(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState buttonToggleState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonToggleState, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState.copy$default(buttonToggleState, false, true, 1, null);
    }

    public static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState getAsNormal(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState buttonToggleState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonToggleState, "");
        return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState.copy$default(buttonToggleState, false, false, 1, null);
    }
}
