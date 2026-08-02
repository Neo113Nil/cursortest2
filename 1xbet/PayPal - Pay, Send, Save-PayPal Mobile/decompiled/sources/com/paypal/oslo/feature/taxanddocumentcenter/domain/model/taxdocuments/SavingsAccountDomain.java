package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsAccountDomain;", "", "", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "title", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsReportCardDomain;", "cards", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsAccountDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountNumber", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getTitle", "Ljava/util/List;", "getCards"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SavingsAccountDomain {
    public static final int $stable = 8;
    private final java.lang.String accountNumber;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain> cards;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title;

    public SavingsAccountDomain(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.accountNumber = str;
        this.title = taxReportTextResource;
        this.cards = list;
    }

    public /* synthetic */ SavingsAccountDomain(java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : taxReportTextResource, list);
    }

    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain> getCards() {
        return this.cards;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accountNumber;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.title;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain> list = this.cards;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountDomain(accountNumber=");
        sb.append(str);
        sb.append(", title=");
        sb.append(taxReportTextResource);
        sb.append(", cards=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.accountNumber.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.title;
        return (((hashCode * 31) + (taxReportTextResource == null ? 0 : taxReportTextResource.hashCode())) * 31) + this.cards.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain savingsAccountDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, savingsAccountDomain.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, savingsAccountDomain.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, savingsAccountDomain.cards);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain copy(java.lang.String accountNumber, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain> cards) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain(accountNumber, title, cards);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain> component3() {
        return this.cards;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain savingsAccountDomain, java.lang.String str, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountDomain.accountNumber;
        }
        if ((i & 2) != 0) {
            taxReportTextResource = savingsAccountDomain.title;
        }
        if ((i & 4) != 0) {
            list = savingsAccountDomain.cards;
        }
        return savingsAccountDomain.copy(str, taxReportTextResource, list);
    }
}
