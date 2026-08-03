package com.vungle.ads.internal.ui.view;

/* compiled from: BaseContentView.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0015\u001a\u00020\u0016H\u0010¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/vungle/ads/internal/ui/view/BaseContentView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "internal", "Lcom/vungle/ads/internal/NativeAdInternal;", "(Landroid/content/Context;Lcom/vungle/ads/internal/NativeAdInternal;)V", "imageView", "Landroid/widget/ImageView;", "getImageView$vungle_ads_release", "()Landroid/widget/ImageView;", "setImageView$vungle_ads_release", "(Landroid/widget/ImageView;)V", "getInternal", "()Lcom/vungle/ads/internal/NativeAdInternal;", "nativeVideoListener", "Lcom/vungle/ads/nativead/NativeVideoListener;", "getNativeVideoListener", "()Lcom/vungle/ads/nativead/NativeVideoListener;", "setNativeVideoListener", "(Lcom/vungle/ads/nativead/NativeVideoListener;)V", "destroy", "", "destroy$vungle_ads_release", "render", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public class BaseContentView extends android.widget.RelativeLayout {
    private android.widget.ImageView imageView;
    private final com.vungle.ads.internal.NativeAdInternal internal;
    private com.vungle.ads.nativead.NativeVideoListener nativeVideoListener;

    public final com.vungle.ads.internal.NativeAdInternal getInternal() {
        return this.internal;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentView(android.content.Context context, com.vungle.ads.internal.NativeAdInternal internal) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internal, "internal");
        this.internal = internal;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.imageView = imageView;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    /* renamed from: getImageView$vungle_ads_release, reason: from getter */
    public final android.widget.ImageView getImageView() {
        return this.imageView;
    }

    public final void setImageView$vungle_ads_release(android.widget.ImageView imageView) {
        this.imageView = imageView;
    }

    public final com.vungle.ads.nativead.NativeVideoListener getNativeVideoListener() {
        return this.nativeVideoListener;
    }

    public final void setNativeVideoListener(com.vungle.ads.nativead.NativeVideoListener nativeVideoListener) {
        this.nativeVideoListener = nativeVideoListener;
    }

    public void render(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.widget.ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.internal.displayMainImage(this.imageView);
        requestLayout();
    }

    public void destroy$vungle_ads_release() {
        removeAllViews();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.ui.view.BaseContentView baseContentView = this;
            android.widget.ImageView imageView = this.imageView;
            android.graphics.drawable.Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        android.widget.ImageView imageView2 = this.imageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }
}
