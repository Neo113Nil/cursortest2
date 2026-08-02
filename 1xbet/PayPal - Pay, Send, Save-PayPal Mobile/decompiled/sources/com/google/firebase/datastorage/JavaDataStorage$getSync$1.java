package com.google.firebase.datastorage;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class JavaDataStorage$getSync$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ T $defaultValue;
    final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key<T> $key;
    int label;
    final /* synthetic */ com.google.firebase.datastorage.JavaDataStorage this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.DataStore dataStore;
        java.lang.Object obj2;
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
        return (preferences == null || (obj2 = preferences.get(this.$key)) == null) ? this.$defaultValue : obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
        return ((com.google.firebase.datastorage.JavaDataStorage$getSync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.firebase.datastorage.JavaDataStorage$getSync$1(this.this$0, this.$key, this.$defaultValue, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JavaDataStorage$getSync$1(com.google.firebase.datastorage.JavaDataStorage javaDataStorage, androidx.datastore.preferences.core.Preferences.Key<T> key, T t, kotlin.coroutines.Continuation<? super com.google.firebase.datastorage.JavaDataStorage$getSync$1> continuation) {
        super(2, continuation);
        this.this$0 = javaDataStorage;
        this.$key = key;
        this.$defaultValue = t;
    }
}
