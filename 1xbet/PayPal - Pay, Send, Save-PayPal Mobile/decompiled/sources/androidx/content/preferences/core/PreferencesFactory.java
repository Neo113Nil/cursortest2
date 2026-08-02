package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a)\u0010\u0006\u001a\u00020\u00002\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\u00020\b2\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "createEmpty", "()Landroidx/datastore/preferences/core/Preferences;", "", "Landroidx/datastore/preferences/core/Preferences$Pair;", "pairs", "create", "([Landroidx/datastore/preferences/core/Preferences$Pair;)Landroidx/datastore/preferences/core/Preferences;", "Landroidx/datastore/preferences/core/MutablePreferences;", "createMutable", "([Landroidx/datastore/preferences/core/Preferences$Pair;)Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesFactory {
    public static final androidx.content.preferences.core.Preferences createEmpty() {
        return new androidx.content.preferences.core.MutablePreferences(null, true, 1, null);
    }

    public static final androidx.content.preferences.core.Preferences create(androidx.datastore.preferences.core.Preferences.Pair<?>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        return createMutable((androidx.datastore.preferences.core.Preferences.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final androidx.content.preferences.core.MutablePreferences createMutable(androidx.datastore.preferences.core.Preferences.Pair<?>... pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        androidx.content.preferences.core.MutablePreferences mutablePreferences = new androidx.content.preferences.core.MutablePreferences(null, false, 1, null);
        mutablePreferences.putAll((androidx.datastore.preferences.core.Preferences.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        return mutablePreferences;
    }
}
