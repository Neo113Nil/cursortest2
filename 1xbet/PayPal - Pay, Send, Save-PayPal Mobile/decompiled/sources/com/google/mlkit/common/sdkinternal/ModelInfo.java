package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class ModelInfo {
    private final java.lang.String zza;
    private final android.net.Uri zzb;
    private final java.lang.String zzc;
    private final com.google.mlkit.common.sdkinternal.ModelType zzd;

    public android.net.Uri getModelUri() {
        return this.zzb;
    }

    public com.google.mlkit.common.sdkinternal.ModelType getModelType() {
        return this.zzd;
    }

    public java.lang.String getModelNameForPersist() {
        return this.zza;
    }

    public java.lang.String getModelHash() {
        return this.zzc;
    }

    public ModelInfo(java.lang.String str, android.net.Uri uri, java.lang.String str2, com.google.mlkit.common.sdkinternal.ModelType modelType) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = modelType;
    }
}
