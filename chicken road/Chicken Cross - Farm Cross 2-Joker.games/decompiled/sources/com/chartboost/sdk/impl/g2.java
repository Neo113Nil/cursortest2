package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.jh;
import java.util.Map;
import java.util.UUID;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class g2 implements jh {

    /* renamed from: a, reason: collision with root package name */
    public final String f4775a;

    public g2() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f4775a = uuid;
    }

    @Override // com.chartboost.sdk.impl.jh
    public final Map b() {
        return MapsKt.plus(f(), g());
    }

    @Override // com.chartboost.sdk.impl.jh
    public String c() {
        return jh.a.a(this);
    }

    @Override // com.chartboost.sdk.impl.jh
    public final String d() {
        return this.f4775a;
    }

    public final Map f() {
        return MapsKt.mapOf(TuplesKt.to("CB_APP_ENGINE", e7.f4748a.b()));
    }

    public abstract Map g();
}
