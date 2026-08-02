package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxreport/mapper/SharedMessageMapper;", "", "<init>", "()V", "", "key", "", "resolve", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SharedMessageMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.SharedMessageMapper INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.SharedMessageMapper();

    private SharedMessageMapper() {
    }

    public final java.lang.Integer resolve(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        switch (key.hashCode()) {
            case -2025398751:
                if (key.equals("feature_tax_and_document_center_updated_reports_note")) {
                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_updated_reports_note);
                }
                return null;
            case -1965851132:
                if (key.equals("feature_tax_and_document_center_sales_1099k_self_correction_in_progress_text")) {
                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_1099k_self_correction_in_progress_text);
                }
                return null;
            case -872875733:
                if (key.equals("feature_tax_and_document_center_not_available_inline_note")) {
                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_not_available_inline_note);
                }
                return null;
            case -37480318:
                if (key.equals("feature_tax_and_document_center_not_available_toast_message")) {
                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_not_available_toast_message);
                }
                return null;
            case 1580384628:
                if (key.equals("feature_tax_and_document_center_sales_transaction_statement_in_progress_text")) {
                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_transaction_statement_in_progress_text);
                }
                return null;
            case 2050584981:
                if (key.equals("feature_tax_and_document_center_sales_transaction_statement_not_available_yet_text")) {
                    return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_sales_transaction_statement_not_available_yet_text);
                }
                return null;
            default:
                return null;
        }
    }
}
