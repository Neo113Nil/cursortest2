package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzaq extends com.google.android.libraries.places.api.model.Money.Builder {
    private java.lang.String zza;
    private java.lang.Long zzb;
    private java.lang.Integer zzc;

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final java.lang.Integer getNanos() {
        java.lang.Integer num = this.zzc;
        if (num != null) {
            return num;
        }
        throw new java.lang.IllegalStateException("Property \"nanos\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final java.lang.Long getUnits() {
        java.lang.Long l = this.zzb;
        if (l != null) {
            return l;
        }
        throw new java.lang.IllegalStateException("Property \"units\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final com.google.android.libraries.places.api.model.Money.Builder setCurrencyCode(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null currencyCode");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final com.google.android.libraries.places.api.model.Money.Builder setNanos(java.lang.Integer num) {
        if (num == null) {
            throw new java.lang.NullPointerException("Null nanos");
        }
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final com.google.android.libraries.places.api.model.Money.Builder setUnits(java.lang.Long l) {
        if (l == null) {
            throw new java.lang.NullPointerException("Null units");
        }
        this.zzb = l;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    final com.google.android.libraries.places.api.model.Money zza() {
        java.lang.Long l;
        java.lang.Integer num;
        java.lang.String str = this.zza;
        if (str != null && (l = this.zzb) != null && (num = this.zzc) != null) {
            return new com.google.android.libraries.places.api.model.zzec(str, l, num);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" currencyCode");
        }
        if (this.zzb == null) {
            sb.append(" units");
        }
        if (this.zzc == null) {
            sb.append(" nanos");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzaq() {
    }
}
