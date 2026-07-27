package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.impl.ce;
import com.chartboost.sdk.impl.dl;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yd implements zd {

    /* renamed from: a, reason: collision with root package name */
    public final ae f5090a;
    public final ce b;
    public de c;
    public dl d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5091a;

        static {
            int[] iArr = new int[hf.values().length];
            try {
                iArr[hf.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hf.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hf.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5091a = iArr;
        }
    }

    public yd(ae openMeasurementManager, ce openMeasurementSessionBuilder) {
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(openMeasurementSessionBuilder, "openMeasurementSessionBuilder");
        this.f5090a = openMeasurementManager;
        this.b = openMeasurementSessionBuilder;
    }

    public final void a(Context context, View trackedView, View rootView, dl.b visibilityTrackerListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedView, "trackedView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(visibilityTrackerListener, "visibilityTrackerListener");
        g();
        vd b = this.f5090a.b();
        dl dlVar = new dl(context, trackedView, rootView, b.a(), b.b(), b.f(), b.c(), false, 128, null);
        dlVar.a(visibilityTrackerListener);
        dlVar.i();
        this.d = dlVar;
    }

    @Override // com.chartboost.sdk.impl.zd
    public void b() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.d();
        } else {
            mb.a("onImpressionNotifyVideoComplete missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void c() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.k();
        } else {
            mb.a("onImpressionNotifyClick missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void d() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.i();
        } else {
            mb.a("onImpressionNotifyVideoSkipped missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void e() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.h();
        } else {
            mb.a("onImpressionNotifyVideoResumed missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void f() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.m();
        } else {
            mb.a("onImpressionDestroyWebview missing om tracker", (Throwable) null, 2, (Object) null);
        }
        this.c = null;
    }

    public final void g() {
        dl dlVar = this.d;
        if (dlVar != null) {
            dlVar.b();
        }
        this.d = null;
    }

    public final boolean h() {
        return this.f5090a.g();
    }

    public final void i() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.a();
        } else {
            mb.a("signalImpressionEvent missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    public final void j() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.m();
        }
        this.c = null;
    }

    public final void b(bc bcVar, n3 n3Var, Integer num, List list) {
        this.f5090a.e();
        j();
        ce.a a2 = this.b.a(n3Var, bcVar, this.f5090a.c(), this.f5090a.a(), list, this.f5090a.h(), this.f5090a.d());
        if (a2 != null) {
            this.c = new de(a2, this.f5090a.g());
        }
        a(num);
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a(bc mtype, n3 webview, Integer num, List verificationScriptResourcesList) {
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(webview, "webview");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        if (this.c != null && verificationScriptResourcesList.isEmpty()) {
            mb.a("OMSDK skipping session rebuild; tracker already active and no new verification resources", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            b(mtype, webview, num, verificationScriptResourcesList);
        } catch (Exception e) {
            mb.a("OMSDK Session error", e);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        de deVar = this.c;
        if (deVar != null) {
            deVar.a(view);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a(float f, float f2) {
        de deVar = this.c;
        if (deVar != null) {
            deVar.a(f, f2);
        } else {
            mb.a("onImpressionNotifyVideoStarted missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a(hf quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        de deVar = this.c;
        if (deVar != null) {
            int i = a.f5091a[quartile.ordinal()];
            if (i == 1) {
                deVar.e();
                return;
            } else if (i == 2) {
                deVar.f();
                return;
            } else {
                if (i == 3) {
                    deVar.j();
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        mb.a("onImpressionNotifyVideoProgress missing om tracker", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a() {
        de deVar = this.c;
        if (deVar != null) {
            deVar.g();
        } else {
            mb.a("onImpressionNotifyVideoPaused missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a(boolean z) {
        de deVar = this.c;
        if (deVar == null) {
            mb.a("onImpressionNotifyVideoBuffer missing om tracker", (Throwable) null, 2, (Object) null);
        } else if (z) {
            deVar.c();
        } else {
            deVar.b();
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a(float f) {
        de deVar = this.c;
        if (deVar != null) {
            deVar.a(f);
        } else {
            mb.a("onImpressionNotifyVolumeChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.zd
    public void a(PlayerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        de deVar = this.c;
        if (deVar != null) {
            deVar.a(state);
        } else {
            mb.a("onImpressionNotifyStateChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(Integer num) {
        de deVar = this.c;
        if (deVar != null) {
            deVar.l();
            deVar.a(num);
        } else {
            mb.a("startAndLoadSession missing tracker", (Throwable) null, 2, (Object) null);
        }
    }
}
