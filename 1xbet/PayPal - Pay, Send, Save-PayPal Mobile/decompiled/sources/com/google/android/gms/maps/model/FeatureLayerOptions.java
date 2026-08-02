package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class FeatureLayerOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.FeatureLayerOptions> CREATOR = new com.google.android.gms.maps.model.zzg();
    private static final com.google.android.gms.internal.maps.zzbm zza = com.google.android.gms.internal.maps.zzbm.zzi(com.google.android.gms.maps.model.FeatureType.ADMINISTRATIVE_AREA_LEVEL_1, com.google.android.gms.maps.model.FeatureType.ADMINISTRATIVE_AREA_LEVEL_2, com.google.android.gms.maps.model.FeatureType.COUNTRY, com.google.android.gms.maps.model.FeatureType.LOCALITY, com.google.android.gms.maps.model.FeatureType.POSTAL_CODE, com.google.android.gms.maps.model.FeatureType.SCHOOL_DISTRICT, com.google.android.gms.maps.model.FeatureType.DATASET);

    @com.google.android.gms.maps.model.FeatureType
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    /* synthetic */ FeatureLayerOptions(com.google.android.gms.maps.model.FeatureLayerOptions.Builder builder, com.google.android.gms.maps.model.zzf zzfVar) {
        this.zzb = builder.zza;
        this.zzc = builder.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getFeatureType(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getDatasetId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    FeatureLayerOptions(@com.google.android.gms.maps.model.FeatureType java.lang.String str, java.lang.String str2) {
        this.zzb = str;
        this.zzc = str2;
    }

    public static final class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;

        public final com.google.android.gms.maps.model.FeatureLayerOptions build() {
            java.lang.String str = this.zza;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("FeatureType must be specified.");
            }
            if (str.equals(com.google.android.gms.maps.model.FeatureType.DATASET) && this.zzb == null) {
                throw new java.lang.IllegalArgumentException("A datasetId must be specified for DATASET feature layers.");
            }
            return new com.google.android.gms.maps.model.FeatureLayerOptions(this, (com.google.android.gms.maps.model.zzf) null);
        }

        public final com.google.android.gms.maps.model.FeatureLayerOptions.Builder featureType(@com.google.android.gms.maps.model.FeatureType java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.maps.model.FeatureLayerOptions.zza.contains(str), "Invalid FeatureType value");
            this.zza = str;
            return this;
        }

        public final com.google.android.gms.maps.model.FeatureLayerOptions.Builder datasetId(java.lang.String str) {
            this.zzb = str;
            return this;
        }
    }

    @com.google.android.gms.maps.model.FeatureType
    public final java.lang.String getFeatureType() {
        return this.zzb;
    }

    public final java.lang.String getDatasetId() {
        return this.zzc;
    }

    public static com.google.android.gms.maps.model.FeatureLayerOptions.Builder builder() {
        return new com.google.android.gms.maps.model.FeatureLayerOptions.Builder();
    }
}
