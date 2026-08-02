package org.betup.model.local.migration;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public class Migration_1_2 extends Migration {
    private final UserService userService;

    public Migration_1_2(UserService userService) {
        super(1, 2);
        this.userService = userService;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase database) {
        int intValue = this.userService.isRegistered() ? this.userService.getShortProfile().getUserModel().getId().intValue() : 0;
        database.execSQL("ALTER TABLE events ADD COLUMN userId INTEGER NOT NULL DEFAULT(" + intValue + ")");
        database.execSQL("CREATE INDEX index_events_userId ON events(userId)");
        if (intValue == 0) {
            database.execSQL("DELETE FROM event_params");
            database.execSQL("DELETE FROM events");
        }
    }
}
