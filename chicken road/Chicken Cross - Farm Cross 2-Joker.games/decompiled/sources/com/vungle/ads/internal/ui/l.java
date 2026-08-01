package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.ironsource.U3;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.model.s3;
import com.vungle.ads.internal.presenter.f0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.v0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class l extends Activity {
    public static volatile v0 h;
    public static volatile com.vungle.ads.internal.presenter.a i;

    /* renamed from: a, reason: collision with root package name */
    public com.vungle.ads.internal.presenter.r f12154a;
    public s3 b;
    public Object c;
    public com.vungle.ads.internal.util.s e;
    public final com.vungle.ads.internal.util.w d = new com.vungle.ads.internal.util.w();
    public final b f = new b(this);
    public final AtomicBoolean g = new AtomicBoolean(false);

    static {
        new a();
    }

    public static final void b(l this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.presenter.r rVar = this$0.f12154a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AdActivity", new c(i2, i3, intent));
        if (i2 == 10001) {
            this.g.set(false);
            com.vungle.ads.internal.presenter.r rVar = this.f12154a;
            if (rVar != null) {
                k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                k2Var.c = 1L;
                AnalyticsClient.INSTANCE.a(k2Var, rVar.b(), "onActivityResultCode=" + i3);
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        com.vungle.ads.internal.presenter.r rVar = this.f12154a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i2 = newConfig.orientation;
            if (i2 == 2) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("AdActivity", U3.i.C);
            } else if (i2 == 1) {
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("AdActivity", U3.i.D);
            }
            com.vungle.ads.internal.presenter.r rVar = this.f12154a;
            if (rVar != null) {
                rVar.g();
            }
        } catch (Exception e) {
            boolean z3 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("AdActivity", com.iab.omid.library.vungle.internal.l.a("onConfigurationChanged: ").append(e.getLocalizedMessage()).toString());
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        v0 v0Var = h;
        com.vungle.ads.internal.presenter.a aVar = i;
        if (v0Var == null) {
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            String b = a.b(intent);
            if (b == null) {
                b = "";
            }
            if (aVar != null) {
                aVar.a(new AdNotLoadedCantPlay("Can not play fullscreen ad. placement=" + b + " pendingData is null").setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b);
            }
            finish();
            return;
        }
        i0 a2 = v0Var.a();
        j3 b2 = v0Var.b();
        com.vungle.ads.internal.presenter.z c = v0Var.c();
        this.e = a2.q();
        try {
            com.vungle.ads.internal.ui.view.j jVar = new com.vungle.ads.internal.ui.view.j(this, a2.h());
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            long j = getIntent().getBooleanExtra("ad_invisible_logged", false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            k2Var.a(Long.valueOf(j));
            AnalyticsClient.a(analyticsClient, k2Var, this.e, 4);
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("AdActivity", "Log metric AD_VISIBILITY: " + j);
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new d(this));
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            String a3 = a.a(intent2);
            FrameLayout frameLayout = null;
            s3 s3Var = a3 != null ? new s3(a3) : null;
            this.b = s3Var;
            if (s3Var != null) {
                ((com.vungle.ads.internal.signals.j) lazy.getValue()).a(s3Var);
            }
            jVar.setCloseDelegate(new h(this, lazy));
            jVar.setOnViewTouchListener(new i(this));
            jVar.setOrientationDelegate(new j(this));
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new e(this));
            Lazy lazy3 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new f(this));
            com.vungle.ads.internal.executor.j f = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) lazy2.getValue())).f();
            ReentrantLock reentrantLock = f0.f12088a;
            z a4 = f0.a(a2, b2, f, (com.vungle.ads.internal.platform.f) lazy3.getValue());
            com.vungle.ads.internal.omsdk.d dVar = (com.vungle.ads.internal.omsdk.d) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new g(this)).getValue();
            boolean C = a2.C();
            dVar.getClass();
            com.vungle.ads.internal.omsdk.e a5 = com.vungle.ads.internal.omsdk.d.a(C);
            com.vungle.ads.internal.executor.j d = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) lazy2.getValue())).d();
            a4.a(a5);
            this.d.a(a4);
            com.vungle.ads.internal.presenter.r rVar = new com.vungle.ads.internal.presenter.r(jVar, a2, b2, a4, d, a5, (com.vungle.ads.internal.platform.f) lazy3.getValue());
            rVar.a(aVar);
            rVar.a(c);
            rVar.a(new k(this));
            rVar.h();
            setContentView(jVar, jVar.getLayoutParams());
            try {
                Result.Companion companion = Result.INSTANCE;
                getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            ViewCompat.setOnApplyWindowInsetsListener(jVar, new OnApplyWindowInsetsListener() { // from class: com.vungle.ads.internal.ui.l$$ExternalSyntheticLambda1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return l.a(l.this, view, windowInsetsCompat);
                }
            });
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.systemBars());
            AdConfig j2 = a2.j();
            if (j2 != null && (watermark$vungle_ads_release = j2.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    a0 a0Var = new a0(this, watermark$vungle_ads_release);
                    frameLayout.addView(a0Var);
                    a0Var.bringToFront();
                }
            }
            this.f12154a = rVar;
            if (Build.VERSION.SDK_INT >= 33) {
                a();
            }
            com.vungle.ads.internal.util.d dVar2 = com.vungle.ads.internal.util.d.f;
            com.vungle.ads.internal.util.a.a(this.f);
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m8079constructorimpl(registerReceiver(this.d, new IntentFilter("android.media.RINGER_MODE_CHANGED")));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th2));
            }
        } catch (InstantiationException e) {
            if (aVar != null) {
                aVar.a(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), b2.b());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.c;
            OnBackInvokedCallback onBackInvokedCallback = obj instanceof OnBackInvokedCallback ? (OnBackInvokedCallback) obj : null;
            if (onBackInvokedCallback != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
            }
            this.c = null;
        }
        com.vungle.ads.internal.presenter.r rVar = this.f12154a;
        if (rVar != null) {
            rVar.a((isChangingConfigurations() ? 1 : 0) | 2);
        }
        com.vungle.ads.internal.presenter.r rVar2 = this.f12154a;
        if (rVar2 != null) {
            rVar2.a((k) null);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.b(this.f);
        try {
            Result.Companion companion = Result.INSTANCE;
            unregisterReceiver(this.d);
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        this.f12154a = null;
        i = null;
        h = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent()");
        Pair pair = TuplesKt.to(a.b(intent2), a.b(intent));
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent()");
        Pair pair2 = TuplesKt.to(a.a(intent3), a.a(intent));
        String str3 = (String) pair2.component1();
        String str4 = (String) pair2.component2();
        if ((str == null || str2 == null || Intrinsics.areEqual(str, str2)) && (str3 == null || str4 == null || Intrinsics.areEqual(str3, str4))) {
            return;
        }
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AdActivity", "Tried to play another placement " + str2 + " while playing " + str);
        VungleError logError$vungle_ads_release = new ConcurrentPlaybackUnsupported("Trying to show " + str2 + " but " + str + " is already showing").setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar = i;
        if (aVar != null) {
            aVar.a(logError$vungle_ads_release, str2);
        }
        com.vungle.ads.internal.util.t.b("AdActivity", com.iab.omid.library.vungle.internal.l.a("onConcurrentPlaybackError: ").append(logError$vungle_ads_release.getLocalizedMessage()).toString());
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.r rVar = this.f12154a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "stop()");
            rVar.f12100a.b();
            rVar.d.b(false);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        com.vungle.ads.internal.presenter.r rVar = this.f12154a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "start()");
            rVar.f12100a.d();
            rVar.d.b(true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.systemBars());
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i2) {
        super.setRequestedOrientation(i2);
    }

    public static final com.vungle.ads.internal.signals.j a(Lazy lazy) {
        return (com.vungle.ads.internal.signals.j) lazy.getValue();
    }

    public static final WindowInsetsCompat a(l this$0, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!this$0.g.get()) {
            Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(\n      …t()\n                    )");
            v.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
        }
        return insets;
    }

    public final void a() {
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.vungle.ads.internal.ui.l$$ExternalSyntheticLambda0
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                l.b(l.this);
            }
        };
        this.c = onBackInvokedCallback;
        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, onBackInvokedCallback);
    }
}
