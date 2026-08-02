package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/usecase/TaxDocumentsUseCaseProvider;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetUserInfoUseCase;", "getUserInfo", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetYearDropdownDataUseCase;", "getYearDropdownData", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxDocumentsPageDataUseCase;", "getTaxDocumentsPageData", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxReportsUseCase;", "getTaxReports", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/CreateTaxReconciliationReportUseCase;", "createTaxReconciliationReport", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestTaxReportSelfCorrectionUseCase;", "requestTaxReportSelfCorrection", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetUserInfoUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetYearDropdownDataUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxDocumentsPageDataUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxReportsUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/CreateTaxReconciliationReportUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestTaxReportSelfCorrectionUseCase;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetUserInfoUseCase;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetYearDropdownDataUseCase;", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxDocumentsPageDataUseCase;", "component4", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxReportsUseCase;", "component5", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/CreateTaxReconciliationReportUseCase;", "component6", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestTaxReportSelfCorrectionUseCase;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetUserInfoUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetYearDropdownDataUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxDocumentsPageDataUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxReportsUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/CreateTaxReconciliationReportUseCase;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestTaxReportSelfCorrectionUseCase;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/usecase/TaxDocumentsUseCaseProvider;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetUserInfoUseCase;", "getGetUserInfo", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetYearDropdownDataUseCase;", "getGetYearDropdownData", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxDocumentsPageDataUseCase;", "getGetTaxDocumentsPageData", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/GetTaxReportsUseCase;", "getGetTaxReports", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/CreateTaxReconciliationReportUseCase;", "getCreateTaxReconciliationReport", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/RequestTaxReportSelfCorrectionUseCase;", "getRequestTaxReportSelfCorrection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TaxDocumentsUseCaseProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase createTaxReconciliationReport;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageData;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReports;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfo;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getYearDropdownData;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase requestTaxReportSelfCorrection;

    @javax.inject.Inject
    public TaxDocumentsUseCaseProvider(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfoUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getYearDropdownDataUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageDataUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReportsUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase createTaxReconciliationReportUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase requestTaxReportSelfCorrectionUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserInfoUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getYearDropdownDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxDocumentsPageDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxReportsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTaxReconciliationReportUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTaxReportSelfCorrectionUseCase, "");
        this.getUserInfo = getUserInfoUseCase;
        this.getYearDropdownData = getYearDropdownDataUseCase;
        this.getTaxDocumentsPageData = getTaxDocumentsPageDataUseCase;
        this.getTaxReports = getTaxReportsUseCase;
        this.createTaxReconciliationReport = createTaxReconciliationReportUseCase;
        this.requestTaxReportSelfCorrection = requestTaxReportSelfCorrectionUseCase;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getGetUserInfo() {
        return this.getUserInfo;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getGetYearDropdownData() {
        return this.getYearDropdownData;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getGetTaxDocumentsPageData() {
        return this.getTaxDocumentsPageData;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getGetTaxReports() {
        return this.getTaxReports;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase getCreateTaxReconciliationReport() {
        return this.createTaxReconciliationReport;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase getRequestTaxReportSelfCorrection() {
        return this.requestTaxReportSelfCorrection;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfoUseCase = this.getUserInfo;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getYearDropdownDataUseCase = this.getYearDropdownData;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageDataUseCase = this.getTaxDocumentsPageData;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReportsUseCase = this.getTaxReports;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase createTaxReconciliationReportUseCase = this.createTaxReconciliationReport;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase requestTaxReportSelfCorrectionUseCase = this.requestTaxReportSelfCorrection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxDocumentsUseCaseProvider(getUserInfo=");
        sb.append(getUserInfoUseCase);
        sb.append(", getYearDropdownData=");
        sb.append(getYearDropdownDataUseCase);
        sb.append(", getTaxDocumentsPageData=");
        sb.append(getTaxDocumentsPageDataUseCase);
        sb.append(", getTaxReports=");
        sb.append(getTaxReportsUseCase);
        sb.append(", createTaxReconciliationReport=");
        sb.append(createTaxReconciliationReportUseCase);
        sb.append(", requestTaxReportSelfCorrection=");
        sb.append(requestTaxReportSelfCorrectionUseCase);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.getUserInfo.hashCode() * 31) + this.getYearDropdownData.hashCode()) * 31) + this.getTaxDocumentsPageData.hashCode()) * 31) + this.getTaxReports.hashCode()) * 31) + this.createTaxReconciliationReport.hashCode()) * 31) + this.requestTaxReportSelfCorrection.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getUserInfo, taxDocumentsUseCaseProvider.getUserInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.getYearDropdownData, taxDocumentsUseCaseProvider.getYearDropdownData) && kotlin.jvm.internal.Intrinsics.areEqual(this.getTaxDocumentsPageData, taxDocumentsUseCaseProvider.getTaxDocumentsPageData) && kotlin.jvm.internal.Intrinsics.areEqual(this.getTaxReports, taxDocumentsUseCaseProvider.getTaxReports) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTaxReconciliationReport, taxDocumentsUseCaseProvider.createTaxReconciliationReport) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestTaxReportSelfCorrection, taxDocumentsUseCaseProvider.requestTaxReportSelfCorrection);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfo, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getYearDropdownData, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageData, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReports, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase createTaxReconciliationReport, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase requestTaxReportSelfCorrection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getYearDropdownData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxDocumentsPageData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxReports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTaxReconciliationReport, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTaxReportSelfCorrection, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider(getUserInfo, getYearDropdownData, getTaxDocumentsPageData, getTaxReports, createTaxReconciliationReport, requestTaxReportSelfCorrection);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase getRequestTaxReportSelfCorrection() {
        return this.requestTaxReportSelfCorrection;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase getCreateTaxReconciliationReport() {
        return this.createTaxReconciliationReport;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getGetTaxReports() {
        return this.getTaxReports;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getGetTaxDocumentsPageData() {
        return this.getTaxDocumentsPageData;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getGetYearDropdownData() {
        return this.getYearDropdownData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getGetUserInfo() {
        return this.getUserInfo;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase getUserInfoUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getYearDropdownDataUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageDataUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReportsUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase createTaxReconciliationReportUseCase, com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase requestTaxReportSelfCorrectionUseCase, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            getUserInfoUseCase = taxDocumentsUseCaseProvider.getUserInfo;
        }
        if ((i & 2) != 0) {
            getYearDropdownDataUseCase = taxDocumentsUseCaseProvider.getYearDropdownData;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase getYearDropdownDataUseCase2 = getYearDropdownDataUseCase;
        if ((i & 4) != 0) {
            getTaxDocumentsPageDataUseCase = taxDocumentsUseCaseProvider.getTaxDocumentsPageData;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase getTaxDocumentsPageDataUseCase2 = getTaxDocumentsPageDataUseCase;
        if ((i & 8) != 0) {
            getTaxReportsUseCase = taxDocumentsUseCaseProvider.getTaxReports;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase getTaxReportsUseCase2 = getTaxReportsUseCase;
        if ((i & 16) != 0) {
            createTaxReconciliationReportUseCase = taxDocumentsUseCaseProvider.createTaxReconciliationReport;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase createTaxReconciliationReportUseCase2 = createTaxReconciliationReportUseCase;
        if ((i & 32) != 0) {
            requestTaxReportSelfCorrectionUseCase = taxDocumentsUseCaseProvider.requestTaxReportSelfCorrection;
        }
        return taxDocumentsUseCaseProvider.copy(getUserInfoUseCase, getYearDropdownDataUseCase2, getTaxDocumentsPageDataUseCase2, getTaxReportsUseCase2, createTaxReconciliationReportUseCase2, requestTaxReportSelfCorrectionUseCase);
    }
}
