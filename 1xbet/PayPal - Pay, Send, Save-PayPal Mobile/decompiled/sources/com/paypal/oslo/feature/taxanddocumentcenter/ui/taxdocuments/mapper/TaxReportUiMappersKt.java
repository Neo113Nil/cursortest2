package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mapper;

@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0004\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\n\u001a)\u0010\u0004\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000f\u001a\u0019\u0010\u0004\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0012\u001a!\u0010\u0004\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\u0015\u001a!\u0010\u0004\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\u0018\u001a\u0019\u0010\u0004\u001a\u00020\u001a*\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u001b\u001a\u0011\u0010\u0004\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u0004\u0010\u001e\u001a\u0019\u0010\u0004\u001a\u00020 *\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010!\u001a\u0011\u0010\u0004\u001a\u00020#*\u00020\"¢\u0006\u0004\b\u0004\u0010$\u001a\u0019\u0010\u0004\u001a\u00020&*\u00020%2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010'\u001a\u0019\u0010\u0004\u001a\u00020)*\u00020(2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010*\u001a\u0019\u0010\u0004\u001a\u00020,*\u00020+2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010-\u001a\u0019\u0010\u0004\u001a\u00020/*\u00020.2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u00100\u001a\u0019\u0010\u0004\u001a\u000202*\u0002012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u00103"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportSection;", "toUiModel", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSectionDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportSection;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReport;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;Landroid/content/Context;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReport;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportNoteDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportNote;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportNoteDomain;Landroid/content/Context;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportNote;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportLinkDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportLink;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportLinkDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportLink;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionAvailabilityMessage;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionAvailabilityInfoDomain;Landroid/content/Context;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionAvailabilityMessage;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionToolTipInfo;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SectionToolTipInfoDomain;Landroid/content/Context;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SectionMessage$SectionToolTipInfo;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCtaDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/TaxReportCta;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/LinkDescriptionDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/LinkDescription;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/LinkDescriptionDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/LinkDescription;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SheetDataDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SheetDataDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SheetData;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/IconDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/Icon;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/IconDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/Icon;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ButtonDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/Button;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ButtonDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/Button;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/MultiSavingsSheetDataDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/MultiSavingsSheetDataDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsAccountDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SavingsAccount;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsAccountDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SavingsAccount;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsReportCardDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SavingsReportCard;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SavingsReportCardDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SavingsReportCard;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportBadgeDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportBadge;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ReportBadgeDomain;Landroid/content/Context;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/ReportBadge;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportUiMappersKt {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSectionDomain taxReportSectionDomain, android.content.Context context) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError sectionError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSectionDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section = taxReportSectionDomain.getSection();
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(taxReportSectionDomain.getTitle(), context);
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> items = taxReportSectionDomain.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain) it.next(), context, taxReportSectionDomain.getSection()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.String year = taxReportSectionDomain.getYear();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain availabilityInfo = taxReportSectionDomain.getAvailabilityInfo();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage uiModel = availabilityInfo != null ? toUiModel(availabilityInfo, context, taxReportSectionDomain.getSection()) : null;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain toolTipInfo = taxReportSectionDomain.getToolTipInfo();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo uiModel2 = toolTipInfo != null ? toUiModel(toolTipInfo, context, taxReportSectionDomain.getSection()) : null;
        if (taxReportSectionDomain.getHasSectionError()) {
            java.lang.String string = context.getString(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_error_message);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            sectionError = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionError(string, taxReportSectionDomain.getSection());
        } else {
            sectionError = null;
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportSection(section, uiString, uiModel, arrayList2, year, uiModel2, sectionError);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain taxReportItemDomain, android.content.Context context, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportItemDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain type = taxReportItemDomain.getReport().getType();
        java.lang.String id = taxReportItemDomain.getReport().getId();
        java.lang.String str = id == null ? "" : id;
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(taxReportItemDomain.getTitle(), context);
        java.lang.String uiString2 = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(taxReportItemDomain.getDescription(), context);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain outlineNote = taxReportItemDomain.getOutlineNote();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote uiModel = outlineNote != null ? toUiModel(outlineNote, context, taxReportSection, taxReportItemDomain.getReport().getType()) : null;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain inlineNote = taxReportItemDomain.getInlineNote();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote uiModel2 = inlineNote != null ? toUiModel(inlineNote, context, taxReportSection, taxReportItemDomain.getReport().getType()) : null;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain actionLink = taxReportItemDomain.getActionLink();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink uiModel3 = actionLink != null ? toUiModel(actionLink, context) : null;
        java.lang.String downloadId = taxReportItemDomain.getReport().getDownloadId();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus reportStatus = taxReportItemDomain.getReport().getReportStatus();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta = taxReportItemDomain.getReport().getCta();
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReport(type, str, uiString, uiString2, uiModel, uiModel2, uiModel3, downloadId, reportStatus, cta != null ? toUiModel(cta, context) : null);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportNoteDomain reportNoteDomain, android.content.Context context, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportNoteDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTypeDomain, "");
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(reportNoteDomain.getTitle(), context);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource toastMessage = reportNoteDomain.getToastMessage();
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportNote(uiString, taxReportSection, taxReportTypeDomain, toastMessage != null ? com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(toastMessage, context) : null);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportLinkDomain reportLinkDomain, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportLinkDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(reportLinkDomain.getText(), context);
        java.lang.String url = reportLinkDomain.getUrl();
        java.lang.String method = reportLinkDomain.getMethod();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta = reportLinkDomain.getCta();
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportLink(uiString, url, method, cta != null ? toUiModel(cta, context) : null);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionAvailabilityInfoDomain sectionAvailabilityInfoDomain, android.content.Context context, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionAvailabilityInfoDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionAvailabilityMessage(com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(sectionAvailabilityInfoDomain.getMessage(), context), taxReportSection, sectionAvailabilityInfoDomain.getExperienceType());
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SectionToolTipInfoDomain sectionToolTipInfoDomain, android.content.Context context, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection taxReportSection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionToolTipInfoDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportSection, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SectionMessage.SectionToolTipInfo(com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(sectionToolTipInfoDomain.getMessage(), context), taxReportSection);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain taxReportCtaDomain, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportCtaDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain type = taxReportCtaDomain.getType();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain linkName = taxReportCtaDomain.getLinkName();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain linkDescription = taxReportCtaDomain.getLinkDescription();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.LinkDescription uiModel = linkDescription != null ? toUiModel(linkDescription) : null;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain sheetType = taxReportCtaDomain.getSheetType();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetDataDomain sheetData = taxReportCtaDomain.getSheetData();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData uiModel2 = sheetData != null ? toUiModel(sheetData, context) : null;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain multiSavingsSheetData = taxReportCtaDomain.getMultiSavingsSheetData();
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.TaxReportCta(type, linkName, uiModel, sheetType, uiModel2, multiSavingsSheetData != null ? toUiModel(multiSavingsSheetData, context) : null);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.LinkDescription toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkDescriptionDomain linkDescriptionDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkDescriptionDomain, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.LinkDescription(linkDescriptionDomain.getHref(), linkDescriptionDomain.getMethod());
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetDataDomain sheetDataDomain, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetDataDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(sheetDataDomain.getTitle(), context);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.IconDomain icon = sheetDataDomain.getIcon();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Icon uiModel = icon != null ? toUiModel(icon) : null;
        java.lang.String uiString2 = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(sheetDataDomain.getDescription(), context);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain primaryCta = sheetDataDomain.getPrimaryCta();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button uiModel2 = primaryCta != null ? toUiModel(primaryCta, context) : null;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain secondaryCta = sheetDataDomain.getSecondaryCta();
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData(uiString, uiModel, uiString2, uiModel2, secondaryCta != null ? toUiModel(secondaryCta, context) : null);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Icon toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.IconDomain iconDomain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconDomain, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Icon(iconDomain.getUrl(), iconDomain.getAltText());
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ButtonDomain buttonDomain, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(buttonDomain.getTitle(), context);
        java.lang.String color = buttonDomain.getColor();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta = buttonDomain.getCta();
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.Button(uiString, color, cta != null ? toUiModel(cta, context) : null);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain multiSavingsSheetDataDomain, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiSavingsSheetDataDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(multiSavingsSheetDataDomain.getTitle(), context);
        java.lang.String uiString2 = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(multiSavingsSheetDataDomain.getDescription(), context);
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain> savingsAccounts = multiSavingsSheetDataDomain.getSavingsAccounts();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(savingsAccounts, 10));
        java.util.Iterator<T> it = savingsAccounts.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain) it.next(), context));
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData(uiString, uiString2, arrayList);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsAccount toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain savingsAccountDomain, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String accountNumber = savingsAccountDomain.getAccountNumber();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource title = savingsAccountDomain.getTitle();
        java.lang.String uiString = title != null ? com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(title, context) : null;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain> cards = savingsAccountDomain.getCards();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(cards, 10));
        java.util.Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain) it.next(), context));
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsAccount(accountNumber, uiString, arrayList);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain savingsReportCardDomain, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsReportCardDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(savingsReportCardDomain.getTitle(), context);
        java.lang.String uiString2 = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(savingsReportCardDomain.getDescription(), context);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain badge = savingsReportCardDomain.getBadge();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge uiModel = badge != null ? toUiModel(badge, context) : null;
        java.lang.String downloadId = savingsReportCardDomain.getReport().getDownloadId();
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain cta = savingsReportCardDomain.getReport().getCta();
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard(uiString, uiString2, uiModel, downloadId, cta != null ? toUiModel(cta, context) : null);
    }

    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge toUiModel(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain reportBadgeDomain, android.content.Context context) {
        com.paypal.pds.components.BadgeStyle.Info info;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportBadgeDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String uiString = com.paypal.oslo.feature.taxanddocumentcenter.ui.util.TaxReportTextResourceExtensionsKt.toUiString(reportBadgeDomain.getLabel(), context);
        int i = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mapper.TaxReportUiMappersKt.WhenMappings.$EnumSwitchMapping$0[reportBadgeDomain.getType().ordinal()];
        if (i == 1) {
            info = com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            info = com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE;
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge(uiString, info);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType.FEATURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType.NEUTRAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
