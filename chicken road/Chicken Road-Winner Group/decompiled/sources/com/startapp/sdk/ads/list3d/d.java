package com.startapp.sdk.ads.list3d;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f3011a;

    public d(List3DView list3DView) {
        this.f3011a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a3;
        List3DView list3DView = this.f3011a;
        if (list3DView.f2986b != 1 || (a3 = list3DView.a(list3DView.f2987c, list3DView.f2988d)) == -1) {
            return;
        }
        this.f3011a.a(a3);
    }
}
