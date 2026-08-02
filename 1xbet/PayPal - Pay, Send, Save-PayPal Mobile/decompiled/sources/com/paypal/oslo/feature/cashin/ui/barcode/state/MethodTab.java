package com.paypal.oslo.feature.cashin.ui.barcode.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/state/MethodTab;", "", "<init>", "(Ljava/lang/String;I)V", "Barcode", "DebitCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MethodTab {
    public static final com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab Barcode;
    public static final com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab DebitCard;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab[] getHighSpeedVideoFpsRangesFor;

    static {
        com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab methodTab = new com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab("Barcode", 0);
        Barcode = methodTab;
        com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab methodTab2 = new com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab("DebitCard", 1);
        DebitCard = methodTab2;
        com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab[] methodTabArr = {methodTab, methodTab2};
        getHighSpeedVideoFpsRangesFor = methodTabArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(methodTabArr);
    }

    private MethodTab(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab[] values() {
        return (com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab) java.lang.Enum.valueOf(com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cashin.ui.barcode.state.MethodTab> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
