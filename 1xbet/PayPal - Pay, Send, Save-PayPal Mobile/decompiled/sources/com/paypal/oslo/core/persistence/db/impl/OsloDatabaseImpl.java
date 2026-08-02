package com.paypal.oslo.core.persistence.db.impl;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/impl/OsloDatabaseImpl;", "Landroidx/room/RoomDatabase;", "Lcom/paypal/oslo/core/persistence/db/api/DaoProvider;", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderDao;", "placeholderDao", "()Lcom/paypal/oslo/core/persistence/db/placeholder/PlaceholderDao;", "", "daoName", "Lcom/paypal/oslo/core/persistence/db/api/DatabaseDao;", "getDao", "(Ljava/lang/String;)Lcom/paypal/oslo/core/persistence/db/api/DatabaseDao;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class OsloDatabaseImpl extends androidx.room.RoomDatabase implements com.paypal.oslo.core.persistence.db.api.DaoProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.paypal.oslo.core.persistence.db.api.DatabaseDao> getHighSpeedVideoSizes = new java.util.HashMap();

    public abstract com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao placeholderDao();

    @Override // com.paypal.oslo.core.persistence.db.api.DaoProvider
    public com.paypal.oslo.core.persistence.db.api.DatabaseDao getDao(java.lang.String daoName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daoName, "");
        com.paypal.oslo.core.persistence.db.api.DatabaseDao databaseDao = this.getHighSpeedVideoSizes.get(daoName);
        if (databaseDao != null) {
            return databaseDao;
        }
        com.paypal.oslo.core.persistence.db.placeholder.PlaceholderDao placeholderDao = kotlin.jvm.internal.Intrinsics.areEqual(daoName, "placeholderDao") ? placeholderDao() : null;
        if (placeholderDao != null) {
            this.getHighSpeedVideoSizes.put(daoName, placeholderDao);
            return placeholderDao;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown DAO: ");
        sb.append(daoName);
        sb.append(" - Make sure it is properly registered.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
