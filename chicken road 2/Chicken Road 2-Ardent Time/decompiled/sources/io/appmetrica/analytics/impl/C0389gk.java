package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389gk extends io.appmetrica.analytics.coreapi.internal.db.DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS temp_cache (id INTEGER PRIMARY KEY,scope TEXT,data BLOB,timestamp INTEGER)");
    }
}
