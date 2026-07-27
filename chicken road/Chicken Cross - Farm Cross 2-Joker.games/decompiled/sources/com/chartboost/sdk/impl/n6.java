package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes4.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final n6 f4889a = new n6();

    public final int a(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float a2 = a(context);
        if (a2 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(i / a2);
    }

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
