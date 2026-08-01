package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ia implements ka {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f4806a;
    public final m3 b;
    public final v6 c;
    public final r0 d;
    public final ea e;
    public final r9 f;
    public final WeakReference g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public ia(p1 appRequest, m3 viewProtocol, v6 downloader, ViewGroup viewGroup, r0 adUnitRendererImpressionCallback, ea impressionIntermediateCallback, r9 impressionClickCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        this.f4806a = appRequest;
        this.b = viewProtocol;
        this.c = downloader;
        this.d = adUnitRendererImpressionCallback;
        this.e = impressionIntermediateCallback;
        this.f = impressionClickCallback;
        this.g = new WeakReference(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(boolean z) {
        this.h = z;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void b(boolean z) {
        this.l = z;
    }

    public void c(boolean z) {
        this.m = z;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void e(boolean z) {
        this.j = z;
    }

    @Override // com.chartboost.sdk.impl.ka
    public ViewGroup f() {
        return (ViewGroup) this.g.get();
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean g() {
        return this.l;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void h() {
        if (a()) {
            return;
        }
        c(true);
        if (g()) {
            this.e.b();
        } else {
            a(CBError.Impression.INTERNAL);
        }
        this.b.a(uj.k);
        this.e.g();
        this.b.C();
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean i() {
        return this.h;
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean j() {
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean k() {
        return this.i;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void l() {
        this.d.b(this.f4806a);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void onResume() {
        this.f.a(false);
        if (this.k) {
            this.k = false;
            this.b.z();
        }
    }

    @Override // com.chartboost.sdk.impl.ka
    public void onStart() {
        this.f.a(false);
    }

    public boolean a() {
        return this.m;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.b.y();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void e() {
        this.d.k();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void f(boolean z) {
        this.i = z;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.l = true;
        this.d.a(this.f4806a, error);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(ga state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (state != ga.c) {
            a(activity);
        } else {
            mb.a("displayOnActivity invalid state: " + state, (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(ViewGroup viewGroup) {
        try {
            if (viewGroup == null) {
                mb.b("Cannot display on host because it is null!", (Throwable) null, 2, (Object) null);
                a(CBError.Impression.ERROR_DISPLAYING_VIEW);
                return;
            }
            CBError.Impression a2 = this.b.a(viewGroup);
            if (a2 != null) {
                mb.b("displayOnHostView tryCreatingViewOnHostView error " + a2, (Throwable) null, 2, (Object) null);
                a(a2);
                return;
            }
            qk u = this.b.u();
            if (u != null) {
                a(viewGroup, u);
            } else {
                new Function0() { // from class: com.chartboost.sdk.impl.ia$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ia.a(ia.this);
                    }
                };
            }
        } catch (Exception e) {
            mb.b("displayOnHostView e", e);
            a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }

    public static final Unit a(ia iaVar) {
        mb.b("Cannot display on host because view was not created!", (Throwable) null, 2, (Object) null);
        iaVar.a(CBError.Impression.ERROR_CREATING_VIEW);
        return Unit.INSTANCE;
    }

    public final void a(ViewGroup viewGroup, View view) {
        Context context;
        this.e.a(ga.e);
        qk u = this.b.u();
        if (u != null && (context = u.getContext()) != null) {
            this.d.a(context);
        } else {
            mb.b("Missing context on onImpressionViewCreated", (Throwable) null, 2, (Object) null);
        }
        viewGroup.addView(view);
        this.c.a();
    }

    public final void a(CBImpressionActivity cBImpressionActivity) {
        this.e.a(ga.e);
        try {
            CBError.Impression a2 = this.b.a(cBImpressionActivity);
            if (a2 != null) {
                a(a2);
            } else {
                mb.c("Displaying the impression", null, 2, null);
            }
        } catch (Exception e) {
            mb.b("Cannot create view in protocol", e);
            a(CBError.Impression.ERROR_CREATING_VIEW);
        }
    }
}
