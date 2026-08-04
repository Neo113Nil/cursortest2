package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
final class zzfuc implements zzftz {
    private static final zzftz zza = new zzftz() { // from class: com.google.android.gms.internal.ads.zzfub
        @Override // com.google.android.gms.internal.ads.zzftz
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfug zzb = new zzfug();
    private volatile zzftz zzc;
    private Object zzd;

    public zzfuc(zzftz zzftzVar) {
        this.zzc = zzftzVar;
    }

    public final String toString() {
        Object objH = this.zzc;
        if (objH == zza) {
            objH = AbstractC0486a1.h("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return AbstractC0486a1.h("Suppliers.memoize(", String.valueOf(objH), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final Object zza() {
        zzftz zzftzVar = this.zzc;
        zzftz zzftzVar2 = zza;
        if (zzftzVar != zzftzVar2) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc != zzftzVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzftzVar2;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzd;
    }
}
