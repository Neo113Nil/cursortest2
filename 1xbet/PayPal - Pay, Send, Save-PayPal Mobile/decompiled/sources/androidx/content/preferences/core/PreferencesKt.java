package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a>\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlin/Function2;", "Landroidx/datastore/preferences/core/MutablePreferences;", "Lkotlin/coroutines/Continuation;", "", "", "transform", "edit", "(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesKt {
    public static final java.lang.Object edit(androidx.content.core.DataStore<androidx.content.preferences.core.Preferences> dataStore, kotlin.jvm.functions.Function2<? super androidx.content.preferences.core.MutablePreferences, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
        return dataStore.updateData(new androidx.content.preferences.core.PreferencesKt$edit$2(function2, null), continuation);
    }
}
