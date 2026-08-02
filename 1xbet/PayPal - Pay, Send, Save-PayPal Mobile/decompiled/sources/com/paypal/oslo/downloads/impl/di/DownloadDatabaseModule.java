package com.paypal.oslo.downloads.impl.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/downloads/impl/di/DownloadDatabaseModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/downloads/impl/data/db/DownloadDatabase;", "provideDownloadDatabase", "(Landroid/content/Context;)Lcom/paypal/oslo/downloads/impl/data/db/DownloadDatabase;", "database", "Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;", "provideDownloadDao", "(Lcom/paypal/oslo/downloads/impl/data/db/DownloadDatabase;)Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class DownloadDatabaseModule {
    public static final com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule INSTANCE = new com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule();

    private DownloadDatabaseModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.downloads.impl.data.db.DownloadDatabase provideDownloadDatabase(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return (com.paypal.oslo.downloads.impl.data.db.DownloadDatabase) androidx.room.Room.databaseBuilder(context, com.paypal.oslo.downloads.impl.data.db.DownloadDatabase.class, com.paypal.oslo.downloads.impl.data.db.DownloadDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build();
    }

    @dagger.Provides
    public final com.paypal.oslo.downloads.impl.data.dao.DownloadDao provideDownloadDao(com.paypal.oslo.downloads.impl.data.db.DownloadDatabase database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        return database.downloadDao$downloads_release();
    }
}
