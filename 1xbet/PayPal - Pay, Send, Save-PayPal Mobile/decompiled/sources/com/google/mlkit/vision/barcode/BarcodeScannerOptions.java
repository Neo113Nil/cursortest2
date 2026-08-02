package com.google.mlkit.vision.barcode;

/* loaded from: classes9.dex */
public class BarcodeScannerOptions {
    private final int zza;
    private final boolean zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.mlkit.vision.barcode.ZoomSuggestionOptions zzd;

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.vision.barcode.BarcodeScannerOptions)) {
            return false;
        }
        com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions = (com.google.mlkit.vision.barcode.BarcodeScannerOptions) obj;
        return this.zza == barcodeScannerOptions.zza && this.zzb == barcodeScannerOptions.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, barcodeScannerOptions.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, barcodeScannerOptions.zzd);
    }

    public int hashCode() {
        int i = this.zza;
        boolean z = this.zzb;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z), this.zzc, this.zzd);
    }

    public static class Builder {
        private int zza = 0;
        private boolean zzb;
        private java.util.concurrent.Executor zzc;
        private com.google.mlkit.vision.barcode.ZoomSuggestionOptions zzd;

        public com.google.mlkit.vision.barcode.BarcodeScannerOptions.Builder setBarcodeFormats(int i, int... iArr) {
            this.zza = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.zza = i2 | this.zza;
                }
            }
            return this;
        }

        public com.google.mlkit.vision.barcode.BarcodeScannerOptions.Builder setZoomSuggestionOptions(com.google.mlkit.vision.barcode.ZoomSuggestionOptions zoomSuggestionOptions) {
            this.zzd = zoomSuggestionOptions;
            return this;
        }

        public com.google.mlkit.vision.barcode.BarcodeScannerOptions.Builder setExecutor(java.util.concurrent.Executor executor) {
            this.zzc = executor;
            return this;
        }

        public com.google.mlkit.vision.barcode.BarcodeScannerOptions.Builder enableAllPotentialBarcodes() {
            this.zzb = true;
            return this;
        }

        public com.google.mlkit.vision.barcode.BarcodeScannerOptions build() {
            return new com.google.mlkit.vision.barcode.BarcodeScannerOptions(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final java.util.concurrent.Executor zzc() {
        return this.zzc;
    }

    public final com.google.mlkit.vision.barcode.ZoomSuggestionOptions zzb() {
        return this.zzd;
    }

    public final int zza() {
        return this.zza;
    }

    /* synthetic */ BarcodeScannerOptions(int i, boolean z, java.util.concurrent.Executor executor, com.google.mlkit.vision.barcode.ZoomSuggestionOptions zoomSuggestionOptions, com.google.mlkit.vision.barcode.zza zzaVar) {
        this.zza = i;
        this.zzb = z;
        this.zzc = executor;
        this.zzd = zoomSuggestionOptions;
    }
}
