package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readAll$2", f = "KeyValueStorage.kt", i = {}, l = {422}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class PreferencesDataStoreKeyValueStorage$readAll$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.String>>, java.lang.Object> {
    final /* synthetic */ java.lang.String $storeName;
    int label;
    final /* synthetic */ com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.DataStore data;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            data = this.this$0.getData(this.$storeName);
            this.label = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(data.getData(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap = ((androidx.content.preferences.core.Preferences) obj).asMap();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : asMap.entrySet()) {
            if (entry.getValue() instanceof java.lang.String) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap2.size());
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.String name2 = ((androidx.datastore.preferences.core.Preferences.Key) entry2.getKey()).getName();
            java.lang.Object value = entry2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            arrayList.add(kotlin.TuplesKt.to(name2, (java.lang.String) value));
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        return ((com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readAll$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.String>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.String>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readAll$2(this.this$0, this.$storeName, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreKeyValueStorage$readAll$2(com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage preferencesDataStoreKeyValueStorage, java.lang.String str, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readAll$2> continuation) {
        super(2, continuation);
        this.this$0 = preferencesDataStoreKeyValueStorage;
        this.$storeName = str;
    }
}
