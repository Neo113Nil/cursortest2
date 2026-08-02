package com.google.mlkit.common.internal.model;

/* loaded from: classes9.dex */
final class AutoValue_ModelUtils_AutoMLManifest extends com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    AutoValue_ModelUtils_AutoMLManifest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null modelType");
        }
        this.zza = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null modelFile");
        }
        this.zzb = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null labelsFile");
        }
        this.zzc = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest)) {
            return false;
        }
        com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest autoMLManifest = (com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest) obj;
        return this.zza.equals(autoMLManifest.getModelType()) && this.zzb.equals(autoMLManifest.getModelFile()) && this.zzc.equals(autoMLManifest.getLabelsFile());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoMLManifest{modelType=");
        sb.append(this.zza);
        sb.append(", modelFile=");
        sb.append(this.zzb);
        sb.append(", labelsFile=");
        sb.append(this.zzc);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public final java.lang.String getModelType() {
        return this.zza;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public final java.lang.String getModelFile() {
        return this.zzb;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public final java.lang.String getLabelsFile() {
        return this.zzc;
    }
}
