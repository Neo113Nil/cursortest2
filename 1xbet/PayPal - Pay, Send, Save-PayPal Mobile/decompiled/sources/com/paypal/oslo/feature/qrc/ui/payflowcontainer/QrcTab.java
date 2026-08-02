package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/QrcTab;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "titleRes", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "()I", "Scanner", "GetPaid", "ShowToPay"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcTab {
    public static final com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab GetPaid;
    public static final com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab Scanner;
    public static final com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab ShowToPay;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab[] getHighSpeedVideoFpsRangesFor;
    private final int titleRes;

    private QrcTab(java.lang.String str, int i, int i2) {
        this.titleRes = i2;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    static {
        com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab qrcTab = new com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab("Scanner", 0, com.paypal.oslo.feature.qrc.R.string.feature_qrc_scan_to_pay_title_tab_name);
        Scanner = qrcTab;
        com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab qrcTab2 = new com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab("GetPaid", 1, com.paypal.oslo.feature.qrc.R.string.feature_qrc_get_paid_title_tab_name);
        GetPaid = qrcTab2;
        com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab qrcTab3 = new com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab("ShowToPay", 2, com.paypal.oslo.feature.qrc.R.string.feature_qrc_show_to_pay_title_tab_name);
        ShowToPay = qrcTab3;
        com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab[] qrcTabArr = {qrcTab, qrcTab2, qrcTab3};
        getHighSpeedVideoFpsRangesFor = qrcTabArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(qrcTabArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab[] values() {
        return (com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
