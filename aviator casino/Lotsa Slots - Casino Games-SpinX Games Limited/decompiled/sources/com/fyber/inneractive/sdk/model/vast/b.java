package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3799a;
    public java.lang.String b;
    public final java.util.PriorityQueue d;
    public com.fyber.inneractive.sdk.model.vast.o f;
    public final java.util.PriorityQueue g;
    public final java.util.Comparator h;
    public com.fyber.inneractive.sdk.flow.endcard.k o;
    public com.fyber.inneractive.sdk.model.vast.v p;
    public final java.util.ArrayList e = new java.util.ArrayList();
    public int i = 0;
    public int j = 0;
    public final java.util.ArrayList k = new java.util.ArrayList();
    public final java.util.ArrayList l = new java.util.ArrayList();
    public final java.util.ArrayList m = new java.util.ArrayList();
    public java.lang.String n = "";
    public final java.util.HashMap c = new java.util.HashMap();

    public b(com.fyber.inneractive.sdk.flow.vast.g gVar, com.fyber.inneractive.sdk.flow.vast.d dVar) {
        this.d = new java.util.PriorityQueue(1, gVar);
        this.h = dVar;
        this.g = new java.util.PriorityQueue(1, dVar);
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final java.util.List a(com.fyber.inneractive.sdk.model.vast.x xVar) {
        java.util.HashMap hashMap;
        if (xVar == null || (hashMap = this.c) == null) {
            return null;
        }
        return (java.util.List) hashMap.get(xVar);
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.x xVar, java.lang.String str) {
        java.util.List list = (java.util.List) this.c.get(xVar);
        if (list == null) {
            list = new java.util.ArrayList();
            this.c.put(xVar, list);
        }
        list.add(str);
    }
}
