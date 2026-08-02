package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxreport/mapper/ReportTitleMapper;", "", "<init>", "()V", "", "key", "", "resolve", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReportTitleMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.ReportTitleMapper INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.ReportTitleMapper();

    private ReportTitleMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Integer resolve(java.lang.String key) {
        java.lang.Integer valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        int hashCode = key.hashCode();
        if (hashCode == -82683054) {
            if (key.equals("feature_tax_and_document_center_sales_1099k_crypto")) {
                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto);
            }
            valueOf = null;
        } else if (hashCode != 66514638) {
            if (hashCode == 1787753808 && key.equals("feature_tax_and_document_center_sales_transaction_statement")) {
                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_transaction_statement);
            }
            valueOf = null;
        } else {
            if (key.equals("feature_tax_and_document_center_sales_1099k")) {
                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k);
            }
            valueOf = null;
        }
        if (valueOf == null) {
            int hashCode2 = key.hashCode();
            if (hashCode2 == 541208367) {
                if (key.equals("feature_tax_and_document_center_crypto_1099da")) {
                    valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_1099da);
                    if (valueOf == null) {
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            } else if (hashCode2 != 1055199227) {
                if (hashCode2 == 1813633935 && key.equals("feature_tax_and_document_center_crypto_gains_losses")) {
                    valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_gains_losses);
                    if (valueOf == null) {
                        valueOf = kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_savings_1099int") ? java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_1099int) : null;
                        if (valueOf == null) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_rewards_1099misc_crypto")) {
                                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_crypto);
                            } else {
                                valueOf = kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_rewards_1099misc_fiat") ? java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_fiat) : null;
                            }
                            if (valueOf == null) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_download_all")) {
                                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_download_all);
                                }
                                return null;
                            }
                        }
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            } else {
                if (key.equals("feature_tax_and_document_center_crypto_transaction_statement")) {
                    valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_transaction_statement);
                    if (valueOf == null) {
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
        }
        return valueOf;
    }
}
