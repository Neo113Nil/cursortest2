package net.zetetic.database.sqlcipher;

/* loaded from: classes17.dex */
public class SQLiteQueryBuilder {
    private static final java.lang.String TAG = "SQLiteQueryBuilder";
    private static final java.util.regex.Pattern sLimitPattern = java.util.regex.Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private boolean mStrict;
    private java.util.Map<java.lang.String, java.lang.String> mProjectionMap = null;
    private java.lang.String mTables = "";
    private java.lang.StringBuilder mWhereClause = null;
    private boolean mDistinct = false;
    private net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory mFactory = null;

    public void setDistinct(boolean z) {
        this.mDistinct = z;
    }

    public java.lang.String getTables() {
        return this.mTables;
    }

    public void setTables(java.lang.String str) {
        this.mTables = str;
    }

    public void appendWhere(java.lang.CharSequence charSequence) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new java.lang.StringBuilder(charSequence.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        this.mWhereClause.append(charSequence);
    }

    public void appendWhereEscapeString(java.lang.String str) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new java.lang.StringBuilder(str.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        android.database.DatabaseUtils.appendEscapedSQLString(this.mWhereClause, str);
    }

    public void setProjectionMap(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mProjectionMap = map;
    }

    public void setCursorFactory(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory) {
        this.mFactory = cursorFactory;
    }

    public void setStrict(boolean z) {
        this.mStrict = z;
    }

    public static java.lang.String buildQueryString(boolean z, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (android.text.TextUtils.isEmpty(str3) && !android.text.TextUtils.isEmpty(str4)) {
            throw new java.lang.IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        if (!android.text.TextUtils.isEmpty(str6) && !sLimitPattern.matcher(str6).matches()) {
            throw new java.lang.IllegalArgumentException("invalid LIMIT clauses:".concat(java.lang.String.valueOf(str6)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(120);
        sb.append("SELECT ");
        if (z) {
            sb.append("DISTINCT ");
        }
        if (strArr != null && strArr.length != 0) {
            appendColumns(sb, strArr);
        } else {
            sb.append("* ");
        }
        sb.append("FROM ");
        sb.append(str);
        appendClause(sb, " WHERE ", str2);
        appendClause(sb, " GROUP BY ", str3);
        appendClause(sb, " HAVING ", str4);
        appendClause(sb, " ORDER BY ", str5);
        appendClause(sb, " LIMIT ", str6);
        return sb.toString();
    }

    private static void appendClause(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    public static void appendColumns(java.lang.StringBuilder sb, java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            java.lang.String str = strArr[i];
            if (str != null) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append(' ');
    }

    public android.database.Cursor query(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, null, null);
    }

    public android.database.Cursor query(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, str5, null);
    }

    public android.database.Cursor query(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.os.CancellationSignal cancellationSignal) {
        if (this.mTables == null) {
            return null;
        }
        if (this.mStrict && str != null && str.length() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(str);
            sb.append(")");
            sQLiteDatabase.validateSql(buildQuery(strArr, sb.toString(), str2, str3, str4, str5), cancellationSignal);
        }
        java.lang.String buildQuery = buildQuery(strArr, str, str2, str3, str4, str5);
        if (net.zetetic.database.Logger.isLoggable(TAG, 3)) {
            net.zetetic.database.Logger.d(TAG, "Performing query: ".concat(java.lang.String.valueOf(buildQuery)));
        }
        return sQLiteDatabase.rawQueryWithFactory(this.mFactory, buildQuery, strArr2, net.zetetic.database.sqlcipher.SQLiteDatabase.findEditTable(this.mTables), cancellationSignal);
    }

    public java.lang.String buildQuery(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String[] computeProjection = computeProjection(strArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = this.mWhereClause;
        boolean z = sb2 != null && sb2.length() > 0;
        if (z) {
            sb.append(this.mWhereClause.toString());
            sb.append(')');
        }
        if (str != null && str.length() > 0) {
            if (z) {
                sb.append(" AND ");
            }
            sb.append('(');
            sb.append(str);
            sb.append(')');
        }
        return buildQueryString(this.mDistinct, this.mTables, computeProjection, sb.toString(), str2, str3, str4, str5);
    }

    @java.lang.Deprecated
    public java.lang.String buildQuery(java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return buildQuery(strArr, str, str2, str3, str4, str5);
    }

    public java.lang.String buildUnionSubQuery(java.lang.String str, java.lang.String[] strArr, java.util.Set<java.lang.String> set, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i2 = 0; i2 < length; i2++) {
            java.lang.String str6 = strArr[i2];
            if (str6.equals(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
                sb.append(str2);
                sb.append("' AS ");
                sb.append(str);
                strArr2[i2] = sb.toString();
            } else if (i2 <= i || set.contains(str6)) {
                strArr2[i2] = str6;
            } else {
                strArr2[i2] = "NULL AS ".concat(java.lang.String.valueOf(str6));
            }
        }
        return buildQuery(strArr2, str3, str4, str5, null, null);
    }

    @java.lang.Deprecated
    public java.lang.String buildUnionSubQuery(java.lang.String str, java.lang.String[] strArr, java.util.Set<java.lang.String> set, int i, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr2, java.lang.String str4, java.lang.String str5) {
        return buildUnionSubQuery(str, strArr, set, i, str2, str3, str4, str5);
    }

    public java.lang.String buildUnionQuery(java.lang.String[] strArr, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        int length = strArr.length;
        java.lang.String str3 = this.mDistinct ? " UNION " : " UNION ALL ";
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(str3);
            }
            sb.append(strArr[i]);
        }
        appendClause(sb, " ORDER BY ", str);
        appendClause(sb, " LIMIT ", str2);
        return sb.toString();
    }

    private java.lang.String[] computeProjection(java.lang.String[] strArr) {
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            if (this.mProjectionMap == null) {
                return strArr;
            }
            java.lang.String[] strArr2 = new java.lang.String[strArr.length];
            int length = strArr.length;
            while (i < length) {
                java.lang.String str = strArr[i];
                java.lang.String str2 = this.mProjectionMap.get(str);
                if (str2 != null) {
                    strArr2[i] = str2;
                } else if (!this.mStrict && (str.contains(" AS ") || str.contains(" as "))) {
                    strArr2[i] = str;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid column ");
                    sb.append(strArr[i]);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                i++;
            }
            return strArr2;
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.mProjectionMap;
        if (map == null) {
            return null;
        }
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = map.entrySet();
        java.lang.String[] strArr3 = new java.lang.String[entrySet.size()];
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : entrySet) {
            if (!entry.getKey().equals("_count")) {
                strArr3[i] = entry.getValue();
                i++;
            }
        }
        return strArr3;
    }
}
