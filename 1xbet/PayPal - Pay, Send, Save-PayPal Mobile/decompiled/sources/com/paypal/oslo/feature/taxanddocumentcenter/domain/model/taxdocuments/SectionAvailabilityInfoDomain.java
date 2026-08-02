package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "experienceType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "message", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "getExperienceType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SectionAvailabilityInfoDomain {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource message;

    public SectionAvailabilityInfoDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        this.experienceType = experienceType;
        this.message = taxReportTextResource;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType getExperienceType() {
        return this.experienceType;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getMessage() {
        return this.message;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType = this.experienceType;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionAvailabilityInfoDomain(experienceType=");
        sb.append(experienceType);
        sb.append(", message=");
        sb.append(taxReportTextResource);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.experienceType.hashCode() * 31) + this.message.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain) other;
        return this.experienceType == sectionAvailabilityInfoDomain.experienceType && kotlin.jvm.internal.Intrinsics.areEqual(this.message, sectionAvailabilityInfoDomain.message);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain(experienceType, message);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType getExperienceType() {
        return this.experienceType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            experienceType = sectionAvailabilityInfoDomain.experienceType;
        }
        if ((i & 2) != 0) {
            taxReportTextResource = sectionAvailabilityInfoDomain.message;
        }
        return sectionAvailabilityInfoDomain.copy(experienceType, taxReportTextResource);
    }
}
