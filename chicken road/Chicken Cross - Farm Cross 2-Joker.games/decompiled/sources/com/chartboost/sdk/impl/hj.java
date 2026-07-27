package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class hj extends Exception {
    public final Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(String message, Integer num) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.b = num;
    }

    public final Integer a() {
        return this.b;
    }
}
