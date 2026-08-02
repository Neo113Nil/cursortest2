package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxreport/mapper/TaxReportStringResourceMapper;", "", "<init>", "()V", "", "key", "", "resolveResourceId", "(Ljava/lang/String;)I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportStringResourceMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.TaxReportStringResourceMapper INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.TaxReportStringResourceMapper();

    private TaxReportStringResourceMapper() {
    }

    public final int resolveResourceId(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Integer resolve = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.ReportTitleMapper.INSTANCE.resolve(key);
        if (resolve != null) {
            return resolve.intValue();
        }
        java.lang.Integer resolve2 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.ReportDescriptionMapper.INSTANCE.resolve(key);
        if (resolve2 != null) {
            return resolve2.intValue();
        }
        java.lang.Integer resolve3 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.SectionMapper.INSTANCE.resolve(key);
        if (resolve3 != null) {
            return resolve3.intValue();
        }
        java.lang.Integer resolve4 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.InProgressMessageMapper.INSTANCE.resolve(key);
        if (resolve4 != null) {
            return resolve4.intValue();
        }
        java.lang.Integer resolve5 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.SavingsMapper.INSTANCE.resolve(key);
        if (resolve5 != null) {
            return resolve5.intValue();
        }
        java.lang.Integer resolve6 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.BadgeMapper.INSTANCE.resolve(key);
        if (resolve6 != null) {
            return resolve6.intValue();
        }
        java.lang.Integer resolve7 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.ActionLinkMapper.INSTANCE.resolve(key);
        if (resolve7 != null) {
            return resolve7.intValue();
        }
        java.lang.Integer resolve8 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxreport.mapper.SharedMessageMapper.INSTANCE.resolve(key);
        if (resolve8 != null) {
            return resolve8.intValue();
        }
        throw new java.lang.IllegalArgumentException("Unknown resource key: ".concat(java.lang.String.valueOf(key)));
    }
}
