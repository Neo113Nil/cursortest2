package com.startapp.sdk.internal;

import android.graphics.Rect;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;

/* loaded from: classes.dex */
public final class jk {

    /* renamed from: a, reason: collision with root package name */
    public final float f3934a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3935b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect[] f3936c;

    /* renamed from: d, reason: collision with root package name */
    public final NotDisplayedReason f3937d;

    public jk() {
    }

    public jk(NotDisplayedReason notDisplayedReason, float f, Rect rect, Rect[] rectArr) {
        this.f3934a = f;
        this.f3935b = rect;
        this.f3936c = rectArr;
        this.f3937d = notDisplayedReason;
    }
}
