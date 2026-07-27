package com.chartboost.sdk.impl;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class rj {

    /* renamed from: a, reason: collision with root package name */
    public final String f5002a;

    public static final class a extends rj {
        public static final a b = new a();

        public a() {
            super("bufferFinish", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 222887499;
        }

        public String toString() {
            return "BufferFinish";
        }
    }

    public static final class b extends rj {
        public static final b b = new b();

        public b() {
            super("bufferStart", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1127889834;
        }

        public String toString() {
            return "BufferStart";
        }
    }

    public static final class c extends rj {
        public static final c b = new c();

        public c() {
            super("click", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1811085104;
        }

        public String toString() {
            return "Click";
        }
    }

    public static final class d extends rj {
        public static final d b = new d();

        public d() {
            super("close", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1811091360;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class e extends rj {
        public static final e b = new e();

        public e() {
            super("closeLinear", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 2126271205;
        }

        public String toString() {
            return "CloseLinear";
        }
    }

    public static final class f extends rj {
        public static final f b = new f();

        public f() {
            super(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -848642415;
        }

        public String toString() {
            return "Complete";
        }
    }

    public static final class g extends rj {
        public static final g b = new g();

        public g() {
            super("creativeView", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 141283404;
        }

        public String toString() {
            return "CreativeView";
        }
    }

    public static final class h extends rj {
        public static final h b = new h();

        public h() {
            super("error", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        @Override // com.chartboost.sdk.impl.rj
        public void b(sj params) {
            Map c;
            Intrinsics.checkNotNullParameter(params, "params");
            ii k = params.k();
            Object obj = (k == null || (c = k.c()) == null) ? null : c.get("VAST_ERROR_CODE");
            rj.a(this, params, obj instanceof Integer ? (Integer) obj : null, null, 4, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 1813119920;
        }

        public String toString() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c;
        }
    }

    public static final class i extends rj {
        public static final i b = new i();

        public i() {
            super("firstQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 1356419579;
        }

        public String toString() {
            return "FirstQuartile";
        }
    }

    public static final class j extends rj {
        public static final j b = new j();

        public j() {
            super("impression", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 1160259937;
        }

        public String toString() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n;
        }
    }

    public static final class k extends rj {
        public static final k b = new k();

        public k() {
            super(U3.i.r, null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public int hashCode() {
            return 569258845;
        }

        public String toString() {
            return "Loaded";
        }
    }

    public static final class l extends rj {
        public static final l b = new l();

        public l() {
            super(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return -1888032352;
        }

        public String toString() {
            return "Midpoint";
        }
    }

    public static final class m extends rj {
        public static final m b = new m();

        public m() {
            super(CampaignEx.JSON_NATIVE_VIDEO_MUTE, null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return -1742386319;
        }

        public String toString() {
            return "Mute";
        }
    }

    public static final class n extends rj {
        public static final n b = new n();

        public n() {
            super(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 1822775198;
        }

        public String toString() {
            return "Pause";
        }
    }

    public static final class o extends rj {
        public final int b;

        public o(int i) {
            super(NotificationCompat.CATEGORY_PROGRESS + i, null);
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b);
        }

        public String toString() {
            return "Progress(offsetSeconds=" + this.b + ")";
        }
    }

    public static final class p extends rj {
        public static final p b = new p();

        public p() {
            super(CampaignEx.JSON_NATIVE_VIDEO_RESUME, null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public int hashCode() {
            return 732351365;
        }

        public String toString() {
            return "Resume";
        }
    }

    public static final class q extends rj {
        public static final q b = new q();

        public q() {
            super("skip", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public int hashCode() {
            return -1742217513;
        }

        public String toString() {
            return "Skip";
        }
    }

    public static final class r extends rj {
        public static final r b = new r();

        public r() {
            super("start", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Map c;
            Map c2;
            Intrinsics.checkNotNullParameter(params, "params");
            ii k = params.k();
            Object obj = (k == null || (c2 = k.c()) == null) ? null : c2.get(IronSourceConstants.EVENTS_DURATION);
            Float f = obj instanceof Float ? (Float) obj : null;
            float floatValue = f != null ? f.floatValue() : 0.0f;
            if (floatValue < 1.0f) {
                floatValue = 30.0f;
            }
            ii k2 = params.k();
            Object obj2 = (k2 == null || (c = k2.c()) == null) ? null : c.get("volume");
            Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
            float floatValue2 = f2 != null ? f2.floatValue() : 1.0f;
            zk m = params.m();
            if (m != null) {
                m.a(floatValue, floatValue2);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public int hashCode() {
            return 1826092554;
        }

        public String toString() {
            return "Start";
        }
    }

    public static final class s extends rj {
        public static final s b = new s();

        public s() {
            super("thirdQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public int hashCode() {
            return -541631054;
        }

        public String toString() {
            return "ThirdQuartile";
        }
    }

    public static final class t extends rj {
        public static final t b = new t();

        public t() {
            super(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void a(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            zk m = params.m();
            if (m != null) {
                m.a(this);
            }
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public int hashCode() {
            return 826371978;
        }

        public String toString() {
            return "Unmute";
        }
    }

    public static final class u extends rj {
        public static final u b = new u();

        public u() {
            super("viewableimpression", null);
        }

        @Override // com.chartboost.sdk.impl.rj
        public void b(sj params) {
            Intrinsics.checkNotNullParameter(params, "params");
            rj.a(this, params, null, null, 6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public int hashCode() {
            return 2127335488;
        }

        public String toString() {
            return "ViewableImpression";
        }
    }

    public /* synthetic */ rj(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public void a(sj params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public void b(sj params) {
        Intrinsics.checkNotNullParameter(params, "params");
        a(this, params, null, null, 6, null);
    }

    public rj(String str) {
        this.f5002a = str;
    }

    public final String a() {
        return this.f5002a;
    }

    public static /* synthetic */ void a(rj rjVar, sj sjVar, Integer num, Integer num2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fireTracker");
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        rjVar.a(sjVar, num, num2);
    }

    public final void a(final sj params, final Integer num, final Integer num2) {
        String f2;
        Intrinsics.checkNotNullParameter(params, "params");
        ii k2 = params.k();
        if (k2 == null || (f2 = k2.f()) == null) {
            mb.a("Failed to fire tracking URL for event `" + this.f5002a + "`. URL is null in TrackingEvent.", (Throwable) null, 2, (Object) null);
            return;
        }
        String a2 = rb.a(f2, rb.a(params.b(), params.h(), params.g(), new Function1() { // from class: com.chartboost.sdk.impl.rj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rj.a(num, num2, params, (pb) obj);
            }
        }));
        e3 b2 = dj.f4736a.b();
        if (b2 != null) {
            b2.a(new tj(a2));
        } else {
            mb.b("Failed to submit tracking request for " + a2 + ". Network service is null.", (Throwable) null, 2, (Object) null);
        }
        mb.c("Tracking URL for event `" + this.f5002a + "` fired: " + a2 + " (raw: " + f2 + ")", null, 2, null);
    }

    public static final Unit a(Integer num, Integer num2, sj sjVar, pb macroContext) {
        Intrinsics.checkNotNullParameter(macroContext, "$this$macroContext");
        macroContext.a(num);
        macroContext.b(num2);
        macroContext.a(sjVar.n());
        macroContext.a(sjVar.a());
        macroContext.c(sjVar.l());
        macroContext.a(sjVar.f());
        macroContext.b(sjVar.d());
        macroContext.c(sjVar.e());
        macroContext.d(sjVar.i());
        macroContext.a(sjVar.c());
        macroContext.b(sjVar.j());
        return Unit.INSTANCE;
    }
}
