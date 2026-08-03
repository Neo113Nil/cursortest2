package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class m implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceContext f3471a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.B f3472b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor f3473c;

    public m(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.billing.impl.B b2) {
        this.f3471a = serviceContext;
        this.f3472b = b2;
    }

    public final void a(io.appmetrica.analytics.billing.impl.B b2) {
        io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig;
        io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor billingMonitor = this.f3473c;
        if (billingMonitor != null) {
            if (b2 != null) {
                io.appmetrica.analytics.billing.impl.A a2 = b2.f3448b;
                billingConfig = new io.appmetrica.analytics.billinginterface.internal.config.BillingConfig(a2.f3445a, a2.f3446b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f3472b = b2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    public final void onMainReporterCreated(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        java.lang.String str;
        java.lang.reflect.Field field;
        if (serviceModuleReporterComponentContext.getConfig().isRevenueAutoTrackingEnabled()) {
            android.content.Context context = this.f3471a.getContext();
            io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor defaultExecutor = this.f3471a.getExecutorProvider().getDefaultExecutor();
            java.util.concurrent.Executor uiExecutor = this.f3471a.getExecutorProvider().getUiExecutor();
            try {
                java.lang.Class<?> findClass = io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
                str = (java.lang.String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
            } catch (java.lang.Throwable unused) {
                str = null;
            }
            io.appmetrica.analytics.billinginterface.internal.BillingType billingType = (str == null || y1.g.T(str)) ? io.appmetrica.analytics.billinginterface.internal.BillingType.NONE : y1.o.K(str, "2.", false) ? io.appmetrica.analytics.billinginterface.internal.BillingType.NONE : y1.o.K(str, "3.", false) ? io.appmetrica.analytics.billinginterface.internal.BillingType.NONE : y1.o.K(str, "4.", false) ? io.appmetrica.analytics.billinginterface.internal.BillingType.NONE : y1.o.K(str, "5.", false) ? io.appmetrica.analytics.billinginterface.internal.BillingType.LIBRARY_V6 : y1.o.K(str, "6.", false) ? io.appmetrica.analytics.billinginterface.internal.BillingType.LIBRARY_V6 : y1.o.K(str, "7.", false) ? io.appmetrica.analytics.billinginterface.internal.BillingType.LIBRARY_V6 : y1.o.K(str, "8.", false) ? io.appmetrica.analytics.billinginterface.internal.BillingType.LIBRARY_V8 : io.appmetrica.analytics.billinginterface.internal.BillingType.LIBRARY_V8;
            io.appmetrica.analytics.billing.impl.k kVar = new io.appmetrica.analytics.billing.impl.k(this.f3471a.getServiceStorageProvider().createBinaryStateStorageFactory("auto_inapp_collecting_info_data", new io.appmetrica.analytics.billing.impl.e(), new io.appmetrica.analytics.billing.impl.C0205b(null, 1, null)).create(this.f3471a.getContext()));
            io.appmetrica.analytics.billing.impl.j jVar = new io.appmetrica.analytics.billing.impl.j(serviceModuleReporterComponentContext.getReporter(), this.f3471a.getExecutorProvider().getReportRunnableExecutor(), null, 4, null);
            int i2 = io.appmetrica.analytics.billing.impl.l.f3470a[billingType.ordinal()];
            this.f3473c = i2 != 1 ? i2 != 2 ? new io.appmetrica.analytics.billinginterface.internal.monitor.DummyBillingMonitor() : new io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null) : new io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
            a(this.f3472b);
            if (this.f3471a.getApplicationStateProvider().registerStickyObserver(new io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver() { // from class: J0.a
                @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                public final void onApplicationStateChanged(io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState applicationState) {
                    io.appmetrica.analytics.billing.impl.m.a(io.appmetrica.analytics.billing.impl.m.this, applicationState);
                }
            }) == io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.VISIBLE) {
                try {
                    io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor billingMonitor = this.f3473c;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (java.lang.Throwable unused2) {
                }
            }
        }
    }

    public static final void a(io.appmetrica.analytics.billing.impl.m mVar, io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState.VISIBLE) {
            try {
                io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor billingMonitor = mVar.f3473c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
