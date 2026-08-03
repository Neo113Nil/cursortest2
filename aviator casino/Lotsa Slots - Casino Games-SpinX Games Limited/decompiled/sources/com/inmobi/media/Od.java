package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Od implements com.inmobi.media.InterfaceC2418fo {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2285ao f4876a;
    public final com.inmobi.media.Je b;

    public Od(com.inmobi.media.C2285ao viewableConfig, com.inmobi.media.Je nativeViewabilityViewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f4876a = viewableConfig;
        this.b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r2 == false) goto L29;
     */
    @Override // com.inmobi.media.InterfaceC2418fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.inmobi.media.EnumC2391eo a() {
        boolean a2;
        android.view.ViewGroup viewGroup = this.b.f4780a;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return com.inmobi.media.EnumC2391eo.f5188a;
        }
        com.inmobi.media.Je je = this.b;
        com.inmobi.media.Ne ne = je.e;
        com.inmobi.media.Nn nn = ne.b;
        if (nn.f4862a) {
            com.inmobi.media.ads.nativeAd.MediaView mediaView = je.c;
            if (mediaView != null && nn.b) {
                a2 = com.inmobi.media.AbstractC2600mo.a(mediaView, nn.c);
            }
            return com.inmobi.media.EnumC2391eo.f5188a;
        }
        com.inmobi.media.Nn nn2 = ne.f4856a;
        if (nn2.f4862a) {
            android.widget.ImageView imageView = je.b;
            if (imageView != null && nn2.b) {
                a2 = com.inmobi.media.AbstractC2600mo.a(imageView, nn2.c);
            }
            return com.inmobi.media.EnumC2391eo.f5188a;
        }
        com.inmobi.media.C2285ao c2285ao = this.f4876a;
        if (com.inmobi.media.AbstractC2600mo.a(viewGroup, rect, c2285ao.f5110a, c2285ao.b) && com.inmobi.media.AbstractC2600mo.a(viewGroup, rect, this.f4876a.f5110a, this.b.d)) {
            return com.inmobi.media.EnumC2391eo.b;
        }
        return com.inmobi.media.EnumC2391eo.f5188a;
    }
}
