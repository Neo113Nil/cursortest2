package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzax extends com.google.android.libraries.places.api.model.ParkingOptions {
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zza;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzb;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzc;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzd;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zze;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzf;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzg;

    zzax(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null freeParkingLot");
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            throw new java.lang.NullPointerException("Null paidParkingLot");
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new java.lang.NullPointerException("Null freeStreetParking");
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 == null) {
            throw new java.lang.NullPointerException("Null paidStreetParking");
        }
        this.zzd = booleanPlaceAttributeValue4;
        if (booleanPlaceAttributeValue5 == null) {
            throw new java.lang.NullPointerException("Null valetParking");
        }
        this.zze = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            throw new java.lang.NullPointerException("Null freeGarageParking");
        }
        this.zzf = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 == null) {
            throw new java.lang.NullPointerException("Null paidGarageParking");
        }
        this.zzg = booleanPlaceAttributeValue7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.ParkingOptions)) {
            return false;
        }
        com.google.android.libraries.places.api.model.ParkingOptions parkingOptions = (com.google.android.libraries.places.api.model.ParkingOptions) obj;
        return this.zza.equals(parkingOptions.getFreeParkingLot()) && this.zzb.equals(parkingOptions.getPaidParkingLot()) && this.zzc.equals(parkingOptions.getFreeStreetParking()) && this.zzd.equals(parkingOptions.getPaidStreetParking()) && this.zze.equals(parkingOptions.getValetParking()) && this.zzf.equals(parkingOptions.getFreeGarageParking()) && this.zzg.equals(parkingOptions.getPaidGarageParking());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        int hashCode3 = this.zzc.hashCode();
        int hashCode4 = this.zzd.hashCode();
        int hashCode5 = this.zze.hashCode();
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zzb.toString();
        int length2 = obj2.length();
        java.lang.String obj3 = this.zzc.toString();
        int length3 = obj3.length();
        java.lang.String obj4 = this.zzd.toString();
        int length4 = obj4.length();
        java.lang.String obj5 = this.zze.toString();
        int length5 = obj5.length();
        java.lang.String obj6 = this.zzf.toString();
        int length6 = obj6.length();
        java.lang.String obj7 = this.zzg.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + length2 + 20 + length3 + 20 + length4 + 15 + length5 + 20 + length6 + 20 + obj7.length() + 1);
        sb.append("ParkingOptions{freeParkingLot=");
        sb.append(obj);
        sb.append(", paidParkingLot=");
        sb.append(obj2);
        sb.append(", freeStreetParking=");
        sb.append(obj3);
        sb.append(", paidStreetParking=");
        sb.append(obj4);
        sb.append(", valetParking=");
        sb.append(obj5);
        sb.append(", freeGarageParking=");
        sb.append(obj6);
        sb.append(", paidGarageParking=");
        sb.append(obj7);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getValetParking() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidStreetParking() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidParkingLot() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getPaidGarageParking() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeStreetParking() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeParkingLot() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ParkingOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getFreeGarageParking() {
        return this.zzf;
    }
}
