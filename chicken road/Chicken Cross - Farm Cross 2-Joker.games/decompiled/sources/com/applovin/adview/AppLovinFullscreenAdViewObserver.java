package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.r2;
import com.applovin.impl.y1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Lifecycle f4093a;
    private r2 b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private y1 d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, r2 r2Var) {
        this.f4093a = lifecycle;
        this.b = r2Var;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f4093a.removeObserver(this);
        r2 r2Var = this.b;
        if (r2Var != null) {
            r2Var.a();
            this.b = null;
        }
        y1 y1Var = this.d;
        if (y1Var != null) {
            y1Var.a("lifecycle_on_destroy");
            this.d.r();
            this.d = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        y1 y1Var = this.d;
        if (y1Var != null) {
            y1Var.s();
            this.d.v();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        y1 y1Var;
        if (this.c.getAndSet(false) || (y1Var = this.d) == null) {
            return;
        }
        y1Var.t();
        this.d.b(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        y1 y1Var = this.d;
        if (y1Var != null) {
            y1Var.u();
        }
    }

    public void setPresenter(y1 y1Var) {
        this.d = y1Var;
    }
}
