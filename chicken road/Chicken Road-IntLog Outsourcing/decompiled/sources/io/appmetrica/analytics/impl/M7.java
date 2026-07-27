package io.appmetrica.analytics.impl;

import android.content.Context;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class M7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f7134a = AbstractC0466k.A0("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Zc zc = C1027ua.f9366H.f9392s;
        List list = this.f7134a;
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1100x5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C1100x5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C1100x5[] c1100x5Arr = (C1100x5[]) array;
        Yc[] ycArr = (Yc[]) Arrays.copyOf(c1100x5Arr, c1100x5Arr.length);
        synchronized (zc) {
            AbstractC0465j.E0(zc.f7780a, ycArr);
        }
        C1027ua.f9366H.f9392s.a(new Ze(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
