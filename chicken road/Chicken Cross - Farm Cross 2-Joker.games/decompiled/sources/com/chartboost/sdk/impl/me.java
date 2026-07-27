package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class me {

    /* renamed from: a, reason: collision with root package name */
    public static final me f4879a = new me();

    public final h2 a(Context context, p5 ctaConfig, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        h2 klVar = ctaConfig.b() != null ? new kl(context, null, 0, null, function0, 14, null) : new kd(context, null, 0, null, null, null, null, function0, 126, null);
        klVar.a(ctaConfig);
        return klVar;
    }
}
