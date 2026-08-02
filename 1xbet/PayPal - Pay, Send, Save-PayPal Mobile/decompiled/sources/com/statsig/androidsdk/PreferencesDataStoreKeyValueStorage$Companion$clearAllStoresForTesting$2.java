package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2", f = "KeyValueStorage.kt", i = {}, l = {366}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    int label;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0060 -> B:5:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Iterator it;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            concurrentHashMap = com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.storeMap;
            java.util.Set keySet = concurrentHashMap.keySet();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
            it = kotlin.collections.CollectionsKt.toList(keySet).iterator();
            while (it.hasNext()) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (java.util.Iterator) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            concurrentHashMap2 = com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage.storeMap;
            androidx.content.core.DataStore dataStore = (androidx.content.core.DataStore) concurrentHashMap2.get(str);
            if (dataStore != null) {
                com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2$1$1 preferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2$1$1 = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2$1$1(null);
                this.L$0 = it;
                this.label = 1;
                obj = androidx.content.preferences.core.PreferencesKt.edit(dataStore, preferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2$1$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                while (it.hasNext()) {
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2(continuation);
    }

    PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2(kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$Companion$clearAllStoresForTesting$2> continuation) {
        super(2, continuation);
    }
}
