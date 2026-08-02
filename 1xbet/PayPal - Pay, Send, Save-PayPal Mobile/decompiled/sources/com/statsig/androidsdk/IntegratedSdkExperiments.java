package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0011\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/statsig/androidsdk/IntegratedSdkExperiments;", "", "<init>", "()V", "Lcom/statsig/androidsdk/StatsigClient$Companion$KeyValueStorageImplementation;", "getStorageImplementation$android_sdk_release", "()Lcom/statsig/androidsdk/StatsigClient$Companion$KeyValueStorageImplementation;", "Lcom/statsig/androidsdk/KeyValueStorage;", "", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "initialize", "(Lcom/statsig/androidsdk/KeyValueStorage;)V", "", "sdkConfigs", "Lcom/statsig/androidsdk/StatsigClient;", "client", "processSdkConfigs$android_sdk_release", "(Ljava/util/Map;Lcom/statsig/androidsdk/StatsigClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/KeyValueStorage;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntegratedSdkExperiments {
    public static final java.lang.String STORAGE_MIGRATION_KEY = "storage_migration_value";
    public static final java.lang.String STORAGE_MIGRATION_SDK_CONFIG_KEY = "store_g";
    public static final java.lang.String STORE_NAME = "integrated_sdk_experiments";
    private com.statsig.androidsdk.KeyValueStorage<java.lang.String> storage;

    public final void initialize(com.statsig.androidsdk.KeyValueStorage<java.lang.String> storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        this.storage = storage;
    }

    public final com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation getStorageImplementation$android_sdk_release() {
        try {
            com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage = this.storage;
            if (keyValueStorage == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                keyValueStorage = null;
            }
            java.lang.String str = (java.lang.String) com.statsig.androidsdk.KeyValueStorageKt.readValueSync(keyValueStorage, STORE_NAME, STORAGE_MIGRATION_KEY);
            if (str == null) {
                str = "LEGACY";
            }
            for (java.lang.Object obj : com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.getEntries()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation) obj).name(), str)) {
                    return (com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation) obj;
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (java.lang.RuntimeException e) {
            return com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.LEGACY;
        }
    }

    public final java.lang.Object processSdkConfigs$android_sdk_release(java.util.Map<java.lang.String, ? extends java.lang.Object> map, com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String str;
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage = null;
        if (map.containsKey(STORAGE_MIGRATION_SDK_CONFIG_KEY)) {
            java.lang.Object obj = map.get(STORAGE_MIGRATION_SDK_CONFIG_KEY);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            if (statsigClient.checkGate((java.lang.String) obj)) {
                str = "MIGRATION";
            } else {
                str = "LEGACY";
            }
            com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage2 = this.storage;
            if (keyValueStorage2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                keyValueStorage = keyValueStorage2;
            }
            java.lang.Object writeValue = keyValueStorage.writeValue(STORE_NAME, STORAGE_MIGRATION_KEY, str, continuation);
            return writeValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeValue : kotlin.Unit.INSTANCE;
        }
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage3 = this.storage;
        if (keyValueStorage3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            keyValueStorage = keyValueStorage3;
        }
        java.lang.Object removeValue = keyValueStorage.removeValue(STORE_NAME, STORAGE_MIGRATION_KEY, continuation);
        return removeValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? removeValue : kotlin.Unit.INSTANCE;
    }
}
