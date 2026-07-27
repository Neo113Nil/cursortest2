package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class og {

    /* renamed from: a, reason: collision with root package name */
    public final AdPreferences.Placement f4169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4170b;

    public og(AdPreferences.Placement placement) {
        this.f4169a = placement;
        this.f4170b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && og.class == obj.getClass()) {
            og ogVar = (og) obj;
            if (this.f4170b == ogVar.f4170b && this.f4169a == ogVar.f4169a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f4169a, Integer.valueOf(this.f4170b)};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    public og(AdPreferences.Placement placement, int i3) {
        this.f4169a = placement;
        this.f4170b = i3;
    }
}
