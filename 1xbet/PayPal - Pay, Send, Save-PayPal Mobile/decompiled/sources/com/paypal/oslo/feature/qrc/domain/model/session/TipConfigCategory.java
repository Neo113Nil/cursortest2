package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigCategory;", "", "<init>", "(Ljava/lang/String;I)V", "TIP_OPTION", "TIP_ONLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TipConfigCategory {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory TIP_ONLY;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory TIP_OPTION;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private TipConfigCategory(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory tipConfigCategory = new com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory("TIP_OPTION", 0);
        TIP_OPTION = tipConfigCategory;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory tipConfigCategory2 = new com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory("TIP_ONLY", 1);
        TIP_ONLY = tipConfigCategory2;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory[] tipConfigCategoryArr = {tipConfigCategory, tipConfigCategory2};
        getHighSpeedVideoFpsRanges = tipConfigCategoryArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(tipConfigCategoryArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.TipConfigCategory> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
