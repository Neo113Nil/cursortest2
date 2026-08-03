package androidx.room.util;

/* compiled from: DBUtil.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, d2 = {"createCancellationSignal", "Landroid/os/CancellationSignal;", "dropFtsSyncTriggers", "", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "foreignKeyCheck", "tableName", "", "processForeignKeyCheckFailure", com.helpshift.user.UserConstants.POLLING_CURSOR, "Landroid/database/Cursor;", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "Landroidx/room/RoomDatabase;", "sqLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "maybeCopy", "", "signal", "readVersion", "", "databaseFile", "Ljava/io/File;", "room-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DBUtil {
    @kotlin.Deprecated(message = "This is only used in the generated code and shouldn't be called directly.")
    public static final android.database.Cursor query(androidx.room.RoomDatabase db, androidx.sqlite.db.SupportSQLiteQuery sqLiteQuery, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return query(db, sqLiteQuery, z, null);
    }

    public static final android.database.Cursor query(androidx.room.RoomDatabase db, androidx.sqlite.db.SupportSQLiteQuery sqLiteQuery, boolean z, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        android.database.Cursor query = db.query(sqLiteQuery, cancellationSignal);
        if (!z || !(query instanceof android.database.AbstractWindowedCursor)) {
            return query;
        }
        android.database.AbstractWindowedCursor abstractWindowedCursor = (android.database.AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (android.os.Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? androidx.room.util.CursorUtil.copyAndClose(query) : query;
    }

    public static final void dropFtsSyncTriggers(androidx.sqlite.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        android.database.Cursor query = db.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            android.database.Cursor cursor = query;
            while (cursor.moveToNext()) {
                createListBuilder.add(cursor.getString(0));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(query, null);
            for (java.lang.String triggerName : kotlin.collections.CollectionsKt.build(createListBuilder)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
                if (kotlin.text.StringsKt.startsWith$default(triggerName, "room_fts_content_sync_", false, 2, (java.lang.Object) null)) {
                    db.execSQL("DROP TRIGGER IF EXISTS " + triggerName);
                }
            }
        } finally {
        }
    }

    public static final void foreignKeyCheck(androidx.sqlite.db.SupportSQLiteDatabase db, java.lang.String tableName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "tableName");
        android.database.Cursor query = db.query("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            android.database.Cursor cursor = query;
            if (cursor.getCount() > 0) {
                throw new android.database.sqlite.SQLiteConstraintException(processForeignKeyCheckFailure(cursor));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(query, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(query, th);
                throw th2;
            }
        }
    }

    public static final int readVersion(java.io.File databaseFile) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        java.nio.channels.FileChannel channel = new java.io.FileInputStream(databaseFile).getChannel();
        try {
            java.nio.channels.FileChannel fileChannel = channel;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            fileChannel.tryLock(60L, 4L, true);
            fileChannel.position(60L);
            if (fileChannel.read(allocate) != 4) {
                throw new java.io.IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i = allocate.getInt();
            kotlin.io.CloseableKt.closeFinally(channel, null);
            return i;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(channel, th);
                throw th2;
            }
        }
    }

    public static final android.os.CancellationSignal createCancellationSignal() {
        return androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }

    private static final java.lang.String processForeignKeyCheckFailure(android.database.Cursor cursor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int count = cursor.getCount();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            java.lang.String constraintIndex = cursor.getString(3);
            if (!linkedHashMap.containsKey(constraintIndex)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintIndex, "constraintIndex");
                java.lang.String string = cursor.getString(2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(2)");
                linkedHashMap.put(constraintIndex, string);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(count);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
