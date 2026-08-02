package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0017\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/statsig/androidsdk/LegacyKeyValueStorage;", "Lcom/statsig/androidsdk/KeyValueStorage;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeName", "clearStore", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "readAll", "key", "readValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "writeValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "writeValues", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider$delegate", "Lkotlin/Lazy;", "getDispatcherProvider", "()Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegacyKeyValueStorage implements com.statsig.androidsdk.KeyValueStorage<java.lang.String> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.LegacyKeyValueStorage.Companion INSTANCE = new com.statsig.androidsdk.LegacyKeyValueStorage.Companion(null);
    public static final java.lang.String SHARED_PREFERENCES_KEY = "com.statsig.androidsdk";
    private final android.content.Context context;

    /* renamed from: dispatcherProvider$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy dispatcherProvider;
    private final android.content.SharedPreferences sharedPreferences;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003"}, d2 = {"Lcom/statsig/androidsdk/LegacyKeyValueStorage$Companion;", "", "<init>", "()V", "", "SHARED_PREFERENCES_KEY", "Ljava/lang/String;", "getSHARED_PREFERENCES_KEY$android_sdk_release$annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        public static /* synthetic */ void getSHARED_PREFERENCES_KEY$android_sdk_release$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LegacyKeyValueStorage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.statsig.androidsdk", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.sharedPreferences = sharedPreferences;
        this.dispatcherProvider = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.statsig.androidsdk.CoroutineDispatcherProvider>() { // from class: com.statsig.androidsdk.LegacyKeyValueStorage$dispatcherProvider$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.statsig.androidsdk.CoroutineDispatcherProvider invoke() {
                return new com.statsig.androidsdk.CoroutineDispatcherProvider(null, null, null, 7, null);
            }
        });
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final /* bridge */ /* synthetic */ java.lang.Object writeValue(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        return writeValue2(str, str2, str3, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    private final com.statsig.androidsdk.CoroutineDispatcherProvider getDispatcherProvider() {
        return (com.statsig.androidsdk.CoroutineDispatcherProvider) this.dispatcherProvider.getValue();
    }

    /* renamed from: writeValue, reason: avoid collision after fix types in other method */
    public final java.lang.Object writeValue2(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(getDispatcherProvider().getIo(), new com.statsig.androidsdk.LegacyKeyValueStorage$writeValue$2(this, str2, str3, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object writeValues(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.String> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(getDispatcherProvider().getIo(), new com.statsig.androidsdk.LegacyKeyValueStorage$writeValues$2(this, map, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object readValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(getDispatcherProvider().getIo(), new com.statsig.androidsdk.LegacyKeyValueStorage$readValue$2(this, str2, null), continuation);
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object removeValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(getDispatcherProvider().getIo(), new com.statsig.androidsdk.LegacyKeyValueStorage$removeValue$2(this, str2, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object clearStore(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        throw new kotlin.NotImplementedError("LegacyKeyValueStore does not support clearStore(storeName)");
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object clearAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(getDispatcherProvider().getIo(), new com.statsig.androidsdk.LegacyKeyValueStorage$clearAll$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.statsig.androidsdk.KeyValueStorage
    public final java.lang.Object readAll(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.String>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(getDispatcherProvider().getIo(), new com.statsig.androidsdk.LegacyKeyValueStorage$readAll$2(this, null), continuation);
    }
}
