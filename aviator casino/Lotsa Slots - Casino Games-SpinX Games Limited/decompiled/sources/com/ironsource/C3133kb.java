package com.ironsource;

/* renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3133kb extends android.widget.FrameLayout implements com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder f6345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3133kb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6345a = new com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder();
    }

    public final void a(com.ironsource.C3080hb nativeAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        java.util.List<android.view.View> a2 = a(this);
        removeAllViews();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        a(frameLayout, a2);
        com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder f = nativeAd.f();
        if (f != null) {
            f.setBodyView(this.f6345a.getBodyView());
            f.setMediaView(this.f6345a.getMediaView());
            f.setCallToActionView(this.f6345a.getCallToActionView());
            f.setTitleView(this.f6345a.getTitleView());
            f.setIconView(this.f6345a.getIconView());
            f.setAdvertiserView(this.f6345a.getAdvertiserView());
            f.setNativeAdView(frameLayout);
            addView(f.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(android.view.View view) {
        this.f6345a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(android.view.View view) {
        this.f6345a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(android.view.View view) {
        this.f6345a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(android.view.View view) {
        this.f6345a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView levelPlayMediaView) {
        this.f6345a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(android.view.View view) {
        this.f6345a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3133kb(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6345a = new com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder();
    }

    private final void a(android.view.ViewGroup viewGroup, java.util.List<? extends android.view.View> list) {
        java.util.Iterator<? extends android.view.View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
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
