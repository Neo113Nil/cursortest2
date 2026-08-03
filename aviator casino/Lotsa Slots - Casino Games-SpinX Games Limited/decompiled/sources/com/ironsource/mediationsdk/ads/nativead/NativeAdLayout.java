package com.ironsource.mediationsdk.ads.nativead;

/* loaded from: classes5.dex */
public final class NativeAdLayout extends android.widget.FrameLayout implements com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder f6401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6401a = new com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder();
    }

    private final void a(android.view.ViewGroup viewGroup, java.util.List<? extends android.view.View> list) {
        java.util.Iterator<? extends android.view.View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    public final void registerNativeAdViews(com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd nativeAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        java.util.List<android.view.View> a2 = a(this);
        removeAllViews();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        a(frameLayout, a2);
        com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder = nativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.f6401a.getBodyView());
            nativeAdViewBinder.setMediaView(this.f6401a.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.f6401a.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.f6401a.getTitleView());
            nativeAdViewBinder.setIconView(this.f6401a.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.f6401a.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(android.view.View view) {
        this.f6401a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(android.view.View view) {
        this.f6401a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(android.view.View view) {
        this.f6401a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(android.view.View view) {
        this.f6401a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView levelPlayMediaView) {
        this.f6401a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(android.view.View view) {
        this.f6401a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6401a = new com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder();
    }

    private final java.util.List<android.view.View> a(android.view.ViewGroup viewGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View child = viewGroup.getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
