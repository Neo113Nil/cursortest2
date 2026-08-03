package com.vungle.ads.internal.ui;

/* compiled from: WatermarkView.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ui/WatermarkView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "watermark", "", "(Landroid/content/Context;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public class WatermarkView extends android.widget.ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkView(android.content.Context context, java.lang.String watermark) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        byte[] overlayBytes = android.util.Base64.decode(watermark, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overlayBytes, "overlayBytes");
        android.graphics.Bitmap overlayBm = android.graphics.BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overlayBm, "overlayBm");
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, overlayBm);
        bitmapDrawable.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        setBackground(bitmapDrawable);
        setClickable(false);
        setFocusable(false);
    }
}
