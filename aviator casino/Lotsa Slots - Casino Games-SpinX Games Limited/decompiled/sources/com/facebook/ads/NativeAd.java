package com.facebook.ads;

/* loaded from: classes2.dex */
public class NativeAd extends com.facebook.ads.NativeAdBase {
    private com.facebook.ads.internal.api.NativeAdApi mNativeAdApi;
    private com.facebook.ads.NativeAd.NativeOptions mNativeOptions;

    public enum AdCreativeType {
        IMAGE,
        VIDEO,
        CAROUSEL,
        UNKNOWN
    }

    public NativeAd(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(android.content.Context context, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase) {
        super(context, nativeAdBase);
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public NativeAd(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAd.NativeOptions nativeOptions) {
        super(context, nativeAdBase);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public NativeAd(android.content.Context context, java.lang.String str, com.facebook.ads.NativeAd.NativeOptions nativeOptions) {
        super(context, str);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(android.content.Context context, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi, com.facebook.ads.NativeAd.NativeOptions nativeOptions) {
        super(nativeAdBaseApi);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public com.facebook.ads.NativeAd.NativeOptions getNativeOptions() {
        return this.mNativeOptions;
    }

    public com.facebook.ads.internal.api.NativeAdApi getNativeAdApi() {
        return this.mNativeAdApi;
    }

    @java.lang.Deprecated
    com.facebook.ads.VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return this.mNativeAdApi.getVideoAutoplayBehavior();
    }

    public com.facebook.ads.NativeAd.AdCreativeType getAdCreativeType() {
        return this.mNativeAdApi.getAdCreativeType();
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2, list);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView);
    }

    public void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView, java.util.List<android.view.View> list) {
        com.facebook.ads.internal.util.common.Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView, list);
    }

    public static class NativeOptions {
        private java.lang.Boolean mDisableFullScreen = null;
        private java.lang.Boolean mHideMediaControls = null;
        private java.lang.Boolean mUnMuteVolume = null;

        public com.facebook.ads.NativeAd.NativeOptions setDisableFullScreen(java.lang.Boolean bool) {
            this.mDisableFullScreen = bool;
            return this;
        }

        public com.facebook.ads.NativeAd.NativeOptions setHideMediaControls(java.lang.Boolean bool) {
            this.mHideMediaControls = bool;
            return this;
        }

        public com.facebook.ads.NativeAd.NativeOptions setUnMuteVolume(java.lang.Boolean bool) {
            this.mUnMuteVolume = bool;
            return this;
        }

        public java.lang.Boolean getDisableFullScreen() {
            return this.mDisableFullScreen;
        }

        public java.lang.Boolean getHideMediaControls() {
            return this.mHideMediaControls;
        }

        public java.lang.Boolean getUnMuteVolume() {
            return this.mUnMuteVolume;
        }
    }
}
