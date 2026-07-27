package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4607qc {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4520lf f8491a;
    private final String b;
    private final P7 c;
    private final String d;

    public C4607qc(EnumC4520lf recordType, String advertiserBundleId, P7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f8491a = recordType;
        this.b = advertiserBundleId;
        this.c = adProvider;
        this.d = adInstanceId;
    }

    public final String a() {
        return this.d;
    }

    public final P7 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final EnumC4520lf d() {
        return this.f8491a;
    }

    public final C4417g1 a(Hb<C4607qc, C4417g1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
