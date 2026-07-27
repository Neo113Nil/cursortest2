package io.appmetrica.analytics.billingv6.impl;

import G0.C0060j;
import G0.C0063m;
import G0.C0066p;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f6085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0060j f6086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6087c;

    public j(k kVar, C0060j c0060j, List list) {
        this.f6085a = kVar;
        this.f6086b = c0060j;
        this.f6087c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a0 A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        LinkedHashMap linkedHashMap;
        Iterator it;
        ProductInfo productInfo;
        String str;
        String str2;
        String str3;
        k kVar = this.f6085a;
        C0060j c0060j = this.f6086b;
        List<Purchase> list = this.f6087c;
        kVar.getClass();
        if (c0060j.f862a != 0) {
            kVar.f6093f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it2 = purchase.a().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.f6090c;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator it3 = purchaseHistoryRecord.a().iterator();
                while (it3.hasNext()) {
                    linkedHashMap3.put((String) it3.next(), purchaseHistoryRecord);
                }
            }
            List list3 = kVar.f6091d;
            ArrayList arrayList = new ArrayList();
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                C0066p c0066p = (C0066p) it4.next();
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap3.get(c0066p.f886c);
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap2.get(c0066p.f886c);
                    String str4 = c0066p.f887d;
                    int hashCode = str4.hashCode();
                    JSONObject jSONObject = purchaseHistoryRecord2.f4946c;
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && str4.equals("inapp")) {
                            ProductType productType = str4.equals("inapp") ? ProductType.INAPP : str4.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            int optInt = jSONObject.optInt("quantity", 1);
                            C0063m a6 = c0066p.a();
                            long j2 = a6 != null ? a6.f867b : 0L;
                            C0063m a7 = c0066p.a();
                            if (a7 == null || (str2 = a7.f868c) == null) {
                                str2 = "";
                            }
                            productInfo = new ProductInfo(productType, c0066p.f886c, optInt, j2, str2, 0L, null, 1, null, purchaseHistoryRecord2.f4945b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f4943c.optBoolean("autoRenewing") : false, (purchase2 == null || (str3 = purchase2.f4941a) == null) ? "{}" : str3);
                        }
                    } else if (str4.equals("subs")) {
                        productInfo = new ProductInfo(str4.equals("inapp") ? ProductType.INAPP : str4.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN, c0066p.f886c, jSONObject.optInt("quantity", 1), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.f4945b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f4943c.optBoolean("autoRenewing") : false, (purchase2 == null || (str = purchase2.f4941a) == null) ? "{}" : str);
                    }
                    if (productInfo == null) {
                        arrayList.add(productInfo);
                    }
                    linkedHashMap2 = linkedHashMap;
                    it4 = it;
                } else {
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                }
                productInfo = null;
                if (productInfo == null) {
                }
                linkedHashMap2 = linkedHashMap;
                it4 = it;
            }
            kVar.f6088a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f6089b.invoke();
            kVar.f6093f.onUpdateFinished();
        }
        k kVar2 = this.f6085a;
        kVar2.f6092e.a(kVar2);
    }
}
