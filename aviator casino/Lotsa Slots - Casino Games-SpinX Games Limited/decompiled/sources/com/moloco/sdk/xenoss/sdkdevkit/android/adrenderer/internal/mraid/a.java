package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a f7494a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a();
    public static final int b = 0;

    public final float a(android.content.Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final int b(float f, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (int) (a(f, context) + 0.5f);
    }

    public final float c(float f, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return f * a(context);
    }

    public final int d(float f, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (int) (c(f, context) + 0.5f);
    }

    public final float e(float f, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return f / a(context);
    }

    public final int f(float f, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (int) (e(f, context) + 0.5f);
    }

    public final float a(float f, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public final int b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return f(context.getResources().getDisplayMetrics().heightPixels, context);
    }

    public final int c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return f(context.getResources().getDisplayMetrics().widthPixels, context);
    }
}
