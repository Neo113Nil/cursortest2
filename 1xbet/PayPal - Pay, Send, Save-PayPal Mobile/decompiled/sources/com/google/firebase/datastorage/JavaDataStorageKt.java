package com.google.firebase.datastorage;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/datastore/preferences/core/Preferences;", "Landroidx/datastore/preferences/core/Preferences$Key;", "key", "defaultValue", "getOrDefault", "(Landroidx/datastore/preferences/core/Preferences;Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JavaDataStorageKt {
    public static final <T> T getOrDefault(androidx.content.preferences.core.Preferences preferences, androidx.datastore.preferences.core.Preferences.Key<T> key, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t2 = (T) preferences.get(key);
        return t2 == null ? t : t2;
    }
}
