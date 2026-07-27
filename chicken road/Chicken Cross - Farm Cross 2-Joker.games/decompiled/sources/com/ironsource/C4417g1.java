package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4417g1 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4520lf f8198a;
    private final P7 b;
    private final String c;
    private final long d;

    public C4417g1(EnumC4520lf recordType, P7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f8198a = recordType;
        this.b = adProvider;
        this.c = adInstanceId;
        this.d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public final String a() {
        return this.c;
    }

    public final P7 b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return MapsKt.mapOf(TuplesKt.to(C4658ta.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)));
    }

    public final Map<String, Object> d() {
        return MapsKt.mapOf(TuplesKt.to(C4658ta.b, this.c), TuplesKt.to(C4658ta.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)), TuplesKt.to("rt", Integer.valueOf(this.f8198a.ordinal())));
    }

    public final EnumC4520lf e() {
        return this.f8198a;
    }

    public final long f() {
        return this.d;
    }
}
