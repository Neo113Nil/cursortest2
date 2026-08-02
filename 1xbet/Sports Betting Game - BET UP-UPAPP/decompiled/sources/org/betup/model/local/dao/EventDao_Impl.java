package org.betup.model.local.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.betup.model.local.converter.NotificationTypeConverter;
import org.betup.model.local.entity.Event;
import org.betup.model.local.entity.EventParam;

/* loaded from: classes2.dex */
public final class EventDao_Impl implements EventDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<Event> __insertionAdapterOfEvent;
    private final EntityInsertionAdapter<EventParam> __insertionAdapterOfEventParam;
    private final NotificationTypeConverter __notificationTypeConverter = new NotificationTypeConverter();
    private final SharedSQLiteStatement __preparedStmtOfClearEventParams;
    private final SharedSQLiteStatement __preparedStmtOfClearEvents;
    private final SharedSQLiteStatement __preparedStmtOfReadAllNew;
    private final SharedSQLiteStatement __preparedStmtOfReadEvent;

    public EventDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfEvent = new EntityInsertionAdapter<Event>(__db) { // from class: org.betup.model.local.dao.EventDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `events` (`eventId`,`userId`,`title`,`body`,`type`,`sent_timestamp`,`got_timestamp`,`isNew`,`uid`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Event event) {
                supportSQLiteStatement.bindLong(1, event.getEventId());
                supportSQLiteStatement.bindLong(2, event.getUserId());
                if (event.getTitle() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, event.getTitle());
                }
                if (event.getBody() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, event.getBody());
                }
                String notificationTypeToString = EventDao_Impl.this.__notificationTypeConverter.notificationTypeToString(event.getType());
                if (notificationTypeToString == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, notificationTypeToString);
                }
                supportSQLiteStatement.bindLong(6, event.getSentTimestamp());
                supportSQLiteStatement.bindLong(7, event.getGotTimestamp());
                supportSQLiteStatement.bindLong(8, event.isNew() ? 1L : 0L);
                if (event.getUid() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, event.getUid());
                }
            }
        };
        this.__insertionAdapterOfEventParam = new EntityInsertionAdapter<EventParam>(__db) { // from class: org.betup.model.local.dao.EventDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `event_params` (`eventParamId`,`key`,`value`,`eventId`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final EventParam entity) {
                statement.bindLong(1, entity.getEventParamId());
                if (entity.getKey() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getKey());
                }
                if (entity.getValue() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getValue());
                }
                statement.bindLong(4, entity.getEventId());
            }
        };
        this.__preparedStmtOfClearEventParams = new SharedSQLiteStatement(__db) { // from class: org.betup.model.local.dao.EventDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM event_params WHERE eventId IN(SELECT eventId FROM events WHERE userId=?); ";
            }
        };
        this.__preparedStmtOfClearEvents = new SharedSQLiteStatement(__db) { // from class: org.betup.model.local.dao.EventDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM events WHERE userId=?";
            }
        };
        this.__preparedStmtOfReadAllNew = new SharedSQLiteStatement(__db) { // from class: org.betup.model.local.dao.EventDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE events SET isNew = 'false' WHERE userId = ?";
            }
        };
        this.__preparedStmtOfReadEvent = new SharedSQLiteStatement(__db) { // from class: org.betup.model.local.dao.EventDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE events SET isNew = 'false' WHERE uid = ?";
            }
        };
    }

    @Override // org.betup.model.local.dao.EventDao
    public long insertEvent(final Event event) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfEvent.insertAndReturnId(event);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public long[] insertEventParams(final EventParam... eventParams) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long[] insertAndReturnIdsArray = this.__insertionAdapterOfEventParam.insertAndReturnIdsArray(eventParams);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsArray;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public void clearEventParams(final int userId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfClearEventParams.acquire();
        acquire.bindLong(1, userId);
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfClearEventParams.release(acquire);
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public void clearEvents(final int userId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfClearEvents.acquire();
        acquire.bindLong(1, userId);
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfClearEvents.release(acquire);
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public void readAllNew(final int userId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfReadAllNew.acquire();
        acquire.bindLong(1, userId);
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfReadAllNew.release(acquire);
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public void readEvent(final String uuid) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfReadEvent.acquire();
        if (uuid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, uuid);
        }
        try {
            this.__db.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfReadEvent.release(acquire);
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public Event getEventById(final int id) {
        Event event;
        boolean z = true;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM events WHERE eventId = ?", 1);
        acquire.bindLong(1, id);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "eventId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "title");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "body");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "type");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "sent_timestamp");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "got_timestamp");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "isNew");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "uid");
            if (query.moveToFirst()) {
                Event event2 = new Event();
                event2.setEventId(query.getLong(columnIndexOrThrow));
                event2.setUserId(query.getInt(columnIndexOrThrow2));
                event2.setTitle(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                event2.setBody(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                event2.setType(this.__notificationTypeConverter.notificationTypeFromString(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                event2.setSentTimestamp(query.getLong(columnIndexOrThrow6));
                event2.setGotTimestamp(query.getLong(columnIndexOrThrow7));
                if (query.getInt(columnIndexOrThrow8) == 0) {
                    z = false;
                }
                event2.setNew(z);
                event2.setUid(query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                event = event2;
            } else {
                event = null;
            }
            return event;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public List<Event> getEvents(final int limit, final int offset, final int userId) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM events WHERE userId =? ORDER BY eventId DESC LIMIT ? OFFSET ?", 3);
        acquire.bindLong(1, userId);
        acquire.bindLong(2, limit);
        acquire.bindLong(3, offset);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "eventId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "title");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "body");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "type");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "sent_timestamp");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "got_timestamp");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "isNew");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "uid");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                Event event = new Event();
                event.setEventId(query.getLong(columnIndexOrThrow));
                event.setUserId(query.getInt(columnIndexOrThrow2));
                event.setTitle(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                event.setBody(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                event.setType(this.__notificationTypeConverter.notificationTypeFromString(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                event.setSentTimestamp(query.getLong(columnIndexOrThrow6));
                event.setGotTimestamp(query.getLong(columnIndexOrThrow7));
                event.setNew(query.getInt(columnIndexOrThrow8) != 0);
                event.setUid(query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                arrayList.add(event);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public List<EventParam> getEventParamsForEvent(final long eventId) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM event_params WHERE eventId = ? ORDER BY eventParamId DESC", 1);
        acquire.bindLong(1, eventId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "eventParamId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "key");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "value");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "eventId");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                EventParam eventParam = new EventParam();
                eventParam.setEventParamId(query.getLong(columnIndexOrThrow));
                eventParam.setKey(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                eventParam.setValue(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                eventParam.setEventId(query.getLong(columnIndexOrThrow4));
                arrayList.add(eventParam);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public int getNewCountById(boolean z, int i) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM events WHERE isNew = ? AND userId=?", 2);
        acquire.bindLong(1, z ? 1L : 0L);
        acquire.bindLong(2, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // org.betup.model.local.dao.EventDao
    public int getNewCountByUUID(boolean z, String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM events WHERE isNew = ? AND uid=?", 2);
        acquire.bindLong(1, z ? 1L : 0L);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
