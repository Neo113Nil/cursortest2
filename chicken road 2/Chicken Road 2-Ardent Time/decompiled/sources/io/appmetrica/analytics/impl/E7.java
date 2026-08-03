package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E7 implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4257a = i1.AbstractC0191j.H("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(android.content.Context context) {
        io.appmetrica.analytics.impl.Sc sc = io.appmetrica.analytics.impl.C0560na.f6484I.f6510s;
        java.util.List list = this.f4257a;
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(list));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new io.appmetrica.analytics.impl.C0633q5((java.lang.String) it.next()));
        }
        java.lang.Object[] array = arrayList.toArray(new io.appmetrica.analytics.impl.C0633q5[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        io.appmetrica.analytics.impl.C0633q5[] c0633q5Arr = (io.appmetrica.analytics.impl.C0633q5[]) array;
        io.appmetrica.analytics.impl.Rc[] rcArr = (io.appmetrica.analytics.impl.Rc[]) java.util.Arrays.copyOf(c0633q5Arr, c0633q5Arr.length);
        synchronized (sc) {
            i1.AbstractC0196o.L(sc.f4963a, rcArr);
        }
        io.appmetrica.analytics.impl.C0560na.f6484I.f6510s.a(new io.appmetrica.analytics.impl.Ue(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
