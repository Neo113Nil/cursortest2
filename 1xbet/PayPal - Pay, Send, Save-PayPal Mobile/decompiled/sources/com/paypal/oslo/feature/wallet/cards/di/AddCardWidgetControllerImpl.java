package com.paypal.oslo.feature.wallet.cards.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/di/AddCardWidgetControllerImpl;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/provider/AddCardWidgetController;", "<init>", "()V", "", "startFlow", "", "navigateBack", "()Z", "Lkotlin/Function0;", "onStart", "Lkotlin/jvm/functions/Function0;", "getOnStart$wallet_prodRelease", "()Lkotlin/jvm/functions/Function0;", "setOnStart$wallet_prodRelease", "(Lkotlin/jvm/functions/Function0;)V", "onBack", "getOnBack$wallet_prodRelease", "setOnBack$wallet_prodRelease", "<set-?>", "canGoBack$delegate", "Landroidx/compose/runtime/MutableState;", "getCanGoBack$wallet_prodRelease", "setCanGoBack$wallet_prodRelease", "(Z)V", "canGoBack", "getCanNavigateBack", "canNavigateBack"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardWidgetControllerImpl implements com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController {
    public static final int $stable = 8;

    /* renamed from: canGoBack$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState canGoBack = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    private kotlin.jvm.functions.Function0<java.lang.Boolean> onBack;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onStart;

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnStart$wallet_prodRelease() {
        return this.onStart;
    }

    public final void setOnStart$wallet_prodRelease(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onStart = function0;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getOnBack$wallet_prodRelease() {
        return this.onBack;
    }

    public final void setOnBack$wallet_prodRelease(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.onBack = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getCanGoBack$wallet_prodRelease() {
        return ((java.lang.Boolean) this.canGoBack.getValue()).booleanValue();
    }

    public final void setCanGoBack$wallet_prodRelease(boolean z) {
        this.canGoBack.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController
    public final void startFlow() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onStart;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController
    public final boolean navigateBack() {
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = this.onBack;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return false;
    }

    @Override // com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController
    public final boolean getCanNavigateBack() {
        return getCanGoBack$wallet_prodRelease();
    }
}
