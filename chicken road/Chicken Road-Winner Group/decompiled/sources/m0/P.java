package m0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractC0172a1;
import com.google.android.gms.internal.play_billing.AbstractC0181d1;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C0244z;
import com.google.android.gms.internal.play_billing.Q1;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class P extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9992a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f9994c;

    public P(Q q3, boolean z3) {
        this.f9994c = q3;
        this.f9993b = z3;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f9992a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f9993b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f9992a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f9992a) {
            AbstractC0213o0.g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f9992a = false;
        }
    }

    public final void c(Bundle bundle, C1120h c1120h, int i3) {
        AbstractC0172a1 p3;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                this.f9994c.f9998d.v(M.b(23, i3, c1120h));
                return;
            }
            V1.b bVar = this.f9994c.f9998d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i4 = AbstractC0172a1.f2724a;
            synchronized (AbstractC0172a1.class) {
                int i5 = AbstractC0172a1.f2724a;
                A1 a12 = A1.f2595c;
                p3 = AbstractC0181d1.p();
                int i6 = AbstractC0172a1.f2724a;
            }
            bVar.v(Q1.n(byteArray, p3));
        } catch (Throwable unused) {
            AbstractC0213o0.g("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        Q q3 = this.f9994c;
        if (extras == null) {
            AbstractC0213o0.g("BillingBroadcastManager", "Bundle is null.");
            V1.b bVar = q3.f9998d;
            C1120h c1120h = O.f9975i;
            bVar.v(M.b(11, 1, c1120h));
            r rVar = q3.f9996b;
            if (rVar != null) {
                rVar.onPurchasesUpdated(c1120h, null);
                return;
            }
            return;
        }
        C1120h d3 = AbstractC0213o0.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i3 = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        int i4 = 0;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            if (stringArrayList == null || stringArrayList2 == null) {
                Purchase j3 = AbstractC0213o0.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                if (j3 == null) {
                    AbstractC0213o0.f("BillingHelper", "Couldn't find single purchase data as well.");
                    if (d3.f10046a != 0) {
                        q3.f9998d.x(M.d(i3));
                    } else {
                        c(extras, d3, i3);
                    }
                    q3.f9996b.onPurchasesUpdated(d3, arrayList);
                    return;
                }
                arrayList2.add(j3);
            } else {
                AbstractC0213o0.f("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                while (i4 < stringArrayList.size() && i4 < stringArrayList2.size()) {
                    Purchase j4 = AbstractC0213o0.j(stringArrayList.get(i4), stringArrayList2.get(i4));
                    if (j4 != null) {
                        arrayList2.add(j4);
                    }
                    i4++;
                }
            }
            arrayList = arrayList2;
            if (d3.f10046a != 0) {
            }
            q3.f9996b.onPurchasesUpdated(d3, arrayList);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (d3.f10046a != 0) {
                c(extras, d3, i3);
                r rVar2 = q3.f9996b;
                C0244z c0244z = com.google.android.gms.internal.play_billing.C.f2606b;
                rVar2.onPurchasesUpdated(d3, com.google.android.gms.internal.play_billing.Q.f2666e);
                return;
            }
            q3.getClass();
            r rVar3 = q3.f9996b;
            G0.j jVar = q3.f9997c;
            V1.b bVar2 = q3.f9998d;
            if (jVar == null) {
                AbstractC0213o0.g("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                C1120h c1120h2 = O.f9975i;
                bVar2.v(M.b(77, i3, c1120h2));
                C0244z c0244z2 = com.google.android.gms.internal.play_billing.C.f2606b;
                rVar3.onPurchasesUpdated(c1120h2, com.google.android.gms.internal.play_billing.Q.f2666e);
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                AbstractC0213o0.g("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                C1120h c1120h3 = O.f9975i;
                bVar2.v(M.b(16, i3, c1120h3));
                C0244z c0244z3 = com.google.android.gms.internal.play_billing.C.f2606b;
                rVar3.onPurchasesUpdated(c1120h3, com.google.android.gms.internal.play_billing.Q.f2666e);
                return;
            }
            try {
                if (jVar != null) {
                    jVar.a(new V1.b(string));
                    bVar2.x(M.d(i3));
                    return;
                }
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray == null) {
                    throw null;
                }
                while (i4 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                    if (optJSONObject != null) {
                        arrayList3.add(new H(optJSONObject));
                    }
                    i4++;
                }
                throw null;
            } catch (JSONException unused) {
                AbstractC0213o0.g("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + "]");
                C1120h c1120h4 = O.f9975i;
                bVar2.v(M.b(17, i3, c1120h4));
                C0244z c0244z4 = com.google.android.gms.internal.play_billing.C.f2606b;
                rVar3.onPurchasesUpdated(c1120h4, com.google.android.gms.internal.play_billing.Q.f2666e);
            }
        }
    }
}
