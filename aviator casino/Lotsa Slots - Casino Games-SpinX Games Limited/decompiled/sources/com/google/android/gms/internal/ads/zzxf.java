package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzxf extends com.google.android.gms.internal.ads.zzzp {
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzbe zzc;
    private final com.google.android.gms.internal.ads.zzbd zzd;
    private com.google.android.gms.internal.ads.zzxd zze;
    private com.google.android.gms.internal.ads.zzxc zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzxf(com.google.android.gms.internal.ads.zzxm zzxmVar, boolean z) {
        super(zzxmVar);
        boolean z2;
        if (z) {
            zzxmVar.zzI();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new com.google.android.gms.internal.ads.zzbe();
        this.zzd = new com.google.android.gms.internal.ads.zzbd();
        zzxmVar.zzH();
        this.zze = com.google.android.gms.internal.ads.zzxd.zzp(zzxmVar.zzJ());
    }

    private final java.lang.Object zzK(java.lang.Object obj) {
        return (this.zze.zzs() == null || !obj.equals(com.google.android.gms.internal.ads.zzxd.zzc)) ? obj : this.zze.zzs();
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        com.google.android.gms.internal.ads.zzxc zzxcVar = this.zzf;
        int zze = this.zze.zze(zzxcVar.zza.zza);
        if (zze == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zzxd zzxdVar = this.zze;
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzd;
        zzxdVar.zzd(zze, zzbdVar, false);
        long j2 = zzbdVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = java.lang.Math.max(0L, j2 - 1);
        }
        zzxcVar.zzo(j);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwj, com.google.android.gms.internal.ads.zzxm
    public final void zzA(com.google.android.gms.internal.ads.zzak zzakVar) {
        if (this.zzi) {
            com.google.android.gms.internal.ads.zzxd zzxdVar = this.zze;
            this.zze = zzxdVar.zzr(com.google.android.gms.internal.ads.zzzl.zzp(zzxdVar.zzb, zzakVar));
        } else {
            this.zze = com.google.android.gms.internal.ads.zzxd.zzp(zzakVar);
        }
        this.zza.zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((com.google.android.gms.internal.ads.zzzp) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzp, com.google.android.gms.internal.ads.zzxm
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzxc zzG(com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzabl zzablVar, long j) {
        com.google.android.gms.internal.ads.zzxc zzxcVar = new com.google.android.gms.internal.ads.zzxc(zzxkVar, zzablVar, j);
        zzxcVar.zzr(this.zza);
        if (this.zzh) {
            zzxcVar.zzt(zzxkVar.zza(zzK(zzxkVar.zza)));
        } else {
            this.zzf = zzxcVar;
            if (!this.zzg) {
                this.zzg = true;
                zzv(null, ((com.google.android.gms.internal.ads.zzzp) this).zza);
            }
        }
        return zzxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzp, com.google.android.gms.internal.ads.zzxm
    public final void zzD(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        ((com.google.android.gms.internal.ads.zzxc) zzxiVar).zzu();
        if (zzxiVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r6 != 0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzzp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        long j;
        com.google.android.gms.internal.ads.zzxk zzxkVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbfVar);
            com.google.android.gms.internal.ads.zzxc zzxcVar = this.zzf;
            if (zzxcVar != null) {
                zzL(zzxcVar.zzq());
            }
        } else if (zzbfVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : com.google.android.gms.internal.ads.zzxd.zzq(zzbfVar, com.google.android.gms.internal.ads.zzbe.zza, com.google.android.gms.internal.ads.zzxd.zzc);
        } else {
            com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzc;
            zzbfVar.zzb(0, zzbeVar, 0L);
            java.lang.Object obj = zzbeVar.zzb;
            com.google.android.gms.internal.ads.zzxc zzxcVar2 = this.zzf;
            if (zzxcVar2 != null) {
                j = zzxcVar2.zza();
                this.zze.zzo(zzxcVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbeVar, 0L);
            }
            j = 0;
            android.util.Pair zzm = zzbfVar.zzm(zzbeVar, this.zzd, 0, j);
            java.lang.Object obj2 = zzm.first;
            long longValue = ((java.lang.Long) zzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : com.google.android.gms.internal.ads.zzxd.zzq(zzbfVar, obj, obj2);
            com.google.android.gms.internal.ads.zzxc zzxcVar3 = this.zzf;
            if (zzxcVar3 != null && zzL(longValue)) {
                com.google.android.gms.internal.ads.zzxk zzxkVar2 = zzxcVar3.zza;
                zzxkVar = zzxkVar2.zza(zzK(zzxkVar2.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzxkVar != null) {
            com.google.android.gms.internal.ads.zzxc zzxcVar4 = this.zzf;
            zzxcVar4.getClass();
            zzxcVar4.zzt(zzxkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    protected final com.google.android.gms.internal.ads.zzxk zzF(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        java.lang.Object zzs = this.zze.zzs();
        java.lang.Object obj = zzxkVar.zza;
        if (zzs != null && this.zze.zzs().equals(obj)) {
            obj = com.google.android.gms.internal.ads.zzxd.zzc;
        }
        return zzxkVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzwj
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final com.google.android.gms.internal.ads.zzbf zzz() {
        return this.zze;
    }
}
