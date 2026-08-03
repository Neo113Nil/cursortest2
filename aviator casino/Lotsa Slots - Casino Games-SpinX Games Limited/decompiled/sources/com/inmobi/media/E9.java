package com.inmobi.media;

/* loaded from: classes5.dex */
public final class E9 extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2635o5 f4679a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(com.inmobi.media.C2635o5 databaseConfig) {
        super(databaseConfig.f5367a, "com.im_11.2.0.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.f4679a = databaseConfig;
    }

    public static void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.inmobi.media.C2387ek c2387ek) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + c2387ek.f5184a + io.ktor.sse.ServerSentEventKt.SPACE + c2387ek.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final java.lang.String getDatabaseName() {
        this.f4679a.getClass();
        return "com.im_11.2.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.f4679a.c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            java.util.Iterator it = this.f4679a.b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (com.inmobi.media.C2387ek) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
