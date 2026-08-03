package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzk {
    private static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName("UTF-8");

    public static byte[] zza(java.lang.String str, int i) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        com.google.android.gms.internal.ads.zzhzj zzhzjVar = new com.google.android.gms.internal.ads.zzhzj(2, new byte[(length * 3) / 4]);
        if (!zzhzjVar.zza(bytes, 0, length, true)) {
            throw new java.lang.IllegalArgumentException("bad base-64");
        }
        int i2 = zzhzjVar.zzb;
        byte[] bArr = zzhzjVar.zza;
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
