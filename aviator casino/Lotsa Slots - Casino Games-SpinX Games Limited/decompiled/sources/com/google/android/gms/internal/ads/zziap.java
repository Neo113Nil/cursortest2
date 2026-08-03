package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziap implements com.google.android.gms.internal.ads.zzheg {
    private static final byte[] zza = {0};
    private final com.google.android.gms.internal.ads.zzhqd zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zziap(com.google.android.gms.internal.ads.zzhob zzhobVar) throws java.security.GeneralSecurityException {
        this.zzb = com.google.android.gms.internal.ads.zziam.zzb(com.google.android.gms.internal.ads.zzhqb.zzc(com.google.android.gms.internal.ads.zzhqc.zzb(zzhobVar.zzf().zzc()), zzhobVar.zzd()));
        this.zzc = zzhobVar.zzf().zzd();
        this.zzd = zzhobVar.zze().zzc();
        if (zzhobVar.zzf().zzf().equals(com.google.android.gms.internal.ads.zzhoh.zzc)) {
            this.zze = java.util.Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static com.google.android.gms.internal.ads.zzheg zza(com.google.android.gms.internal.ads.zzhob zzhobVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zziap(zzhobVar);
    }

    public static com.google.android.gms.internal.ads.zzheg zzb(com.google.android.gms.internal.ads.zzhom zzhomVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zziap(zzhomVar);
    }

    public final byte[] zzc(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? com.google.android.gms.internal.ads.zzhzl.zza(this.zzd, this.zzb.zza(com.google.android.gms.internal.ads.zzhzl.zza(bArr, bArr2), this.zzc)) : com.google.android.gms.internal.ads.zzhzl.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zziap(com.google.android.gms.internal.ads.zzhom zzhomVar) throws java.security.GeneralSecurityException {
        java.lang.String valueOf = java.lang.String.valueOf(zzhomVar.zzf().zzg());
        java.lang.String.valueOf(valueOf);
        java.lang.String valueOf2 = java.lang.String.valueOf(valueOf);
        this.zzb = new com.google.android.gms.internal.ads.zziao("HMAC".concat(valueOf2), new javax.crypto.spec.SecretKeySpec(zzhomVar.zzd().zzc(com.google.android.gms.internal.ads.zzhdo.zza()), "HMAC"));
        this.zzc = zzhomVar.zzf().zzd();
        this.zzd = zzhomVar.zze().zzc();
        if (zzhomVar.zzf().zzf().equals(com.google.android.gms.internal.ads.zzhou.zzc)) {
            this.zze = java.util.Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zziap(com.google.android.gms.internal.ads.zzhqd zzhqdVar, int i) throws java.security.GeneralSecurityException {
        this.zzb = zzhqdVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhqdVar.zza(new byte[0], i);
    }
}
