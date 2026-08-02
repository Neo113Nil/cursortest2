package com.paypal.oslo.core.persistence.db.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/di/DbModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/db/impl/OsloDatabaseFactory;", "factory", "Lcom/paypal/oslo/core/persistence/db/di/DatabaseClassProvider;", "classProvider", "Landroidx/room/RoomDatabase;", "provideDatabase", "(Lcom/paypal/oslo/core/persistence/db/impl/OsloDatabaseFactory;Lcom/paypal/oslo/core/persistence/db/di/DatabaseClassProvider;)Landroidx/room/RoomDatabase;", "database", "Lcom/paypal/oslo/core/persistence/db/api/DaoProvider;", "provideDaoProvider", "(Landroidx/room/RoomDatabase;)Lcom/paypal/oslo/core/persistence/db/api/DaoProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class DbModule {
    public static final com.paypal.oslo.core.persistence.db.di.DbModule INSTANCE = new com.paypal.oslo.core.persistence.db.di.DbModule();

    private DbModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.room.RoomDatabase provideDatabase(com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory factory, com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider classProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classProvider, "");
        return com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory.createDatabase$default(factory, classProvider.getDatabaseClass(), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dagger.Provides
    public final com.paypal.oslo.core.persistence.db.api.DaoProvider provideDaoProvider(androidx.room.RoomDatabase database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        return (com.paypal.oslo.core.persistence.db.api.DaoProvider) database;
    }
}
