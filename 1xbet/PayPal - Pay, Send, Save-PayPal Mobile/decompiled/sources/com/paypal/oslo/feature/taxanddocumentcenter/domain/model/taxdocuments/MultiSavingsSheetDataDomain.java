package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/MultiSavingsSheetDataDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsAccountDomain;", "savingsAccounts", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "component2", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/MultiSavingsSheetDataDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getTitle", "getDescription", "Ljava/util/List;", "getSavingsAccounts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MultiSavingsSheetDataDomain {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource description;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain> savingsAccounts;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title;

    public MultiSavingsSheetDataDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.title = taxReportTextResource;
        this.description = taxReportTextResource2;
        this.savingsAccounts = list;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getDescription() {
        return this.description;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain> getSavingsAccounts() {
        return this.savingsAccounts;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.title;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2 = this.description;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain> list = this.savingsAccounts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiSavingsSheetDataDomain(title=");
        sb.append(taxReportTextResource);
        sb.append(", description=");
        sb.append(taxReportTextResource2);
        sb.append(", savingsAccounts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.savingsAccounts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain multiSavingsSheetDataDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, multiSavingsSheetDataDomain.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, multiSavingsSheetDataDomain.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccounts, multiSavingsSheetDataDomain.savingsAccounts);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource description, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain> savingsAccounts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccounts, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain(title, description, savingsAccounts);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain> component3() {
        return this.savingsAccounts;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain multiSavingsSheetDataDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportTextResource = multiSavingsSheetDataDomain.title;
        }
        if ((i & 2) != 0) {
            taxReportTextResource2 = multiSavingsSheetDataDomain.description;
        }
        if ((i & 4) != 0) {
            list = multiSavingsSheetDataDomain.savingsAccounts;
        }
        return multiSavingsSheetDataDomain.copy(taxReportTextResource, taxReportTextResource2, list);
    }
}
