package org.betup.model.local;

import androidx.room.RoomDatabase;
import org.betup.model.local.dao.EventDao;

/* loaded from: classes2.dex */
public abstract class AppDatabase extends RoomDatabase {
    public abstract EventDao eventDao();
}
