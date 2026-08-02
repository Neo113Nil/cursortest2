package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzvp {
    private final com.google.android.libraries.places.internal.zzwx zza;
    private final java.lang.String zzb;

    public zzvp(com.google.android.libraries.places.internal.zzwx zzwxVar, java.lang.String str) {
        com.google.android.libraries.places.internal.zzxb.zza(zzwxVar, "parser");
        this.zza = zzwxVar;
        com.google.android.libraries.places.internal.zzxb.zza(str, "message");
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzvp)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzvp zzvpVar = (com.google.android.libraries.places.internal.zzvp) obj;
        return this.zza.equals(zzvpVar.zza) && this.zzb.equals(zzvpVar.zzb);
    }

    public final int hashCode() {
        java.lang.String str = this.zzb;
        return str.hashCode() ^ this.zza.hashCode();
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzwx zza() {
        return this.zza;
    }
}
