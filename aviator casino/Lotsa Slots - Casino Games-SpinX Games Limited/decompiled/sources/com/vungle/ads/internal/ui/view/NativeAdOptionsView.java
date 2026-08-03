package com.vungle.ads.internal.ui.view;

/* compiled from: NativeAdOptionsView.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\r\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00012\b\b\u0001\u0010\u0016\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/internal/ui/view/NativeAdOptionsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "destroyed", "", "icon", "Landroid/widget/ImageView;", "destroy", "", "getPrivacyIcon", "getPrivacyIcon$vungle_ads_release", "initView", "renderTo", "rootView", "optionsPosition", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class NativeAdOptionsView extends android.widget.FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    private boolean destroyed;
    private android.widget.ImageView icon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    private final void initView(android.content.Context context) {
        this.icon = new android.widget.ImageView(context);
        int dpToPixels = com.vungle.ads.internal.util.ViewUtility.INSTANCE.dpToPixels(context, 20);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        android.widget.ImageView imageView = this.icon;
        android.widget.ImageView imageView2 = null;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        android.widget.ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView2 = imageView3;
        }
        addView(imageView2);
    }

    public final android.widget.ImageView getPrivacyIcon$vungle_ads_release() {
        android.widget.ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("icon");
        return null;
    }

    public final void renderTo(android.widget.FrameLayout rootView, @com.vungle.ads.NativeAd.AdOptionsPosition int optionsPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (getParent() != null) {
            android.view.ViewParent parent = getParent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        com.vungle.ads.internal.util.ViewUtility viewUtility = com.vungle.ads.internal.util.ViewUtility.INSTANCE;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        int dpToPixels = viewUtility.dpToPixels(context, 20);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dpToPixels, dpToPixels);
        if (optionsPosition == 0) {
            layoutParams.gravity = 8388659;
        } else if (optionsPosition == 1) {
            layoutParams.gravity = 8388661;
        } else if (optionsPosition == 2) {
            layoutParams.gravity = 8388691;
        } else if (optionsPosition == 3) {
            layoutParams.gravity = 8388693;
        } else {
            layoutParams.gravity = 8388661;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    public final void destroy() {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        try {
            android.widget.ImageView imageView = this.icon;
            if (imageView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("icon");
                imageView = null;
            }
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w("NativeAd", "error msg: " + e.getLocalizedMessage());
        }
        android.widget.ImageView imageView2 = this.icon;
        if (imageView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        removeAllViews();
        if (getParent() != null) {
            android.view.ViewParent parent = getParent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(this);
        }
    }
}
