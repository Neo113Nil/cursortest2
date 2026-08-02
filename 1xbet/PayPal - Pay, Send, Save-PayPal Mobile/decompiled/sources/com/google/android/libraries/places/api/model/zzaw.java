package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzaw extends com.google.android.libraries.places.api.model.ParkingOptions.Builder {
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zza;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzb;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzc;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzd;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zze;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzf;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzg;

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions build() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7 = this.zza;
        if (booleanPlaceAttributeValue7 != null && (booleanPlaceAttributeValue = this.zzb) != null && (booleanPlaceAttributeValue2 = this.zzc) != null && (booleanPlaceAttributeValue3 = this.zzd) != null && (booleanPlaceAttributeValue4 = this.zze) != null && (booleanPlaceAttributeValue5 = this.zzf) != null && (booleanPlaceAttributeValue6 = this.zzg) != null) {
            return new com.google.android.libraries.places.api.model.zzei(booleanPlaceAttributeValue7, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" freeParkingLot");
        }
        if (this.zzb == null) {
            sb.append(" paidParkingLot");
        }
        if (this.zzc == null) {
            sb.append(" freeStreetParking");
        }
        if (this.zzd == null) {
            sb.append(" paidStreetParking");
        }
        if (this.zze == null) {
            sb.append(" valetParking");
        }
        if (this.zzf == null) {
            sb.append(" freeGarageParking");
        }
        if (this.zzg == null) {
            sb.append(" paidGarageParking");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeGarageParking() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzf;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"freeGarageParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeParkingLot() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zza;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"freeParkingLot\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeStreetParking() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzc;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"freeStreetParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidGarageParking() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzg;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"paidGarageParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidParkingLot() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzb;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"paidParkingLot\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidStreetParking() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzd;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"paidStreetParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getValetParking() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zze;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"valetParking\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions.Builder setFreeGarageParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null freeGarageParking");
        }
        this.zzf = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions.Builder setFreeParkingLot(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null freeParkingLot");
        }
        this.zza = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions.Builder setFreeStreetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null freeStreetParking");
        }
        this.zzc = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions.Builder setPaidGarageParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null paidGarageParking");
        }
        this.zzg = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions.Builder setPaidParkingLot(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null paidParkingLot");
        }
        this.zzb = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions.Builder setPaidStreetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null paidStreetParking");
        }
        this.zzd = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions.Builder
    public final com.google.android.libraries.places.api.model.ParkingOptions.Builder setValetParking(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null valetParking");
        }
        this.zze = booleanPlaceAttributeValue;
        return this;
    }

    zzaw() {
    }
}
