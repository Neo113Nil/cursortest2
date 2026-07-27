package com.ironsource;

import com.ironsource.C4598q3;
import com.ironsource.Q1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f7852a;
    private final AbstractC4720x0 b;
    private final Map<String, I> c;
    private final C4418g2 d;
    private final List<CallableC4544n3> e;
    private final boolean f;

    public static final class a extends com.ironsource.environment.thread.a {
        final /* synthetic */ C4598q3 b;
        final /* synthetic */ Q1 c;
        final /* synthetic */ C4598q3.b d;

        a(C4598q3 c4598q3, Q1 q1, C4598q3.b bVar) {
            this.b = c4598q3;
            this.c = q1;
            this.d = bVar;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            this.b.a(this.c.e(), this.d, this.c.b.f(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class c implements C4598q3.b {
        final /* synthetic */ d b;

        c(d dVar) {
            this.b = dVar;
        }

        @Override // com.ironsource.C4598q3.b
        public void a(final List<? extends C4615r3> biddingDataList, final long j, final List<String> reachedTimeout) {
            Intrinsics.checkNotNullParameter(biddingDataList, "biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            T0 t0 = Q1.this.f7852a;
            final Q1 q1 = Q1.this;
            final d dVar = this.b;
            t0.a(new Runnable() { // from class: com.ironsource.Q1$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(Q1.this, j, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.C4598q3.b
        public void onFailure(final String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            T0 t0 = Q1.this.f7852a;
            final Q1 q1 = Q1.this;
            final d dVar = this.b;
            t0.a(new Runnable() { // from class: com.ironsource.Q1$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(Q1.this, error, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 this$0, long j, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(biddingDataList, "$biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a(j, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 this$0, String error, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.f7852a.f().g().a(error);
            biddingDataListener.a(this$0, error);
        }
    }

    public interface d {
        void a(Q1 q1);

        void a(Q1 q1, String str);
    }

    public Q1(T0 adTools, AbstractC4720x0 adUnitData, C4422g6 c4422g6) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f7852a = adTools;
        this.b = adUnitData;
        this.c = a();
        this.d = new C4418g2(adUnitData);
        this.e = new ArrayList();
        this.f = adUnitData.e().q();
        b b2 = b();
        Rf g = adUnitData.b().g();
        boolean z = Ib.v.d().h().x() && (adUnitData.b().a() == IronSource.a.INTERSTITIAL || adUnitData.b().a() == IronSource.a.REWARDED_VIDEO);
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (g == null || g.a(networkSettings, this.b.b().a())) {
                AdData a2 = this.b.a(networkSettings);
                if (networkSettings.isBidder(this.b.b().a())) {
                    Object b3 = this.f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (b3 instanceof InterfaceC4580p3) {
                        this.e.add(new CallableC4544n3(networkSettings.getInstanceType(this.b.b().a()), networkSettings.getProviderInstanceName(), a2, (InterfaceC4580p3) b3, b2, networkSettings));
                    } else {
                        this.f7852a.f().h().g(b3 == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else if (!z) {
                    this.d.a(networkSettings);
                }
            }
        }
        this.d.a(c4422g6);
    }

    public final Map<String, I> c() {
        return this.c;
    }

    public final C4418g2 d() {
        return this.d;
    }

    public final List<CallableC4544n3> e() {
        return this.e;
    }

    public final boolean f() {
        return !this.e.isEmpty();
    }

    public final boolean g() {
        return this.d.e();
    }

    public final boolean h() {
        return this.f;
    }

    private final b b() {
        return new b();
    }

    private final C4598q3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        I i = this.c.get(str);
        if (i != null) {
            return i.b();
        }
        return null;
    }

    private final Map<String, I> a() {
        List<NetworkSettings> m = this.b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(m, 10)), 16));
        Iterator<T> it = m.iterator();
        while (it.hasNext()) {
            I i = new I(this.f7852a, this.b, (NetworkSettings) it.next());
            Pair pair = TuplesKt.to(i.c(), i);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final class b implements InterfaceC4562o3 {
        b() {
        }

        @Override // com.ironsource.InterfaceC4562o3
        public void a(NetworkSettings networkSettings) {
            AdapterBaseInterface a2;
            if (Q1.this.h()) {
                a2 = null;
                BaseAdAdapter b = Q1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (b != null) {
                    a2 = b.getNetworkAdapter();
                }
            } else {
                a2 = Q1.this.a(networkSettings);
            }
            if (a2 != null) {
                Q1.this.f7852a.f().g().b(Q1.this.a(networkSettings, a2));
            }
        }

        @Override // com.ironsource.InterfaceC4562o3
        public void a(String str) {
            Q1.this.f7852a.f().h().g(str);
        }
    }

    public /* synthetic */ Q1(T0 t0, AbstractC4720x0 abstractC4720x0, C4422g6 c4422g6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, abstractC4720x0, (i & 4) != 0 ? null : c4422g6);
    }

    public final void a(d biddingDataListener) {
        Intrinsics.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        C4598q3 c4598q3 = new C4598q3();
        C4598q3.b b2 = b(biddingDataListener);
        this.f7852a.f().g().a(this.b.f());
        this.f7852a.a((com.ironsource.environment.thread.a) new a(c4598q3, this, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j, List<? extends C4615r3> list, List<String> list2, d dVar) {
        this.f7852a.f().g().b(j);
        for (C4615r3 c4615r3 : list) {
            String c2 = c4615r3.c();
            Intrinsics.checkNotNullExpressionValue(c2, "biddingResponse.instanceName");
            Map<String, Object> a2 = a(c2);
            if (c4615r3.a() != null) {
                this.d.a(c4615r3);
                this.f7852a.f().g().a(a2, c4615r3.e());
            } else {
                this.f7852a.f().g().a(a2, c4615r3.e(), c4615r3.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f7852a.f().g().b(a(it.next()), j);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface a2;
        NetworkSettings a3 = this.b.a(str);
        if (this.f) {
            BaseAdAdapter<?, ?> b2 = b(str);
            a2 = b2 != null ? b2.getNetworkAdapter() : null;
        } else {
            a2 = a(a3);
        }
        return a(a3, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap hashMap = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e);
            }
        } else {
            providerDefaultInstance = null;
        }
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        hashMap.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        hashMap.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.b.b().a())) : null);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.d().b(networkSettings, this.b.b().a(), this.b.b().b());
    }
}
