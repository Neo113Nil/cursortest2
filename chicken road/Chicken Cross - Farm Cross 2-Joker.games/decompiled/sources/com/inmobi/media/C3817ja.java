package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3817ja extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final L5 f7178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3817ja(L5 databaseConfig) {
        super(databaseConfig.f6688a, "com.im_11.4.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.f7178a = databaseConfig;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, C3576am c3576am) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + c3576am.f7016a + ServerSentEventKt.SPACE + c3576am.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.f7178a.getClass();
        return "com.im_11.4.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.f7178a.c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.f7178a.b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (C3576am) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
