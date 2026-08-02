package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2", f = "KeyValueStorage.kt", i = {}, l = {403}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class PreferencesDataStoreKeyValueStorage$removeValue$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences>, java.lang.Object> {
    final /* synthetic */ java.lang.String $key;
    final /* synthetic */ java.lang.String $storeName;
    int label;
    final /* synthetic */ com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage this$0;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2$1", f = "KeyValueStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $key;
        /* synthetic */ java.lang.Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ((androidx.content.preferences.core.MutablePreferences) this.L$0).remove(androidx.content.preferences.core.PreferencesKeys.stringKey(this.$key));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2.AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2.AnonymousClass1 anonymousClass1 = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2.AnonymousClass1(this.$key, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(java.lang.String str, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$key = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.DataStore data;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        data = this.this$0.getData(this.$storeName);
        this.label = 1;
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(data, new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2.AnonymousClass1(this.$key, null), this);
        return edit == coroutine_suspended ? coroutine_suspended : edit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        return ((com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2(this.this$0, this.$storeName, this.$key, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesDataStoreKeyValueStorage$removeValue$2(com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage preferencesDataStoreKeyValueStorage, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage$removeValue$2> continuation) {
        super(2, continuation);
        this.this$0 = preferencesDataStoreKeyValueStorage;
        this.$storeName = str;
        this.$key = str2;
    }
}
