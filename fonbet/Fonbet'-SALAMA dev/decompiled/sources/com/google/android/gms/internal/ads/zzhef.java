package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhef implements zzhep, zzhea {
    private static final Object zza = new Object();
    private volatile zzhep zzb;
    private volatile Object zzc = zza;

    private zzhef(zzhep zzhepVar) {
        this.zzb = zzhepVar;
    }

    public static zzhea zza(zzhep zzhepVar) {
        return zzhepVar instanceof zzhea ? (zzhea) zzhepVar : new zzhef(zzhepVar);
    }

    public static zzhep zzc(zzhep zzhepVar) {
        return zzhepVar instanceof zzhef ? zzhepVar : new zzhef(zzhepVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object zzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != zzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
