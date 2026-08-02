package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "", "toToolbarTitle", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)I"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ToolbarTitleMapperKt {
    public static final int toToolbarTitle(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        if (creditProductIdentifier != null && com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.ToolbarTitleMapperKt.WhenMappings.$EnumSwitchMapping$0[creditProductIdentifier.ordinal()] == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_title_cbmc;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_title_ppccus;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
