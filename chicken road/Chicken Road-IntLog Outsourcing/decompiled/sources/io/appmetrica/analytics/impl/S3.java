package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;

/* loaded from: classes.dex */
public final class S3 implements O5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7409a;

    /* renamed from: b, reason: collision with root package name */
    public final R5 f7410b = new R5(new C0893p5());

    /* renamed from: c, reason: collision with root package name */
    public final C0762k4 f7411c = new C0762k4(C0736j4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C0692hb f7412d = new C0692hb();

    /* renamed from: e, reason: collision with root package name */
    public final C0861o f7413e = C0736j4.l().a();

    /* renamed from: f, reason: collision with root package name */
    public final Q3 f7414f = new Q3();

    /* renamed from: g, reason: collision with root package name */
    public final Xc f7415g = new Xc();

    /* renamed from: h, reason: collision with root package name */
    public final R3 f7416h = new R3();

    public S3(Context context) {
        this.f7409a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f7413e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f7414f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f7415g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f7411c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f7409a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f7412d;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Q5 getModuleAdRevenueContext() {
        return this.f7410b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f7416h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f7410b;
    }
}
