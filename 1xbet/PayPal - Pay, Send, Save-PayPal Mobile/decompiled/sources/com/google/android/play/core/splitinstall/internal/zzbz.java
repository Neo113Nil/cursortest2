package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzbz implements com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.play.core.splitinstall.internal.zzcb zzb;
    private volatile java.lang.Object zzc = zza;

    public static com.google.android.play.core.splitinstall.internal.zzby zzb(com.google.android.play.core.splitinstall.internal.zzcb zzcbVar) {
        return zzcbVar instanceof com.google.android.play.core.splitinstall.internal.zzby ? (com.google.android.play.core.splitinstall.internal.zzby) zzcbVar : new com.google.android.play.core.splitinstall.internal.zzbz(zzcbVar);
    }

    public static com.google.android.play.core.splitinstall.internal.zzcb zzc(com.google.android.play.core.splitinstall.internal.zzcb zzcbVar) {
        return zzcbVar instanceof com.google.android.play.core.splitinstall.internal.zzbz ? zzcbVar : new com.google.android.play.core.splitinstall.internal.zzbz(zzcbVar);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final java.lang.Object zza() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.zzc;
        java.lang.Object obj3 = zza;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.zzc;
            if (obj == obj3) {
                obj = this.zzb.zza();
                java.lang.Object obj4 = this.zzc;
                if (obj4 != obj3 && obj4 != obj) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj4);
                    sb.append(" & ");
                    sb.append(obj);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                this.zzc = obj;
                this.zzb = null;
            }
        }
        return obj;
    }

    private zzbz(com.google.android.play.core.splitinstall.internal.zzcb zzcbVar) {
        this.zzb = zzcbVar;
    }
}
