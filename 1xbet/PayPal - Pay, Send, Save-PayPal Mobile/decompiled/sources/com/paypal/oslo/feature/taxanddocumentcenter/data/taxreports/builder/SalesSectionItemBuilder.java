package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesSectionItemBuilder;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/Sales1099KItemBuilder;", "sales1099KItemBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesTransactionStatementItemBuilder;", "salesTransactionStatementItemBuilder", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/GenericReportItemBuilder;", "genericReportItemBuilder", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/Sales1099KItemBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesTransactionStatementItemBuilder;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/GenericReportItemBuilder;)V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "report", "", "countryCode", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "buildItem", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/Sales1099KItemBuilder;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SalesTransactionStatementItemBuilder;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/GenericReportItemBuilder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SalesSectionItemBuilder {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SalesSectionItemBuilder(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder sales1099KItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder salesTransactionStatementItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder genericReportItemBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sales1099KItemBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(salesTransactionStatementItemBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericReportItemBuilder, "");
        this.Camera2StreamConfigurationMap = sales1099KItemBuilder;
        this.getHighSpeedVideoFpsRangesFor = salesTransactionStatementItemBuilder;
        this.getHighSpeedVideoSizes = genericReportItemBuilder;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain buildItem(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain report, java.lang.String countryCode, java.lang.String year) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(report, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        int i = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder.WhenMappings.$EnumSwitchMapping$0[report.getType().ordinal()];
        if (i == 1) {
            return this.Camera2StreamConfigurationMap.buildItem(report, countryCode, year);
        }
        if (i == 2) {
            return this.getHighSpeedVideoFpsRangesFor.buildItem(report, year);
        }
        if (i == 3) {
            return this.getHighSpeedVideoSizes.buildItem(report, countryCode, year, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES);
        }
        throw new java.lang.IllegalStateException("Unsupported report type for Sales section: ".concat(java.lang.String.valueOf(report.getType())).toString());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_TRANSACTIONS_STATEMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
