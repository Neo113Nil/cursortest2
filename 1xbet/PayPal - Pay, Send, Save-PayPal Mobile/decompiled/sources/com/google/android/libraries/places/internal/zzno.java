package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzno extends com.google.android.libraries.places.internal.zzns {
    private final java.lang.String zza;
    private final com.google.common.collect.ImmutableList zzb;
    private final com.google.android.libraries.places.api.model.Place zzc;
    private final com.google.android.libraries.places.api.model.AutocompletePrediction zzd;
    private final com.google.android.libraries.places.api.model.AutocompleteSessionToken zze;
    private final com.google.android.gms.common.api.Status zzf;
    private final int zzg;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzns)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzns zznsVar = (com.google.android.libraries.places.internal.zzns) obj;
        if (this.zzg != zznsVar.zzg()) {
            return false;
        }
        java.lang.String str = this.zza;
        if (str == null) {
            if (zznsVar.zza() != null) {
                return false;
            }
        } else if (!str.equals(zznsVar.zza())) {
            return false;
        }
        com.google.common.collect.ImmutableList immutableList = this.zzb;
        if (immutableList == null) {
            if (zznsVar.zzb() != null) {
                return false;
            }
        } else if (!immutableList.equals(zznsVar.zzb())) {
            return false;
        }
        com.google.android.libraries.places.api.model.Place place = this.zzc;
        if (place == null) {
            if (zznsVar.zzc() != null) {
                return false;
            }
        } else if (!place.equals(zznsVar.zzc())) {
            return false;
        }
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = this.zzd;
        if (autocompletePrediction == null) {
            if (zznsVar.zzd() != null) {
                return false;
            }
        } else if (!autocompletePrediction.equals(zznsVar.zzd())) {
            return false;
        }
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zze;
        if (autocompleteSessionToken == null) {
            if (zznsVar.zze() != null) {
                return false;
            }
        } else if (!autocompleteSessionToken.equals(zznsVar.zze())) {
            return false;
        }
        com.google.android.gms.common.api.Status status = this.zzf;
        if (status == null) {
            if (zznsVar.zzf() != null) {
                return false;
            }
        } else if (!status.equals(zznsVar.zzf())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        switch (this.zzg) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "RESET";
                break;
            case 3:
                str = "LOADING";
                break;
            case 4:
                str = "TRY_AGAIN_PROGRESS_LOADING";
                break;
            case 5:
                str = "SUCCESS_PREDICTIONS";
                break;
            case 6:
                str = "FAILURE_NO_PREDICTIONS";
                break;
            case 7:
                str = "FAILURE_PREDICTIONS";
                break;
            case 8:
                str = "SUCCESS_SELECTION";
                break;
            case 9:
                str = "FAILURE_SELECTION";
                break;
            default:
                str = "FAILURE_UNRESOLVABLE";
                break;
        }
        java.lang.String str2 = this.zza;
        com.google.common.collect.ImmutableList immutableList = this.zzb;
        com.google.android.libraries.places.api.model.Place place = this.zzc;
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = this.zzd;
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zze;
        com.google.android.gms.common.api.Status status = this.zzf;
        int length = str.length();
        java.lang.String valueOf = java.lang.String.valueOf(immutableList);
        java.lang.String valueOf2 = java.lang.String.valueOf(place);
        java.lang.String valueOf3 = java.lang.String.valueOf(autocompletePrediction);
        java.lang.String valueOf4 = java.lang.String.valueOf(autocompleteSessionToken);
        java.lang.String valueOf5 = java.lang.String.valueOf(status);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 31 + java.lang.String.valueOf(str2).length() + 14 + java.lang.String.valueOf(valueOf).length() + 8 + java.lang.String.valueOf(valueOf2).length() + 13 + java.lang.String.valueOf(valueOf3).length() + 15 + java.lang.String.valueOf(valueOf4).length() + 9 + java.lang.String.valueOf(valueOf5).length() + 1);
        sb.append("AutocompleteState{type=");
        sb.append(str);
        sb.append(", query=");
        sb.append(str2);
        sb.append(", predictions=");
        sb.append(valueOf);
        sb.append(", place=");
        sb.append(valueOf2);
        sb.append(", prediction=");
        sb.append(valueOf3);
        sb.append(", sessionToken=");
        sb.append(valueOf4);
        sb.append(", status=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.zzg;
        com.google.common.collect.ImmutableList immutableList = this.zzb;
        int hashCode2 = immutableList == null ? 0 : immutableList.hashCode();
        com.google.android.libraries.places.api.model.Place place = this.zzc;
        int hashCode3 = place == null ? 0 : place.hashCode();
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = this.zzd;
        int hashCode4 = autocompletePrediction == null ? 0 : autocompletePrediction.hashCode();
        com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken = this.zze;
        int hashCode5 = autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode();
        com.google.android.gms.common.api.Status status = this.zzf;
        return ((((((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ (status != null ? status.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final int zzg() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final com.google.android.gms.common.api.Status zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final com.google.android.libraries.places.api.model.AutocompletePrediction zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final com.google.android.libraries.places.api.model.Place zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final com.google.common.collect.ImmutableList zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final java.lang.String zza() {
        return this.zza;
    }

    /* synthetic */ zzno(int i, java.lang.String str, com.google.common.collect.ImmutableList immutableList, com.google.android.libraries.places.api.model.Place place, com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken, com.google.android.gms.common.api.Status status, byte[] bArr) {
        this.zzg = i;
        this.zza = str;
        this.zzb = immutableList;
        this.zzc = place;
        this.zzd = autocompletePrediction;
        this.zze = autocompleteSessionToken;
        this.zzf = status;
    }
}
