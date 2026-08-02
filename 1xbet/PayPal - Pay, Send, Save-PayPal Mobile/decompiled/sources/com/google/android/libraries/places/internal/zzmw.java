package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzmw extends com.google.android.libraries.places.internal.zzmz {
    private final java.lang.String zza;
    private final int zzb;
    private final com.google.android.libraries.places.internal.zzmy zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzmz)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzmz zzmzVar = (com.google.android.libraries.places.internal.zzmz) obj;
        return this.zza.equals(zzmzVar.zza()) && this.zzb == zzmzVar.zzb() && this.zzc.equals(zzmzVar.zzc());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzc.toString();
        int i = this.zzb;
        int length = java.lang.String.valueOf(i).length();
        int length2 = obj.length();
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 40 + length + 16 + length2 + 1);
        sb.append("ClientProfile{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        sb.append(", requestSource=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzmz
    public final com.google.android.libraries.places.internal.zzmy zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzmz
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzmz
    public final java.lang.String zza() {
        return this.zza;
    }

    /* synthetic */ zzmw(java.lang.String str, int i, com.google.android.libraries.places.internal.zzmy zzmyVar, byte[] bArr) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzmyVar;
    }
}
