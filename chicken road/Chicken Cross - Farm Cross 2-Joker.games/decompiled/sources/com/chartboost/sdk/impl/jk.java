package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.tracking.g;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jk extends m3 implements g1 {
    public static final a e0 = new a(null);
    public final k8 O;
    public final lk P;
    public final String Q;
    public final Mediation R;
    public final Function5 S;
    public final String T;
    public final da U;
    public final id V;
    public final i7 W;
    public final Function1 X;
    public long Y;
    public long Z;
    public long a0;
    public int b0;
    public xj c0;
    public f1 d0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ jk(Context context, String str, bc bcVar, String str2, oi oiVar, k8 k8Var, j3 j3Var, lk lkVar, String str3, Mediation mediation, Function5 function5, e3 e3Var, String str4, zd zdVar, r0 r0Var, da daVar, ml mlVar, id idVar, i7 i7Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bcVar, str2, oiVar, k8Var, j3Var, lkVar, str3, mediation, function5, e3Var, str4, zdVar, r0Var, daVar, mlVar, idVar, i7Var, (i & 524288) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.jk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jk.c((Context) obj);
            }
        } : function1);
    }

    public static final n3 c(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new n3(it);
    }

    public final void E() {
        F();
    }

    public final void F() {
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.stop();
        }
        xj xjVar = this.c0;
        if (xjVar != null) {
            xjVar.b();
        }
        this.d0 = null;
        this.c0 = null;
    }

    public final int G() {
        mb.a("getAssetDownloadStateNow()", (Throwable) null, 2, (Object) null);
        wj a2 = this.P.a(this.Q);
        if (a2 != null) {
            return this.P.a(a2);
        }
        return 0;
    }

    public final n3 H() {
        xj xjVar = this.c0;
        if (xjVar != null) {
            return xjVar.getWebView();
        }
        return null;
    }

    public final void I() {
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.f();
        }
        n().a(0.0f);
    }

    public final void J() {
        j3 q = q();
        if (q != null) {
            q.c(H(), l(), g());
        }
    }

    public final void K() {
        mb.a("notifyTemplateVideoStarted() duration: " + this.Y, (Throwable) null, 2, (Object) null);
        j3 q = q();
        if (q != null) {
            q.b(H(), this.Y / 1000.0f, l(), g());
        }
    }

    public final void L() {
        mb.a("pauseVideo()", (Throwable) null, 2, (Object) null);
        n().a();
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.pause();
        }
    }

    public final void M() {
        mb.a("playVideo()", (Throwable) null, 2, (Object) null);
        N();
        this.Z = hh.a();
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.play();
        }
    }

    public final void N() {
        n().a(PlayerState.FULLSCREEN);
        f1 f1Var = this.d0;
        if (f1Var == null || f1Var.g()) {
            n().e();
            return;
        }
        zd n = n();
        float f = this.Y / 1000.0f;
        f1 f1Var2 = this.d0;
        n.a(f, f1Var2 != null ? f1Var2.h() : 1.0f);
    }

    public final void O() {
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.c();
        }
        n().a(1.0f);
    }

    @Override // com.chartboost.sdk.impl.g1
    public void a() {
        mb.a("onVideoDisplayStarted", (Throwable) null, 2, (Object) null);
        K();
        this.a0 = hh.a();
    }

    @Override // com.chartboost.sdk.impl.m3
    public qk b(Context context) {
        xj xjVar;
        Intrinsics.checkNotNullParameter(context, "context");
        this.V.a(this.U);
        mb.a("createViewObject()", (Throwable) null, 2, (Object) null);
        try {
            SurfaceView surfaceView = new SurfaceView(context);
            try {
                xjVar = new xj(context, this.T, j(), this.U, this.V, h(), surfaceView, null, this.W, this.X, 128, null);
            } catch (Exception e) {
                c("Can't instantiate VideoBase: " + e);
                xjVar = null;
            }
            this.c0 = xjVar;
            f1 f1Var = (f1) this.S.invoke(context, surfaceView, this, r(), this.O);
            wj a2 = this.P.a(this.Q);
            if (a2 != null) {
                f1Var.a(a2);
            } else {
                mb.b("Video asset not found in the repository", (Throwable) null, 2, (Object) null);
            }
            this.d0 = f1Var;
            return this.c0;
        } catch (Exception e2) {
            c("Can't instantiate SurfaceView: " + e2);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.g1
    public void d() {
        mb.a("onVideoDisplayCompleted", (Throwable) null, 2, (Object) null);
        a(true);
        J();
        n().b();
    }

    public final void e(String str) {
        long a2;
        long j;
        com.chartboost.sdk.tracking.b bVar = new com.chartboost.sdk.tracking.b(g.j.d, str, g(), l(), this.R);
        if (this.a0 == 0) {
            a2 = this.Z;
            j = hh.a();
        } else {
            a2 = hh.a();
            j = this.a0;
        }
        bVar.a(a2 - j);
        bVar.a(true);
        bVar.b(false);
        track((com.chartboost.sdk.tracking.f) bVar);
    }

    @Override // com.chartboost.sdk.impl.m3
    public void f() {
        mb.a("destroyView()", (Throwable) null, 2, (Object) null);
        F();
        super.f();
    }

    @Override // com.chartboost.sdk.impl.m3
    public void w() {
        xj xjVar = this.c0;
        int width = xjVar != null ? xjVar.getWidth() : 0;
        xj xjVar2 = this.c0;
        int height = xjVar2 != null ? xjVar2.getHeight() : 0;
        f1 f1Var = this.d0;
        if (!(f1Var instanceof kg)) {
            f1Var = null;
        }
        if (f1Var != null) {
            f1Var.a(width, height);
        }
    }

    @Override // com.chartboost.sdk.impl.m3
    public void y() {
        mb.c("onPause()", null, 2, null);
        f1 f1Var = this.d0;
        if (f1Var != null) {
            f1Var.pause();
        }
        super.y();
    }

    @Override // com.chartboost.sdk.impl.m3
    public void z() {
        mb.c("onResume()", null, 2, null);
        this.P.a(null, 1, false);
        f1 f1Var = this.d0;
        if (f1Var != null) {
            c2 c2Var = f1Var instanceof c2 ? (c2) f1Var : null;
            if (c2Var != null) {
                c2Var.a();
            }
            f1Var.play();
        }
        super.z();
    }

    @Override // com.chartboost.sdk.impl.g1
    public void c() {
        n().a(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(Context context, String location, bc mtype, String adUnitParameters, oi uiPoster, k8 fileCache, j3 templateProxy, lk videoRepository, String videoFilename, Mediation mediation, Function5 adsVideoPlayerFactory, e3 networkService, String templateHtml, zd openMeasurementImpressionCallback, r0 adUnitRendererImpressionCallback, da impressionInterface, ml webViewTimeoutInterface, id nativeBridgeCommand, i7 eventTracker, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, networkService, templateProxy, mediation, templateHtml, openMeasurementImpressionCallback, adUnitRendererImpressionCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(adsVideoPlayerFactory, "adsVideoPlayerFactory");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(templateHtml, "templateHtml");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.O = fileCache;
        this.P = videoRepository;
        this.Q = videoFilename;
        this.R = mediation;
        this.S = adsVideoPlayerFactory;
        this.T = templateHtml;
        this.U = impressionInterface;
        this.V = nativeBridgeCommand;
        this.W = eventTracker;
        this.X = cbWebViewFactory;
    }

    @Override // com.chartboost.sdk.impl.g1
    public void a(long j) {
        float f = j / 1000.0f;
        float f2 = this.Y / 1000.0f;
        if (jg.f4829a.d()) {
            mb.c("onVideoDisplayProgress: " + f + "/" + f2, null, 2, null);
        }
        j3 q = q();
        if (q != null) {
            q.a(H(), f, l(), g());
        }
        a(f2, f);
    }

    public final void f(String str) {
        com.chartboost.sdk.tracking.e eVar = new com.chartboost.sdk.tracking.e(g.j.c, str, g(), l(), this.R, null, 32, null);
        eVar.a(this.a0 - this.Z);
        eVar.a(true);
        eVar.b(false);
        track((com.chartboost.sdk.tracking.f) eVar);
    }

    @Override // com.chartboost.sdk.impl.g1
    public void a(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        mb.a("onVideoDisplayError: " + error, (Throwable) null, 2, (Object) null);
        a(false);
        j3 q = q();
        if (q != null) {
            q.d(H(), l(), g());
        }
        F();
        c(error);
    }

    public final void a(boolean z) {
        String valueOf = String.valueOf(this.b0);
        if (z) {
            f(valueOf);
        } else {
            e(valueOf);
        }
    }

    @Override // com.chartboost.sdk.impl.g1
    public void b(long j) {
        mb.a("onVideoDisplayPrepared ready to receive signal from template, duration: " + j, (Throwable) null, 2, (Object) null);
        this.b0 = G();
        this.Y = j;
        x();
    }

    @Override // com.chartboost.sdk.impl.g1
    public void b() {
        n().a(true);
    }
}
