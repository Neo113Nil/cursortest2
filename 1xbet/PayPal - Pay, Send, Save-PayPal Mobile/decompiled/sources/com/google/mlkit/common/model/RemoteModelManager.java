package com.google.mlkit.common.model;

/* loaded from: classes9.dex */
public class RemoteModelManager {
    private final java.util.Map zza = new java.util.HashMap();

    public RemoteModelManager(java.util.Set<com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration> set) {
        for (com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration remoteModelManagerRegistration : set) {
            this.zza.put(remoteModelManagerRegistration.zzb(), remoteModelManagerRegistration.zza());
        }
    }

    public static com.google.mlkit.common.model.RemoteModelManager getInstance() {
        com.google.mlkit.common.model.RemoteModelManager remoteModelManager;
        synchronized (com.google.mlkit.common.model.RemoteModelManager.class) {
            remoteModelManager = (com.google.mlkit.common.model.RemoteModelManager) com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().get(com.google.mlkit.common.model.RemoteModelManager.class);
        }
        return remoteModelManager;
    }

    private final com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface zza(java.lang.Class cls) {
        return (com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface) ((com.google.firebase.inject.Provider) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.firebase.inject.Provider) this.zza.get(cls))).get();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> deleteDownloadedModel(com.google.mlkit.common.model.RemoteModel remoteModel) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).deleteDownloadedModel(remoteModel);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> download(com.google.mlkit.common.model.RemoteModel remoteModel, com.google.mlkit.common.model.DownloadConditions downloadConditions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(downloadConditions, "DownloadConditions cannot be null");
        if (this.zza.containsKey(remoteModel.getClass())) {
            return zza(remoteModel.getClass()).download(remoteModel, downloadConditions);
        }
        java.lang.String simpleName = remoteModel.getClass().getSimpleName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Feature model '");
        sb.append(simpleName);
        sb.append("' doesn't have a corresponding modelmanager registered.");
        return com.google.android.gms.tasks.Tasks.forException(new com.google.mlkit.common.MlKitException(sb.toString(), 13));
    }

    public <T extends com.google.mlkit.common.model.RemoteModel> com.google.android.gms.tasks.Task<java.util.Set<T>> getDownloadedModels(java.lang.Class<T> cls) {
        return ((com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface) ((com.google.firebase.inject.Provider) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.firebase.inject.Provider) this.zza.get(cls))).get()).getDownloadedModels();
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> isModelDownloaded(com.google.mlkit.common.model.RemoteModel remoteModel) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        return zza(remoteModel.getClass()).isModelDownloaded(remoteModel);
    }

    public static class RemoteModelManagerRegistration {
        private final java.lang.Class zza;
        private final com.google.firebase.inject.Provider zzb;

        final java.lang.Class zzb() {
            return this.zza;
        }

        final com.google.firebase.inject.Provider zza() {
            return this.zzb;
        }

        public <RemoteT extends com.google.mlkit.common.model.RemoteModel> RemoteModelManagerRegistration(java.lang.Class<RemoteT> cls, com.google.firebase.inject.Provider<? extends com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface<RemoteT>> provider) {
            this.zza = cls;
            this.zzb = provider;
        }
    }
}
