package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzj extends com.google.android.libraries.places.api.model.AutocompletePrediction {
    private final java.lang.String zza;
    private final java.lang.Integer zzb;
    private final java.util.List zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.util.List zzg;
    private final java.util.List zzh;
    private final java.util.List zzi;

    zzj(java.lang.String str, java.lang.Integer num, java.util.List list, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list2, java.util.List list3, java.util.List list4) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null placeId");
        }
        this.zza = str;
        this.zzb = num;
        if (list == null) {
            throw new java.lang.NullPointerException("Null types");
        }
        this.zzc = list;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null fullText");
        }
        this.zzd = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null primaryText");
        }
        this.zze = str3;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null secondaryText");
        }
        this.zzf = str4;
        if (list2 == null) {
            throw new java.lang.NullPointerException("Null fullTextMatchedSubstrings");
        }
        this.zzg = list2;
        if (list3 == null) {
            throw new java.lang.NullPointerException("Null primaryTextMatchedSubstrings");
        }
        this.zzh = list3;
        if (list4 == null) {
            throw new java.lang.NullPointerException("Null secondaryTextMatchedSubstrings");
        }
        this.zzi = list4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.AutocompletePrediction)) {
            return false;
        }
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = (com.google.android.libraries.places.api.model.AutocompletePrediction) obj;
        if (!this.zza.equals(autocompletePrediction.getPlaceId())) {
            return false;
        }
        java.lang.Integer num = this.zzb;
        if (num == null) {
            if (autocompletePrediction.getDistanceMeters() != null) {
                return false;
            }
        } else if (!num.equals(autocompletePrediction.getDistanceMeters())) {
            return false;
        }
        return this.zzc.equals(autocompletePrediction.getTypes()) && this.zzd.equals(autocompletePrediction.zza()) && this.zze.equals(autocompletePrediction.zzb()) && this.zzf.equals(autocompletePrediction.zzc()) && this.zzg.equals(autocompletePrediction.zzd()) && this.zzh.equals(autocompletePrediction.zze()) && this.zzi.equals(autocompletePrediction.zzf());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        java.lang.Integer num = this.zzb;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.zzc.hashCode();
        int hashCode4 = this.zzd.hashCode();
        int hashCode5 = this.zze.hashCode();
        int hashCode6 = this.zzf.hashCode();
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode();
    }

    public final java.lang.String toString() {
        java.util.List list = this.zzi;
        java.util.List list2 = this.zzh;
        java.util.List list3 = this.zzg;
        java.lang.String obj = this.zzc.toString();
        java.lang.String obj2 = list3.toString();
        java.lang.String obj3 = list2.toString();
        java.lang.String obj4 = list.toString();
        java.lang.Integer num = this.zzb;
        int length = java.lang.String.valueOf(num).length();
        int length2 = obj.length();
        int length3 = obj2.length();
        int length4 = obj3.length();
        int length5 = obj4.length();
        java.lang.String str = this.zza;
        int length6 = str.length();
        java.lang.String str2 = this.zzd;
        int length7 = str2.length();
        java.lang.String str3 = this.zze;
        int length8 = str3.length();
        java.lang.String str4 = this.zzf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length6 + 48 + length + 8 + length2 + 11 + length7 + 14 + length8 + 16 + str4.length() + 28 + length3 + 31 + length4 + 33 + length5 + 1);
        sb.append("AutocompletePrediction{placeId=");
        sb.append(str);
        sb.append(", distanceMeters=");
        sb.append(num);
        sb.append(", types=");
        sb.append(obj);
        sb.append(", fullText=");
        sb.append(str2);
        sb.append(", primaryText=");
        sb.append(str3);
        sb.append(", secondaryText=");
        sb.append(str4);
        sb.append(", fullTextMatchedSubstrings=");
        sb.append(obj2);
        sb.append(", primaryTextMatchedSubstrings=");
        sb.append(obj3);
        sb.append(", secondaryTextMatchedSubstrings=");
        sb.append(obj4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final java.util.List zzf() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final java.util.List zze() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final java.util.List zzd() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final java.lang.String zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final java.lang.String zzb() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    final java.lang.String zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public java.util.List<java.lang.String> getTypes() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public java.lang.String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction
    public java.lang.Integer getDistanceMeters() {
        return this.zzb;
    }
}
