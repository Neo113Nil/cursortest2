package androidx.room.util;

/* compiled from: CursorUtil.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a#\u0010\u0003\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a)\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010\u001a/\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0012*\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"copyAndClose", "Landroid/database/Cursor;", "c", "findColumnIndexBySuffix", "", com.helpshift.user.UserConstants.POLLING_CURSOR, "name", "", "columnNames", "", "([Ljava/lang/String;Ljava/lang/String;)I", "getColumnIndex", "getColumnIndexOrThrow", "wrapMappedColumns", "mapping", "", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;", "useCursor", "R", "block", "Lkotlin/Function1;", "(Landroid/database/Cursor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CursorUtil {
    public static final int getColumnIndex(android.database.Cursor c, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "c");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c.getColumnIndex("`" + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c, name);
    }

    public static final int getColumnIndexOrThrow(android.database.Cursor c, java.lang.String name) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "c");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            java.lang.String[] columnNames = c.getColumnNames();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = kotlin.collections.ArraysKt.joinToString$default(columnNames, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            android.util.Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str = "unknown";
        }
        throw new java.lang.IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    private static final int findColumnIndexBySuffix(android.database.Cursor cursor, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        java.lang.String[] columnNames = cursor.getColumnNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int findColumnIndexBySuffix(java.lang.String[] columnNames, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.lang.String str = "." + name;
        java.lang.String str2 = "." + name + '`';
        int length = columnNames.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            java.lang.String str3 = columnNames[i];
            int i3 = i2 + 1;
            if (str3.length() >= name.length() + 2) {
                if (kotlin.text.StringsKt.endsWith$default(str3, str, false, 2, (java.lang.Object) null)) {
                    return i2;
                }
                if (str3.charAt(0) == '`' && kotlin.text.StringsKt.endsWith$default(str3, str2, false, 2, (java.lang.Object) null)) {
                    return i2;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    public static final <R> R useCursor(android.database.Cursor cursor, kotlin.jvm.functions.Function1<? super android.database.Cursor, ? extends R> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        android.database.Cursor cursor2 = cursor;
        try {
            R invoke = block.invoke(cursor2);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlin.io.CloseableKt.closeFinally(cursor2, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    public static final android.database.Cursor wrapMappedColumns(final android.database.Cursor cursor, final java.lang.String[] columnNames, final int[] mapping) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "cursor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length != mapping.length) {
            throw new java.lang.IllegalStateException("Expected columnNames.length == mapping.length".toString());
        }
        return new android.database.CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil$wrapMappedColumns$2
            @Override // android.database.CursorWrapper, android.database.Cursor
            public int getColumnIndex(java.lang.String columnName) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnName, "columnName");
                java.lang.String[] strArr = columnNames;
                int[] iArr = mapping;
                int length = strArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (kotlin.text.StringsKt.equals(strArr[i], columnName, true)) {
                        return iArr[i2];
                    }
                    i++;
                    i2 = i3;
                }
                return super.getColumnIndex(columnName);
            }
        };
    }

    public static final android.database.Cursor copyAndClose(android.database.Cursor c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "c");
        android.database.Cursor cursor = c;
        try {
            android.database.Cursor cursor2 = cursor;
            android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                java.lang.Object[] objArr = new java.lang.Object[cursor2.getColumnCount()];
                int columnCount = c.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor2.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = java.lang.Long.valueOf(cursor2.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = java.lang.Double.valueOf(cursor2.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor2.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor2.getBlob(i);
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            kotlin.io.CloseableKt.closeFinally(cursor, null);
            return matrixCursor;
        } finally {
        }
    }
}
