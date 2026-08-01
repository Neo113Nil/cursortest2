package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4418g2 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4720x0 f8199a;
    private final Map<String, Object> b;
    private final List<String> c;
    private final StringBuilder d;
    private B e;

    public C4418g2(AbstractC4720x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f8199a = adUnitData;
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = new StringBuilder();
    }

    public final Map<String, Object> a() {
        return this.b;
    }

    public final List<String> b() {
        return this.c;
    }

    public final B c() {
        return this.e;
    }

    public final StringBuilder d() {
        return this.d;
    }

    public final boolean e() {
        return (this.e == null && this.b.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public final void a(B b) {
        this.e = b;
        if (b != null) {
            this.d.append(b.r()).append(b.p()).append(",");
        }
    }

    public final void a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        List<String> list = this.c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        this.d.append(providerSettings.getInstanceType(this.f8199a.b().a())).append(providerSettings.getProviderInstanceName()).append(",");
    }

    public final void a(NetworkSettings providerSettings, Map<String, ? extends Object> biddingData) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.f8199a.b().a()), biddingData);
    }

    public final void a(C4615r3 biddingResponse) {
        Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        String c = biddingResponse.c();
        Intrinsics.checkNotNullExpressionValue(c, "biddingResponse.instanceName");
        int d = biddingResponse.d();
        Map<String, Object> a2 = biddingResponse.a();
        Intrinsics.checkNotNullExpressionValue(a2, "biddingResponse.biddingData");
        a(c, d, a2);
    }

    private final void a(String str, int i, Map<String, ? extends Object> map) {
        this.b.put(str, map);
        this.d.append(i).append(str).append(",");
    }
}
