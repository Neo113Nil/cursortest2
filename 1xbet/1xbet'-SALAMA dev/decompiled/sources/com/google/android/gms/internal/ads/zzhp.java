package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzhp implements zzlm, zzlp {
    private final int zzb;
    private zzlq zzd;
    private int zze;
    private zzor zzf;
    private zzcz zzg;
    private int zzh;
    private zzwk zzi;
    private zzz[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzuq zzq;
    private zzlo zzr;
    private final Object zza = new Object();
    private final zzkh zzc = new zzkh();
    private long zzm = Long.MIN_VALUE;
    private zzbn zzp = zzbn.zza;

    public zzhp(int i7) {
        this.zzb = i7;
    }

    private final void zzZ(long j, boolean z4) {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzz(j, z4);
    }

    public void zzA() {
    }

    public final void zzB() {
        zzlo zzloVar;
        synchronized (this.zza) {
            zzloVar = this.zzr;
        }
        if (zzloVar != null) {
            zzloVar.zza(this);
        }
    }

    public void zzC() {
    }

    public void zzD() {
    }

    public void zzE() {
    }

    public void zzF(zzz[] zzzVarArr, long j, long j3, zzuq zzuqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzG() {
        zzcv.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzH(zzz[] zzzVarArr, zzwk zzwkVar, long j, long j3, zzuq zzuqVar) {
        zzcv.zzf(!this.zzn);
        this.zzi = zzwkVar;
        this.zzq = zzuqVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzzVarArr;
        this.zzk = j3;
        zzF(zzzVarArr, j, j3, zzuqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzI() {
        zzcv.zzf(this.zzh == 0);
        zzkh zzkhVar = this.zzc;
        zzkhVar.zzb = null;
        zzkhVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzJ(long j) {
        zzZ(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzL(zzlo zzloVar) {
        synchronized (this.zza) {
            this.zzr = zzloVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public /* synthetic */ void zzM(float f7, float f8) {
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzN(zzbn zzbnVar) {
        zzbn zzbnVar2 = this.zzp;
        int i7 = zzen.zza;
        if (Objects.equals(zzbnVar2, zzbnVar)) {
            return;
        }
        this.zzp = zzbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzO() {
        zzcv.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzP() {
        zzcv.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        return zzwkVar.zze();
    }

    public final zzz[] zzT() {
        zzz[] zzzVarArr = this.zzj;
        zzzVarArr.getClass();
        return zzzVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzlm, com.google.android.gms.internal.ads.zzlp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final int zzcT() {
        return this.zzh;
    }

    public final int zzcU(zzkh zzkhVar, zzhg zzhgVar, int i7) {
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        int iZza = zzwkVar.zza(zzkhVar, zzhgVar, i7);
        if (iZza == -4) {
            if (zzhgVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhgVar.zze + this.zzk;
            zzhgVar.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (iZza == -5) {
            zzz zzzVar = zzkhVar.zza;
            zzzVar.getClass();
            long j3 = zzzVar.zzt;
            if (j3 != Long.MAX_VALUE) {
                zzx zzxVarZzb = zzzVar.zzb();
                zzxVarZzb.zzah(j3 + this.zzk);
                zzkhVar.zza = zzxVarZzb.zzaj();
                return -5;
            }
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final long zzcV() {
        return this.zzm;
    }

    public final zzia zzcW(Throwable th, zzz zzzVar, boolean z4, int i7) {
        int iZzY = 4;
        if (zzzVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzY = zzY(zzzVar) & 7;
            } catch (zzia unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzia.zzb(th, zzU(), this.zze, zzzVar, iZzY, this.zzq, z4, i7);
    }

    public final int zzd(long j) {
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        return zzwkVar.zzb(j - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public int zze() {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzbn zzh() {
        return this.zzp;
    }

    public final zzcz zzi() {
        zzcz zzczVar = this.zzg;
        zzczVar.getClass();
        return zzczVar;
    }

    public final zzkh zzk() {
        zzkh zzkhVar = this.zzc;
        zzkhVar.zzb = null;
        zzkhVar.zza = null;
        return zzkhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public zzkn zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzlp zzm() {
        return this;
    }

    public final zzlq zzn() {
        zzlq zzlqVar = this.zzd;
        zzlqVar.getClass();
        return zzlqVar;
    }

    public final zzor zzo() {
        zzor zzorVar = this.zzf;
        zzorVar.getClass();
        return zzorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzwk zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzq() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzr() {
        zzcv.zzf(this.zzh == 1);
        zzkh zzkhVar = this.zzc;
        zzkhVar.zzb = null;
        zzkhVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzs(zzlq zzlqVar, zzz[] zzzVarArr, zzwk zzwkVar, long j, boolean z4, boolean z7, long j3, long j7, zzuq zzuqVar) {
        zzcv.zzf(this.zzh == 0);
        this.zzd = zzlqVar;
        this.zzq = zzuqVar;
        this.zzh = 1;
        zzy(z4, z7);
        zzH(zzzVarArr, zzwkVar, j3, j7, zzuqVar);
        zzZ(j3, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public void zzu(int i7, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzv(int i7, zzor zzorVar, zzcz zzczVar) {
        this.zze = i7;
        this.zzf = zzorVar;
        this.zzg = zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzw() {
        zzwk zzwkVar = this.zzi;
        zzwkVar.getClass();
        zzwkVar.zzd();
    }

    public void zzx() {
        throw null;
    }

    public void zzy(boolean z4, boolean z7) {
    }

    public void zzz(long j, boolean z4) {
        throw null;
    }
}
