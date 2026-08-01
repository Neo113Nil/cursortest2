package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vf implements uf, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f5047a;
    public final n9 b;
    public WeakReference c;
    public WeakReference d;
    public boolean e;

    public vf(n9 impressionActivityIntentWrapper, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(impressionActivityIntentWrapper, "impressionActivityIntentWrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f5047a = eventTracker;
        this.b = impressionActivityIntentWrapper;
    }

    @Override // com.chartboost.sdk.impl.uf
    public void a(b activityInterface, CBImpressionActivity activity) {
        p0 p0Var;
        Intrinsics.checkNotNullParameter(activityInterface, "activityInterface");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.c = new WeakReference(activityInterface);
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            return;
        }
        p0Var.a(activity);
    }

    @Override // com.chartboost.sdk.impl.uf
    public void b() {
        p0 p0Var;
        d();
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            mb.a("Bridge onDestroy missing callback to renderer", (Throwable) null, 2, (Object) null);
        } else {
            p0Var.B();
        }
        WeakReference weakReference2 = this.c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference weakReference3 = this.d;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
    }

    @Override // com.chartboost.sdk.impl.uf
    public void c() {
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            mb.a("Bridge onPause missing callback to renderer", (Throwable) null, 2, (Object) null);
        } else {
            p0Var.p();
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f5047a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5047a.clearFromStorage(fVar);
    }

    public final void d() {
        if (this.e) {
            return;
        }
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(g.i.o, "dismiss_missing happened due to sdk closure outside expected flow", null, null, null, 28, null));
    }

    @Override // com.chartboost.sdk.impl.uf
    public void e() {
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            return;
        }
        p0Var.e();
    }

    @Override // com.chartboost.sdk.impl.uf
    public void finishActivity() {
        b bVar;
        this.e = true;
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.finishActivity();
    }

    @Override // com.chartboost.sdk.impl.uf
    public void onResume() {
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            mb.a("Bridge onResume missing callback to renderer", (Throwable) null, 2, (Object) null);
        } else {
            p0Var.n();
        }
    }

    @Override // com.chartboost.sdk.impl.uf
    public void onStart() {
        p0 p0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            mb.a("Bridge onStart missing callback to renderer", (Throwable) null, 2, (Object) null);
        } else {
            p0Var.l();
        }
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5047a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f5047a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f5047a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5047a.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5047a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5047a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f5047a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f5047a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5047a.mo4759track(event);
    }

    @Override // com.chartboost.sdk.impl.uf
    public void a(qk viewBase) {
        b bVar;
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            mb.a("activityInterface is null", (Throwable) null, 2, (Object) null);
        } else {
            bVar.a(viewBase);
        }
    }

    @Override // com.chartboost.sdk.impl.uf
    public void a(p0 adUnitRendererActivityInterface) {
        Intrinsics.checkNotNullParameter(adUnitRendererActivityInterface, "adUnitRendererActivityInterface");
        this.d = new WeakReference(adUnitRendererActivityInterface);
        try {
            n9 n9Var = this.b;
            n9Var.a(n9Var.a());
        } catch (Exception e) {
            mb.b("Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions", e);
            a(CBError.Impression.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }

    @Override // com.chartboost.sdk.impl.uf
    public void a(CBError.Impression error) {
        p0 p0Var;
        Intrinsics.checkNotNullParameter(error, "error");
        WeakReference weakReference = this.d;
        if (weakReference == null || (p0Var = (p0) weakReference.get()) == null) {
            return;
        }
        p0Var.a(error);
    }

    @Override // com.chartboost.sdk.impl.uf
    public void a(int i, boolean z) {
        b bVar;
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.a(i, z);
    }

    @Override // com.chartboost.sdk.impl.uf
    public void a() {
        b bVar;
        WeakReference weakReference = this.c;
        if (weakReference == null || (bVar = (b) weakReference.get()) == null) {
            return;
        }
        bVar.a();
    }
}
