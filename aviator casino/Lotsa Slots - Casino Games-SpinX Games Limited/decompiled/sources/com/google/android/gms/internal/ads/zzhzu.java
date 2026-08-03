package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzu implements com.google.android.gms.internal.ads.zzhdi {
    private final com.google.android.gms.internal.ads.zziak zza;
    private final com.google.android.gms.internal.ads.zzheg zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhzu(com.google.android.gms.internal.ads.zziak zziakVar, com.google.android.gms.internal.ads.zzheg zzhegVar, int i, byte[] bArr) {
        this.zza = zziakVar;
        this.zzb = zzhegVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhey zzheyVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhze zzhzeVar = new com.google.android.gms.internal.ads.zzhze(zzheyVar.zze().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), zzheyVar.zzg().zzf());
        java.lang.String valueOf = java.lang.String.valueOf(zzheyVar.zzg().zzh());
        java.lang.String.valueOf(valueOf);
        java.lang.String valueOf2 = java.lang.String.valueOf(valueOf);
        return new com.google.android.gms.internal.ads.zzhzu(zzhzeVar, new com.google.android.gms.internal.ads.zziap(new com.google.android.gms.internal.ads.zziao("HMAC".concat(valueOf2), new javax.crypto.spec.SecretKeySpec(zzheyVar.zzf().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), "HMAC")), zzheyVar.zzg().zze()), zzheyVar.zzg().zze(), zzheyVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new java.security.GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, length2, i2);
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (java.security.MessageDigest.isEqual(((com.google.android.gms.internal.ads.zziap) this.zzb).zzc(com.google.android.gms.internal.ads.zzhzl.zza(bArr2, copyOfRange, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new java.security.GeneralSecurityException("invalid MAC");
    }
}
