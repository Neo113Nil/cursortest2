package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class o6 {
    public static final int a(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }
}
