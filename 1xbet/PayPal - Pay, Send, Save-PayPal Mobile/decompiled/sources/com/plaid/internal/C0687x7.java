package com.plaid.internal;

/* renamed from: com.plaid.internal.x7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0687x7 {
    public static java.lang.String a(java.lang.String str) {
        if (str == null || str.length() <= 32) {
            return str;
        }
        if (str.length() <= 30) {
            return str.substring(0, 32);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str.substring(0, 30));
        sb.append("..");
        return sb.toString();
    }
}
