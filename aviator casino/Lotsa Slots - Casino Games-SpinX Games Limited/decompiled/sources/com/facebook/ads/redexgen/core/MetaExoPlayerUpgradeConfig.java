package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\u0002J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0007H\u0087\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\rH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig;", "", "<init>", "()V", "CONFIG", "", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$ID;", "", "INTEGER_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$INTEGER_ID;", "", "LONG_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$LONG_ID;", "", "get", "upgradeIdentifier", "set", "", "value", "getInteger", "setInteger", "getLong", "setLong", "ID", "INTEGER_ID", "LONG_ID", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.ja, reason: from Kotlin metadata */
/* loaded from: assets/audience_network/classes2.dex */
public final class MetaExoPlayerUpgradeConfig {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig A01;
    public static final java.util.Map<com.facebook.ads.redexgen.core.EnumC1796jX, java.lang.Boolean> A02;
    public static final java.util.Map<com.facebook.ads.redexgen.core.EnumC1797jY, java.lang.Integer> A03;
    public static final java.util.Map<com.facebook.ads.redexgen.core.EnumC1798jZ, java.lang.Long> A04;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{126, 73, 93, 89, 69, 94, 73, 72, com.google.common.base.Ascii.FF, 90, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 89, 73, com.google.common.base.Ascii.FF, 91, 77, 95, com.google.common.base.Ascii.FF, 66, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 2, 39, 34, 53, 32, 51, 54, 55, com.google.common.base.Ascii.ESC, 54, 55, 60, 38, 59, 52, 59, 55, 32};
    }

    static {
        A02();
        A01 = new com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig();
        A02 = new java.util.EnumMap(com.facebook.ads.redexgen.core.EnumC1796jX.class);
        A03 = new java.util.EnumMap(com.facebook.ads.redexgen.core.EnumC1797jY.class);
        A04 = new java.util.EnumMap(com.facebook.ads.redexgen.core.EnumC1798jZ.class);
        for (com.facebook.ads.redexgen.core.EnumC1796jX enumC1796jX : com.facebook.ads.redexgen.core.EnumC1796jX.valuesCustom()) {
            A02.put(enumC1796jX, false);
        }
        for (com.facebook.ads.redexgen.core.EnumC1797jY enumC1797jY : com.facebook.ads.redexgen.core.EnumC1797jY.valuesCustom()) {
            A03.put(enumC1797jY, -1);
        }
        for (com.facebook.ads.redexgen.core.EnumC1798jZ id : com.facebook.ads.redexgen.core.EnumC1798jZ.values()) {
            A04.put(id, -1L);
        }
        A02.put(com.facebook.ads.redexgen.core.EnumC1796jX.A0W, true);
        A02.put(com.facebook.ads.redexgen.core.EnumC1796jX.A0Q, true);
        A02.put(com.facebook.ads.redexgen.core.EnumC1796jX.A1j, true);
        A03.put(com.facebook.ads.redexgen.core.EnumC1797jY.A05, 100);
    }

    @kotlin.jvm.JvmStatic
    public static final int A00(com.facebook.ads.redexgen.core.EnumC1797jY enumC1797jY) {
        com.facebook.ads.redexgen.core.C2210qY.A09(enumC1797jY, A01(24, 17, 40));
        java.lang.Integer num = A03.get(enumC1797jY);
        if (num != null) {
            return num.intValue();
        }
        throw new java.lang.IllegalStateException(A01(0, 24, 86).toString());
    }

    @kotlin.jvm.JvmStatic
    public static final boolean A03(com.facebook.ads.redexgen.core.EnumC1796jX enumC1796jX) {
        com.facebook.ads.redexgen.core.C2210qY.A09(enumC1796jX, A01(24, 17, 40));
        return com.facebook.ads.redexgen.core.C2210qY.A0C(true, A02.get(enumC1796jX));
    }
}
