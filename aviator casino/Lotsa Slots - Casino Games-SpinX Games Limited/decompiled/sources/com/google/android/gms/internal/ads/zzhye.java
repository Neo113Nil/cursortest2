package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhye implements com.google.android.gms.internal.ads.zzhek {
    private final com.google.android.gms.internal.ads.zzhek zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhye(com.google.android.gms.internal.ads.zzhek zzhekVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzhekVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static com.google.android.gms.internal.ads.zzhek zzb(com.google.android.gms.internal.ads.zzhlz zzhlzVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhnm zzc = zzhlzVar.zzc(com.google.android.gms.internal.ads.zzhdo.zza());
        return new com.google.android.gms.internal.ads.zzhye((com.google.android.gms.internal.ads.zzhek) com.google.android.gms.internal.ads.zzhlo.zza().zzc(zzc.zzg(), com.google.android.gms.internal.ads.zzhek.class).zza(zzc.zzb()), zzc(zzc), zzd(zzc));
    }

    static byte[] zzc(com.google.android.gms.internal.ads.zzhnm zzhnmVar) throws java.security.GeneralSecurityException {
        int ordinal = zzhnmVar.zzd().ordinal();
        if (ordinal == 1) {
            return com.google.android.gms.internal.ads.zzhms.zzb(zzhnmVar.zze().intValue()).zzc();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return com.google.android.gms.internal.ads.zzhms.zza.zzc();
            }
            if (ordinal != 4) {
                throw new java.security.GeneralSecurityException("unknown output prefix type");
            }
        }
        return com.google.android.gms.internal.ads.zzhms.zza(zzhnmVar.zze().intValue()).zzc();
    }

    static byte[] zzd(com.google.android.gms.internal.ads.zzhnm zzhnmVar) {
        return zzhnmVar.zzd().equals(com.google.android.gms.internal.ads.zzhtm.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
        } else {
            if (!com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
                throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = com.google.android.gms.internal.ads.zzhzl.zza(bArr2, bArr4);
            }
            this.zza.zza(java.util.Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
