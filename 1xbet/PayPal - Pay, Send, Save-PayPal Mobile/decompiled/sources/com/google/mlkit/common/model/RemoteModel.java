package com.google.mlkit.common.model;

/* loaded from: classes9.dex */
public abstract class RemoteModel {
    private final java.lang.String zzc;
    private final com.google.mlkit.common.sdkinternal.model.BaseModel zzd;
    private final com.google.mlkit.common.sdkinternal.ModelType zze;
    private java.lang.String zzf;
    private static final java.util.Map zzb = new java.util.EnumMap(com.google.mlkit.common.sdkinternal.model.BaseModel.class);
    public static final java.util.Map zza = new java.util.EnumMap(com.google.mlkit.common.sdkinternal.model.BaseModel.class);

    protected RemoteModel(java.lang.String str, com.google.mlkit.common.sdkinternal.model.BaseModel baseModel, com.google.mlkit.common.sdkinternal.ModelType modelType) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(android.text.TextUtils.isEmpty(str) == (baseModel != null), "One of cloud model name and base model cannot be empty");
        this.zzc = str;
        this.zzd = baseModel;
        this.zze = modelType;
    }

    public boolean baseModelHashMatches(java.lang.String str) {
        com.google.mlkit.common.sdkinternal.model.BaseModel baseModel = this.zzd;
        if (baseModel == null) {
            return false;
        }
        return str.equals(zzb.get(baseModel));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.common.model.RemoteModel)) {
            return false;
        }
        com.google.mlkit.common.model.RemoteModel remoteModel = (com.google.mlkit.common.model.RemoteModel) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzc, remoteModel.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, remoteModel.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, remoteModel.zze);
    }

    public java.lang.String getModelNameForBackend() {
        java.lang.String str = this.zzc;
        if (str != null) {
            return str;
        }
        return (java.lang.String) zza.get(this.zzd);
    }

    public java.lang.String getUniqueModelNameForPersist() {
        java.lang.String str = this.zzc;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(java.lang.String.valueOf((java.lang.String) zza.get(this.zzd)));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzc, this.zzd, this.zze);
    }

    public java.lang.String toString() {
        com.google.android.gms.internal.mlkit_common.zzq zzb2 = com.google.android.gms.internal.mlkit_common.zzr.zzb("RemoteModel");
        zzb2.zza("modelName", this.zzc);
        zzb2.zza("baseModel", this.zzd);
        zzb2.zza("modelType", this.zze);
        return zzb2.toString();
    }

    public void setModelHash(java.lang.String str) {
        this.zzf = str;
    }

    public boolean isBaseModel() {
        return this.zzd != null;
    }

    public com.google.mlkit.common.sdkinternal.ModelType getModelType() {
        return this.zze;
    }

    public java.lang.String getModelName() {
        return this.zzc;
    }

    public java.lang.String getModelHash() {
        return this.zzf;
    }
}
