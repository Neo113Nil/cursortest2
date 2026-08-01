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

/* renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4340be extends AbstractC4720x0 {
    public static final a z = new a(null);
    private final C4434h0 t;
    private final boolean u;
    private final C4702w0 v;
    private final C4376de w;
    private final String x;
    private final String y;

    /* renamed from: com.ironsource.be$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4340be a(C4434h0 adProperties, Sa sa, boolean z) {
            List<C4732xc> emptyList;
            Te d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4720x0.a aVar = AbstractC4720x0.r;
            K3 c = (sa == null || (d = sa.d()) == null) ? null : d.c();
            C4376de f = c != null ? c.f() : null;
            if (f == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (sa == null || (emptyList = sa.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String f2 = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4732xc) it.next()).f());
            }
            C4515la b = C4515la.b();
            Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return new C4340be(adProperties, z, new C4702w0(f2, arrayList, b), f);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4340be(C4434h0 adProperties, boolean z2, C4702w0 adUnitCommonData, C4376de configs) {
        super(adProperties, z2, r3, r4, r5, r7, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new M0(M0.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f = adUnitCommonData.f();
        List<NetworkSettings> d = adUnitCommonData.d();
        C4515la e = adUnitCommonData.e();
        C4597q2 k = configs.k();
        Intrinsics.checkNotNullExpressionValue(k, "configs.rewardedVideoAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.y = Ta.b;
    }

    public final C4702w0 A() {
        return this.v;
    }

    public final C4376de B() {
        return this.w;
    }

    public final C4340be a(C4434h0 adProperties, boolean z2, C4702w0 adUnitCommonData, C4376de configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C4340be(adProperties, z2, adUnitCommonData, configs);
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
        if (!(obj instanceof C4340be)) {
            return false;
        }
        C4340be c4340be = (C4340be) obj;
        return Intrinsics.areEqual(this.t, c4340be.t) && this.u == c4340be.u && Intrinsics.areEqual(this.v, c4340be.v) && Intrinsics.areEqual(this.w, c4340be.w);
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
        return "RewardedAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
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

    public final C4376de z() {
        return this.w;
    }

    public static /* synthetic */ C4340be a(C4340be c4340be, C4434h0 c4434h0, boolean z2, C4702w0 c4702w0, C4376de c4376de, int i, Object obj) {
        if ((i & 1) != 0) {
            c4434h0 = c4340be.t;
        }
        if ((i & 2) != 0) {
            z2 = c4340be.u;
        }
        if ((i & 4) != 0) {
            c4702w0 = c4340be.v;
        }
        if ((i & 8) != 0) {
            c4376de = c4340be.w;
        }
        return c4340be.a(c4434h0, z2, c4702w0, c4376de);
    }

    @Override // com.ironsource.AbstractC4720x0
    public JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        Intrinsics.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
