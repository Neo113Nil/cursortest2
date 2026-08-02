package com.paypal.oslo.feature.taxanddocumentcenter.data.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "reports", "", "shouldShowAvailabilityBanner", "(Ljava/util/List;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportValidationUtilsKt {
    public static final boolean shouldShowAvailabilityBanner(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return true;
        }
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            java.lang.String downloadId = ((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) it.next()).getDownloadId();
            if (downloadId != null && !kotlin.text.StringsKt.isBlank(downloadId)) {
                return false;
            }
        }
        return true;
    }
}
