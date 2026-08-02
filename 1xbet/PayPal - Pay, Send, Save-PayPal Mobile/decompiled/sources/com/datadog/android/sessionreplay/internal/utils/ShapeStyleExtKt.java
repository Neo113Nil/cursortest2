package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;", "", "hasNonTranslucentColor", "(Lcom/datadog/android/sessionreplay/model/MobileSegment$ShapeStyle;)Z", "isFullyOpaque"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShapeStyleExtKt {
    public static final boolean hasNonTranslucentColor(com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle) {
        java.lang.String str;
        java.lang.String takeLast;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shapeStyle, "");
        java.lang.String backgroundColor = shapeStyle.getBackgroundColor();
        if (backgroundColor == null || (takeLast = kotlin.text.StringsKt.takeLast(backgroundColor, 2)) == null) {
            str = null;
        } else {
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            str = takeLast.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "ff");
    }

    public static final boolean isFullyOpaque(com.datadog.android.sessionreplay.model.MobileSegment.ShapeStyle shapeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shapeStyle, "");
        java.lang.Number opacity = shapeStyle.getOpacity();
        return (opacity != null ? opacity.floatValue() : 1.0f) >= 1.0f;
    }
}
