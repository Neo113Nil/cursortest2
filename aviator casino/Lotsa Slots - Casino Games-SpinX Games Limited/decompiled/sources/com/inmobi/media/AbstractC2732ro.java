package com.inmobi.media;

/* renamed from: com.inmobi.media.ro, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2732ro {
    public static final android.widget.FrameLayout a(android.content.Context context, byte[] watermarkBytes, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermarkBytes, "watermarkBytes");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(android.graphics.BitmapFactory.decodeByteArray(watermarkBytes, 0, watermarkBytes.length));
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(bitmapDrawable);
        frameLayout.setElevation(Float.MAX_VALUE);
        frameLayout.setAlpha(f);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        return frameLayout;
    }
}
