package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B]\b\u0007\u0012#\u0010\b\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0002\b\u00070\u0002\u0012%\b\u0001\u0010\t\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0002\b\u00070\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0013R1\u0010\u0018\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0002\b\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R1\u0010\u0016\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0002\b\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefsMigrationProvider;", "", "", "Lkotlin/Pair;", "", "", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;", "Lkotlin/jvm/JvmSuppressWildcards;", "migrationPairs", "encryptedMigrationPairs", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPreferenceMigrationHelper;", "migrationHelper", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/paypal/oslo/core/persistence/appstorage/SharedPreferenceMigrationHelper;)V", "Landroid/content/Context;", "context", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "provideMigrations", "(Landroid/content/Context;)Ljava/util/List;", "Landroidx/datastore/core/DataMigration;", "provideEncryptedMigrations", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPreferenceMigrationHelper;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharedPrefsMigrationProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SharedPrefsMigrationProvider(java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> set, @javax.inject.Named("encryptedPrefs") java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> set2, com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper sharedPreferenceMigrationHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferenceMigrationHelper, "");
        this.getHighSpeedVideoFpsRanges = set;
        this.getHighSpeedVideoFpsRangesFor = set2;
        this.getHighSpeedVideoSizes = sharedPreferenceMigrationHelper;
    }

    public final java.util.List<androidx.content.migrations.SharedPreferencesMigration<androidx.content.preferences.core.Preferences>> provideMigrations(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> set = this.getHighSpeedVideoFpsRanges;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : set) {
            java.lang.String str = (java.lang.String) ((kotlin.Pair) obj).getFirst();
            java.lang.Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, (java.lang.Iterable) ((kotlin.Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, kotlin.collections.CollectionsKt.toSet(arrayList));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap2.size());
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList2.add(new androidx.content.migrations.SharedPreferencesMigration(context, (java.lang.String) entry2.getKey(), null, null, new com.paypal.oslo.core.persistence.appstorage.SharedPrefsMigrationProvider$provideMigrations$1$1(this, (java.util.Set) entry2.getValue(), null), 12, null));
        }
        return arrayList2;
    }

    public final java.util.List<androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>> provideEncryptedMigrations(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.Set<kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>>> set = this.getHighSpeedVideoFpsRangesFor;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : set) {
            java.lang.String str = (java.lang.String) ((kotlin.Pair) obj).getFirst();
            java.lang.Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, (java.lang.Iterable) ((kotlin.Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, kotlin.collections.CollectionsKt.toSet(arrayList));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap2.size());
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList2.add(this.getHighSpeedVideoSizes.migrateEncryptedPrefs(context, (java.lang.String) entry2.getKey(), (java.util.Set) entry2.getValue()));
        }
        return arrayList2;
    }
}
