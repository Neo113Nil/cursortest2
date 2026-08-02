package org.bouncycastle.i18n.filter;

/* loaded from: classes17.dex */
public class HTMLFilter implements org.bouncycastle.i18n.filter.Filter {
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
            if (charAt == '\"') {
                i = i2 + 1;
                str2 = "&#34";
            } else if (charAt == '#') {
                i = i2 + 1;
                str2 = "&#35";
            } else if (charAt == '+') {
                i = i2 + 1;
                str2 = "&#43";
            } else if (charAt == '-') {
                i = i2 + 1;
                str2 = "&#45";
            } else if (charAt == '>') {
                i = i2 + 1;
                str2 = "&#62";
            } else if (charAt == ';') {
                i = i2 + 1;
                str2 = "&#59";
            } else if (charAt != '<') {
                switch (charAt) {
                    case '%':
                        i = i2 + 1;
                        str2 = "&#37";
                        break;
                    case '&':
                        i = i2 + 1;
                        str2 = "&#38";
                        break;
                    case '\'':
                        i = i2 + 1;
                        str2 = "&#39";
                        break;
                    case '(':
                        i = i2 + 1;
                        str2 = "&#40";
                        break;
                    case ')':
                        i = i2 + 1;
                        str2 = "&#41";
                        break;
                    default:
                        i2 -= 3;
                        continue;
                }
            } else {
                i = i2 + 1;
                str2 = "&#60";
            }
            stringBuffer.replace(i2, i, str2);
            i2 += 4;
        }
        return stringBuffer.toString();
    }
}
