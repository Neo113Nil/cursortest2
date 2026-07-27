package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m0.C1120h;
import m0.C1123k;
import m0.C1126n;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f5272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1120h f5273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5274c;

    public j(k kVar, C1120h c1120h, List list) {
        this.f5272a = kVar;
        this.f5273b = c1120h;
        this.f5274c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0 A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        LinkedHashMap linkedHashMap;
        Iterator it;
        ProductInfo productInfo;
        ProductInfo productInfo2;
        String str;
        String str2;
        String str3;
        k kVar = this.f5272a;
        C1120h c1120h = this.f5273b;
        List<Purchase> list = this.f5274c;
        kVar.getClass();
        if (c1120h.f10046a != 0) {
            kVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it2 = purchase.a().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.f5277c;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator it3 = purchaseHistoryRecord.a().iterator();
                while (it3.hasNext()) {
                    linkedHashMap3.put((String) it3.next(), purchaseHistoryRecord);
                }
            }
            List list3 = kVar.f5278d;
            ArrayList arrayList = new ArrayList();
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                C1126n c1126n = (C1126n) it4.next();
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap3.get(c1126n.f10067c);
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap2.get(c1126n.f10067c);
                    String str4 = c1126n.f10068d;
                    int hashCode = str4.hashCode();
                    JSONObject jSONObject = purchaseHistoryRecord2.f2543c;
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && str4.equals("inapp")) {
                            ProductType productType = str4.equals("inapp") ? ProductType.INAPP : str4.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            int optInt = jSONObject.optInt("quantity", 1);
                            C1123k a3 = c1126n.a();
                            long j3 = a3 != null ? a3.f10051b : 0L;
                            C1123k a4 = c1126n.a();
                            if (a4 == null || (str2 = a4.f10052c) == null) {
                                str2 = "";
                            }
                            productInfo = new ProductInfo(productType, c1126n.f10067c, optInt, j3, str2, 0L, null, 1, null, purchaseHistoryRecord2.f2542b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f2540c.optBoolean("autoRenewing") : false, (purchase2 == null || (str3 = purchase2.f2538a) == null) ? "{}" : str3);
                        }
                    } else if (str4.equals("subs")) {
                        productInfo = new ProductInfo(str4.equals("inapp") ? ProductType.INAPP : str4.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN, c1126n.f10067c, jSONObject.optInt("quantity", 1), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.f2542b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.f2540c.optBoolean("autoRenewing") : false, (purchase2 == null || (str = purchase2.f2538a) == null) ? "{}" : str);
                    }
                    productInfo2 = productInfo;
                    if (productInfo2 == null) {
                        arrayList.add(productInfo2);
                    }
                    linkedHashMap2 = linkedHashMap;
                    it4 = it;
                } else {
                    linkedHashMap = linkedHashMap2;
                    it = it4;
                }
                productInfo = null;
                productInfo2 = productInfo;
                if (productInfo2 == null) {
                }
                linkedHashMap2 = linkedHashMap;
                it4 = it;
            }
            kVar.f5275a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f5276b.invoke();
            kVar.f.onUpdateFinished();
        }
        k kVar2 = this.f5272a;
        kVar2.f5279e.a(kVar2);
    }
}
