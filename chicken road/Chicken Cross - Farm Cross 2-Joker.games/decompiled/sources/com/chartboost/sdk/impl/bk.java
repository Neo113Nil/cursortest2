package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    public final String f4697a;
    public final List b;

    public bk(String str, List clickTracking) {
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        this.f4697a = str;
        this.b = clickTracking;
    }

    public final String a() {
        return this.f4697a;
    }

    public final List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return Intrinsics.areEqual(this.f4697a, bkVar.f4697a) && Intrinsics.areEqual(this.b, bkVar.b);
    }

    public int hashCode() {
        String str = this.f4697a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "VideoClicks(clickThrough=" + this.f4697a + ", clickTracking=" + this.b + ")";
    }
}
