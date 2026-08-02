package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0709e {
    public static final String[] a;

    static {
        new C0709e();
        a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    @JvmStatic
    public static final String a() {
        if (com.facebook.internal.instrument.crashshield.a.b(C0709e.class)) {
            return null;
        }
        try {
            Context a2 = com.facebook.w.a();
            List<ResolveInfo> queryIntentServices = a2.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
            HashSet hashSet = ArraysKt.toHashSet(a);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, C0709e.class);
            return null;
        }
    }

    @JvmStatic
    public static final String b() {
        if (com.facebook.internal.instrument.crashshield.a.b(C0709e.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + com.facebook.w.a().getPackageName();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, C0709e.class);
            return null;
        }
    }

    @JvmStatic
    public static final String c(String developerDefinedRedirectURI) {
        if (com.facebook.internal.instrument.crashshield.a.b(C0709e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            return F.a(com.facebook.w.a(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : F.a(com.facebook.w.a(), b()) ? b() : "";
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, C0709e.class);
            return null;
        }
    }
}
