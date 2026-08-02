package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2", f = "KeyValueStorage.kt", i = {}, l = {388, 390}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class PreferencesDataStoreKeyValueStorage$writeValues$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences>, java.lang.Object> {
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> $entries;
    final /* synthetic */ java.lang.String $storeName;
    int label;
    final /* synthetic */ com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage this$0;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r6 != r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.DataStore data;
        androidx.content.core.DataStore data2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            data = this.this$0.getData(this.$storeName);
            this.label = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(data.getData(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((androidx.content.preferences.core.Preferences) obj).asMap();
        java.util.Map<java.lang.String, java.lang.String> map = this.$entries;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            arrayList.add(androidx.content.preferences.core.PreferencesKeys.stringKey(entry.getKey()).to(entry.getValue()));
        }
        androidx.datastore.preferences.core.Preferences.Pair[] pairArr = (androidx.datastore.preferences.core.Preferences.Pair[]) arrayList.toArray(new androidx.datastore.preferences.core.Preferences.Pair[0]);
        data2 = this.this$0.getData(this.$storeName);
        this.label = 2;
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(data2, new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2.AnonymousClass1(pairArr, null), this);
        return edit == coroutine_suspended ? coroutine_suspended : edit;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2$1", f = "KeyValueStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.datastore.preferences.core.Preferences.Pair<java.lang.String>[] $pairs;
        /* synthetic */ java.lang.Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.L$0;
            androidx.datastore.preferences.core.Preferences.Pair<java.lang.String>[] pairArr = this.$pairs;
            mutablePreferences.putAll((androidx.datastore.preferences.core.Preferences.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2.AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2.AnonymousClass1 anonymousClass1 = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2.AnonymousClass1(this.$pairs, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.preferences.core.Preferences.Pair<java.lang.String>[] pairArr, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pairs = pairArr;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        return ((com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2(this.this$0, this.$storeName, this.$entries, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreKeyValueStorage$writeValues$2(com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage preferencesDataStoreKeyValueStorage, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$writeValues$2> continuation) {
        super(2, continuation);
        this.this$0 = preferencesDataStoreKeyValueStorage;
        this.$storeName = str;
        this.$entries = map;
    }
}
