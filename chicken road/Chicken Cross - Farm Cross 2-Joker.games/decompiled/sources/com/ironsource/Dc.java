package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Dc extends Kg {
    private final T0 e;
    private final AbstractC4720x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dc(T0 tools, AbstractC4720x0 adUnitData) {
        super(tools, adUnitData);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = tools;
        this.f = adUnitData;
    }

    private final C4507l2 d() {
        return new C4507l2("", new JSONObject(), null, 0, "");
    }

    private final Map<String, I> e() {
        Rf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (NetworkSettings networkSettings2 : arrayList) {
            Pair pair = TuplesKt.to(networkSettings2.getProviderInstanceName(), new I(this.e, this.f, networkSettings2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    private final List<C4561o2> f() {
        Rf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C4561o2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.Kg
    public void a(E adInstanceFactory, Lg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C4577p0.a(this.e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, d(), adInstanceFactory);
    }

    public final void a(Lg waterfallFetcherListener, int i, String auctionFallback, String auctionId, E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new C4507l2(auctionId, new JSONObject(), null, i, auctionFallback), adInstanceFactory);
    }

    private final void a(Lg lg, C4507l2 c4507l2, E e) {
        IronLog.INTERNAL.verbose(C4577p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        lg.a(Kg.a(this, f(), e(), c4507l2, e, null, 16, null));
    }
}
