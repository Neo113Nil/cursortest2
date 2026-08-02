package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbk extends com.google.android.libraries.places.api.model.zzgf {
    private final com.google.android.libraries.places.api.model.Money zza;
    private final com.google.android.libraries.places.api.model.Money zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.zzgf)) {
            return false;
        }
        com.google.android.libraries.places.api.model.zzgf zzgfVar = (com.google.android.libraries.places.api.model.zzgf) obj;
        com.google.android.libraries.places.api.model.Money money = this.zza;
        if (money == null) {
            if (zzgfVar.zza() != null) {
                return false;
            }
        } else if (!money.equals(zzgfVar.zza())) {
            return false;
        }
        com.google.android.libraries.places.api.model.Money money2 = this.zzb;
        if (money2 == null) {
            if (zzgfVar.zzb() != null) {
                return false;
            }
        } else if (!money2.equals(zzgfVar.zzb())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.Money money = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(money);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 33 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append("PriceRange{startPrice=");
        sb.append(valueOf);
        sb.append(", endPrice=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.libraries.places.api.model.Money money = this.zza;
        int hashCode = money == null ? 0 : money.hashCode();
        com.google.android.libraries.places.api.model.Money money2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (money2 != null ? money2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.zzgf
    public final com.google.android.libraries.places.api.model.Money zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzgf
    public final com.google.android.libraries.places.api.model.Money zza() {
        return this.zza;
    }

    zzbk(com.google.android.libraries.places.api.model.Money money, com.google.android.libraries.places.api.model.Money money2) {
        this.zza = money;
        this.zzb = money2;
    }
}
