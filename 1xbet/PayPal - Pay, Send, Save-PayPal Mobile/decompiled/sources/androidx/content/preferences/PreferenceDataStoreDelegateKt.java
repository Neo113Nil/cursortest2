package androidx.content.preferences;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "name", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Landroidx/datastore/preferences/core/Preferences;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/datastore/core/DataStore;", "preferencesDataStore", "(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/ReadOnlyProperty;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferenceDataStoreDelegateKt {
    public static /* synthetic */ kotlin.properties.ReadOnlyProperty preferencesDataStore$default(java.lang.String str, androidx.content.core.handlers.ReplaceFileCorruptionHandler replaceFileCorruptionHandler, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.content.preferences.PreferenceDataStoreDelegateKt.$r8$lambda$M8wy2jP_OP2ZhUCev6CMnhPDA50((android.content.Context) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, function1, coroutineScope);
    }

    public static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.content.core.DataStore<androidx.content.preferences.core.Preferences>> preferencesDataStore(java.lang.String str, androidx.content.core.handlers.ReplaceFileCorruptionHandler<androidx.content.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>>> function1, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return new androidx.content.preferences.PreferenceDataStoreSingletonDelegate(str, replaceFileCorruptionHandler, function1, coroutineScope);
    }

    public static /* synthetic */ java.util.List $r8$lambda$M8wy2jP_OP2ZhUCev6CMnhPDA50(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
