package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zznw extends com.google.android.libraries.places.internal.zzob {
    private final com.google.android.gms.tasks.CancellationTokenSource zza;
    private final java.lang.String zzb;

    zznw(com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, java.lang.String str) {
        this.zza = cancellationTokenSource;
        if (str == null) {
            throw new java.lang.NullPointerException("Null placeId");
        }
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzob)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzob zzobVar = (com.google.android.libraries.places.internal.zzob) obj;
        return this.zza.equals(zzobVar.zza()) && this.zzb.equals(zzobVar.zzb());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String str = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 30 + str.length() + 1);
        sb.append("PlaceRequest{source=");
        sb.append(obj);
        sb.append(", placeId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzob
    public final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzoc
    public final com.google.android.gms.tasks.CancellationTokenSource zza() {
        return this.zza;
    }
}
