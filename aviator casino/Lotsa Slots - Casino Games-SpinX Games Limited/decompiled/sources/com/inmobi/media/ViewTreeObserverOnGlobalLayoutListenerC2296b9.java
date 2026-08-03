package com.inmobi.media;

/* renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2296b9 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.ads.InMobiBanner f5119a;

    public ViewTreeObserverOnGlobalLayoutListenerC2296b9(com.inmobi.ads.InMobiBanner inMobiBanner) {
        this.f5119a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.inmobi.media.C2799u9 c2799u9;
        try {
            this.f5119a.i = com.inmobi.media.J3.b(r0.getMeasuredWidth() / com.inmobi.media.N5.b());
            this.f5119a.j = com.inmobi.media.J3.b(r0.getMeasuredHeight() / com.inmobi.media.N5.b());
            if (com.inmobi.ads.InMobiBanner.access$hasValidSize(this.f5119a)) {
                this.f5119a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2368e2 mAdManager = this.f5119a.getMAdManager();
            if (mAdManager == null || (c2799u9 = mAdManager.f) == null) {
                return;
            }
            java.lang.String access$getTAG$cp = com.inmobi.ads.InMobiBanner.access$getTAG$cp();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            c2799u9.a(access$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e);
        }
    }
}
