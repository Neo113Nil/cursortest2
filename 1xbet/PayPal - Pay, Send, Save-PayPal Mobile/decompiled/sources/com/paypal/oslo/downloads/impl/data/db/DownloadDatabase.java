package com.paypal.oslo.downloads.impl.data.db;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/data/db/DownloadDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;", "downloadDao$downloads_release", "()Lcom/paypal/oslo/downloads/impl/data/dao/DownloadDao;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DownloadDatabase extends androidx.room.RoomDatabase {
    public static final java.lang.String DATABASE_NAME = "downloads.db";

    public abstract com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao$downloads_release();
}
