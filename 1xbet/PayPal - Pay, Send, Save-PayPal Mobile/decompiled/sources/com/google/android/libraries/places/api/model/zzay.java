package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzay extends com.google.android.libraries.places.api.model.PaymentOptions.Builder {
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zza;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzb;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzc;
    private com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue zzd;

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.PaymentOptions build() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zza;
        if (booleanPlaceAttributeValue4 != null && (booleanPlaceAttributeValue = this.zzb) != null && (booleanPlaceAttributeValue2 = this.zzc) != null && (booleanPlaceAttributeValue3 = this.zzd) != null) {
            return new com.google.android.libraries.places.api.model.zzek(booleanPlaceAttributeValue4, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" acceptsCreditCards");
        }
        if (this.zzb == null) {
            sb.append(" acceptsDebitCards");
        }
        if (this.zzc == null) {
            sb.append(" acceptsCashOnly");
        }
        if (this.zzd == null) {
            sb.append(" acceptsNfc");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCashOnly() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzc;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"acceptsCashOnly\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCreditCards() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zza;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"acceptsCreditCards\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsDebitCards() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzb;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"acceptsDebitCards\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsNfc() {
        com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzd;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new java.lang.IllegalStateException("Property \"acceptsNfc\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsCashOnly(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null acceptsCashOnly");
        }
        this.zzc = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsCreditCards(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null acceptsCreditCards");
        }
        this.zza = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsDebitCards(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null acceptsDebitCards");
        }
        this.zzb = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsNfc(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new java.lang.NullPointerException("Null acceptsNfc");
        }
        this.zzd = booleanPlaceAttributeValue;
        return this;
    }

    zzay() {
    }
}
