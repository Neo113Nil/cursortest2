package org.bouncycastle.i18n.filter;

/* loaded from: classes17.dex */
public class SQLFilter implements org.bouncycastle.i18n.filter.Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public java.lang.String doFilterUrl(java.lang.String str) {
        return doFilter(str);
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public java.lang.String doFilter(java.lang.String str) {
        int i;
        java.lang.String str2;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        int i2 = 0;
        while (i2 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i2);
            if (charAt == '\n') {
                i = i2 + 1;
                str2 = "\\n";
            } else if (charAt == '\r') {
                i = i2 + 1;
                str2 = "\\r";
            } else if (charAt == '\"') {
                i = i2 + 1;
                str2 = "\\\"";
            } else if (charAt == '\'') {
                i = i2 + 1;
                str2 = "\\'";
            } else if (charAt == '-') {
                i = i2 + 1;
                str2 = "\\-";
            } else if (charAt == '/') {
                i = i2 + 1;
                str2 = "\\/";
            } else if (charAt == ';') {
                i = i2 + 1;
                str2 = "\\;";
            } else if (charAt == '=') {
                i = i2 + 1;
                str2 = "\\=";
            } else if (charAt == '\\') {
                i = i2 + 1;
                str2 = "\\\\";
            } else {
                i2++;
            }
            stringBuffer.replace(i2, i, str2);
            i2 = i;
            i2++;
        }
        return stringBuffer.toString();
    }
}
