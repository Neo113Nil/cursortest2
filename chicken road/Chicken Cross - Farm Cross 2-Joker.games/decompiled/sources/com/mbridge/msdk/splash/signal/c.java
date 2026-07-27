package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SplashSignalUtils.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f9830a = "SplashSignalUtils";
    private static int b = 0;
    private static int c = 1;

    /* compiled from: SplashSignalUtils.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f9831a;

        a(CampaignEx campaignEx) {
            this.f9831a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j a2 = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (a2 != null) {
                    if (a2.a(this.f9831a.getId())) {
                        a2.b(this.f9831a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f9831a.getId());
                        gVar.b(this.f9831a.getFca());
                        gVar.c(this.f9831a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        a2.b(gVar);
                    }
                }
                c.b(this.f9831a.getCampaignUnitId(), this.f9831a);
            } catch (Throwable th) {
                q0.b(c.f9830a, th.getMessage(), th);
            }
        }
    }

    public static void b(Object obj, JSONObject jSONObject) {
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

    public static void a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        JSONArray jSONArray;
        int i;
        boolean z;
        String str4;
        File file;
        String str5 = "";
        JSONObject jSONObject2 = new JSONObject();
        String str6 = "message";
        int i2 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("message", "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e) {
                q0.a(f9830a, e.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
            try {
                if (jSONArray2 != null) {
                    try {
                        if (jSONArray2.length() > 0) {
                            JSONArray jSONArray3 = new JSONArray();
                            int length = jSONArray2.length();
                            int i3 = 0;
                            while (i3 < length) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                                String optString = jSONObject3.optString("ref", str5);
                                int i4 = jSONObject3.getInt("type");
                                JSONObject jSONObject4 = new JSONObject();
                                if (i4 == i2 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject5 = new JSONObject();
                                    m b2 = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(optString);
                                    if (b2 != null) {
                                        jSONArray = jSONArray2;
                                        i = length;
                                        q0.a(f9830a, "VideoBean not null");
                                        jSONObject5.put("type", 1);
                                        jSONObject5.put("videoDataLength", b2.d());
                                        String e2 = b2.e();
                                        str2 = str6;
                                        if (TextUtils.isEmpty(e2)) {
                                            q0.a(f9830a, "VideoPath null");
                                            jSONObject5.put("path", str5);
                                            jSONObject5.put("path4Web", str5);
                                            str3 = str5;
                                        } else {
                                            str3 = str5;
                                            q0.a(f9830a, "VideoPath not null");
                                            jSONObject5.put("path", e2);
                                            jSONObject5.put("path4Web", e2);
                                        }
                                        if (b2.b() == 5) {
                                            jSONObject5.put("downloaded", 1);
                                            z = false;
                                        } else {
                                            z = false;
                                            jSONObject5.put("downloaded", 0);
                                        }
                                        jSONObject4.put(optString, jSONObject5);
                                        jSONArray3.put(jSONObject4);
                                    } else {
                                        str3 = str5;
                                        str2 = str6;
                                        jSONArray = jSONArray2;
                                        i = length;
                                        z = false;
                                        q0.a(f9830a, "VideoBean null");
                                    }
                                } else {
                                    str3 = str5;
                                    str2 = str6;
                                    jSONArray = jSONArray2;
                                    i = length;
                                    z = false;
                                    if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject6.put("type", 2);
                                        jSONObject6.put("path", H5DownLoadManager.getInstance().getH5ResAddress(optString) == null ? str3 : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                                        jSONObject4.put(optString, jSONObject6);
                                        jSONArray3.put(jSONObject4);
                                    } else if (i4 == 3 && !TextUtils.isEmpty(optString)) {
                                        try {
                                            file = new File(optString);
                                        } catch (Throwable th) {
                                            if (MBridgeConstans.DEBUG) {
                                                th.printStackTrace();
                                            }
                                        }
                                        if (file.exists() && file.isFile() && file.canRead()) {
                                            q0.a(f9830a, "getFileInfo Mraid file " + optString);
                                            str4 = "file:////" + optString;
                                            JSONObject jSONObject7 = new JSONObject();
                                            jSONObject7.put("type", 3);
                                            jSONObject7.put("path", str4);
                                            jSONObject4.put(optString, jSONObject7);
                                            jSONArray3.put(jSONObject4);
                                        }
                                        str4 = str3;
                                        JSONObject jSONObject72 = new JSONObject();
                                        jSONObject72.put("type", 3);
                                        jSONObject72.put("path", str4);
                                        jSONObject4.put(optString, jSONObject72);
                                        jSONArray3.put(jSONObject4);
                                    } else if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                                        JSONObject jSONObject8 = new JSONObject();
                                        jSONObject8.put("type", 4);
                                        jSONObject8.put("path", u0.a(optString) == null ? str3 : u0.a(optString));
                                        jSONObject4.put(optString, jSONObject8);
                                        jSONArray3.put(jSONObject4);
                                    }
                                }
                                i3++;
                                jSONArray2 = jSONArray;
                                length = i;
                                str6 = str2;
                                str5 = str3;
                                i2 = 1;
                            }
                            jSONObject2.put("resource", jSONArray3);
                            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = str6;
                        str = str2;
                        try {
                            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                            jSONObject2.put(str, th.getLocalizedMessage());
                            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        } catch (JSONException e3) {
                            q0.a(f9830a, e3.getMessage());
                            return;
                        }
                    }
                }
                try {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    str = "message";
                    try {
                        try {
                            jSONObject2.put(str, "resource is null");
                            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        } catch (JSONException e4) {
                            e = e4;
                            q0.a(f9830a, e.getMessage());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                        jSONObject2.put(str, th.getLocalizedMessage());
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    }
                } catch (JSONException e5) {
                    e = e5;
                    str = "message";
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = "message";
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
            q0.a(f9830a, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.m == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "splash");
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
            q0.b(f9830a, "code to string is error");
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
            q0.a(f9830a, e.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        q0.b(f9830a, "fireOnSignalCommunication");
        f.a().a(webView);
    }
}
