package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgw {
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
    private zzgw(zzgv zzgvVar) throws zzgu {
        byte b;
        boolean z = false;
        zzguk.zza(zzgvVar.zza == 1);
        int remaining = zzgvVar.zzb.remaining();
        byte[] bArr = new byte[remaining];
        zzgvVar.zzb.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, remaining);
        this.zzg = zzetVar.zzj(3);
        zzetVar.zzg();
        boolean zzi = zzetVar.zzi();
        this.zza = zzi;
        if (zzi) {
            zzetVar.zzj(5);
            this.zzb = false;
            this.zzh = false;
        } else {
            if (zzetVar.zzi()) {
                zzetVar.zzh(64);
                if (zzetVar.zzi()) {
                    int i = 0;
                    while (!zzetVar.zzi()) {
                        i++;
                    }
                    if (i < 32) {
                        zzetVar.zzh(i);
                    }
                }
                boolean zzi2 = zzetVar.zzi();
                this.zzb = zzi2;
                if (zzi2) {
                    zzetVar.zzh(47);
                }
            } else {
                this.zzb = false;
            }
            this.zzh = zzetVar.zzi();
            int zzj = zzetVar.zzj(5);
            for (int i2 = 0; i2 <= zzj; i2++) {
                zzetVar.zzh(12);
                if (i2 == 0) {
                    if (zzetVar.zzj(5) > 7) {
                        zzetVar.zzi();
                    }
                } else if (zzetVar.zzj(5) > 7) {
                    zzetVar.zzg();
                }
                if (this.zzb) {
                    zzetVar.zzg();
                }
                if (this.zzh && zzetVar.zzi()) {
                    if (i2 == 0) {
                        zzetVar.zzj(4);
                    } else {
                        zzetVar.zzh(4);
                    }
                }
            }
        }
        int zzj2 = zzetVar.zzj(4);
        int zzj3 = zzetVar.zzj(4);
        zzetVar.zzh(zzj2 + 1);
        zzetVar.zzh(zzj3 + 1);
        if (this.zza) {
            this.zzc = false;
        } else {
            boolean zzi3 = zzetVar.zzi();
            this.zzc = zzi3;
            if (zzi3) {
                zzetVar.zzh(4);
                zzetVar.zzh(3);
            }
        }
        zzetVar.zzh(3);
        if (this.zza) {
            this.zze = true;
            this.zzd = true;
            this.zzf = 0;
        } else {
            zzetVar.zzh(4);
            boolean zzi4 = zzetVar.zzi();
            if (zzi4) {
                zzetVar.zzh(2);
            }
            if (zzetVar.zzi()) {
                this.zzd = true;
            } else {
                boolean zzi5 = zzetVar.zzi();
                this.zzd = zzi5;
                if (!zzi5) {
                    this.zze = true;
                    if (zzi4) {
                        this.zzf = 0;
                    } else {
                        this.zzf = zzetVar.zzj(3) + 1;
                    }
                }
            }
            if (zzetVar.zzi()) {
                this.zze = true;
            } else {
                this.zze = zzetVar.zzi();
            }
            if (zzi4) {
            }
        }
        zzetVar.zzh(3);
        boolean zzi6 = zzetVar.zzi();
        if (this.zzg == 2 && zzi6) {
            this.zzi = zzetVar.zzi();
        } else {
            this.zzi = false;
        }
        if (this.zzg != 1) {
            this.zzj = zzetVar.zzi();
        } else {
            this.zzj = false;
        }
        if (zzetVar.zzi()) {
            this.zzl = (byte) zzetVar.zzj(8);
            this.zzm = (byte) zzetVar.zzj(8);
            b = (byte) zzetVar.zzj(8);
        } else {
            this.zzl = (byte) 0;
            this.zzm = (byte) 0;
            b = 0;
        }
        if (this.zzj) {
            zzetVar.zzg();
            this.zzk = false;
        } else if (this.zzl == 1 && this.zzm == 13 && b == 0) {
            this.zzk = false;
        } else {
            zzetVar.zzg();
            int i3 = this.zzg;
            if (i3 == 0) {
                this.zzk = true;
                z = true;
            } else if (i3 == 1) {
                this.zzk = false;
            } else if (this.zzi) {
                boolean zzi7 = zzetVar.zzi();
                this.zzk = zzi7;
                if (zzi7) {
                    z = zzetVar.zzi();
                }
            } else {
                this.zzk = true;
            }
            if (this.zzk && z) {
                zzetVar.zzj(2);
            }
        }
        zzetVar.zzg();
    }

    public static zzgw zza(zzgv zzgvVar) {
        try {
            return new zzgw(zzgvVar);
        } catch (zzgu unused) {
            return null;
        }
    }
}
