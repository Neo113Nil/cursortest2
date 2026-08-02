package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
abstract class zznk extends com.google.android.libraries.places.internal.zznq {
    private final com.google.android.libraries.places.internal.zzow zza;
    private final com.google.android.libraries.places.widget.model.AutocompleteActivityMode zzb;
    private final com.google.common.collect.ImmutableList zzc;
    private final com.google.android.libraries.places.internal.zzor zzd;
    private final com.google.android.gms.maps.model.LatLng zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final com.google.android.libraries.places.api.model.LocationBias zzh;
    private final com.google.android.libraries.places.api.model.LocationRestriction zzi;
    private final com.google.common.collect.ImmutableList zzj;
    private final com.google.common.collect.ImmutableList zzk;
    private final int zzl;
    private final int zzm;
    private final java.lang.String zzn;
    private final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzo;
    private final boolean zzp;
    private final com.google.android.libraries.places.api.model.AutocompleteSessionToken zzq;

    zznk(com.google.android.libraries.places.internal.zzow zzowVar, com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode, com.google.common.collect.ImmutableList immutableList, com.google.android.libraries.places.internal.zzor zzorVar, com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2, com.google.android.libraries.places.api.model.LocationBias locationBias, com.google.android.libraries.places.api.model.LocationRestriction locationRestriction, com.google.common.collect.ImmutableList immutableList2, com.google.common.collect.ImmutableList immutableList3, int i, int i2, java.lang.String str3, com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization, boolean z, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
        if (zzowVar == null) {
            throw new java.lang.NullPointerException("Null widgetBackend");
        }
        this.zza = zzowVar;
        if (autocompleteActivityMode == null) {
            throw new java.lang.NullPointerException("Null mode");
        }
        this.zzb = autocompleteActivityMode;
        if (immutableList == null) {
            throw new java.lang.NullPointerException("Null placeFields");
        }
        this.zzc = immutableList;
        if (zzorVar == null) {
            throw new java.lang.NullPointerException("Null activityOrigin");
        }
        this.zzd = zzorVar;
        this.zze = latLng;
        this.zzf = str;
        this.zzg = str2;
        this.zzh = locationBias;
        this.zzi = locationRestriction;
        if (immutableList2 == null) {
            throw new java.lang.NullPointerException("Null countries");
        }
        this.zzj = immutableList2;
        if (immutableList3 == null) {
            throw new java.lang.NullPointerException("Null typesFilter");
        }
        this.zzk = immutableList3;
        this.zzl = i;
        this.zzm = i2;
        this.zzn = str3;
        this.zzo = autocompleteUiCustomization;
        this.zzp = z;
        this.zzq = autocompleteSessionToken;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zznq)) {
            return false;
        }
        com.google.android.libraries.places.internal.zznq zznqVar = (com.google.android.libraries.places.internal.zznq) obj;
        if (!this.zza.equals(zznqVar.zza()) || !this.zzb.equals(zznqVar.zzb()) || !this.zzc.equals(zznqVar.zzc()) || !this.zzd.equals(zznqVar.zzd())) {
            return false;
        }
        com.google.android.gms.maps.model.LatLng latLng = this.zze;
        if (latLng == null) {
            if (zznqVar.zze() != null) {
                return false;
            }
        } else if (!latLng.equals(zznqVar.zze())) {
            return false;
        }
        java.lang.String str = this.zzf;
        if (str == null) {
            if (zznqVar.zzf() != null) {
                return false;
            }
        } else if (!str.equals(zznqVar.zzf())) {
            return false;
        }
        java.lang.String str2 = this.zzg;
        if (str2 == null) {
            if (zznqVar.zzg() != null) {
                return false;
            }
        } else if (!str2.equals(zznqVar.zzg())) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzh;
        if (locationBias == null) {
            if (zznqVar.zzh() != null) {
                return false;
            }
        } else if (!locationBias.equals(zznqVar.zzh())) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzi;
        if (locationRestriction == null) {
            if (zznqVar.zzi() != null) {
                return false;
            }
        } else if (!locationRestriction.equals(zznqVar.zzi())) {
            return false;
        }
        if (!this.zzj.equals(zznqVar.zzj()) || !this.zzk.equals(zznqVar.zzk()) || this.zzl != zznqVar.zzl() || this.zzm != zznqVar.zzm()) {
            return false;
        }
        java.lang.String str3 = this.zzn;
        if (str3 == null) {
            if (zznqVar.zzn() != null) {
                return false;
            }
        } else if (!str3.equals(zznqVar.zzn())) {
            return false;
        }
        com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization = this.zzo;
        if (autocompleteUiCustomization == null) {
            if (zznqVar.zzo() != null) {
                return false;
            }
        } else if (!autocompleteUiCustomization.equals(zznqVar.zzo())) {
            return false;
        }
        if (this.zzp != zznqVar.zzp()) {
            return false;
        }
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzq;
        if (autocompleteSessionToken == null) {
            if (zznqVar.zzq() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(zznqVar.zzq())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        int hashCode3 = this.zzc.hashCode();
        int hashCode4 = this.zzd.hashCode();
        com.google.android.gms.maps.model.LatLng latLng = this.zze;
        int hashCode5 = latLng == null ? 0 : latLng.hashCode();
        java.lang.String str = this.zzf;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzg;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzh;
        int hashCode8 = locationBias == null ? 0 : locationBias.hashCode();
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzi;
        int hashCode9 = locationRestriction == null ? 0 : locationRestriction.hashCode();
        int hashCode10 = this.zzj.hashCode();
        int hashCode11 = this.zzk.hashCode();
        int i = this.zzl;
        int i2 = this.zzm;
        java.lang.String str3 = this.zzn;
        int hashCode12 = str3 == null ? 0 : str3.hashCode();
        com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization = this.zzo;
        int hashCode13 = autocompleteUiCustomization == null ? 0 : autocompleteUiCustomization.hashCode();
        int i3 = hashCode12;
        int i4 = true != this.zzp ? 1237 : 1231;
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzq;
        return ((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ hashCode13) * 1000003) ^ i4) * 1000003) ^ (autocompleteSessionToken != null ? autocompleteSessionToken.hashCode() : 0);
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
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zzq;
        com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization = this.zzo;
        com.google.common.collect.ImmutableList immutableList = this.zzk;
        com.google.common.collect.ImmutableList immutableList2 = this.zzj;
        com.google.android.libraries.places.api.model.LocationRestriction locationRestriction = this.zzi;
        com.google.android.libraries.places.api.model.LocationBias locationBias = this.zzh;
        java.lang.String valueOf = java.lang.String.valueOf(this.zze);
        java.lang.String valueOf2 = java.lang.String.valueOf(locationBias);
        java.lang.String valueOf3 = java.lang.String.valueOf(locationRestriction);
        java.lang.String obj5 = immutableList2.toString();
        java.lang.String obj6 = immutableList.toString();
        java.lang.String valueOf4 = java.lang.String.valueOf(autocompleteUiCustomization);
        java.lang.String valueOf5 = java.lang.String.valueOf(autocompleteSessionToken);
        int length5 = java.lang.String.valueOf(valueOf).length();
        java.lang.String str = this.zzf;
        int length6 = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzg;
        int length7 = java.lang.String.valueOf(str2).length();
        int length8 = java.lang.String.valueOf(valueOf2).length();
        int length9 = java.lang.String.valueOf(valueOf3).length();
        int length10 = obj5.length();
        int length11 = obj6.length();
        int i = this.zzl;
        int length12 = java.lang.String.valueOf(i).length();
        int i2 = this.zzm;
        int length13 = java.lang.String.valueOf(i2).length();
        java.lang.String str3 = this.zzn;
        int length14 = java.lang.String.valueOf(str3).length();
        int length15 = java.lang.String.valueOf(valueOf4).length();
        boolean z = this.zzp;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 41 + length2 + 14 + length3 + 17 + length4 + 9 + length5 + 15 + length6 + 7 + length7 + 15 + length8 + 22 + length9 + 12 + length10 + 14 + length11 + 15 + length12 + 19 + length13 + 13 + length14 + 30 + length15 + 36 + java.lang.String.valueOf(z).length() + 27 + java.lang.String.valueOf(valueOf5).length() + 1);
        sb.append("AutocompleteOptions{widgetBackend=");
        sb.append(obj);
        sb.append(", mode=");
        sb.append(obj2);
        sb.append(", placeFields=");
        sb.append(obj3);
        sb.append(", activityOrigin=");
        sb.append(obj4);
        sb.append(", origin=");
        sb.append(valueOf);
        sb.append(", initialQuery=");
        sb.append(str);
        sb.append(", hint=");
        sb.append(str2);
        sb.append(", locationBias=");
        sb.append(valueOf2);
        sb.append(", locationRestriction=");
        sb.append(valueOf3);
        sb.append(", countries=");
        sb.append(obj5);
        sb.append(", typesFilter=");
        sb.append(obj6);
        sb.append(", primaryColor=");
        sb.append(i);
        sb.append(", primaryColorDark=");
        sb.append(i2);
        sb.append(", regionCode=");
        sb.append(str3);
        sb.append(", autocompleteUiCustomization=");
        sb.append(valueOf4);
        sb.append(", pureServiceAreaBusinessesIncluded=");
        sb.append(z);
        sb.append(", autocompleteSessionToken=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.internal.zznp zzr() {
        return new com.google.android.libraries.places.internal.zznj(this);
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken zzq() {
        return this.zzq;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final boolean zzp() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzo() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final java.lang.String zzn() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final int zzm() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final int zzl() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.common.collect.ImmutableList zzk() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.common.collect.ImmutableList zzj() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.api.model.LocationRestriction zzi() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.api.model.LocationBias zzh() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final java.lang.String zzg() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final java.lang.String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.gms.maps.model.LatLng zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.internal.zzor zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.common.collect.ImmutableList zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.widget.model.AutocompleteActivityMode zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final com.google.android.libraries.places.internal.zzow zza() {
        return this.zza;
    }
}
