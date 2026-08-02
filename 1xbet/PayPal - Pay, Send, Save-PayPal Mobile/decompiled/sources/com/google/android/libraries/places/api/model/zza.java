package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zza extends com.google.android.libraries.places.api.model.AccessibilityOptions.Builder {
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zza;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzb;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzc;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzd;

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.AccessibilityOptions build() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zza;
        if (booleanPlaceAttributeValue4 != null && (booleanPlaceAttributeValue = this.zzb) != null && (booleanPlaceAttributeValue2 = this.zzc) != null && (booleanPlaceAttributeValue3 = this.zzd) != null) {
            return new com.google.android.libraries.places.api.model.zzcg(booleanPlaceAttributeValue4, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" wheelchairAccessibleParking");
        }
        if (this.zzb == null) {
            sb.append(" wheelchairAccessibleEntrance");
        }
        if (this.zzc == null) {
            sb.append(" wheelchairAccessibleRestroom");
        }
        if (this.zzd == null) {
            sb.append(" wheelchairAccessibleSeating");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzb;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"wheelchairAccessibleEntrance\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zza;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"wheelchairAccessibleParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzc;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"wheelchairAccessibleRestroom\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzd;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"wheelchairAccessibleSeating\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleEntrance(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.zzb = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleParking");
        }
        this.zza = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleRestroom(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.zzc = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions.Builder
    public final com.google.android.libraries.places.api.model.AccessibilityOptions.Builder setWheelchairAccessibleSeating(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.zzd = booleanPlaceAttributeValue;
        return this;
    }

    zza() {
    }
}
