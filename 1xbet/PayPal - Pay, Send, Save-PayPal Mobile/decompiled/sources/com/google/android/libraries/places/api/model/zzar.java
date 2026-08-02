package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzar extends com.google.android.libraries.places.api.model.Money {
    private final java.lang.String zza;
    private final java.lang.Long zzb;
    private final java.lang.Integer zzc;

    zzar(java.lang.String str, java.lang.Long l, java.lang.Integer num) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null currencyCode");
        }
        this.zza = str;
        this.zzb = l;
        this.zzc = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.Money)) {
            return false;
        }
        com.google.android.libraries.places.api.model.Money money = (com.google.android.libraries.places.api.model.Money) obj;
        return this.zza.equals(money.getCurrencyCode()) && this.zzb.equals(money.getUnits()) && this.zzc.equals(money.getNanos());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Long l = this.zzb;
        int length = l.toString().length();
        java.lang.Integer num = this.zzc;
        int length2 = num.toString().length();
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 27 + length + 8 + length2 + 1);
        sb.append("Money{currencyCode=");
        sb.append(str);
        sb.append(", units=");
        sb.append(l);
        sb.append(", nanos=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final java.lang.Long getUnits() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final java.lang.Integer getNanos() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final java.lang.String getCurrencyCode() {
        return this.zza;
    }
}
