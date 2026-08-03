package com.ironsource;

/* renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3336w {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.EnumC3191nf f6789a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final com.ironsource.R7 e;
    private final java.lang.String f;

    public C3336w(com.ironsource.EnumC3191nf recordType, java.lang.String advertiserBundleId, java.lang.String networkInstanceId, java.lang.String adUnitId, com.ironsource.R7 adProvider, java.lang.String adInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f6789a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adUnitId;
        this.e = adProvider;
        this.f = adInstanceId;
    }

    public final java.lang.String a() {
        return this.f;
    }

    public final com.ironsource.R7 b() {
        return this.e;
    }

    public final java.lang.String c() {
        return this.d;
    }

    public final java.lang.String d() {
        return this.b;
    }

    public final java.lang.String e() {
        return this.c;
    }

    public final com.ironsource.EnumC3191nf f() {
        return this.f6789a;
    }

    public final com.ironsource.G0 a(com.ironsource.Ib<com.ironsource.C3336w, com.ironsource.G0> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
