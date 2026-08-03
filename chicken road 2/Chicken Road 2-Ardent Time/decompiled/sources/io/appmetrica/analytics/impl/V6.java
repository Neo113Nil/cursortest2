package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class V6 extends io.appmetrica.analytics.coreapi.internal.db.DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS binary_data");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS temp_cache");
        java.util.Iterator<io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase> it = io.appmetrica.analytics.impl.C0560na.f6484I.p().b().iterator();
        while (it.hasNext()) {
            java.util.Iterator<io.appmetrica.analytics.modulesapi.internal.common.TableDescription> it2 = it.next().getTables().iterator();
            while (it2.hasNext()) {
                sQLiteDatabase.execSQL(it2.next().getDropTableScript());
            }
        }
    }
}
