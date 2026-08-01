package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Kg {
    public static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final T0 f7725a;
    private final AbstractC4720x0 b;
    private final Uc c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Kg a(T0 adTools, AbstractC4720x0 adUnitData) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new C4614r2(adTools, adUnitData) : new Dc(adTools, adUnitData);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7726a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7726a = iArr;
        }
    }

    public static final class c implements Uc {
        c() {
        }
    }

    public Kg(T0 adTools, AbstractC4720x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f7725a = adTools;
        this.b = adUnitData;
        this.c = new c();
    }

    private final InterfaceC4697vd b() {
        int i = b.f7726a[this.b.b().a().ordinal()];
        if (i == 1) {
            return Ib.v.d().B();
        }
        if (i == 2) {
            return Ib.v.d().G();
        }
        IronLog.INTERNAL.warning(C4577p0.a(this.f7725a, "Unable to reset preloaded instance", (String) null, 2, (Object) null));
        return null;
    }

    public Uc a() {
        return this.c;
    }

    public abstract void a(E e, Lg lg);

    protected final void c() {
        InterfaceC4697vd b2 = b();
        if (b2 == null) {
            return;
        }
        b2.a(this.b.b().c(), false);
    }

    public static /* synthetic */ Mg a(Kg kg, List list, Map map, C4507l2 c4507l2, E e, B b2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAdInstanceWaterfall");
        }
        if ((i & 16) != 0) {
            b2 = null;
        }
        return kg.a(list, map, c4507l2, e, b2);
    }

    public final Mg a(List<? extends C4561o2> waterfallItems, Map<String, I> adInstancePayloads, C4507l2 auctionData, E adInstanceFactory, B b2) {
        Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C4577p0.a(this.f7725a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C4561o2 c4561o2 = waterfallItems.get(i);
            if (!z && b2 != null && Intrinsics.areEqual(b2.p(), c4561o2.c())) {
                b2.a(c4561o2);
                arrayList.add(b2);
                z = true;
            } else {
                B a2 = a(c4561o2, auctionData, adInstanceFactory, adInstancePayloads.get(c4561o2.c()));
                if (a2 != null && a2.g() != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (b2 != null && !z) {
            c();
        }
        Mg mg = new Mg(arrayList);
        IronLog.INTERNAL.verbose(C4577p0.a(this.f7725a, "updateWaterfall() - next waterfall is " + mg.d(), (String) null, 2, (Object) null));
        return mg;
    }

    private final B a(C4561o2 c4561o2, C4507l2 c4507l2, E e, I i) {
        AbstractC4720x0 abstractC4720x0 = this.b;
        String c2 = c4561o2.c();
        Intrinsics.checkNotNullExpressionValue(c2, "item.instanceName");
        NetworkSettings a2 = abstractC4720x0.a(c2);
        if (a2 == null) {
            String c3 = c4561o2.c();
            Intrinsics.checkNotNullExpressionValue(c3, "item.instanceName");
            a("Could not find matching provider settings for auction response item", c3);
            return null;
        }
        if (i == null) {
            String c4 = c4561o2.c();
            Intrinsics.checkNotNullExpressionValue(c4, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", c4);
            return null;
        }
        com.ironsource.mediationsdk.c.d().b(a2, this.b.b().a(), this.b.b().b());
        int g = this.f7725a.g();
        AbstractC4720x0 abstractC4720x02 = this.b;
        return e.a(new C(abstractC4720x02, a2, c4507l2, new C4345c1(a2, abstractC4720x02.b(a2), this.b.b().a()), c4561o2, g, false, 64, null), i);
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C4577p0.a(this.f7725a, str3, (String) null, 2, (Object) null));
        this.f7725a.f().h().i(str3);
    }
}
