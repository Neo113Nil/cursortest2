package com.adobe.marketing.mobile.internal.migration;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/V5LegacyCleaner;", "", "<init>", "()V", "", "cleanup"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class V5LegacyCleaner {
    public static final com.adobe.marketing.mobile.internal.migration.V5LegacyCleaner INSTANCE = new com.adobe.marketing.mobile.internal.migration.V5LegacyCleaner();

    private V5LegacyCleaner() {
    }

    public final void cleanup() {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.MobileServices.DATASTORE_NAME);
        if (namedCollection != null) {
            namedCollection.removeAll();
        }
    }
}
