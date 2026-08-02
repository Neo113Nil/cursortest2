package com.google.mlkit.common.model;

/* loaded from: classes9.dex */
public final class CustomRemoteModel extends com.google.mlkit.common.model.RemoteModel {
    private final com.google.mlkit.common.model.RemoteModelSource zzb;

    public static class Builder {
        private final com.google.mlkit.common.model.RemoteModelSource zza;

        public Builder(com.google.mlkit.common.model.RemoteModelSource remoteModelSource) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(remoteModelSource);
            this.zza = remoteModelSource;
        }

        public com.google.mlkit.common.model.CustomRemoteModel build() {
            return new com.google.mlkit.common.model.CustomRemoteModel(this.zza, null);
        }
    }

    /* synthetic */ CustomRemoteModel(com.google.mlkit.common.model.RemoteModelSource remoteModelSource, com.google.mlkit.common.model.zza zzaVar) {
        super(android.text.TextUtils.isEmpty(remoteModelSource.zza()) ? "no_model_name" : remoteModelSource.zza(), null, com.google.mlkit.common.sdkinternal.ModelType.CUSTOM);
        this.zzb = remoteModelSource;
    }

    public final com.google.mlkit.common.model.RemoteModelSource getRemoteModelSource() {
        return this.zzb;
    }
}
