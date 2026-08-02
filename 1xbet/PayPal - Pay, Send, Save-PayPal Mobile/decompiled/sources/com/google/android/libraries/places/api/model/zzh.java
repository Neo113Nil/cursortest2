package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzh extends com.google.android.libraries.places.api.model.AuthorAttributions {
    private final java.util.List zza;

    zzh(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null asList");
        }
        this.zza = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.model.AuthorAttributions) {
            return this.zza.equals(((com.google.android.libraries.places.api.model.AuthorAttributions) obj).asList());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 27);
        sb.append("AuthorAttributions{asList=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AuthorAttributions
    public final java.util.List<com.google.android.libraries.places.api.model.AuthorAttribution> asList() {
        return this.zza;
    }
}
