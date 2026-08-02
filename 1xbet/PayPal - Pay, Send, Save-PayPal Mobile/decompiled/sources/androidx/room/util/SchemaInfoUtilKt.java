package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0010\u001a)\u0010\u000f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000f\u0010\u0019\u001a%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u0010\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0010\u001a\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u001c\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$"}, d2 = {"", "type", "", "findAffinity", "(Ljava/lang/String;)I", "Landroidx/sqlite/SQLiteConnection;", "connection", "tableName", "Landroidx/room/util/TableInfo;", "readTableInfo", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "p0", "p1", "", "Landroidx/room/util/TableInfo$ForeignKey;", "Camera2StreamConfigurationMap", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Ljava/util/Set;", "", "Landroidx/room/util/TableInfo$Column;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Ljava/util/Map;", "Landroidx/room/util/TableInfo$Index;", "getHighResolutionOutputSizeshNQ4ISI", "", "p2", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;Z)Landroidx/room/util/TableInfo$Index;", "readFtsColumns", "readFtsOptions", "createStatement", "parseFtsOptions", "(Ljava/lang/String;)Ljava/util/Set;", "viewName", "Landroidx/room/util/ViewInfo;", "readViewInfo", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/ViewInfo;", "", "[Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SchemaInfoUtilKt {
    private static final java.lang.String[] Camera2StreamConfigurationMap = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final int findAffinity(java.lang.String str) {
        if (str == null) {
            return 5;
        }
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String str2 = upperCase;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "INT", false, 2, (java.lang.Object) null)) {
            return 3;
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "CHAR", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "CLOB", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "TEXT", false, 2, (java.lang.Object) null)) {
            return 2;
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "BLOB", false, 2, (java.lang.Object) null)) {
            return 5;
        }
        return (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "REAL", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "FLOA", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "DOUB", false, 2, (java.lang.Object) null)) ? 4 : 1;
    }

    public static final androidx.room.util.TableInfo readTableInfo(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.room.util.TableInfo(str, getHighSpeedVideoFpsRangesFor(sQLiteConnection, str), Camera2StreamConfigurationMap(sQLiteConnection, str), getHighResolutionOutputSizeshNQ4ISI(sQLiteConnection, str));
    }

    private static final java.util.Set<androidx.room.util.TableInfo.ForeignKey> Camera2StreamConfigurationMap(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            int columnIndexOf = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
            int columnIndexOf2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
            int columnIndexOf3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "table");
            int columnIndexOf4 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "on_delete");
            int columnIndexOf5 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "on_update");
            int columnIndexOf6 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
            int columnIndexOf7 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
            int columnIndexOf8 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "from");
            int columnIndexOf9 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO);
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            while (sQLiteStatement.step()) {
                createListBuilder.add(new androidx.room.util.ForeignKeyWithSequence((int) sQLiteStatement.getLong(columnIndexOf6), (int) sQLiteStatement.getLong(columnIndexOf7), sQLiteStatement.getText(columnIndexOf8), sQLiteStatement.getText(columnIndexOf9)));
                columnIndexOf7 = columnIndexOf7;
            }
            java.util.List sorted = kotlin.collections.CollectionsKt.sorted(kotlin.collections.CollectionsKt.build(createListBuilder));
            sQLiteStatement.reset();
            java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
            while (sQLiteStatement.step()) {
                if (sQLiteStatement.getLong(columnIndexOf2) == 0) {
                    int i = (int) sQLiteStatement.getLong(columnIndexOf);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList<androidx.room.util.ForeignKeyWithSequence> arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj : sorted) {
                        if (((androidx.room.util.ForeignKeyWithSequence) obj).getGetHighSpeedVideoSizes() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (androidx.room.util.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getCamera2StreamConfigurationMap());
                        arrayList2.add(foreignKeyWithSequence.getGetHighSpeedVideoFpsRangesFor());
                    }
                    createSetBuilder.add(new androidx.room.util.TableInfo.ForeignKey(sQLiteStatement.getText(columnIndexOf3), sQLiteStatement.getText(columnIndexOf4), sQLiteStatement.getText(columnIndexOf5), arrayList, arrayList2));
                }
            }
            java.util.Set<androidx.room.util.TableInfo.ForeignKey> build = kotlin.collections.SetsKt.build(createSetBuilder);
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return build;
        } finally {
        }
    }

    private static final java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> getHighSpeedVideoFpsRangesFor(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            java.lang.String str2 = null;
            if (!sQLiteStatement.step()) {
                java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> emptyMap = kotlin.collections.MapsKt.emptyMap();
                kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
                return emptyMap;
            }
            int columnIndexOf = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
            int columnIndexOf2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "type");
            int columnIndexOf3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "notnull");
            int columnIndexOf4 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "pk");
            int columnIndexOf5 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "dflt_value");
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            while (true) {
                java.lang.String text = sQLiteStatement.getText(columnIndexOf);
                int i = columnIndexOf;
                createMapBuilder.put(text, new androidx.room.util.TableInfo.Column(text, sQLiteStatement.getText(columnIndexOf2), sQLiteStatement.getLong(columnIndexOf3) != 0, (int) sQLiteStatement.getLong(columnIndexOf4), sQLiteStatement.isNull(columnIndexOf5) ? str2 : sQLiteStatement.getText(columnIndexOf5), 2));
                if (!sQLiteStatement.step()) {
                    java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> build = kotlin.collections.MapsKt.build(createMapBuilder);
                    kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
                    return build;
                }
                columnIndexOf = i;
                str2 = null;
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, th);
                throw th2;
            }
        }
    }

    private static final java.util.Set<androidx.room.util.TableInfo.Index> getHighResolutionOutputSizeshNQ4ISI(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            int columnIndexOf = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
            int columnIndexOf2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "origin");
            int columnIndexOf3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "unique");
            if (columnIndexOf == -1 || columnIndexOf2 == -1 || columnIndexOf3 == -1) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
                return null;
            }
            java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
            while (sQLiteStatement.step()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual("c", sQLiteStatement.getText(columnIndexOf2))) {
                    androidx.room.util.TableInfo.Index Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(sQLiteConnection, sQLiteStatement.getText(columnIndexOf), sQLiteStatement.getLong(columnIndexOf3) == 1);
                    if (Camera2StreamConfigurationMap2 == null) {
                        kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
                        return null;
                    }
                    createSetBuilder.add(Camera2StreamConfigurationMap2);
                }
            }
            java.util.Set<androidx.room.util.TableInfo.Index> build = kotlin.collections.SetsKt.build(createSetBuilder);
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return build;
        } finally {
        }
    }

    private static final androidx.room.util.TableInfo.Index Camera2StreamConfigurationMap(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            int columnIndexOf = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seqno");
            int columnIndexOf2 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "cid");
            int columnIndexOf3 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
            int columnIndexOf4 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "desc");
            if (columnIndexOf == -1 || columnIndexOf2 == -1 || columnIndexOf3 == -1 || columnIndexOf4 == -1) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
                return null;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            while (sQLiteStatement.step()) {
                if (((int) sQLiteStatement.getLong(columnIndexOf2)) >= 0) {
                    int i = (int) sQLiteStatement.getLong(columnIndexOf);
                    java.lang.String text = sQLiteStatement.getText(columnIndexOf3);
                    java.lang.String str2 = sQLiteStatement.getLong(columnIndexOf4) > 0 ? "DESC" : "ASC";
                    linkedHashMap.put(java.lang.Integer.valueOf(i), text);
                    linkedHashMap2.put(java.lang.Integer.valueOf(i), str2);
                }
            }
            java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(linkedHashMap.entrySet(), new java.util.Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((java.util.Map.Entry) t).getKey(), (java.lang.Integer) ((java.util.Map.Entry) t2).getKey());
                }
            });
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
            java.util.Iterator it = sortedWith.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
            }
            java.util.List list = kotlin.collections.CollectionsKt.toList(arrayList);
            java.util.List sortedWith2 = kotlin.collections.CollectionsKt.sortedWith(linkedHashMap2.entrySet(), new java.util.Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((java.util.Map.Entry) t).getKey(), (java.lang.Integer) ((java.util.Map.Entry) t2).getKey());
                }
            });
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sortedWith2, 10));
            java.util.Iterator it2 = sortedWith2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((java.lang.String) ((java.util.Map.Entry) it2.next()).getValue());
            }
            androidx.room.util.TableInfo.Index index = new androidx.room.util.TableInfo.Index(str, z, list, kotlin.collections.CollectionsKt.toList(arrayList2));
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return index;
        } finally {
        }
    }

    public static final java.util.Set<java.lang.String> readFtsColumns(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            if (sQLiteStatement.step()) {
                int columnIndexOf = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
                do {
                    createSetBuilder.add(sQLiteStatement.getText(columnIndexOf));
                } while (sQLiteStatement.step());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return kotlin.collections.SetsKt.build(createSetBuilder);
        } finally {
        }
    }

    public static final java.util.Set<java.lang.String> readFtsOptions(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT * FROM sqlite_master WHERE `name` = '");
        sb.append(str);
        sb.append('\'');
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            java.lang.String text = sQLiteStatement.step() ? sQLiteStatement.getText(androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, com.datadog.trace.api.DDSpanTypes.SQL)) : "";
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return parseFtsOptions(text);
        } finally {
        }
    }

    public static final java.util.Set<java.lang.String> parseFtsOptions(java.lang.String str) {
        java.lang.Character ch;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        if (str2.length() == 0) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.lang.String substring = str.substring(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, '(', 0, false, 6, (java.lang.Object) null) + 1, kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str2, ')', 0, false, 6, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        java.lang.String str3 = substring;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < str3.length()) {
            char charAt = str3.charAt(i2);
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '`') {
                            }
                        } else if (!arrayDeque.isEmpty() && (ch = (java.lang.Character) arrayDeque.firstOrNull()) != null && ch.charValue() == '[') {
                            kotlin.collections.CollectionsKt.removeLast(arrayDeque);
                        }
                    } else if (arrayDeque.isEmpty()) {
                        arrayDeque.addFirst(java.lang.Character.valueOf(charAt));
                    }
                } else if (arrayDeque.isEmpty()) {
                    java.lang.String substring2 = substring.substring(i + 1, i3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                    java.lang.String str4 = substring2;
                    int length = str4.length() - 1;
                    int i4 = 0;
                    boolean z = false;
                    while (i4 <= length) {
                        boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str4.charAt(!z ? i4 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i4++;
                        } else {
                            z = true;
                        }
                    }
                    arrayList.add(str4.subSequence(i4, length + 1).toString());
                    i = i3;
                }
                i2++;
                i3++;
            }
            if (arrayDeque.isEmpty()) {
                arrayDeque.addFirst(java.lang.Character.valueOf(charAt));
            } else {
                java.lang.Character ch2 = (java.lang.Character) arrayDeque.firstOrNull();
                if (ch2 != null && ch2.charValue() == charAt) {
                    kotlin.collections.CollectionsKt.removeLast(arrayDeque);
                }
            }
            i2++;
            i3++;
        }
        java.lang.String substring3 = substring.substring(i + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
        arrayList.add(kotlin.text.StringsKt.trim(substring3).toString());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            java.lang.String str5 = (java.lang.String) obj;
            java.lang.String[] strArr = Camera2StreamConfigurationMap;
            int length2 = strArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                if (kotlin.text.StringsKt.startsWith$default(str5, strArr[i5], false, 2, (java.lang.Object) null)) {
                    arrayList2.add(obj);
                    break;
                }
                i5++;
            }
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList2);
    }

    public static final androidx.room.util.ViewInfo readViewInfo(androidx.database.SQLiteConnection sQLiteConnection, java.lang.String str) {
        androidx.room.util.ViewInfo viewInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '");
        sb.append(str);
        sb.append('\'');
        androidx.database.SQLiteStatement prepare = sQLiteConnection.prepare(sb.toString());
        try {
            androidx.database.SQLiteStatement sQLiteStatement = prepare;
            if (sQLiteStatement.step()) {
                viewInfo = new androidx.room.util.ViewInfo(sQLiteStatement.getText(0), sQLiteStatement.getText(1));
            } else {
                viewInfo = new androidx.room.util.ViewInfo(str, null);
            }
            kotlin.jdk7.AutoCloseableKt.closeFinally(prepare, null);
            return viewInfo;
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
