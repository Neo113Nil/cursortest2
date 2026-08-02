package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gx {
    public static java.lang.reflect.Type b(java.lang.reflect.Type type, java.lang.Object obj) {
        return obj != null ? (type == java.lang.Object.class || (type instanceof java.lang.reflect.TypeVariable) || (type instanceof java.lang.Class)) ? obj.getClass() : type : type;
    }

    public static boolean a(com.facetec.sdk.fd fdVar) {
        return ((fdVar instanceof com.facetec.sdk.ha) || (fdVar instanceof com.facetec.sdk.ge.a)) ? false : true;
    }
}
