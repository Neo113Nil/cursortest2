package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzdm implements com.google.android.gms.internal.auth.zzdj {
    private static final com.google.android.gms.internal.auth.zzdj zza = new com.google.android.gms.internal.auth.zzdj() { // from class: com.google.android.gms.internal.auth.zzdl
        @Override // com.google.android.gms.internal.auth.zzdj
        public final java.lang.Object zza() {
            throw new java.lang.IllegalStateException();
        }
    };
    private volatile com.google.android.gms.internal.auth.zzdj zzb;

    @javax.annotation.CheckForNull
    private java.lang.Object zzc;

    public final java.lang.String toString() {
        java.lang.Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + java.lang.String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final java.lang.Object zza() {
        com.google.android.gms.internal.auth.zzdj zzdjVar = this.zzb;
        com.google.android.gms.internal.auth.zzdj zzdjVar2 = zza;
        if (zzdjVar != zzdjVar2) {
            synchronized (this) {
                if (this.zzb != zzdjVar2) {
                    java.lang.Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzdjVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }

    zzdm(com.google.android.gms.internal.auth.zzdj zzdjVar) {
        this.zzb = zzdjVar;
    }
}
