package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.C0688a;
import com.facebook.K;
import com.facebook.appevents.l;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Callable {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        C0688a c0688a;
        String string;
        H h;
        com.facebook.appevents.p pVar;
        C0688a b;
        String string2;
        C0717k a = C0717k.Companion.a();
        SharedPreferences sharedPreferences = a.b.a;
        if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string2 = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
            try {
                JSONObject jSONObject = new JSONObject(string2);
                C0688a.Companion.getClass();
                c0688a = C0688a.b.a(jSONObject);
            } catch (JSONException unused) {
            }
            if (c0688a != null) {
                a.c(c0688a, false);
            }
            K a2 = K.Companion.a();
            string = a2.b.a.getString("com.facebook.ProfileManager.CachedProfile", null);
            if (string != null) {
                try {
                    h = new H(new JSONObject(string));
                } catch (JSONException unused2) {
                }
                if (h != null) {
                    a2.a(h, false);
                }
                C0688a.Companion.getClass();
                if (C0688a.b.c()) {
                    H.Companion.getClass();
                    K.a aVar = K.Companion;
                    if (aVar.a().c == null && (b = C0688a.b.b()) != null) {
                        if (C0688a.b.c()) {
                            com.facebook.internal.E.o(new I(), b.e);
                        } else {
                            aVar.a().a(null, true);
                        }
                    }
                }
                l.a aVar2 = com.facebook.appevents.l.Companion;
                final Context context = w.a();
                String str = w.e;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                com.facebook.appevents.p.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                if (S.c()) {
                    final com.facebook.appevents.p pVar2 = new com.facebook.appevents.p(context, str);
                    ScheduledThreadPoolExecutor b2 = com.facebook.appevents.p.b();
                    if (b2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    b2.execute(new Runnable() { // from class: com.facebook.appevents.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            Intrinsics.checkNotNullParameter(context2, "$context");
                            p logger = pVar2;
                            Intrinsics.checkNotNullParameter(logger, "$logger");
                            Bundle bundle = new Bundle();
                            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                            int i = 0;
                            for (int i2 = 0; i2 < 11; i2++) {
                                String str2 = strArr[i2];
                                String str3 = strArr2[i2];
                                try {
                                    Class.forName(str2);
                                    bundle.putInt(str3, 1);
                                    i |= 1 << i2;
                                } catch (ClassNotFoundException unused3) {
                                }
                            }
                            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                            if (sharedPreferences2.getInt("kitsBitmask", 0) != i) {
                                sharedPreferences2.edit().putInt("kitsBitmask", i).apply();
                                logger.h(bundle, "fb_sdk_initialize");
                            }
                        }
                    });
                }
                if (!com.facebook.internal.instrument.crashshield.a.b(S.class)) {
                    try {
                        Context a3 = w.a();
                        ApplicationInfo applicationInfo = a3.getPackageManager().getApplicationInfo(a3.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            com.facebook.appevents.p loggerImpl = new com.facebook.appevents.p(a3, (String) null);
                            Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                            Bundle bundle2 = new Bundle();
                            if (!com.facebook.internal.E.v()) {
                                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                            if (S.c()) {
                                loggerImpl.e("fb_auto_applink", bundle2);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, S.class);
                    }
                }
                l.a aVar3 = com.facebook.appevents.l.Companion;
                Context context2 = w.a().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext().applicationContext");
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                pVar = new com.facebook.appevents.p(context2, (String) null);
                if (!com.facebook.internal.instrument.crashshield.a.b(pVar)) {
                    try {
                        com.facebook.appevents.j.c(com.facebook.appevents.w.a);
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, pVar);
                    }
                }
                return null;
            }
            h = null;
            if (h != null) {
            }
            C0688a.Companion.getClass();
            if (C0688a.b.c()) {
            }
            l.a aVar22 = com.facebook.appevents.l.Companion;
            final Context context3 = w.a();
            String str2 = w.e;
            aVar22.getClass();
            Intrinsics.checkNotNullParameter(context3, "context");
            com.facebook.appevents.p.Companion.getClass();
            Intrinsics.checkNotNullParameter(context3, "context");
            if (S.c()) {
            }
            if (!com.facebook.internal.instrument.crashshield.a.b(S.class)) {
            }
            l.a aVar32 = com.facebook.appevents.l.Companion;
            Context context22 = w.a().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context22, "getApplicationContext().applicationContext");
            aVar32.getClass();
            Intrinsics.checkNotNullParameter(context22, "context");
            pVar = new com.facebook.appevents.p(context22, (String) null);
            if (!com.facebook.internal.instrument.crashshield.a.b(pVar)) {
            }
            return null;
        }
        c0688a = null;
        if (c0688a != null) {
        }
        K a22 = K.Companion.a();
        string = a22.b.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
        }
        h = null;
        if (h != null) {
        }
        C0688a.Companion.getClass();
        if (C0688a.b.c()) {
        }
        l.a aVar222 = com.facebook.appevents.l.Companion;
        final Context context32 = w.a();
        String str22 = w.e;
        aVar222.getClass();
        Intrinsics.checkNotNullParameter(context32, "context");
        com.facebook.appevents.p.Companion.getClass();
        Intrinsics.checkNotNullParameter(context32, "context");
        if (S.c()) {
        }
        if (!com.facebook.internal.instrument.crashshield.a.b(S.class)) {
        }
        l.a aVar322 = com.facebook.appevents.l.Companion;
        Context context222 = w.a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context222, "getApplicationContext().applicationContext");
        aVar322.getClass();
        Intrinsics.checkNotNullParameter(context222, "context");
        pVar = new com.facebook.appevents.p(context222, (String) null);
        if (!com.facebook.internal.instrument.crashshield.a.b(pVar)) {
        }
        return null;
    }
}
