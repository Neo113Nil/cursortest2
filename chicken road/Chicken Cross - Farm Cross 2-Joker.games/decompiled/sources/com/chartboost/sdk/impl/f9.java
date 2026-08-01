package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4768a;
    public final List b;
    public final List c;

    public f9(String str, List iconClickTracking, List iconClickFallbackImages) {
        Intrinsics.checkNotNullParameter(iconClickTracking, "iconClickTracking");
        Intrinsics.checkNotNullParameter(iconClickFallbackImages, "iconClickFallbackImages");
        this.f4768a = str;
        this.b = iconClickTracking;
        this.c = iconClickFallbackImages;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return Intrinsics.areEqual(this.f4768a, f9Var.f4768a) && Intrinsics.areEqual(this.b, f9Var.b) && Intrinsics.areEqual(this.c, f9Var.c);
    }

    public int hashCode() {
        String str = this.f4768a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "IconClicks(iconClickThrough=" + this.f4768a + ", iconClickTracking=" + this.b + ", iconClickFallbackImages=" + this.c + ")";
    }
}
