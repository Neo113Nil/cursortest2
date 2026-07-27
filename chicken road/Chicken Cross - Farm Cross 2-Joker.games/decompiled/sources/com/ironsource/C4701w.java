package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4701w {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4520lf f8738a;
    private final String b;
    private final String c;
    private final String d;
    private final P7 e;
    private final String f;

    public C4701w(EnumC4520lf recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, P7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f8738a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adUnitId;
        this.e = adProvider;
        this.f = adInstanceId;
    }

    public final String a() {
        return this.f;
    }

    public final P7 b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final EnumC4520lf f() {
        return this.f8738a;
    }

    public final F0 a(Hb<C4701w, F0> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
