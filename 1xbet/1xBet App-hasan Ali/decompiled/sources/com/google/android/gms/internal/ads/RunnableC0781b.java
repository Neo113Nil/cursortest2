package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0781b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12740k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1452q f12741l;

    public /* synthetic */ RunnableC0781b(C0825c c0825c, InterfaceC1452q interfaceC1452q, int i) {
        this.f12740k = i;
        this.f12741l = interfaceC1452q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12740k) {
            case 0:
                this.f12741l.d();
                break;
            case 1:
                this.f12741l.getClass();
                break;
            default:
                this.f12741l.mo10a();
                break;
        }
    }

    public /* synthetic */ RunnableC0781b(C0825c c0825c, InterfaceC1452q interfaceC1452q, C1519re c1519re) {
        this.f12740k = 1;
        this.f12741l = interfaceC1452q;
    }
}
