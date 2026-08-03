package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class s3 implements java.security.PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final java.lang.Object run() {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
