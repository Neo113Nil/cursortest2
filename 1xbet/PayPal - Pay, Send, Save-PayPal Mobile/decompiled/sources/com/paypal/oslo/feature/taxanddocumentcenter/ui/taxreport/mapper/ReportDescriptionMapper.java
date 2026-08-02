package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxreport/mapper/ReportDescriptionMapper;", "", "<init>", "()V", "", "key", "", "resolve", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReportDescriptionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.ReportDescriptionMapper INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.ReportDescriptionMapper();

    private ReportDescriptionMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Integer resolve(java.lang.String key) {
        java.lang.Integer valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        int hashCode = key.hashCode();
        if (hashCode == -191689717) {
            if (key.equals("feature_tax_and_document_center_sales_1099k_description")) {
                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_description);
            }
            valueOf = null;
        } else if (hashCode != 1568395919) {
            if (hashCode == 1742430093 && key.equals("feature_tax_and_document_center_sales_transaction_statement_description")) {
                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_transaction_statement_description);
            }
            valueOf = null;
        } else {
            if (key.equals("feature_tax_and_document_center_sales_1099k_crypto_description")) {
                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_crypto_description);
            }
            valueOf = null;
        }
        if (valueOf == null) {
            int hashCode2 = key.hashCode();
            if (hashCode2 == -730079412) {
                if (key.equals("feature_tax_and_document_center_crypto_gains_losses_description")) {
                    valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_gains_losses_description);
                    if (valueOf == null) {
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            } else if (hashCode2 != 190828984) {
                if (hashCode2 == 430162668 && key.equals("feature_tax_and_document_center_crypto_1099da_description")) {
                    valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_1099da_description);
                    if (valueOf == null) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_savings_1099int_multi_account_description")) {
                            valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_1099int_multi_account_description);
                        } else {
                            valueOf = kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_savings_1099int_single_account_description") ? java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_1099int_single_account_description) : null;
                        }
                        if (valueOf == null) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_rewards_1099misc_crypto_description")) {
                                valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_crypto_description);
                            } else {
                                valueOf = kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_rewards_1099misc_fiat_description") ? java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_rewards_1099misc_fiat_description) : null;
                            }
                            if (valueOf == null) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_download_all_description")) {
                                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_download_all_description);
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
                if (key.equals("feature_tax_and_document_center_crypto_transaction_statement_description")) {
                    valueOf = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_crypto_transaction_statement_description);
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
