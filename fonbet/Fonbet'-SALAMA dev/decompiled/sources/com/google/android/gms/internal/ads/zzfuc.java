package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
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
        Object obj = this.zzc;
        if (obj == zza) {
            obj = AbstractC0486a1.h("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return AbstractC0486a1.h("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final Object zza() {
        zzftz zzftzVar = this.zzc;
        zzftz zzftzVar2 = zza;
        if (zzftzVar != zzftzVar2) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc != zzftzVar2) {
                        Object zza2 = this.zzc.zza();
                        this.zzd = zza2;
                        this.zzc = zzftzVar2;
                        return zza2;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
