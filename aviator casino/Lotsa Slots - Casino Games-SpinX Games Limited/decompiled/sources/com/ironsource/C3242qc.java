package com.ironsource;

/* renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3242qc {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.EnumC3191nf f6575a;
    private final java.lang.String b;
    private final com.ironsource.R7 c;
    private final java.lang.String d;

    public C3242qc(com.ironsource.EnumC3191nf recordType, java.lang.String advertiserBundleId, com.ironsource.R7 adProvider, java.lang.String adInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f6575a = recordType;
        this.b = advertiserBundleId;
        this.c = adProvider;
        this.d = adInstanceId;
    }

    public final java.lang.String a() {
        return this.d;
    }

    public final com.ironsource.R7 b() {
        return this.c;
    }

    public final java.lang.String c() {
        return this.b;
    }

    public final com.ironsource.EnumC3191nf d() {
        return this.f6575a;
    }

    public final com.ironsource.C3088i1 a(com.ironsource.Ib<com.ironsource.C3242qc, com.ironsource.C3088i1> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
