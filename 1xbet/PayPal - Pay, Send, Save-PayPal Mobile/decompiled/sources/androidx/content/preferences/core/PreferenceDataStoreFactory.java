package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0014JS\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b\u0016\u0010\u0011"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "<init>", "()V", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Landroidx/datastore/preferences/core/Preferences;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Landroidx/datastore/core/DataStore;", "Lokio/Path;", "createWithPath"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory {
    public static final androidx.content.preferences.core.PreferenceDataStoreFactory INSTANCE = new androidx.content.preferences.core.PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.content.core.DataStore create$default(androidx.content.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory, androidx.content.core.Storage storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.content.preferences.core.Actual_jvmAndroidKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferenceDataStoreFactory.create((androidx.content.core.Storage<androidx.content.preferences.core.Preferences>) storage, (androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences>) replaceFileCorruptionHandler, (java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>>) list, coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.content.core.DataStore create$default(androidx.content.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferenceDataStoreFactory.create((androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences>) replaceFileCorruptionHandler, (java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>>) list, coroutineScope, (kotlin.jvm.functions.Function0<? extends java.io.File>) function0);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> corruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>> migrations, kotlinx.coroutines.CoroutineScope scope, final kotlin.jvm.functions.Function0<? extends java.io.File> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "");
        return new androidx.content.preferences.core.PreferenceDataStore(create(new androidx.content.core.FileStorage(androidx.content.preferences.core.PreferencesFileSerializer.INSTANCE, null, new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.content.preferences.core.PreferenceDataStoreFactory.$r8$lambda$9BrpQzy58wyiliC4ZrxXEeAelC0(kotlin.jvm.functions.Function0.this);
            }
        }, 2, null), corruptionHandler, migrations, scope));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.content.core.DataStore createWithPath$default(androidx.content.preferences.core.PreferenceDataStoreFactory preferenceDataStoreFactory, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, java.util.List list, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.content.preferences.core.Actual_jvmAndroidKt.ioDispatcher().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, coroutineScope, function0);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(androidx.content.core.Storage<androidx.content.preferences.core.Preferences> storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> corruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>> migrations, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        return new androidx.content.preferences.core.PreferenceDataStore(androidx.content.core.DataStoreFactory.INSTANCE.create(storage, corruptionHandler, migrations, scope));
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> createWithPath(androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> corruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>> migrations, kotlinx.coroutines.CoroutineScope scope, final kotlin.jvm.functions.Function0<okio.Path> produceFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceFile, "");
        return create(corruptionHandler, migrations, scope, new kotlin.jvm.functions.Function0() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.io.File file;
                file = ((okio.Path) kotlin.jvm.functions.Function0.this.invoke()).toFile();
                return file;
            }
        });
    }

    public static /* synthetic */ java.io.File $r8$lambda$9BrpQzy58wyiliC4ZrxXEeAelC0(kotlin.jvm.functions.Function0 function0) {
        java.io.File file = (java.io.File) function0.invoke();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.io.FilesKt.getExtension(file), "preferences_pb")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("File extension for file: ");
            sb.append(file);
            sb.append(" does not match required extension for Preferences file: preferences_pb");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        java.io.File absoluteFile = file.getAbsoluteFile();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absoluteFile, "");
        return absoluteFile;
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> createWithPath(kotlin.jvm.functions.Function0<okio.Path> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return createWithPath$default(this, null, null, null, function0, 7, null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> createWithPath(androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function0<okio.Path> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, function0, 6, null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> createWithPath(androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>> list, kotlin.jvm.functions.Function0<okio.Path> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return createWithPath$default(this, replaceFileCorruptionHandler, list, null, function0, 4, null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(kotlin.jvm.functions.Function0<? extends java.io.File> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, (androidx.content.core.handlers.ReplaceFileCorruptionHandler) null, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, function0, 7, (java.lang.Object) null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function0<? extends java.io.File> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, replaceFileCorruptionHandler, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, function0, 6, (java.lang.Object) null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>> list, kotlin.jvm.functions.Function0<? extends java.io.File> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, replaceFileCorruptionHandler, list, (kotlinx.coroutines.CoroutineScope) null, function0, 4, (java.lang.Object) null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(androidx.content.core.Storage<androidx.content.preferences.core.Preferences> storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler, java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return create$default(this, storage, replaceFileCorruptionHandler, list, (kotlinx.coroutines.CoroutineScope) null, 8, (java.lang.Object) null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(androidx.content.core.Storage<androidx.content.preferences.core.Preferences> storage, androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        return create$default(this, storage, replaceFileCorruptionHandler, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, 12, (java.lang.Object) null);
    }

    public final androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> create(androidx.content.core.Storage<androidx.content.preferences.core.Preferences> storage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        return create$default(this, storage, (androidx.content.core.handlers.ReplaceFileCorruptionHandler) null, (java.util.List) null, (kotlinx.coroutines.CoroutineScope) null, 14, (java.lang.Object) null);
    }
}
