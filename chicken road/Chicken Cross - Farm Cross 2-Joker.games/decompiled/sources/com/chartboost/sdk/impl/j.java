package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u f4815a;
    public final Map b;

    public j(u adFormat, Map extras) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f4815a = adFormat;
        this.b = extras;
    }

    public final u a() {
        return this.f4815a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f4815a == jVar.f4815a && Intrinsics.areEqual(this.b, jVar.b);
    }

    public int hashCode() {
        return (this.f4815a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "AdConfig(adFormat=" + this.f4815a + ", extras=" + this.b + ")";
    }

    public /* synthetic */ j(u uVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
