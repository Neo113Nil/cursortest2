package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzca extends com.google.android.libraries.places.api.model.SubDestination.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final com.google.android.libraries.places.api.model.SubDestination build() {
        java.lang.String str;
        java.lang.String str2 = this.zza;
        if (str2 != null && (str = this.zzb) != null) {
            return new com.google.android.libraries.places.api.model.zzfo(str2, str);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" id");
        }
        if (this.zzb == null) {
            sb.append(" name");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final com.google.android.libraries.places.api.model.SubDestination.Builder setId(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final com.google.android.libraries.places.api.model.SubDestination.Builder setName(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.zzb = str;
        return this;
    }

    zzca() {
    }
}
