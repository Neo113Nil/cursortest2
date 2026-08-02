package com.google.firebase.datastorage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", f = "JavaDataStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class JavaDataStorage$contains$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key<T> $key;
    int label;
    final /* synthetic */ com.google.firebase.datastorage.JavaDataStorage this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.DataStore dataStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dataStore = this.this$0.dataStore;
            this.label = 1;
            obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(dataStore.getData(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) obj;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(preferences != null ? preferences.contains(this.$key) : false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.google.firebase.datastorage.JavaDataStorage$contains$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.firebase.datastorage.JavaDataStorage$contains$1(this.this$0, this.$key, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JavaDataStorage$contains$1(com.google.firebase.datastorage.JavaDataStorage javaDataStorage, androidx.datastore.preferences.core.Preferences.Key<T> key, kotlin.coroutines.Continuation<? super com.google.firebase.datastorage.JavaDataStorage$contains$1> continuation) {
        super(2, continuation);
        this.this$0 = javaDataStorage;
        this.$key = key;
    }
}
