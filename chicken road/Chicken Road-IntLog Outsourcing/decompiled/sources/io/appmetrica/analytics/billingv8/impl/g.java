package io.appmetrica.analytics.billingv8.impl;

import G0.AbstractC0053c;
import G0.C0060j;
import com.android.billingclient.api.Purchase;
import g4.AbstractC0465j;
import g4.AbstractC0467l;
import h2.C0482c;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0060j f6127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6128c;

    public g(i iVar, C0060j c0060j, List list) {
        this.f6126a = iVar;
        this.f6127b = c0060j;
        this.f6128c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f6126a;
        C0060j c0060j = this.f6127b;
        List<Purchase> list = this.f6128c;
        iVar.getClass();
        if (c0060j.f862a != 0) {
            iVar.f6137f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.f6135d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.i.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.b(), purchase.f4943c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f6134c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f6132a, linkedHashMap, iVar.f6134c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f6135d, iVar.f6134c.getBillingInfoManager());
                iVar.f6137f.onUpdateFinished();
            } else {
                List<String> S02 = AbstractC0465j.S0(billingInfoToUpdate.keySet());
                n nVar = iVar.f6137f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f6135d;
                AbstractC0053c abstractC0053c = iVar.f6133b;
                UtilsProvider utilsProvider = iVar.f6134c;
                d dVar = iVar.f6136e;
                f fVar = new f(str3, abstractC0053c, utilsProvider, hVar, list, dVar, nVar);
                dVar.f6115b.add(fVar);
                if (iVar.f6133b.b()) {
                    AbstractC0053c abstractC0053c2 = iVar.f6133b;
                    C0482c c0482c = new C0482c(5);
                    ArrayList arrayList = new ArrayList(AbstractC0467l.D0(S02, 10));
                    for (String str4 : S02) {
                        x1.e eVar = new x1.e();
                        eVar.f12265a = str4;
                        eVar.f12266b = iVar.f6135d;
                        arrayList.add(eVar.o());
                    }
                    c0482c.g(arrayList);
                    abstractC0053c2.c(c0482c.d(), fVar);
                } else {
                    iVar.f6136e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f6126a;
        iVar2.f6136e.a(iVar2);
    }
}
