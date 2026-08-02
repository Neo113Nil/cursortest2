package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzue implements com.google.android.libraries.places.internal.zztn {
    private final com.google.android.libraries.places.internal.zztn zza;
    private final java.lang.Object zzb;

    private zzue(com.google.android.libraries.places.internal.zztn zztnVar, java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzxb.zza(zztnVar, "log site key");
        this.zza = zztnVar;
        com.google.android.libraries.places.internal.zzxb.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    static com.google.android.libraries.places.internal.zztn zza(com.google.android.libraries.places.internal.zztn zztnVar, java.lang.Object obj) {
        return new com.google.android.libraries.places.internal.zzue(zztnVar, obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzue)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzue zzueVar = (com.google.android.libraries.places.internal.zzue) obj;
        return this.zza.equals(zzueVar.zza) && this.zzb.equals(zzueVar.zzb);
    }

    public final int hashCode() {
        java.lang.Object obj = this.zzb;
        return obj.hashCode() ^ this.zza.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + obj2.length() + 3);
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(obj);
        sb.append("', qualifier='");
        sb.append(obj2);
        sb.append("' }");
        return sb.toString();
    }
}
