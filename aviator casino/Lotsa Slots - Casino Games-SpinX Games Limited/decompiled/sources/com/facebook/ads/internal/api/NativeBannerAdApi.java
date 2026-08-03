package com.facebook.ads.internal.api;

/* loaded from: classes2.dex */
public interface NativeBannerAdApi {
    void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView);

    void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView, java.util.List<android.view.View> list);

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView);

    void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> list);
}
