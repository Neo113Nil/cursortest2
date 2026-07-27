package com.ironsource;

import com.ironsource.AbstractC4720x0;
import com.ironsource.M0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B9 extends AbstractC4720x0 {
    public static final a z = new a(null);
    private final C4434h0 t;
    private final boolean u;
    private final C4702w0 v;
    private final D9 w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B9 a(C4434h0 adProperties, Sa sa, boolean z) {
            List<C4732xc> emptyList;
            Te d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4720x0.a aVar = AbstractC4720x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            D9 d2 = c != null ? c.d() : null;
            if (d2 == null) {
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
            return new B9(adProperties, z, new C4702w0(f, arrayList, b), d2);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B9(C4434h0 adProperties, boolean z2, C4702w0 adUnitCommonData, D9 configs) {
        super(adProperties, z2, r3, r4, r5, r7, configs.c(), configs.d(), configs.f(), configs.b(), -1, new M0(M0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f = adUnitCommonData.f();
        List<NetworkSettings> d = adUnitCommonData.d();
        C4515la e = adUnitCommonData.e();
        C4597q2 g = configs.g();
        Intrinsics.checkNotNullExpressionValue(g, "configs.interstitialAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = Ta.c;
    }

    public final C4702w0 A() {
        return this.v;
    }

    public final D9 B() {
        return this.w;
    }

    public final B9 a(C4434h0 adProperties, boolean z2, C4702w0 adUnitCommonData, D9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new B9(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4720x0
    public C4434h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC4720x0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B9)) {
            return false;
        }
        B9 b9 = (B9) obj;
        return Intrinsics.areEqual(this.t, b9.t) && this.u == b9.u && Intrinsics.areEqual(this.v, b9.v) && Intrinsics.areEqual(this.w, b9.w);
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
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC4720x0
    public boolean u() {
        return this.u;
    }

    public final C4434h0 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C4702w0 y() {
        return this.v;
    }

    public final D9 z() {
        return this.w;
    }

    public static /* synthetic */ B9 a(B9 b9, C4434h0 c4434h0, boolean z2, C4702w0 c4702w0, D9 d9, int i, Object obj) {
        if ((i & 1) != 0) {
            c4434h0 = b9.t;
        }
        if ((i & 2) != 0) {
            z2 = b9.u;
        }
        if ((i & 4) != 0) {
            c4702w0 = b9.v;
        }
        if ((i & 8) != 0) {
            d9 = b9.w;
        }
        return b9.a(c4434h0, z2, c4702w0, d9);
    }

    @Override // com.ironsource.AbstractC4720x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
