package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q9 implements s9, o4 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f4971a;
    public final yi b;
    public final va c;
    public final j4 d;
    public final o4 e;
    public final fa f;
    public final r9 g;
    public final zd h;
    public final r0 i;
    public final com.chartboost.sdk.internal.Model.a j;
    public boolean k;
    public Boolean l;
    public boolean m;

    public static final class a implements k4 {
        @Override // com.chartboost.sdk.impl.k4
        public void a(JSONObject jSONObject) {
            String str;
            if (jSONObject == null || (str = jSONObject.toString()) == null) {
                str = "";
            }
            mb.b("onClickRequestSuccess " + str, (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.k4
        public void a(String str) {
            mb.b("onClickRequestFailure " + str, (Throwable) null, 2, (Object) null);
        }
    }

    public q9(d0 adUnit, yi urlResolver, va intentResolver, j4 clickRequest, o4 clickTracking, fa mediaType, r9 impressionCallback, zd openMeasurementImpressionCallback, r0 adUnitRendererImpressionCallback, com.chartboost.sdk.internal.Model.a sdkConfig) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f4971a = adUnit;
        this.b = urlResolver;
        this.c = intentResolver;
        this.d = clickRequest;
        this.e = clickTracking;
        this.f = mediaType;
        this.g = impressionCallback;
        this.h = openMeasurementImpressionCallback;
        this.i = adUnitRendererImpressionCallback;
        this.j = sdkConfig;
    }

    @Override // com.chartboost.sdk.impl.o4
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.e.a(message);
    }

    @Override // com.chartboost.sdk.impl.o4
    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.e.b(message);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void c(boolean z) {
        this.k = z;
    }

    @Override // com.chartboost.sdk.impl.s9
    public void d() {
        this.i.b(this.f4971a.m());
        if (this.m) {
            this.g.s();
        }
    }

    public boolean a() {
        return this.k;
    }

    @Override // com.chartboost.sdk.impl.s9
    public void b(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        a(cbUrl.b(), cbUrl.a(), true);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void c(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        c(cbUrl.b());
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.d.a(new a(), new h4(location, this.f4971a.a(), this.f4971a.A(), this.f4971a.g(), this.f4971a.i(), f, f2, this.f, this.l));
    }

    public final void c(String str) {
        a(this.g, str, CBError.Click.LOAD_NOT_FINISHED);
    }

    public final void d(String str) {
        this.b.a(str, this.f4971a.h(), this.e, false, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0, (r23 & 128) != 0 ? null : null, (r23 & 256) != 0);
    }

    public /* synthetic */ q9(d0 d0Var, yi yiVar, va vaVar, j4 j4Var, o4 o4Var, fa faVar, r9 r9Var, zd zdVar, r0 r0Var, com.chartboost.sdk.internal.Model.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, yiVar, vaVar, j4Var, o4Var, faVar, r9Var, zdVar, r0Var, (i & 512) != 0 ? (com.chartboost.sdk.internal.Model.a) b4.b.b().b().get() : aVar);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.i.a(this.f4971a.m(), str, error);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        d(cbUrl.b());
    }

    @Override // com.chartboost.sdk.impl.s9
    public boolean a(String urlFromCreative, Boolean bool, ga impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        if (bool != null) {
            this.m = bool.booleanValue();
        }
        if (impressionState != ga.e) {
            return false;
        }
        if (!this.j.A || StringsKt.isBlank(urlFromCreative)) {
            urlFromCreative = this.f4971a.o();
        }
        String k = this.f4971a.k();
        if (this.c.b(k)) {
            this.l = Boolean.TRUE;
            urlFromCreative = k;
        } else {
            this.l = Boolean.FALSE;
        }
        if (a()) {
            return false;
        }
        c(true);
        this.g.b(false);
        a(urlFromCreative, Boolean.valueOf(this.m), true);
        return true;
    }

    public final void a(String str, Boolean bool, boolean z) {
        CBError.Click a2;
        this.h.c();
        if (bool != null) {
            this.m = bool.booleanValue();
        }
        a2 = this.b.a(str, this.f4971a.h(), this.e, z, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0, (r23 & 128) != 0 ? null : null, (r23 & 256) != 0);
        if (a2 != null) {
            a(this.g, str, a2);
        } else {
            a(this.g, str);
        }
    }

    public final void a(r9 r9Var, final String str) {
        a(r9Var, new Function1() { // from class: com.chartboost.sdk.impl.q9$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q9.a(q9.this, str, (r9) obj);
            }
        });
    }

    public static final Unit a(q9 q9Var, String str, r9 notify) {
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.d();
        q9Var.a("Url impression callback success: " + str);
        return Unit.INSTANCE;
    }

    public final void a(r9 r9Var, final String str, final CBError.Click click) {
        a(r9Var, new Function1() { // from class: com.chartboost.sdk.impl.q9$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q9.a(str, click, this, (r9) obj);
            }
        });
    }

    public static final Unit a(String str, CBError.Click click, q9 q9Var, r9 notify) {
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.a(str, click);
        q9Var.b("Impression click callback for: " + str + " failed with error: " + click);
        return Unit.INSTANCE;
    }

    public final void a(r9 r9Var, Function1 function1) {
        if (r9Var != null) {
            r9Var.a(false);
            function1.invoke(r9Var);
        } else {
            mb.b("Impression callback is null", (Throwable) null, 2, (Object) null);
        }
    }
}
