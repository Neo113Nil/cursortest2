package com.razorpay;

import java.util.function.BiFunction;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(Integer.sum(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
    }
}
