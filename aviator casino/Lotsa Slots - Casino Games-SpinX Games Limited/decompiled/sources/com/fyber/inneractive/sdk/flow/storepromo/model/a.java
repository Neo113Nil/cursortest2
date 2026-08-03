package com.fyber.inneractive.sdk.flow.storepromo.model;

/* loaded from: classes3.dex */
public final class a implements java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.b f3749a;
    public final java.lang.String b;
    public final int c;

    public a(java.lang.String str, com.fyber.inneractive.sdk.flow.storepromo.model.b bVar) {
        this.b = str;
        this.f3749a = bVar;
        this.c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.c - ((com.fyber.inneractive.sdk.flow.storepromo.model.a) obj).c;
    }

    public a(java.lang.String str, com.fyber.inneractive.sdk.flow.storepromo.model.b bVar, int i) {
        this.b = str;
        this.f3749a = bVar;
        this.c = i;
    }
}
