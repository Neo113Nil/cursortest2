package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    public final String f4698a;
    public final List b;
    public final List c;
    public final List d;

    public bl(String str, List viewableUrls, List notViewableUrls, List viewUndeterminedUrls) {
        Intrinsics.checkNotNullParameter(viewableUrls, "viewableUrls");
        Intrinsics.checkNotNullParameter(notViewableUrls, "notViewableUrls");
        Intrinsics.checkNotNullParameter(viewUndeterminedUrls, "viewUndeterminedUrls");
        this.f4698a = str;
        this.b = viewableUrls;
        this.c = notViewableUrls;
        this.d = viewUndeterminedUrls;
    }

    public final List a() {
        return this.c;
    }

    public final List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        return Intrinsics.areEqual(this.f4698a, blVar.f4698a) && Intrinsics.areEqual(this.b, blVar.b) && Intrinsics.areEqual(this.c, blVar.c) && Intrinsics.areEqual(this.d, blVar.d);
    }

    public int hashCode() {
        String str = this.f4698a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ViewableImpression(id=" + this.f4698a + ", viewableUrls=" + this.b + ", notViewableUrls=" + this.c + ", viewUndeterminedUrls=" + this.d + ")";
    }
}
