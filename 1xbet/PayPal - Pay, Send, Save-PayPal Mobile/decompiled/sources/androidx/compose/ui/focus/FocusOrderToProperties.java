package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderToProperties;", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "focusOrderReceiver", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Landroidx/compose/ui/focus/FocusProperties;)V", "Lkotlin/jvm/functions/Function1;", "getFocusOrderReceiver", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOrderToProperties implements androidx.compose.ui.focus.FocusPropertiesScope {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusOrder, kotlin.Unit> focusOrderReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOrderToProperties(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusOrder, kotlin.Unit> function1) {
        this.focusOrderReceiver = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusOrder, kotlin.Unit> getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final void apply(androidx.compose.ui.focus.FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new androidx.compose.ui.focus.FocusOrder(focusProperties));
    }
}
