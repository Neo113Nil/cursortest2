package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/ui/PhoneNumberHintLauncherState;", "", "<init>", "()V", "", "markHintRequested", "", "<set-?>", "hasRequestedHint$delegate", "Landroidx/compose/runtime/MutableState;", "getHasRequestedHint", "()Z", "setHasRequestedHint", "(Z)V", "hasRequestedHint"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneNumberHintLauncherState {
    public static final int $stable = 0;

    /* renamed from: hasRequestedHint$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState hasRequestedHint = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    private final void setHasRequestedHint(boolean z) {
        this.hasRequestedHint.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasRequestedHint() {
        return ((java.lang.Boolean) this.hasRequestedHint.getValue()).booleanValue();
    }

    public final void markHintRequested() {
        setHasRequestedHint(true);
    }
}
