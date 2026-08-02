package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class SharedPrefManager {
    public static final com.google.firebase.components.Component<?> COMPONENT = com.google.firebase.components.Component.builder(com.google.mlkit.common.sdkinternal.SharedPrefManager.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.mlkit.common.sdkinternal.MlKitContext.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.mlkit.common.sdkinternal.zzs
        @Override // com.google.firebase.components.ComponentFactory
        public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
            return new com.google.mlkit.common.sdkinternal.SharedPrefManager((android.content.Context) componentContainer.get(android.content.Context.class));
        }
    }).build();
    public static final java.lang.String PREF_FILE = "com.google.mlkit.internal";
    protected final android.content.Context zza;

    public static com.google.mlkit.common.sdkinternal.SharedPrefManager getInstance(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext) {
        return (com.google.mlkit.common.sdkinternal.SharedPrefManager) mlKitContext.get(com.google.mlkit.common.sdkinternal.SharedPrefManager.class);
    }

    public void clearDownloadingModelInfo(com.google.mlkit.common.model.RemoteModel remoteModel) {
        synchronized (this) {
            zza().edit().remove(java.lang.String.format("downloading_model_id_%s", remoteModel.getUniqueModelNameForPersist())).remove(java.lang.String.format("downloading_model_hash_%s", remoteModel.getUniqueModelNameForPersist())).remove(java.lang.String.format("downloading_model_type_%s", getDownloadingModelHash(remoteModel))).remove(java.lang.String.format("downloading_begin_time_%s", remoteModel.getUniqueModelNameForPersist())).remove(java.lang.String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist())).apply();
        }
    }

    public void clearIncompatibleModelInfo(com.google.mlkit.common.model.RemoteModel remoteModel) {
        synchronized (this) {
            zza().edit().remove(java.lang.String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist())).remove(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION).apply();
        }
    }

    public void clearLatestModelHash(com.google.mlkit.common.model.RemoteModel remoteModel) {
        synchronized (this) {
            zza().edit().remove(java.lang.String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist())).commit();
        }
    }

    public java.lang.String getDownloadingModelHash(com.google.mlkit.common.model.RemoteModel remoteModel) {
        java.lang.String string;
        synchronized (this) {
            string = zza().getString(java.lang.String.format("downloading_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
        }
        return string;
    }

    public java.lang.Long getDownloadingModelId(com.google.mlkit.common.model.RemoteModel remoteModel) {
        synchronized (this) {
            long j = zza().getLong(java.lang.String.format("downloading_model_id_%s", remoteModel.getUniqueModelNameForPersist()), -1L);
            if (j < 0) {
                return null;
            }
            return java.lang.Long.valueOf(j);
        }
    }

    public java.lang.String getIncompatibleModelHash(com.google.mlkit.common.model.RemoteModel remoteModel) {
        java.lang.String string;
        synchronized (this) {
            string = zza().getString(java.lang.String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
        }
        return string;
    }

    public java.lang.String getLatestModelHash(com.google.mlkit.common.model.RemoteModel remoteModel) {
        java.lang.String string;
        synchronized (this) {
            string = zza().getString(java.lang.String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
        }
        return string;
    }

    public java.lang.String getMlSdkInstanceId() {
        synchronized (this) {
            java.lang.String string = zza().getString("ml_sdk_instance_id", null);
            if (string != null) {
                return string;
            }
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            zza().edit().putString("ml_sdk_instance_id", obj).apply();
            return obj;
        }
    }

    public long getModelDownloadBeginTimeMs(com.google.mlkit.common.model.RemoteModel remoteModel) {
        long j;
        synchronized (this) {
            j = zza().getLong(java.lang.String.format("downloading_begin_time_%s", remoteModel.getUniqueModelNameForPersist()), 0L);
        }
        return j;
    }

    public long getModelFirstUseTimeMs(com.google.mlkit.common.model.RemoteModel remoteModel) {
        long j;
        synchronized (this) {
            j = zza().getLong(java.lang.String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist()), 0L);
        }
        return j;
    }

    public java.lang.String getPreviousAppVersion() {
        java.lang.String string;
        synchronized (this) {
            string = zza().getString(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, null);
        }
        return string;
    }

    public void setDownloadingModelInfo(long j, com.google.mlkit.common.sdkinternal.ModelInfo modelInfo) {
        synchronized (this) {
            java.lang.String modelNameForPersist = modelInfo.getModelNameForPersist();
            zza().edit().putString(java.lang.String.format("downloading_model_hash_%s", modelNameForPersist), modelInfo.getModelHash()).putLong(java.lang.String.format("downloading_model_id_%s", modelNameForPersist), j).putLong(java.lang.String.format("downloading_begin_time_%s", modelNameForPersist), android.os.SystemClock.elapsedRealtime()).apply();
        }
    }

    public void setIncompatibleModelInfo(com.google.mlkit.common.model.RemoteModel remoteModel, java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            zza().edit().putString(java.lang.String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist()), str).putString(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, str2).apply();
        }
    }

    public void setLatestModelHash(com.google.mlkit.common.model.RemoteModel remoteModel, java.lang.String str) {
        synchronized (this) {
            zza().edit().putString(java.lang.String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), str).apply();
        }
    }

    public void setModelFirstUseTimeMs(com.google.mlkit.common.model.RemoteModel remoteModel, long j) {
        synchronized (this) {
            zza().edit().putLong(java.lang.String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist()), j).apply();
        }
    }

    protected final android.content.SharedPreferences zza() {
        return this.zza.getSharedPreferences(PREF_FILE, 0);
    }

    public final java.lang.String zzb(java.lang.String str, long j) {
        java.lang.String string;
        synchronized (this) {
            string = zza().getString(java.lang.String.format("cached_local_model_hash_%1s_%2s", com.google.android.gms.common.internal.Preconditions.checkNotNull(str), java.lang.Long.valueOf(j)), null);
        }
        return string;
    }

    public final void zzc(java.lang.String str, long j, java.lang.String str2) {
        synchronized (this) {
            zza().edit().putString(java.lang.String.format("cached_local_model_hash_%1s_%2s", com.google.android.gms.common.internal.Preconditions.checkNotNull(str), java.lang.Long.valueOf(j)), str2).apply();
        }
    }

    public SharedPrefManager(android.content.Context context) {
        this.zza = context;
    }
}
