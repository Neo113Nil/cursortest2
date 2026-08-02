package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities$Companion;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities$Companion;Landroid/content/Context;Lcom/zettle/sdk/meta/Platform;)Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeviceCapabilitiesKt {
    public static final com.zettle.sdk.feature.taptopay.core.DeviceCapabilities create(com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.Companion companion, android.content.Context context, com.zettle.sdk.meta.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        return new com.zettle.sdk.feature.taptopay.core.DeviceCapabilitiesImpl(context, platform);
    }
}
