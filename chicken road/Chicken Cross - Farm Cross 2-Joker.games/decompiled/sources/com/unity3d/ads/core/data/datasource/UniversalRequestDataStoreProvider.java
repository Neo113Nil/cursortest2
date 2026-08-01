package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: UniversalRequestDataStoreProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "", "context", "Landroid/content/Context;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getContext", "()Landroid/content/Context;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "cachedDataStore", "Landroidx/datastore/core/DataStore;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "invoke", "createDataStore", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalRequestDataStoreProvider {
    private DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> cachedDataStore;
    private final Context context;
    private final CoroutineDispatcher dispatcher;

    public UniversalRequestDataStoreProvider(Context context, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.context = context;
        this.dispatcher = dispatcher;
    }

    public final Context getContext() {
        return this.context;
    }

    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
        synchronized (this) {
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStore = this.cachedDataStore;
            if (dataStore != null) {
                return dataStore;
            }
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore = createDataStore();
            this.cachedDataStore = createDataStore;
            return createDataStore;
        }
    }

    private final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore() {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new UniversalRequestStoreSerializer(), new ReplaceFileCorruptionHandler(new Function1() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                UniversalRequestStoreOuterClass.UniversalRequestStore createDataStore$lambda$2;
                createDataStore$lambda$2 = UniversalRequestDataStoreProvider.createDataStore$lambda$2((CorruptionException) obj);
                return createDataStore$lambda$2;
            }
        }), null, CoroutineScopeKt.CoroutineScope(this.dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new Function0() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                File createDataStore$lambda$3;
                createDataStore$lambda$3 = UniversalRequestDataStoreProvider.createDataStore$lambda$3(UniversalRequestDataStoreProvider.this);
                return createDataStore$lambda$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createDataStore$lambda$3(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        return ContextExtensionsKt.unityAdsDataStoreFile(universalRequestDataStoreProvider.context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore createDataStore$lambda$2(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new UniversalRequestStoreSerializer().getDefaultValue();
    }
}
