package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzahv implements com.google.android.gms.internal.ads.zzahq {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzahv(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
    }

    public static com.google.android.gms.internal.ads.zzahv zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzC = zzetVar.zzC();
        zzetVar.zzk(12);
        int zzC2 = zzetVar.zzC();
        int zzC3 = zzetVar.zzC();
        int zzC4 = zzetVar.zzC();
        zzetVar.zzk(4);
        int zzC5 = zzetVar.zzC();
        int zzC6 = zzetVar.zzC();
        zzetVar.zzk(4);
        return new com.google.android.gms.internal.ads.zzahv(zzC, zzC2, zzC3, zzC4, zzC5, zzC6, zzetVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i = this.zza;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        java.lang.String hexString = java.lang.Integer.toHexString(i);
        java.lang.String.valueOf(hexString);
        com.google.android.gms.internal.ads.zzeg.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(java.lang.String.valueOf(hexString)));
        return -1;
    }

    public final long zzd() {
        return com.google.android.gms.internal.ads.zzfl.zzv(this.zzd, this.zzb * 1000000, this.zzc, java.math.RoundingMode.DOWN);
    }
}
