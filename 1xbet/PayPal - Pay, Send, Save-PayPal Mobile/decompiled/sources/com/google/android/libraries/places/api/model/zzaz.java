package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzaz extends com.google.android.libraries.places.api.model.PaymentOptions {
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zza;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzb;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzc;
    private final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzd;

    zzaz(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null acceptsCreditCards");
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            throw new java.lang.NullPointerException("Null acceptsDebitCards");
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new java.lang.NullPointerException("Null acceptsCashOnly");
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 == null) {
            throw new java.lang.NullPointerException("Null acceptsNfc");
        }
        this.zzd = booleanPlaceAttributeValue4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.PaymentOptions)) {
            return false;
        }
        com.google.android.libraries.places.api.model.PaymentOptions paymentOptions = (com.google.android.libraries.places.api.model.PaymentOptions) obj;
        return this.zza.equals(paymentOptions.getAcceptsCreditCards()) && this.zzb.equals(paymentOptions.getAcceptsDebitCards()) && this.zzc.equals(paymentOptions.getAcceptsCashOnly()) && this.zzd.equals(paymentOptions.getAcceptsNfc());
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 54 + length2 + 18 + length3 + 13 + obj4.length() + 1);
        sb.append("PaymentOptions{acceptsCreditCards=");
        sb.append(obj);
        sb.append(", acceptsDebitCards=");
        sb.append(obj2);
        sb.append(", acceptsCashOnly=");
        sb.append(obj3);
        sb.append(", acceptsNfc=");
        sb.append(obj4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsNfc() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsDebitCards() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCreditCards() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCashOnly() {
        return this.zzc;
    }
}
