package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressSelection;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddressSelection {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection addressSelection = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection("VERIFIED", 0);
        getHighResolutionOutputSizeshNQ4ISI = addressSelection;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection addressSelection2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection("ORIGINAL", 1);
        getHighSpeedVideoFpsRanges = addressSelection2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection[] addressSelectionArr = {addressSelection, addressSelection2};
        getHighSpeedVideoFpsRangesFor = addressSelectionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(addressSelectionArr);
    }

    private AddressSelection(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelection.class, str);
    }
}
