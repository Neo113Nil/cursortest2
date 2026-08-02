package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbi extends com.google.android.libraries.places.api.model.PlusCode {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.PlusCode)) {
            return false;
        }
        com.google.android.libraries.places.api.model.PlusCode plusCode = (com.google.android.libraries.places.api.model.PlusCode) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (plusCode.getCompoundCode() != null) {
                return false;
            }
        } else if (!str.equals(plusCode.getCompoundCode())) {
            return false;
        }
        java.lang.String str2 = this.zzb;
        if (str2 == null) {
            if (plusCode.getGlobalCode() != null) {
                return false;
            }
        } else if (!str2.equals(plusCode.getGlobalCode())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 35 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("PlusCode{compoundCode=");
        sb.append(str);
        sb.append(", globalCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public final java.lang.String getGlobalCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public final java.lang.String getCompoundCode() {
        return this.zza;
    }

    zzbi(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
