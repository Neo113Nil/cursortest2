package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/ImageTypeResolver;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "density", "", "isDrawablePII", "(Landroid/graphics/drawable/Drawable;F)Z", "", "width", "height", "isPIIByDimensions", "(II)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageTypeResolver {
    public final boolean isPIIByDimensions(int width, int height) {
        return width >= 100 || height >= 100;
    }

    public final boolean isDrawablePII(android.graphics.drawable.Drawable drawable, float density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        return !(drawable instanceof android.graphics.drawable.GradientDrawable) && isPIIByDimensions(com.datadog.android.internal.utils.IntExtKt.densityNormalized(drawable.getIntrinsicWidth(), density), com.datadog.android.internal.utils.IntExtKt.densityNormalized(drawable.getIntrinsicHeight(), density));
    }
}
