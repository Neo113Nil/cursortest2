package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenArgs;", "args", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenArgs;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ThreeDsInitScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState> getUiState();

    public abstract void initialize(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs args);
}
