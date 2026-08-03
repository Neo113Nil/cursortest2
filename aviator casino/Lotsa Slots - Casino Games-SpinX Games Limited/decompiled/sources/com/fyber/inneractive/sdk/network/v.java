package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.network.y f3859a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ com.fyber.inneractive.sdk.network.w h;

    public v(com.fyber.inneractive.sdk.network.w wVar, com.fyber.inneractive.sdk.network.y yVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5) {
        this.h = wVar;
        this.f3859a = yVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.util.HashMap hashMap;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.network.w wVar = this.h;
        com.fyber.inneractive.sdk.network.t tVar = wVar.b;
        if (tVar != null) {
            this.f3859a.a(java.lang.Integer.valueOf(tVar.val), androidx.core.app.NotificationCompat.CATEGORY_ERROR);
            this.h.b.getClass();
            str = com.fyber.inneractive.sdk.network.r1.ERROR_TABLE.a();
            com.fyber.inneractive.sdk.util.IAlog.a("Event dispatcher - dispatching error: %s", this.h.b);
            com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "DISPATCHED_SDK_ERROR", java.lang.Integer.valueOf(this.h.b.val));
        } else {
            com.fyber.inneractive.sdk.network.u uVar = wVar.c;
            if (uVar != null) {
                this.f3859a.a(java.lang.Integer.valueOf(uVar.val), androidx.core.app.NotificationCompat.CATEGORY_EVENT);
                this.h.c.getClass();
                str = com.fyber.inneractive.sdk.network.r1.EVENT_TABLE.a();
                com.fyber.inneractive.sdk.util.IAlog.a("Event dispatcher - dispatching event: %s", this.h.c);
                com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "DISPATCHED_SDK_EVENT", java.lang.Integer.valueOf(this.h.c.val));
            } else {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.network.y yVar = this.f3859a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        com.fyber.inneractive.sdk.network.w wVar2 = this.h;
        com.fyber.inneractive.sdk.network.t tVar2 = wVar2.b;
        sb.append(tVar2 != null ? java.lang.String.valueOf(tVar2.val) : java.lang.String.valueOf(wVar2.c.val));
        yVar.a(sb.toString(), com.ironsource.B5.R);
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        this.f3859a.a(java.lang.Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!com.fyber.inneractive.sdk.config.IAConfigManager.c()) {
            this.f3859a.a(this.b, "contentid");
            this.f3859a.a(this.c, "fairbidv");
            if (!android.text.TextUtils.isEmpty(this.d)) {
                this.f3859a.a(this.d, "placement_type");
            }
            if (!android.text.TextUtils.isEmpty(this.e)) {
                this.f3859a.a(this.e, "spot_id");
            }
            if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
                java.lang.String i = com.fyber.inneractive.sdk.util.k.i();
                if (!android.text.TextUtils.isEmpty(i)) {
                    this.f3859a.a(i, "ciso");
                }
            }
            this.f3859a.a(this.f, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_AD_TYPE);
            if (this.h.g && !android.text.TextUtils.isEmpty(this.g)) {
                this.f3859a.c = this.g;
            }
            this.f3859a.a(com.fyber.inneractive.sdk.util.a1.a().b(), com.ironsource.B5.q);
            try {
                this.f3859a.a(com.fyber.inneractive.sdk.network.w.h.format(calendar.getTime()), "day");
            } catch (java.lang.Throwable unused) {
            }
            this.f3859a.a(java.lang.Integer.valueOf(calendar.get(11)), "hour");
            org.json.JSONArray jSONArray = this.h.d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f3859a.a(this.h.d, com.ironsource.C3369xe.d);
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.h.e;
            if (eVar2 != null && eVar2.A) {
                this.f3859a.a("1", "sdk_bidding");
            }
            if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
                this.f3859a.a("1", "child_mode");
            }
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            this.f3859a.a(iAConfigManager.D.n() && (eVar = this.h.e) != null && eVar.E != com.fyber.inneractive.sdk.ignite.m.NONE ? "1" : "0", "ignite");
            com.fyber.inneractive.sdk.network.y yVar2 = this.f3859a;
            com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.D.p;
            yVar2.a(lVar != null ? lVar.f3496a.d() : null, "ignitep");
            com.fyber.inneractive.sdk.network.y yVar3 = this.f3859a;
            com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.D.p;
            yVar3.a(lVar2 != null ? lVar2.f3496a.i() : null, "ignitev");
            org.json.JSONArray b = iAConfigManager.L.b();
            if (b != null && b.length() > 0) {
                this.f3859a.a(b, "s_experiments");
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.h.e;
            if (eVar3 != null && eVar3.I) {
                this.f3859a.a("1", "dynamic_controls");
            }
        }
        org.json.JSONArray jSONArray2 = this.h.f;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray2.length()) {
                    break;
                }
                if (jSONArray2.optJSONObject(i2).length() >= 1) {
                    this.f3859a.a(this.h.f, "extra");
                    break;
                }
                i2++;
            }
        }
        com.fyber.inneractive.sdk.network.y yVar4 = this.f3859a;
        yVar4.getClass();
        if (android.text.TextUtils.isEmpty(yVar4.f3862a) || (hashMap = yVar4.b) == null || hashMap.size() == 0) {
            return;
        }
        com.fyber.inneractive.sdk.network.f fVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.F;
        fVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.HashMap hashMap2 = yVar4.b;
        for (java.lang.String str2 : hashMap2.keySet()) {
            java.lang.Object obj = hashMap2.get(str2);
            if (obj != null) {
                try {
                    jSONObject.put(str2, obj);
                } catch (org.json.JSONException unused2) {
                }
            }
        }
        java.lang.String str3 = yVar4.c;
        if (str3 != null) {
            int length = str3.length();
            if (length > 51200) {
                int indexOf = str3.indexOf("iawrapper");
                if (indexOf == -1) {
                    indexOf = 0;
                }
                str3 = str3.substring(indexOf, 51199);
                com.fyber.inneractive.sdk.util.IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", java.lang.Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", str3);
            } catch (org.json.JSONException e) {
                com.fyber.inneractive.sdk.util.IAlog.a("Failed inserting ad body to json", e, new java.lang.Object[0]);
            }
        }
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a == 1) {
            try {
                com.fyber.inneractive.sdk.util.IAlog.d("%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (java.lang.Throwable unused3) {
            }
        }
        fVar.f3838a.offer(jSONObject);
        if (fVar.f3838a.size() > 30) {
            com.fyber.inneractive.sdk.util.d1 d1Var = fVar.d;
            if (d1Var != null && d1Var.hasMessages(12312329)) {
                fVar.d.removeMessages(12312329);
            }
            com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.d;
            if (d1Var2 != null) {
                d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, 0L));
            }
        }
    }
}
