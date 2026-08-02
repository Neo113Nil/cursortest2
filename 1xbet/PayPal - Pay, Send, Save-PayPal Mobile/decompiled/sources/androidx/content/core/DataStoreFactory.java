package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013JY\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0016Ji\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/datastore/core/DataStoreFactory;", "", "<init>", "()V", "T", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Landroidx/datastore/core/DataStore;", "Landroid/content/Context;", "context", "", "fileName", "createInDeviceProtectedStorage", "(Landroid/content/Context;Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Landroidx/datastore/core/DataStore;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataStoreFactory {
    public static final androidx.content.core.DataStoreFactory INSTANCE = new androidx.content.core.DataStoreFactory();

    public static /* synthetic */ androidx.content.core.DataStore create$default(androidx.content.core.DataStoreFactory dataStoreFactory, androidx.content.core.Storage storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.content.core.Actual_jvmKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, coroutineScope);
    }

    private DataStoreFactory() {
    }

    public static /* synthetic */ androidx.content.core.DataStore create$default(androidx.content.core.DataStoreFactory dataStoreFactory, androidx.content.core.Serializer serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = (i & 2) != 0 ? null : replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, coroutineScope, function0);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> corruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<T>> migrations, kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "");
        return create(new androidx.content.core.FileStorage(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Storage<T> storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> corruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<T>> migrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        if (corruptionHandler == null) {
            corruptionHandler = (androidx.content.core.handlers.ReplaceFileCorruptionHandler<T>) new androidx.content.core.handlers.NoOpCorruptionHandler();
        }
        return new androidx.content.core.DataStoreImpl(storage, kotlin.collections.CollectionsKt.listOf(androidx.content.core.DataMigrationInitializer.INSTANCE.getInitializer(migrations)), corruptionHandler, scope);
    }

    public static /* synthetic */ androidx.content.core.DataStore createInDeviceProtectedStorage$default(androidx.content.core.DataStoreFactory dataStoreFactory, android.content.Context context, java.lang.String str, androidx.content.core.Serializer serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        return dataStoreFactory.createInDeviceProtectedStorage(context, str, serializer, (i & 8) != 0 ? null : replaceFileCorruptionHandler, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 32) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))) : coroutineScope);
    }

    public final <T> androidx.content.core.DataStore<T> createInDeviceProtectedStorage(final android.content.Context context, final java.lang.String fileName, androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> corruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<T>> migrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        return new androidx.content.core.DataStoreImpl(new androidx.content.core.FileStorage(serializer, null, new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.core.DataStoreFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.io.File deviceProtectedDataStoreFile;
                deviceProtectedDataStoreFile = androidx.content.core.DeviceProtectedDataStoreFile.deviceProtectedDataStoreFile(context, fileName);
                return deviceProtectedDataStoreFile;
            }
        }, 2, null), kotlin.collections.CollectionsKt.listOf(androidx.content.core.DataMigrationInitializer.INSTANCE.getInitializer(migrations)), corruptionHandler != null ? corruptionHandler : new androidx.content.core.handlers.NoOpCorruptionHandler(), scope);
    }

    public final <T> androidx.content.core.DataStore<T> createInDeviceProtectedStorage(android.content.Context context, java.lang.String str, androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return createInDeviceProtectedStorage$default(this, context, str, serializer, replaceFileCorruptionHandler, list, null, 32, null);
    }

    public final <T> androidx.content.core.DataStore<T> createInDeviceProtectedStorage(android.content.Context context, java.lang.String str, androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        return createInDeviceProtectedStorage$default(this, context, str, serializer, replaceFileCorruptionHandler, null, null, 48, null);
    }

    public final <T> androidx.content.core.DataStore<T> createInDeviceProtectedStorage(android.content.Context context, java.lang.String str, androidx.content.core.Serializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        return createInDeviceProtectedStorage$default(this, context, str, serializer, null, null, null, 56, null);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Storage<T> storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return create$default(this, storage, replaceFileCorruptionHandler, list, null, 8, null);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Storage<T> storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Storage<T> storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Serializer<T> serializer, kotlin.jvm.functions.Function0<? extends java.io.File> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, serializer, null, null, null, function0, 14, null);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, kotlin.jvm.functions.Function0<? extends java.io.File> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, function0, 12, null);
    }

    public final <T> androidx.content.core.DataStore<T> create(androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<T>> list, kotlin.jvm.functions.Function0<? extends java.io.File> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, serializer, replaceFileCorruptionHandler, list, null, function0, 8, null);
    }
}
