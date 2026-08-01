package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaqo implements zzaqh {
    private final zzark zza;
    private long zzf;
    private String zzh;
    private zzaht zzi;
    private zzaqn zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzaqy zzc = new zzaqy(7, 128);
    private final zzaqy zzd = new zzaqy(8, 128);
    private final zzaqy zze = new zzaqy(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzeu zzn = new zzeu();

    public zzaqo(zzark zzarkVar, boolean z, boolean z2, String str) {
        this.zza = zzarkVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzh(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgr.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaqn zzaqnVar = this.zzj;
        if (zzaqnVar != null) {
            zzaqnVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzh = zzarvVar.zzc();
        this.zzi = zzagkVar.zzs(zzarvVar.zzb(), 2);
        this.zzj = new zzaqn(this.zzi, false, false);
        this.zza.zza(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzeu zzeuVar) {
        int i;
        int i2;
        int i3;
        this.zzi.getClass();
        String str = zzfm.zza;
        int zzg = zzeuVar.zzg();
        int zze = zzeuVar.zze();
        byte[] zzi = zzeuVar.zzi();
        this.zzf += zzeuVar.zzd();
        this.zzi.zzc(zzeuVar, zzeuVar.zzd());
        while (true) {
            int zzi2 = zzgr.zzi(zzi, zzg, zze, this.zzg);
            if (zzi2 == zze) {
                zzh(zzi, zzg, zze);
                return;
            }
            int i4 = zzi[zzi2 + 3] & Ascii.US;
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
                    long j = this.zzf - i6;
                    zzi(j, i6, i3 >= 0 ? -i3 : 0, this.zzl);
                    zzg(j, i4, this.zzl);
                    zzg = i + i2;
                }
            }
            i = zzi2;
            i2 = 3;
            i3 = i - zzg;
            if (i3 > 0) {
            }
            int i62 = zze - i;
            long j2 = this.zzf - i62;
            zzi(j2, i62, i3 >= 0 ? -i3 : 0, this.zzl);
            zzg(j2, i4, this.zzl);
            zzg = i + i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        this.zzi.getClass();
        String str = zzfm.zza;
        this.zza.zzd();
        zzi(this.zzf, 0, 0, this.zzl);
        zzg(this.zzf, 9, this.zzl);
        zzi(this.zzf, 0, 0, this.zzl);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzi(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzaqy zzaqyVar = this.zzc;
            zzaqyVar.zze(i2);
            zzaqy zzaqyVar2 = this.zzd;
            zzaqyVar2.zze(i2);
            if (this.zzk) {
                if (zzaqyVar.zzb()) {
                    zzgq zze = zzgr.zze(zzaqyVar.zza, 4, zzaqyVar.zzb);
                    this.zza.zzb(zze.zzm);
                    this.zzj.zza(zze);
                    zzaqyVar.zza();
                } else if (zzaqyVar2.zzb()) {
                    this.zzj.zzb(zzgr.zzh(zzaqyVar2.zza, 4, zzaqyVar2.zzb));
                    zzaqyVar2.zza();
                }
            } else if (zzaqyVar.zzb() && zzaqyVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqyVar.zza, zzaqyVar.zzb));
                arrayList.add(Arrays.copyOf(zzaqyVar2.zza, zzaqyVar2.zzb));
                zzgq zze2 = zzgr.zze(zzaqyVar.zza, 4, zzaqyVar.zzb);
                zzgp zzh = zzgr.zzh(zzaqyVar2.zza, 4, zzaqyVar2.zzb);
                String zzb = zzdr.zzb(zze2.zza, zze2.zzb, zze2.zzc);
                zzaht zzahtVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzn(this.zzb);
                zztVar.zzo("video/avc");
                zztVar.zzk(zzb);
                zztVar.zzv(zze2.zze);
                zztVar.zzw(zze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zze2.zzj);
                zzhVar.zzb(zze2.zzk);
                zzhVar.zzc(zze2.zzl);
                zzhVar.zze(zze2.zzh + 8);
                zzhVar.zzf(zze2.zzi + 8);
                zztVar.zzF(zzhVar.zzg());
                zztVar.zzC(zze2.zzg);
                zztVar.zzr(arrayList);
                int i3 = zze2.zzm;
                zztVar.zzq(i3);
                zzahtVar.zzA(zztVar.zzQ());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zze2);
                this.zzj.zzb(zzh);
                zzaqyVar.zza();
                zzaqyVar2.zza();
            }
        }
        zzaqy zzaqyVar3 = this.zze;
        if (zzaqyVar3.zze(i2)) {
            int zza = zzgr.zza(zzaqyVar3.zza, zzaqyVar3.zzb);
            zzeu zzeuVar = this.zzn;
            zzeuVar.zzb(zzaqyVar3.zza, zza);
            zzeuVar.zzh(4);
            this.zza.zzc(j2, zzeuVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
