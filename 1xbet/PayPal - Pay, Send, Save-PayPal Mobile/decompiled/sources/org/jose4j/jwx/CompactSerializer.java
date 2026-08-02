package org.jose4j.jwx;

/* loaded from: classes18.dex */
public class CompactSerializer {
    public static java.lang.String[] deserialize(java.lang.String str) {
        java.lang.String[] split = str.split("\\.");
        if (!str.endsWith(".")) {
            return split;
        }
        java.lang.String[] strArr = new java.lang.String[split.length + 1];
        java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
        strArr[split.length] = "";
        return strArr;
    }

    public static java.lang.String serialize(java.lang.String... strArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            java.lang.String str = strArr[i];
            if (str == null) {
                str = "";
            }
            sb.append(str);
            if (i != strArr.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
