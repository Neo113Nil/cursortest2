package com.iab.omid.library.fyber;

/* loaded from: classes5.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f4384a = java.util.regex.Pattern.compile("<(head)( [^>]*)?>", 2);
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("<(head)( [^>]*)?/>", 2);
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("<(body)( [^>]*?)?>", 2);
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("<(body)( [^>]*?)?/>", 2);
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("<(html)( [^>]*?)?>", 2);
    private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("<(html)( [^>]*?)?/>", 2);
    private static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.iab.omid.library.fyber.utils.g.a(str, "HTML is null or empty");
        int[][] a2 = a(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + str2.length() + 16);
        if (!b(str, sb, b, str2, a2) && !a(str, sb, f4384a, str2, a2) && !b(str, sb, d, str2, a2) && !a(str, sb, c, str2, a2) && !b(str, sb, f, str2, a2) && !a(str, sb, e, str2, a2) && !a(str, sb, g, str2, a2)) {
            return str2 + str;
        }
        return sb.toString();
    }

    private static boolean a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(java.lang.String str, java.lang.StringBuilder sb, java.util.regex.Pattern pattern, java.lang.String str2, int[][] iArr) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    private static int[][] a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 0, 2));
    }

    static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean b(java.lang.String str, java.lang.StringBuilder sb, java.util.regex.Pattern pattern, java.lang.String str2, int[][] iArr) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
