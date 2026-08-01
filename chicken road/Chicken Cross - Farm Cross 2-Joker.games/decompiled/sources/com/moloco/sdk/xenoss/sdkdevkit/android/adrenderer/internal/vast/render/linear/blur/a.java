package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur;

import kotlin.ranges.RangesKt;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11511a = new a();
    public static final int b = 0;

    public final float a(int i, int i2, int i3, int i4) {
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0) {
            return 0.0f;
        }
        float f = i3;
        float f2 = i;
        float f3 = i4;
        float f4 = i2;
        float min = Math.min(f / f2, f3 / f4);
        return RangesKt.coerceIn(1.0f - (((f2 * min) * (f4 * min)) / (f * f3)), 0.0f, 1.0f);
    }
}
