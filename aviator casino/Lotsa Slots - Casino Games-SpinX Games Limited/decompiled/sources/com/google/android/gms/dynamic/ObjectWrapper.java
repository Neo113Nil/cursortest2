package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class ObjectWrapper<T> extends com.google.android.gms.dynamic.IObjectWrapper.Stub {
    private final java.lang.Object zza;

    private ObjectWrapper(java.lang.Object obj) {
        this.zza = obj;
    }

    public static <T> T unwrap(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof com.google.android.gms.dynamic.ObjectWrapper) {
            return (T) ((com.google.android.gms.dynamic.ObjectWrapper) iObjectWrapper).zza;
        }
        android.os.IBinder asBinder = iObjectWrapper.asBinder();
        java.lang.reflect.Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (java.lang.NullPointerException e2) {
            throw new java.lang.IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static <T> com.google.android.gms.dynamic.IObjectWrapper wrap(T t) {
        return new com.google.android.gms.dynamic.ObjectWrapper(t);
    }
}
