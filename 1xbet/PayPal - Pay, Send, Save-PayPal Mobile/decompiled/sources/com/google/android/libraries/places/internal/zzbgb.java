package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbgb implements java.security.PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ java.lang.Object run() throws java.lang.Exception {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    zzbgb() {
    }
}
