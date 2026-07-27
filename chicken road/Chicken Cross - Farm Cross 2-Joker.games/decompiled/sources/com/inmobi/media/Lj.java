package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Lj extends Gj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mj f6698a;
    public final /* synthetic */ yq b;
    public final /* synthetic */ C3715fk c;

    public Lj(Mj mj, yq yqVar, C3715fk c3715fk) {
        this.f6698a = mj;
        this.b = yqVar;
        this.c = c3715fk;
    }

    public static final void a(yq yqVar, C3715fk c3715fk, Mj mj, Ej ej) {
        String id = c3715fk.f7109a;
        yqVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Ej ej2 = (Ej) yqVar.b.get(id);
        if (ej2 == null) {
            Y9 logger = mj.getLogger();
            if (logger != null) {
                ((Z9) logger).b(mj.n1, "Source RenderView not found for id: " + c3715fk.f7109a);
                return;
            }
            return;
        }
        Integer a2 = ej.getWvStateMachine().a(3);
        if (a2 != null) {
            int intValue = a2.intValue();
            Y9 logger2 = mj.getLogger();
            if (logger2 != null) {
                ((Z9) logger2).b(mj.n1, "Failed to transition to FIRE_AD_FAILED state: " + intValue);
            }
            ej2.b("loadWebView", Vj.a(ej.getRoute().b, intValue));
        }
    }

    public static final void b(yq yqVar, C3715fk c3715fk, Mj mj, Ej ej) {
        String id = c3715fk.f7109a;
        yqVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Ej ej2 = (Ej) yqVar.b.get(id);
        if (ej2 == null) {
            Y9 logger = mj.getLogger();
            if (logger != null) {
                ((Z9) logger).b(mj.n1, "Source RenderView not found for id: " + c3715fk.f7109a);
                return;
            }
            return;
        }
        Integer a2 = ej.getWvStateMachine().a(2);
        if (a2 == null) {
            mj.b(ej2, c3715fk.b);
            return;
        }
        int intValue = a2.intValue();
        Y9 logger2 = mj.getLogger();
        if (logger2 != null) {
            ((Z9) logger2).b(mj.n1, "Failed to transition to FIRE_AD_READY state: " + intValue);
        }
        ej2.b("loadWebView", Vj.a(ej.getRoute().b, intValue));
    }

    @Override // com.inmobi.media.Gj
    public final void c() {
    }

    @Override // com.inmobi.media.Gj
    public final void e(Ej renderView) {
        Ej adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.Gj
    public final void f(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.Gj
    public final void g(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.Gj
    public final void h(final Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Lazy lazy = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        final yq yqVar = this.b;
        final C3715fk c3715fk = this.c;
        final Mj mj = this.f6698a;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Lj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Lj.b(yq.this, c3715fk, mj, renderView);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @Override // com.inmobi.media.Gj
    public final void i(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.Gj
    public final void j(Ej renderView) {
        Ej adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().j(adRenderView);
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(Ej renderView, final boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Wc wc = (Wc) P6.e.getValue();
        final Mj mj = this.f6698a;
        final C3715fk c3715fk = this.c;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Lj$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Lj.a(Mj.this, c3715fk, z);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @Override // com.inmobi.media.Gj
    public final void b(Ej renderView) {
        Ej adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(C4113tm telemetryOnAdImpression) {
        Ej adRenderView;
        Gj listener;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.Gj
    public final void a(final Ej renderView, String errorCode) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Lazy lazy = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        final yq yqVar = this.b;
        final C3715fk c3715fk = this.c;
        final Mj mj = this.f6698a;
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Lj$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Lj.a(yq.this, c3715fk, mj, renderView);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @Override // com.inmobi.media.Gj
    public final void a(HashMap params) {
        Ej adRenderView;
        Intrinsics.checkNotNullParameter(params, "params");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(params);
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(String eventType, HashMap kv) {
        Ej adRenderView;
        Gj listener;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv);
    }

    @Override // com.inmobi.media.Gj, com.inmobi.media.InterfaceC3917mn
    public final void a() {
        Ej adRenderView;
        Gj listener;
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.Gj
    public final void a(Ej renderView, String trackerName, Map macros) {
        Ej adRenderView;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(EnumC3952o2 audioStatusInternal) {
        Ej adRenderView;
        Gj listener;
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.Gj
    public final void a(boolean z) {
        Ej adRenderView;
        Gj listener;
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z);
    }

    @Override // com.inmobi.media.Gj
    public final void a(String data) {
        Ej adRenderView;
        Gj listener;
        Intrinsics.checkNotNullParameter(data, "data");
        adRenderView = this.f6698a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    public static final void a(Mj mj, C3715fk c3715fk, boolean z) {
        Ej adRenderView;
        if (mj.getWvStateMachine().a(4) != null) {
            mj.b("loadWebView", Vj.a(c3715fk.b, 307));
        }
        adRenderView = mj.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z);
        }
    }
}
