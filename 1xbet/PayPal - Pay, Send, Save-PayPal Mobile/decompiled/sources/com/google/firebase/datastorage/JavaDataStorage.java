package com.google.firebase.datastorage;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'*\u00020\u00028CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Landroidx/datastore/preferences/core/Preferences$Key;", "key", "defaultValue", "getSync", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "contains", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/datastore/preferences/core/Preferences;", "putSync", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences;", "", "getAllSync", "()Ljava/util/Map;", "Lkotlin/Function1;", "Landroidx/datastore/preferences/core/MutablePreferences;", "", "transform", "editSync", "(Lkotlin/jvm/functions/Function1;)Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "editLock", "Ljava/lang/ThreadLocal;", "Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore", "Landroidx/datastore/core/DataStore;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JavaDataStorage {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property2(new kotlin.jvm.internal.PropertyReference2Impl(com.google.firebase.datastorage.JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    private final android.content.Context context;
    private final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> dataStore;

    /* renamed from: dataStore$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadOnlyProperty dataStore;
    private final java.lang.ThreadLocal<java.lang.Boolean> editLock;
    private final java.lang.String name;

    public JavaDataStorage(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.context = context;
        this.name = str;
        this.editLock = new java.lang.ThreadLocal<>();
        this.dataStore = androidx.content.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default(str, new androidx.content.core.handlers.ReplaceFileCorruptionHandler(new kotlin.jvm.functions.Function1() { // from class: com.google.firebase.datastorage.JavaDataStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.content.preferences.core.Preferences dataStore_delegate$lambda$0;
                dataStore_delegate$lambda$0 = com.google.firebase.datastorage.JavaDataStorage.dataStore_delegate$lambda$0(com.google.firebase.datastorage.JavaDataStorage.this, (androidx.content.core.CorruptionException) obj);
                return dataStore_delegate$lambda$0;
            }
        }), new kotlin.jvm.functions.Function1() { // from class: com.google.firebase.datastorage.JavaDataStorage$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List dataStore_delegate$lambda$1;
                dataStore_delegate$lambda$1 = com.google.firebase.datastorage.JavaDataStorage.dataStore_delegate$lambda$1(com.google.firebase.datastorage.JavaDataStorage.this, (android.content.Context) obj);
                return dataStore_delegate$lambda$1;
            }
        }, null, 8, null);
        this.dataStore = getDataStore(context);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    private final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> getDataStore(android.content.Context context) {
        return (androidx.content.core.DataStore) this.dataStore.getValue(context, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List dataStore_delegate$lambda$1(com.google.firebase.datastorage.JavaDataStorage javaDataStorage, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return kotlin.collections.CollectionsKt.listOf(androidx.content.preferences.SharedPreferencesMigrationKt.SharedPreferencesMigration$default(context, javaDataStorage.name, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.content.preferences.core.Preferences dataStore_delegate$lambda$0(com.google.firebase.datastorage.JavaDataStorage javaDataStorage, androidx.content.core.CorruptionException corruptionException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(corruptionException, "");
        kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.firebase.datastorage.JavaDataStorage.class).getSimpleName();
        java.lang.String str = javaDataStorage.name;
        android.os.Process.myPid();
        return androidx.content.preferences.core.PreferencesFactory.createEmpty();
    }

    public final <T> T getSync(androidx.datastore.preferences.core.Preferences.Key<T> key, T defaultValue) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.google.firebase.datastorage.JavaDataStorage$getSync$1(this, key, defaultValue, null), 1, null);
        return (T) runBlocking$default;
    }

    public final <T> boolean contains(androidx.datastore.preferences.core.Preferences.Key<T> key) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.google.firebase.datastorage.JavaDataStorage$contains$1(this, key, null), 1, null);
        return ((java.lang.Boolean) runBlocking$default).booleanValue();
    }

    public final <T> androidx.content.preferences.core.Preferences putSync(androidx.datastore.preferences.core.Preferences.Key<T> key, T value) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.google.firebase.datastorage.JavaDataStorage$putSync$1(this, key, value, null), 1, null);
        return (androidx.content.preferences.core.Preferences) runBlocking$default;
    }

    public final java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> getAllSync() {
        java.lang.Object runBlocking$default;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.google.firebase.datastorage.JavaDataStorage$getAllSync$1(this, null), 1, null);
        return (java.util.Map) runBlocking$default;
    }

    public final androidx.content.preferences.core.Preferences editSync(kotlin.jvm.functions.Function1<? super androidx.content.preferences.core.MutablePreferences, kotlin.Unit> transform) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.google.firebase.datastorage.JavaDataStorage$editSync$1(this, transform, null), 1, null);
        return (androidx.content.preferences.core.Preferences) runBlocking$default;
    }
}
