package com.inmobi.ads;

/* loaded from: classes5.dex */
public final class e implements com.inmobi.ads.PreloadManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2718ra f4588a;
    public final /* synthetic */ com.inmobi.ads.InMobiInterstitial b;

    public e(com.inmobi.ads.InMobiInterstitial inMobiInterstitial) {
        this.b = inMobiInterstitial;
        this.f4588a = new com.inmobi.media.C2718ra(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.b.getMAdManager$media_release().i();
        } catch (java.lang.IllegalStateException e) {
            java.lang.String access$getTAG$cp = com.inmobi.ads.InMobiInterstitial.access$getTAG$cp();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            com.inmobi.media.Sb.a((byte) 1, access$getTAG$cp, e.getMessage());
            this.b.getMPubListener$media_release().a(this.b, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        com.inmobi.media.Sg sg;
        com.inmobi.media.Sg sg2;
        android.content.Context context;
        this.b.b = true;
        sg = this.b.d;
        sg.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Preload", "<set-?>");
        sg.g = "Preload";
        com.inmobi.media.C2744sa mAdManager$media_release = this.b.getMAdManager$media_release();
        sg2 = this.b.d;
        context = this.b.f4582a;
        if (context == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(sg2, context, true, "intHtml");
        this.b.getMAdManager$media_release().b(this.f4588a);
    }
}
