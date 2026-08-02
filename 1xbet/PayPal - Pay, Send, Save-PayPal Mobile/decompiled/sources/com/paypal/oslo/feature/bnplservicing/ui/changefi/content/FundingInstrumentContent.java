package com.paypal.oslo.feature.bnplservicing.ui.changefi.content;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/content/FundingInstrumentContent;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fi", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "formattedBalance", "subtitle", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "linkACard", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getLinkACard", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "linkACreditCard", "getLinkACreditCard", "linkADebitCard", "getLinkADebitCard", "linkABankAccount", "getLinkABankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentContent {
    public static final int $stable;
    private final com.paypal.oslo.core.commonui.utils.RefText linkACard = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_link_a_card, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText linkACreditCard = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_link_a_credit_card, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText linkADebitCard = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_link_a_debit_card, new java.lang.Object[0]);
    private final com.paypal.oslo.core.commonui.utils.RefText linkABankAccount = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_link_a_bank_account, new java.lang.Object[0]);

    public final com.paypal.oslo.core.commonui.utils.RefText getLinkACard() {
        return this.linkACard;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLinkACreditCard() {
        return this.linkACreditCard;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLinkADebitCard() {
        return this.linkADebitCard;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getLinkABankAccount() {
        return this.linkABankAccount;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText title(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fi, "");
        if (fi instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_paypal_balance, new java.lang.Object[0]);
        }
        if (fi instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount) fi).getName());
        }
        if (fi instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount) fi).getName());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ com.paypal.oslo.core.commonui.utils.RefText subtitle$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.content.FundingInstrumentContent fundingInstrumentContent, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return fundingInstrumentContent.subtitle(fundingInstrument, str);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText subtitle(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fi, java.lang.String formattedBalance) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fi, "");
        if (fi instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) {
            if (formattedBalance == null) {
                formattedBalance = "";
            }
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(formattedBalance);
        }
        if (fi instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount) {
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount bankAccount = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount) fi;
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType type = bankAccount.getType();
            java.lang.String displayName = type != null ? type.getDisplayName() : null;
            if (displayName == null) {
                displayName = "";
            }
            java.lang.String lastNChars = bankAccount.getLastNChars();
            str = lastNChars != null ? lastNChars : "";
            if (displayName.length() > 0 && str.length() > 0) {
                return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_method_description, displayName, str);
            }
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(displayName);
        }
        if (!(fi instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount cardAccount = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount) fi;
        com.paypal.oslo.core.commonui.utils.RefText access$toStringRef = com.paypal.oslo.feature.bnplservicing.ui.changefi.content.FundingInstrumentContentKt.access$toStringRef(cardAccount.getProductType());
        java.lang.String lastNChars2 = cardAccount.getLastNChars();
        str = lastNChars2 != null ? lastNChars2 : "";
        return str.length() > 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_payment_method_description, access$toStringRef, str) : access$toStringRef;
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
