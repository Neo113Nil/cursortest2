package com.google.mlkit.vision.barcode;

/* loaded from: classes9.dex */
public class ZoomSuggestionOptions {
    private final com.google.mlkit.vision.barcode.ZoomSuggestionOptions.ZoomCallback zza;
    private final float zzb;

    public interface ZoomCallback {
        boolean setZoom(float f);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.vision.barcode.ZoomSuggestionOptions)) {
            return false;
        }
        com.google.mlkit.vision.barcode.ZoomSuggestionOptions zoomSuggestionOptions = (com.google.mlkit.vision.barcode.ZoomSuggestionOptions) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zoomSuggestionOptions.zza) && this.zzb == zoomSuggestionOptions.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Float.valueOf(this.zzb));
    }

    public static class Builder {
        private final com.google.mlkit.vision.barcode.ZoomSuggestionOptions.ZoomCallback zza;
        private float zzb;

        public com.google.mlkit.vision.barcode.ZoomSuggestionOptions.Builder setMaxSupportedZoomRatio(float f) {
            this.zzb = f;
            return this;
        }

        public com.google.mlkit.vision.barcode.ZoomSuggestionOptions build() {
            return new com.google.mlkit.vision.barcode.ZoomSuggestionOptions(this.zza, this.zzb, null);
        }

        public Builder(com.google.mlkit.vision.barcode.ZoomSuggestionOptions.ZoomCallback zoomCallback) {
            this.zza = zoomCallback;
        }
    }

    public final com.google.mlkit.vision.barcode.ZoomSuggestionOptions.ZoomCallback zzb() {
        return this.zza;
    }

    public final float zza() {
        return this.zzb;
    }

    /* synthetic */ ZoomSuggestionOptions(com.google.mlkit.vision.barcode.ZoomSuggestionOptions.ZoomCallback zoomCallback, float f, com.google.mlkit.vision.barcode.zzb zzbVar) {
        this.zza = zoomCallback;
        this.zzb = f;
    }
}
