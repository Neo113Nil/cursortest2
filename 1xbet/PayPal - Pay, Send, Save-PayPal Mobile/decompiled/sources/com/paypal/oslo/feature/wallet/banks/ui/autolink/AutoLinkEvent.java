package com.paypal.oslo.feature.wallet.banks.ui.autolink;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent;", "", "Outcome", "Success", "Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent$Outcome;", "Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AutoLinkEvent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent$Outcome;", "Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent$Outcome;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "getOutcome"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Outcome implements com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome;

        public Outcome(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
            this.outcome = outcome;
        }

        public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome getOutcome() {
            return this.outcome;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome = this.outcome;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Outcome(outcome=");
            sb.append(outcome);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.outcome.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome) other).outcome);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome copy(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome(outcome);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome getOutcome() {
            return this.outcome;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome copy$default(com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome outcome, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                outcome2 = outcome.outcome;
            }
            return outcome.copy(outcome2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JD\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "linkedBankAccounts", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "failedBankAccounts", "", "bankName", "bankLogo", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getLinkedBankAccounts", "getFailedBankAccounts", "Ljava/lang/String;", "getBankName", "getBankLogo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent {
        public static final int $stable = 8;
        private final java.lang.String bankLogo;
        private final java.lang.String bankName;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedBankAccounts;
        private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedBankAccounts;

        public Success(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.linkedBankAccounts = list;
            this.failedBankAccounts = list2;
            this.bankName = str;
            this.bankLogo = str2;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> getLinkedBankAccounts() {
            return this.linkedBankAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> getFailedBankAccounts() {
            return this.failedBankAccounts;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String getBankLogo() {
            return this.bankLogo;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list = this.linkedBankAccounts;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2 = this.failedBankAccounts;
            java.lang.String str = this.bankName;
            java.lang.String str2 = this.bankLogo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(linkedBankAccounts=");
            sb.append(list);
            sb.append(", failedBankAccounts=");
            sb.append(list2);
            sb.append(", bankName=");
            sb.append(str);
            sb.append(", bankLogo=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.linkedBankAccounts.hashCode() * 31) + this.failedBankAccounts.hashCode()) * 31) + this.bankName.hashCode()) * 31) + this.bankLogo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success success = (com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedBankAccounts, success.linkedBankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedBankAccounts, success.failedBankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, success.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogo, success.bankLogo);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success copy(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedBankAccounts, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedBankAccounts, java.lang.String bankName, java.lang.String bankLogo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedBankAccounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedBankAccounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankLogo, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success(linkedBankAccounts, failedBankAccounts, bankName, bankLogo);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBankLogo() {
            return this.bankLogo;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> component2() {
            return this.failedBankAccounts;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> component1() {
            return this.linkedBankAccounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success copy$default(com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Success success, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.linkedBankAccounts;
            }
            if ((i & 2) != 0) {
                list2 = success.failedBankAccounts;
            }
            if ((i & 4) != 0) {
                str = success.bankName;
            }
            if ((i & 8) != 0) {
                str2 = success.bankLogo;
            }
            return success.copy(list, list2, str, str2);
        }
    }
}
