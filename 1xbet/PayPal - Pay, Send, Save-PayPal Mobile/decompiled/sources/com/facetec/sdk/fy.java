package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fy implements com.facetec.sdk.fb {
    private final com.facetec.sdk.fl e;

    public fy(com.facetec.sdk.fl flVar) {
        this.e = flVar;
    }

    @Override // com.facetec.sdk.fb
    public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
        java.lang.reflect.Type b = gwVar.b();
        java.lang.Class<? super T> a2 = gwVar.a();
        if (!java.util.Collection.class.isAssignableFrom(a2)) {
            return null;
        }
        java.lang.reflect.Type a3 = com.facetec.sdk.fn.a(b, (java.lang.Class<?>) a2);
        return new com.facetec.sdk.fy.a(eoVar, a3, eoVar.a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(a3)), this.e.d(gwVar));
    }

    static final class a<E> extends com.facetec.sdk.fd<java.util.Collection<E>> {
        private final com.facetec.sdk.fs<? extends java.util.Collection<E>> c;
        private final com.facetec.sdk.fd<E> d;

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
            java.util.Collection collection = (java.util.Collection) obj;
            if (collection == null) {
                guVar.g();
                return;
            }
            guVar.a();
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.d.a(guVar, it.next());
            }
            guVar.b();
        }

        public a(com.facetec.sdk.eo eoVar, java.lang.reflect.Type type, com.facetec.sdk.fd<E> fdVar, com.facetec.sdk.fs<? extends java.util.Collection<E>> fsVar) {
            this.d = new com.facetec.sdk.gk(eoVar, fdVar, type);
            this.c = fsVar;
        }

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                gtVar.k();
                return null;
            }
            java.util.Collection<E> e = this.c.e();
            gtVar.a();
            while (gtVar.d()) {
                e.add(this.d.b(gtVar));
            }
            gtVar.e();
            return e;
        }
    }
}
