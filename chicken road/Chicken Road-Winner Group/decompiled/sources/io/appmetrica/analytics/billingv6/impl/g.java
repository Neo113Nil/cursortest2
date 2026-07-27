package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.PurchaseHistoryRecord;
import e2.AbstractC0292g;
import e2.AbstractC0294i;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m0.AbstractC1115c;
import m0.C1113a;
import m0.C1120h;

/* loaded from: classes.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1120h f5262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5263c;

    public g(i iVar, C1120h c1120h, List list) {
        this.f5261a = iVar;
        this.f5262b = c1120h;
        this.f5263c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f5261a;
        C1120h c1120h = this.f5262b;
        List<PurchaseHistoryRecord> list = this.f5263c;
        iVar.getClass();
        if (c1120h.f10046a != 0 || list == null) {
            iVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                Iterator it = purchaseHistoryRecord.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.f5270d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.j.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.j.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.b(), purchaseHistoryRecord.f2543c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f5269c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f5267a, linkedHashMap, iVar.f5269c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f5270d, iVar.f5269c.getBillingInfoManager());
                iVar.f.onUpdateFinished();
            } else {
                List<String> f0 = AbstractC0292g.f0(billingInfoToUpdate.keySet());
                n nVar = iVar.f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f5270d;
                AbstractC1115c abstractC1115c = iVar.f5268b;
                UtilsProvider utilsProvider = iVar.f5269c;
                d dVar = iVar.f5271e;
                f fVar = new f(str3, abstractC1115c, utilsProvider, hVar, list, dVar, nVar);
                dVar.f5251b.add(fVar);
                if (iVar.f5268b.b()) {
                    AbstractC1115c abstractC1115c2 = iVar.f5268b;
                    io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                    ArrayList arrayList = new ArrayList(AbstractC0294i.U(f0));
                    for (String str4 : f0) {
                        C1113a c1113a = new C1113a();
                        c1113a.f10005a = str4;
                        c1113a.f10006b = iVar.f5270d;
                        arrayList.add(c1113a.a());
                    }
                    kVar.h(arrayList);
                    abstractC1115c2.c(kVar.e(), fVar);
                } else {
                    iVar.f5271e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f5261a;
        iVar2.f5271e.a(iVar2);
    }
}
