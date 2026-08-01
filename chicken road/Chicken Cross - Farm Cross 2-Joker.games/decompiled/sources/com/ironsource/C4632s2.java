package com.ironsource;

import com.ironsource.Q1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.s2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4632s2 {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f8518a;
    private final AbstractC4720x0 b;
    private final com.ironsource.mediationsdk.e c;
    private final C4400f2 d;

    /* renamed from: com.ironsource.s2$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8519a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8519a = iArr;
        }
    }

    /* renamed from: com.ironsource.s2$b */
    public static final class b implements Q1.d {
        final /* synthetic */ InterfaceC4650t2 b;

        b(InterfaceC4650t2 interfaceC4650t2) {
            this.b = interfaceC4650t2;
        }

        @Override // com.ironsource.Q1.d
        public void a(Q1 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C4632s2.this.b(auction, this.b);
        }

        @Override // com.ironsource.Q1.d
        public void a(Q1 auction, String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C4632s2.this.b(auction, this.b);
        }
    }

    public C4632s2(T0 adTools, AbstractC4720x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f8518a = adTools;
        this.b = adUnitData;
        C4597q2 e = adUnitData.e();
        String d = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(e, d));
        this.c = eVar;
        this.d = new C4400f2(adTools, eVar);
    }

    private final InterfaceC4697vd c() {
        int i = a.f8519a[this.b.b().e().ordinal()];
        if (i == 1) {
            return Ib.v.d().B();
        }
        if (i != 2) {
            return null;
        }
        return Ib.v.d().G();
    }

    private final C4422g6 d() {
        InterfaceC4697vd c2 = c();
        if (c2 != null) {
            return c2.a(this.b.b().c());
        }
        return null;
    }

    public final C4400f2 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Q1 q1, InterfaceC4650t2 interfaceC4650t2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) q1.d().d())));
        if (!q1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f8518a.f().b().a(1005, "No candidates available for auctioning");
            interfaceC4650t2.a(A0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.f8518a.f().b().b(q1.d().d().toString());
            this.c.a(ContextProvider.getInstance().getApplicationContext(), a(q1, this.f8518a.g()), new c(interfaceC4650t2, q1, q1.d().c()));
        }
    }

    public void a(InterfaceC4650t2 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f8518a.f().b().a(this.b.b().d());
        a(new Q1(this.f8518a, this.b, d()), completionListener);
    }

    private final void a(Q1 q1, InterfaceC4650t2 interfaceC4650t2) {
        if (!q1.f()) {
            b(q1, interfaceC4650t2);
        } else {
            q1.a(new b(interfaceC4650t2));
        }
    }

    /* renamed from: com.ironsource.s2$c */
    public static final class c implements S1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4650t2 f8521a;
        final /* synthetic */ Q1 b;
        final /* synthetic */ B c;

        c(InterfaceC4650t2 interfaceC4650t2, Q1 q1, B b) {
            this.f8521a = interfaceC4650t2;
            this.b = q1;
            this.c = b;
        }

        @Override // com.ironsource.S1
        public void a(List<C4561o2> newWaterfall, String auctionId, C4561o2 c4561o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f8521a.a(newWaterfall, this.b.c(), auctionId, c4561o2, jSONObject, jSONObject2, i, j, i2, str, this.c);
        }

        @Override // com.ironsource.S1
        public void a(int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.f8521a.a(i, str, i2, auctionFallback, j, this.c);
        }
    }

    private final com.ironsource.mediationsdk.h a(Q1 q1, int i) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.b.b().a());
        hVar.b(IronSourceUtils.g());
        hVar.a(q1.d().a());
        hVar.a(q1.d().b());
        hVar.a(this.f8518a.h());
        hVar.a(i);
        hVar.a(this.f8518a.k());
        Rf g = this.b.b().g();
        hVar.e(g != null ? g.c() : false);
        hVar.a(this.b.b().d());
        B c2 = q1.d().c();
        hVar.d(c2 != null ? c2.p() : null);
        InterfaceC4454i2 i2 = this.f8518a.i();
        if (i2 != null) {
            i2.a(hVar);
        }
        return hVar;
    }

    private final String a(String str) {
        return C4577p0.a(this.f8518a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C4577p0.a(this.f8518a, (String) null, (String) null, 2, (Object) null);
    }
}
