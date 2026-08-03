package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzadq implements com.google.android.gms.internal.ads.zzbt {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzbs zzb;
    private final android.util.SparseArray zzc;
    private final boolean zzd;
    private final com.google.android.gms.internal.ads.zzaeu zze;
    private final com.google.android.gms.internal.ads.zzdo zzf;
    private final java.util.concurrent.CopyOnWriteArraySet zzg;
    private final long zzh;
    private final com.google.android.gms.internal.ads.zzadv zzi;
    private com.google.android.gms.internal.ads.zzfh zzj = new com.google.android.gms.internal.ads.zzfh(10);
    private com.google.android.gms.internal.ads.zzv zzk;
    private com.google.android.gms.internal.ads.zzdz zzl;
    private android.util.Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.android.gms.internal.ads.zzi zzC(com.google.android.gms.internal.ads.zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? com.google.android.gms.internal.ads.zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final com.google.android.gms.internal.ads.zzaeu zzb(int i) {
        android.util.SparseArray sparseArray = this.zzc;
        if (com.google.android.gms.internal.ads.zzfl.zza(sparseArray, 0)) {
            return (com.google.android.gms.internal.ads.zzaeu) sparseArray.get(0);
        }
        com.google.android.gms.internal.ads.zzadk zzadkVar = new com.google.android.gms.internal.ads.zzadk(this, this.zza, 0);
        this.zzg.add(zzadkVar);
        sparseArray.put(0, zzadkVar);
        return zzadkVar;
    }

    public final void zzc(android.view.Surface surface, com.google.android.gms.internal.ads.zzeu zzeuVar) {
        android.util.Pair pair = this.zzm;
        if (pair != null && ((android.view.Surface) pair.first).equals(surface) && ((com.google.android.gms.internal.ads.zzeu) this.zzm.second).equals(zzeuVar)) {
            return;
        }
        this.zzm = android.util.Pair.create(surface, zzeuVar);
        zzeuVar.zza();
        zzeuVar.zzb();
    }

    public final void zzd() {
        com.google.android.gms.internal.ads.zzeu zzeuVar = com.google.android.gms.internal.ads.zzeu.zza;
        zzeuVar.zza();
        zzeuVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzl;
        if (zzdzVar != null) {
            zzdzVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv zzvVar, int i) {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzo == 0);
        com.google.android.gms.internal.ads.zzi zzC = zzC(zzvVar.zzF);
        try {
            int i2 = zzC.zzd;
            try {
                if (i2 == 7) {
                    if (android.os.Build.VERSION.SDK_INT < 34 && com.google.android.gms.internal.ads.zzdx.zzd()) {
                        com.google.android.gms.internal.ads.zzh zzd = zzC.zzd();
                        zzd.zzc(6);
                        zzC = zzd.zzg();
                        com.google.android.gms.internal.ads.zzi zziVar = zzC;
                        com.google.android.gms.internal.ads.zzdo zzdoVar = this.zzf;
                        android.os.Looper myLooper = android.os.Looper.myLooper();
                        myLooper.getClass();
                        this.zzl = zzdoVar.zzd(myLooper, null);
                        com.google.android.gms.internal.ads.zzbs zzbsVar = this.zzb;
                        android.content.Context context = this.zza;
                        com.google.android.gms.internal.ads.zzl zzlVar = com.google.android.gms.internal.ads.zzl.zzb;
                        final com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzl;
                        java.util.Objects.requireNonNull(zzdzVar);
                        zzbsVar.zza(context, zziVar, zzlVar, this, new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzadj
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(java.lang.Runnable runnable) {
                                com.google.android.gms.internal.ads.zzdz.this.zzm(runnable);
                            }
                        }, 0L, false);
                        throw null;
                    }
                    i2 = 7;
                }
                if (!com.google.android.gms.internal.ads.zzdx.zzc(i2) && android.os.Build.VERSION.SDK_INT >= 29) {
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(i2)};
                    java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                    com.google.android.gms.internal.ads.zzeg.zzc("PlaybackVidGraphWrapper", java.lang.String.format(java.util.Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zzC = com.google.android.gms.internal.ads.zzi.zza;
                    com.google.android.gms.internal.ads.zzi zziVar2 = zzC;
                    com.google.android.gms.internal.ads.zzdo zzdoVar2 = this.zzf;
                    android.os.Looper myLooper2 = android.os.Looper.myLooper();
                    myLooper2.getClass();
                    this.zzl = zzdoVar2.zzd(myLooper2, null);
                    com.google.android.gms.internal.ads.zzbs zzbsVar2 = this.zzb;
                    android.content.Context context2 = this.zza;
                    com.google.android.gms.internal.ads.zzl zzlVar2 = com.google.android.gms.internal.ads.zzl.zzb;
                    final com.google.android.gms.internal.ads.zzdz zzdzVar2 = this.zzl;
                    java.util.Objects.requireNonNull(zzdzVar2);
                    zzbsVar2.zza(context2, zziVar2, zzlVar2, this, new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzadj
                        @Override // java.util.concurrent.Executor
                        public final /* synthetic */ void execute(java.lang.Runnable runnable) {
                            com.google.android.gms.internal.ads.zzdz.this.zzm(runnable);
                        }
                    }, 0L, false);
                    throw null;
                }
                com.google.android.gms.internal.ads.zzbs zzbsVar22 = this.zzb;
                android.content.Context context22 = this.zza;
                com.google.android.gms.internal.ads.zzl zzlVar22 = com.google.android.gms.internal.ads.zzl.zzb;
                final com.google.android.gms.internal.ads.zzdz zzdzVar22 = this.zzl;
                java.util.Objects.requireNonNull(zzdzVar22);
                zzbsVar22.zza(context22, zziVar2, zzlVar22, this, new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzadj
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(java.lang.Runnable runnable) {
                        com.google.android.gms.internal.ads.zzdz.this.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (com.google.android.gms.internal.ads.zzbo e) {
                throw new com.google.android.gms.internal.ads.zzaet(e, zzvVar);
            }
            if (i2 == 2 || i2 == 10) {
                zzC = com.google.android.gms.internal.ads.zzi.zza;
            }
            com.google.android.gms.internal.ads.zzi zziVar22 = zzC;
            com.google.android.gms.internal.ads.zzdo zzdoVar22 = this.zzf;
            android.os.Looper myLooper22 = android.os.Looper.myLooper();
            myLooper22.getClass();
            this.zzl = zzdoVar22.zzd(myLooper22, null);
        } catch (com.google.android.gms.internal.ads.zzdw e2) {
            throw new com.google.android.gms.internal.ads.zzaet(e2, zzvVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j, long j2) {
        this.zze.zzv(j, j2);
    }

    final /* synthetic */ void zzm(boolean z) {
        if (this.zzo == 1) {
            this.zzn++;
            com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zze;
            zzaeuVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                com.google.android.gms.internal.ads.zzadp zzadpVar = (com.google.android.gms.internal.ads.zzadp) this.zzj.zzd();
                zzadpVar.getClass();
                zzaeuVar.zzs(1, this.zzk, zzadpVar.zza, zzadpVar.zzb, com.google.android.gms.internal.ads.zzgwm.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z) {
                this.zzq = -9223372036854775807L;
            }
            com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzl;
            zzdzVar.getClass();
            zzdzVar.zzm(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzadl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzadq.this.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzadr zzadrVar) {
        this.zze.zzl(zzadrVar);
    }

    final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzadv zzv() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfh zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(com.google.android.gms.internal.ads.zzfh zzfhVar) {
        this.zzj = zzfhVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }

    /* synthetic */ zzadq(com.google.android.gms.internal.ads.zzadi zzadiVar, byte[] bArr) {
        this.zza = zzadiVar.zze();
        com.google.android.gms.internal.ads.zzbs zzg = zzadiVar.zzg();
        zzg.getClass();
        this.zzb = zzg;
        this.zzc = new android.util.SparseArray();
        com.google.android.gms.internal.ads.zzgwm.zzi();
        this.zzd = zzadiVar.zzh();
        com.google.android.gms.internal.ads.zzdo zzi = zzadiVar.zzi();
        this.zzf = zzi;
        this.zzh = -zzadiVar.zzj();
        com.google.android.gms.internal.ads.zzadv zzk = zzadiVar.zzk();
        this.zzi = zzk;
        this.zze = new com.google.android.gms.internal.ads.zzacv(zzadiVar.zzf(), zzk, zzi);
        new com.google.android.gms.internal.ads.zzadh(this);
        this.zzg = new java.util.concurrent.CopyOnWriteArraySet();
        this.zzk = new com.google.android.gms.internal.ads.zzt().zzO();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }
}
