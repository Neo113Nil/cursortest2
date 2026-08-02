package com.google.mlkit.common.model;

/* loaded from: classes9.dex */
public class LocalModel {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.net.Uri zzc;
    private final boolean zzd;

    public static class Builder {
        private java.lang.String zza = null;
        private java.lang.String zzb = null;
        private android.net.Uri zzc = null;
        private boolean zzd = false;

        public com.google.mlkit.common.model.LocalModel build() {
            java.lang.String str = this.zza;
            boolean z = true;
            if ((str == null || this.zzb != null || this.zzc != null) && ((str != null || this.zzb == null || this.zzc != null) && (str != null || this.zzb != null || this.zzc == null))) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Set one of filePath, assetFilePath and URI.");
            return new com.google.mlkit.common.model.LocalModel(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAbsoluteFilePath(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.zzb == null && this.zzc == null && !this.zzd) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zza = str;
            return this;
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAbsoluteManifestFilePath(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.zzb == null && this.zzc == null && (this.zza == null || this.zzd)) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zza = str;
            this.zzd = true;
            return this;
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAssetFilePath(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.zza == null && this.zzc == null && !this.zzd) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzb = str;
            return this;
        }

        public com.google.mlkit.common.model.LocalModel.Builder setAssetManifestFilePath(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.zza == null && this.zzc == null && (this.zzb == null || this.zzd)) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzb = str;
            this.zzd = true;
            return this;
        }

        public com.google.mlkit.common.model.LocalModel.Builder setUri(android.net.Uri uri) {
            boolean z = false;
            if (this.zza == null && this.zzb == null) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzc = uri;
            return this;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.common.model.LocalModel)) {
            return false;
        }
        com.google.mlkit.common.model.LocalModel localModel = (com.google.mlkit.common.model.LocalModel) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, localModel.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, localModel.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, localModel.zzc) && this.zzd == localModel.zzd;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, java.lang.Boolean.valueOf(this.zzd));
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.mlkit_common.zzq zza = com.google.android.gms.internal.mlkit_common.zzr.zza(this);
        zza.zza("absoluteFilePath", this.zza);
        zza.zza("assetFilePath", this.zzb);
        zza.zza("uri", this.zzc);
        zza.zzb("isManifestFile", this.zzd);
        return zza.toString();
    }

    public boolean isManifestFile() {
        return this.zzd;
    }

    public android.net.Uri getUri() {
        return this.zzc;
    }

    public java.lang.String getAssetFilePath() {
        return this.zzb;
    }

    public java.lang.String getAbsoluteFilePath() {
        return this.zza;
    }

    /* synthetic */ LocalModel(java.lang.String str, java.lang.String str2, android.net.Uri uri, boolean z, com.google.mlkit.common.model.zzc zzcVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = z;
    }
}
