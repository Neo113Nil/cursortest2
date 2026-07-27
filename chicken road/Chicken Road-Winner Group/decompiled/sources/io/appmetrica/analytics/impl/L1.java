package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class L1 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final A1 f6202b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6203c;

    public L1(A1 a12) {
        this(C0878ua.k().x().b(), a12);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3) {
        this.f6201a.execute(new D1(this, intent, i3));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f6201a.execute(new H1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        this.f6201a.execute(new G1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6201a.execute(new B1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final synchronized void onCreate() {
        this.f6203c = true;
        this.f6201a.execute(new C1(this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        this.f6201a.removeAll();
        synchronized (this) {
            this.f6203c = false;
        }
        this.f6202b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        this.f6201a.execute(new K1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i3, Bundle bundle) {
        this.f6201a.execute(new I1(this, i3, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        this.f6201a.execute(new J1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3, int i4) {
        this.f6201a.execute(new E1(this, intent, i3, i4));
    }

    public L1(IHandlerExecutor iHandlerExecutor, A1 a12) {
        this.f6203c = false;
        this.f6201a = iHandlerExecutor;
        this.f6202b = a12;
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        this.f6201a.execute(new F1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(InterfaceC0997z1 interfaceC0997z1) {
        this.f6202b.a(interfaceC0997z1);
    }
}
