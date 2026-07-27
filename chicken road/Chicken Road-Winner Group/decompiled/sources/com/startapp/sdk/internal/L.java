package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk f3427b;

    public /* synthetic */ L(yk ykVar, int i3) {
        this.f3426a = i3;
        this.f3427b = ykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3426a) {
            case 0:
                yk.a(this.f3427b);
                break;
            case 1:
                this.f3427b.f();
                break;
            case 2:
                yk.d(this.f3427b);
                break;
            case 3:
                this.f3427b.f();
                break;
            case 4:
                yk.g(this.f3427b);
                break;
            default:
                this.f3427b.d();
                break;
        }
    }
}
