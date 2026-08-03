package com.unity3d.ads.core.data.datasource;

/* compiled from: UniversalRequestDataStoreProvider.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "", "context", "Landroid/content/Context;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "cachedDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "getContext", "()Landroid/content/Context;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "createDataStore", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UniversalRequestDataStoreProvider {
    private androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> cachedDataStore;
    private final android.content.Context context;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    public UniversalRequestDataStoreProvider(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.context = context;
        this.dispatcher = dispatcher;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
        synchronized (this) {
            androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> dataStore = this.cachedDataStore;
            if (dataStore != null) {
                return dataStore;
            }
            androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore = createDataStore();
            this.cachedDataStore = createDataStore;
            return createDataStore;
        }
    }

    private final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore() {
        return androidx.datastore.core.DataStoreFactory.create$default(androidx.datastore.core.DataStoreFactory.INSTANCE, new com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer(), new androidx.datastore.core.handlers.ReplaceFileCorruptionHandler(new kotlin.jvm.functions.Function1<androidx.datastore.core.CorruptionException, com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$createDataStore$1
            @Override // kotlin.jvm.functions.Function1
            public final com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore invoke(androidx.datastore.core.CorruptionException it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return new com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer().getDefaultValue();
            }
        }), null, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.dispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))), new kotlin.jvm.functions.Function0<java.io.File>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$createDataStore$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.io.File invoke() {
                return com.unity3d.ads.core.extensions.ContextExtensionsKt.unityAdsDataStoreFile(com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.this.getContext(), com.unity3d.services.core.di.ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
            }
        }, 4, null);
    }
}
