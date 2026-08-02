package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/BusinessCategory;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LEGAL", "DOING_BUSINESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BusinessCategory {
    public static final com.paypal.oslo.core.i18n.domain.model.BusinessCategory DEFAULT;
    public static final com.paypal.oslo.core.i18n.domain.model.BusinessCategory DOING_BUSINESS;
    public static final com.paypal.oslo.core.i18n.domain.model.BusinessCategory LEGAL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.BusinessCategory[] getHighSpeedVideoFpsRangesFor;

    private BusinessCategory(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory = new com.paypal.oslo.core.i18n.domain.model.BusinessCategory("DEFAULT", 0);
        DEFAULT = businessCategory;
        com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory2 = new com.paypal.oslo.core.i18n.domain.model.BusinessCategory("LEGAL", 1);
        LEGAL = businessCategory2;
        com.paypal.oslo.core.i18n.domain.model.BusinessCategory businessCategory3 = new com.paypal.oslo.core.i18n.domain.model.BusinessCategory("DOING_BUSINESS", 2);
        DOING_BUSINESS = businessCategory3;
        com.paypal.oslo.core.i18n.domain.model.BusinessCategory[] businessCategoryArr = {businessCategory, businessCategory2, businessCategory3};
        getHighSpeedVideoFpsRangesFor = businessCategoryArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(businessCategoryArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.BusinessCategory[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.BusinessCategory[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.BusinessCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.BusinessCategory) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.BusinessCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.BusinessCategory> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
