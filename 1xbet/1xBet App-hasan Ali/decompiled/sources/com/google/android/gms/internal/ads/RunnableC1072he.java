package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1072he implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13765k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1117ie f13766l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f13767m;

    public /* synthetic */ RunnableC1072he(TextureViewSurfaceTextureListenerC1117ie textureViewSurfaceTextureListenerC1117ie, String str, int i) {
        this.f13765k = i;
        this.f13766l = textureViewSurfaceTextureListenerC1117ie;
        this.f13767m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13765k) {
            case 0:
                C0711Wd c0711Wd = this.f13766l.f13947p;
                if (c0711Wd != null) {
                    c0711Wd.c("exception", "what", "ExoPlayerAdapter exception", "extra", this.f13767m);
                    break;
                }
                break;
            default:
                C0711Wd c0711Wd2 = this.f13766l.f13947p;
                if (c0711Wd2 != null) {
                    c0711Wd2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f13767m);
                    break;
                }
                break;
        }
    }
}
