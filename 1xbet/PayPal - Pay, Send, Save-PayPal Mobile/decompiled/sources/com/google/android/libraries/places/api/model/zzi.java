package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzi extends com.google.android.libraries.places.api.model.AutocompletePrediction.Builder {
    private java.lang.String zza;
    private java.lang.Integer zzb;
    private java.util.List zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private java.util.List zzg;
    private java.util.List zzh;
    private java.util.List zzi;

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final java.lang.String getFullText() {
        java.lang.String str = this.zzd;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Property \"fullText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final java.lang.String getPrimaryText() {
        java.lang.String str = this.zze;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Property \"primaryText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final java.lang.String getSecondaryText() {
        java.lang.String str = this.zzf;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Property \"secondaryText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final java.util.List<java.lang.String> getTypes() {
        java.util.List<java.lang.String> list = this.zzc;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("Property \"types\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setFullText(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null fullText");
        }
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setPrimaryText(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null primaryText");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setSecondaryText(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null secondaryText");
        }
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setTypes(java.util.List<java.lang.String> list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null types");
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null placeId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zzb(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null fullTextMatchedSubstrings");
        }
        this.zzg = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zzc(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null primaryTextMatchedSubstrings");
        }
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder zzd(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null secondaryTextMatchedSubstrings");
        }
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    final com.google.android.libraries.places.api.model.AutocompletePrediction zze() {
        java.util.List list;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.lang.String str4 = this.zza;
        if (str4 != null && (list = this.zzc) != null && (str = this.zzd) != null && (str2 = this.zze) != null && (str3 = this.zzf) != null && (list2 = this.zzg) != null && (list3 = this.zzh) != null && (list4 = this.zzi) != null) {
            return new com.google.android.libraries.places.api.model.zzcq(str4, this.zzb, list, str, str2, str3, list2, list3, list4);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" placeId");
        }
        if (this.zzc == null) {
            sb.append(" types");
        }
        if (this.zzd == null) {
            sb.append(" fullText");
        }
        if (this.zze == null) {
            sb.append(" primaryText");
        }
        if (this.zzf == null) {
            sb.append(" secondaryText");
        }
        if (this.zzg == null) {
            sb.append(" fullTextMatchedSubstrings");
        }
        if (this.zzh == null) {
            sb.append(" primaryTextMatchedSubstrings");
        }
        if (this.zzi == null) {
            sb.append(" secondaryTextMatchedSubstrings");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final com.google.android.libraries.places.api.model.AutocompletePrediction.Builder setDistanceMeters(java.lang.Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final java.lang.Integer getDistanceMeters() {
        return this.zzb;
    }

    zzi() {
    }
}
