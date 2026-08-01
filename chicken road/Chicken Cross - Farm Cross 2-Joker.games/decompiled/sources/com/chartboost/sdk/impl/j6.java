package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4820a;
    public final q6 b;

    public j6(Context context, q6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.f4820a = context;
        this.b = displayMeasurement;
    }

    public final int a() {
        Integer b = k6.b(this.f4820a);
        Intrinsics.checkNotNullExpressionValue(b, "getOpenRTBDeviceType(...)");
        return b.intValue();
    }

    public final String b() {
        String d = k6.d(this.f4820a);
        Intrinsics.checkNotNullExpressionValue(d, "getType(...)");
        return d;
    }

    public final boolean c() {
        return je.c(this.f4820a, this.b);
    }
}
