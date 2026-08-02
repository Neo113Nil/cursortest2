package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbid implements com.google.android.libraries.places.internal.zzbih {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.libraries.places.internal.zzbih zzb;
    private volatile java.lang.Object zzc = zza;

    private final java.lang.Object zzc() {
        synchronized (this) {
            java.lang.Object obj = this.zzc;
            java.lang.Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            java.lang.Object zzb = this.zzb.zzb();
            java.lang.Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != zzb) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Scoped provider was invoked recursively returning different results: ");
                sb.append(obj3);
                sb.append(" & ");
                sb.append(zzb);
                sb.append(". This is likely due to a circular dependency.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcez
    public final java.lang.Object zzb() {
        java.lang.Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }

    public static com.google.android.libraries.places.internal.zzbih zza(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        return zzbihVar instanceof com.google.android.libraries.places.internal.zzbid ? zzbihVar : new com.google.android.libraries.places.internal.zzbid(zzbihVar);
    }

    private zzbid(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        this.zzb = zzbihVar;
    }
}
