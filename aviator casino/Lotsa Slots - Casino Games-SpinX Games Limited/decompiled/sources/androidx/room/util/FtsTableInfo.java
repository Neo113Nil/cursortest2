package androidx.room.util;

/* compiled from: FtsTableInfo.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "name", "", "columns", "", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "options", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "equals", "", "other", "hashCode", "", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FtsTableInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.util.FtsTableInfo.Companion INSTANCE = new androidx.room.util.FtsTableInfo.Companion(null);
    private static final java.lang.String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final java.util.Set<java.lang.String> columns;
    public final java.lang.String name;
    public final java.util.Set<java.lang.String> options;

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<java.lang.String> parseOptions(java.lang.String str) {
        return INSTANCE.parseOptions(str);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.room.util.FtsTableInfo read(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, java.lang.String str) {
        return INSTANCE.read(supportSQLiteDatabase, str);
    }

    public FtsTableInfo(java.lang.String name, java.util.Set<java.lang.String> columns, java.util.Set<java.lang.String> options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columns, "columns");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(java.lang.String name, java.util.Set<java.lang.String> columns, java.lang.String createSql) {
        this(name, columns, INSTANCE.parseOptions(createSql));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columns, "columns");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createSql, "createSql");
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.room.util.FtsTableInfo)) {
            return false;
        }
        androidx.room.util.FtsTableInfo ftsTableInfo = (androidx.room.util.FtsTableInfo) other;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.name, ftsTableInfo.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.columns, ftsTableInfo.columns)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.options, ftsTableInfo.options);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.options.hashCode();
    }

    public java.lang.String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* compiled from: FtsTableInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/room/util/FtsTableInfo$Companion;", "", "()V", "FTS_OPTIONS", "", "", "[Ljava/lang/String;", "parseOptions", "", "createStatement", "read", "Landroidx/room/util/FtsTableInfo;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "readColumns", "readOptions", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.room.util.FtsTableInfo read(androidx.sqlite.db.SupportSQLiteDatabase database, java.lang.String tableName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new androidx.room.util.FtsTableInfo(tableName, readColumns(database, tableName), readOptions(database, tableName));
        }

        private final java.util.Set<java.lang.String> readColumns(androidx.sqlite.db.SupportSQLiteDatabase database, java.lang.String tableName) {
            java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
            android.database.Cursor query = database.query("PRAGMA table_info(`" + tableName + "`)");
            try {
                android.database.Cursor cursor = query;
                if (cursor.getColumnCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("name");
                    while (cursor.moveToNext()) {
                        java.lang.String string = cursor.getString(columnIndex);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                        createSetBuilder.add(string);
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(query, null);
                return kotlin.collections.SetsKt.build(createSetBuilder);
            } finally {
            }
        }

        private final java.util.Set<java.lang.String> readOptions(androidx.sqlite.db.SupportSQLiteDatabase database, java.lang.String tableName) {
            java.lang.String sql;
            android.database.Cursor query = database.query("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
            try {
                android.database.Cursor cursor = query;
                if (cursor.moveToFirst()) {
                    sql = cursor.getString(cursor.getColumnIndexOrThrow("sql"));
                } else {
                    sql = "";
                }
                kotlin.io.CloseableKt.closeFinally(query, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sql, "sql");
                return parseOptions(sql);
            } finally {
            }
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Set<java.lang.String> parseOptions(java.lang.String createStatement) {
            java.lang.Character ch;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createStatement, "createStatement");
            java.lang.String str = createStatement;
            if (str.length() == 0) {
                return kotlin.collections.SetsKt.emptySet();
            }
            java.lang.String substring = createStatement.substring(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '(', 0, false, 6, (java.lang.Object) null) + 1, kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, ')', 0, false, 6, (java.lang.Object) null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            java.lang.String str2 = substring;
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (i2 < str2.length()) {
                char charAt = str2.charAt(i2);
                int i4 = i3 + 1;
                if (charAt == '\'' || charAt == '\"' || charAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(java.lang.Character.valueOf(charAt));
                    } else {
                        java.lang.Character ch2 = (java.lang.Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == charAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (charAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(java.lang.Character.valueOf(charAt));
                    }
                } else if (charAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (java.lang.Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (charAt == ',' && arrayDeque.isEmpty()) {
                    java.lang.String substring2 = substring.substring(i + 1, i3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    java.lang.String str3 = substring2;
                    int length = str3.length() - 1;
                    int i5 = 0;
                    boolean z = false;
                    while (i5 <= length) {
                        boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str3.charAt(!z ? i5 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i5++;
                        } else {
                            z = true;
                        }
                    }
                    arrayList.add(str3.subSequence(i5, length + 1).toString());
                    i = i3;
                }
                i2++;
                i3 = i4;
            }
            java.lang.String substring3 = substring.substring(i + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(kotlin.text.StringsKt.trim((java.lang.CharSequence) substring3).toString());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                java.lang.String str4 = (java.lang.String) obj;
                java.lang.String[] strArr = androidx.room.util.FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        break;
                    }
                    if (kotlin.text.StringsKt.startsWith$default(str4, strArr[i6], false, 2, (java.lang.Object) null)) {
                        arrayList2.add(obj);
                        break;
                    }
                    i6++;
                }
            }
            return kotlin.collections.CollectionsKt.toSet(arrayList2);
        }
    }
}
