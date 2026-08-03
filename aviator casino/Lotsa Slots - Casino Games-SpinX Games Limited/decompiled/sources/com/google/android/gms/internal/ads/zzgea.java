package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgea {
    public static java.lang.String zza(byte[] bArr, boolean z) {
        return zzc(z).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(java.lang.String str, boolean z) throws java.lang.IllegalArgumentException {
        byte[] zzk = zzc(z).zzk(str);
        if (zzk.length != 0 || str.length() <= 0) {
            return zzk;
        }
        throw new java.lang.IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static com.google.android.gms.internal.ads.zzgzh zzc(boolean z) {
        return z ? com.google.android.gms.internal.ads.zzgzh.zzm().zzh() : com.google.android.gms.internal.ads.zzgzh.zzl();
    }
}
