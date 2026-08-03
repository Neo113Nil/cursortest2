package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class FrameworkCryptoConfig implements com.google.android.exoplayer2.decoder.CryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final java.util.UUID uuid;

    static {
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = "Amazon".equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) && ("AFTM".equals(com.google.android.exoplayer2.util.Util.MODEL) || "AFTB".equals(com.google.android.exoplayer2.util.Util.MODEL));
    }

    public FrameworkCryptoConfig(java.util.UUID uuid, byte[] bArr, boolean z) {
        this.uuid = uuid;
        this.sessionId = bArr;
        this.forceAllowInsecureDecoderComponents = z;
    }
}
