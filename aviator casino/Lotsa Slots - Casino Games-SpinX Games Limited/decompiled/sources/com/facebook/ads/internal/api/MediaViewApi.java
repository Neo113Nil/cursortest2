package com.facebook.ads.internal.api;

/* loaded from: classes2.dex */
public interface MediaViewApi extends com.facebook.ads.internal.api.AdComponentViewApiProvider {
    void destroy();

    android.view.View getAdContentsView();

    int getMediaHeight();

    int getMediaWidth();

    int getVideoDuration();

    void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams, com.facebook.ads.MediaView mediaView);

    boolean isVideoContent();

    void setListener(com.facebook.ads.MediaViewListener mediaViewListener);

    void setVideoRenderer(com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer);
}
