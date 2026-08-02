package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/uimodel/SectionType;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "sectionHeaderTextRes", com.visa.cbp.getEncExpo.warmup, "getSectionHeaderTextRes", "()I", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.UPCOMING, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SectionType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType Completed;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType Pending;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType Upcoming;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType[] getHighSpeedVideoFpsRangesFor;
    private final int sectionHeaderTextRes;

    private SectionType(java.lang.String str, int i, int i2) {
        this.sectionHeaderTextRes = i2;
    }

    public final int getSectionHeaderTextRes() {
        return this.sectionHeaderTextRes;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.UPCOMING, 0, com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_upcoming);
        Upcoming = sectionType;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, 1, com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_pending);
        Pending = sectionType2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType sectionType3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, 2, com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_completed);
        Completed = sectionType3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType[] sectionTypeArr = {sectionType, sectionType2, sectionType3};
        getHighSpeedVideoFpsRangesFor = sectionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(sectionTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.SectionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
