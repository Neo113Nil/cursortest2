package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Je {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f4780a;
    public final android.widget.ImageView b;
    public final com.inmobi.media.ads.nativeAd.MediaView c;
    public final java.util.List d;
    public final com.inmobi.media.Ne e;

    public Je(android.view.ViewGroup parentView, android.widget.ImageView imageView, com.inmobi.media.ads.nativeAd.MediaView mediaView, java.util.List friendlyViews, com.inmobi.media.Ne nativeVisibilitySpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentView, "parentView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeVisibilitySpec, "nativeVisibilitySpec");
        this.f4780a = parentView;
        this.b = imageView;
        this.c = mediaView;
        this.d = friendlyViews;
        this.e = nativeVisibilitySpec;
    }
}
