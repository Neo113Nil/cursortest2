package com.ironsource;

/* loaded from: classes5.dex */
public final class Z4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Z4 f6111a = new com.ironsource.Z4();

    private Z4() {
    }

    private final int a(android.content.Context context, int i) {
        return kotlin.math.MathKt.roundToInt(i / context.getResources().getDisplayMetrics().density);
    }

    public final int b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
