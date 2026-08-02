package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
class zzbrt implements com.google.android.libraries.places.internal.zzbpl {
    private volatile boolean zza;
    private com.google.android.libraries.places.internal.zzbpn zzb;
    private com.google.android.libraries.places.internal.zzbpl zzc;
    private com.google.android.libraries.places.internal.zzbnp zzd;
    private com.google.android.libraries.places.internal.zzbrs zzf;
    private long zzg;
    private long zzh;
    private java.util.List zze = new java.util.ArrayList();
    private java.util.List zzi = new java.util.ArrayList();

    zzbrt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzp() {
        com.google.android.libraries.places.internal.zzbrs zzbrsVar;
        java.util.List list;
        java.util.List arrayList = new java.util.ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zze.isEmpty()) {
                    break;
                }
                list = this.zze;
                this.zze = arrayList;
            }
            if (zzbrsVar == null) {
                zzbrsVar.zze();
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.zze = null;
        this.zza = true;
        zzbrsVar = this.zzf;
        if (zzbrsVar == null) {
        }
    }

    private final void zzh(java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkState(this.zzb != null, "May only be called after start");
        synchronized (this) {
            if (this.zza) {
                runnable.run();
            } else {
                this.zze.add(runnable);
            }
        }
    }

    private final void zzi(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        java.util.Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.zzi = null;
        this.zzc.zzf(zzbpnVar);
    }

    private final void zzj(com.google.android.libraries.places.internal.zzbpl zzbplVar) {
        com.google.android.libraries.places.internal.zzbpl zzbplVar2 = this.zzc;
        com.google.common.base.Preconditions.checkState(zzbplVar2 == null, "realStream already set to %s", zzbplVar2);
        this.zzc = zzbplVar;
        this.zzh = java.lang.System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zza(com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        com.google.common.base.Preconditions.checkState(this.zzb == null, "May only be called before start");
        this.zzi.add(new com.google.android.libraries.places.internal.zzbri(this, zzbjvVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzb(int i) {
        com.google.common.base.Preconditions.checkState(this.zzb == null, "May only be called before start");
        this.zzi.add(new com.google.android.libraries.places.internal.zzbrh(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzc(int i) {
        com.google.common.base.Preconditions.checkState(this.zzb == null, "May only be called before start");
        this.zzi.add(new com.google.android.libraries.places.internal.zzbrg(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzd(com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        com.google.common.base.Preconditions.checkState(this.zzb == null, "May only be called before start");
        com.google.common.base.Preconditions.checkNotNull(zzbjyVar, "decompressorRegistry");
        this.zzi.add(new com.google.android.libraries.places.internal.zzbrf(this, zzbjyVar));
    }

    protected void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzf(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar;
        boolean z;
        com.google.common.base.Preconditions.checkNotNull(zzbpnVar, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.google.common.base.Preconditions.checkState(this.zzb == null, "already started");
        synchronized (this) {
            zzbnpVar = this.zzd;
            z = this.zza;
            if (!z) {
                com.google.android.libraries.places.internal.zzbrs zzbrsVar = new com.google.android.libraries.places.internal.zzbrs(zzbpnVar);
                this.zzf = zzbrsVar;
                zzbpnVar = zzbrsVar;
            }
            this.zzb = zzbpnVar;
            this.zzg = java.lang.System.nanoTime();
        }
        if (zzbnpVar != null) {
            zzbpnVar.zzc(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, new com.google.android.libraries.places.internal.zzbmg());
        } else if (z) {
            zzi(zzbpnVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final void zzk() {
        com.google.common.base.Preconditions.checkState(this.zzb != null, "May only be called after start");
        zzh(new com.google.android.libraries.places.internal.zzbrn(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public void zzl(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        boolean z = false;
        com.google.common.base.Preconditions.checkState(this.zzb != null, "May only be called after start");
        com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "reason");
        synchronized (this) {
            if (this.zzc == null) {
                zzj(com.google.android.libraries.places.internal.zzbwn.zza);
                this.zzd = zzbnpVar;
            } else {
                z = true;
            }
        }
        if (z) {
            zzh(new com.google.android.libraries.places.internal.zzbrm(this, zzbnpVar));
            return;
        }
        zzp();
        zze(zzbnpVar);
        this.zzb.zzc(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, new com.google.android.libraries.places.internal.zzbmg());
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final boolean zzm() {
        if (this.zza) {
            return this.zzc.zzm();
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public void zzn(com.google.android.libraries.places.internal.zzbtf zzbtfVar) {
        synchronized (this) {
            if (this.zzb == null) {
                return;
            }
            if (this.zzc != null) {
                zzbtfVar.zzb("buffered_nanos", java.lang.Long.valueOf(this.zzh - this.zzg));
                this.zzc.zzn(zzbtfVar);
            } else {
                zzbtfVar.zzb("buffered_nanos", java.lang.Long.valueOf(java.lang.System.nanoTime() - this.zzg));
                zzbtfVar.zza("waiting_for_connection");
            }
        }
    }

    final java.lang.Runnable zzo(com.google.android.libraries.places.internal.zzbpl zzbplVar) {
        synchronized (this) {
            if (this.zzc == null) {
                zzj((com.google.android.libraries.places.internal.zzbpl) com.google.common.base.Preconditions.checkNotNull(zzbplVar, "stream"));
                com.google.android.libraries.places.internal.zzbpn zzbpnVar = this.zzb;
                if (zzbpnVar == null) {
                    this.zze = null;
                    this.zza = true;
                }
                if (zzbpnVar != null) {
                    zzi(zzbpnVar);
                    return new com.google.android.libraries.places.internal.zzbrj(this);
                }
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzr() {
        com.google.common.base.Preconditions.checkState(this.zzb == null, "May only be called before start");
        this.zzi.add(new com.google.android.libraries.places.internal.zzbrd(this));
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzs(int i) {
        com.google.common.base.Preconditions.checkState(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzs(i);
        } else {
            zzh(new com.google.android.libraries.places.internal.zzbrc(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzt(java.io.InputStream inputStream) {
        com.google.common.base.Preconditions.checkState(this.zzb != null, "May only be called after start");
        com.google.common.base.Preconditions.checkNotNull(inputStream, "message");
        if (this.zza) {
            this.zzc.zzt(inputStream);
        } else {
            zzh(new com.google.android.libraries.places.internal.zzbrk(this, inputStream));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzu() {
        com.google.common.base.Preconditions.checkState(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzu();
        } else {
            zzh(new com.google.android.libraries.places.internal.zzbrl(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzv(com.google.android.libraries.places.internal.zzbjj zzbjjVar) {
        com.google.common.base.Preconditions.checkState(this.zzb == null, "May only be called before start");
        com.google.common.base.Preconditions.checkNotNull(zzbjjVar, "compressor");
        this.zzi.add(new com.google.android.libraries.places.internal.zzbre(this, zzbjjVar));
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpl zzq() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbpl
    public final com.google.android.libraries.places.internal.zzbio zzam() {
        throw null;
    }
}
