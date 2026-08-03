package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public interface NativeAdContent {

    public static class ViewTag {
        public static final java.lang.String AD_DESCRIPTION = "DESCRIPTION";
        public static final java.lang.String AD_ICON = "ICON";
        public static final java.lang.String AD_TITLE = "TITLE";
        public static final java.lang.String CTA = "CTA";
        public static final java.lang.String MEDIA_VIEW = "MEDIA_VIEW";
        public static final java.lang.String OTHER = "OTHER";
        public static final java.lang.String RATING = "RATING";
        public static final java.lang.String ROOT = "ROOT";
    }

    void bindMediaView(com.fyber.inneractive.sdk.external.MediaView mediaView);

    void destroy();

    java.lang.String getAdCallToAction();

    java.lang.String getAdDescription();

    java.lang.String getAdTitle();

    java.lang.String getAdvertiserName();

    android.net.Uri getAppIcon();

    java.lang.Float getMediaAspectRatio();

    com.fyber.inneractive.sdk.external.MediaView getMediaView();

    java.lang.String getPrice();

    java.lang.Float getRating();

    void registerViewsForInteraction(android.view.ViewGroup viewGroup, com.fyber.inneractive.sdk.external.MediaView mediaView, android.widget.ImageView imageView, java.util.Collection<android.view.View> collection);
}
