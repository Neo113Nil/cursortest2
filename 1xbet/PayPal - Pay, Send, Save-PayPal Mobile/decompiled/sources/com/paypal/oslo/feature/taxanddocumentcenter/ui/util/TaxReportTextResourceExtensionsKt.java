package com.paypal.oslo.feature.taxanddocumentcenter.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;", "Landroid/content/Context;", "context", "", "toUiString", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTextResource;Landroid/content/Context;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportTextResourceExtensionsKt {
    public static final java.lang.String toUiString(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource taxReportTextResource, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportTextResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (!(taxReportTextResource instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        try {
            int resolveResourceId = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.TaxReportStringResourceMapper.INSTANCE.resolveResourceId(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey) taxReportTextResource).getKey());
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey) taxReportTextResource;
            if (stringKey.getFormatArgs().isEmpty()) {
                java.lang.String string = context.getString(resolveResourceId);
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                return string;
            }
            java.lang.Object[] array = stringKey.getFormatArgs().toArray(new java.lang.Object[0]);
            java.lang.String string2 = context.getString(resolveResourceId, java.util.Arrays.copyOf(array, array.length));
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            return string2;
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey) taxReportTextResource;
            com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log.e("Resource key not found in mapper: ".concat(java.lang.String.valueOf(stringKey2.getKey())), e);
            return "Missing: ".concat(java.lang.String.valueOf(stringKey2.getKey()));
        }
    }
}
