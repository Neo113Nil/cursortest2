package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Xl extends J2.d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f12231k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J2.j f12232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f12233m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BinderC0767am f12234n;

    public Xl(BinderC0767am binderC0767am, String str, J2.j jVar, String str2) {
        this.f12231k = str;
        this.f12232l = jVar;
        this.f12233m = str2;
        this.f12234n = binderC0767am;
    }

    @Override // J2.d
    public final void b(J2.m mVar) {
        this.f12234n.z3(BinderC0767am.y3(mVar), this.f12233m);
    }

    @Override // J2.d
    public final void i() {
        this.f12234n.u3(this.f12231k, this.f12232l, this.f12233m);
    }
}
