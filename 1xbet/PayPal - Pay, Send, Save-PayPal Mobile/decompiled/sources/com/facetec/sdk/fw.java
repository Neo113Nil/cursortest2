package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fw {
    public static <T> java.lang.Class<T> b(java.lang.Class<T> cls) {
        return cls == java.lang.Integer.TYPE ? java.lang.Integer.class : cls == java.lang.Float.TYPE ? java.lang.Float.class : cls == java.lang.Byte.TYPE ? java.lang.Byte.class : cls == java.lang.Double.TYPE ? java.lang.Double.class : cls == java.lang.Long.TYPE ? java.lang.Long.class : cls == java.lang.Character.TYPE ? java.lang.Character.class : cls == java.lang.Boolean.TYPE ? java.lang.Boolean.class : cls == java.lang.Short.TYPE ? java.lang.Short.class : cls == java.lang.Void.TYPE ? java.lang.Void.class : cls;
    }
}
