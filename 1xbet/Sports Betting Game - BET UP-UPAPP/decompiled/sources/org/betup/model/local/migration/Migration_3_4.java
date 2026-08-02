package org.betup.model.local.migration;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes2.dex */
public class Migration_3_4 extends Migration {
    public Migration_3_4() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase database) {
        database.execSQL("DROP TABLE IF EXISTS competition_bets");
    }
}
