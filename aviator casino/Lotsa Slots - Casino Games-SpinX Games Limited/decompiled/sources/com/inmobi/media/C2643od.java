package com.inmobi.media;

/* renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2643od implements com.inmobi.media.InterfaceC2418fo {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2285ao f5373a;
    public final com.inmobi.media.Je b;

    public C2643od(com.inmobi.media.C2285ao viewableConfig, com.inmobi.media.Je nativeViewabilityViewHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f5373a = viewableConfig;
        this.b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (com.inmobi.media.AbstractC2600mo.a(r3, r2.c) != false) goto L28;
     */
    @Override // com.inmobi.media.InterfaceC2418fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.inmobi.media.EnumC2391eo a() {
        android.view.ViewGroup viewGroup = this.b.f4780a;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return com.inmobi.media.EnumC2391eo.f5188a;
        }
        com.inmobi.media.Je je = this.b;
        com.inmobi.media.Ne ne = je.e;
        if (ne.b.f4862a || ne.f4856a.f4862a) {
            com.inmobi.media.Nn nn = ne.f4856a;
            android.widget.ImageView imageView = je.b;
            if (!nn.f4862a || imageView == null || !nn.b || !com.inmobi.media.AbstractC2600mo.a(imageView, nn.c)) {
                com.inmobi.media.Nn nn2 = ne.b;
                com.inmobi.media.ads.nativeAd.MediaView mediaView = this.b.c;
                if (nn2.f4862a) {
                    if (mediaView != null) {
                        if (nn2.b) {
                        }
                    }
                }
                return com.inmobi.media.EnumC2391eo.f5188a;
            }
        }
        com.inmobi.media.C2285ao c2285ao = this.f5373a;
        if (com.inmobi.media.AbstractC2600mo.a(viewGroup, rect, c2285ao.f5110a, c2285ao.b) && com.inmobi.media.AbstractC2600mo.a(viewGroup, rect, this.f5373a.f5110a, this.b.d)) {
            return com.inmobi.media.EnumC2391eo.b;
        }
        return com.inmobi.media.EnumC2391eo.f5188a;
    }
}
