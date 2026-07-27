package com.ironsource;

import com.ironsource.AbstractC4720x0;
import com.ironsource.M0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4392ec extends AbstractC4720x0 {
    public static final a y = new a(null);
    private final C4434h0 t;
    private final C4702w0 u;
    private final Pb v;
    private final String w;
    private final String x;

    /* renamed from: com.ironsource.ec$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4392ec a(C4434h0 adProperties, Sa sa) {
            List<C4732xc> emptyList;
            Te d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4720x0.a aVar = AbstractC4720x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            Pb e = c != null ? c.e() : null;
            if (e == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (sa == null || (emptyList = sa.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4732xc) it.next()).f());
            }
            C4515la b = C4515la.b();
            Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return new C4392ec(adProperties, new C4702w0(f, arrayList, b), e);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4392ec(C4434h0 adProperties, C4702w0 adUnitCommonData, Pb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new M0(M0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.t = adProperties;
        this.u = adUnitCommonData;
        this.v = configs;
        this.w = "NA";
        this.x = Ta.e;
    }

    public final Pb A() {
        return this.v;
    }

    public final C4392ec a(C4434h0 adProperties, C4702w0 adUnitCommonData, Pb configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C4392ec(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4720x0
    public C4434h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC4720x0
    public String c() {
        return this.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4392ec)) {
            return false;
        }
        C4392ec c4392ec = (C4392ec) obj;
        return Intrinsics.areEqual(this.t, c4392ec.t) && Intrinsics.areEqual(this.u, c4392ec.u) && Intrinsics.areEqual(this.v, c4392ec.v);
    }

    public int hashCode() {
        return (((this.t.hashCode() * 31) + this.u.hashCode()) * 31) + this.v.hashCode();
    }

    @Override // com.ironsource.AbstractC4720x0
    public String j() {
        return this.x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    public final C4434h0 w() {
        return this.t;
    }

    public final C4702w0 x() {
        return this.u;
    }

    public final Pb y() {
        return this.v;
    }

    public final C4702w0 z() {
        return this.u;
    }

    public static /* synthetic */ C4392ec a(C4392ec c4392ec, C4434h0 c4434h0, C4702w0 c4702w0, Pb pb, int i, Object obj) {
        if ((i & 1) != 0) {
            c4434h0 = c4392ec.t;
        }
        if ((i & 2) != 0) {
            c4702w0 = c4392ec.u;
        }
        if ((i & 4) != 0) {
            pb = c4392ec.v;
        }
        return c4392ec.a(c4434h0, c4702w0, pb);
    }

    @Override // com.ironsource.AbstractC4720x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
