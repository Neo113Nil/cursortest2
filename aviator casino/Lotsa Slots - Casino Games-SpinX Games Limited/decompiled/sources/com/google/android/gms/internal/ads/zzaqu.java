package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqu implements com.google.android.gms.internal.ads.zzari {
    private final com.google.android.gms.internal.ads.zzaqt zza;
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaqu(com.google.android.gms.internal.ads.zzaqt zzaqtVar) {
        this.zza = zzaqtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zza(com.google.android.gms.internal.ads.zzfi zzfiVar, com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        this.zza.zza(zzfiVar, zzagbVar, zzarhVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        int i2 = i & 1;
        int zzg = i2 != 0 ? zzetVar.zzg() + zzetVar.zzs() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzetVar.zzh(zzg);
            this.zzd = 0;
        }
        while (zzetVar.zzd() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzs = zzetVar.zzs();
                    zzetVar.zzh(zzetVar.zzg() - 1);
                    if (zzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = java.lang.Math.min(zzetVar.zzd(), 3 - this.zzd);
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
                zzetVar.zzm(zzetVar2.zzi(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    zzetVar2.zzh(0);
                    zzetVar2.zzf(3);
                    zzetVar2.zzk(1);
                    int zzs2 = zzetVar2.zzs();
                    boolean z = (zzs2 & 128) != 0;
                    int zzs3 = zzetVar2.zzs();
                    this.zze = z;
                    this.zzc = (((zzs2 & 15) << 8) | zzs3) + 3;
                    int zzj = zzetVar2.zzj();
                    int i5 = this.zzc;
                    if (zzj < i5) {
                        int zzj2 = zzetVar2.zzj();
                        zzetVar2.zzc(java.lang.Math.min(4098, java.lang.Math.max(i5, zzj2 + zzj2)));
                    }
                }
            } else {
                int min2 = java.lang.Math.min(zzetVar.zzd(), this.zzc - this.zzd);
                com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzb;
                zzetVar.zzm(zzetVar3.zzi(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzetVar3.zzf(i7);
                    } else {
                        if (com.google.android.gms.internal.ads.zzfl.zzJ(zzetVar3.zzi(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzetVar3.zzf(this.zzc - 4);
                    }
                    zzetVar3.zzh(0);
                    this.zza.zzb(zzetVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
