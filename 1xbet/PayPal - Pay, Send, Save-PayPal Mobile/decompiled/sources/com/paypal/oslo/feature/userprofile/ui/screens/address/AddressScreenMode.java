package com.paypal.oslo.feature.userprofile.ui.screens.address;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/screens/address/AddressScreenMode;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "EDIT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddressScreenMode {
    public static final com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode ADD;
    public static final com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode EDIT;
    private static final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AddressScreenMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode addressScreenMode = new com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode("ADD", 0);
        ADD = addressScreenMode;
        com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode addressScreenMode2 = new com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode("EDIT", 1);
        EDIT = addressScreenMode2;
        com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode[] addressScreenModeArr = {addressScreenMode, addressScreenMode2};
        getHighSpeedVideoFpsRangesFor = addressScreenModeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(addressScreenModeArr);
    }

    public static com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode[] values() {
        return (com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
