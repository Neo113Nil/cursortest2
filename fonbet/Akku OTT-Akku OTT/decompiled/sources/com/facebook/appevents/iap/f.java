package com.facebook.appevents.iap;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.appevents.iap.u;
import com.facebook.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nInAppPurchaseActivityLifecycleTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppPurchaseActivityLifecycleTracker.kt\ncom/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes3.dex */
public final class f {
    public static final f a = new f();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static Boolean c;
    public static Boolean d;
    public static b e;
    public static e f;
    public static Intent g;
    public static Object h;
    public static u.a i;

    public static final void a(f fVar, Context context, ArrayList arrayList, boolean z) {
        fVar.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList skuList = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = (String) it.next();
            try {
                String sku = new JSONObject(purchase).getString("productId");
                Intrinsics.checkNotNullExpressionValue(sku, "sku");
                Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                hashMap.put(sku, purchase);
                skuList.add(sku);
            } catch (JSONException unused) {
            }
        }
        Object obj = h;
        q qVar = q.a;
        LinkedHashMap linkedHashMap = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(q.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(skuList, "skuList");
                LinkedHashMap j = qVar.j(skuList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = skuList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!j.containsKey(str)) {
                        arrayList2.add(str);
                    }
                }
                j.putAll(qVar.g(context, arrayList2, obj, z));
                linkedHashMap = j;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, q.class);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = (String) hashMap.get(str2);
            if (str4 != null) {
                com.facebook.appevents.internal.k.d(str4, str3, z, i, false);
            }
        }
    }

    @JvmStatic
    public static final void b(u.a billingClientVersion) {
        Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
        a.getClass();
        if (c == null) {
            Boolean valueOf = Boolean.valueOf(u.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
            c = valueOf;
            if (!Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
                d = Boolean.valueOf(u.a("com.android.billingclient.api.ProxyBillingActivity") != null);
                q qVar = q.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(q.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = q.e;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, q.class);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                g = intent;
                e = new b();
                f = new e();
            }
        }
        if (!Intrinsics.areEqual(c, Boolean.FALSE) && com.facebook.appevents.internal.k.c()) {
            i = billingClientVersion;
            if (b.compareAndSet(false, true)) {
                Context a2 = w.a();
                if (a2 instanceof Application) {
                    Application application = (Application) a2;
                    e eVar = f;
                    b bVar = null;
                    if (eVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                        eVar = null;
                    }
                    application.registerActivityLifecycleCallbacks(eVar);
                    Intent intent2 = g;
                    if (intent2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("intent");
                        intent2 = null;
                    }
                    b bVar2 = e;
                    if (bVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                    } else {
                        bVar = bVar2;
                    }
                    a2.bindService(intent2, bVar, 1);
                }
            }
        }
    }
}
