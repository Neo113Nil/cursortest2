package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0388gj {
    public static byte[] a(java.lang.String str) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}
