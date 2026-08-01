package com.chartboost.sdk.impl;

import android.app.Activity;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o9 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final m9 f4926a;
    public final uf b;
    public final com.chartboost.sdk.internal.Model.a c;
    public final q6 d;
    public int e;

    public o9(m9 view, uf rendererActivityBridge, com.chartboost.sdk.internal.Model.a sdkConfiguration, q6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.f4926a = view;
        this.b = rendererActivityBridge;
        this.c = sdkConfiguration;
        this.d = displayMeasurement;
        this.e = -1;
    }

    @Override // com.chartboost.sdk.impl.b
    public void a(qk viewBase) {
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        this.f4926a.attachViewToActivity(viewBase);
    }

    public void b() {
        try {
            this.b.e();
        } catch (Exception e) {
            mb.a("Cannot perform onStop", e);
        }
    }

    public void c() {
        this.b.a(this, this.f4926a.getActivity());
        this.f4926a.setFullscreen();
        i();
    }

    public void d() {
        try {
            this.b.b();
        } catch (Exception e) {
            mb.a("Cannot perform onStop", e);
        }
    }

    public void e() {
        try {
            this.b.c();
        } catch (Exception e) {
            mb.a("Cannot perform onPause", e);
        }
        try {
            je.a(this.f4926a.getActivity(), this.c);
        } catch (Exception e2) {
            mb.a("Cannot lock the orientation in activity", e2);
        }
    }

    public void f() {
        try {
            this.b.a(this, this.f4926a.getActivity());
        } catch (Exception e) {
            mb.a("Cannot setActivityRendererInterface", e);
        }
        try {
            this.b.onResume();
        } catch (Exception e2) {
            mb.a("Cannot perform onResume", e2);
        }
        this.f4926a.setFullscreen();
        try {
            je.a(this.f4926a.getActivity(), this.c, this.d);
        } catch (Exception e3) {
            mb.a("Cannot lock the orientation in activity", e3);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void finishActivity() {
        this.f4926a.finishActivity();
    }

    public void g() {
        try {
            this.b.onStart();
        } catch (Exception e) {
            mb.a("Cannot perform onResume", e);
        }
    }

    public void h() {
        try {
            if (this.f4926a.isActivityHardwareAccelerated()) {
                return;
            }
            mb.b("The activity passed down is not hardware accelerated, so Chartboost cannot show ads", (Throwable) null, 2, (Object) null);
            this.b.a(CBError.Impression.HARDWARE_ACCELERATION_DISABLED);
            this.f4926a.finishActivity();
        } catch (Exception e) {
            mb.b("onAttachedToWindow", e);
        }
    }

    public final void i() {
        try {
            this.e = this.f4926a.getActivity().getRequestedOrientation();
        } catch (Exception e) {
            mb.b("saveOriginalOrientation: ", e);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void a(int i, boolean z) {
        int i2;
        try {
            CBImpressionActivity activity = this.f4926a.getActivity();
            if (je.a((Activity) activity)) {
                return;
            }
            i();
            if (i != 0) {
                i2 = 1;
                if (i != 1) {
                    i2 = z ? -1 : activity.getResources().getConfiguration().orientation;
                }
            } else {
                i2 = 0;
            }
            activity.setRequestedOrientation(i2);
        } catch (Exception e) {
            mb.b("applyOrientationProperties: ", e);
        }
    }

    @Override // com.chartboost.sdk.impl.b
    public void a() {
        try {
            CBImpressionActivity activity = this.f4926a.getActivity();
            if (je.a((Activity) activity)) {
                return;
            }
            int requestedOrientation = activity.getRequestedOrientation();
            int i = this.e;
            if (requestedOrientation != i) {
                mb.b("restoreOriginalOrientation: " + i, (Throwable) null, 2, (Object) null);
                activity.setRequestedOrientation(this.e);
            }
        } catch (Exception e) {
            mb.b("restoreOriginalOrientation: ", e);
        }
    }
}
