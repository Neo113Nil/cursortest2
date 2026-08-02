package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzcb extends com.google.android.libraries.places.api.model.SubDestination {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    zzcb(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.zza = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.SubDestination)) {
            return false;
        }
        com.google.android.libraries.places.api.model.SubDestination subDestination = (com.google.android.libraries.places.api.model.SubDestination) obj;
        return this.zza.equals(subDestination.getId()) && this.zzb.equals(subDestination.getName());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        int length = str.length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 25 + str2.length() + 1);
        sb.append("SubDestination{id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination
    public final java.lang.String getName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination
    public final java.lang.String getId() {
        return this.zza;
    }
}
