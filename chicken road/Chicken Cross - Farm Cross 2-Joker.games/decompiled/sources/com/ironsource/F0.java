package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4520lf f7621a;
    private final String b;
    private final String c;
    private final P7 d;
    private final String e;

    public F0(EnumC4520lf recordType, String advertiserBundleId, String networkInstanceId, P7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f7621a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adProvider;
        this.e = adInstanceId;
    }

    public final String a() {
        return this.e;
    }

    public final P7 b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final EnumC4520lf e() {
        return this.f7621a;
    }

    public final C4607qc a(Hb<F0, C4607qc> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
