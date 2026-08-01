package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4698ve;
import com.ironsource.C4761z5;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f5513a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ String g;
    public final /* synthetic */ w h;

    public v(w wVar, y yVar, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.h = wVar;
        this.f5513a = yVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap;
        com.fyber.inneractive.sdk.response.e eVar;
        w wVar = this.h;
        t tVar = wVar.b;
        if (tVar != null) {
            this.f5513a.a(Integer.valueOf(tVar.val), NotificationCompat.CATEGORY_ERROR);
            this.h.b.getClass();
            str = r1.ERROR_TABLE.a();
            IAlog.a("Event dispatcher - dispatching error: %s", this.h.b);
            IAlog.d("%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(this.h.b.val));
        } else {
            u uVar = wVar.c;
            if (uVar != null) {
                this.f5513a.a(Integer.valueOf(uVar.val), NotificationCompat.CATEGORY_EVENT);
                this.h.c.getClass();
                str = r1.EVENT_TABLE.a();
                IAlog.a("Event dispatcher - dispatching event: %s", this.h.c);
                IAlog.d("%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(this.h.c.val));
            } else {
                str = null;
            }
        }
        y yVar = this.f5513a;
        StringBuilder append = new StringBuilder().append(str);
        w wVar2 = this.h;
        t tVar2 = wVar2.b;
        yVar.a(append.append(tVar2 != null ? String.valueOf(tVar2.val) : String.valueOf(wVar2.c.val)).toString(), C4761z5.R);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        this.f5513a.a(Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!IAConfigManager.c()) {
            this.f5513a.a(this.b, "contentid");
            this.f5513a.a(this.c, "fairbidv");
            if (!TextUtils.isEmpty(this.d)) {
                this.f5513a.a(this.d, "placement_type");
            }
            if (!TextUtils.isEmpty(this.e)) {
                this.f5513a.a(this.e, "spot_id");
            }
            if (!InneractiveAdManager.isCurrentUserAChild()) {
                String f = com.fyber.inneractive.sdk.util.k.f();
                if (!TextUtils.isEmpty(f)) {
                    this.f5513a.a(f, "ciso");
                }
            }
            this.f5513a.a(this.f, "ad_type");
            if (this.h.g && !TextUtils.isEmpty(this.g)) {
                this.f5513a.c = this.g;
            }
            this.f5513a.a(com.fyber.inneractive.sdk.util.a1.a().b(), C4761z5.q);
            try {
                this.f5513a.a(w.h.format(calendar.getTime()), "day");
            } catch (Throwable unused) {
            }
            this.f5513a.a(Integer.valueOf(calendar.get(11)), "hour");
            JSONArray jSONArray = this.h.d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f5513a.a(this.h.d, C4698ve.d);
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.h.e;
            if (eVar2 != null && eVar2.A) {
                this.f5513a.a("1", "sdk_bidding");
            }
            if (InneractiveAdManager.isCurrentUserAChild()) {
                this.f5513a.a("1", "child_mode");
            }
            IAConfigManager iAConfigManager = IAConfigManager.R;
            this.f5513a.a(iAConfigManager.F.n() && (eVar = this.h.e) != null && eVar.E != com.fyber.inneractive.sdk.ignite.m.NONE ? "1" : "0", "ignite");
            y yVar2 = this.f5513a;
            com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.F.o;
            yVar2.a(lVar != null ? lVar.f5145a.d() : null, "ignitep");
            y yVar3 = this.f5513a;
            com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.F.o;
            yVar3.a(lVar2 != null ? lVar2.f5145a.i() : null, "ignitev");
            JSONArray b = iAConfigManager.O.b();
            if (b != null && b.length() > 0) {
                this.f5513a.a(b, "s_experiments");
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.h.e;
            if (eVar3 != null && eVar3.I) {
                this.f5513a.a("1", "dynamic_controls");
            }
        }
        JSONArray jSONArray2 = this.h.f;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            int i = 0;
            while (true) {
                if (i >= jSONArray2.length()) {
                    break;
                }
                if (jSONArray2.optJSONObject(i).length() >= 1) {
                    this.f5513a.a(this.h.f, "extra");
                    break;
                }
                i++;
            }
        }
        y yVar4 = this.f5513a;
        yVar4.getClass();
        if (TextUtils.isEmpty(yVar4.f5516a) || (hashMap = yVar4.b) == null || hashMap.size() == 0) {
            return;
        }
        f fVar = IAConfigManager.R.H;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap2 = yVar4.b;
        for (String str2 : hashMap2.keySet()) {
            Object obj = hashMap2.get(str2);
            if (obj != null) {
                try {
                    jSONObject.put(str2, obj);
                } catch (JSONException unused2) {
                }
            }
        }
        String str3 = yVar4.c;
        if (str3 != null) {
            int length = str3.length();
            if (length > 51200) {
                int indexOf = str3.indexOf("iawrapper");
                if (indexOf == -1) {
                    indexOf = 0;
                }
                str3 = str3.substring(indexOf, 51199);
                IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", str3);
            } catch (JSONException e) {
                IAlog.a("Failed inserting ad body to json", e, new Object[0]);
            }
        }
        if (IAlog.f5940a == 1) {
            try {
                IAlog.d("%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused3) {
            }
        }
        fVar.f5492a.offer(jSONObject);
        if (fVar.f5492a.size() > 30) {
            com.fyber.inneractive.sdk.util.d1 d1Var = fVar.d;
            if (d1Var != null && d1Var.hasMessages(12312329)) {
                fVar.d.removeMessages(12312329);
            }
            com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.d;
            if (d1Var2 != null) {
                d1Var2.post(new c(fVar, 12312329, 0L));
            }
        }
    }
}
