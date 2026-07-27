package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w5 implements c6 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5053a;

    public w5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5053a = context.getResources().getDisplayMetrics().density;
    }

    @Override // com.chartboost.sdk.impl.c6
    public int a(int i) {
        return (int) (i * this.f5053a);
    }

    @Override // com.chartboost.sdk.impl.c6
    public int a(double d) {
        return (int) (d * this.f5053a);
    }
}
