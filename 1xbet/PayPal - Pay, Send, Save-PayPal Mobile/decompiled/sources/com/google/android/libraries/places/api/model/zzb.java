package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzb extends com.google.android.libraries.places.api.model.AccessibilityOptions {
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zza;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzb;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzc;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzd;

    zzb(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleParking");
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 == null) {
            throw new java.lang.NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.zzd = booleanPlaceAttributeValue4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.AccessibilityOptions)) {
            return false;
        }
        com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions = (com.google.android.libraries.places.api.model.AccessibilityOptions) obj;
        return this.zza.equals(accessibilityOptions.getWheelchairAccessibleParking()) && this.zzb.equals(accessibilityOptions.getWheelchairAccessibleEntrance()) && this.zzc.equals(accessibilityOptions.getWheelchairAccessibleRestroom()) && this.zzd.equals(accessibilityOptions.getWheelchairAccessibleSeating());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zzb.toString();
        int length2 = obj2.length();
        java.lang.String obj3 = this.zzc.toString();
        int length3 = obj3.length();
        java.lang.String obj4 = this.zzd.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 80 + length2 + 31 + length3 + 30 + obj4.length() + 1);
        sb.append("AccessibilityOptions{wheelchairAccessibleParking=");
        sb.append(obj);
        sb.append(", wheelchairAccessibleEntrance=");
        sb.append(obj2);
        sb.append(", wheelchairAccessibleRestroom=");
        sb.append(obj3);
        sb.append(", wheelchairAccessibleSeating=");
        sb.append(obj4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        return this.zzb;
    }
}
