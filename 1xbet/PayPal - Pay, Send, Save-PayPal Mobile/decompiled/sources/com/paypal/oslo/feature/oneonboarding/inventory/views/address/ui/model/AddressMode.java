package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/model/AddressMode;", "", "<init>", "(Ljava/lang/String;I)V", "COMPRESSED", "EXPANDED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressMode {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode COMPRESSED;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode EXPANDED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode[] getHighSpeedVideoSizes;

    private AddressMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode addressMode = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode("COMPRESSED", 0);
        COMPRESSED = addressMode;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode addressMode2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode("EXPANDED", 1);
        EXPANDED = addressMode2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode[] addressModeArr = {addressMode, addressMode2};
        getHighSpeedVideoSizes = addressModeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(addressModeArr);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressMode> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
