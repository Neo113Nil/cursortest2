package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONObject;

/* compiled from: CommonSignalCommunicatioImpUtils.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9615a = "d";
    public static int b = 0;
    public static int c = 1;

    /* compiled from: CommonSignalCommunicatioImpUtils.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f9616a;

        a(CampaignEx campaignEx) {
            this.f9616a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j a2 = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (a2 != null) {
                    if (a2.a(this.f9616a.getId())) {
                        a2.b(this.f9616a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f9616a.getId());
                        gVar.b(this.f9616a.getFca());
                        gVar.c(this.f9616a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        a2.b(gVar);
                    }
                }
                d.b(this.f9616a.getCampaignUnitId(), this.f9616a);
            } catch (Throwable th) {
                q0.b(d.f9615a, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.c == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "banner");
    }

    public static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(parseCampaignWithBackData);
                b(obj, "");
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    public static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            a(obj, e.getMessage());
            q0.a(f9615a, e.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static String a(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), f));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), f2));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.m, 0);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.k, com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, v0.d(com.mbridge.msdk.foundation.controller.c.n().d()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.j, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
        } catch (Throwable unused) {
            q0.b(f9615a, "code to string is error");
        }
        return "";
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            q0.a(f9615a, e.getMessage());
        }
    }
}
