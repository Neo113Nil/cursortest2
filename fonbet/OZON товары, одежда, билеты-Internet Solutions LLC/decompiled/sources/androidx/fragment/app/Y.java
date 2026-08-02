package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.j0;
import androidx.lifecycle.n0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import f3.C6412d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class Y implements InterfaceC5431s, M4.e, B0 {

    /* renamed from: a, reason: collision with root package name */
    private final ComponentCallbacksC5392m f43006a;

    /* renamed from: b, reason: collision with root package name */
    private final A0 f43007b;

    /* renamed from: c, reason: collision with root package name */
    private final RunnableC5391l f43008c;

    /* renamed from: d, reason: collision with root package name */
    private z0.b f43009d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.L f43010e = null;

    /* renamed from: f, reason: collision with root package name */
    private M4.d f43011f = null;

    Y(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull A0 a02, @NonNull RunnableC5391l runnableC5391l) {
        this.f43006a = componentCallbacksC5392m;
        this.f43007b = a02;
        this.f43008c = runnableC5391l;
    }

    final void a(@NonNull AbstractC5434v.a aVar) {
        this.f43010e.h(aVar);
    }

    final void b() {
        if (this.f43010e == null) {
            this.f43010e = new androidx.lifecycle.L(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            M4.d dVar = new M4.d(this);
            this.f43011f = dVar;
            dVar.b();
            this.f43008c.run();
        }
    }

    final boolean c() {
        return this.f43010e != null;
    }

    final void d(Bundle bundle) {
        this.f43011f.c(bundle);
    }

    final void e(@NonNull Bundle bundle) {
        this.f43011f.d(bundle);
    }

    final void f(@NonNull AbstractC5434v.b bVar) {
        this.f43010e.j(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NonNull
    public final AbstractC6409a getDefaultViewModelCreationExtras() {
        Application application;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f43006a;
        Context applicationContext = componentCallbacksC5392m.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C6412d c6412d = new C6412d(0);
        if (application != null) {
            c6412d.c(z0.a.f43418c, application);
        }
        c6412d.c(j0.f43329a, componentCallbacksC5392m);
        c6412d.c(j0.f43330b, this);
        if (componentCallbacksC5392m.getArguments() != null) {
            c6412d.c(j0.f43331c, componentCallbacksC5392m.getArguments());
        }
        return c6412d;
    }

    @Override // androidx.lifecycle.InterfaceC5431s
    @NonNull
    public final z0.b getDefaultViewModelProviderFactory() {
        Application application;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.f43006a;
        z0.b defaultViewModelProviderFactory = componentCallbacksC5392m.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(componentCallbacksC5392m.mDefaultFactory)) {
            this.f43009d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f43009d == null) {
            Context applicationContext = componentCallbacksC5392m.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f43009d = new n0(application, componentCallbacksC5392m, componentCallbacksC5392m.getArguments());
        }
        return this.f43009d;
    }

    @Override // androidx.lifecycle.J
    @NonNull
    public final AbstractC5434v getLifecycle() {
        b();
        return this.f43010e;
    }

    @Override // M4.e
    @NonNull
    public final M4.c getSavedStateRegistry() {
        b();
        return this.f43011f.a();
    }

    @Override // androidx.lifecycle.B0
    @NonNull
    public final A0 getViewModelStore() {
        b();
        return this.f43007b;
    }
}
