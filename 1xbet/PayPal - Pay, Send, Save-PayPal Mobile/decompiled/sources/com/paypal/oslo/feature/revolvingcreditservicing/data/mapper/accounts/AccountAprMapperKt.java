package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;", "toAccountAPRs", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountAPRs;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountAprMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs toAccountAPRs(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType aprType;
        com.paypal.oslo.api.graphql.schema.type.CreditAPRType aprType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType aprType3;
        com.paypal.oslo.api.graphql.schema.type.CreditAPRType aprType4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAccountFragment, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.CashAdvanceApr cashAdvanceApr = revolvingCreditAccountFragment.getCashAdvanceApr();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType aprType5 = null;
        java.lang.String valueOf = java.lang.String.valueOf(cashAdvanceApr != null ? cashAdvanceApr.getApr() : null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.CashAdvanceApr cashAdvanceApr2 = revolvingCreditAccountFragment.getCashAdvanceApr();
        if (cashAdvanceApr2 == null || (aprType4 = cashAdvanceApr2.getAprType()) == null) {
            aprType = null;
        } else {
            int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountAprMapperKt.WhenMappings.$EnumSwitchMapping$0[aprType4.ordinal()];
            if (i == 1) {
                aprType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType.FIXED;
            } else if (i == 2) {
                aprType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType.VARIABLE;
            } else {
                aprType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType.UNKNOWN;
            }
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Apr apr = revolvingCreditAccountFragment.getApr();
        java.lang.String valueOf2 = java.lang.String.valueOf(apr != null ? apr.getApr() : null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Apr apr2 = revolvingCreditAccountFragment.getApr();
        if (apr2 != null && (aprType2 = apr2.getAprType()) != null) {
            int i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountAprMapperKt.WhenMappings.$EnumSwitchMapping$0[aprType2.ordinal()];
            if (i2 == 1) {
                aprType3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType.FIXED;
            } else if (i2 == 2) {
                aprType3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType.VARIABLE;
            } else {
                aprType3 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AprType.UNKNOWN;
            }
            aprType5 = aprType3;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs(valueOf, aprType, valueOf2, aprType5);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CreditAPRType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CreditAPRType.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CreditAPRType.VARIABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
