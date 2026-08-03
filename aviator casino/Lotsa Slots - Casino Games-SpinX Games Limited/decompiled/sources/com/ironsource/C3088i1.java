package com.ironsource;

/* renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3088i1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.EnumC3191nf f6298a;
    private final com.ironsource.R7 b;
    private final java.lang.String c;
    private final long d;

    public C3088i1(com.ironsource.EnumC3191nf recordType, com.ironsource.R7 adProvider, java.lang.String adInstanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f6298a = recordType;
        this.b = adProvider;
        this.c = adInstanceId;
        this.d = java.util.Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public final java.lang.String a() {
        return this.c;
    }

    public final com.ironsource.R7 b() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> c() {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.C3293ta.c, java.lang.Integer.valueOf(this.b.b())), kotlin.TuplesKt.to("ts", java.lang.String.valueOf(this.d)));
    }

    public final java.util.Map<java.lang.String, java.lang.Object> d() {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.C3293ta.b, this.c), kotlin.TuplesKt.to(com.ironsource.C3293ta.c, java.lang.Integer.valueOf(this.b.b())), kotlin.TuplesKt.to("ts", java.lang.String.valueOf(this.d)), kotlin.TuplesKt.to("rt", java.lang.Integer.valueOf(this.f6298a.ordinal())));
    }

    public final com.ironsource.EnumC3191nf e() {
        return this.f6298a;
    }

    public final long f() {
        return this.d;
    }
}
