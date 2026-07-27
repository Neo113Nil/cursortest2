package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.android.billingclient.api.BillingClient;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.pi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3997pi {

    /* renamed from: a, reason: collision with root package name */
    public static String f7307a;
    public static Fi b;
    public static int c;
    public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AbstractC3997pi.c());
        }
    });

    public static void a() {
        Db db;
        Context context = AbstractC3914mk.f7252a;
        String str = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            db = Cb.a(context, "purchase_store");
        } else {
            db = null;
        }
        if (db != null) {
            Intrinsics.checkNotNullParameter("purchase_pref", "key");
            str = db.f6510a.getString("purchase_pref", null);
        }
        if (str != null) {
            String str2 = "Fetched data from preference: " + str;
            f7307a = str;
        }
    }

    public static void b() {
        try {
            Context context = AbstractC3914mk.f7252a;
            if (context == null) {
                return;
            }
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            if (((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    c = 1;
                    Fi fi = new Fi();
                    b = fi;
                    fi.a(context, new Function1() { // from class: com.inmobi.media.pi$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC3997pi.a((C4025qi) obj);
                        }
                    });
                }
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            String str = "Failed to fetch In App Purchases count with unexpected error: " + e.getMessage();
        }
    }

    public static final boolean c() {
        boolean z = false;
        try {
            Class.forName(InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT);
            z = true;
        } catch (ClassNotFoundException e) {
            String str = "Class Not Found: " + e.getMessage();
        } catch (Exception e2) {
            String str2 = "Caught an unhandled exception: " + e2.getMessage();
        }
        String str3 = "Billing client Dependency available:" + z;
        return z;
    }

    public static final Unit a(C4025qi c4025qi) {
        Db db;
        c = 2;
        if (c4025qi == null) {
            Fi fi = b;
            if (fi != null) {
                fi.f6561a = null;
                BillingClient billingClient = fi.b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            b = null;
            return Unit.INSTANCE;
        }
        String str = "Fetched NIP from Purchase Tracker: " + c4025qi;
        JSONObject jSONObject = new JSONObject();
        int i = c4025qi.f7330a;
        if (i > 0) {
            jSONObject.put("p", i);
        }
        int i2 = c4025qi.b;
        if (i2 > 0) {
            jSONObject.put(CmcdData.Factory.STREAMING_FORMAT_SS, i2);
        }
        String nipMapJSON = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (nipMapJSON != null) {
            f7307a = nipMapJSON;
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                db = Cb.a(context, "purchase_store");
            } else {
                db = null;
            }
            if (db != null) {
                ConcurrentHashMap concurrentHashMap2 = Db.b;
                db.a("purchase_pref", nipMapJSON, false);
            }
        }
        Fi fi2 = b;
        if (fi2 != null) {
            fi2.f6561a = null;
            BillingClient billingClient2 = fi2.b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        b = null;
        return Unit.INSTANCE;
    }

    public static boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Y5.f6965a.getClass();
        if (!Y5.x()) {
            return false;
        }
        if (!((Boolean) d.getValue()).booleanValue()) {
            AbstractC4219xi.a(C4053ri.f7355a);
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i = c;
        if (i != 1 && i != 2) {
            return true;
        }
        AbstractC4219xi.a(new C4109ti(i != 1 ? i != 2 ? (short) 0 : (short) 2232 : (short) 2231));
        return false;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            boolean contains = CollectionsKt.contains(((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!contains) {
                AbstractC4219xi.a(new C4165vi(string));
            }
            return contains;
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            String str = "Failed to fetch Billing Client version from meta data: " + e.getMessage();
            return false;
        }
    }
}
