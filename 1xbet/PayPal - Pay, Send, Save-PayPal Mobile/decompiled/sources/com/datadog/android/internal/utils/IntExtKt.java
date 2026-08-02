package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "density", "densityNormalized", "(IF)I"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntExtKt {
    public static final int densityNormalized(int i, float f) {
        return f == 0.0f ? i : (int) (i / f);
    }
}
