package com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ButtonLayoutDirection;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonLayoutDirection {
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection HORIZONTAL;
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection VERTICAL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection[] getHighSpeedVideoSizes;

    private ButtonLayoutDirection(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection buttonLayoutDirection = new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection("VERTICAL", 0);
        VERTICAL = buttonLayoutDirection;
        com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection buttonLayoutDirection2 = new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection("HORIZONTAL", 1);
        HORIZONTAL = buttonLayoutDirection2;
        com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection[] buttonLayoutDirectionArr = {buttonLayoutDirection, buttonLayoutDirection2};
        getHighSpeedVideoSizes = buttonLayoutDirectionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(buttonLayoutDirectionArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ButtonLayoutDirection> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
