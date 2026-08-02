package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzglu {
    private static final zzglu zza = (zzglu) zzgnh.zza(new zzgng() { // from class: com.google.android.gms.internal.ads.zzgls
        @Override // com.google.android.gms.internal.ads.zzgng
        public final Object zza() {
            zzglu zzgluVar = new zzglu();
            zzgluVar.zzg(new zzgkm(zzgku.class, zzgmw.class, new zzgkn() { // from class: com.google.android.gms.internal.ads.zzglt
                @Override // com.google.android.gms.internal.ads.zzgkn
                public final zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar) {
                    return ((zzgku) zzgcsVar).zzb(zzgdjVar);
                }
            }));
            return zzgluVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgnf(new zzgnb(), null));

    public static zzglu zzc() {
        return zza;
    }

    public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
        return ((zzgnf) this.zzb.get()).zza(zzgnaVar, zzgdjVar);
    }

    public final zzgdf zzb(zzgna zzgnaVar) {
        return ((zzgnf) this.zzb.get()).zzb(zzgnaVar);
    }

    public final zzgna zzd(zzgcs zzgcsVar, Class cls, zzgdj zzgdjVar) {
        return ((zzgnf) this.zzb.get()).zzc(zzgcsVar, cls, zzgdjVar);
    }

    public final zzgna zze(zzgdf zzgdfVar, Class cls) {
        return ((zzgnf) this.zzb.get()).zzd(zzgdfVar, cls);
    }

    public final synchronized void zzf(zzgkl zzgklVar) {
        zzgnb zzgnbVar = new zzgnb((zzgnf) this.zzb.get());
        zzgnbVar.zza(zzgklVar);
        this.zzb.set(new zzgnf(zzgnbVar, null));
    }

    public final synchronized void zzg(zzgkp zzgkpVar) {
        zzgnb zzgnbVar = new zzgnb((zzgnf) this.zzb.get());
        zzgnbVar.zzb(zzgkpVar);
        this.zzb.set(new zzgnf(zzgnbVar, null));
    }

    public final synchronized void zzh(zzglz zzglzVar) {
        zzgnb zzgnbVar = new zzgnb((zzgnf) this.zzb.get());
        zzgnbVar.zzc(zzglzVar);
        this.zzb.set(new zzgnf(zzgnbVar, null));
    }

    public final synchronized void zzi(zzgmd zzgmdVar) {
        zzgnb zzgnbVar = new zzgnb((zzgnf) this.zzb.get());
        zzgnbVar.zzd(zzgmdVar);
        this.zzb.set(new zzgnf(zzgnbVar, null));
    }

    public final boolean zzj(zzgna zzgnaVar) {
        return ((zzgnf) this.zzb.get()).zzi(zzgnaVar);
    }

    public final boolean zzk(zzgna zzgnaVar) {
        return ((zzgnf) this.zzb.get()).zzj(zzgnaVar);
    }
}
