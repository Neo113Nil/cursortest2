package com.google.common.base;

/* loaded from: classes.dex */
public final class Objects extends com.google.common.base.ExtraObjectsMethodsForWeb {
    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public static int hashCode(java.lang.Object... objArr) {
        return java.util.Objects.hash(objArr);
    }

    private Objects() {
    }
}
