package G0;

import M2.C0104h;
import M2.C0105i;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import b2.AbstractC0279e;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C0317b;
import com.google.android.gms.internal.play_billing.C0388z;
import com.google.android.gms.internal.play_billing.InterfaceC0323d;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import n2.AbstractC1341c;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0054d f901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f903d;

    public /* synthetic */ w(C0054d c0054d, Object obj, Object obj2, int i2) {
        this.f900a = i2;
        this.f901b = c0054d;
        this.f902c = obj;
        this.f903d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Exception, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8 */
    private final Object a() {
        B0.e eVar;
        InterfaceC0323d interfaceC0323d;
        C0054d c0054d = this.f901b;
        String str = (String) this.f902c;
        c0054d.getClass();
        AbstractC0357o0.f("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = c0054d.f838o;
        boolean z5 = c0054d.f845v;
        c0054d.f819A.getClass();
        Bundle c2 = AbstractC0357o0.c(z, z5, c0054d.f819A.f865a, c0054d.f826c, c0054d.f823E.longValue());
        ?? r5 = 0;
        String str2 = null;
        while (true) {
            if (!c0054d.f836m) {
                AbstractC0357o0.g("BillingClient", "getPurchaseHistory is not supported on current device");
                eVar = new B0.e(O.f785o, r5);
                break;
            }
            try {
                synchronized (c0054d.f824a) {
                    interfaceC0323d = c0054d.f831h;
                }
                if (interfaceC0323d == null) {
                    eVar = c0054d.w(O.f781k, 119, "Service reset to null", r5);
                    break;
                }
                Bundle l2 = ((C0317b) interfaceC0323d).l(c0054d.f829f.getPackageName(), str, str2, c2);
                F x02 = K1.b.x0(l2, "getPurchaseHistory()");
                C0060j c0060j = (C0060j) x02.f754c;
                if (c0060j != O.f780j) {
                    c0054d.H(x02.f753b, 11, c0060j);
                    eVar = new B0.e(c0060j, r5);
                    break;
                }
                ArrayList<String> stringArrayList = l2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = l2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = l2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z6 = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    AbstractC0357o0.f("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            AbstractC0357o0.g("BillingClient", "BUG: empty/null token!");
                            z6 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e3) {
                        eVar = c0054d.w(O.f779i, 51, "Got an exception trying to decode the purchase!", e3);
                    }
                }
                if (z6) {
                    c0054d.H(26, 11, O.f779i);
                }
                str2 = l2.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC0357o0.f("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    eVar = new B0.e(O.f780j, arrayList);
                    break;
                }
                r5 = 0;
            } catch (DeadObjectException e6) {
                eVar = c0054d.w(O.f781k, 59, "Got exception trying to get purchase history", e6);
            } catch (Exception e7) {
                eVar = c0054d.w(O.f779i, 59, "Got exception trying to get purchase history", e7);
            }
        }
        ((r) this.f903d).onPurchaseHistoryResponse((C0060j) eVar.f147c, (ArrayList) eVar.f146b);
        return null;
    }

    private final Object b() {
        Bundle i2;
        InterfaceC0323d interfaceC0323d;
        C0054d c0054d = this.f901b;
        String str = (String) this.f902c;
        String str2 = (String) this.f903d;
        c0054d.getClass();
        try {
            synchronized (c0054d.f824a) {
                interfaceC0323d = c0054d.f831h;
            }
            if (interfaceC0323d == null) {
                return AbstractC0357o0.i(O.f781k, 119);
            }
            return ((C0317b) interfaceC0323d).j(c0054d.f829f.getPackageName(), str, str2);
        } catch (DeadObjectException e3) {
            C0060j c0060j = O.f781k;
            String a6 = M.a(e3);
            i2 = AbstractC0357o0.i(c0060j, 5);
            if (a6 != null) {
                i2.putString("ADDITIONAL_LOG_DETAILS", a6);
            }
            return i2;
        } catch (Exception e6) {
            C0060j c0060j2 = O.f779i;
            String a7 = M.a(e6);
            i2 = AbstractC0357o0.i(c0060j2, 5);
            if (a7 != null) {
                i2.putString("ADDITIONAL_LOG_DETAILS", a7);
            }
            return i2;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC0323d interfaceC0323d;
        int readInt;
        String str;
        B3.d dVar;
        InterfaceC0323d interfaceC0323d2;
        B0.t x5;
        InterfaceC0323d interfaceC0323d3;
        Bundle m6;
        InterfaceC0323d interfaceC0323d4;
        int i2 = 20;
        int i3 = 119;
        Exception exc = null;
        boolean z = true;
        switch (this.f900a) {
            case 0:
                C0054d c0054d = this.f901b;
                C0061k c0061k = (C0061k) this.f902c;
                D3.g gVar = (D3.g) this.f903d;
                String str2 = c0061k.f864a;
                try {
                    AbstractC0357o0.f("BillingClient", "Consuming purchase with token: " + str2);
                    synchronized (c0054d.f824a) {
                        interfaceC0323d = c0054d.f831h;
                    }
                    if (interfaceC0323d == null) {
                        c0054d.B(gVar, O.f781k, 119, "Service has been reset to null.", null);
                    } else {
                        if (c0054d.f838o) {
                            String packageName = c0054d.f829f.getPackageName();
                            boolean z5 = c0054d.f838o;
                            String str3 = c0054d.f826c;
                            long longValue = c0054d.f823E.longValue();
                            Bundle bundle = new Bundle();
                            if (z5) {
                                AbstractC0357o0.b(bundle, str3, longValue);
                            }
                            Bundle i6 = ((C0317b) interfaceC0323d).i(packageName, str2, bundle);
                            readInt = i6.getInt("RESPONSE_CODE");
                            str = AbstractC0357o0.e(i6, "BillingClient");
                        } else {
                            String packageName2 = c0054d.f829f.getPackageName();
                            C0317b c0317b = (C0317b) interfaceC0323d;
                            Parcel c2 = c0317b.c();
                            c2.writeInt(3);
                            c2.writeString(packageName2);
                            c2.writeString(str2);
                            Parcel d6 = c0317b.d(c2, 5);
                            readInt = d6.readInt();
                            d6.recycle();
                            str = "";
                        }
                        C0060j a6 = O.a(readInt, str);
                        if (readInt == 0) {
                            AbstractC0357o0.f("BillingClient", "Successfully consumed purchase.");
                            ((C0105i) gVar.f448b).a(AbstractC1341c.j(a6));
                        } else {
                            c0054d.B(gVar, a6, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                        }
                    }
                } catch (DeadObjectException e3) {
                    c0054d.B(gVar, O.f781k, 29, "Error consuming purchase!", e3);
                } catch (Exception e6) {
                    c0054d.B(gVar, O.f779i, 29, "Error consuming purchase!", e6);
                }
                return null;
            case 1:
                C0054d c0054d2 = this.f901b;
                B1.g gVar2 = (B1.g) this.f902c;
                c0054d2.getClass();
                ArrayList arrayList = new ArrayList();
                String str4 = ((u) ((com.google.android.gms.internal.play_billing.C) gVar2.f215b).get(0)).f896b;
                com.google.android.gms.internal.play_billing.C c6 = (com.google.android.gms.internal.play_billing.C) gVar2.f215b;
                int size = c6.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        dVar = new B3.d(0, "", arrayList);
                    } else {
                        int i8 = i7 + 20;
                        ArrayList arrayList2 = new ArrayList(c6.subList(i7, i8 > size ? size : i8));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            arrayList3.add(((u) arrayList2.get(i9)).f895a);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle2.putString("playBillingLibraryVersion", c0054d2.f826c);
                        try {
                            synchronized (c0054d2.f824a) {
                                interfaceC0323d2 = c0054d2.f831h;
                            }
                            if (interfaceC0323d2 == null) {
                                dVar = c0054d2.v(O.f781k, 119, "Service has been reset to null.", null);
                            } else {
                                int i10 = true != c0054d2.f846w ? 17 : i2;
                                String packageName3 = c0054d2.f829f.getPackageName();
                                boolean z6 = c0054d2.f845v && c0054d2.f819A.f865a;
                                String str5 = c0054d2.f826c;
                                c0054d2.o();
                                c0054d2.o();
                                c0054d2.o();
                                c0054d2.o();
                                long longValue2 = c0054d2.f823E.longValue();
                                com.google.android.gms.internal.play_billing.C c7 = c6;
                                Bundle bundle3 = new Bundle();
                                AbstractC0357o0.b(bundle3, str5, longValue2);
                                bundle3.putBoolean("enablePendingPurchases", true);
                                bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                if (z6) {
                                    bundle3.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                }
                                ArrayList<String> arrayList4 = new ArrayList<>();
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                int size3 = arrayList2.size();
                                int i11 = 0;
                                boolean z7 = false;
                                while (i11 < size3) {
                                    ArrayList arrayList6 = arrayList2;
                                    u uVar = (u) arrayList2.get(i11);
                                    int i12 = size;
                                    arrayList4.add(null);
                                    z7 |= !TextUtils.isEmpty(null);
                                    if (uVar.f896b.equals("first_party")) {
                                        throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    }
                                    i11++;
                                    size = i12;
                                    arrayList2 = arrayList6;
                                }
                                int i13 = size;
                                if (z7) {
                                    bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                }
                                if (!arrayList5.isEmpty()) {
                                    bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                }
                                Bundle o2 = ((C0317b) interfaceC0323d2).o(i10, packageName3, str4, bundle2, bundle3);
                                if (o2 == null) {
                                    dVar = c0054d2.v(O.f766A, 44, "queryProductDetailsAsync got empty product details response.", null);
                                } else if (o2.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = o2.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        for (int i14 = 0; i14 < stringArrayList.size(); i14++) {
                                            try {
                                                C0066p c0066p = new C0066p(stringArrayList.get(i14));
                                                AbstractC0357o0.f("BillingClient", "Got product details: ".concat(c0066p.toString()));
                                                arrayList.add(c0066p);
                                            } catch (JSONException e7) {
                                                dVar = c0054d2.v(O.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e7);
                                                ((InterfaceC0067q) this.f903d).onProductDetailsResponse(O.a(dVar.f276b, (String) dVar.f278d), (ArrayList) dVar.f277c);
                                                return null;
                                            }
                                        }
                                        i7 = i8;
                                        c6 = c7;
                                        size = i13;
                                        i2 = 20;
                                    } else {
                                        dVar = c0054d2.v(O.f766A, 46, "queryProductDetailsAsync got null response list", null);
                                    }
                                } else {
                                    int a7 = AbstractC0357o0.a(o2, "BillingClient");
                                    String e8 = AbstractC0357o0.e(o2, "BillingClient");
                                    dVar = a7 != 0 ? c0054d2.v(O.a(a7, e8), 23, AbstractC0279e.d(a7, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : c0054d2.v(O.a(6, e8), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                }
                            }
                        } catch (DeadObjectException e9) {
                            dVar = c0054d2.v(O.f781k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e9);
                        } catch (Exception e10) {
                            dVar = c0054d2.v(O.f779i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e10);
                        }
                    }
                }
                break;
            case 2:
                C0054d c0054d3 = this.f901b;
                String str6 = (String) this.f902c;
                c0054d3.getClass();
                AbstractC0357o0.f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str6)));
                ArrayList arrayList7 = new ArrayList();
                boolean z8 = c0054d3.f838o;
                boolean z9 = c0054d3.f845v;
                c0054d3.f819A.getClass();
                Bundle c8 = AbstractC0357o0.c(z8, z9, c0054d3.f819A.f865a, c0054d3.f826c, c0054d3.f823E.longValue());
                String str7 = null;
                while (true) {
                    try {
                        synchronized (c0054d3.f824a) {
                            interfaceC0323d3 = c0054d3.f831h;
                        }
                        if (interfaceC0323d3 == null) {
                            x5 = c0054d3.x(O.f781k, i3, "Service has been reset to null", exc);
                        } else {
                            if (c0054d3.f838o) {
                                m6 = ((C0317b) interfaceC0323d3).n(z != c0054d3.f845v ? 9 : 19, c0054d3.f829f.getPackageName(), str6, str7, c8);
                            } else {
                                m6 = ((C0317b) interfaceC0323d3).m(c0054d3.f829f.getPackageName(), str6, str7);
                            }
                            F x02 = K1.b.x0(m6, "getPurchase()");
                            C0060j c0060j = (C0060j) x02.f754c;
                            if (c0060j != O.f780j) {
                                x5 = c0054d3.x(c0060j, x02.f753b, "Purchase bundle invalid", exc);
                            } else {
                                ArrayList<String> stringArrayList2 = m6.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList3 = m6.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = m6.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                boolean z10 = false;
                                for (int i15 = 0; i15 < stringArrayList3.size(); i15++) {
                                    String str8 = stringArrayList3.get(i15);
                                    String str9 = stringArrayList4.get(i15);
                                    AbstractC0357o0.f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList2.get(i15))));
                                    try {
                                        Purchase purchase = new Purchase(str8, str9);
                                        if (TextUtils.isEmpty(purchase.b())) {
                                            AbstractC0357o0.g("BillingClient", "BUG: empty/null token!");
                                            z10 = true;
                                        }
                                        arrayList7.add(purchase);
                                    } catch (JSONException e11) {
                                        x5 = c0054d3.x(O.f779i, 51, "Got an exception trying to decode the purchase!", e11);
                                    }
                                }
                                if (z10) {
                                    c0054d3.H(26, 9, O.f779i);
                                }
                                str7 = m6.getString("INAPP_CONTINUATION_TOKEN");
                                AbstractC0357o0.f("BillingClient", "Continuation token: ".concat(String.valueOf(str7)));
                                if (TextUtils.isEmpty(str7)) {
                                    x5 = new B0.t(O.f780j, 2, arrayList7);
                                } else {
                                    i3 = 119;
                                    exc = null;
                                    z = true;
                                }
                            }
                        }
                    } catch (DeadObjectException e12) {
                        x5 = c0054d3.x(O.f781k, 52, "Got exception trying to get purchases try to reconnect", e12);
                    } catch (Exception e13) {
                        x5 = c0054d3.x(O.f779i, 52, "Got exception trying to get purchases try to reconnect", e13);
                    }
                }
                ArrayList arrayList8 = (ArrayList) x5.f207b;
                if (arrayList8 != null) {
                    ((InterfaceC0068s) this.f903d).onQueryPurchasesResponse((C0060j) x5.f208c, arrayList8);
                    return null;
                }
                InterfaceC0068s interfaceC0068s = (InterfaceC0068s) this.f903d;
                C0060j c0060j2 = (C0060j) x5.f208c;
                C0388z c0388z = com.google.android.gms.internal.play_billing.C.f5030b;
                interfaceC0068s.onQueryPurchasesResponse(c0060j2, com.google.android.gms.internal.play_billing.S.f5100e);
                return null;
            case 3:
                return a();
            case 4:
                return b();
            default:
                C0054d c0054d4 = this.f901b;
                D3.g gVar3 = (D3.g) this.f902c;
                C0051a c0051a = (C0051a) this.f903d;
                try {
                    synchronized (c0054d4.f824a) {
                        interfaceC0323d4 = c0054d4.f831h;
                    }
                    if (interfaceC0323d4 == null) {
                        c0054d4.z(gVar3, O.f781k, 119, null);
                    } else {
                        String packageName4 = c0054d4.f829f.getPackageName();
                        String str10 = c0051a.f813b;
                        String str11 = c0054d4.f826c;
                        long longValue3 = c0054d4.f823E.longValue();
                        Bundle bundle4 = new Bundle();
                        AbstractC0357o0.b(bundle4, str11, longValue3);
                        Bundle h3 = ((C0317b) interfaceC0323d4).h(packageName4, str10, bundle4);
                        ((C0104h) gVar3.f448b).a(AbstractC1341c.j(O.a(AbstractC0357o0.a(h3, "BillingClient"), AbstractC0357o0.e(h3, "BillingClient"))));
                    }
                } catch (DeadObjectException e14) {
                    c0054d4.z(gVar3, O.f781k, 28, e14);
                } catch (Exception e15) {
                    c0054d4.z(gVar3, O.f779i, 28, e15);
                }
                return null;
        }
    }
}
