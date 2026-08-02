package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class el {
    public static int b;
    public static int e;

    /* renamed from: a, reason: collision with root package name */
    private com.facetec.sdk.fm f3550a = com.facetec.sdk.fm.c;
    private com.facetec.sdk.ey d = com.facetec.sdk.ey.DEFAULT;
    private com.facetec.sdk.ek c = com.facetec.sdk.eg.IDENTITY;
    private final java.util.Map<java.lang.reflect.Type, com.facetec.sdk.em<?>> h = new java.util.HashMap();
    private final java.util.List<com.facetec.sdk.fb> i = new java.util.ArrayList();
    private final java.util.List<com.facetec.sdk.fb> g = new java.util.ArrayList();
    private boolean f = false;
    private java.lang.String j = com.facetec.sdk.eo.b;
    private int l = 2;

    /* renamed from: o, reason: collision with root package name */
    private int f3551o = 2;
    private boolean k = false;
    private boolean n = false;
    private boolean m = true;
    private boolean q = false;
    private boolean s = false;
    private boolean r = false;
    private boolean p = true;
    private com.facetec.sdk.fa t = com.facetec.sdk.eo.d;
    private com.facetec.sdk.fa x = com.facetec.sdk.eo.c;
    private final java.util.LinkedList<com.facetec.sdk.ez> v = new java.util.LinkedList<>();

    public final com.facetec.sdk.el d() {
        this.m = false;
        return this;
    }

    public final com.facetec.sdk.eo c() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.i.size() + this.g.size() + 3);
        arrayList.addAll(this.i);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.g);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        e(this.j, this.l, this.f3551o, arrayList);
        return new com.facetec.sdk.eo(this.f3550a, this.c, new java.util.HashMap(this.h), this.f, this.k, this.s, this.m, this.q, this.r, this.n, this.p, this.d, this.j, this.l, this.f3551o, new java.util.ArrayList(this.i), new java.util.ArrayList(this.g), arrayList, this.t, this.x, new java.util.ArrayList(this.v));
    }

    private static void e(java.lang.String str, int i, int i2, java.util.List<com.facetec.sdk.fb> list) {
        com.facetec.sdk.fb fbVar;
        com.facetec.sdk.fb fbVar2;
        com.facetec.sdk.fb fbVar3;
        boolean z = com.facetec.sdk.gn.f3610a;
        if (str != null && !str.trim().isEmpty()) {
            fbVar = com.facetec.sdk.ga.c.f3587a.b(str);
            if (z) {
                fbVar2 = com.facetec.sdk.gn.b.b(str);
                fbVar3 = com.facetec.sdk.gn.d.b(str);
            }
            fbVar2 = null;
            fbVar3 = null;
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            com.facetec.sdk.fb b2 = com.facetec.sdk.ga.c.f3587a.b(i, i2);
            if (z) {
                com.facetec.sdk.fb b3 = com.facetec.sdk.gn.b.b(i, i2);
                com.facetec.sdk.fb b4 = com.facetec.sdk.gn.d.b(i, i2);
                fbVar2 = b3;
                fbVar = b2;
                fbVar3 = b4;
            } else {
                fbVar = b2;
                fbVar2 = null;
                fbVar3 = null;
            }
        }
        list.add(fbVar);
        if (z) {
            list.add(fbVar2);
            list.add(fbVar3);
        }
    }

    public static int e() {
        int i = b;
        b = i + 1;
        if (i % 5825665 != 0) {
            return e;
        }
        int nextInt = new java.util.Random().nextInt();
        e = nextInt;
        return nextInt;
    }
}
