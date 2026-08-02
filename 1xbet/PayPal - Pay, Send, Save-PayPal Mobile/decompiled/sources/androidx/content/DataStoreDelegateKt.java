package androidx.content;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011\u001ay\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0011"}, d2 = {"T", "", "fileName", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/datastore/core/DataStore;", "dataStore", "(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/ReadOnlyProperty;", "deviceProtectedDataStore"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataStoreDelegateKt {
    public static /* synthetic */ kotlin.properties.ReadOnlyProperty dataStore$default(java.lang.String str, androidx.content.core.Serializer serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.datastore.DataStoreDelegateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.content.DataStoreDelegateKt.m9143$r8$lambda$ltH8eG9Ry63WYy8nryGg0pFCWg((android.content.Context) obj2);
                }
            };
        }
        if ((i & 16) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, function1, coroutineScope);
    }

    public static final <T> kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.content.core.DataStore<T>> dataStore(java.lang.String str, androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.content.core.DataMigration<T>>> function1, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return new androidx.content.DataStoreSingletonDelegate(str, new androidx.content.OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, function1, coroutineScope, false);
    }

    public static /* synthetic */ kotlin.properties.ReadOnlyProperty deviceProtectedDataStore$default(java.lang.String str, androidx.content.core.Serializer serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.datastore.DataStoreDelegateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.content.DataStoreDelegateKt.$r8$lambda$QaxxswWmDK285YMxuiuwOxCqhsQ((android.content.Context) obj2);
                }
            };
        }
        if ((i & 16) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return deviceProtectedDataStore(str, serializer, replaceFileCorruptionHandler, function1, coroutineScope);
    }

    public static final <T> kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.content.core.DataStore<T>> deviceProtectedDataStore(java.lang.String str, androidx.content.core.Serializer<T> serializer, androidx.content.core.handlers.ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.content.core.DataMigration<T>>> function1, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return new androidx.content.DataStoreSingletonDelegate(str, new androidx.content.OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, function1, coroutineScope, true);
    }

    public static /* synthetic */ java.util.List $r8$lambda$QaxxswWmDK285YMxuiuwOxCqhsQ(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* renamed from: $r8$lambda$ltH8eG9Ry63WYy-8nryGg0pFCWg, reason: not valid java name */
    public static /* synthetic */ java.util.List m9143$r8$lambda$ltH8eG9Ry63WYy8nryGg0pFCWg(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
