package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zze extends com.google.android.libraries.places.api.model.AddressComponents {
    private final java.util.List zza;

    zze(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null asList");
        }
        this.zza = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.model.AddressComponents) {
            return this.zza.equals(((com.google.android.libraries.places.api.model.AddressComponents) obj).asList());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 26);
        sb.append("AddressComponents{asList=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponents
    public final java.util.List<com.google.android.libraries.places.api.model.AddressComponent> asList() {
        return this.zza;
    }
}
