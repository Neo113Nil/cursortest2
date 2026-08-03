package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagt {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet(10);

    private final boolean zzb(com.google.android.gms.internal.ads.zzafz zzafzVar, int i) throws java.io.IOException {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
                    java.lang.System.arraycopy(zzetVar.zzi(), 10, zzetVar.zzi(), 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zza;
                int i6 = i4 + 10;
                zzafzVar.zzi(zzetVar2.zzi(), i6 - i5, i5);
                zzetVar2.zzh(i2);
                zzetVar2.zzf(i6);
                if (zzetVar2.zzq() == 4801587) {
                    return true;
                }
                if (com.google.android.gms.internal.ads.zzagw.zza(zzetVar2.zzr()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    zzetVar2.zzc(20);
                }
                i3++;
            } catch (java.io.EOFException unused) {
            }
        } while (i3 <= i);
        return false;
    }

    public final com.google.android.gms.internal.ads.zzap zza(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzajk zzajkVar, int i) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzap zzapVar = null;
        int i2 = 0;
        while (zzb(zzafzVar, i)) {
            com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
            int zzg = zzetVar.zzg();
            zzetVar.zzk(6);
            int zzG = zzetVar.zzG();
            int i3 = zzG + 10;
            if (zzapVar == null) {
                byte[] bArr = new byte[i3];
                java.lang.System.arraycopy(zzetVar.zzi(), zzg, bArr, 0, 10);
                zzafzVar.zzi(bArr, 10, zzG);
                zzapVar = com.google.android.gms.internal.ads.zzajn.zza(bArr, i3, zzajkVar, new com.google.android.gms.internal.ads.zzaiy());
            } else {
                zzafzVar.zzk(zzG);
            }
            i2 += i3;
        }
        zzafzVar.zzl();
        zzafzVar.zzk(i2);
        return zzapVar;
    }
}
