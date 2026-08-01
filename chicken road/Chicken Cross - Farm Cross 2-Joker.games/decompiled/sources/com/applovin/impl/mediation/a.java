package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.g3;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.t7;

/* loaded from: classes5.dex */
public class a extends com.applovin.impl.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f4311a;
    private final p b;
    private final String c;
    private InterfaceC0076a d;
    private g3 e;
    private String f;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0076a {
        void b(g3 g3Var);
    }

    a(l lVar) {
        this.b = lVar.Q();
        this.f4311a = lVar.e();
        this.c = t7.a(l.p(), "AdActivityObserver", lVar);
    }

    public void a(g3 g3Var, InterfaceC0076a interfaceC0076a) {
        if (p.a()) {
            this.b.a("AdActivityObserver", "Starting for ad " + g3Var.getAdUnitId() + "...");
        }
        a();
        this.d = interfaceC0076a;
        this.e = g3Var;
        this.f4311a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!activity.getClass().getName().equals(this.c) || !this.e.C0()) {
            if (this.f == null) {
                this.f = activity.getClass().getName();
                if (p.a()) {
                    this.b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f);
                    return;
                }
                return;
            }
            return;
        }
        if (p.a()) {
            this.b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
        }
        if (this.d != null) {
            if (p.a()) {
                this.b.a("AdActivityObserver", "Invoking callback...");
            }
            this.d.b(this.e);
        }
        a();
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f)) {
            if (p.a()) {
                this.b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f);
            }
            if (this.d != null) {
                if (p.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
        }
    }

    public void a() {
        if (p.a()) {
            this.b.a("AdActivityObserver", "Cancelling...");
        }
        this.f4311a.b(this);
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
