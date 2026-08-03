package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O3 extends io.appmetrica.analytics.coreapi.internal.db.DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("preferences", "key = ?", new java.lang.String[]{"NEXT_STARTUP_TIME"});
    }
}
