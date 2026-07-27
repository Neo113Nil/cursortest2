package m0;

import Y1.C0081e;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C0173b;
import com.google.android.gms.internal.play_billing.C0244z;
import com.google.android.gms.internal.play_billing.InterfaceC0179d;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1116d f10081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10082c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10083d;

    public /* synthetic */ u(C1116d c1116d, Object obj, Object obj2, int i3) {
        this.f10080a = i3;
        this.f10081b = c1116d;
        this.f10082c = obj;
        this.f10083d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x005b, code lost:
    
        r0 = r2.w(m0.O.f9977k, 119, "Service reset to null", r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Exception, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        C1112C c1112c;
        Object obj;
        InterfaceC0179d interfaceC0179d;
        C1116d c1116d = this.f10081b;
        String str = (String) this.f10082c;
        c1116d.getClass();
        AbstractC0213o0.f("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z3 = c1116d.f10030o;
        boolean z4 = c1116d.f10037v;
        c1116d.f10012A.getClass();
        Bundle c3 = AbstractC0213o0.c(z3, z4, c1116d.f10012A.f10049a, c1116d.f10019c, c1116d.f10016E.longValue());
        ?? r5 = 0;
        String str2 = null;
        while (true) {
            if (!c1116d.f10028m) {
                AbstractC0213o0.g("BillingClient", "getPurchaseHistory is not supported on current device");
                c1112c = new C1112C(O.f9981o, r5);
                break;
            }
            try {
                synchronized (c1116d.f10017a) {
                    try {
                        interfaceC0179d = c1116d.f10023h;
                    } catch (Throwable th) {
                        th = th;
                        obj = r5;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e3) {
                                    e = e3;
                                    c1112c = c1116d.w(O.f9977k, 59, "Got exception trying to get purchase history", e);
                                    ((InterfaceC1128p) this.f10083d).onPurchaseHistoryResponse(c1112c.f9942b, c1112c.f9941a);
                                    return obj;
                                } catch (Exception e4) {
                                    e = e4;
                                    c1112c = c1116d.w(O.f9975i, 59, "Got exception trying to get purchase history", e);
                                    ((InterfaceC1128p) this.f10083d).onPurchaseHistoryResponse(c1112c.f9942b, c1112c.f9941a);
                                    return obj;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (interfaceC0179d == null) {
                    break;
                }
                Bundle i3 = ((C0173b) interfaceC0179d).i(c1116d.f.getPackageName(), str, str2, c3);
                E R2 = X0.a.R(i3, "getPurchaseHistory()");
                C1120h c1120h = (C1120h) R2.f9946b;
                if (c1120h != O.f9976j) {
                    c1116d.H(R2.f9945a, 11, c1120h);
                    c1112c = new C1112C(c1120h, r5);
                    break;
                }
                ArrayList<String> stringArrayList = i3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = i3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = i3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i4 = 0;
                boolean z5 = false;
                Object obj2 = r5;
                while (i4 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i4);
                    String str4 = stringArrayList3.get(i4);
                    obj = obj2;
                    AbstractC0213o0.f("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i4))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            AbstractC0213o0.g("BillingClient", "BUG: empty/null token!");
                            z5 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i4++;
                        obj2 = obj;
                    } catch (JSONException e5) {
                        c1112c = c1116d.w(O.f9975i, 51, "Got an exception trying to decode the purchase!", e5);
                    }
                }
                obj = obj2;
                if (z5) {
                    c1116d.H(26, 11, O.f9975i);
                }
                str2 = i3.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC0213o0.f("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    c1112c = new C1112C(O.f9976j, arrayList);
                    break;
                }
                r5 = obj;
            } catch (DeadObjectException e6) {
                e = e6;
                obj = r5;
            } catch (Exception e7) {
                e = e7;
                obj = r5;
            }
        }
        obj = r5;
        ((InterfaceC1128p) this.f10083d).onPurchaseHistoryResponse(c1112c.f9942b, c1112c.f9941a);
        return obj;
    }

    private final Object b() {
        Bundle i3;
        InterfaceC0179d interfaceC0179d;
        C1116d c1116d = this.f10081b;
        String str = (String) this.f10082c;
        String str2 = (String) this.f10083d;
        try {
            synchronized (c1116d.f10017a) {
                interfaceC0179d = c1116d.f10023h;
            }
            if (interfaceC0179d == null) {
                return AbstractC0213o0.i(O.f9977k, 119);
            }
            return ((C0173b) interfaceC0179d).g(c1116d.f.getPackageName(), str, str2);
        } catch (DeadObjectException e3) {
            C1120h c1120h = O.f9977k;
            String a3 = M.a(e3);
            i3 = AbstractC0213o0.i(c1120h, 5);
            if (a3 != null) {
                i3.putString("ADDITIONAL_LOG_DETAILS", a3);
            }
            return i3;
        } catch (Exception e4) {
            C1120h c1120h2 = O.f9975i;
            String a4 = M.a(e4);
            i3 = AbstractC0213o0.i(c1120h2, 5);
            if (a4 != null) {
                i3.putString("ADDITIONAL_LOG_DETAILS", a4);
            }
            return i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        InterfaceC0179d interfaceC0179d;
        int readInt;
        String str;
        X1.a aVar;
        InterfaceC0179d interfaceC0179d2;
        Exception exc;
        C1112C x3;
        ArrayList arrayList;
        InterfaceC0179d interfaceC0179d3;
        InterfaceC0179d interfaceC0179d4;
        int i3 = 20;
        int i4 = 119;
        Exception exc2 = null;
        boolean z3 = true;
        switch (this.f10080a) {
            case 0:
                C1116d c1116d = this.f10081b;
                C1121i c1121i = (C1121i) this.f10082c;
                F1.b bVar = (F1.b) this.f10083d;
                String str2 = c1121i.f10048a;
                try {
                    AbstractC0213o0.f("BillingClient", "Consuming purchase with token: " + str2);
                    synchronized (c1116d.f10017a) {
                        interfaceC0179d = c1116d.f10023h;
                    }
                    if (interfaceC0179d == null) {
                        c1116d.B(bVar, O.f9977k, 119, "Service has been reset to null.", null);
                    } else {
                        if (c1116d.f10030o) {
                            String packageName = c1116d.f.getPackageName();
                            boolean z4 = c1116d.f10030o;
                            String str3 = c1116d.f10019c;
                            long longValue = c1116d.f10016E.longValue();
                            Bundle bundle = new Bundle();
                            if (z4) {
                                AbstractC0213o0.b(bundle, str3, longValue);
                            }
                            Bundle f = ((C0173b) interfaceC0179d).f(packageName, str2, bundle);
                            readInt = f.getInt("RESPONSE_CODE");
                            str = AbstractC0213o0.e(f, "BillingClient");
                        } else {
                            String packageName2 = c1116d.f.getPackageName();
                            C0173b c0173b = (C0173b) interfaceC0179d;
                            Parcel a3 = c0173b.a();
                            a3.writeInt(3);
                            a3.writeString(packageName2);
                            a3.writeString(str2);
                            Parcel b3 = c0173b.b(a3, 5);
                            readInt = b3.readInt();
                            b3.recycle();
                            str = "";
                        }
                        C1120h a4 = O.a(readInt, str);
                        if (readInt == 0) {
                            AbstractC0213o0.f("BillingClient", "Successfully consumed purchase.");
                            ((C0081e) bVar.f378b).a(F2.b.s(a4));
                        } else {
                            c1116d.B(bVar, a4, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                        }
                    }
                } catch (DeadObjectException e3) {
                    c1116d.B(bVar, O.f9977k, 29, "Error consuming purchase!", e3);
                } catch (Exception e4) {
                    c1116d.B(bVar, O.f9975i, 29, "Error consuming purchase!", e4);
                }
                return null;
            case 1:
                Exception exc3 = null;
                boolean z5 = true;
                C1116d c1116d2 = this.f10081b;
                b0.j jVar = (b0.j) this.f10082c;
                c1116d2.getClass();
                ArrayList arrayList2 = new ArrayList();
                String str4 = ((C1130s) ((com.google.android.gms.internal.play_billing.C) jVar.f2462a).get(0)).f10076b;
                com.google.android.gms.internal.play_billing.C c3 = (com.google.android.gms.internal.play_billing.C) jVar.f2462a;
                int size = c3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        aVar = new X1.a(0, "", arrayList2);
                    } else {
                        int i6 = i5 + 20;
                        ArrayList arrayList3 = new ArrayList(c3.subList(i5, i6 > size ? size : i6));
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        int size2 = arrayList3.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            arrayList4.add(((C1130s) arrayList3.get(i7)).f10075a);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList4);
                        bundle2.putString("playBillingLibraryVersion", c1116d2.f10019c);
                        try {
                            synchronized (c1116d2.f10017a) {
                                interfaceC0179d2 = c1116d2.f10023h;
                            }
                            if (interfaceC0179d2 == null) {
                                aVar = c1116d2.v(O.f9977k, 119, "Service has been reset to null.", exc3);
                            } else {
                                int i8 = z5 != c1116d2.f10038w ? 17 : i3;
                                String packageName3 = c1116d2.f.getPackageName();
                                boolean z6 = c1116d2.f10037v && c1116d2.f10012A.f10049a;
                                String str5 = c1116d2.f10019c;
                                c1116d2.o();
                                c1116d2.o();
                                c1116d2.o();
                                c1116d2.o();
                                long longValue2 = c1116d2.f10016E.longValue();
                                Bundle bundle3 = new Bundle();
                                AbstractC0213o0.b(bundle3, str5, longValue2);
                                bundle3.putBoolean("enablePendingPurchases", true);
                                bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                if (z6) {
                                    bundle3.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                }
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                ArrayList<String> arrayList6 = new ArrayList<>();
                                int size3 = arrayList3.size();
                                int i9 = 0;
                                boolean z7 = false;
                                while (i9 < size3) {
                                    com.google.android.gms.internal.play_billing.C c4 = c3;
                                    C1130s c1130s = (C1130s) arrayList3.get(i9);
                                    int i10 = size;
                                    arrayList5.add(null);
                                    z7 |= !TextUtils.isEmpty(null);
                                    if (c1130s.f10076b.equals("first_party")) {
                                        throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    }
                                    i9++;
                                    size = i10;
                                    c3 = c4;
                                }
                                com.google.android.gms.internal.play_billing.C c5 = c3;
                                int i11 = size;
                                if (z7) {
                                    bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                                }
                                if (!arrayList6.isEmpty()) {
                                    bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                                }
                                Bundle l3 = ((C0173b) interfaceC0179d2).l(i8, packageName3, str4, bundle2, bundle3);
                                if (l3 == null) {
                                    aVar = c1116d2.v(O.f9963A, 44, "queryProductDetailsAsync got empty product details response.", null);
                                } else if (l3.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = l3.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        for (int i12 = 0; i12 < stringArrayList.size(); i12++) {
                                            try {
                                                C1126n c1126n = new C1126n(stringArrayList.get(i12));
                                                AbstractC0213o0.f("BillingClient", "Got product details: ".concat(c1126n.toString()));
                                                arrayList2.add(c1126n);
                                            } catch (JSONException e5) {
                                                aVar = c1116d2.v(O.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e5);
                                            }
                                        }
                                        z5 = true;
                                        i5 = i6;
                                        size = i11;
                                        c3 = c5;
                                        i3 = 20;
                                        exc3 = null;
                                    } else {
                                        aVar = c1116d2.v(O.f9963A, 46, "queryProductDetailsAsync got null response list", null);
                                    }
                                } else {
                                    int a5 = AbstractC0213o0.a(l3, "BillingClient");
                                    String e6 = AbstractC0213o0.e(l3, "BillingClient");
                                    aVar = a5 != 0 ? c1116d2.v(O.a(a5, e6), 23, B0.c.h(a5, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : c1116d2.v(O.a(6, e6), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                }
                            }
                        } catch (DeadObjectException e7) {
                            aVar = c1116d2.v(O.f9977k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e7);
                        } catch (Exception e8) {
                            aVar = c1116d2.v(O.f9975i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e8);
                        }
                    }
                }
                ((InterfaceC1127o) this.f10083d).onProductDetailsResponse(O.a(aVar.f1632a, (String) aVar.f1634c), (ArrayList) aVar.f1633b);
                return null;
            case 2:
                C1116d c1116d3 = this.f10081b;
                String str6 = (String) this.f10082c;
                c1116d3.getClass();
                AbstractC0213o0.f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str6)));
                ArrayList arrayList7 = new ArrayList();
                boolean z8 = c1116d3.f10030o;
                boolean z9 = c1116d3.f10037v;
                c1116d3.f10012A.getClass();
                Bundle c6 = AbstractC0213o0.c(z8, z9, c1116d3.f10012A.f10049a, c1116d3.f10019c, c1116d3.f10016E.longValue());
                String str7 = null;
                while (true) {
                    try {
                        synchronized (c1116d3.f10017a) {
                            try {
                                interfaceC0179d3 = c1116d3.f10023h;
                            } catch (Throwable th) {
                                th = th;
                                exc = exc2;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (DeadObjectException e9) {
                                            e = e9;
                                            x3 = c1116d3.x(O.f9977k, 52, "Got exception trying to get purchases try to reconnect", e);
                                            arrayList = x3.f9941a;
                                            if (arrayList != null) {
                                            }
                                            return exc;
                                        } catch (Exception e10) {
                                            e = e10;
                                            x3 = c1116d3.x(O.f9975i, 52, "Got exception trying to get purchases try to reconnect", e);
                                            arrayList = x3.f9941a;
                                            if (arrayList != null) {
                                            }
                                            return exc;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                        if (interfaceC0179d3 == null) {
                            x3 = c1116d3.x(O.f9977k, i4, "Service has been reset to null", exc2);
                        } else {
                            Bundle k3 = c1116d3.f10030o ? ((C0173b) interfaceC0179d3).k(z3 != c1116d3.f10037v ? 9 : 19, c1116d3.f.getPackageName(), str6, str7, c6) : ((C0173b) interfaceC0179d3).j(c1116d3.f.getPackageName(), str6, str7);
                            E R2 = X0.a.R(k3, "getPurchase()");
                            C1120h c1120h = (C1120h) R2.f9946b;
                            if (c1120h != O.f9976j) {
                                x3 = c1116d3.x(c1120h, R2.f9945a, "Purchase bundle invalid", exc2);
                            } else {
                                ArrayList<String> stringArrayList2 = k3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList3 = k3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = k3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                boolean z10 = z3;
                                int i13 = 0;
                                boolean z11 = false;
                                while (i13 < stringArrayList3.size()) {
                                    String str8 = stringArrayList3.get(i13);
                                    String str9 = stringArrayList4.get(i13);
                                    exc = exc2;
                                    AbstractC0213o0.f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList2.get(i13))));
                                    try {
                                        Purchase purchase = new Purchase(str8, str9);
                                        if (TextUtils.isEmpty(purchase.b())) {
                                            AbstractC0213o0.g("BillingClient", "BUG: empty/null token!");
                                            z11 = z10;
                                        }
                                        arrayList7.add(purchase);
                                        i13++;
                                        exc2 = exc;
                                    } catch (JSONException e11) {
                                        x3 = c1116d3.x(O.f9975i, 51, "Got an exception trying to decode the purchase!", e11);
                                    }
                                }
                                exc = exc2;
                                if (z11) {
                                    c1116d3.H(26, 9, O.f9975i);
                                }
                                str7 = k3.getString("INAPP_CONTINUATION_TOKEN");
                                AbstractC0213o0.f("BillingClient", "Continuation token: ".concat(String.valueOf(str7)));
                                if (TextUtils.isEmpty(str7)) {
                                    x3 = new C1112C(O.f9976j, arrayList7);
                                } else {
                                    z3 = z10;
                                    exc2 = exc;
                                    i4 = 119;
                                }
                            }
                        }
                    } catch (DeadObjectException e12) {
                        e = e12;
                        exc = exc2;
                    } catch (Exception e13) {
                        e = e13;
                        exc = exc2;
                    }
                }
                exc = exc2;
                arrayList = x3.f9941a;
                if (arrayList != null) {
                    ((InterfaceC1129q) this.f10083d).onQueryPurchasesResponse(x3.f9942b, arrayList);
                } else {
                    InterfaceC1129q interfaceC1129q = (InterfaceC1129q) this.f10083d;
                    C1120h c1120h2 = x3.f9942b;
                    C0244z c0244z = com.google.android.gms.internal.play_billing.C.f2606b;
                    interfaceC1129q.onQueryPurchasesResponse(c1120h2, com.google.android.gms.internal.play_billing.Q.f2666e);
                }
                return exc;
            case 3:
                return a();
            case 4:
                return b();
            default:
                C1116d c1116d4 = this.f10081b;
                F1.b bVar2 = (F1.b) this.f10082c;
                B2.v vVar = (B2.v) this.f10083d;
                try {
                    synchronized (c1116d4.f10017a) {
                        interfaceC0179d4 = c1116d4.f10023h;
                    }
                    if (interfaceC0179d4 == null) {
                        c1116d4.z(bVar2, O.f9977k, 119, null);
                    } else {
                        String packageName4 = c1116d4.f.getPackageName();
                        String str10 = vVar.f184b;
                        String str11 = c1116d4.f10019c;
                        long longValue3 = c1116d4.f10016E.longValue();
                        Bundle bundle4 = new Bundle();
                        AbstractC0213o0.b(bundle4, str11, longValue3);
                        Bundle e14 = ((C0173b) interfaceC0179d4).e(packageName4, str10, bundle4);
                        ((C0081e) bVar2.f378b).a(F2.b.s(O.a(AbstractC0213o0.a(e14, "BillingClient"), AbstractC0213o0.e(e14, "BillingClient"))));
                    }
                } catch (DeadObjectException e15) {
                    c1116d4.z(bVar2, O.f9977k, 28, e15);
                } catch (Exception e16) {
                    c1116d4.z(bVar2, O.f9975i, 28, e16);
                }
                return null;
        }
    }
}
