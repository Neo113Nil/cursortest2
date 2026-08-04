package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class zzfua implements Serializable, zzftz {
    final zzftz zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfug zzd = new zzfug();

    public zzfua(zzftz zzftzVar) {
        this.zza = zzftzVar;
    }

    public final String toString() {
        return AbstractC0486a1.h("Suppliers.memoize(", (this.zzb ? AbstractC0486a1.h("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzc;
    }
}
