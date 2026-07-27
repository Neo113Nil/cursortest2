package io.appmetrica.analytics.billingv6.impl;

import G0.AbstractC0053c;
import G0.C0060j;
import com.android.billingclient.api.PurchaseHistoryRecord;
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
    public final /* synthetic */ i f6073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0060j f6074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6075c;

    public g(i iVar, C0060j c0060j, List list) {
        this.f6073a = iVar;
        this.f6074b = c0060j;
        this.f6075c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f6073a;
        C0060j c0060j = this.f6074b;
        List<PurchaseHistoryRecord> list = this.f6075c;
        iVar.getClass();
        if (c0060j.f862a != 0 || list == null) {
            iVar.f6084f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                Iterator it = purchaseHistoryRecord.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.f6082d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.i.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.b(), purchaseHistoryRecord.f4946c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f6081c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f6079a, linkedHashMap, iVar.f6081c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f6082d, iVar.f6081c.getBillingInfoManager());
                iVar.f6084f.onUpdateFinished();
            } else {
                List<String> S02 = AbstractC0465j.S0(billingInfoToUpdate.keySet());
                n nVar = iVar.f6084f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f6082d;
                AbstractC0053c abstractC0053c = iVar.f6080b;
                UtilsProvider utilsProvider = iVar.f6081c;
                d dVar = iVar.f6083e;
                f fVar = new f(str3, abstractC0053c, utilsProvider, hVar, list, dVar, nVar);
                dVar.f6062b.add(fVar);
                if (iVar.f6080b.b()) {
                    AbstractC0053c abstractC0053c2 = iVar.f6080b;
                    C0482c c0482c = new C0482c(5);
                    ArrayList arrayList = new ArrayList(AbstractC0467l.D0(S02, 10));
                    for (String str4 : S02) {
                        x1.e eVar = new x1.e();
                        eVar.f12265a = str4;
                        eVar.f12266b = iVar.f6082d;
                        arrayList.add(eVar.o());
                    }
                    c0482c.g(arrayList);
                    abstractC0053c2.c(c0482c.d(), fVar);
                } else {
                    iVar.f6083e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f6073a;
        iVar2.f6083e.a(iVar2);
    }
}
