package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "resolveClassName", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawableExtKt {
    public static final java.lang.String resolveClassName(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        java.lang.String canonicalName = drawable.getClass().getCanonicalName();
        return canonicalName == null ? drawable.getClass().getSimpleName() : canonicalName;
    }
}
