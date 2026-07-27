package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    public final String f5092a;
    public final String b;
    public final int c;
    public final String d;
    public final Mediation e;

    public yg(String str, String location, int i, String adTypeName, Mediation mediation) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        this.f5092a = str;
        this.b = location;
        this.c = i;
        this.d = adTypeName;
        this.e = mediation;
    }

    public final String a() {
        return this.f5092a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final Mediation d() {
        return this.e;
    }

    public final int e() {
        return this.c;
    }
}
