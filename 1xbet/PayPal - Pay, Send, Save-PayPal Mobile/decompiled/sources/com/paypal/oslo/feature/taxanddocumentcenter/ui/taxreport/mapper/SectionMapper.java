package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxreport/mapper/SectionMapper;", "", "<init>", "()V", "", "key", "", "resolve", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.SectionMapper INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.SectionMapper();

    private SectionMapper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final java.lang.Integer resolve(java.lang.String key) {
        java.lang.Integer num;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        switch (key.hashCode()) {
            case -1229304089:
                if (key.equals("feature_tax_and_document_center_section_sales")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales);
                    break;
                }
                num = null;
                break;
            case -1008168385:
                if (key.equals("feature_tax_and_document_center_section_rewards")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_rewards);
                    break;
                }
                num = null;
                break;
            case -276202406:
                if (key.equals("feature_tax_and_document_center_year_in_review_section_title")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_year_in_review_section_title);
                    break;
                }
                num = null;
                break;
            case -235870252:
                if (key.equals("feature_tax_and_document_center_section_savings")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_savings);
                    break;
                }
                num = null;
                break;
            case 104310342:
                if (key.equals("feature_tax_and_document_center_section_crypto")) {
                    num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto);
                    break;
                }
                num = null;
                break;
            default:
                num = null;
                break;
        }
        if (num == null) {
            switch (key.hashCode()) {
                case -748598632:
                    if (key.equals("feature_tax_and_document_center_section_savings_tooltip")) {
                        num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_savings_tooltip);
                        break;
                    }
                    num = null;
                    break;
                case 310605578:
                    if (key.equals("feature_tax_and_document_center_section_crypto_tooltip")) {
                        num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_crypto_tooltip);
                        break;
                    }
                    num = null;
                    break;
                case 682187267:
                    if (key.equals("feature_tax_and_document_center_section_rewards_tooltip")) {
                        num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_rewards_tooltip);
                        break;
                    }
                    num = null;
                    break;
                case 1223159467:
                    if (key.equals("feature_tax_and_document_center_section_sales_tooltip")) {
                        num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_sales_tooltip);
                        break;
                    }
                    num = null;
                    break;
                default:
                    num = null;
                    break;
            }
            if (num == null) {
                switch (key.hashCode()) {
                    case -1972139979:
                        if (key.equals("feature_tax_and_document_center_section_not_eligible_message_rewards")) {
                            num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_rewards);
                            break;
                        }
                        num = null;
                        break;
                    case -1199841846:
                        if (key.equals("feature_tax_and_document_center_section_not_eligible_message_savings")) {
                            num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_savings);
                            break;
                        }
                        num = null;
                        break;
                    case -65332848:
                        if (key.equals("feature_tax_and_document_center_section_not_eligible_message_crypto")) {
                            num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_crypto);
                            break;
                        }
                        num = null;
                        break;
                    case 1951812189:
                        if (key.equals("feature_tax_and_document_center_section_not_eligible_message_sales")) {
                            num = java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_eligible_message_sales);
                            break;
                        }
                        num = null;
                        break;
                    default:
                        num = null;
                        break;
                }
                if (num == null) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_section_not_available_message")) {
                        return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_not_available_message);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(key, "feature_tax_and_document_center_section_pending_review_message")) {
                        return java.lang.Integer.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_section_pending_review_message);
                    }
                    return null;
                }
            }
        }
        return num;
    }
}
