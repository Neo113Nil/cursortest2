package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4148v1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7426a;
    public final C4175w1 b;

    public C4148v1(Map map, C4175w1 c4175w1) {
        this.f7426a = map;
        this.b = c4175w1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4148v1)) {
            return false;
        }
        C4148v1 c4148v1 = (C4148v1) obj;
        return Intrinsics.areEqual(this.f7426a, c4148v1.f7426a) && Intrinsics.areEqual(this.b, c4148v1.b);
    }

    public final int hashCode() {
        Map map = this.f7426a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        C4175w1 c4175w1 = this.b;
        return hashCode + (c4175w1 != null ? c4175w1.hashCode() : 0);
    }

    public final String toString() {
        return "BannerLoadResolution(extras=" + this.f7426a + ", adaptiveSize=" + this.b + ")";
    }
}
