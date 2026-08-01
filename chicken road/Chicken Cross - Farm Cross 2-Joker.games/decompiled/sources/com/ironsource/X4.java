package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
public final class X4 {

    /* renamed from: a, reason: collision with root package name */
    public static final X4 f8004a = new X4();

    private X4() {
    }

    private final int a(Context context, int i) {
        return MathKt.roundToInt(i / context.getResources().getDisplayMetrics().density);
    }

    public final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
