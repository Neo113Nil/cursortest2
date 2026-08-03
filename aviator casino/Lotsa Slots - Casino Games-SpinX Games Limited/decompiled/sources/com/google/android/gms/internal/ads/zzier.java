package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzier {
    public static final byte[] zza;
    public static final java.nio.ByteBuffer zzb;

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        zzb = java.nio.ByteBuffer.wrap(bArr);
        com.google.android.gms.internal.ads.zzide.zzI(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
