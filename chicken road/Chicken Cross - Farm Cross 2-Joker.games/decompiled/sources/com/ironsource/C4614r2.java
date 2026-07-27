package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4614r2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4614r2 extends Kg {
    private final T0 e;
    private final AbstractC4720x0 f;
    private final C4632s2 g;
    private final Uc h;
    private InterfaceC4650t2 i;

    /* renamed from: com.ironsource.r2$a */
    public static final class a implements InterfaceC4650t2 {
        final /* synthetic */ E b;
        final /* synthetic */ Lg c;

        a(E e, Lg lg) {
            this.b = e;
            this.c = lg;
        }

        @Override // com.ironsource.InterfaceC4650t2
        public void a(final List<C4561o2> newWaterfall, final Map<String, I> adInstancePayloads, final String auctionId, final C4561o2 c4561o2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i, final long j, final int i2, final String str, final B b) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            T0 t0 = C4614r2.this.e;
            final C4614r2 c4614r2 = C4614r2.this;
            final E e = this.b;
            final Lg lg = this.c;
            t0.a(new Runnable() { // from class: com.ironsource.r2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4614r2.a.a(C4614r2.this, e, lg, newWaterfall, adInstancePayloads, auctionId, c4561o2, jSONObject, jSONObject2, i, j, i2, str, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4614r2 this$0, E adInstanceFactory, Lg waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C4561o2 c4561o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str, B b) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c4561o2, jSONObject, jSONObject2, i, j, i2, str, b);
        }

        @Override // com.ironsource.InterfaceC4650t2
        public void a(final int i, final String str, final int i2, final String auctionFallback, final long j, final B b) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            T0 t0 = C4614r2.this.e;
            final C4614r2 c4614r2 = C4614r2.this;
            final E e = this.b;
            final Lg lg = this.c;
            t0.a(new Runnable() { // from class: com.ironsource.r2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4614r2.a.a(C4614r2.this, e, lg, i, str, i2, auctionFallback, j, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4614r2 this$0, E adInstanceFactory, Lg waterfallFetcherListener, int i, String str, int i2, String auctionFallback, long j, B b) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i, str, i2, auctionFallback, j, b);
        }

        @Override // com.ironsource.InterfaceC4650t2
        public void a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.c.a(i, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4614r2(T0 adTools, AbstractC4720x0 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = adTools;
        this.f = adUnitData;
        C4632s2 c4632s2 = new C4632s2(adTools, adUnitData);
        this.g = c4632s2;
        this.h = c4632s2.b();
    }

    @Override // com.ironsource.Kg
    public Uc a() {
        return this.h;
    }

    @Override // com.ironsource.Kg
    public void a(E adInstanceFactory, Lg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.g.a(aVar);
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Lg lg, List<C4561o2> list, Map<String, I> map, String str, C4561o2 c4561o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b) {
        IronLog.INTERNAL.verbose(C4577p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        C4507l2 c4507l2 = new C4507l2(str, jSONObject, c4561o2, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.e.f().h().a(i2, str2);
        }
        a(jSONObject2);
        Mg a2 = a(list, map, c4507l2, e, b);
        this.e.f().a(new U1(c4507l2));
        this.e.f().b().a(j, this.f.v() + ";wtf=" + a2.c());
        this.e.f().b().c(a2.d());
        a(a2, lg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Lg lg, int i, String str, int i2, String str2, long j, B b) {
        IronLog.INTERNAL.verbose(C4577p0.a(this.e, "Auction failed (error " + i + " - " + str + ")", (String) null, 2, (Object) null));
        if (b != null) {
            c();
        }
        boolean n = this.f.e().n();
        String a2 = Y1.f8018a.a(n);
        C4507l2 c4507l2 = new C4507l2(a2, null, null, i2, str2);
        C4725x5 f = this.e.f();
        f.a(new U1(c4507l2));
        f.b().a(j, i, str);
        if (n) {
            a(e, lg, i2, str2, a2);
        } else {
            a(lg);
        }
    }

    private final void a(Mg mg, Lg lg) {
        this.e.h().a(mg);
        lg.a(mg);
    }

    private final void a(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f.b(false);
                IronLog.INTERNAL.verbose(C4577p0.a(this.e, "loading configuration from auction response is null, using the following: " + this.f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.f.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                } else if (this.f.b().h() && Ib.v.d().h().m()) {
                    AbstractC4720x0 abstractC4720x0 = this.f;
                    abstractC4720x0.a(Math.max(2, abstractC4720x0.k()));
                }
                this.f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
            } catch (JSONException e) {
                C4491k4.d().a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f.b().a() + " Error: " + e.getMessage());
                ironLog.verbose(C4577p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            }
        } finally {
            IronLog.INTERNAL.verbose(C4577p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
        }
    }

    private final void a(E e, Lg lg, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C4577p0.a(this.e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Dc(this.e, this.f).a(lg, i, str, str2, e);
    }

    private final void a(Lg lg) {
        lg.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }
}
