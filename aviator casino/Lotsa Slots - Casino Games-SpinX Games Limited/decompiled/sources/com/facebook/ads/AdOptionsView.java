package com.facebook.ads;

/* loaded from: classes2.dex */
public class AdOptionsView extends com.facebook.ads.internal.api.AdComponentFrameLayout {
    private final com.facebook.ads.internal.api.AdOptionsViewApi mAdOptionsViewApi;

    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public AdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout) {
        super(context);
        com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }

    public AdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation orientation, int i) {
        super(context);
        com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, orientation, i, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }

    public void setIconColor(int i) {
        this.mAdOptionsViewApi.setIconColor(i);
    }

    public void setIconSizeDp(int i) {
        this.mAdOptionsViewApi.setIconSizeDp(i);
    }

    public void setSingleIcon(boolean z) {
        this.mAdOptionsViewApi.setSingleIcon(z);
    }

    public void setOnAdClosedListener(com.facebook.ads.AdClosedListener adClosedListener) {
        this.mAdOptionsViewApi.setOnAdClosedListener(adClosedListener);
    }
}
