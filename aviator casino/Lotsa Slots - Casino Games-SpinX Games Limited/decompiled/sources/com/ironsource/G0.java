package com.ironsource;

/* loaded from: classes5.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.EnumC3191nf f5717a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final com.ironsource.R7 d;
    private final java.lang.String e;

    public G0(com.ironsource.EnumC3191nf recordType, java.lang.String advertiserBundleId, java.lang.String networkInstanceId, com.ironsource.R7 adProvider, java.lang.String adInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f5717a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adProvider;
        this.e = adInstanceId;
    }

    public final java.lang.String a() {
        return this.e;
    }

    public final com.ironsource.R7 b() {
        return this.d;
    }

    public final java.lang.String c() {
        return this.b;
    }

    public final java.lang.String d() {
        return this.c;
    }

    public final com.ironsource.EnumC3191nf e() {
        return this.f5717a;
    }

    public final com.ironsource.C3242qc a(com.ironsource.Ib<com.ironsource.G0, com.ironsource.C3242qc> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
