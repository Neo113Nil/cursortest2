package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001a#\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroid/database/Cursor;", "c", "copyAndClose", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", "name", "", "getColumnIndex", "(Landroid/database/Cursor;Ljava/lang/String;)I", "getColumnIndexOrThrow", "", "columnNames", "findColumnIndexBySuffix", "([Ljava/lang/String;Ljava/lang/String;)I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "block", "useCursor", "(Landroid/database/Cursor;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "cursor", "", "mapping", "wrapMappedColumns", "(Landroid/database/Cursor;[Ljava/lang/String;[I)Landroid/database/Cursor;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CursorUtil {
    public static final int getColumnIndex(android.database.Cursor cursor, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("`");
        sb.append(str);
        sb.append('`');
        int columnIndex2 = cursor.getColumnIndex(sb.toString());
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int getColumnIndexOrThrow(android.database.Cursor cursor, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            java.lang.String[] columnNames = cursor.getColumnNames();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(columnNames, "");
            str2 = kotlin.collections.ArraysKt.joinToString$default(columnNames, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            str2 = "unknown";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("column '");
        sb.append(str);
        sb.append("' does not exist. Available columns: ");
        sb.append(str2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final int findColumnIndexBySuffix(java.lang.String[] strArr, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String concat = ".".concat(java.lang.String.valueOf(str));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(".");
        sb.append(str);
        sb.append('`');
        java.lang.String obj = sb.toString();
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            java.lang.String str2 = strArr[i];
            if (str2.length() >= str.length() + 2 && (kotlin.text.StringsKt.endsWith$default(str2, concat, false, 2, (java.lang.Object) null) || (str2.charAt(0) == '`' && kotlin.text.StringsKt.endsWith$default(str2, obj, false, 2, (java.lang.Object) null)))) {
                return i2;
            }
            i++;
            i2++;
        }
        return -1;
    }

    public static final <R> R useCursor(android.database.Cursor cursor, kotlin.jvm.functions.Function1<? super android.database.Cursor, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        android.database.Cursor cursor2 = cursor;
        try {
            R invoke = function1.invoke(cursor2);
            kotlin.io.CloseableKt.closeFinally(cursor2, null);
            return invoke;
        } finally {
        }
    }

    public static final android.database.Cursor wrapMappedColumns(final android.database.Cursor cursor, final java.lang.String[] strArr, final int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        if (strArr.length != iArr.length) {
            throw new java.lang.IllegalStateException("Expected columnNames.length == mapping.length".toString());
        }
        return new android.database.CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil$wrapMappedColumns$2
            @Override // android.database.CursorWrapper, android.database.Cursor
            public final int getColumnIndex(java.lang.String columnName) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnName, "");
                java.lang.String[] strArr2 = strArr;
                int[] iArr2 = iArr;
                int length = strArr2.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    if (kotlin.text.StringsKt.equals(strArr2[i], columnName, true)) {
                        return iArr2[i2];
                    }
                    i++;
                    i2++;
                }
                return super.getColumnIndex(columnName);
            }
        };
    }

    public static final android.database.Cursor copyAndClose(android.database.Cursor cursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        android.database.Cursor cursor2 = cursor;
        try {
            android.database.Cursor cursor3 = cursor2;
            android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(cursor3.getColumnNames(), cursor3.getCount());
            while (cursor3.moveToNext()) {
                java.lang.Object[] objArr = new java.lang.Object[cursor3.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor3.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = java.lang.Long.valueOf(cursor3.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = java.lang.Double.valueOf(cursor3.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor3.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor3.getBlob(i);
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            kotlin.io.CloseableKt.closeFinally(cursor2, null);
            return matrixCursor;
        } finally {
        }
    }
}
