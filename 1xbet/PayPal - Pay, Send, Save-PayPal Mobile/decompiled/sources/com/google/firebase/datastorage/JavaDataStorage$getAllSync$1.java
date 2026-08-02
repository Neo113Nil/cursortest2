package com.google.firebase.datastorage;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class JavaDataStorage$getAllSync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, ? extends java.lang.Object>>, java.lang.Object> {
    int label;
    final /* synthetic */ com.google.firebase.datastorage.JavaDataStorage this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.DataStore dataStore;
        java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap;
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
        return (preferences == null || (asMap = preferences.asMap()) == null) ? kotlin.collections.MapsKt.emptyMap() : asMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, ? extends java.lang.Object>> continuation) {
        return ((com.google.firebase.datastorage.JavaDataStorage$getAllSync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.firebase.datastorage.JavaDataStorage$getAllSync$1(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JavaDataStorage$getAllSync$1(com.google.firebase.datastorage.JavaDataStorage javaDataStorage, kotlin.coroutines.Continuation<? super com.google.firebase.datastorage.JavaDataStorage$getAllSync$1> continuation) {
        super(2, continuation);
        this.this$0 = javaDataStorage;
    }
}
