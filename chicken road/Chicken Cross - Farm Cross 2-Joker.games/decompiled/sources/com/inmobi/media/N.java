package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f6729a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public N(RectF visibleRect, ArrayList obstructions, int i, int i2) {
        Intrinsics.checkNotNullParameter(visibleRect, "visibleRect");
        Intrinsics.checkNotNullParameter(obstructions, "obstructions");
        this.f6729a = visibleRect;
        this.b = obstructions;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return Intrinsics.areEqual(this.f6729a, n.f6729a) && Intrinsics.areEqual(this.b, n.b) && this.c == n.c && this.d == n.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Hj.a(this.c, (this.b.hashCode() + (this.f6729a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.f6729a + ", obstructions=" + this.b + ", screenWidth=" + this.c + ", screenHeight=" + this.d + ")";
    }
}
