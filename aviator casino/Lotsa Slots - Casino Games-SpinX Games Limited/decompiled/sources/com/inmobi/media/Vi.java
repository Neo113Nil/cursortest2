package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vi extends com.inmobi.media.AbstractC2792u2 {
    public final java.lang.ref.WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vi(android.view.View adView, com.inmobi.media.core.config.models.AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.b = new java.lang.ref.WeakReference(adView);
    }

    @Override // com.inmobi.media.M0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final android.graphics.Bitmap a() {
        java.lang.System.currentTimeMillis();
        android.view.View adView = (android.view.View) this.b.get();
        if (adView == null) {
            java.lang.System.currentTimeMillis();
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(adView.getMeasuredWidth(), adView.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable background = adView.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        adView.draw(canvas);
        if (createBitmap == null) {
            return null;
        }
        java.lang.System.currentTimeMillis();
        return a(createBitmap);
    }
}
