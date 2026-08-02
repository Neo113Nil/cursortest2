package com.paypal.oslo.feature.moneymovement.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/di/TransferScreenComponentsModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/TransferScreenComponentsImpl;", "impl", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "bindTransferScreenComponents", "(Lcom/paypal/oslo/feature/moneymovement/ui/transfer/TransferScreenComponentsImpl;)Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public abstract class TransferScreenComponentsModule {
    public static final int $stable = 0;

    @dagger.Binds
    public abstract com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents bindTransferScreenComponents(com.paypal.oslo.feature.moneymovement.ui.transfer.TransferScreenComponentsImpl impl);
}
