package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public class PinConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int BITMAP_LENGTH_DP = 37;
    public static final int BITMAP_WIDTH_DP = 26;
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PinConfig> CREATOR = new com.google.android.gms.maps.model.zzr();
    public static final int DEFAULT_PIN_BACKGROUND_COLOR = -1424587;
    public static final int DEFAULT_PIN_BORDER_COLOR = -3857889;
    public static final int DEFAULT_PIN_GLYPH_COLOR = -5041134;
    private final int zza;
    private final int zzb;
    private final com.google.android.gms.maps.model.PinConfig.Glyph zzc;

    /* loaded from: classes8.dex */
    public static class Glyph extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PinConfig.Glyph> CREATOR = new com.google.android.gms.maps.model.zzj();
        public static final float DEFAULT_CIRCLE_RADIUS_DP = 5.0f;
        public static final float X_COORDINATE_DP = 13.0f;
        public static final float Y_COORDINATE_DP = 13.0f;
        private java.lang.String zza;
        private com.google.android.gms.maps.model.BitmapDescriptor zzb;
        private int zzc;
        private int zzd;

        public Glyph(int i) {
            this.zzd = -16777216;
            this.zzc = i;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.maps.model.PinConfig.Glyph)) {
                return false;
            }
            com.google.android.gms.maps.model.PinConfig.Glyph glyph = (com.google.android.gms.maps.model.PinConfig.Glyph) obj;
            if (this.zzc != glyph.zzc || !java.util.Objects.equals(this.zza, glyph.zza) || this.zzd != glyph.zzd) {
                return false;
            }
            com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.zzb;
            if ((bitmapDescriptor == null && glyph.zzb != null) || (bitmapDescriptor != null && glyph.zzb == null)) {
                return false;
            }
            com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2 = glyph.zzb;
            if (bitmapDescriptor == null || bitmapDescriptor2 == null) {
                return true;
            }
            return java.util.Objects.equals(com.google.android.gms.dynamic.ObjectWrapper.unwrap(bitmapDescriptor.zza()), com.google.android.gms.dynamic.ObjectWrapper.unwrap(bitmapDescriptor2.zza()));
        }

        public int hashCode() {
            return java.util.Objects.hash(this.zza, this.zzb, java.lang.Integer.valueOf(this.zzc));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getText(), false);
            com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.zzb;
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getGlyphColor());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getTextColor());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public Glyph(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
            this.zzc = com.google.android.gms.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zzd = -16777216;
            this.zzb = bitmapDescriptor;
        }

        public Glyph(java.lang.String str) {
            this(str, -16777216);
        }

        public Glyph(java.lang.String str, int i) {
            this.zzc = com.google.android.gms.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zza = str;
            this.zzd = i;
        }

        Glyph(java.lang.String str, android.os.IBinder iBinder, int i, int i2) {
            this.zzc = com.google.android.gms.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR;
            this.zzd = -16777216;
            this.zza = str;
            this.zzb = iBinder == null ? null : new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
            this.zzc = i;
            this.zzd = i2;
        }

        public int getTextColor() {
            return this.zzd;
        }

        public java.lang.String getText() {
            return this.zza;
        }

        public int getGlyphColor() {
            return this.zzc;
        }

        public com.google.android.gms.maps.model.BitmapDescriptor getBitmapDescriptor() {
            return this.zzb;
        }
    }

    PinConfig(int i, int i2, com.google.android.gms.maps.model.PinConfig.Glyph glyph) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = glyph;
    }

    public static com.google.android.gms.maps.model.PinConfig.Builder builder() {
        return new com.google.android.gms.maps.model.PinConfig.Builder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getBackgroundColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getBorderColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getGlyph(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        private int zza = com.google.android.gms.maps.model.PinConfig.DEFAULT_PIN_BACKGROUND_COLOR;
        private int zzb = com.google.android.gms.maps.model.PinConfig.DEFAULT_PIN_BORDER_COLOR;
        private com.google.android.gms.maps.model.PinConfig.Glyph zzc = new com.google.android.gms.maps.model.PinConfig.Glyph(com.google.android.gms.maps.model.PinConfig.DEFAULT_PIN_GLYPH_COLOR);

        public com.google.android.gms.maps.model.PinConfig build() {
            return new com.google.android.gms.maps.model.PinConfig(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.maps.model.PinConfig.Builder setGlyph(com.google.android.gms.maps.model.PinConfig.Glyph glyph) {
            this.zzc = glyph;
            return this;
        }

        public com.google.android.gms.maps.model.PinConfig.Builder setBorderColor(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.maps.model.PinConfig.Builder setBackgroundColor(int i) {
            this.zza = i;
            return this;
        }
    }

    public com.google.android.gms.maps.model.PinConfig.Glyph getGlyph() {
        return this.zzc;
    }

    public int getBorderColor() {
        return this.zzb;
    }

    public int getBackgroundColor() {
        return this.zza;
    }
}
