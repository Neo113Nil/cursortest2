package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class FeatureStyle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.FeatureStyle> CREATOR = new com.google.android.gms.maps.model.zzi();
    private final java.lang.Integer zza;
    private final java.lang.Integer zzb;
    private final java.lang.Float zzc;
    private final java.lang.Float zzd;

    /* synthetic */ FeatureStyle(com.google.android.gms.maps.model.FeatureStyle.Builder builder, com.google.android.gms.maps.model.zzh zzhVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 1, getFillColor(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 2, getStrokeColor(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 3, getStrokeWidth(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 4, getPointRadius(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    FeatureStyle(java.lang.Integer num, java.lang.Integer num2, java.lang.Float f, java.lang.Float f2) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = f;
        this.zzd = f2;
    }

    public static final class Builder {
        private java.lang.Integer zza;
        private java.lang.Integer zzb;
        private java.lang.Float zzc;
        private java.lang.Float zzd;

        public final com.google.android.gms.maps.model.FeatureStyle build() {
            return new com.google.android.gms.maps.model.FeatureStyle(this, null);
        }

        public final com.google.android.gms.maps.model.FeatureStyle.Builder fillColor(int i) {
            this.zza = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.android.gms.maps.model.FeatureStyle.Builder pointRadius(float f) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f, "Point radius cannot be negative.");
            com.google.android.gms.common.internal.Preconditions.checkArgument(f <= 128.0f, "The max allowed pointRadius value is 128px.");
            this.zzd = java.lang.Float.valueOf(f);
            return this;
        }

        public final com.google.android.gms.maps.model.FeatureStyle.Builder strokeColor(int i) {
            this.zzb = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.android.gms.maps.model.FeatureStyle.Builder strokeWidth(float f) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f, "Stroke width cannot be negative.");
            this.zzc = java.lang.Float.valueOf(f);
            return this;
        }
    }

    public final java.lang.Float getStrokeWidth() {
        return this.zzc;
    }

    public final java.lang.Integer getStrokeColor() {
        return this.zzb;
    }

    public final java.lang.Float getPointRadius() {
        return this.zzd;
    }

    public final java.lang.Integer getFillColor() {
        return this.zza;
    }

    public static com.google.android.gms.maps.model.FeatureStyle.Builder builder() {
        return new com.google.android.gms.maps.model.FeatureStyle.Builder();
    }
}
