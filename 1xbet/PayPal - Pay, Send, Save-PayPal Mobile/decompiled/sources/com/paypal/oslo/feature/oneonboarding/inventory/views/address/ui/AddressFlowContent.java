package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressFlowContent;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddressFlowContent {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent Camera2StreamConfigurationMap;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent[] getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent getHighSpeedVideoSizes;

    private AddressFlowContent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent addressFlowContent = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent("ADD_EDIT_FORM", 0);
        Camera2StreamConfigurationMap = addressFlowContent;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent addressFlowContent2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent("CONFIRMATION", 1);
        getHighSpeedVideoFpsRanges = addressFlowContent2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent addressFlowContent3 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent("VERIFICATION_FAILURE", 2);
        getHighSpeedVideoSizes = addressFlowContent3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent[] addressFlowContentArr = {addressFlowContent, addressFlowContent2, addressFlowContent3};
        getHighResolutionOutputSizeshNQ4ISI = addressFlowContentArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(addressFlowContentArr);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressFlowContent.class, str);
    }
}
