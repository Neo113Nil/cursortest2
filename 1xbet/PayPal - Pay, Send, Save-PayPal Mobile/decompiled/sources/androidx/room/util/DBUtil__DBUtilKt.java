package androidx.room.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aP\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022$\b\u0004\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080H¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/RoomDatabase;", "", "p0", "p1", "Lkotlin/Function2;", "Landroidx/room/PooledConnection;", "Lkotlin/coroutines/Continuation;", "", "p2", "internalPerform", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/SQLiteConnection;", "", "dropFtsSyncTriggers", "(Landroidx/sqlite/SQLiteConnection;)V", "", "foreignKeyCheck", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)V"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
/* loaded from: classes.dex */
final /* synthetic */ class DBUtil__DBUtilKt {
    public static final <R> java.lang.Object internalPerform(androidx.room.RoomDatabase roomDatabase, boolean z, boolean z2, kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return roomDatabase.useConnection(z, new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2(z2, z, roomDatabase, function2, null), continuation);
    }

    public static final void dropFtsSyncTriggers(androidx.database.SQLiteConnection sQLiteConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            while (sQLiteStatement.step()) {
                createListBuilder.add(sQLiteStatement.getText(0));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            for (java.lang.String str : kotlin.collections.CollectionsKt.build(createListBuilder)) {
                if (kotlin.text.StringsKt.startsWith$default(str, "room_fts_content_sync_", false, 2, (java.lang.Object) null)) {
                    androidx.database.SQLite.execSQL(sQLiteConnection, "DROP TRIGGER IF EXISTS ".concat(java.lang.String.valueOf(str)));
                }
            }
        } finally {
        }
    }

    public static final void foreignKeyCheck(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PRAGMA foreign_key_check(`");
        sb.append(str);
        sb.append("`)");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            if (!sQLiteStatement.step()) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int i = 0;
            do {
                if (i == 0) {
                    sb2.append("Foreign key violation(s) detected in '");
                    sb2.append(sQLiteStatement.getText(0));
                    sb2.append("'.\n");
                }
                java.lang.String text = sQLiteStatement.getText(3);
                if (!linkedHashMap.containsKey(text)) {
                    linkedHashMap.put(text, sQLiteStatement.getText(2));
                }
                i++;
            } while (sQLiteStatement.step());
            sb2.append("Number of different violations discovered: ");
            sb2.append(linkedHashMap.keySet().size());
            sb2.append("\nNumber of rows in violation: ");
            sb2.append(i);
            sb2.append("\nViolation(s) detected in the following constraint(s):\n");
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.String str3 = (java.lang.String) entry.getValue();
                sb2.append("\tParent Table = ");
                sb2.append(str3);
                sb2.append(", Foreign Key Constraint Index = ");
                sb2.append(str2);
                sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
            throw new android.database.SQLException(sb2.toString());
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, th);
                throw th2;
            }
        }
    }
}
