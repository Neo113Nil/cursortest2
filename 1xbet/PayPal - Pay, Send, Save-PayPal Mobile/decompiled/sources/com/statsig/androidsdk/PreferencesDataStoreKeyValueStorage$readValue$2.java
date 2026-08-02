package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readValue$2", f = "KeyValueStorage.kt", i = {}, l = {398}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class PreferencesDataStoreKeyValueStorage$readValue$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ java.lang.String $key;
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
        return ((androidx.content.preferences.core.Preferences) obj).get(androidx.content.preferences.core.PreferencesKeys.stringKey(this.$key));
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readValue$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readValue$2(this.this$0, this.$storeName, this.$key, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreKeyValueStorage$readValue$2(com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage preferencesDataStoreKeyValueStorage, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$readValue$2> continuation) {
        super(2, continuation);
        this.this$0 = preferencesDataStoreKeyValueStorage;
        this.$storeName = str;
        this.$key = str2;
    }
}
