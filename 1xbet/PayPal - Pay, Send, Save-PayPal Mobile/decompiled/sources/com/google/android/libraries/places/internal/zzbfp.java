package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfp implements java.util.Map.Entry, java.lang.Comparable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbfs zza;
    private final java.lang.Comparable zzb;
    private java.lang.Object zzc;

    zzbfp(com.google.android.libraries.places.internal.zzbfs zzbfsVar, java.lang.Comparable comparable, java.lang.Object obj) {
        java.util.Objects.requireNonNull(zzbfsVar);
        this.zza = zzbfsVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.zzb.compareTo(((com.google.android.libraries.places.internal.zzbfp) obj).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.zzb;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.zzc;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.zza.zzh();
        java.lang.Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzc);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final java.lang.Comparable zza() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.zzb;
    }
}
