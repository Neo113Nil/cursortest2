package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gh implements com.facetec.sdk.fb {
    private final com.facetec.sdk.fl b;
    final boolean d;

    public gh(com.facetec.sdk.fl flVar, boolean z) {
        this.b = flVar;
        this.d = z;
    }

    @Override // com.facetec.sdk.fb
    public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
        com.facetec.sdk.fd<java.lang.Boolean> fdVar;
        java.lang.reflect.Type b2 = gwVar.b();
        java.lang.Class<? super T> a2 = gwVar.a();
        if (!java.util.Map.class.isAssignableFrom(a2)) {
            return null;
        }
        java.lang.reflect.Type[] b3 = com.facetec.sdk.fn.b(b2, a2);
        java.lang.reflect.Type type = b3[0];
        if (type == java.lang.Boolean.TYPE || type == java.lang.Boolean.class) {
            fdVar = com.facetec.sdk.gj.e;
        } else {
            fdVar = eoVar.a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(type));
        }
        com.facetec.sdk.fd<T> a3 = eoVar.a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(b3[1]));
        com.facetec.sdk.fs<T> d = this.b.d(gwVar);
        return new com.facetec.sdk.gh.b(eoVar, b3[0], fdVar, b3[1], a3, d);
    }

    final class b<K, V> extends com.facetec.sdk.fd<java.util.Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public static int f3598a;
        public static int d;
        private final com.facetec.sdk.fd<V> b;
        private final com.facetec.sdk.fd<K> c;
        private final com.facetec.sdk.fs<? extends java.util.Map<K, V>> e;

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
            java.lang.String str;
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                guVar.g();
                return;
            }
            if (!com.facetec.sdk.gh.this.d) {
                guVar.e();
                for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                    guVar.c(java.lang.String.valueOf(entry.getKey()));
                    this.b.a(guVar, entry.getValue());
                }
                guVar.d();
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (java.util.Map.Entry<K, V> entry2 : map.entrySet()) {
                com.facetec.sdk.es a2 = this.c.a(entry2.getKey());
                arrayList.add(a2);
                arrayList2.add(entry2.getValue());
                z |= a2.j() || a2.f();
            }
            if (z) {
                guVar.a();
                int size = arrayList.size();
                while (i < size) {
                    guVar.a();
                    com.facetec.sdk.fv.c((com.facetec.sdk.es) arrayList.get(i), guVar);
                    this.b.a(guVar, arrayList2.get(i));
                    guVar.b();
                    i++;
                }
                guVar.b();
                return;
            }
            guVar.e();
            int size2 = arrayList.size();
            while (i < size2) {
                com.facetec.sdk.es esVar = (com.facetec.sdk.es) arrayList.get(i);
                if (esVar.g()) {
                    com.facetec.sdk.ex n = esVar.n();
                    if (n.o()) {
                        str = java.lang.String.valueOf(n.b());
                    } else if (n.m()) {
                        str = java.lang.Boolean.toString(n.h());
                    } else {
                        if (((java.lang.Boolean) com.facetec.sdk.ex.b(132102006, new java.lang.Object[]{n}, -132102006, com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c(), com.facetec.sdk.gr.b.c())).booleanValue()) {
                            str = n.c();
                        } else {
                            throw new java.lang.AssertionError();
                        }
                    }
                } else if (esVar.i()) {
                    str = "null";
                } else {
                    throw new java.lang.AssertionError();
                }
                guVar.c(str);
                this.b.a(guVar, arrayList2.get(i));
                i++;
            }
            guVar.d();
        }

        public b(com.facetec.sdk.eo eoVar, java.lang.reflect.Type type, com.facetec.sdk.fd<K> fdVar, java.lang.reflect.Type type2, com.facetec.sdk.fd<V> fdVar2, com.facetec.sdk.fs<? extends java.util.Map<K, V>> fsVar) {
            this.c = new com.facetec.sdk.gk(eoVar, fdVar, type);
            this.b = new com.facetec.sdk.gk(eoVar, fdVar2, type2);
            this.e = fsVar;
        }

        @Override // com.facetec.sdk.fd
        public final /* synthetic */ java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
            com.facetec.sdk.gs f = gtVar.f();
            if (f == com.facetec.sdk.gs.NULL) {
                gtVar.k();
                return null;
            }
            java.util.Map<K, V> e = this.e.e();
            if (f == com.facetec.sdk.gs.BEGIN_ARRAY) {
                gtVar.a();
                while (gtVar.d()) {
                    gtVar.a();
                    K b = this.c.b(gtVar);
                    if (e.put(b, this.b.b(gtVar)) != null) {
                        throw new com.facetec.sdk.ev("duplicate key: ".concat(java.lang.String.valueOf(b)));
                    }
                    gtVar.e();
                }
                gtVar.e();
                return e;
            }
            gtVar.b();
            while (gtVar.d()) {
                com.facetec.sdk.fr.d.a(gtVar);
                K b2 = this.c.b(gtVar);
                if (e.put(b2, this.b.b(gtVar)) != null) {
                    throw new com.facetec.sdk.ev("duplicate key: ".concat(java.lang.String.valueOf(b2)));
                }
            }
            gtVar.c();
            return e;
        }

        public static int d() {
            int i = f3598a;
            f3598a = i + 1;
            if (i % 8430356 != 0) {
                return d;
            }
            int myPid = android.os.Process.myPid();
            d = myPid;
            return myPid;
        }
    }
}
