package com.inmobi.ads;

/* loaded from: classes5.dex */
public final class d implements com.inmobi.ads.PreloadManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2315c2 f4587a;
    public final /* synthetic */ com.inmobi.ads.InMobiBanner b;

    public d(com.inmobi.ads.InMobiBanner inMobiBanner) {
        this.b = inMobiBanner;
        this.f4587a = new com.inmobi.media.C2315c2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            com.inmobi.media.C2368e2 mAdManager = this.b.getMAdManager();
            if (mAdManager != null) {
                mAdManager.o();
            }
        } catch (java.lang.IllegalStateException e) {
            java.lang.String access$getTAG$cp = com.inmobi.ads.InMobiBanner.access$getTAG$cp();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            com.inmobi.media.Sb.a((byte) 1, access$getTAG$cp, e.getMessage());
            com.inmobi.media.Y1 mPubListener = this.b.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(this.b, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.b.setEnableAutoRefresh(false);
        this.b.a((com.inmobi.ads.controllers.PublisherCallbacks) this.f4587a, "Preload", false);
    }
}
