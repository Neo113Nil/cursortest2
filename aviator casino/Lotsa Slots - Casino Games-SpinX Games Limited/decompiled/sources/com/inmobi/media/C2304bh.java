package com.inmobi.media;

/* renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2304bh {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.nativeAd.InMobiNativeViewData f5125a;
    public final com.inmobi.media.ads.nativeAd.MediaView b;
    public final android.view.View c;

    public C2304bh(com.inmobi.media.ads.nativeAd.InMobiNativeViewData pubView, com.inmobi.media.ads.nativeAd.MediaView mediaView, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pubView, "pubView");
        this.f5125a = pubView;
        this.b = mediaView;
        this.c = view;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2304bh)) {
            return false;
        }
        com.inmobi.media.C2304bh c2304bh = (com.inmobi.media.C2304bh) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5125a, c2304bh.f5125a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2304bh.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2304bh.c);
    }

    public final int hashCode() {
        int hashCode = this.f5125a.hashCode() * 31;
        com.inmobi.media.ads.nativeAd.MediaView mediaView = this.b;
        int hashCode2 = (hashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        android.view.View view = this.c;
        return hashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PublisherNativeViewData(pubView=" + this.f5125a + ", mediaView=" + this.b + ", adChoice=" + this.c + ")";
    }
}
