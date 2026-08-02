package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ@\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/CustomStatementOptionsDomain;", "", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeOption;", "transactionTypes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/DateFilterOption;", "dateFilters", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/FormatOption;", "formats", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/CustomStatementOptionsDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTransactionTypes", "getDateFilters", "getFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CustomStatementOptionsDomain {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption> dateFilters;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption> formats;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption> transactionTypes;

    public CustomStatementOptionsDomain(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption> list, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption> list2, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.transactionTypes = list;
        this.dateFilters = list2;
        this.formats = list3;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption> getTransactionTypes() {
        return this.transactionTypes;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption> getDateFilters() {
        return this.dateFilters;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption> getFormats() {
        return this.formats;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption> list = this.transactionTypes;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption> list2 = this.dateFilters;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption> list3 = this.formats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomStatementOptionsDomain(transactionTypes=");
        sb.append(list);
        sb.append(", dateFilters=");
        sb.append(list2);
        sb.append(", formats=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.transactionTypes.hashCode() * 31) + this.dateFilters.hashCode()) * 31) + this.formats.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain customStatementOptionsDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTypes, customStatementOptionsDomain.transactionTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateFilters, customStatementOptionsDomain.dateFilters) && kotlin.jvm.internal.Intrinsics.areEqual(this.formats, customStatementOptionsDomain.formats);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain copy(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption> transactionTypes, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption> dateFilters, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption> formats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFilters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formats, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain(transactionTypes, dateFilters, formats);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.FormatOption> component3() {
        return this.formats;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterOption> component2() {
        return this.dateFilters;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption> component1() {
        return this.transactionTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.CustomStatementOptionsDomain customStatementOptionsDomain, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = customStatementOptionsDomain.transactionTypes;
        }
        if ((i & 2) != 0) {
            list2 = customStatementOptionsDomain.dateFilters;
        }
        if ((i & 4) != 0) {
            list3 = customStatementOptionsDomain.formats;
        }
        return customStatementOptionsDomain.copy(list, list2, list3);
    }
}
