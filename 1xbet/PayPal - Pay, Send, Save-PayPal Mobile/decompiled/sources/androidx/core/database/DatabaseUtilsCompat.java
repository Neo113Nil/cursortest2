package androidx.core.database;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class DatabaseUtilsCompat {
    private DatabaseUtilsCompat() {
    }

    @java.lang.Deprecated
    public static java.lang.String concatenateWhere(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(str);
        sb.append(") AND (");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @java.lang.Deprecated
    public static java.lang.String[] appendSelectionArgs(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length + strArr2.length];
        java.lang.System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        java.lang.System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
