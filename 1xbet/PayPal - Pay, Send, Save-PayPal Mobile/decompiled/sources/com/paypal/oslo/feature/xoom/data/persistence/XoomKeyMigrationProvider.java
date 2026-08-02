package com.paypal.oslo.feature.xoom.data.persistence;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/persistence/XoomKeyMigrationProvider;", "", "<init>", "()V", "Lkotlin/Pair;", "", "", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;", "provide", "()Lkotlin/Pair;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class XoomKeyMigrationProvider {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.xoom.data.persistence.XoomKeyMigrationProvider INSTANCE = new com.paypal.oslo.feature.xoom.data.persistence.XoomKeyMigrationProvider();

    private XoomKeyMigrationProvider() {
    }

    public final kotlin.Pair<java.lang.String, java.util.List<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration>> provide() {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"remittance", "reload"});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            java.lang.String concat = "user_agreement_accepted.".concat(java.lang.String.valueOf((java.lang.String) it.next()));
            arrayList.add(new com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration(concat, new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted(concat), "feature:xoom", com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.STRING));
        }
        return kotlin.TuplesKt.to("version.6.shared.keys", arrayList);
    }
}
