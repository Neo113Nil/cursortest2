package com.amazon.device.iap.internal.util;

/* compiled from: Validator.java */
/* loaded from: classes2.dex */
public class d {
    public static void a(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        throw new java.lang.IllegalArgumentException(str + " must not be null");
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        if (a(str)) {
            throw new java.lang.IllegalArgumentException(str2 + " must not be null or empty");
        }
    }

    public static void a(java.util.Collection<? extends java.lang.Object> collection, java.lang.String str) {
        if (collection.isEmpty()) {
            throw new java.lang.IllegalArgumentException(str + " must not be empty");
        }
    }

    public static boolean a(java.lang.String str) {
        return str == null || str.trim().length() == 0;
    }
}
