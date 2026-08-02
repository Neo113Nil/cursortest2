package androidx.content.preferences;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "sharedPrefs", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentData"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.content.migrations.SharedPreferencesView, androidx.content.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.migrations.SharedPreferencesView sharedPreferencesView = (androidx.content.migrations.SharedPreferencesView) this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.content.preferences.core.Preferences preferences = (androidx.content.preferences.core.Preferences) this.getHighSpeedVideoFpsRanges;
        java.util.Set<androidx.datastore.preferences.core.Preferences.Key<?>> keySet = preferences.asMap().keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10));
        java.util.Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.datastore.preferences.core.Preferences.Key) it.next()).getName());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Map<java.lang.String, java.lang.Object> all = sharedPreferencesView.getAll();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : all.entrySet()) {
            if (!arrayList2.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        androidx.content.preferences.core.MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry2.getKey();
            java.lang.Object value = entry2.getValue();
            if (value instanceof java.lang.Boolean) {
                mutablePreferences.set(androidx.content.preferences.core.PreferencesKeys.booleanKey(str), value);
            } else if (value instanceof java.lang.Float) {
                mutablePreferences.set(androidx.content.preferences.core.PreferencesKeys.floatKey(str), value);
            } else if (value instanceof java.lang.Integer) {
                mutablePreferences.set(androidx.content.preferences.core.PreferencesKeys.intKey(str), value);
            } else if (value instanceof java.lang.Long) {
                mutablePreferences.set(androidx.content.preferences.core.PreferencesKeys.longKey(str), value);
            } else if (value instanceof java.lang.String) {
                mutablePreferences.set(androidx.content.preferences.core.PreferencesKeys.stringKey(str), value);
            } else if (value instanceof java.util.Set) {
                androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey = androidx.content.preferences.core.PreferencesKeys.stringSetKey(str);
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                mutablePreferences.set(stringSetKey, (java.util.Set) value);
            }
        }
        return mutablePreferences.toPreferences();
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(androidx.content.migrations.SharedPreferencesView sharedPreferencesView, androidx.content.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        androidx.content.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new androidx.content.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1(continuation);
        sharedPreferencesMigrationKt$getMigrationFunction$1.getHighResolutionOutputSizeshNQ4ISI = sharedPreferencesView;
        sharedPreferencesMigrationKt$getMigrationFunction$1.getHighSpeedVideoFpsRanges = preferences;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    SharedPreferencesMigrationKt$getMigrationFunction$1(kotlin.coroutines.Continuation<? super androidx.content.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1> continuation) {
        super(3, continuation);
    }
}
