package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzdk implements java.io.Serializable, com.google.android.gms.internal.auth.zzdj {
    final com.google.android.gms.internal.auth.zzdj zza;
    volatile transient boolean zzb;

    @javax.annotation.CheckForNull
    transient java.lang.Object zzc;

    public final java.lang.String toString() {
        java.lang.Object obj;
        if (this.zzb) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.zzc) + ">";
        } else {
            obj = this.zza;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final java.lang.Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    java.lang.Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }

    zzdk(com.google.android.gms.internal.auth.zzdj zzdjVar) {
        this.zza = zzdjVar;
    }
}
