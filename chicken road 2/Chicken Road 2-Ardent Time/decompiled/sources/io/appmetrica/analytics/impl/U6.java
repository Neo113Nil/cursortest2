package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U6 extends io.appmetrica.analytics.coreapi.internal.db.DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS temp_cache (id INTEGER PRIMARY KEY,scope TEXT,data BLOB,timestamp INTEGER)");
        java.util.Iterator<io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase> it = io.appmetrica.analytics.impl.C0560na.f6484I.p().b().iterator();
        while (it.hasNext()) {
            java.util.Iterator<io.appmetrica.analytics.modulesapi.internal.common.TableDescription> it2 = it.next().getTables().iterator();
            while (it2.hasNext()) {
                sQLiteDatabase.execSQL(it2.next().getCreateTableScript());
            }
        }
    }
}
