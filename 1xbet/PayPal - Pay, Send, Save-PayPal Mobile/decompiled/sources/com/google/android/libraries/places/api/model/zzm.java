package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzm extends com.google.android.libraries.places.api.model.AutocompleteSessionToken {
    private final android.os.ParcelUuid zza;

    zzm(android.os.ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            throw new java.lang.NullPointerException("Null UUID");
        }
        this.zza = parcelUuid;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.api.model.AutocompleteSessionToken) {
            return this.zza.equals(((com.google.android.libraries.places.api.model.AutocompleteSessionToken) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompleteSessionToken
    final android.os.ParcelUuid zza() {
        return this.zza;
    }
}
