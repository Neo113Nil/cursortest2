package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaqq implements zzaqh {
    private final zzark zza;
    private String zzb;
    private zzaht zzc;
    private zzaqp zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaqy zzg = new zzaqy(32, 128);
    private final zzaqy zzh = new zzaqy(33, 128);
    private final zzaqy zzi = new zzaqy(34, 128);
    private final zzaqy zzj = new zzaqy(39, 128);
    private final zzaqy zzk = new zzaqy(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzeu zzn = new zzeu();

    public zzaqq(zzark zzarkVar, String str) {
        this.zza = zzarkVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzh(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzi(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzaqy zzaqyVar = this.zzg;
            zzaqyVar.zze(i2);
            zzaqy zzaqyVar2 = this.zzh;
            zzaqyVar2.zze(i2);
            zzaqy zzaqyVar3 = this.zzi;
            zzaqyVar3.zze(i2);
            if (zzaqyVar.zzb() && zzaqyVar2.zzb() && zzaqyVar3.zzb()) {
                String str = this.zzb;
                int i3 = zzaqyVar.zzb;
                byte[] bArr = new byte[zzaqyVar2.zzb + i3 + zzaqyVar3.zzb];
                System.arraycopy(zzaqyVar.zza, 0, bArr, 0, i3);
                System.arraycopy(zzaqyVar2.zza, 0, bArr, zzaqyVar.zzb, zzaqyVar2.zzb);
                System.arraycopy(zzaqyVar3.zza, 0, bArr, zzaqyVar.zzb + zzaqyVar2.zzb, zzaqyVar3.zzb);
                String str2 = null;
                zzgl zzg = zzgr.zzg(zzaqyVar2.zza, 3, zzaqyVar2.zzb, null);
                zzgg zzggVar = zzg.zzb;
                if (zzggVar != null) {
                    int i4 = zzggVar.zzf;
                    int[] iArr = zzggVar.zze;
                    int i5 = zzggVar.zzd;
                    str2 = zzdr.zzc(zzggVar.zza, zzggVar.zzb, zzggVar.zzc, i5, iArr, i4);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzn("video/mp2t");
                zztVar.zzo("video/hevc");
                zztVar.zzk(str2);
                zztVar.zzv(zzg.zze);
                zztVar.zzw(zzg.zzf);
                zztVar.zzx(zzg.zzg);
                zztVar.zzy(zzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzg.zzk);
                zzhVar.zzb(zzg.zzl);
                zzhVar.zzc(zzg.zzm);
                zzhVar.zze(zzg.zzc + 8);
                zzhVar.zzf(zzg.zzd + 8);
                zztVar.zzF(zzhVar.zzg());
                zztVar.zzC(zzg.zzi);
                zztVar.zzq(zzg.zzj);
                zztVar.zzG(zzg.zza + 1);
                zztVar.zzr(Collections.singletonList(bArr));
                zzv zzQ = zztVar.zzQ();
                this.zzc.zzA(zzQ);
                int i6 = zzQ.zzr;
                zzguk.zzi(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        zzaqy zzaqyVar4 = this.zzj;
        if (zzaqyVar4.zze(i2)) {
            int zza = zzgr.zza(zzaqyVar4.zza, zzaqyVar4.zzb);
            zzeu zzeuVar = this.zzn;
            zzeuVar.zzb(zzaqyVar4.zza, zza);
            zzeuVar.zzk(5);
            this.zza.zzc(j2, zzeuVar);
        }
        zzaqy zzaqyVar5 = this.zzk;
        if (zzaqyVar5.zze(i2)) {
            int zza2 = zzgr.zza(zzaqyVar5.zza, zzaqyVar5.zzb);
            zzeu zzeuVar2 = this.zzn;
            zzeuVar2.zzb(zzaqyVar5.zza, zza2);
            zzeuVar2.zzk(5);
            this.zza.zzc(j2, zzeuVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgr.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaqp zzaqpVar = this.zzd;
        if (zzaqpVar != null) {
            zzaqpVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzb = zzarvVar.zzc();
        this.zzc = zzagkVar.zzs(zzarvVar.zzb(), 2);
        this.zzd = new zzaqp(this.zzc);
        this.zza.zza(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzeu zzeuVar) {
        int i;
        int i2;
        int i3;
        this.zzc.getClass();
        String str = zzfm.zza;
        while (zzeuVar.zzd() > 0) {
            int zzg = zzeuVar.zzg();
            int zze = zzeuVar.zze();
            byte[] zzi = zzeuVar.zzi();
            this.zzl += zzeuVar.zzd();
            this.zzc.zzc(zzeuVar, zzeuVar.zzd());
            while (zzg < zze) {
                int zzi2 = zzgr.zzi(zzi, zzg, zze, this.zzf);
                if (zzi2 == zze) {
                    zzh(zzi, zzg, zze);
                    return;
                }
                int i4 = zzi[zzi2 + 3] & 126;
                if (zzi2 > 0) {
                    int i5 = zzi2 - 1;
                    if (zzi[i5] == 0) {
                        i2 = 4;
                        i = i5;
                        i3 = i - zzg;
                        if (i3 > 0) {
                            zzh(zzi, zzg, i);
                        }
                        int i6 = zze - i;
                        long j = this.zzl - i6;
                        zzi(j, i6, i3 >= 0 ? -i3 : 0, this.zzm);
                        zzg(j, i6, i4 >> 1, this.zzm);
                        zzg = i + i2;
                    }
                }
                i = zzi2;
                i2 = 3;
                i3 = i - zzg;
                if (i3 > 0) {
                }
                int i62 = zze - i;
                long j2 = this.zzl - i62;
                zzi(j2, i62, i3 >= 0 ? -i3 : 0, this.zzm);
                zzg(j2, i62, i4 >> 1, this.zzm);
                zzg = i + i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        this.zzc.getClass();
        String str = zzfm.zza;
        this.zza.zzd();
        zzi(this.zzl, 0, 0, this.zzm);
        zzg(this.zzl, 0, 48, this.zzm);
    }
}
