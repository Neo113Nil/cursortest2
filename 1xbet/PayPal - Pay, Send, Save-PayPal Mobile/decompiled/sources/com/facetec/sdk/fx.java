package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fx<E> extends com.facetec.sdk.fd<java.lang.Object> {
    public static final com.facetec.sdk.fb d = new com.facetec.sdk.fb() { // from class: com.facetec.sdk.fx.2
        @Override // com.facetec.sdk.fb
        public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
            java.lang.reflect.Type b = gwVar.b();
            if (!(b instanceof java.lang.reflect.GenericArrayType) && (!(b instanceof java.lang.Class) || !((java.lang.Class) b).isArray())) {
                return null;
            }
            java.lang.reflect.Type a2 = com.facetec.sdk.fn.a(b);
            return new com.facetec.sdk.fx(eoVar, eoVar.a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(a2)), com.facetec.sdk.fn.e(a2));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Class<E> f3584a;
    private final com.facetec.sdk.fd<E> e;

    public fx(com.facetec.sdk.eo eoVar, com.facetec.sdk.fd<E> fdVar, java.lang.Class<E> cls) {
        this.e = new com.facetec.sdk.gk(eoVar, fdVar, cls);
        this.f3584a = cls;
    }

    @Override // com.facetec.sdk.fd
    public final java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        if (gtVar.f() == com.facetec.sdk.gs.NULL) {
            gtVar.k();
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        gtVar.a();
        while (gtVar.d()) {
            arrayList.add(this.e.b(gtVar));
        }
        gtVar.e();
        int size = arrayList.size();
        if (this.f3584a.isPrimitive()) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f3584a, size);
            for (int i = 0; i < size; i++) {
                java.lang.reflect.Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f3584a, size));
    }

    @Override // com.facetec.sdk.fd
    public final void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            guVar.g();
            return;
        }
        guVar.a();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.e.a(guVar, java.lang.reflect.Array.get(obj, i));
        }
        guVar.b();
    }
}
