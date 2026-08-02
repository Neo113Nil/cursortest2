package com.paypal.oslo.core.persistence.encryption;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/BlockMode;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "mode", "Ljava/lang/String;", "getMode", "()Ljava/lang/String;", "ivSize", com.visa.cbp.getEncExpo.warmup, "getIvSize", "()I", com.google.android.gms.stats.CodePackage.GCM, "CBC"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BlockMode {
    public static final com.paypal.oslo.core.persistence.encryption.BlockMode CBC;
    private static final /* synthetic */ com.paypal.oslo.core.persistence.encryption.BlockMode[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.persistence.encryption.BlockMode GCM;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final int ivSize;
    private final java.lang.String mode;

    private BlockMode(java.lang.String str, int i, java.lang.String str2, int i2) {
        this.mode = str2;
        this.ivSize = i2;
    }

    public final int getIvSize() {
        return this.ivSize;
    }

    public final java.lang.String getMode() {
        return this.mode;
    }

    static {
        com.paypal.oslo.core.persistence.encryption.BlockMode blockMode = new com.paypal.oslo.core.persistence.encryption.BlockMode(com.google.android.gms.stats.CodePackage.GCM, 0, com.google.android.gms.stats.CodePackage.GCM, 12);
        GCM = blockMode;
        com.paypal.oslo.core.persistence.encryption.BlockMode blockMode2 = new com.paypal.oslo.core.persistence.encryption.BlockMode("CBC", 1, "CBC", 16);
        CBC = blockMode2;
        com.paypal.oslo.core.persistence.encryption.BlockMode[] blockModeArr = {blockMode, blockMode2};
        Camera2StreamConfigurationMap = blockModeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(blockModeArr);
    }

    public static com.paypal.oslo.core.persistence.encryption.BlockMode[] values() {
        return (com.paypal.oslo.core.persistence.encryption.BlockMode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.persistence.encryption.BlockMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.persistence.encryption.BlockMode) java.lang.Enum.valueOf(com.paypal.oslo.core.persistence.encryption.BlockMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.persistence.encryption.BlockMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
