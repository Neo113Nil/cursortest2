package com.google.firebase.datastorage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class JavaDataStorage$putSync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences>, java.lang.Object> {
    final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key<T> $key;
    final /* synthetic */ T $value;
    int label;
    final /* synthetic */ com.google.firebase.datastorage.JavaDataStorage this$0;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ java.lang.Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ((androidx.content.preferences.core.MutablePreferences) this.L$0).set(this.$key, this.$value);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.content.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.datastorage.JavaDataStorage$putSync$1.AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.google.firebase.datastorage.JavaDataStorage$putSync$1.AnonymousClass1 anonymousClass1 = new com.google.firebase.datastorage.JavaDataStorage$putSync$1.AnonymousClass1(this.$key, this.$value, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.datastore.preferences.core.Preferences.Key<T> key, T t, kotlin.coroutines.Continuation<? super com.google.firebase.datastorage.JavaDataStorage$putSync$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$key = key;
            this.$value = t;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.DataStore dataStore;
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
        dataStore = this.this$0.dataStore;
        this.label = 1;
        java.lang.Object edit = androidx.content.preferences.core.PreferencesKt.edit(dataStore, new com.google.firebase.datastorage.JavaDataStorage$putSync$1.AnonymousClass1(this.$key, this.$value, null), this);
        return edit == coroutine_suspended ? coroutine_suspended : edit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        return ((com.google.firebase.datastorage.JavaDataStorage$putSync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.firebase.datastorage.JavaDataStorage$putSync$1(this.this$0, this.$key, this.$value, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JavaDataStorage$putSync$1(com.google.firebase.datastorage.JavaDataStorage javaDataStorage, androidx.datastore.preferences.core.Preferences.Key<T> key, T t, kotlin.coroutines.Continuation<? super com.google.firebase.datastorage.JavaDataStorage$putSync$1> continuation) {
        super(2, continuation);
        this.this$0 = javaDataStorage;
        this.$key = key;
        this.$value = t;
    }
}
