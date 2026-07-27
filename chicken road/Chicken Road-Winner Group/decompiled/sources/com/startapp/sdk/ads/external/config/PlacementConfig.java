package com.startapp.sdk.ads.external.config;

import com.startapp.sdk.internal.he;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class PlacementConfig implements Serializable {
    public static final he Companion = new he();
    public static final int DELEGATION_BY_CHANCE = 1;
    public static final int FALLBACK_DELEGATION = 2;
    private static final long serialVersionUID = 6500975630965743999L;
    private int options;
    private double ratio;

    public boolean equals(Object obj) {
        int i3;
        int i4;
        if (this == obj) {
            return true;
        }
        if (obj != null && r.a(PlacementConfig.class).equals(r.a(obj.getClass()))) {
            PlacementConfig placementConfig = (PlacementConfig) obj;
            if (Double.compare(this.ratio, placementConfig.ratio) == 0 && (i3 = this.options) >= (i4 = placementConfig.options) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public final int getOptions() {
        return this.options;
    }

    public final double getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        Object[] objArr = {Double.valueOf(this.ratio), Integer.valueOf(this.options)};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean isFallbackActive() {
        return (this.options & 2) == 2;
    }

    public final void setOptions(int i3) {
        this.options = i3;
    }

    public final void setRatio(double d3) {
        this.ratio = d3;
    }
}
