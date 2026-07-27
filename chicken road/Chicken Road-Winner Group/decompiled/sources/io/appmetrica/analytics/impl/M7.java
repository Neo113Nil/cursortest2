package io.appmetrica.analytics.impl;

import android.content.Context;
import e2.AbstractC0293h;
import e2.AbstractC0294i;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class M7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f6278a = AbstractC0293h.S("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Zc zc = C0878ua.f8414H.f8439s;
        List list = this.f6278a;
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
        C0878ua.f8414H.f8439s.a(new Ze(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
