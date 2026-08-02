package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import n.AbstractC2107A;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1295me implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public boolean f14503k;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                U2.e eVar = C0379q.f.f5048a;
                i = U2.e.l(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                U2.j.i("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (T2.G.o()) {
            T2.G.m("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    public static void c(C0711Wd c0711Wd, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        AbstractC0690Td abstractC0690Td = c0711Wd.f12050q;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (abstractC0690Td != null) {
                    abstractC0690Td.c(parseInt);
                }
            } catch (NumberFormatException unused) {
                U2.j.i("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            if (abstractC0690Td != null) {
                abstractC0690Td.D(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            if (abstractC0690Td != null) {
                abstractC0690Td.B(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            if (abstractC0690Td != null) {
                abstractC0690Td.C(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            if (abstractC0690Td == null) {
                return;
            }
            abstractC0690Td.f(parseInt5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        int min;
        int min2;
        int i;
        C0711Wd c0711Wd;
        AbstractC0690Td abstractC0690Td;
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
        String str = (String) map.get("action");
        if (str == null) {
            U2.j.i("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer A3 = (interfaceC0677Re.n() == null || (c0711Wd = (C0711Wd) interfaceC0677Re.n().f13764o) == null || (abstractC0690Td = c0711Wd.f12050q) == null) ? null : abstractC0690Td.A();
        if (valueOf != null && A3 != null && !valueOf.equals(A3) && !str.equals("load")) {
            Locale locale = Locale.US;
            U2.j.h("Event intended for player " + valueOf + ", but sent to player " + A3 + " - event ignored");
            return;
        }
        if (U2.j.l(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            U2.j.d("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                U2.j.i("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC0677Re.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                U2.j.i("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                U2.j.i("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC0677Re.x(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                U2.j.i("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                U2.j.i("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                interfaceC0677Re.a("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, T2.F.a(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            interfaceC0677Re.a("onVideoEvent", hashMap3);
            return;
        }
        C1071hd n5 = interfaceC0677Re.n();
        if (n5 == null) {
            U2.j.i("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals("position");
        if (equals || equals2) {
            Context context = interfaceC0677Re.getContext();
            int a5 = a(context, map, "x", 0);
            int a6 = a(context, map, "y", 0);
            int a7 = a(context, map, "w", -1);
            A7 a72 = F7.f8731N3;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a72)).booleanValue()) {
                min = a7 == -1 ? interfaceC0677Re.g() : Math.min(a7, interfaceC0677Re.g());
            } else {
                if (T2.G.o()) {
                    StringBuilder w5 = AbstractC2107A.w("Calculate width with original width ", a7, ", videoHost.getVideoBoundingWidth() ", interfaceC0677Re.g(), ", x ");
                    w5.append(a5);
                    w5.append(".");
                    T2.G.m(w5.toString());
                }
                min = Math.min(a7, interfaceC0677Re.g() - a5);
            }
            int a8 = a(context, map, "h", -1);
            if (((Boolean) rVar.f5056c.a(a72)).booleanValue()) {
                min2 = a8 == -1 ? interfaceC0677Re.f() : Math.min(a8, interfaceC0677Re.f());
            } else {
                if (T2.G.o()) {
                    StringBuilder w6 = AbstractC2107A.w("Calculate height with original height ", a8, ", videoHost.getVideoBoundingHeight() ", interfaceC0677Re.f(), ", y ");
                    w6.append(a6);
                    w6.append(".");
                    T2.G.m(w6.toString());
                }
                min2 = Math.min(a8, interfaceC0677Re.f() - a6);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || ((C0711Wd) n5.f13764o) != null) {
                m3.v.c("The underlay may only be modified from the UI thread.");
                C0711Wd c0711Wd2 = (C0711Wd) n5.f13764o;
                if (c0711Wd2 != null) {
                    c0711Wd2.a(a5, a6, min, min2);
                    return;
                }
                return;
            }
            C0804be c0804be = new C0804be((String) map.get("flags"));
            if (((C0711Wd) n5.f13764o) == null) {
                C0733Ze c0733Ze = (C0733Ze) n5.f13762m;
                ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = c0733Ze.f12501k;
                AbstractC1803xs.m((L7) viewTreeObserverOnGlobalLayoutListenerC0805bf.f12868V.f14828m, viewTreeObserverOnGlobalLayoutListenerC0805bf.f12866T, "vpr2");
                C0711Wd c0711Wd3 = new C0711Wd((Context) n5.f13761l, c0733Ze, i, parseBoolean, (L7) c0733Ze.f12501k.f12868V.f14828m, c0804be);
                n5.f13764o = c0711Wd3;
                ((C0733Ze) n5.f13763n).addView(c0711Wd3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((C0711Wd) n5.f13764o).a(a5, a6, min, min2);
                c0733Ze.f12501k.f12894x.f13624v = false;
            }
            C0711Wd c0711Wd4 = (C0711Wd) n5.f13764o;
            if (c0711Wd4 != null) {
                c(c0711Wd4, map);
                return;
            }
            return;
        }
        BinderC0894df s2 = interfaceC0677Re.s();
        if (s2 != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    U2.j.i("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float parseFloat = Float.parseFloat(str6);
                    synchronized (s2.f13115l) {
                        s2.f13123t = parseFloat;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    U2.j.i("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                s2.u();
                return;
            }
        }
        C0711Wd c0711Wd5 = (C0711Wd) n5.f13764o;
        if (c0711Wd5 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            interfaceC0677Re.a("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC0677Re.getContext();
            int a9 = a(context2, map, "x", 0);
            float a10 = a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, a9, a10, 0);
            AbstractC0690Td abstractC0690Td2 = c0711Wd5.f12050q;
            if (abstractC0690Td2 != null) {
                abstractC0690Td2.dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                U2.j.i("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int parseFloat2 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC0690Td abstractC0690Td3 = c0711Wd5.f12050q;
                if (abstractC0690Td3 == null) {
                    return;
                }
                abstractC0690Td3.u(parseFloat2);
                return;
            } catch (NumberFormatException unused5) {
                U2.j.i("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c0711Wd5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c0711Wd5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            AbstractC0690Td abstractC0690Td4 = c0711Wd5.f12050q;
            if (abstractC0690Td4 == null) {
                return;
            }
            if (TextUtils.isEmpty(c0711Wd5.f12057x)) {
                c0711Wd5.c("no_src", new String[0]);
                return;
            } else {
                abstractC0690Td4.g(c0711Wd5.f12057x, c0711Wd5.f12058y, valueOf);
                return;
            }
        }
        if (str.equals("loadControl")) {
            c(c0711Wd5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC0690Td abstractC0690Td5 = c0711Wd5.f12050q;
                if (abstractC0690Td5 == null) {
                    return;
                }
                C0937ee c0937ee = abstractC0690Td5.f11653l;
                c0937ee.f13321e = true;
                c0937ee.a();
                abstractC0690Td5.m();
                return;
            }
            AbstractC0690Td abstractC0690Td6 = c0711Wd5.f12050q;
            if (abstractC0690Td6 == null) {
                return;
            }
            C0937ee c0937ee2 = abstractC0690Td6.f11653l;
            c0937ee2.f13321e = false;
            c0937ee2.a();
            abstractC0690Td6.m();
            return;
        }
        if (str.equals("pause")) {
            AbstractC0690Td abstractC0690Td7 = c0711Wd5.f12050q;
            if (abstractC0690Td7 == null) {
                return;
            }
            abstractC0690Td7.s();
            return;
        }
        if (str.equals("play")) {
            AbstractC0690Td abstractC0690Td8 = c0711Wd5.f12050q;
            if (abstractC0690Td8 == null) {
                return;
            }
            abstractC0690Td8.t();
            return;
        }
        if (str.equals("show")) {
            c0711Wd5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    U2.j.i("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        strArr2[i5] = jSONArray.getString(i5);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    U2.j.i("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                interfaceC0677Re.H0(num.intValue());
            }
            c0711Wd5.f12057x = str8;
            c0711Wd5.f12058y = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = interfaceC0677Re.getContext();
            int a11 = a(context3, map, "dx", 0);
            int a12 = a(context3, map, "dy", 0);
            float f = a11;
            float f5 = a12;
            AbstractC0690Td abstractC0690Td9 = c0711Wd5.f12050q;
            if (abstractC0690Td9 != null) {
                abstractC0690Td9.z(f, f5);
            }
            if (this.f14503k) {
                return;
            }
            interfaceC0677Re.O0();
            this.f14503k = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                c0711Wd5.k();
                return;
            } else {
                U2.j.i("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            U2.j.i("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float parseFloat3 = Float.parseFloat(str10);
            AbstractC0690Td abstractC0690Td10 = c0711Wd5.f12050q;
            if (abstractC0690Td10 == null) {
                return;
            }
            C0937ee c0937ee3 = abstractC0690Td10.f11653l;
            c0937ee3.f = parseFloat3;
            c0937ee3.a();
            abstractC0690Td10.m();
        } catch (NumberFormatException unused8) {
            U2.j.i("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
