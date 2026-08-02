package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilitiesImpl;", "Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/meta/Platform;)V", "", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "getHasGooglePlayServices", "()Z", "hasGooglePlayServices", "getHasMinAndroidVersionAllowed", "hasMinAndroidVersionAllowed", "getHasNFCCapabilities", "hasNFCCapabilities", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/meta/Platform;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeviceCapabilitiesImpl implements com.zettle.sdk.feature.taptopay.core.DeviceCapabilities {
    private final android.content.Context context;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.Platform getHighSpeedVideoFpsRangesFor;

    public DeviceCapabilitiesImpl(android.content.Context context, com.zettle.sdk.meta.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        this.context = context;
        this.getHighSpeedVideoFpsRangesFor = platform;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.DeviceCapabilities
    public final boolean getHasMinAndroidVersionAllowed() {
        return this.getHighSpeedVideoFpsRangesFor.getInfo().isVersionAtLeast(com.zettle.sdk.meta.AndroidVersion.Oreo);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.DeviceCapabilities
    public final boolean getHasGooglePlayServices() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.context) == 0;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.DeviceCapabilities
    public final boolean getHasNFCCapabilities() {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.zettle.sdk.feature.taptopay.core.DeviceCapabilitiesImpl deviceCapabilitiesImpl = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(android.nfc.NfcAdapter.getDefaultAdapter(this.context));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return ((android.nfc.NfcAdapter) m23436constructorimpl) != null;
    }

    public final java.lang.String toString() {
        boolean hasMinAndroidVersionAllowed = getHasMinAndroidVersionAllowed();
        boolean hasGooglePlayServices = getHasGooglePlayServices();
        boolean hasNFCCapabilities = getHasNFCCapabilities();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("hasMinAndroidVersionAllowed = ");
        sb.append(hasMinAndroidVersionAllowed);
        sb.append(", hasGooglePlayServices = ");
        sb.append(hasGooglePlayServices);
        sb.append(", hasNFCCapabilities = ");
        sb.append(hasNFCCapabilities);
        return sb.toString();
    }
}
