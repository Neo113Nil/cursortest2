package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;", "", "", "getHasGooglePlayServices", "()Z", "hasGooglePlayServices", "getHasMinAndroidVersionAllowed", "hasMinAndroidVersionAllowed", "getHasNFCCapabilities", "hasNFCCapabilities", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DeviceCapabilities {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.Companion.getHighSpeedVideoFpsRanges;

    boolean getHasGooglePlayServices();

    boolean getHasMinAndroidVersionAllowed();

    boolean getHasNFCCapabilities();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.Companion();

        private Companion() {
        }
    }
}
