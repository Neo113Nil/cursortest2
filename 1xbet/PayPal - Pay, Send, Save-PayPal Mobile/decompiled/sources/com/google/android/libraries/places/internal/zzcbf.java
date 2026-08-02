package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbf extends com.google.android.libraries.places.internal.zzbtc implements com.google.android.libraries.places.internal.zzcbz {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcbg zza;
    private final int zzb;
    private final java.lang.Object zzc;
    private java.util.List zzd;
    private final com.google.android.libraries.places.internal.zzcff zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private final com.google.android.libraries.places.internal.zzcav zzk;
    private final com.google.android.libraries.places.internal.zzccd zzl;
    private final com.google.android.libraries.places.internal.zzcbp zzm;
    private boolean zzn;
    private final com.google.android.libraries.places.internal.zzcex zzo;
    private com.google.android.libraries.places.internal.zzcca zzp;
    private int zzq;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcbf(com.google.android.libraries.places.internal.zzcbg zzcbgVar, int i, com.google.android.libraries.places.internal.zzcaa zzcaaVar, java.lang.Object obj, com.google.android.libraries.places.internal.zzcav zzcavVar, com.google.android.libraries.places.internal.zzccd zzccdVar, com.google.android.libraries.places.internal.zzcbp zzcbpVar, int i2, java.lang.String str, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        super(i, zzcaaVar, r1, zzbisVar);
        com.google.android.libraries.places.internal.zzcal zzo;
        java.util.Objects.requireNonNull(zzcbgVar);
        this.zza = zzcbgVar;
        zzo = zzcbgVar.zzo();
        this.zze = new com.google.android.libraries.places.internal.zzcff();
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzn = true;
        this.zzq = -1;
        this.zzc = com.google.common.base.Preconditions.checkNotNull(obj, "lock");
        this.zzk = zzcavVar;
        this.zzl = zzccdVar;
        this.zzm = zzcbpVar;
        this.zzi = i2;
        this.zzj = i2;
        this.zzb = i2;
        this.zzo = com.google.android.libraries.places.internal.zzcew.zza(str);
    }

    private final void zzP(com.google.android.libraries.places.internal.zzbnp zzbnpVar, boolean z, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (!this.zzn) {
            this.zzm.zzn(this.zzq, zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, z, com.google.android.libraries.places.internal.zzccv.CANCEL, zzbmgVar);
            return;
        }
        this.zzm.zzj(this.zza);
        this.zzd = null;
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zze;
        zzcffVar.zzt(zzcffVar.zzb());
        this.zzn = false;
        if (zzbmgVar == null) {
            zzbmgVar = new com.google.android.libraries.places.internal.zzbmg();
        }
        zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, true, zzbmgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwe
    public final void zzD(int i) {
        int i2 = this.zzj - i;
        this.zzj = i2;
        int i3 = this.zzb;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.zzi += i4;
            this.zzj = i2 + i4;
            this.zzk.zzk(this.zzq, i4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwe
    public final void zzE(java.lang.Throwable th) {
        zzP(com.google.android.libraries.places.internal.zzbnp.zzb(th), true, new com.google.android.libraries.places.internal.zzbmg());
    }

    public final void zzF(int i) {
        com.google.common.base.Preconditions.checkState(this.zzq == -1, "the stream has been started with id %s", i);
        this.zzq = i;
        com.google.android.libraries.places.internal.zzccd zzccdVar = this.zzl;
        this.zzp = zzccdVar.zze(this, i);
        com.google.android.libraries.places.internal.zzcbg zzcbgVar = this.zza;
        com.google.android.libraries.places.internal.zzcbf zzJ = zzcbgVar.zzJ();
        super.zzr();
        zzJ.zzu().zza();
        if (this.zzn) {
            this.zzk.zzf(false, false, this.zzq, 0, this.zzd);
            zzcbgVar.zzH().zzb();
            this.zzd = null;
            com.google.android.libraries.places.internal.zzcff zzcffVar = this.zze;
            if (zzcffVar.zzb() > 0) {
                zzccdVar.zzc(this.zzf, this.zzp, zzcffVar, this.zzg);
            }
            this.zzn = false;
        }
    }

    public final void zzG(java.util.List list, boolean z) {
        if (z) {
            zzC(com.google.android.libraries.places.internal.zzcce.zzb(list));
        } else {
            zzA(com.google.android.libraries.places.internal.zzcce.zza(list));
        }
    }

    public final void zzH(com.google.android.libraries.places.internal.zzcff zzcffVar, boolean z, int i) {
        int zzb = this.zzi - (((int) zzcffVar.zzb()) + i);
        this.zzi = zzb;
        this.zzj -= i;
        if (zzb >= 0) {
            super.zzB(new com.google.android.libraries.places.internal.zzcbv(zzcffVar), z);
        } else {
            this.zzk.zzb(this.zzq, com.google.android.libraries.places.internal.zzccv.FLOW_CONTROL_ERROR);
            this.zzm.zzn(this.zzq, com.google.android.libraries.places.internal.zzbnp.zzh.zze("Received data size exceeded our receiving window size"), com.google.android.libraries.places.internal.zzbpm.PROCESSED, false, null, null);
        }
    }

    final com.google.android.libraries.places.internal.zzcca zzK() {
        com.google.android.libraries.places.internal.zzcca zzccaVar;
        synchronized (this.zzc) {
            zzccaVar = this.zzp;
        }
        return zzccaVar;
    }

    final /* synthetic */ void zzM(com.google.android.libraries.places.internal.zzcff zzcffVar, boolean z, boolean z2) {
        if (this.zzh) {
            return;
        }
        if (!this.zzn) {
            com.google.common.base.Preconditions.checkState(this.zzq != -1, "streamId should be set");
            this.zzl.zzc(z, this.zzp, zzcffVar, z2);
        } else {
            this.zze.zzc(zzcffVar, (int) zzcffVar.zzb());
            this.zzf |= z;
            this.zzg |= z2;
        }
    }

    final /* synthetic */ void zzN(com.google.android.libraries.places.internal.zzbmg zzbmgVar, java.lang.String str) {
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzm;
        boolean zzh = zzcbpVar.zzh();
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "headers");
        com.google.common.base.Preconditions.checkNotNull(str, "defaultPath");
        com.google.android.libraries.places.internal.zzcbg zzcbgVar = this.zza;
        java.lang.String zzI = zzcbgVar.zzI();
        com.google.common.base.Preconditions.checkNotNull(zzI, "authority");
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbsz.zzg);
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbsz.zzh);
        com.google.android.libraries.places.internal.zzbmc zzbmcVar = com.google.android.libraries.places.internal.zzbsz.zzi;
        zzbmgVar.zzd(zzbmcVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(com.google.android.libraries.places.internal.zzbkw.zzd(zzbmgVar) + 7);
        if (zzh) {
            arrayList.add(com.google.android.libraries.places.internal.zzcax.zzb);
        } else {
            arrayList.add(com.google.android.libraries.places.internal.zzcax.zza);
        }
        arrayList.add(com.google.android.libraries.places.internal.zzcax.zzc);
        java.lang.String zzG = zzcbgVar.zzG();
        arrayList.add(new com.google.android.libraries.places.internal.zzccz(com.google.android.libraries.places.internal.zzccz.zze, com.google.android.libraries.places.internal.zzcfi.zza(zzI)));
        arrayList.add(new com.google.android.libraries.places.internal.zzccz(com.google.android.libraries.places.internal.zzccz.zzc, com.google.android.libraries.places.internal.zzcfi.zza(str)));
        arrayList.add(new com.google.android.libraries.places.internal.zzccz(zzbmcVar.zzd(), zzG));
        arrayList.add(com.google.android.libraries.places.internal.zzcax.zze);
        arrayList.add(com.google.android.libraries.places.internal.zzcax.zzf);
        byte[][] zza = com.google.android.libraries.places.internal.zzcah.zza(zzbmgVar);
        for (int i = 0; i < zza.length; i += 2) {
            com.google.android.libraries.places.internal.zzcfj zzb = com.google.android.libraries.places.internal.zzcfi.zzb(zza[i]);
            if (zzb.zza().length != 0 && zzb.zza()[0] != 58) {
                arrayList.add(new com.google.android.libraries.places.internal.zzccz(zzb, com.google.android.libraries.places.internal.zzcfi.zzb(zza[i + 1])));
            }
        }
        this.zzd = arrayList;
        zzcbpVar.zzi(zzcbgVar, zzcbgVar.zzI());
    }

    @Override // com.google.android.libraries.places.internal.zzbof, com.google.android.libraries.places.internal.zzbwe
    public final void zzb(boolean z) {
        if (zzc()) {
            this.zzm.zzn(this.zzq, null, com.google.android.libraries.places.internal.zzbpm.PROCESSED, false, null, null);
        } else {
            this.zzm.zzn(this.zzq, null, com.google.android.libraries.places.internal.zzbpm.PROCESSED, false, com.google.android.libraries.places.internal.zzccv.CANCEL, null);
        }
        super.zzb(z);
    }

    @Override // com.google.android.libraries.places.internal.zzbom
    public final void zzy(java.lang.Runnable runnable) {
        synchronized (this.zzc) {
            runnable.run();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtc
    protected final void zzz(com.google.android.libraries.places.internal.zzbnp zzbnpVar, boolean z, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzP(zzbnpVar, false, zzbmgVar);
    }

    final /* synthetic */ java.lang.Object zzO() {
        return this.zzc;
    }

    final /* synthetic */ void zzL(com.google.android.libraries.places.internal.zzbnp zzbnpVar, boolean z, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzP(zzbnpVar, true, null);
    }

    final int zzJ() {
        return this.zzq;
    }

    final com.google.android.libraries.places.internal.zzcex zzI() {
        return this.zzo;
    }
}
