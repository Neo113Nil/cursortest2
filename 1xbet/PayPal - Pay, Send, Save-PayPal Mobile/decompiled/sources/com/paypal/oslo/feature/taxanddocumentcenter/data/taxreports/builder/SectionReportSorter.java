package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SectionReportSorter;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "section", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "reports", "sortReportsForSection", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;Ljava/util/List;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SectionReportSorter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SectionReportSorter() {
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> sortReportsForSection(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection section, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> reports) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reports, "");
        int i = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter.WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
        if (i == 1) {
            final java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K, 1), kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_TRANSACTIONS_STATEMENT, 2), kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K, 3));
            return kotlin.collections.CollectionsKt.sortedWith(reports, new java.util.Comparator() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter$sortSalesReports$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    java.lang.Integer num = (java.lang.Integer) mapOf.get(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) t).getType());
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                    java.lang.Integer num2 = (java.lang.Integer) mapOf.get(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) t2).getType());
                    return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
                }
            });
        }
        if (i != 2) {
            if (i != 3 || reports.size() <= 1 || reports.get(0).getType() != com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_MISC) {
                return reports;
            }
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) reports);
            mutableList.set(0, reports.get(1));
            mutableList.set(1, reports.get(0));
            return mutableList;
        }
        final java.util.Map mapOf2 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_DA, 1), kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_GAINS_LOSSES_STATEMENT, 2), kotlin.TuplesKt.to(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_TRANSACTIONS_STATEMENT, 3));
        return kotlin.collections.CollectionsKt.sortedWith(reports, new java.util.Comparator() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter$sortCryptoReports$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.lang.Integer num = (java.lang.Integer) mapOf2.get(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) t).getType());
                java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                java.lang.Integer num2 = (java.lang.Integer) mapOf2.get(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) t2).getType());
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            }
        });
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.GOODS_AND_SERVICES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection.REWARDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
