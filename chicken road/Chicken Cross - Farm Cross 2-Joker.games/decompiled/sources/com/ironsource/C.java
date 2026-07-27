package com.ironsource;

import com.ironsource.C4612r0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4720x0 f7578a;
    private final NetworkSettings b;
    private final C4507l2 c;
    private final C4345c1 d;
    private C4561o2 e;
    private final int f;
    private final boolean g;
    private final J h;
    private final IronSource.a i;
    private final JSONObject j;
    private final String k;
    private final int l;
    private final String m;
    private final C4561o2 n;
    private final String o;
    private final String p;
    private final int q;
    private final AdData r;

    public C(AbstractC4720x0 adUnitData, NetworkSettings providerSettings, C4507l2 auctionData, C4345c1 adapterConfig, C4561o2 auctionResponseItem, int i, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.f7578a = adUnitData;
        this.b = providerSettings;
        this.c = auctionData;
        this.d = adapterConfig;
        this.e = auctionResponseItem;
        this.f = i;
        this.g = z;
        this.h = new J(C4612r0.a.DidntAttemptToLoad);
        IronSource.a a2 = adUnitData.b().a();
        this.i = a2;
        this.j = auctionData.h();
        this.k = auctionData.g();
        this.l = auctionData.i();
        this.m = auctionData.f();
        this.n = auctionData.j();
        String f = adapterConfig.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        this.o = f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{f, Integer.valueOf(hashCode())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        this.p = format;
        this.q = adapterConfig.d();
        String k = this.e.k();
        Map<String, Object> a3 = C4444ha.a(this.e.a());
        Intrinsics.checkNotNullExpressionValue(a3, "jsonObjectToMap(auctionResponseItem.adData)");
        a3.put("adUnit", a2);
        HashMap hashMap = new HashMap();
        Map<String, Object> a4 = C4444ha.a(adapterConfig.c());
        Intrinsics.checkNotNullExpressionValue(a4, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        hashMap.putAll(a4);
        a3.put("userId", adUnitData.r());
        a3.put("adUnitId", adUnitData.b().c());
        a3.put("isMultipleAdUnits", Boolean.TRUE);
        this.r = new AdData(k, hashMap, a3);
    }

    public final AbstractC4720x0 a() {
        return this.f7578a;
    }

    public final NetworkSettings b() {
        return this.b;
    }

    public final C4507l2 c() {
        return this.c;
    }

    public final C4345c1 d() {
        return this.d;
    }

    public final C4561o2 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return Intrinsics.areEqual(this.f7578a, c.f7578a) && Intrinsics.areEqual(this.b, c.b) && Intrinsics.areEqual(this.c, c.c) && Intrinsics.areEqual(this.d, c.d) && Intrinsics.areEqual(this.e, c.e) && this.f == c.f && this.g == c.g;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final AdData h() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f7578a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final IronSource.a i() {
        return this.i;
    }

    public final AbstractC4720x0 j() {
        return this.f7578a;
    }

    public final C4345c1 k() {
        return this.d;
    }

    public final C4507l2 l() {
        return this.c;
    }

    public final String m() {
        return this.m;
    }

    public final String n() {
        return this.k;
    }

    public final C4561o2 o() {
        return this.e;
    }

    public final int p() {
        return this.l;
    }

    public final C4561o2 q() {
        return this.n;
    }

    public final JSONObject r() {
        return this.j;
    }

    public final String s() {
        return this.o;
    }

    public final int t() {
        return this.q;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f7578a + ", providerSettings=" + this.b + ", auctionData=" + this.c + ", adapterConfig=" + this.d + ", auctionResponseItem=" + this.e + ", sessionDepth=" + this.f + ", isPreloaded=" + this.g + ")";
    }

    public final J u() {
        return this.h;
    }

    public final NetworkSettings v() {
        return this.b;
    }

    public final int w() {
        return this.f;
    }

    public final String x() {
        return this.p;
    }

    public final boolean y() {
        return this.g;
    }

    public final C a(AbstractC4720x0 adUnitData, NetworkSettings providerSettings, C4507l2 auctionData, C4345c1 adapterConfig, C4561o2 auctionResponseItem, int i, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new C(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i, z);
    }

    public static /* synthetic */ C a(C c, AbstractC4720x0 abstractC4720x0, NetworkSettings networkSettings, C4507l2 c4507l2, C4345c1 c4345c1, C4561o2 c4561o2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC4720x0 = c.f7578a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c.b;
        }
        NetworkSettings networkSettings2 = networkSettings;
        if ((i2 & 4) != 0) {
            c4507l2 = c.c;
        }
        C4507l2 c4507l22 = c4507l2;
        if ((i2 & 8) != 0) {
            c4345c1 = c.d;
        }
        C4345c1 c4345c12 = c4345c1;
        if ((i2 & 16) != 0) {
            c4561o2 = c.e;
        }
        C4561o2 c4561o22 = c4561o2;
        if ((i2 & 32) != 0) {
            i = c.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z = c.g;
        }
        return c.a(abstractC4720x0, networkSettings2, c4507l22, c4345c12, c4561o22, i3, z);
    }

    public final void a(C4561o2 c4561o2) {
        Intrinsics.checkNotNullParameter(c4561o2, "<set-?>");
        this.e = c4561o2;
    }

    public final void a(C4612r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.h.b(performance);
    }

    public /* synthetic */ C(AbstractC4720x0 abstractC4720x0, NetworkSettings networkSettings, C4507l2 c4507l2, C4345c1 c4345c1, C4561o2 c4561o2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4720x0, networkSettings, c4507l2, c4345c1, c4561o2, i, (i2 & 64) != 0 ? false : z);
    }
}
