package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "fromVersion", "toVersion", "", "isMigrationRequired", "(Landroidx/room/DatabaseConfiguration;II)Z", "Landroidx/room/RoomDatabase$MigrationContainer;", "startVersion", "endVersion", "contains", "(Landroidx/room/RoomDatabase$MigrationContainer;II)Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "Landroidx/room/migration/Migration;", "findMigrationPath", "(Landroidx/room/RoomDatabase$MigrationContainer;II)Ljava/util/List;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MigrationUtil {
    public static final boolean isMigrationRequired(androidx.room.DatabaseConfiguration databaseConfiguration, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        if (i > i2 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        java.util.Set<java.lang.Integer> migrationNotRequiredFrom$room_runtime = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime == null || !migrationNotRequiredFrom$room_runtime.contains(java.lang.Integer.valueOf(i)));
    }

    public static final boolean contains(androidx.room.RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, androidx.room.migration.Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(java.lang.Integer.valueOf(i))) {
            return false;
        }
        java.util.Map<java.lang.Integer, androidx.room.migration.Migration> map = migrations.get(java.lang.Integer.valueOf(i));
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return map.containsKey(java.lang.Integer.valueOf(i2));
    }

    public static final java.util.List<androidx.room.migration.Migration> findMigrationPath(androidx.room.RoomDatabase.MigrationContainer migrationContainer, int i, int i2) {
        kotlin.Pair<java.util.Map<java.lang.Integer, androidx.room.migration.Migration>, java.lang.Iterable<java.lang.Integer>> sortedNodes$room_runtime;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrationContainer, "");
        if (i == i2) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        boolean z2 = i2 > i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
            } else if (i <= i2) {
                return arrayList;
            }
            if (z2) {
                sortedNodes$room_runtime = migrationContainer.getSortedDescendingNodes$room_runtime(i);
            } else {
                sortedNodes$room_runtime = migrationContainer.getSortedNodes$room_runtime(i);
            }
            if (sortedNodes$room_runtime == null) {
                return null;
            }
            java.util.Map<java.lang.Integer, androidx.room.migration.Migration> component1 = sortedNodes$room_runtime.component1();
            java.util.Iterator<java.lang.Integer> it = sortedNodes$room_runtime.component2().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!z2) {
                    if (i2 <= intValue && intValue < i) {
                        androidx.room.migration.Migration migration = component1.get(java.lang.Integer.valueOf(intValue));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(migration);
                        arrayList.add(migration);
                        z = true;
                        i = intValue;
                        break;
                        break;
                    }
                } else if (i + 1 <= intValue && intValue <= i2) {
                    androidx.room.migration.Migration migration2 = component1.get(java.lang.Integer.valueOf(intValue));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(migration2);
                    arrayList.add(migration2);
                    z = true;
                    i = intValue;
                    break;
                }
            }
            z = false;
        } while (z);
        return null;
    }
}
