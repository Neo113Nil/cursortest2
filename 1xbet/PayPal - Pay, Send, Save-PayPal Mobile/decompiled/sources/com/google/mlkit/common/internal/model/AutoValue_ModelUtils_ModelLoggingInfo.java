package com.google.mlkit.common.internal.model;

/* loaded from: classes9.dex */
final class AutoValue_ModelUtils_ModelLoggingInfo extends com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo {
    private final long zza;
    private final java.lang.String zzb;
    private final boolean zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo)) {
            return false;
        }
        com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo modelLoggingInfo = (com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo) obj;
        return this.zza == modelLoggingInfo.getSize() && this.zzb.equals(modelLoggingInfo.getHash()) && this.zzc == modelLoggingInfo.isManifestModel();
    }

    public final int hashCode() {
        long j = this.zza;
        int i = (int) (j ^ (j >>> 32));
        return ((((i ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ModelLoggingInfo{size=");
        sb.append(this.zza);
        sb.append(", hash=");
        sb.append(this.zzb);
        sb.append(", manifestModel=");
        sb.append(this.zzc);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public final boolean isManifestModel() {
        return this.zzc;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public final long getSize() {
        return this.zza;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public final java.lang.String getHash() {
        return this.zzb;
    }

    AutoValue_ModelUtils_ModelLoggingInfo(long j, java.lang.String str, boolean z) {
        this.zza = j;
        this.zzb = str;
        this.zzc = z;
    }
}
