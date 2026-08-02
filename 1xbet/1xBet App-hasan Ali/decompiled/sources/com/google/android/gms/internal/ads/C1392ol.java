package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392ol {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f14844a;

    /* renamed from: b, reason: collision with root package name */
    public final C0584Ed f14845b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f14846c = new Bundle();

    public C1392ol(Context context, C1616tl c1616tl, C0584Ed c0584Ed, Wq wq, String str, String str2, P2.g gVar) {
        c1616tl.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c1616tl.f15714a);
        this.f14844a = concurrentHashMap;
        this.f14845b = c0584Ed;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        A7 a7 = F7.e9;
        Q2.r rVar = Q2.r.f5053d;
        ActivityManager.MemoryInfo memoryInfo = null;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            int i = gVar.f4741y;
            int i5 = i - 1;
            if (i == 0) {
                throw null;
            }
            concurrentHashMap.put("asv", i5 != 0 ? i5 != 1 ? "na" : "2" : "1");
        }
        A7 a72 = F7.f8805b2;
        D7 d7 = rVar.f5056c;
        if (((Boolean) d7.a(a72)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            a("rt_f", String.valueOf(runtime.freeMemory()));
            a("rt_m", String.valueOf(runtime.maxMemory()));
            a("rt_t", String.valueOf(runtime.totalMemory()));
            a("wv_c", String.valueOf(P2.o.f4767B.f4774g.f8016j.get()));
            if (((Boolean) d7.a(F7.f8831g2)).booleanValue()) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    memoryInfo = new ActivityManager.MemoryInfo();
                    try {
                        activityManager.getMemoryInfo(memoryInfo);
                    } catch (NullPointerException unused) {
                        U2.j.i("Error retrieving the memory information.");
                    }
                }
                if (memoryInfo != null) {
                    a("mem_avl", String.valueOf(memoryInfo.availMem));
                    a("mem_tt", String.valueOf(memoryInfo.totalMem));
                    a("low_m", true != memoryInfo.lowMemory ? "0" : "1");
                }
            }
        }
        if (((Boolean) d7.a(F7.A6)).booleanValue()) {
            int S4 = G4.d.S(wq) - 1;
            if (S4 == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (S4 == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (S4 == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (S4 != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            Q2.X0 x02 = wq.f12098d;
            a("ragent", x02.f4972z);
            a("rtype", G4.d.P(G4.d.Q(x02)));
        }
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f14844a.put(str, str2);
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            a("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            a("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
