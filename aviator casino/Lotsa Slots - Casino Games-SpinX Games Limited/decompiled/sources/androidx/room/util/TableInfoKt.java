package androidx.room.util;

/* compiled from: TableInfo.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¨\u0006\u0017"}, d2 = {"readColumns", "", "", "Landroidx/room/util/TableInfo$Column;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "readForeignKeyFieldMappings", "", "Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", com.helpshift.user.UserConstants.POLLING_CURSOR, "Landroid/database/Cursor;", "readForeignKeys", "", "Landroidx/room/util/TableInfo$ForeignKey;", "readIndex", "Landroidx/room/util/TableInfo$Index;", "name", "unique", "", "readIndices", "readTableInfo", "Landroidx/room/util/TableInfo;", "room-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TableInfoKt {
    public static final androidx.room.util.TableInfo readTableInfo(androidx.sqlite.db.SupportSQLiteDatabase database, java.lang.String tableName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new androidx.room.util.TableInfo(tableName, readColumns(database, tableName), readForeignKeys(database, tableName), readIndices(database, tableName));
    }

    private static final java.util.Set<androidx.room.util.TableInfo.ForeignKey> readForeignKeys(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        android.database.Cursor query = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            android.database.Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex(com.ironsource.B5.R);
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            java.util.List<androidx.room.util.TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(cursor);
            cursor.moveToPosition(-1);
            java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i = cursor.getInt(columnIndex);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList<androidx.room.util.TableInfo.ForeignKeyWithSequence> arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj : readForeignKeyFieldMappings) {
                        if (((androidx.room.util.TableInfo.ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (androidx.room.util.TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    java.lang.String string = cursor.getString(columnIndex3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    java.lang.String string2 = cursor.getString(columnIndex4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    java.lang.String string3 = cursor.getString(columnIndex5);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    createSetBuilder.add(new androidx.room.util.TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            java.util.Set<androidx.room.util.TableInfo.ForeignKey> build = kotlin.collections.SetsKt.build(createSetBuilder);
            kotlin.io.CloseableKt.closeFinally(query, null);
            return build;
        } finally {
        }
    }

    private static final java.util.List<androidx.room.util.TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(android.database.Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            java.lang.String string = cursor.getString(columnIndex3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            java.lang.String string2 = cursor.getString(columnIndex4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            createListBuilder.add(new androidx.room.util.TableInfo.ForeignKeyWithSequence(i, i2, string, string2));
        }
        return kotlin.collections.CollectionsKt.sorted(kotlin.collections.CollectionsKt.build(createListBuilder));
    }

    private static final java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> readColumns(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        android.database.Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            android.database.Cursor cursor = query;
            if (cursor.getColumnCount() <= 0) {
                java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> emptyMap = kotlin.collections.MapsKt.emptyMap();
                kotlin.io.CloseableKt.closeFinally(query, null);
                return emptyMap;
            }
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex("pk");
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            while (cursor.moveToNext()) {
                java.lang.String name = cursor.getString(columnIndex);
                java.lang.String type = cursor.getString(columnIndex2);
                boolean z = cursor.getInt(columnIndex3) != 0;
                int i = cursor.getInt(columnIndex4);
                java.lang.String string = cursor.getString(columnIndex5);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "type");
                createMapBuilder.put(name, new androidx.room.util.TableInfo.Column(name, type, z, i, string, 2));
            }
            java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> build = kotlin.collections.MapsKt.build(createMapBuilder);
            kotlin.io.CloseableKt.closeFinally(query, null);
            return build;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(query, th);
                throw th2;
            }
        }
    }

    private static final java.util.Set<androidx.room.util.TableInfo.Index> readIndices(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        android.database.Cursor query = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            android.database.Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
                while (cursor.moveToNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual("c", cursor.getString(columnIndex2))) {
                        java.lang.String name = cursor.getString(columnIndex);
                        boolean z = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
                        androidx.room.util.TableInfo.Index readIndex = readIndex(supportSQLiteDatabase, name, z);
                        if (readIndex == null) {
                            kotlin.io.CloseableKt.closeFinally(query, null);
                            return null;
                        }
                        createSetBuilder.add(readIndex);
                    }
                }
                java.util.Set<androidx.room.util.TableInfo.Index> build = kotlin.collections.SetsKt.build(createSetBuilder);
                kotlin.io.CloseableKt.closeFinally(query, null);
                return build;
            }
            kotlin.io.CloseableKt.closeFinally(query, null);
            return null;
        } finally {
        }
    }

    private static final androidx.room.util.TableInfo.Index readIndex(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str, boolean z) {
        android.database.Cursor query = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            android.database.Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID);
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                java.util.TreeMap treeMap = new java.util.TreeMap();
                java.util.TreeMap treeMap2 = new java.util.TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i = cursor.getInt(columnIndex);
                        java.lang.String columnName = cursor.getString(columnIndex3);
                        java.lang.String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(java.lang.Integer.valueOf(i), str2);
                    }
                }
                java.util.Collection values = treeMap.values();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                java.util.List list = kotlin.collections.CollectionsKt.toList(values);
                java.util.Collection values2 = treeMap2.values();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                androidx.room.util.TableInfo.Index index = new androidx.room.util.TableInfo.Index(str, z, list, kotlin.collections.CollectionsKt.toList(values2));
                kotlin.io.CloseableKt.closeFinally(query, null);
                return index;
            }
            kotlin.io.CloseableKt.closeFinally(query, null);
            return null;
        } finally {
        }
    }
}
