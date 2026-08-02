package com.google.android.gms.internal.ads;

import r.C2327e;

/* renamed from: com.google.android.gms.internal.ads.Og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0658Og implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10955k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0677Re f10956l;

    public /* synthetic */ RunnableC0658Og(InterfaceC0677Re interfaceC0677Re, int i) {
        this.f10955k = i;
        this.f10956l = interfaceC0677Re;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10955k) {
            case 0:
                this.f10956l.onResume();
                break;
            case 1:
                this.f10956l.onPause();
                break;
            case 2:
                this.f10956l.destroy();
                break;
            case 3:
                this.f10956l.a("onSdkImpression", new C2327e(0));
                break;
            case 4:
                this.f10956l.destroy();
                break;
            default:
                this.f10956l.t0();
                break;
        }
    }
}
