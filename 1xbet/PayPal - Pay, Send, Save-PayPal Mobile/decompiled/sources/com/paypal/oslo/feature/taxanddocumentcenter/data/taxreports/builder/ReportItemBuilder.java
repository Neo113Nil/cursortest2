package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/ReportItemBuilder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "type", "", "isDownloadable", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;", "experienceType", "", "availabilityDate", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "getDescriptionResource", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;ZLcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ExperienceType;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportNoteDomain;", "buildNotAvailableInlineNote", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportNoteDomain;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReportItemBuilder {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReportItemBuilder() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getDescriptionResource$default(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder reportItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain, boolean z, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return reportItemBuilder.getDescriptionResource(taxReportTypeDomain, z, experienceType, str);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource getDescriptionResource(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain type, boolean isDownloadable, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType experienceType, java.lang.String availabilityDate) {
        java.lang.String experienceBasedDescriptionResourceKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceType, "");
        if (!isDownloadable && (experienceBasedDescriptionResourceKey = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toExperienceBasedDescriptionResourceKey(type, experienceType)) != null) {
            if (experienceType == com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ExperienceType.NOT_AVAILABLE && availabilityDate != null) {
                return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(experienceBasedDescriptionResourceKey, kotlin.collections.CollectionsKt.listOf(availabilityDate));
            }
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(experienceBasedDescriptionResourceKey, null, 2, null);
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toDescriptionResourceKey(type), null, 2, null);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain buildNotAvailableInlineNote() {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toNotAvailableInlineNoteKey(), null, 2, null), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toNotAvailableToastMessageKey(), null, 2, null), null, 4, null);
    }
}
