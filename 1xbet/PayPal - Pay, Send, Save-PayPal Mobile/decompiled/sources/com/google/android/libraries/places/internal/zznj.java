package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zznj extends com.google.android.libraries.places.internal.zznp {
    private com.google.android.libraries.places.internal.zzow zza;
    private com.google.android.libraries.places.widget.model.AutocompleteActivityMode zzb;
    private com.google.common.collect.ImmutableList zzc;
    private com.google.android.libraries.places.internal.zzor zzd;
    private com.google.android.gms.maps.model.LatLng zze;
    private java.lang.String zzf;
    private java.lang.String zzg;
    private com.google.android.libraries.places.api.model.LocationBias zzh;
    private com.google.android.libraries.places.api.model.LocationRestriction zzi;
    private com.google.common.collect.ImmutableList zzj;
    private com.google.common.collect.ImmutableList zzk;
    private int zzl;
    private int zzm;
    private java.lang.String zzn;
    private com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzo;
    private boolean zzp;
    private com.google.android.libraries.places.api.model.AutocompleteSessionToken zzq;
    private byte zzr;

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zza(com.google.android.libraries.places.internal.zzow zzowVar) {
        if (zzowVar == null) {
            throw new java.lang.NullPointerException("Null widgetBackend");
        }
        this.zza = zzowVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzb(com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode) {
        if (autocompleteActivityMode == null) {
            throw new java.lang.NullPointerException("Null mode");
        }
        this.zzb = autocompleteActivityMode;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzc(java.util.List list) {
        this.zzc = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzd(com.google.android.libraries.places.internal.zzor zzorVar) {
        if (zzorVar == null) {
            throw new java.lang.NullPointerException("Null activityOrigin");
        }
        this.zzd = zzorVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzj(java.util.List list) {
        this.zzj = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzk(java.util.List list) {
        this.zzk = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznq zzr() {
        com.google.android.libraries.places.internal.zzow zzowVar;
        com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode;
        com.google.common.collect.ImmutableList immutableList;
        com.google.android.libraries.places.internal.zzor zzorVar;
        com.google.common.collect.ImmutableList immutableList2;
        com.google.common.collect.ImmutableList immutableList3;
        if (this.zzr == 7 && (zzowVar = this.zza) != null && (autocompleteActivityMode = this.zzb) != null && (immutableList = this.zzc) != null && (zzorVar = this.zzd) != null && (immutableList2 = this.zzj) != null && (immutableList3 = this.zzk) != null) {
            return new com.google.android.libraries.places.internal.zznm(zzowVar, autocompleteActivityMode, immutableList, zzorVar, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, immutableList2, immutableList3, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" widgetBackend");
        }
        if (this.zzb == null) {
            sb.append(" mode");
        }
        if (this.zzc == null) {
            sb.append(" placeFields");
        }
        if (this.zzd == null) {
            sb.append(" activityOrigin");
        }
        if (this.zzj == null) {
            sb.append(" countries");
        }
        if (this.zzk == null) {
            sb.append(" typesFilter");
        }
        if ((this.zzr & 1) == 0) {
            sb.append(" primaryColor");
        }
        if ((this.zzr & 2) == 0) {
            sb.append(" primaryColorDark");
        }
        if ((this.zzr & 4) == 0) {
            sb.append(" pureServiceAreaBusinessesIncluded");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzq(com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken) {
        this.zzq = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzp(boolean z) {
        this.zzp = z;
        this.zzr = (byte) (this.zzr | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzo(com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization) {
        this.zzo = autocompleteUiCustomization;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzn(java.lang.String str) {
        this.zzn = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzm(int i) {
        this.zzm = i;
        this.zzr = (byte) (this.zzr | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzl(int i) {
        this.zzl = i;
        this.zzr = (byte) (this.zzr | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzi(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
        this.zzi = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzh(com.google.android.libraries.places.api.model.LocationBias locationBias) {
        this.zzh = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzg(java.lang.String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zzf(java.lang.String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznp
    public final com.google.android.libraries.places.internal.zznp zze(com.google.android.gms.maps.model.LatLng latLng) {
        this.zze = latLng;
        return this;
    }

    zznj(com.google.android.libraries.places.internal.zznq zznqVar) {
        this.zza = zznqVar.zza();
        this.zzb = zznqVar.zzb();
        this.zzc = zznqVar.zzc();
        this.zzd = zznqVar.zzd();
        this.zze = zznqVar.zze();
        this.zzf = zznqVar.zzf();
        this.zzg = zznqVar.zzg();
        this.zzh = zznqVar.zzh();
        this.zzi = zznqVar.zzi();
        this.zzj = zznqVar.zzj();
        this.zzk = zznqVar.zzk();
        this.zzl = zznqVar.zzl();
        this.zzm = zznqVar.zzm();
        this.zzn = zznqVar.zzn();
        this.zzo = zznqVar.zzo();
        this.zzp = zznqVar.zzp();
        this.zzq = zznqVar.zzq();
        this.zzr = (byte) 7;
    }

    zznj() {
    }
}
