package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzcx extends com.google.android.gms.internal.fido.zzcs implements java.io.Serializable {
    final com.google.android.gms.internal.fido.zzcs zza;

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.fido.zzcx) {
            return this.zza.equals(((com.google.android.gms.internal.fido.zzcx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final com.google.android.gms.internal.fido.zzcs zza() {
        return this.zza;
    }

    zzcx(com.google.android.gms.internal.fido.zzcs zzcsVar) {
        this.zza = zzcsVar;
    }
}
