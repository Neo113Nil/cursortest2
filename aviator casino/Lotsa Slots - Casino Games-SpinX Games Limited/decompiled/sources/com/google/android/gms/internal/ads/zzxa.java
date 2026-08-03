package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzxa implements com.google.android.gms.internal.ads.zzhp {
    private final com.google.android.gms.internal.ads.zzhp zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzwz zzc;
    private final byte[] zzd;
    private int zze;

    public zzxa(com.google.android.gms.internal.ads.zzhp zzhpVar, int i, com.google.android.gms.internal.ads.zzwz zzwzVar) {
        com.google.android.gms.internal.ads.zzgtj.zza(i > 0);
        this.zza = zzhpVar;
        this.zzb = i;
        this.zzc = zzwzVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zze;
        if (i3 == 0) {
            com.google.android.gms.internal.ads.zzhp zzhpVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i4 = 0;
            if (zzhpVar.zza(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int zza = zzhpVar.zza(bArr3, i4, i6);
                        if (zza != -1) {
                            i4 += zza;
                            i6 -= zza;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.zzc.zza(new com.google.android.gms.internal.ads.zzet(bArr3, i5));
                    }
                }
                i3 = this.zzb;
                this.zze = i3;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i, java.lang.Math.min(i3, i2));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final java.util.Map zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(com.google.android.gms.internal.ads.zzin zzinVar) {
        zzinVar.getClass();
        this.zza.zze(zzinVar);
    }
}
