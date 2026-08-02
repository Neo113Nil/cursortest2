package com.facetec.sdk;

/* loaded from: classes8.dex */
public class gw<T> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Type f3620a;
    private final int c;
    private final java.lang.Class<? super T> e;

    public gw() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == com.facetec.sdk.gw.class) {
                java.lang.reflect.Type d = com.facetec.sdk.fn.d(parameterizedType.getActualTypeArguments()[0]);
                this.f3620a = d;
                this.e = (java.lang.Class<? super T>) com.facetec.sdk.fn.e(d);
                this.c = d.hashCode();
                return;
            }
        } else if (genericSuperclass == com.facetec.sdk.gw.class) {
            throw new java.lang.IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new java.lang.IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    private gw(java.lang.reflect.Type type) {
        java.lang.reflect.Type d = com.facetec.sdk.fn.d((java.lang.reflect.Type) java.util.Objects.requireNonNull(type));
        this.f3620a = d;
        this.e = (java.lang.Class<? super T>) com.facetec.sdk.fn.e(d);
        this.c = d.hashCode();
    }

    public final java.lang.Class<? super T> a() {
        return this.e;
    }

    public final java.lang.reflect.Type b() {
        return this.f3620a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.facetec.sdk.gw) && com.facetec.sdk.fn.a(this.f3620a, ((com.facetec.sdk.gw) obj).f3620a);
    }

    public final java.lang.String toString() {
        return com.facetec.sdk.fn.c(this.f3620a);
    }

    public static com.facetec.sdk.gw<?> d(java.lang.reflect.Type type) {
        return new com.facetec.sdk.gw<>(type);
    }

    public static <T> com.facetec.sdk.gw<T> c(java.lang.Class<T> cls) {
        return new com.facetec.sdk.gw<>(cls);
    }
}
