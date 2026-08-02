package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Zl extends J2.u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12516e;
    public final /* synthetic */ BinderC0767am f;

    public /* synthetic */ Zl(BinderC0767am binderC0767am, String str, String str2, int i) {
        this.f12514c = i;
        this.f12515d = str;
        this.f12516e = str2;
        this.f = binderC0767am;
    }

    @Override // J2.u
    public final void b(J2.m mVar) {
        switch (this.f12514c) {
            case 0:
                this.f.z3(BinderC0767am.y3(mVar), this.f12516e);
                break;
            default:
                this.f.z3(BinderC0767am.y3(mVar), this.f12516e);
                break;
        }
    }

    @Override // J2.u
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        switch (this.f12514c) {
            case 0:
                this.f.u3(this.f12515d, (C0675Rc) obj, this.f12516e);
                break;
            default:
                this.f.u3(this.f12515d, (C0717Xc) obj, this.f12516e);
                break;
        }
    }
}
