package com.paypal.oslo.feature.taxanddocumentcenter.domain.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/util/FiscalYearUtils;", "", "<init>", "()V", "", "baseYear", "", "parseBaseYear", "(Ljava/lang/String;)I", "Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;", "countryConfig", "getCurrentFinancialYear", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)I", "currentFinancialYear", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxYear;", "generateYearList", "(IILcom/paypal/oslo/feature/taxanddocumentcenter/config/CountryConfig;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiscalYearUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.util.FiscalYearUtils INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.util.FiscalYearUtils();

    private FiscalYearUtils() {
    }

    public final int parseBaseYear(java.lang.String baseYear) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseYear, "");
        java.lang.String str = baseYear;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            return java.lang.Integer.parseInt((java.lang.String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null)));
        }
        return java.lang.Integer.parseInt(baseYear);
    }

    public final int getCurrentFinancialYear(com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        java.time.LocalDate now = java.time.LocalDate.now();
        int year = now.getYear();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        int financialYearEndingMonth = countryConfig.getFinancialYearEndingMonth();
        return (financialYearEndingMonth > monthValue || (financialYearEndingMonth == monthValue && countryConfig.getFinancialYearEndingDate() >= dayOfMonth)) ? year - 1 : year;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> generateYearList(int baseYear, int currentFinancialYear, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryConfig, "");
        boolean z = countryConfig.getFinancialYearEndingMonth() == 12 && countryConfig.getFinancialYearEndingDate() == 31;
        kotlin.ranges.IntProgression downTo = kotlin.ranges.RangesKt.downTo(currentFinancialYear, baseYear);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(downTo, 10));
        java.util.Iterator<java.lang.Integer> it = downTo.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            if (z) {
                obj = java.lang.String.valueOf(nextInt);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(nextInt - 1);
                sb.append("-");
                sb.append(nextInt);
                obj = sb.toString();
            }
            arrayList.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear(obj, java.lang.String.valueOf(nextInt)));
        }
        return arrayList;
    }
}
