package com.ironsource;

import com.ironsource.InterfaceC4709w7;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4510l5 implements InterfaceC4709w7, InterfaceC4709w7.a {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f8296a = new JSONObject();
    private final Lazy b = LazyKt.lazy(new i());
    private final Lazy c = LazyKt.lazy(new l());
    private final Lazy d = LazyKt.lazy(new g());
    private final Lazy e = LazyKt.lazy(new f());
    private final Lazy f = LazyKt.lazy(new e());
    private final Lazy g = LazyKt.lazy(new k());
    private final Lazy h = LazyKt.lazy(new h());
    private final Lazy i = LazyKt.lazy(new j());
    private final Lazy j = LazyKt.lazy(new d());
    private final Lazy k = LazyKt.lazy(new c());
    private final Lazy l = LazyKt.lazy(new b());
    private final Lazy m = LazyKt.lazy(new a());

    /* renamed from: com.ironsource.l5$a */
    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.J, true));
        }
    }

    /* renamed from: com.ironsource.l5$b */
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.I, true));
        }
    }

    /* renamed from: com.ironsource.l5$c */
    static final class c extends Lambda implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.u, false));
        }
    }

    /* renamed from: com.ironsource.l5$d */
    static final class d extends Lambda implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.o, false));
        }
    }

    /* renamed from: com.ironsource.l5$e */
    static final class e extends Lambda implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.v, false));
        }
    }

    /* renamed from: com.ironsource.l5$f */
    static final class f extends Lambda implements Function0<Boolean> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.z, false));
        }
    }

    /* renamed from: com.ironsource.l5$g */
    static final class g extends Lambda implements Function0<Boolean> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.y, false));
        }
    }

    /* renamed from: com.ironsource.l5$h */
    static final class h extends Lambda implements Function0<Boolean> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.q, false));
        }
    }

    /* renamed from: com.ironsource.l5$i */
    static final class i extends Lambda implements Function0<Boolean> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.w, false));
        }
    }

    /* renamed from: com.ironsource.l5$j */
    static final class j extends Lambda implements Function0<Boolean> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.p, false));
        }
    }

    /* renamed from: com.ironsource.l5$k */
    static final class k extends Lambda implements Function0<Boolean> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.r, false));
        }
    }

    /* renamed from: com.ironsource.l5$l */
    static final class l extends Lambda implements Function0<Boolean> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4510l5.this.W().optBoolean(C4564o5.x, false));
        }
    }

    private final boolean K() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    private final boolean L() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    private final boolean M() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final boolean N() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    private final boolean O() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    private final boolean P() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    private final boolean Q() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final boolean R() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    private final boolean S() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    private final boolean T() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    private final boolean U() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    private final boolean V() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject W() {
        JSONObject optJSONObject = this.f8296a.optJSONObject(C4528m5.f8352a);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public int A() {
        String optString = W().optString(C4564o5.s);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(PRELOAD_PARALLEL_LOAD_REWARDED)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean B() {
        return L();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public int C() {
        String optString = W().optString(C4564o5.f8463a);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean D() {
        return W().optBoolean(C4564o5.C, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean E() {
        return W().optBoolean(C4564o5.n, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean F() {
        return R();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean G() {
        return U();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public long H() {
        String optString = W().optString(C4564o5.c);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CTRL_LOAD_TIME)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 50L;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean I() {
        return N();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public int J() {
        String optString = W().optString(C4564o5.t);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(PRELOAD…RALLEL_LOAD_INTERSTITIAL)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean b() {
        return O();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public int c() {
        String optString = W().optString(C4564o5.b);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CTRL_LOAD_ATTEMPTS)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 3;
    }

    @Override // com.ironsource.InterfaceC4709w7
    public JSONObject config() {
        return this.f8296a;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean d() {
        return W().optBoolean(C4564o5.i, true);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean e() {
        return W().optBoolean(C4564o5.D, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean f() {
        return K();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public long g() {
        String optString = W().optString(C4564o5.d);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean h() {
        return W().optBoolean(C4564o5.H, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean i() {
        return W().optBoolean(C4564o5.E, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public int j() {
        String optString = W().optString(C4564o5.g);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(MAX_LOA…C_INSTANCES_INTERSTITIAL)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean k() {
        return W().optBoolean(C4564o5.k, true);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean l() {
        return Q();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean m() {
        return W().optBoolean(C4564o5.f, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean n() {
        return M();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public long o() {
        String optString = W().optString(C4564o5.e);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean p() {
        return S();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean q() {
        return P();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean r() {
        return V();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean s() {
        return T();
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean t() {
        return W().optBoolean(C4564o5.m, true);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean u() {
        return W().optBoolean(C4564o5.F, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean v() {
        return W().optBoolean(C4564o5.A, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean w() {
        return W().optBoolean(C4564o5.l, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean x() {
        return W().optBoolean(C4564o5.j, false);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public int y() {
        String optString = W().optString(C4564o5.h);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(MAX_LOA…TATIC_INSTANCES_REWARDED)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4546n5
    public boolean z() {
        return W().optBoolean(C4564o5.G, true);
    }

    @Override // com.ironsource.InterfaceC4709w7.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f8296a;
        }
        this.f8296a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC4546n5
    public String a() {
        String optString = W().optString("controllerUrl", "");
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CONTROLLER_URL, \"\")");
        return optString;
    }
}
