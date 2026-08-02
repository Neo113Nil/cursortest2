package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzc extends com.google.android.libraries.places.api.model.AddressComponent.Builder {
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.util.List zzc;

    final com.google.android.libraries.places.api.model.AddressComponent.Builder zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    final com.google.android.libraries.places.api.model.AddressComponent.Builder zzb(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null types");
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    final com.google.android.libraries.places.api.model.AddressComponent zzc() {
        java.util.List list;
        java.lang.String str = this.zza;
        if (str != null && (list = this.zzc) != null) {
            return new com.google.android.libraries.places.api.model.zzci(str, this.zzb, list);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" name");
        }
        if (this.zzc == null) {
            sb.append(" types");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final com.google.android.libraries.places.api.model.AddressComponent.Builder setShortName(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final java.lang.String getShortName() {
        return this.zzb;
    }

    zzc() {
    }
}
