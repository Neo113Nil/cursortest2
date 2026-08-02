package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Landroidx/compose/ui/graphics/Color;", "toColor", "(Ljava/lang/String;)J", "", "Landroid/content/Context;", "context", "toHexString", "(ILandroid/content/Context;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreedsExtensionsKt {
    public static final java.lang.String toHexString(int i, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String format = java.lang.String.format("#%06X", java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(context, i) & 16777215));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static final long toColor(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(str));
    }
}
