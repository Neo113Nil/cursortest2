package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class j implements io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter f3465a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f3466b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.billing.impl.o f3467c;

    public j(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter serviceComponentModuleReporter, java.util.concurrent.Executor executor, io.appmetrica.analytics.billing.impl.o oVar) {
        this.f3465a = serviceComponentModuleReporter;
        this.f3466b = executor;
        this.f3467c = oVar;
    }

    public static final void a(io.appmetrica.analytics.billing.impl.j jVar, io.appmetrica.analytics.billinginterface.internal.ProductInfo productInfo) {
        io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.f3465a;
        io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Builder withType = io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Companion.newBuilder().withType(40976);
        jVar.f3467c.getClass();
        serviceComponentModuleReporter.handleReport(withType.withValueBytes(io.appmetrica.analytics.billing.impl.o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(java.util.List<? extends io.appmetrica.analytics.billinginterface.internal.ProductInfo> list) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f3466b.execute(new F0.c(1, this, (io.appmetrica.analytics.billinginterface.internal.ProductInfo) it.next()));
        }
    }

    public /* synthetic */ j(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter serviceComponentModuleReporter, java.util.concurrent.Executor executor, io.appmetrica.analytics.billing.impl.o oVar, int i2, kotlin.jvm.internal.e eVar) {
        this(serviceComponentModuleReporter, executor, (i2 & 4) != 0 ? new io.appmetrica.analytics.billing.impl.o() : oVar);
    }
}
