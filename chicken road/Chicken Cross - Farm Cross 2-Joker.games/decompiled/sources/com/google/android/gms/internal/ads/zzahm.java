package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahm implements zzagh {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzagk zzf;
    private zzaht zzg;

    public zzahm(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        int i = this.zza;
        zzguk.zzi((i == -1 || this.zzb == -1) ? false : true);
        int i2 = this.zzb;
        zzeu zzeuVar = new zzeu(i2);
        zzagiVar.zzi(zzeuVar.zzi(), 0, i2);
        return zzeuVar.zzt() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzf = zzagkVar;
        zzaht zzs = zzagkVar.zzs(1024, 4);
        this.zzg = zzs;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzn(str);
        zztVar.zzo(str);
        zzs.zzA(zztVar.zzQ());
        this.zzf.zzv();
        this.zzf.zzw(new zzahn(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaht zzahtVar = this.zzg;
        zzahtVar.getClass();
        int zza = zzahtVar.zza(zzagiVar, 1024, true);
        if (zza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
