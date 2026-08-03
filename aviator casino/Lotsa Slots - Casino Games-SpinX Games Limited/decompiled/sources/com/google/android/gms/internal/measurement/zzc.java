package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzc {
    final com.google.android.gms.internal.measurement.zzf zza;
    com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzab zzc;
    private final com.google.android.gms.internal.measurement.zzz zzd;

    public zzc() {
        com.google.android.gms.internal.measurement.zzf zzfVar = new com.google.android.gms.internal.measurement.zzf();
        this.zza = zzfVar;
        this.zzb = zzfVar.zzb.zzc();
        this.zzc = new com.google.android.gms.internal.measurement.zzab();
        this.zzd = new com.google.android.gms.internal.measurement.zzz();
        zzfVar.zzd.zza("internal.registerCallback", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.zzb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.measurement.zzc.this.zzg();
            }
        });
        zzfVar.zzd.zza("internal.eventLogger", new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return new com.google.android.gms.internal.measurement.zzk(com.google.android.gms.internal.measurement.zzc.this.zzc);
            }
        });
    }

    public final void zza(java.lang.String str, java.util.concurrent.Callable callable) {
        this.zza.zzd.zza(str, callable);
    }

    public final boolean zzb(com.google.android.gms.internal.measurement.zzaa zzaaVar) throws com.google.android.gms.internal.measurement.zzd {
        try {
            com.google.android.gms.internal.measurement.zzab zzabVar = this.zzc;
            zzabVar.zzb(zzaaVar);
            this.zza.zzc.zze("runtime.counter", new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(0.0d)));
            this.zzd.zzb(this.zzb.zzc(), zzabVar);
            if (zzc()) {
                return true;
            }
            return zzd();
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.measurement.zzd(th);
        }
    }

    public final boolean zzc() {
        com.google.android.gms.internal.measurement.zzab zzabVar = this.zzc;
        return !zzabVar.zzc().equals(zzabVar.zza());
    }

    public final boolean zzd() {
        return !this.zzc.zzf().isEmpty();
    }

    public final com.google.android.gms.internal.measurement.zzab zze() {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.internal.measurement.zzja zzjaVar) throws com.google.android.gms.internal.measurement.zzd {
        com.google.android.gms.internal.measurement.zzai zzaiVar;
        try {
            com.google.android.gms.internal.measurement.zzf zzfVar = this.zza;
            this.zzb = zzfVar.zzb.zzc();
            if (zzfVar.zza(this.zzb, (com.google.android.gms.internal.measurement.zzje[]) zzjaVar.zza().toArray(new com.google.android.gms.internal.measurement.zzje[0])) instanceof com.google.android.gms.internal.measurement.zzag) {
                throw new java.lang.IllegalStateException("Program loading failed");
            }
            for (com.google.android.gms.internal.measurement.zziy zziyVar : zzjaVar.zzb().zza()) {
                java.util.List zzb = zziyVar.zzb();
                java.lang.String zza = zziyVar.zza();
                java.util.Iterator it = zzb.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzao zza2 = zzfVar.zza(this.zzb, (com.google.android.gms.internal.measurement.zzje) it.next());
                    if (!(zza2 instanceof com.google.android.gms.internal.measurement.zzal)) {
                        throw new java.lang.IllegalArgumentException("Invalid rule definition");
                    }
                    com.google.android.gms.internal.measurement.zzg zzgVar = this.zzb;
                    if (zzgVar.zzd(zza)) {
                        com.google.android.gms.internal.measurement.zzao zzh = zzgVar.zzh(zza);
                        if (!(zzh instanceof com.google.android.gms.internal.measurement.zzai)) {
                            java.lang.String.valueOf(zza);
                            throw new java.lang.IllegalStateException("Invalid function name: ".concat(java.lang.String.valueOf(zza)));
                        }
                        zzaiVar = (com.google.android.gms.internal.measurement.zzai) zzh;
                    } else {
                        zzaiVar = null;
                    }
                    if (zzaiVar == null) {
                        java.lang.String.valueOf(zza);
                        throw new java.lang.IllegalStateException("Rule function is undefined: ".concat(java.lang.String.valueOf(zza)));
                    }
                    zzaiVar.zza(this.zzb, java.util.Collections.singletonList(zza2));
                }
            }
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.measurement.zzd(th);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.measurement.zzai zzg() {
        return new com.google.android.gms.internal.measurement.zzv(this.zzd);
    }
}
