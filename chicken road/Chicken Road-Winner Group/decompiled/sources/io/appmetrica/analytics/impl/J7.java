package io.appmetrica.analytics.impl;

import e2.AbstractC0293h;
import e2.AbstractC0294i;
import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class J7 implements ClientComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f6149a = AbstractC0293h.S("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C0587j4.l().f7570a.b()) {
            Zc zc = C0587j4.l().f7581m;
            List list = this.f6149a;
            ArrayList arrayList = new ArrayList(AbstractC0294i.U(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0951x5((String) it.next()));
            }
            Object[] array = arrayList.toArray(new C0951x5[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            C0951x5[] c0951x5Arr = (C0951x5[]) array;
            Yc[] ycArr = (Yc[]) Arrays.copyOf(c0951x5Arr, c0951x5Arr.length);
            synchronized (zc) {
                e2.m.W(zc.f6902a, ycArr);
            }
        }
    }
}
