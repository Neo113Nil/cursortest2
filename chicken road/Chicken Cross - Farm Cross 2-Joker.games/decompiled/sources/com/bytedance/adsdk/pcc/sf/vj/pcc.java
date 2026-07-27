package com.bytedance.adsdk.pcc.sf.vj;

/* loaded from: classes5.dex */
public class pcc {
    public static boolean gm(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean oo(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    public static boolean pcc(char c) {
        return c == ' ';
    }

    public static boolean sf(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }
}
