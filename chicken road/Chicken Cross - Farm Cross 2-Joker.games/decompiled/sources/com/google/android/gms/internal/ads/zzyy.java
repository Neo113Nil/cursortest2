package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzyy extends zzwp implements zzym {
    private final zzhr zza;
    private final zzyg zzb;
    private final zzus zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private zziq zzj;
    private zzak zzk;
    private final zzabz zzl;

    /* synthetic */ zzyy(zzak zzakVar, zzhr zzhrVar, zzyg zzygVar, zzus zzusVar, zzabz zzabzVar, int i, boolean z, int i2, zzv zzvVar, zzgvc zzgvcVar, byte[] bArr) {
        this.zzk = zzakVar;
        this.zza = zzhrVar;
        this.zzb = zzygVar;
        this.zzc = zzusVar;
        this.zzl = zzabzVar;
        this.zzd = i;
    }

    private final void zzv() {
        long j = this.zzf;
        boolean z = this.zzg;
        boolean z2 = this.zzh;
        zzak zzK = zzK();
        zzzk zzzkVar = new zzzk(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzK, z2 ? zzK.zzc : null);
        zze(this.zze ? new zzyv(this, zzzkVar) : zzzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final synchronized void zzB(zzak zzakVar) {
        this.zzk = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzE(zzxm zzxmVar) {
        ((zzyu) zzxmVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxm zzH(zzxo zzxoVar, zzabp zzabpVar, long j) {
        zzhs zza = this.zza.zza();
        zziq zziqVar = this.zzj;
        if (zziqVar != null) {
            zza.zze(zziqVar);
        }
        zzag zzagVar = zzK().zzb;
        zzagVar.getClass();
        return new zzyu(zzagVar.zza, zza, this.zzb.zza(zzk()), this.zzc, zzh(zzxoVar), this.zzl, zzf(zzxoVar), this, zzabpVar, null, this.zzd, false, 0, null, zzfm.zzt(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final synchronized zzak zzK() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final void zza(zziq zziqVar) {
        this.zzj = zziqVar;
        Looper.myLooper().getClass();
        zzk();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzb(long j, zzahk zzahkVar, boolean z) {
        if (this.zzi && zzahkVar.zzj()) {
            return;
        }
        this.zzi = !zzahkVar.zzj();
        if (j == -9223372036854775807L) {
            j = this.zzf;
        }
        boolean zzb = zzahkVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zzb && this.zzh == z) {
            return;
        }
        this.zzf = j;
        this.zzg = zzb;
        this.zzh = z;
        this.zze = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzu() {
    }
}
