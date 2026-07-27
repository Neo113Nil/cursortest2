package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class n4 {
    public static final Context a() {
        Context applicationContext = b4.b.a().getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static final va b() {
        return b4.b.b().v();
    }
}
