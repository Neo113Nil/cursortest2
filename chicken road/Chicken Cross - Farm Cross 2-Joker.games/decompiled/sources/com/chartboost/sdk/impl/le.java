package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.impl.w;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class le implements w, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f4862a;
    public final c0 b;
    public final v6 c;
    public final ee d;
    public final Function1 e;
    public final Function0 f;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public static final a b = new a();

        public a() {
            super(1, JSONObject.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String str) {
            return new JSONObject(str);
        }
    }

    public le(c0 adType, v6 downloader, ee openRTBAdUnitParser, Function1 jsonFactory, Function0 androidVersion, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f4862a = eventTracker;
        this.b = adType;
        this.c = downloader;
        this.d = openRTBAdUnitParser;
        this.e = jsonFactory;
        this.f = androidVersion;
    }

    public String a(JSONObject jSONObject, String str, String str2) {
        return w.a.a(this, jSONObject, str, str2);
    }

    public final void b(Function1 function1, hb hbVar) {
        g.a aVar = g.a.h;
        String d = hbVar.a().d();
        String c = hbVar.a().c();
        if (c == null) {
            c = "";
        }
        a(aVar, d, c, "Invalid bid response");
        function1.invoke(new ib(hbVar.a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void c(Function1 function1, hb hbVar) {
        function1.invoke(new ib(hbVar.a(), null, new CBError(CBError.Internal.UNSUPPORTED_OS_VERSION, "Unsupported Android version " + Build.VERSION.SDK_INT), 0L, 0L, 26, null));
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4862a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4862a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4862a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f4862a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f4862a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4862a.track(fVar);
    }

    public static final int a() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4862a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4862a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4862a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f4862a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4862a.mo4759track(event);
    }

    @Override // com.chartboost.sdk.impl.w
    public void a(hb params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((Number) this.f.invoke()).intValue() < 21) {
            c(callback, params);
            return;
        }
        if (!a(params)) {
            b(callback, params);
            return;
        }
        try {
            String c = params.a().c();
            a(params, this.d.a(this.b, c != null ? (JSONObject) this.e.invoke(c) : null), callback);
        } catch (JSONException e) {
            a(callback, params, e);
        }
    }

    public /* synthetic */ le(c0 c0Var, v6 v6Var, ee eeVar, Function1 function1, Function0 function0, i7 i7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, v6Var, eeVar, (i & 8) != 0 ? a.b : function1, (i & 16) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.le$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(le.a());
            }
        } : function0, i7Var);
    }

    public final void a(Function1 function1, hb hbVar, Exception exc) {
        g.a aVar = g.a.h;
        String d = hbVar.a().d();
        String c = hbVar.a().c();
        if (c == null) {
            c = "";
        }
        a(aVar, d, c, exc.toString());
        function1.invoke(new ib(hbVar.a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void a(final hb hbVar, final d0 d0Var, final Function1 function1) {
        a(this.c, d0Var, new u1() { // from class: com.chartboost.sdk.impl.le$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.u1
            public final void a(boolean z) {
                le.a(le.this, function1, hbVar, d0Var, z);
            }
        });
    }

    public static final void a(le leVar, Function1 function1, hb hbVar, d0 d0Var, boolean z) {
        if (z) {
            leVar.a(function1, hbVar, d0Var);
        } else {
            leVar.a(function1, hbVar);
        }
    }

    public final void a(Function1 function1, hb hbVar, d0 d0Var) {
        function1.invoke(new ib(hbVar.a(), d0Var, null, 0L, 0L, 24, null));
    }

    public final void a(Function1 function1, hb hbVar) {
        g.a aVar = g.a.i;
        String d = hbVar.a().d();
        String c = hbVar.a().c();
        if (c == null) {
            c = "";
        }
        a(aVar, d, c, CBError.Impression.ASSETS_DOWNLOAD_FAILURE.name());
        function1.invoke(new ib(hbVar.a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    public final void a(v6 v6Var, d0 d0Var, u1 u1Var) {
        Map d = d0Var.d();
        AtomicInteger atomicInteger = new AtomicInteger();
        v6Var.c();
        v6Var.a(ue.d, d, atomicInteger, u1Var, this.b.b());
    }

    public final void a(com.chartboost.sdk.tracking.g gVar, String str, String str2, String str3) {
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(gVar, a(new JSONObject(), str3, str2), this.b.b(), str, null, null, 48, null));
    }

    public final boolean a(hb hbVar) {
        String c;
        return hbVar.a().d().length() > 0 && (c = hbVar.a().c()) != null && c.length() > 0;
    }
}
