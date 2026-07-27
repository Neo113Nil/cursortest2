package com.startapp.sdk.ads.banner.banner3d;

import com.startapp.sdk.ads.banner.BannerBase;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f2904a;

    public a(Banner3D banner3D) {
        this.f2904a = banner3D;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z3;
        Banner3D banner3D = this.f2904a;
        if (!banner3D.loaded || banner3D.faces.size() == 0) {
            return;
        }
        Banner3D banner3D2 = this.f2904a;
        if (banner3D2.visible && banner3D2.isShown()) {
            z3 = ((BannerBase) this.f2904a).drawn;
            if (z3) {
                Banner3D banner3D3 = this.f2904a;
                this.f2904a.makeImpression(banner3D3.faces.get(banner3D3.getCurrentBannerIndex()));
                Banner3D banner3D4 = this.f2904a;
                if (!banner3D4.addedDisplayEvent) {
                    banner3D4.addedDisplayEvent = true;
                    banner3D4.addDisplayEventOnLoad();
                }
            }
        }
        Banner3D banner3D5 = this.f2904a;
        if (banner3D5.rotationEnabled) {
            int m3 = banner3D5.getBannerOptions().m();
            banner3D5.rotate(m3 * (!this.f2904a.firstRotationFinished ? r3.options.k() : 1));
        }
        if (this.f2904a.rotation > 90 - r0.getBannerOptions().m()) {
            if (this.f2904a.rotation < r0.getBannerOptions().m() + 90) {
                Banner3D banner3D6 = this.f2904a;
                if (!banner3D6.firstRotation) {
                    if (banner3D6.attachedToWindow) {
                        banner3D6.postDelayed(this, banner3D6.getBannerOptions().b());
                    }
                    this.f2904a.rotating = false;
                    if (this.f2904a.getNextBannerIndex() != 0) {
                        this.f2904a.firstRotation = false;
                        return;
                    }
                    return;
                }
            }
        }
        this.f2904a.postDelayed(this, r0.getBannerOptions().n());
        this.f2904a.rotating = true;
        if (this.f2904a.getNextBannerIndex() != 0) {
        }
    }
}
