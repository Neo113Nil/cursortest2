package com.ironsource;

import com.ironsource.AbstractC4720x0;
import com.ironsource.M0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class K2 extends AbstractC4720x0 {
    public static final a z = new a(null);
    private final H2 t;
    private final boolean u;
    private final C4702w0 v;
    private final S2 w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final K2 a(H2 adProperties, Sa sa, boolean z) {
            List<C4732xc> emptyList;
            Te d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4720x0.a aVar = AbstractC4720x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            S2 c2 = c != null ? c.c() : null;
            if (c2 == null) {
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
            return new K2(adProperties, z, new C4702w0(f, arrayList, b), c2);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K2(H2 adProperties, boolean z2, C4702w0 adUnitCommonData, S2 configs) {
        super(adProperties, z2, r3, r4, r5, r7, configs.a(), (int) (configs.b() / 1000), configs.c(), configs.f(), -1, new M0(M0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * configs.h()), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f = adUnitCommonData.f();
        List<NetworkSettings> d = adUnitCommonData.d();
        C4515la e = adUnitCommonData.e();
        C4597q2 d2 = configs.d();
        Intrinsics.checkNotNullExpressionValue(d2, "configs.bannerAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = "BN";
        this.y = Ta.d;
    }

    @Override // com.ironsource.AbstractC4720x0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public H2 b() {
        return this.t;
    }

    public final C4702w0 B() {
        return this.v;
    }

    public final S2 C() {
        return this.w;
    }

    public final K2 a(H2 adProperties, boolean z2, C4702w0 adUnitCommonData, S2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new K2(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4720x0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K2)) {
            return false;
        }
        K2 k2 = (K2) obj;
        return Intrinsics.areEqual(this.t, k2.t) && this.u == k2.u && Intrinsics.areEqual(this.v, k2.v) && Intrinsics.areEqual(this.w, k2.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        int i = z2;
        if (z2 != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.v.hashCode()) * 31) + this.w.hashCode();
    }

    @Override // com.ironsource.AbstractC4720x0
    public String j() {
        return this.y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC4720x0
    public boolean u() {
        return this.u;
    }

    public final H2 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C4702w0 y() {
        return this.v;
    }

    public final S2 z() {
        return this.w;
    }

    public static /* synthetic */ K2 a(K2 k2, H2 h2, boolean z2, C4702w0 c4702w0, S2 s2, int i, Object obj) {
        if ((i & 1) != 0) {
            h2 = k2.t;
        }
        if ((i & 2) != 0) {
            z2 = k2.u;
        }
        if ((i & 4) != 0) {
            c4702w0 = k2.v;
        }
        if ((i & 8) != 0) {
            s2 = k2.w;
        }
        return k2.a(h2, z2, c4702w0, s2);
    }

    @Override // com.ironsource.AbstractC4720x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC4720x0
    public AdData a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), new C4523m0().b(b().i())));
        Intrinsics.checkNotNullExpressionValue(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return createAdDataForNetworkAdapter;
    }
}
