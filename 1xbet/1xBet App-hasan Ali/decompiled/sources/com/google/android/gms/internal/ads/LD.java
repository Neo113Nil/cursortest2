package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class LD implements ID {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10327c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile DD f10328a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10329b;

    public static ID a(DD dd) {
        if ((dd instanceof LD) || (dd instanceof CD)) {
            return dd;
        }
        LD ld = new LD();
        ld.f10329b = f10327c;
        ld.f10328a = dd;
        return ld;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        Object obj = this.f10329b;
        if (obj != f10327c) {
            return obj;
        }
        DD dd = this.f10328a;
        if (dd == null) {
            return this.f10329b;
        }
        Object d5 = dd.d();
        this.f10329b = d5;
        this.f10328a = null;
        return d5;
    }
}
