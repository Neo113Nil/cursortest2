package v1;

import Y1.C0077a;
import a.AbstractC0086a;
import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l.s0;
import o1.C1149a;
import o1.h;
import o1.i;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.C1166b;
import q1.InterfaceC1171a;
import s1.C1201h;
import s1.C1202i;
import z1.C1262a;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1217a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10406a;

    /* renamed from: c, reason: collision with root package name */
    public C1149a f10408c;

    /* renamed from: d, reason: collision with root package name */
    public C1166b f10409d;
    public long f = System.nanoTime();

    /* renamed from: e, reason: collision with root package name */
    public int f10410e = 1;

    /* renamed from: b, reason: collision with root package name */
    public C1262a f10407b = new C1262a(null);

    public AbstractC1217a(String str) {
        this.f10406a = str;
    }

    public static JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((q1.c) ((InterfaceC1171a) it.next())).getClass();
            for (String str : Collections.singletonList("1.0")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mechanism", "FireTVFOSDAT");
                jSONObject.put("executionEnvironment", "NATIVE");
                jSONObject.put("version", str);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public final void b(String str, JSONObject jSONObject) {
        C1202i.f10332a.a(g(), "publishMediaEvent", str, jSONObject, this.f10406a);
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        w1.b.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C1202i.f10332a.a(g(), "setLastActivity", jSONObject);
    }

    public void d(i iVar, s0 s0Var) {
        e(iVar, s0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005c, code lost:
    
        if (r1 != 4) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef A[LOOP:0: B:18:0x00e9->B:20:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(i iVar, s0 s0Var, JSONObject jSONObject) {
        char c3;
        String str;
        String str2;
        String str3 = iVar.f10174h;
        JSONObject jSONObject2 = new JSONObject();
        w1.b.b(jSONObject2, "environment", "app");
        w1.b.b(jSONObject2, "adSessionType", (o1.c) s0Var.f9883g);
        JSONObject jSONObject3 = new JSONObject();
        w1.b.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        w1.b.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        w1.b.b(jSONObject3, "os", "Android");
        w1.b.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = AbstractC0086a.f1779a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            c3 = 1;
            if (currentModeType == 1) {
                c3 = 2;
            }
            if (c3 != 1) {
                str = "ctv";
            } else if (c3 == 2) {
                str = "mobile";
            } else {
                if (c3 != 3) {
                    throw null;
                }
                str = "other";
            }
            w1.b.b(jSONObject2, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            w1.b.b(jSONObject2, "supports", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            ((C0077a) s0Var.f9878a).getClass();
            w1.b.b(jSONObject4, "partnerName", "Startio");
            w1.b.b(jSONObject4, "partnerVersion", "5.3.0");
            w1.b.b(jSONObject2, "omidNativeInfo", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            w1.b.b(jSONObject5, "libraryVersion", "1.6.0-Startio");
            w1.b.b(jSONObject5, "appId", C1201h.f10330b.f10331a.getApplicationContext().getPackageName());
            w1.b.b(jSONObject2, "app", jSONObject5);
            str2 = (String) s0Var.f;
            if (str2 != null) {
                w1.b.b(jSONObject2, "customReferenceData", str2);
            }
            JSONObject jSONObject6 = new JSONObject();
            for (h hVar : Collections.unmodifiableList((ArrayList) s0Var.f9880c)) {
                w1.b.b(jSONObject6, hVar.f10165a, hVar.f10167c);
            }
            C1202i.f10332a.a(g(), "startSession", str3, jSONObject2, jSONObject6, jSONObject);
        }
        c3 = 3;
        if (c3 != 1) {
        }
        w1.b.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        w1.b.b(jSONObject2, "supports", jSONArray2);
        JSONObject jSONObject42 = new JSONObject();
        ((C0077a) s0Var.f9878a).getClass();
        w1.b.b(jSONObject42, "partnerName", "Startio");
        w1.b.b(jSONObject42, "partnerVersion", "5.3.0");
        w1.b.b(jSONObject2, "omidNativeInfo", jSONObject42);
        JSONObject jSONObject52 = new JSONObject();
        w1.b.b(jSONObject52, "libraryVersion", "1.6.0-Startio");
        w1.b.b(jSONObject52, "appId", C1201h.f10330b.f10331a.getApplicationContext().getPackageName());
        w1.b.b(jSONObject2, "app", jSONObject52);
        str2 = (String) s0Var.f;
        if (str2 != null) {
        }
        JSONObject jSONObject62 = new JSONObject();
        while (r7.hasNext()) {
        }
        C1202i.f10332a.a(g(), "startSession", str3, jSONObject2, jSONObject62, jSONObject);
    }

    public void f() {
        this.f10407b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView g() {
        return (WebView) this.f10407b.get();
    }

    public void h() {
    }
}
