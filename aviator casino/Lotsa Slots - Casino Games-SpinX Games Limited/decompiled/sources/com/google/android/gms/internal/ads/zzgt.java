package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgt {
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final byte zzl;
    public final byte zzm;

    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgt(com.google.android.gms.internal.ads.zzgs zzgsVar) throws com.google.android.gms.internal.ads.zzgr {
        byte b;
        boolean z = false;
        com.google.android.gms.internal.ads.zzgtj.zza(zzgsVar.zza == 1);
        int remaining = zzgsVar.zzb.remaining();
        byte[] bArr = new byte[remaining];
        zzgsVar.zzb.asReadOnlyBuffer().get(bArr);
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(bArr, remaining);
        this.zzg = zzesVar.zzj(3);
        zzesVar.zzg();
        boolean zzi = zzesVar.zzi();
        this.zza = zzi;
        if (zzi) {
            zzesVar.zzj(5);
            this.zzb = false;
            this.zzh = false;
        } else {
            if (zzesVar.zzi()) {
                zzesVar.zzh(64);
                if (zzesVar.zzi()) {
                    int i = 0;
                    while (!zzesVar.zzi()) {
                        i++;
                    }
                    if (i < 32) {
                        zzesVar.zzh(i);
                    }
                }
                boolean zzi2 = zzesVar.zzi();
                this.zzb = zzi2;
                if (zzi2) {
                    zzesVar.zzh(47);
                }
            } else {
                this.zzb = false;
            }
            this.zzh = zzesVar.zzi();
            int zzj = zzesVar.zzj(5);
            for (int i2 = 0; i2 <= zzj; i2++) {
                zzesVar.zzh(12);
                if (i2 == 0) {
                    if (zzesVar.zzj(5) > 7) {
                        zzesVar.zzi();
                    }
                } else if (zzesVar.zzj(5) > 7) {
                    zzesVar.zzg();
                }
                if (this.zzb) {
                    zzesVar.zzg();
                }
                if (this.zzh && zzesVar.zzi()) {
                    if (i2 == 0) {
                        zzesVar.zzj(4);
                    } else {
                        zzesVar.zzh(4);
                    }
                }
            }
        }
        int zzj2 = zzesVar.zzj(4);
        int zzj3 = zzesVar.zzj(4);
        zzesVar.zzh(zzj2 + 1);
        zzesVar.zzh(zzj3 + 1);
        if (this.zza) {
            this.zzc = false;
        } else {
            boolean zzi3 = zzesVar.zzi();
            this.zzc = zzi3;
            if (zzi3) {
                zzesVar.zzh(4);
                zzesVar.zzh(3);
            }
        }
        zzesVar.zzh(3);
        if (this.zza) {
            this.zze = true;
            this.zzd = true;
            this.zzf = 0;
        } else {
            zzesVar.zzh(4);
            boolean zzi4 = zzesVar.zzi();
            if (zzi4) {
                zzesVar.zzh(2);
            }
            if (zzesVar.zzi()) {
                this.zzd = true;
            } else {
                boolean zzi5 = zzesVar.zzi();
                this.zzd = zzi5;
                if (!zzi5) {
                    this.zze = true;
                    if (zzi4) {
                        this.zzf = 0;
                    } else {
                        this.zzf = zzesVar.zzj(3) + 1;
                    }
                }
            }
            if (zzesVar.zzi()) {
                this.zze = true;
            } else {
                this.zze = zzesVar.zzi();
            }
            if (zzi4) {
            }
        }
        zzesVar.zzh(3);
        boolean zzi6 = zzesVar.zzi();
        if (this.zzg == 2 && zzi6) {
            this.zzi = zzesVar.zzi();
        } else {
            this.zzi = false;
        }
        if (this.zzg != 1) {
            this.zzj = zzesVar.zzi();
        } else {
            this.zzj = false;
        }
        if (zzesVar.zzi()) {
            this.zzl = (byte) zzesVar.zzj(8);
            this.zzm = (byte) zzesVar.zzj(8);
            b = (byte) zzesVar.zzj(8);
        } else {
            this.zzl = (byte) 0;
            this.zzm = (byte) 0;
            b = 0;
        }
        if (this.zzj) {
            zzesVar.zzg();
            this.zzk = false;
        } else if (this.zzl == 1 && this.zzm == 13 && b == 0) {
            this.zzk = false;
        } else {
            zzesVar.zzg();
            int i3 = this.zzg;
            if (i3 == 0) {
                this.zzk = true;
                z = true;
            } else if (i3 == 1) {
                this.zzk = false;
            } else if (this.zzi) {
                boolean zzi7 = zzesVar.zzi();
                this.zzk = zzi7;
                if (zzi7) {
                    z = zzesVar.zzi();
                }
            } else {
                this.zzk = true;
            }
            if (this.zzk && z) {
                zzesVar.zzj(2);
            }
        }
        zzesVar.zzg();
    }

    public static com.google.android.gms.internal.ads.zzgt zza(com.google.android.gms.internal.ads.zzgs zzgsVar) {
        try {
            return new com.google.android.gms.internal.ads.zzgt(zzgsVar);
        } catch (com.google.android.gms.internal.ads.zzgr unused) {
            return null;
        }
    }
}
