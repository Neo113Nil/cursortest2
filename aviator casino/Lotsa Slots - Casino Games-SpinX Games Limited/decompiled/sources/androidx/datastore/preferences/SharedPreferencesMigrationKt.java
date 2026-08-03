package androidx.datastore.preferences;

/* compiled from: SharedPreferencesMigration.android.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a/\u0010\u000f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0002¢\u0006\u0002\u0010\u0014\u001a7\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0018\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0019"}, d2 = {"MIGRATE_ALL_KEYS", "", "", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "SharedPreferencesMigration", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "produceSharedPreferences", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "keysToMigrate", "context", "Landroid/content/Context;", "sharedPreferencesName", "getMigrationFunction", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "Lkotlin/coroutines/Continuation;", "", "()Lkotlin/jvm/functions/Function3;", "getShouldRunMigration", "Lkotlin/Function2;", "", "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SharedPreferencesMigrationKt {
    private static final java.util.Set<java.lang.String> MIGRATE_ALL_KEYS = new java.util.LinkedHashSet();

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(android.content.Context context, java.lang.String sharedPreferencesName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> produceSharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    public static /* synthetic */ androidx.datastore.migrations.SharedPreferencesMigration SharedPreferencesMigration$default(kotlin.jvm.functions.Function0 function0, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration((kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences>) function0, (java.util.Set<java.lang.String>) set);
    }

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> produceSharedPreferences, java.util.Set<java.lang.String> keysToMigrate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new androidx.datastore.migrations.SharedPreferencesMigration<>(produceSharedPreferences, (java.util.Set) null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new androidx.datastore.migrations.SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    public static /* synthetic */ androidx.datastore.migrations.SharedPreferencesMigration SharedPreferencesMigration$default(android.content.Context context, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final androidx.datastore.migrations.SharedPreferencesMigration<androidx.datastore.preferences.core.Preferences> SharedPreferencesMigration(android.content.Context context, java.lang.String sharedPreferencesName, java.util.Set<java.lang.String> keysToMigrate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new androidx.datastore.migrations.SharedPreferencesMigration<>(context, sharedPreferencesName, null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 4, null);
        }
        return new androidx.datastore.migrations.SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    private static final kotlin.jvm.functions.Function3<androidx.datastore.migrations.SharedPreferencesView, androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> getMigrationFunction() {
        return new androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1(null);
    }

    private static final kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getShouldRunMigration(java.util.Set<java.lang.String> set) {
        return new androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }

    public static final java.util.Set<java.lang.String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }
}
