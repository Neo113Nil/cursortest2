package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "section", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "title", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "items", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "availabilityInfo", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;", "toolTipInfo", "", "hasSectionError", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/util/List;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;ZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "component5", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;", "component6", "()Z", "component7", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Ljava/util/List;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;ZLjava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "getSection", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getTitle", "Ljava/util/List;", "getItems", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "getAvailabilityInfo", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;", "getToolTipInfo", "Z", "getHasSectionError", "Ljava/lang/String;", "getYear"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TaxReportSectionDomain {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain availabilityInfo;
    private final boolean hasSectionError;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> items;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain toolTipInfo;
    private final java.lang.String year;

    public TaxReportSectionDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> list, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain sectionToolTipInfoDomain, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.section = taxReportSection;
        this.title = taxReportTextResource;
        this.items = list;
        this.availabilityInfo = sectionAvailabilityInfoDomain;
        this.toolTipInfo = sectionToolTipInfoDomain;
        this.hasSectionError = z;
        this.year = str;
    }

    public /* synthetic */ TaxReportSectionDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.util.List list, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain sectionToolTipInfoDomain, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(taxReportSection, taxReportTextResource, list, (i & 8) != 0 ? null : sectionAvailabilityInfoDomain, (i & 16) != 0 ? null : sectionToolTipInfoDomain, (i & 32) != 0 ? false : z, str);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSection() {
        return this.section;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> getItems() {
        return this.items;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain getAvailabilityInfo() {
        return this.availabilityInfo;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain getToolTipInfo() {
        return this.toolTipInfo;
    }

    public final boolean getHasSectionError() {
        return this.hasSectionError;
    }

    public final java.lang.String getYear() {
        return this.year;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection = this.section;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.title;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> list = this.items;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain = this.availabilityInfo;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain sectionToolTipInfoDomain = this.toolTipInfo;
        boolean z = this.hasSectionError;
        java.lang.String str = this.year;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxReportSectionDomain(section=");
        sb.append(taxReportSection);
        sb.append(", title=");
        sb.append(taxReportTextResource);
        sb.append(", items=");
        sb.append(list);
        sb.append(", availabilityInfo=");
        sb.append(sectionAvailabilityInfoDomain);
        sb.append(", toolTipInfo=");
        sb.append(sectionToolTipInfoDomain);
        sb.append(", hasSectionError=");
        sb.append(z);
        sb.append(", year=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.section.hashCode();
        int hashCode2 = this.title.hashCode();
        int hashCode3 = this.items.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain = this.availabilityInfo;
        int hashCode4 = sectionAvailabilityInfoDomain == null ? 0 : sectionAvailabilityInfoDomain.hashCode();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain sectionToolTipInfoDomain = this.toolTipInfo;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (sectionToolTipInfoDomain != null ? sectionToolTipInfoDomain.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.hasSectionError)) * 31) + this.year.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain taxReportSectionDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain) other;
        return this.section == taxReportSectionDomain.section && kotlin.jvm.internal.Intrinsics.areEqual(this.title, taxReportSectionDomain.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, taxReportSectionDomain.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.availabilityInfo, taxReportSectionDomain.availabilityInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.toolTipInfo, taxReportSectionDomain.toolTipInfo) && this.hasSectionError == taxReportSectionDomain.hasSectionError && kotlin.jvm.internal.Intrinsics.areEqual(this.year, taxReportSectionDomain.year);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> items, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain availabilityInfo, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain toolTipInfo, boolean hasSectionError, java.lang.String year) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain(section, title, items, availabilityInfo, toolTipInfo, hasSectionError, year);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getYear() {
        return this.year;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasSectionError() {
        return this.hasSectionError;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain getToolTipInfo() {
        return this.toolTipInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain getAvailabilityInfo() {
        return this.availabilityInfo;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> component3() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection getSection() {
        return this.section;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain taxReportSectionDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, java.util.List list, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain sectionToolTipInfoDomain, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportSection = taxReportSectionDomain.section;
        }
        if ((i & 2) != 0) {
            taxReportTextResource = taxReportSectionDomain.title;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource2 = taxReportTextResource;
        if ((i & 4) != 0) {
            list = taxReportSectionDomain.items;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            sectionAvailabilityInfoDomain = taxReportSectionDomain.availabilityInfo;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain2 = sectionAvailabilityInfoDomain;
        if ((i & 16) != 0) {
            sectionToolTipInfoDomain = taxReportSectionDomain.toolTipInfo;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain sectionToolTipInfoDomain2 = sectionToolTipInfoDomain;
        if ((i & 32) != 0) {
            z = taxReportSectionDomain.hasSectionError;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            str = taxReportSectionDomain.year;
        }
        return taxReportSectionDomain.copy(taxReportSection, taxReportTextResource2, list2, sectionAvailabilityInfoDomain2, sectionToolTipInfoDomain2, z2, str);
    }
}
