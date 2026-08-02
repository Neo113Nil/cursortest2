package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubSection;", "", "<init>", "(Ljava/lang/String;I)V", "PREQUAL", "ACQ", "PLANS", "UNUSED_VCC"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubSection {
    public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection ACQ;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection PLANS;
    public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection PREQUAL;
    public static final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection UNUSED_VCC;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PayLaterHubSection(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection payLaterHubSection = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection("PREQUAL", 0);
        PREQUAL = payLaterHubSection;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection payLaterHubSection2 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection("ACQ", 1);
        ACQ = payLaterHubSection2;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection payLaterHubSection3 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection("PLANS", 2);
        PLANS = payLaterHubSection3;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection payLaterHubSection4 = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection("UNUSED_VCC", 3);
        UNUSED_VCC = payLaterHubSection4;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection[] payLaterHubSectionArr = {payLaterHubSection, payLaterHubSection2, payLaterHubSection3, payLaterHubSection4};
        Camera2StreamConfigurationMap = payLaterHubSectionArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(payLaterHubSectionArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection[] values() {
        return (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
