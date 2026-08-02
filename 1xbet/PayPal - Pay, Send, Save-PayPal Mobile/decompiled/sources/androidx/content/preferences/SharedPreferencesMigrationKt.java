package androidx.content.preferences;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\r\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "SharedPreferencesMigration", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;)Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroid/content/Context;", "context", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Landroidx/datastore/migrations/SharedPreferencesMigration;", "MIGRATE_ALL_KEYS", "Ljava/util/Set;", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharedPreferencesMigrationKt {
    private static final java.util.Set<java.lang.String> MIGRATE_ALL_KEYS = new java.util.LinkedHashSet();

    public static /* synthetic */ androidx.content.migrations.SharedPreferencesMigration SharedPreferencesMigration$default(kotlin.jvm.functions.Function0 function0, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration((kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences>) function0, (java.util.Set<java.lang.String>) set);
    }

    public static final androidx.content.migrations.SharedPreferencesMigration<androidx.content.preferences.core.Preferences> SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> function0, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        if (set == MIGRATE_ALL_KEYS) {
            return new androidx.content.migrations.SharedPreferencesMigration<>(function0, (java.util.Set) null, new androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null), new androidx.content.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1(null), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new androidx.content.migrations.SharedPreferencesMigration<>(function0, set, new androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null), new androidx.content.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1(null));
    }

    public static /* synthetic */ androidx.content.migrations.SharedPreferencesMigration SharedPreferencesMigration$default(android.content.Context context, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final androidx.content.migrations.SharedPreferencesMigration<androidx.content.preferences.core.Preferences> SharedPreferencesMigration(android.content.Context context, java.lang.String str, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        if (set == MIGRATE_ALL_KEYS) {
            return new androidx.content.migrations.SharedPreferencesMigration<>(context, str, null, new androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null), new androidx.content.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1(null), 4, null);
        }
        return new androidx.content.migrations.SharedPreferencesMigration<>(context, str, set, new androidx.content.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null), new androidx.content.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1(null));
    }

    public static final java.util.Set<java.lang.String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }

    public static final androidx.content.migrations.SharedPreferencesMigration<androidx.content.preferences.core.Preferences> SharedPreferencesMigration(kotlin.jvm.functions.Function0<? extends android.content.SharedPreferences> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return SharedPreferencesMigration$default(function0, null, 2, null);
    }

    public static final androidx.content.migrations.SharedPreferencesMigration<androidx.content.preferences.core.Preferences> SharedPreferencesMigration(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return SharedPreferencesMigration$default(context, str, null, 4, null);
    }
}
