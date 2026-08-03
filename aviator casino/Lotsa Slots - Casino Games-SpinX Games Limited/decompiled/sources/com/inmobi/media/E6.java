package com.inmobi.media;

/* loaded from: classes5.dex */
public final class E6 extends com.inmobi.media.G6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.nativeAd.MediaView f4677a;
    public final com.inmobi.media.Bl b;

    public E6(com.inmobi.media.ads.nativeAd.MediaView mediaView, com.inmobi.media.Bl bl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f4677a = mediaView;
        this.b = bl;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.E6)) {
            return false;
        }
        com.inmobi.media.E6 e6 = (com.inmobi.media.E6) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f4677a, e6.f4677a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, e6.b);
    }

    public final int hashCode() {
        int hashCode = this.f4677a.hashCode() * 31;
        com.inmobi.media.Bl bl = this.b;
        return hashCode + (bl == null ? 0 : bl.hashCode());
    }

    public final java.lang.String toString() {
        return "Success(mediaView=" + this.f4677a + ", vastBeaconData=" + this.b + ")";
    }
}
