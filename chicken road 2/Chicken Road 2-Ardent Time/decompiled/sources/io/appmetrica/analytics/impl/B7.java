package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class B7 implements io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4102a = i1.AbstractC0191j.H("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (io.appmetrica.analytics.impl.C0244b4.l().f5491a.b()) {
            io.appmetrica.analytics.impl.Sc sc = io.appmetrica.analytics.impl.C0244b4.l().f5503m;
            java.util.List list = this.f4102a;
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
        }
    }
}
