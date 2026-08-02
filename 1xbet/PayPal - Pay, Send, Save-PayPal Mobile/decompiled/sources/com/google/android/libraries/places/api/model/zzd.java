package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzd extends com.google.android.libraries.places.api.model.AddressComponent {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.util.List zzc;

    zzd(java.lang.String str, java.lang.String str2, java.util.List list) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.zza = str;
        this.zzb = str2;
        if (list == null) {
            throw new java.lang.NullPointerException("Null types");
        }
        this.zzc = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.AddressComponent)) {
            return false;
        }
        com.google.android.libraries.places.api.model.AddressComponent addressComponent = (com.google.android.libraries.places.api.model.AddressComponent) obj;
        if (!this.zza.equals(addressComponent.getName())) {
            return false;
        }
        java.lang.String str = this.zzb;
        if (str == null) {
            if (addressComponent.getShortName() != null) {
                return false;
            }
        } else if (!str.equals(addressComponent.getShortName())) {
            return false;
        }
        return this.zzc.equals(addressComponent.getTypes());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        java.lang.String str = this.zzb;
        return ((((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zzc.toString();
        java.lang.String str = this.zzb;
        int length = java.lang.String.valueOf(str).length();
        int length2 = obj.length();
        java.lang.String str2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 34 + length + 8 + length2 + 1);
        sb.append("AddressComponent{name=");
        sb.append(str2);
        sb.append(", shortName=");
        sb.append(str);
        sb.append(", types=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final java.util.List<java.lang.String> getTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final java.lang.String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final java.lang.String getName() {
        return this.zza;
    }
}
