package com.paypal.oslo.core.persistence.db.impl;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/impl/OsloDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/paypal/oslo/core/persistence/db/api/DaoProvider;", "<init>", "()V", "", "daoName", "Lcom/paypal/oslo/core/persistence/db/api/DatabaseDao;", "getDao", "(Ljava/lang/String;)Lcom/paypal/oslo/core/persistence/db/api/DatabaseDao;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class OsloDatabase extends androidx.room.RoomDatabase implements com.paypal.oslo.core.persistence.db.api.DaoProvider {
    @Override // com.paypal.oslo.core.persistence.db.api.DaoProvider
    public abstract com.paypal.oslo.core.persistence.db.api.DatabaseDao getDao(java.lang.String daoName);
}
