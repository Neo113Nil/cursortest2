package androidx.datastore.preferences;

/* compiled from: SharedPreferencesMigration.android.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/Preferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ java.util.Set<java.lang.String> $keysToMigrate;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesMigrationKt$getShouldRunMigration$1(java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1> continuation) {
        super(2, continuation);
        this.$keysToMigrate = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1(this.$keysToMigrate, continuation);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.L$0 = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.datastore.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1) create(preferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set<androidx.datastore.preferences.core.Preferences.Key<?>> keySet = ((androidx.datastore.preferences.core.Preferences) this.L$0).asMap().keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10));
        java.util.Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.datastore.preferences.core.Preferences.Key) it.next()).getName());
        }
        java.util.ArrayList arrayList2 = arrayList;
        boolean z = true;
        if (this.$keysToMigrate != androidx.datastore.preferences.SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
            java.util.Set<java.lang.String> set = this.$keysToMigrate;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList2.contains((java.lang.String) it2.next())) {
                        break;
                    }
                }
            }
            z = false;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }
}
