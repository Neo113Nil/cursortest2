package com.facebook.appevents.internal;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.S;
import com.facebook.appevents.A;
import com.facebook.appevents.B;
import com.facebook.appevents.iap.q;
import com.facebook.appevents.iap.s;
import com.facebook.appevents.iap.u;
import com.facebook.appevents.z;
import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.internal.p;
import com.facebook.w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nAutomaticAnalyticsLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomaticAnalyticsLogger.kt\ncom/facebook/appevents/internal/AutomaticAnalyticsLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,532:1\n1549#2:533\n1620#2,3:534\n215#3,2:537\n*S KotlinDebug\n*F\n+ 1 AutomaticAnalyticsLogger.kt\ncom/facebook/appevents/internal/AutomaticAnalyticsLogger\n*L\n198#1:533\n198#1:534,3\n480#1:537,2\n*E\n"})
/* loaded from: classes3.dex */
public final class k {
    public static final k a = new k();
    public static final z b = new z(w.a());

    public static final class a {
        public final BigDecimal a;
        public final Currency b;
        public final Bundle c;
        public final A d;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param, A operationalData) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            this.a = purchaseAmount;
            this.b = currency;
            this.c = param;
            this.d = operationalData;
        }
    }

    public static a a(String str, Bundle bundle, A a2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (Intrinsics.areEqual(str, "subs")) {
            A.a aVar = A.Companion;
            String bool = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            Intrinsics.checkNotNullExpressionValue(bool, "toString(\n              …      )\n                )");
            aVar.getClass();
            A.a.a("fb_iap_subs_auto_renewing", bool, bundle, a2);
            String optString = jSONObject2.optString("subscriptionPeriod");
            Intrinsics.checkNotNullExpressionValue(optString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            A.a.a("fb_iap_subs_period", optString, bundle, a2);
            String optString2 = jSONObject2.optString("freeTrialPeriod");
            Intrinsics.checkNotNullExpressionValue(optString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            A.a.a("fb_free_trial_period", optString2, bundle, a2);
            String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                A.a.a("fb_intro_price_cycles", introductoryPriceCycles, bundle, a2);
            }
            String introductoryPricePeriod = jSONObject2.optString("introductoryPricePeriod");
            Intrinsics.checkNotNullExpressionValue(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                A.a.a("fb_intro_period", introductoryPricePeriod, bundle, a2);
            }
            String introductoryPriceAmountMicros = jSONObject2.optString("introductoryPriceAmountMicros");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                A.a.a("fb_intro_price_amount_micros", introductoryPriceAmountMicros, bundle, a2);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new a(bigDecimal, currency, bundle, a2);
    }

    public static List b(String str, Bundle bundle, A a2, JSONObject jSONObject) {
        if (!Intrinsics.areEqual(str, "subs")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return CollectionsKt.mutableListOf(new a(bigDecimal, currency, bundle, a2));
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "subscriptionOfferDetails";
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(str2).getJSONObject(i);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            A a3 = new A();
            LinkedHashMap linkedHashMap = a2.a;
            for (B b2 : linkedHashMap.keySet()) {
                Map map = (Map) linkedHashMap.get(b2);
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        String str4 = str2;
                        int i2 = length;
                        Object obj = map.get(str3);
                        if (obj != null) {
                            a3.a(b2, str3, obj);
                        }
                        str2 = str4;
                        length = i2;
                    }
                }
            }
            String str5 = str2;
            int i3 = length;
            String basePlanId = jSONObject3.getString("basePlanId");
            A.a aVar = A.Companion;
            Intrinsics.checkNotNullExpressionValue(basePlanId, "basePlanId");
            aVar.getClass();
            A.a.a("fb_iap_base_plan", basePlanId, bundle2, a3);
            JSONObject jSONObject4 = jSONObject3.getJSONArray("pricingPhases").getJSONObject(r5.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String optString = jSONObject4.optString("billingPeriod");
            Intrinsics.checkNotNullExpressionValue(optString, "subscriptionJSON.optStri…IOD\n                    )");
            A.a.a("fb_iap_subs_period", optString, bundle2, a3);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                A.a.a("fb_iap_subs_auto_renewing", CredentialEntry.FALSE_STRING, bundle2, a3);
            } else {
                A.a.a("fb_iap_subs_auto_renewing", CredentialEntry.TRUE_STRING, bundle2, a3);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new a(bigDecimal2, currency2, bundle2, a3));
            i++;
            str2 = str5;
            length = i3;
        }
        return arrayList;
    }

    @JvmStatic
    public static final boolean c() {
        com.facebook.internal.n b2 = p.b(w.b());
        return b2 != null && S.c() && b2.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012f A[Catch: JSONException | Exception -> 0x0149, JSONException | Exception -> 0x0149, TryCatch #6 {JSONException | Exception -> 0x0149, blocks: (B:5:0x002c, B:7:0x0042, B:8:0x004e, B:12:0x00e7, B:12:0x00e7, B:13:0x00f1, B:13:0x00f1, B:14:0x00f9, B:14:0x00f9, B:16:0x00ff, B:16:0x00ff, B:18:0x011a, B:18:0x011a, B:20:0x0122, B:20:0x0122, B:121:0x012f, B:121:0x012f, B:123:0x0138, B:123:0x0138, B:127:0x0143, B:127:0x0143, B:132:0x00e1, B:132:0x00e1), top: B:4:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7 A[Catch: JSONException | Exception -> 0x0149, JSONException | Exception -> 0x0149, TryCatch #6 {JSONException | Exception -> 0x0149, blocks: (B:5:0x002c, B:7:0x0042, B:8:0x004e, B:12:0x00e7, B:12:0x00e7, B:13:0x00f1, B:13:0x00f1, B:14:0x00f9, B:14:0x00f9, B:16:0x00ff, B:16:0x00ff, B:18:0x011a, B:18:0x011a, B:20:0x0122, B:20:0x0122, B:121:0x012f, B:121:0x012f, B:123:0x0138, B:123:0x0138, B:127:0x0143, B:127:0x0143, B:132:0x00e1, B:132:0x00e1), top: B:4:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ff A[Catch: JSONException | Exception -> 0x0149, JSONException | Exception -> 0x0149, LOOP:0: B:14:0x00f9->B:16:0x00ff, LOOP_END, TryCatch #6 {JSONException | Exception -> 0x0149, blocks: (B:5:0x002c, B:7:0x0042, B:8:0x004e, B:12:0x00e7, B:12:0x00e7, B:13:0x00f1, B:13:0x00f1, B:14:0x00f9, B:14:0x00f9, B:16:0x00ff, B:16:0x00ff, B:18:0x011a, B:18:0x011a, B:20:0x0122, B:20:0x0122, B:121:0x012f, B:121:0x012f, B:123:0x0138, B:123:0x0138, B:127:0x0143, B:127:0x0143, B:132:0x00e1, B:132:0x00e1), top: B:4:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122 A[Catch: JSONException | Exception -> 0x0149, JSONException | Exception -> 0x0149, TryCatch #6 {JSONException | Exception -> 0x0149, blocks: (B:5:0x002c, B:7:0x0042, B:8:0x004e, B:12:0x00e7, B:12:0x00e7, B:13:0x00f1, B:13:0x00f1, B:14:0x00f9, B:14:0x00f9, B:16:0x00ff, B:16:0x00ff, B:18:0x011a, B:18:0x011a, B:20:0x0122, B:20:0x0122, B:121:0x012f, B:121:0x012f, B:123:0x0138, B:123:0x0138, B:127:0x0143, B:127:0x0143, B:132:0x00e1, B:132:0x00e1), top: B:4:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String purchase, String skuDetail, boolean z, u.a aVar, boolean z2) {
        List<a> purchaseLoggingParametersList;
        String str;
        String eventName;
        int collectionSizeOrDefault;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Bundle bundle;
        A a2;
        String type;
        String str2;
        List b2;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetail, "skuDetails");
        if (!c()) {
            return;
        }
        a.getClass();
        HashMap hashMap = new HashMap();
        Bundle bundle2 = null;
        try {
            jSONObject = new JSONObject(purchase);
            jSONObject2 = new JSONObject(skuDetail);
            bundle = new Bundle(1);
            a2 = new A();
            if (aVar != null) {
                A.a aVar2 = A.Companion;
                String str3 = aVar.a;
                aVar2.getClass();
                A.a.a("fb_iap_sdk_supported_library_versions", str3, bundle, a2);
            }
            A.a aVar3 = A.Companion;
            String string = jSONObject.getString("productId");
            Intrinsics.checkNotNullExpressionValue(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            aVar3.getClass();
            A.a.a("fb_iap_product_id", string, bundle, a2);
            String string2 = jSONObject.getString("productId");
            Intrinsics.checkNotNullExpressionValue(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            A.a.a("fb_content_id", string2, bundle, a2);
            A.a.a("android_dynamic_ads_content_id", "client_implicit", bundle, a2);
            String string3 = jSONObject.getString("purchaseTime");
            Intrinsics.checkNotNullExpressionValue(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            A.a.a("fb_iap_purchase_time", string3, bundle, a2);
            String string4 = jSONObject.getString("purchaseToken");
            Intrinsics.checkNotNullExpressionValue(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            A.a.a("fb_iap_purchase_token", string4, bundle, a2);
            String optString = jSONObject.optString("packageName");
            Intrinsics.checkNotNullExpressionValue(optString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            A.a.a("fb_iap_package_name", optString, bundle, a2);
            String optString2 = jSONObject2.optString("title");
            Intrinsics.checkNotNullExpressionValue(optString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            A.a.a("fb_iap_product_title", optString2, bundle, a2);
            String optString3 = jSONObject2.optString("description");
            Intrinsics.checkNotNullExpressionValue(optString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            A.a.a("fb_iap_product_description", optString3, bundle, a2);
            type = jSONObject2.optString("type");
            Intrinsics.checkNotNullExpressionValue(type, "type");
            A.a.a("fb_iap_product_type", type, bundle, a2);
            s sVar = s.a;
        } catch (JSONException | Exception unused) {
            purchaseLoggingParametersList = null;
        }
        if (!com.facebook.internal.instrument.crashshield.a.b(s.class)) {
            try {
                str2 = s.d;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, s.class);
            }
            if (str2 != null) {
                A.Companion.getClass();
                A.a.a("fb_iap_client_library_version", str2, bundle, a2);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                A.Companion.getClass();
                A.a.a(str4, str5, bundle, a2);
            }
            if (jSONObject2.has("price_amount_micros")) {
                if (!jSONObject2.has("subscriptionOfferDetails") && !jSONObject2.has("oneTimePurchaseOfferDetails")) {
                    b2 = null;
                }
                b2 = b(type, bundle, a2, jSONObject2);
            } else {
                b2 = CollectionsKt.mutableListOf(a(type, bundle, a2, jSONObject, jSONObject2));
            }
            purchaseLoggingParametersList = b2;
            if (purchaseLoggingParametersList == null && !purchaseLoggingParametersList.isEmpty()) {
                if (z || !com.facebook.internal.m.b("app_events_if_auto_log_subs", w.b(), false)) {
                    str = !z2 ? "fb_mobile_purchase_restored" : "fb_mobile_purchase";
                } else if (z2) {
                    str = "SubscriptionRestore";
                } else {
                    q qVar = q.a;
                    qVar.getClass();
                    if (!com.facebook.internal.instrument.crashshield.a.b(qVar)) {
                        try {
                            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
                            try {
                                String optString4 = new JSONObject(skuDetail).optString("freeTrialPeriod");
                                if (optString4 != null) {
                                    if (optString4.length() > 0) {
                                        str = "StartTrial";
                                    }
                                }
                            } catch (JSONException unused2) {
                            }
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.a.a(th2, qVar);
                        }
                    }
                    str = "Subscribe";
                }
                eventName = str;
                if (!z && C0715k.b(C0715k.b.AndroidManualImplicitSubsDedupe)) {
                    synchronized (k.class) {
                        try {
                            Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
                            Intrinsics.checkNotNullParameter(eventName, "eventName");
                            ArrayList arrayList = new ArrayList();
                            for (a aVar4 : purchaseLoggingParametersList) {
                                arrayList.add(new com.facebook.appevents.iap.a(eventName, aVar4.a.doubleValue(), aVar4.b));
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(purchaseLoggingParametersList, 10);
                            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                            for (a aVar5 : purchaseLoggingParametersList) {
                                arrayList2.add(new Pair(aVar5.c, aVar5.d));
                            }
                            bundle2 = s.c(arrayList, currentTimeMillis, true, arrayList2);
                        } finally {
                        }
                    }
                } else if (!z && C0715k.b(C0715k.b.AndroidManualImplicitPurchaseDedupe)) {
                    synchronized (k.class) {
                        Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
                        a aVar6 = (a) purchaseLoggingParametersList.get(0);
                        bundle2 = s.c(CollectionsKt.listOf(new com.facebook.appevents.iap.a("fb_mobile_purchase", aVar6.a.doubleValue(), aVar6.b)), System.currentTimeMillis(), true, CollectionsKt.listOf(new Pair(aVar6.c, aVar6.d)));
                    }
                }
                List<String> list = com.facebook.appevents.iap.p.a;
                com.facebook.appevents.iap.p.a(bundle2, ((a) purchaseLoggingParametersList.get(0)).c, ((a) purchaseLoggingParametersList.get(0)).d);
                if (!Intrinsics.areEqual(eventName, "fb_mobile_purchase")) {
                    z zVar = b;
                    BigDecimal bigDecimal = ((a) purchaseLoggingParametersList.get(0)).a;
                    Currency currency = ((a) purchaseLoggingParametersList.get(0)).b;
                    Bundle bundle3 = ((a) purchaseLoggingParametersList.get(0)).c;
                    A a3 = ((a) purchaseLoggingParametersList.get(0)).d;
                    zVar.getClass();
                    w wVar = w.a;
                    if (S.c()) {
                        com.facebook.appevents.p pVar = zVar.a;
                        pVar.getClass();
                        if (com.facebook.internal.instrument.crashshield.a.b(pVar)) {
                            return;
                        }
                        try {
                            pVar.i(bigDecimal, currency, bundle3, true, a3);
                            return;
                        } catch (Throwable th3) {
                            com.facebook.internal.instrument.crashshield.a.a(th3, pVar);
                            return;
                        }
                    }
                    return;
                }
                z zVar2 = b;
                BigDecimal bigDecimal2 = ((a) purchaseLoggingParametersList.get(0)).a;
                Currency currency2 = ((a) purchaseLoggingParametersList.get(0)).b;
                Bundle bundle4 = ((a) purchaseLoggingParametersList.get(0)).c;
                A a4 = ((a) purchaseLoggingParametersList.get(0)).d;
                zVar2.getClass();
                w wVar2 = w.a;
                if (S.c()) {
                    com.facebook.appevents.p pVar2 = zVar2.a;
                    pVar2.getClass();
                    if (com.facebook.internal.instrument.crashshield.a.b(pVar2)) {
                        return;
                    }
                    try {
                        if (currency2 == null) {
                            E e = E.a;
                        } else {
                            bundle4.putString("fb_currency", currency2.getCurrencyCode());
                            pVar2.f(eventName, Double.valueOf(bigDecimal2.doubleValue()), bundle4, true, f.b(), a4);
                        }
                        return;
                    } catch (Throwable th4) {
                        com.facebook.internal.instrument.crashshield.a.a(th4, pVar2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        str2 = null;
        if (str2 != null) {
        }
        while (r0.hasNext()) {
        }
        if (jSONObject2.has("price_amount_micros")) {
        }
        purchaseLoggingParametersList = b2;
        if (purchaseLoggingParametersList == null) {
            return;
        }
        if (z) {
        }
        if (!z2) {
        }
        eventName = str;
        if (!z) {
        }
        if (!z) {
            synchronized (k.class) {
            }
        }
        List<String> list2 = com.facebook.appevents.iap.p.a;
        com.facebook.appevents.iap.p.a(bundle2, ((a) purchaseLoggingParametersList.get(0)).c, ((a) purchaseLoggingParametersList.get(0)).d);
        if (!Intrinsics.areEqual(eventName, "fb_mobile_purchase")) {
        }
    }
}
