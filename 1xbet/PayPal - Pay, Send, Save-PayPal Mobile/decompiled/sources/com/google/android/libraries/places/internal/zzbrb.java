package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
final class zzbrb implements com.google.android.libraries.places.internal.zzbwd {
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.libraries.places.internal.zzbnx zzd;
    private java.lang.Runnable zze;
    private java.lang.Runnable zzf;
    private java.lang.Runnable zzg;
    private com.google.android.libraries.places.internal.zzbwc zzh;
    private final com.google.android.libraries.places.internal.zzbku zza = com.google.android.libraries.places.internal.zzbku.zza(com.google.android.libraries.places.internal.zzbrb.class, null);
    private final java.lang.Object zzb = new java.lang.Object();

    @javax.annotation.Nonnull
    private java.util.Collection zzi = new java.util.LinkedHashSet();
    private volatile com.google.android.libraries.places.internal.zzbra zzj = new com.google.android.libraries.places.internal.zzbra(null, null, null);

    zzbrb(java.util.concurrent.Executor executor, com.google.android.libraries.places.internal.zzbnx zzbnxVar) {
        this.zzc = executor;
        this.zzd = zzbnxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final java.lang.Runnable zzaq(com.google.android.libraries.places.internal.zzbwc zzbwcVar) {
        this.zzh = zzbwcVar;
        this.zze = new com.google.android.libraries.places.internal.zzbqv(this, zzbwcVar);
        this.zzf = new com.google.android.libraries.places.internal.zzbqw(this, zzbwcVar);
        this.zzg = new com.google.android.libraries.places.internal.zzbqx(this, zzbwcVar);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r4 = new com.google.android.libraries.places.internal.zzbqz(r3, r0, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r0.zza().zzk() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5.zzh() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r4.zzj(r5.zzf());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r3.zzi.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        r5 = r3.zzi.size();
     */
    @Override // com.google.android.libraries.places.internal.zzbpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.libraries.places.internal.zzbpl zzb(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr) {
        com.google.android.libraries.places.internal.zzbpl zzbsiVar;
        com.google.android.libraries.places.internal.zzbli zzbliVar;
        com.google.android.libraries.places.internal.zzbra zzbraVar;
        com.google.android.libraries.places.internal.zzbqz zzbqzVar;
        int size;
        try {
            com.google.android.libraries.places.internal.zzbxk zzbxkVar = new com.google.android.libraries.places.internal.zzbxk(zzbmlVar, zzbmgVar, zzbisVar, new com.google.android.libraries.places.internal.zzbwq(zzbjeVarArr));
            com.google.android.libraries.places.internal.zzbra zzbraVar2 = this.zzj;
            while (true) {
                com.google.android.libraries.places.internal.zzbnp zzbnpVar = zzbraVar2.zzb;
                if (zzbnpVar != null) {
                    zzbsiVar = new com.google.android.libraries.places.internal.zzbsi(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, zzbjeVarArr);
                    break;
                }
                com.google.android.libraries.places.internal.zzbln zzblnVar = zzbraVar2.zza;
                byte[] bArr = null;
                if (zzblnVar != null) {
                    zzbliVar = zzblnVar.zza(zzbxkVar);
                    com.google.android.libraries.places.internal.zzbis zza = zzbxkVar.zza();
                    com.google.android.libraries.places.internal.zzbpo zze = com.google.android.libraries.places.internal.zzbsz.zze(zzbliVar, zza.zzk());
                    if (zze != null) {
                        zzbsiVar = zze.zzb(zzbxkVar.zzc(), zzbxkVar.zzb(), zza, zzbjeVarArr);
                        break;
                    }
                } else {
                    zzbliVar = null;
                }
                java.lang.Object obj = this.zzb;
                synchronized (obj) {
                    zzbraVar = this.zzj;
                    if (zzbraVar2 == zzbraVar) {
                        break;
                    }
                }
                if (size == 1) {
                    this.zzd.zzb(this.zze);
                }
                for (com.google.android.libraries.places.internal.zzbje zzbjeVar : zzbjeVarArr) {
                }
                zzbsiVar = zzbqzVar;
                zzbraVar2 = zzbraVar;
            }
            return zzbsiVar;
        } finally {
            this.zzd.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zzd(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        java.lang.Runnable runnable;
        synchronized (this.zzb) {
            if (this.zzj.zzb != null) {
                return;
            }
            this.zzj = this.zzj.zzb(zzbnpVar);
            com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzd;
            zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbqy(this, zzbnpVar));
            if (!zzf() && (runnable = this.zzg) != null) {
                zzbnxVar.zzb(runnable);
                this.zzg = null;
            }
            this.zzd.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        java.util.Collection<com.google.android.libraries.places.internal.zzbqz> collection;
        java.lang.Runnable runnable;
        zzd(zzbnpVar);
        synchronized (this.zzb) {
            collection = this.zzi;
            runnable = this.zzg;
            this.zzg = null;
            if (!collection.isEmpty()) {
                this.zzi = java.util.Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (com.google.android.libraries.places.internal.zzbqz zzbqzVar : collection) {
                java.lang.Runnable zzo = zzbqzVar.zzo(new com.google.android.libraries.places.internal.zzbsi(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.REFUSED, zzbqzVar.zzi()));
                if (zzo != null) {
                    ((com.google.android.libraries.places.internal.zzbrj) zzo).zza.zzp();
                }
            }
            com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzd;
            zzbnxVar.zzb(runnable);
            zzbnxVar.zza();
        }
    }

    public final boolean zzf() {
        boolean isEmpty;
        synchronized (this.zzb) {
            isEmpty = this.zzi.isEmpty();
        }
        return !isEmpty;
    }

    final void zzg(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzbln zzblnVar) {
        java.lang.Runnable runnable;
        synchronized (this.zzb) {
            this.zzj = this.zzj.zza(zzblnVar);
            if (zzblnVar != null && zzf()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.zzi);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    com.google.android.libraries.places.internal.zzbqz zzbqzVar = (com.google.android.libraries.places.internal.zzbqz) arrayList.get(i);
                    com.google.android.libraries.places.internal.zzbli zza = zzblnVar.zza(zzbqzVar.zzh());
                    com.google.android.libraries.places.internal.zzbis zza2 = zzbqzVar.zzh().zza();
                    if (zza2.zzk() && zza.zzh()) {
                        zzbqzVar.zzj(zza.zzf());
                    }
                    com.google.android.libraries.places.internal.zzbpo zze = com.google.android.libraries.places.internal.zzbsz.zze(zza, zza2.zzk());
                    if (zze != null) {
                        java.util.concurrent.Executor executor = this.zzc;
                        if (zza2.zzj() != null) {
                            executor = zza2.zzj();
                        }
                        java.lang.Runnable zzg = zzbqzVar.zzg(zze, null);
                        if (zzg != null) {
                            executor.execute(zzg);
                        }
                        arrayList2.add(zzbqzVar);
                    }
                }
                synchronized (this.zzb) {
                    if (zzf()) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.zzi.remove((com.google.android.libraries.places.internal.zzbqz) it.next());
                        }
                        if (this.zzi.isEmpty()) {
                            this.zzi = new java.util.LinkedHashSet();
                        }
                        if (!zzf()) {
                            com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzd;
                            zzbnxVar.zzb(this.zzf);
                            if (this.zzj.zzb != null && (runnable = this.zzg) != null) {
                                zzbnxVar.zzb(runnable);
                                this.zzg = null;
                            }
                        }
                        this.zzd.zza();
                    }
                }
            }
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbra zzo() {
        return this.zzj;
    }

    final /* synthetic */ java.util.Collection zzn() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbwc zzm() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(java.lang.Runnable runnable) {
        this.zzg = null;
    }

    final /* synthetic */ java.lang.Runnable zzk() {
        return this.zzg;
    }

    final /* synthetic */ java.lang.Runnable zzj() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbnx zzi() {
        return this.zzd;
    }

    final /* synthetic */ java.lang.Object zzh() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbkz
    public final com.google.android.libraries.places.internal.zzbku zzc() {
        return this.zza;
    }
}
