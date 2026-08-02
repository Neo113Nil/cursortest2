package androidx.content.preferences;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/Preferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.preferences.core.Preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set<androidx.datastore.preferences.core.Preferences.Key<?>> keySet = ((androidx.content.preferences.core.Preferences) this.getHighResolutionOutputSizeshNQ4ISI).asMap().keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10));
        java.util.Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.datastore.preferences.core.Preferences.Key) it.next()).getName());
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (this.Camera2StreamConfigurationMap != androidx.content.preferences.SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
            java.util.Set<java.lang.String> set = this.Camera2StreamConfigurationMap;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList2.contains((java.lang.String) it2.next())) {
                    }
                }
            }
            z = false;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        }
        z = true;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.content.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1) create(preferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1(this.Camera2StreamConfigurationMap, continuation);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesMigrationKt$getShouldRunMigration$1(java.util.Set<java.lang.String> set, kotlin.coroutines.Continuation<? super androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = set;
    }
}
