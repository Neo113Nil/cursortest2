package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "isCapable", "(Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;)Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "", "isSupported", "(Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayDeviceRequirementKt {
    public static final boolean isSupported(com.zettle.sdk.feature.taptopay.core.DeviceCapabilities deviceCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCapabilities, "");
        return deviceCapabilities.getHasMinAndroidVersionAllowed() && deviceCapabilities.getHasNFCCapabilities() && deviceCapabilities.getHasGooglePlayServices();
    }

    public static final com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement isCapable(com.zettle.sdk.feature.taptopay.core.DeviceCapabilities deviceCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCapabilities, "");
        return !deviceCapabilities.getHasGooglePlayServices() ? com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.GooglePlayServicesMissing.INSTANCE : !deviceCapabilities.getHasMinAndroidVersionAllowed() ? com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.AndroidVersionBelowOreo.INSTANCE : !deviceCapabilities.getHasNFCCapabilities() ? com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.NfcCapabilitiesMissing.INSTANCE : com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.Ok.INSTANCE;
    }
}
