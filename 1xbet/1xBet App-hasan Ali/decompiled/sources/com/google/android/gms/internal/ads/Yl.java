package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Yl extends L2.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0767am f12356e;

    public Yl(BinderC0767am binderC0767am, String str, String str2) {
        this.f12354c = str;
        this.f12355d = str2;
        this.f12356e = binderC0767am;
    }

    @Override // J2.u
    public final void b(J2.m mVar) {
        this.f12356e.z3(BinderC0767am.y3(mVar), this.f12355d);
    }

    @Override // J2.u
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        String str = this.f12354c;
        String str2 = this.f12355d;
        this.f12356e.u3(str, (V2.a) obj, str2);
    }
}
