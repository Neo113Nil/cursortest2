package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Rs {

    /* renamed from: a, reason: collision with root package name */
    public final String f11460a;

    /* renamed from: c, reason: collision with root package name */
    public long f11462c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f11463d = 1;

    /* renamed from: b, reason: collision with root package name */
    public X.m f11461b = new X.m(null);

    public Rs(String str) {
        this.f11460a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f11461b.get();
    }

    public void b() {
        this.f11461b.clear();
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Us.c(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        AbstractC1668us.E(a(), "setLastActivity", jSONObject);
    }

    public void d(C1893zs c1893zs, Z1 z12) {
        e(c1893zs, z12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C1893zs c1893zs, Z1 z12, JSONObject jSONObject) {
        char c5;
        String str;
        String str2;
        String str3;
        Iterator it;
        String str4 = c1893zs.f16780g;
        JSONObject jSONObject2 = new JSONObject();
        Us.c(jSONObject2, "environment", "app");
        Us.c(jSONObject2, "adSessionType", (EnumC1848ys) z12.f12444q);
        JSONObject jSONObject3 = new JSONObject();
        Us.c(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        Us.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        Us.c(jSONObject3, "os", "Android");
        Us.c(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = AbstractC1803xs.f16346e;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                c5 = 2;
            } else if (currentModeType == 4) {
                c5 = 1;
            }
            if (c5 != 1) {
                str = "ctv";
            } else if (c5 == 2) {
                str = "mobile";
            } else {
                if (c5 != 3) {
                    throw null;
                }
                str = "other";
            }
            Us.c(jSONObject2, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            Us.c(jSONObject2, "supports", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            C1748wi c1748wi = (C1748wi) z12.f12438k;
            Us.c(jSONObject4, "partnerName", c1748wi.f16140k);
            Us.c(jSONObject4, "partnerVersion", c1748wi.f16141l);
            Us.c(jSONObject2, "omidNativeInfo", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            Us.c(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
            Us.c(jSONObject5, "appId", Ms.f10735m.f10737l.getApplicationContext().getPackageName());
            Us.c(jSONObject2, "app", jSONObject5);
            str2 = (String) z12.f12443p;
            if (str2 != null) {
                Us.c(jSONObject2, "contentUrl", str2);
            }
            str3 = (String) z12.f12442o;
            if (str3 != null) {
                Us.c(jSONObject2, "customReferenceData", str3);
            }
            JSONObject jSONObject6 = new JSONObject();
            it = Collections.unmodifiableList((ArrayList) z12.f12440m).iterator();
            if (it.hasNext()) {
                AbstractC1668us.E(a(), "startSession", str4, jSONObject2, jSONObject6, jSONObject);
                return;
            } else {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        c5 = 3;
        if (c5 != 1) {
        }
        Us.c(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        Us.c(jSONObject2, "supports", jSONArray2);
        JSONObject jSONObject42 = new JSONObject();
        C1748wi c1748wi2 = (C1748wi) z12.f12438k;
        Us.c(jSONObject42, "partnerName", c1748wi2.f16140k);
        Us.c(jSONObject42, "partnerVersion", c1748wi2.f16141l);
        Us.c(jSONObject2, "omidNativeInfo", jSONObject42);
        JSONObject jSONObject52 = new JSONObject();
        Us.c(jSONObject52, "libraryVersion", "1.5.2-google_20241009");
        Us.c(jSONObject52, "appId", Ms.f10735m.f10737l.getApplicationContext().getPackageName());
        Us.c(jSONObject2, "app", jSONObject52);
        str2 = (String) z12.f12443p;
        if (str2 != null) {
        }
        str3 = (String) z12.f12442o;
        if (str3 != null) {
        }
        JSONObject jSONObject62 = new JSONObject();
        it = Collections.unmodifiableList((ArrayList) z12.f12440m).iterator();
        if (it.hasNext()) {
        }
    }

    public void f() {
    }
}
