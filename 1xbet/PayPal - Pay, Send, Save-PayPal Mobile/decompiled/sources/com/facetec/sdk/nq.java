package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nq {

    /* renamed from: a, reason: collision with root package name */
    java.util.List<java.net.Proxy> f3689a;
    final com.facetec.sdk.lz b;
    final com.facetec.sdk.mo c;
    final com.facetec.sdk.nr d;
    final com.facetec.sdk.md e;
    int j;
    java.util.List<java.net.InetSocketAddress> h = java.util.Collections.emptyList();
    final java.util.List<com.facetec.sdk.nc> f = new java.util.ArrayList();

    public nq(com.facetec.sdk.lz lzVar, com.facetec.sdk.nr nrVar, com.facetec.sdk.md mdVar, com.facetec.sdk.mo moVar) {
        java.util.List<java.net.Proxy> c;
        this.f3689a = java.util.Collections.emptyList();
        this.b = lzVar;
        this.d = nrVar;
        this.e = mdVar;
        this.c = moVar;
        com.facetec.sdk.mv b = lzVar.b();
        java.net.Proxy proxy = lzVar.f3636a;
        if (proxy != null) {
            c = java.util.Collections.singletonList(proxy);
        } else {
            java.util.List<java.net.Proxy> select = lzVar.c().select(b.d());
            if (select != null && !select.isEmpty()) {
                c = com.facetec.sdk.nh.e(select);
            } else {
                c = com.facetec.sdk.nh.c(java.net.Proxy.NO_PROXY);
            }
        }
        this.f3689a = c;
        this.j = 0;
    }

    public final boolean b() {
        return d() || !this.f.isEmpty();
    }

    final boolean d() {
        return this.j < this.f3689a.size();
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static int f3690a;
        public static int b;
        int d = 0;
        final java.util.List<com.facetec.sdk.nc> e;

        d(java.util.List<com.facetec.sdk.nc> list) {
            this.e = list;
        }

        public final boolean c() {
            return this.d < this.e.size();
        }

        public static int d() {
            int i = f3690a;
            f3690a = i + 1;
            if (i % 6079093 != 0) {
                return b;
            }
            int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
            b = elapsedRealtime;
            return elapsedRealtime;
        }
    }
}
