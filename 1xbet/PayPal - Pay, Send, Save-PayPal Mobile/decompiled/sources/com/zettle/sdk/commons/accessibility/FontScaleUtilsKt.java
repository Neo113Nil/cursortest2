package com.zettle.sdk.commons.accessibility;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "", "isFontScaleEnabled", "(Landroid/content/Context;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontScaleUtilsKt {
    public static final boolean isFontScaleEnabled(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getConfiguration().fontScale > 1.0f;
    }
}
