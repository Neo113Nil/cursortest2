package com.datadog.android.api.feature;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\u000b\u001a,\u0012\u0004\u0012\u00020\u0006\u0012 \u0012\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0018\u00010\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0001H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0016\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u0015\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\u0016\u0010\u0017J_\u0010\u0019\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022>\u0010\u0015\u001a:\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0014\u0012%\u0012#\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\t0\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/api/feature/FeatureScope;", "", "", "", "withFeatureContexts", "Lkotlin/Pair;", "Lcom/datadog/android/api/context/DatadogContext;", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "getWriteContextSync", "(Ljava/util/Set;)Lkotlin/Pair;", "event", "sendEvent", "(Ljava/lang/Object;)V", "Lcom/datadog/android/api/feature/Feature;", "T", "unwrap", "()Lcom/datadog/android/api/feature/Feature;", "Lkotlin/ParameterName;", com.sun.jna.Callback.METHOD_NAME, "withContext", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "withWriteContext", "(Ljava/util/Set;Lkotlin/jvm/functions/Function2;)V", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "getDataStore", "()Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "dataStore"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FeatureScope {
    com.datadog.android.api.storage.datastore.DataStoreHandler getDataStore();

    kotlin.Pair<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit>> getWriteContextSync(java.util.Set<java.lang.String> withFeatureContexts);

    void sendEvent(java.lang.Object event);

    <T extends com.datadog.android.api.feature.Feature> T unwrap();

    void withContext(java.util.Set<java.lang.String> withFeatureContexts, kotlin.jvm.functions.Function1<? super com.datadog.android.api.context.DatadogContext, kotlin.Unit> callback);

    void withWriteContext(java.util.Set<java.lang.String> withFeatureContexts, kotlin.jvm.functions.Function2<? super com.datadog.android.api.context.DatadogContext, ? super kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit>, kotlin.Unit> callback);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void withWriteContext$default(com.datadog.android.api.feature.FeatureScope featureScope, java.util.Set set, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withWriteContext");
            }
            if ((i & 1) != 0) {
                set = kotlin.collections.SetsKt.emptySet();
            }
            featureScope.withWriteContext(set, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void withContext$default(com.datadog.android.api.feature.FeatureScope featureScope, java.util.Set set, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withContext");
            }
            if ((i & 1) != 0) {
                set = kotlin.collections.SetsKt.emptySet();
            }
            featureScope.withContext(set, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlin.Pair getWriteContextSync$default(com.datadog.android.api.feature.FeatureScope featureScope, java.util.Set set, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWriteContextSync");
            }
            if ((i & 1) != 0) {
                set = kotlin.collections.SetsKt.emptySet();
            }
            return featureScope.getWriteContextSync(set);
        }
    }
}
