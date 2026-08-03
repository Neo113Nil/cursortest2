package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfw {
    private static final java.lang.Object zze = new java.lang.Object();
    private final java.lang.String zza;
    private final com.google.android.gms.measurement.internal.zzbn zzb;
    private final java.lang.Object zzc;
    private final java.lang.Object zzd = new java.lang.Object();
    private volatile java.lang.Object zzf = null;
    private volatile java.lang.Object zzg = null;

    /* synthetic */ zzfw(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.google.android.gms.measurement.internal.zzbn zzbnVar, byte[] bArr) {
        this.zza = str;
        this.zzc = obj;
        this.zzb = zzbnVar;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.Object zzb(java.lang.Object obj) {
        java.util.List<com.google.android.gms.measurement.internal.zzfw> list;
        synchronized (this.zzd) {
        }
        if (obj != null) {
            return obj;
        }
        if (com.google.android.gms.measurement.internal.zzfr.zza == null) {
            return this.zzc;
        }
        synchronized (zze) {
            if (com.google.android.gms.measurement.internal.zzae.zza()) {
                return this.zzg == null ? this.zzc : this.zzg;
            }
            try {
                list = com.google.android.gms.measurement.internal.zzfx.zzbk;
                for (com.google.android.gms.measurement.internal.zzfw zzfwVar : list) {
                    if (com.google.android.gms.measurement.internal.zzae.zza()) {
                        throw new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    java.lang.Object obj2 = null;
                    try {
                        com.google.android.gms.measurement.internal.zzbn zzbnVar = zzfwVar.zzb;
                        if (zzbnVar != null) {
                            obj2 = zzbnVar.zza();
                        }
                    } catch (java.lang.IllegalStateException unused) {
                    }
                    synchronized (zze) {
                        zzfwVar.zzg = obj2;
                    }
                }
            } catch (java.lang.SecurityException unused2) {
            }
            com.google.android.gms.measurement.internal.zzbn zzbnVar2 = this.zzb;
            if (zzbnVar2 != null) {
                try {
                    return zzbnVar2.zza();
                } catch (java.lang.IllegalStateException | java.lang.SecurityException unused3) {
                }
            }
            return this.zzc;
        }
    }
}
