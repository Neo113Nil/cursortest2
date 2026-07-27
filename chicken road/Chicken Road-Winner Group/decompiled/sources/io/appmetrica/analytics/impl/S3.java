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
    public final Context f6544a;

    /* renamed from: b, reason: collision with root package name */
    public final R5 f6545b = new R5(new C0744p5());

    /* renamed from: c, reason: collision with root package name */
    public final C0613k4 f6546c = new C0613k4(C0587j4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C0543hb f6547d = new C0543hb();

    /* renamed from: e, reason: collision with root package name */
    public final C0712o f6548e = C0587j4.l().a();
    public final Q3 f = new Q3();

    /* renamed from: g, reason: collision with root package name */
    public final Xc f6549g = new Xc();

    /* renamed from: h, reason: collision with root package name */
    public final R3 f6550h = new R3();

    public S3(Context context) {
        this.f6544a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f6548e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f6549g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f6546c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f6544a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f6547d;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Q5 getModuleAdRevenueContext() {
        return this.f6545b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f6550h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f6545b;
    }
}
