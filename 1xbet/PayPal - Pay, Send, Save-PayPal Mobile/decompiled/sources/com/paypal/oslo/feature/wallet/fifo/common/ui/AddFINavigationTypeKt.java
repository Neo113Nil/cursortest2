package com.paypal.oslo.feature.wallet.fifo.common.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "", "getButtonTextRes", "(Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;)I", "buttonTextRes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddFINavigationTypeKt {
    public static final int getButtonTextRes(com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlowType, "");
        int i = com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationTypeKt.WhenMappings.$EnumSwitchMapping$0[addFIFlowType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_bank_or_debit_card;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_review_add_bank;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_review_add_debit_card;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
