package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    public final String f4859a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;

    public la(String str, String str2, String str3, List errors, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        this.f4859a = str;
        this.b = str2;
        this.c = str3;
        this.d = errors;
        this.e = impressions;
        this.f = creatives;
        this.g = extensions;
        this.h = adVerifications;
        this.i = viewableImpressions;
    }

    public final la a(String str, String str2, String str3, List errors, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        return new la(str, str2, str3, errors, impressions, creatives, extensions, adVerifications, viewableImpressions);
    }

    public final List b() {
        return this.f;
    }

    public final List c() {
        return this.g;
    }

    public final List d() {
        return this.e;
    }

    public final List e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return Intrinsics.areEqual(this.f4859a, laVar.f4859a) && Intrinsics.areEqual(this.b, laVar.b) && Intrinsics.areEqual(this.c, laVar.c) && Intrinsics.areEqual(this.d, laVar.d) && Intrinsics.areEqual(this.e, laVar.e) && Intrinsics.areEqual(this.f, laVar.f) && Intrinsics.areEqual(this.g, laVar.g) && Intrinsics.areEqual(this.h, laVar.h) && Intrinsics.areEqual(this.i, laVar.i);
    }

    public int hashCode() {
        String str = this.f4859a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return ((((((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public String toString() {
        return "InLine(adSystem=" + this.f4859a + ", adTitle=" + this.b + ", description=" + this.c + ", errors=" + this.d + ", impressions=" + this.e + ", creatives=" + this.f + ", extensions=" + this.g + ", adVerifications=" + this.h + ", viewableImpressions=" + this.i + ")";
    }

    public final List a() {
        return this.h;
    }
}
