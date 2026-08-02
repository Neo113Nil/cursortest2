package org.betup.model.local.migration;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes2.dex */
public class Migration_2_3 extends Migration {
    public Migration_2_3() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase database) {
        database.execSQL("CREATE TABLE competition_bets (coef REAL NOT NULL, name TEXT, competitionId INTEGER NOT NULL, matchId INTEGER NOT NULL, expiresAt INTEGER NOT NULL, section_name TEXT, grabbedBetId INTEGER NOT NULL PRIMARY KEY, userId INTEGER NOT NULL)");
        database.execSQL("CREATE UNIQUE INDEX index_competition_bets_matchId_userId ON competition_bets (matchId, userId)");
        database.execSQL("CREATE INDEX index_competition_bets_competitionId ON competition_bets (competitionId)");
    }
}
