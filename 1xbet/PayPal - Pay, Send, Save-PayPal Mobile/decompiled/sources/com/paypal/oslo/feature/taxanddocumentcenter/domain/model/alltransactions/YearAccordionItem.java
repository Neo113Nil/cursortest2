package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/YearAccordionItem;", "", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/MonthItem;", "months", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "", "downloadAllUrl", "<init>", "(ILjava/util/List;ZLjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "()Ljava/lang/String;", "copy", "(ILjava/util/List;ZLjava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/YearAccordionItem;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getYear", "Ljava/util/List;", "getMonths", "Z", "Ljava/lang/String;", "getDownloadAllUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class YearAccordionItem {
    public static final int $stable = 8;
    private final java.lang.String downloadAllUrl;
    private final boolean isExpanded;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> months;
    private final int year;

    public YearAccordionItem(int i, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> list, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.year = i;
        this.months = list;
        this.isExpanded = z;
        this.downloadAllUrl = str;
    }

    public /* synthetic */ YearAccordionItem(int i, java.util.List list, boolean z, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, (i2 & 8) != 0 ? null : str);
    }

    public final int getYear() {
        return this.year;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> getMonths() {
        return this.months;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final java.lang.String getDownloadAllUrl() {
        return this.downloadAllUrl;
    }

    public final java.lang.String toString() {
        int i = this.year;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> list = this.months;
        boolean z = this.isExpanded;
        java.lang.String str = this.downloadAllUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("YearAccordionItem(year=");
        sb.append(i);
        sb.append(", months=");
        sb.append(list);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(", downloadAllUrl=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.year);
        int hashCode2 = this.months.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isExpanded);
        java.lang.String str = this.downloadAllUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem) other;
        return this.year == yearAccordionItem.year && kotlin.jvm.internal.Intrinsics.areEqual(this.months, yearAccordionItem.months) && this.isExpanded == yearAccordionItem.isExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadAllUrl, yearAccordionItem.downloadAllUrl);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem copy(int year, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> months, boolean isExpanded, java.lang.String downloadAllUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(months, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem(year, months, isExpanded, downloadAllUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDownloadAllUrl() {
        return this.downloadAllUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> component2() {
        return this.months;
    }

    /* renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem yearAccordionItem, int i, java.util.List list, boolean z, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = yearAccordionItem.year;
        }
        if ((i2 & 2) != 0) {
            list = yearAccordionItem.months;
        }
        if ((i2 & 4) != 0) {
            z = yearAccordionItem.isExpanded;
        }
        if ((i2 & 8) != 0) {
            str = yearAccordionItem.downloadAllUrl;
        }
        return yearAccordionItem.copy(i, list, z, str);
    }
}
