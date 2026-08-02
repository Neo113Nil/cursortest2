package com.google.mlkit.common.sdkinternal.model;

/* loaded from: classes9.dex */
public class ModelLoader {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("ModelLoader", "");
    public final com.google.mlkit.common.sdkinternal.model.LocalModelLoader localModelLoader;
    protected com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState modelLoadingState = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.NO_MODEL_LOADED;
    public final com.google.mlkit.common.sdkinternal.model.RemoteModelLoader remoteModelLoader;
    private final com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingLogger zzb;

    public interface ModelContentHandler {
        void constructModel(java.nio.MappedByteBuffer mappedByteBuffer) throws com.google.mlkit.common.MlKitException;
    }

    public interface ModelLoadingLogger {
        void logErrorCodes(java.util.List<java.lang.Integer> list);
    }

    protected enum ModelLoadingState {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }

    public ModelLoader(com.google.mlkit.common.sdkinternal.model.RemoteModelLoader remoteModelLoader, com.google.mlkit.common.sdkinternal.model.LocalModelLoader localModelLoader, com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingLogger modelLoadingLogger) {
        boolean z = true;
        if (remoteModelLoader == null && localModelLoader == null) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(modelLoadingLogger);
        this.remoteModelLoader = remoteModelLoader;
        this.localModelLoader = localModelLoader;
        this.zzb = modelLoadingLogger;
    }

    private final java.lang.String zza() {
        com.google.mlkit.common.sdkinternal.model.LocalModelLoader localModelLoader = this.localModelLoader;
        java.lang.String str = null;
        if (localModelLoader != null) {
            if (localModelLoader.getLocalModel().getAssetFilePath() != null) {
                str = this.localModelLoader.getLocalModel().getAssetFilePath();
            } else if (this.localModelLoader.getLocalModel().getAbsoluteFilePath() != null) {
                str = this.localModelLoader.getLocalModel().getAbsoluteFilePath();
            } else if (this.localModelLoader.getLocalModel().getUri() != null) {
                str = ((android.net.Uri) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.localModelLoader.getLocalModel().getUri())).toString();
            }
        }
        com.google.mlkit.common.sdkinternal.model.RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        return java.lang.String.format("Local model path: %s. Remote model name: %s. ", str, remoteModelLoader == null ? "unspecified" : remoteModelLoader.getRemoteModel().getUniqueModelNameForPersist());
    }

    private final boolean zzb(com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelContentHandler modelContentHandler, java.util.List list) throws com.google.mlkit.common.MlKitException {
        java.nio.MappedByteBuffer load;
        synchronized (this) {
            com.google.mlkit.common.sdkinternal.model.LocalModelLoader localModelLoader = this.localModelLoader;
            if (localModelLoader == null || (load = localModelLoader.load()) == null) {
                return false;
            }
            try {
                modelContentHandler.constructModel(load);
                zza.d("ModelLoader", "Local model source is loaded successfully");
                return true;
            } catch (java.lang.RuntimeException e) {
                list.add(18);
                throw e;
            }
        }
    }

    private final boolean zzc(com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelContentHandler modelContentHandler, java.util.List list) throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            com.google.mlkit.common.sdkinternal.model.RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
            if (remoteModelLoader != null) {
                try {
                    java.nio.MappedByteBuffer load = remoteModelLoader.load();
                    if (load != null) {
                        try {
                            modelContentHandler.constructModel(load);
                            zza.d("ModelLoader", "Remote model source is loaded successfully");
                            return true;
                        } catch (java.lang.RuntimeException e) {
                            list.add(19);
                            throw e;
                        }
                    }
                    zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                    list.add(21);
                } catch (com.google.mlkit.common.MlKitException e2) {
                    zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                    list.add(20);
                    throw e2;
                }
            }
            return false;
        }
    }

    public boolean isRemoteModelLoaded() {
        com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState modelLoadingState;
        com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState modelLoadingState2;
        synchronized (this) {
            modelLoadingState = this.modelLoadingState;
            modelLoadingState2 = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.REMOTE_MODEL_LOADED;
        }
        return modelLoadingState == modelLoadingState2;
    }

    public void loadWithModelContentHandler(com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelContentHandler modelContentHandler) throws com.google.mlkit.common.MlKitException {
        java.lang.Exception exc;
        boolean z;
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z2 = false;
            java.lang.Exception e = null;
            try {
                z = zzc(modelContentHandler, arrayList);
                exc = null;
            } catch (java.lang.Exception e2) {
                exc = e2;
                z = false;
            }
            if (z) {
                this.zzb.logErrorCodes(arrayList);
                this.modelLoadingState = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.REMOTE_MODEL_LOADED;
                return;
            }
            try {
                z2 = zzb(modelContentHandler, arrayList);
            } catch (java.lang.Exception e3) {
                e = e3;
            }
            if (z2) {
                this.zzb.logErrorCodes(arrayList);
                this.modelLoadingState = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.LOCAL_MODEL_LOADED;
                return;
            }
            arrayList.add(17);
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = com.google.mlkit.common.sdkinternal.model.ModelLoader.ModelLoadingState.NO_MODEL_LOADED;
            if (exc != null) {
                throw new com.google.mlkit.common.MlKitException("Remote model load failed with the model options: ".concat(java.lang.String.valueOf(zza())), 14, exc);
            }
            if (e == null) {
                throw new com.google.mlkit.common.MlKitException("Cannot load any model with the model options: ".concat(java.lang.String.valueOf(zza())), 14);
            }
            throw new com.google.mlkit.common.MlKitException("Local model load failed with the model options: ".concat(java.lang.String.valueOf(zza())), 14, e);
        }
    }
}
