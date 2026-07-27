package G0;

import M2.C0097a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractC0316a1;
import com.google.android.gms.internal.play_billing.AbstractC0325d1;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C0388z;
import com.google.android.gms.internal.play_billing.Q1;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Q extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f798a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f800c;

    public Q(S s2, boolean z) {
        this.f800c = s2;
        this.f799b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f798a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f799b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f798a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f798a) {
            AbstractC0357o0.g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f798a = false;
        }
    }

    public final void c(Bundle bundle, C0060j c0060j, int i2) {
        AbstractC0316a1 s2;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                this.f800c.f804d.h(M.b(23, i2, c0060j));
                return;
            }
            B0.l lVar = this.f800c.f804d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i3 = AbstractC0316a1.f5155a;
            synchronized (AbstractC0316a1.class) {
                int i6 = AbstractC0316a1.f5155a;
                A1 a12 = A1.f5019c;
                s2 = AbstractC0325d1.s();
                int i7 = AbstractC0316a1.f5155a;
            }
            lVar.h(Q1.n(byteArray, s2));
        } catch (Throwable unused) {
            AbstractC0357o0.g("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        S s2 = this.f800c;
        if (extras == null) {
            AbstractC0357o0.g("BillingBroadcastManager", "Bundle is null.");
            B0.l lVar = s2.f804d;
            C0060j c0060j = O.f779i;
            lVar.h(M.b(11, 1, c0060j));
            InterfaceC0069t interfaceC0069t = s2.f802b;
            if (interfaceC0069t != null) {
                interfaceC0069t.onPurchasesUpdated(c0060j, null);
                return;
            }
            return;
        }
        C0060j d6 = AbstractC0357o0.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i2 = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        int i3 = 0;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            if (stringArrayList == null || stringArrayList2 == null) {
                Purchase j2 = AbstractC0357o0.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                if (j2 == null) {
                    AbstractC0357o0.f("BillingHelper", "Couldn't find single purchase data as well.");
                    if (d6.f862a != 0) {
                        s2.f804d.k(M.d(i2));
                    } else {
                        c(extras, d6, i2);
                    }
                    s2.f802b.onPurchasesUpdated(d6, arrayList);
                    return;
                }
                arrayList2.add(j2);
            } else {
                AbstractC0357o0.f("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                while (i3 < stringArrayList.size() && i3 < stringArrayList2.size()) {
                    Purchase j6 = AbstractC0357o0.j(stringArrayList.get(i3), stringArrayList2.get(i3));
                    if (j6 != null) {
                        arrayList2.add(j6);
                    }
                    i3++;
                }
            }
            arrayList = arrayList2;
            if (d6.f862a != 0) {
            }
            s2.f802b.onPurchasesUpdated(d6, arrayList);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (d6.f862a != 0) {
                c(extras, d6, i2);
                InterfaceC0069t interfaceC0069t2 = s2.f802b;
                C0388z c0388z = com.google.android.gms.internal.play_billing.C.f5030b;
                interfaceC0069t2.onPurchasesUpdated(d6, com.google.android.gms.internal.play_billing.S.f5100e);
                return;
            }
            s2.getClass();
            InterfaceC0069t interfaceC0069t3 = s2.f802b;
            C0097a c0097a = s2.f803c;
            B0.l lVar2 = s2.f804d;
            if (c0097a == null) {
                AbstractC0357o0.g("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                C0060j c0060j2 = O.f779i;
                lVar2.h(M.b(77, i2, c0060j2));
                C0388z c0388z2 = com.google.android.gms.internal.play_billing.C.f5030b;
                interfaceC0069t3.onPurchasesUpdated(c0060j2, com.google.android.gms.internal.play_billing.S.f5100e);
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                AbstractC0357o0.g("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                C0060j c0060j3 = O.f779i;
                lVar2.h(M.b(16, i2, c0060j3));
                C0388z c0388z3 = com.google.android.gms.internal.play_billing.C.f5030b;
                interfaceC0069t3.onPurchasesUpdated(c0060j3, com.google.android.gms.internal.play_billing.S.f5100e);
                return;
            }
            try {
                if (c0097a != null) {
                    c0097a.a(new B0.c(string));
                    lVar2.k(M.d(i2));
                    return;
                }
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray == null) {
                    throw null;
                }
                while (i3 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                    if (optJSONObject != null) {
                        arrayList3.add(new H(optJSONObject));
                    }
                    i3++;
                }
                throw null;
            } catch (JSONException unused) {
                AbstractC0357o0.g("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + "]");
                C0060j c0060j4 = O.f779i;
                lVar2.h(M.b(17, i2, c0060j4));
                C0388z c0388z4 = com.google.android.gms.internal.play_billing.C.f5030b;
                interfaceC0069t3.onPurchasesUpdated(c0060j4, com.google.android.gms.internal.play_billing.S.f5100e);
            }
        }
    }
}
