package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.tools.m0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: EventLibraryDecorate.java */
/* loaded from: classes6.dex */
public class d implements com.mbridge.msdk.tracker.d {
    private static void a(Map<String, String> map, StringBuilder sb) {
    }

    static String b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> keys = jSONObject.keys();
        int i = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            i++;
            if (i <= jSONObject.length() - 1) {
                sb.append(next).append(U3.j.b).append(a(String.valueOf(jSONObject.opt(next)))).append(U3.j.c);
            } else {
                sb.append(next).append(U3.j.b).append(a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb.toString();
    }

    @Override // com.mbridge.msdk.tracker.d
    public Map<String, String> a(com.mbridge.msdk.tracker.m mVar, List<com.mbridge.msdk.tracker.i> list, JSONObject jSONObject) {
        StringBuilder sb;
        Map<String, String> map;
        if (list != null && !list.isEmpty()) {
            try {
                c.a(jSONObject);
                map = a(jSONObject);
                if (map == null) {
                    try {
                        map = new HashMap();
                    } catch (Exception unused) {
                        sb = null;
                        a(map, sb);
                        return null;
                    } catch (Throwable unused2) {
                        sb = null;
                        a(map, sb);
                        return null;
                    }
                }
                sb = a(list);
                try {
                    map.put("tun", String.valueOf(m0.B()));
                    map.put("data", sb.toString());
                    return map;
                } catch (Exception unused3) {
                    a(map, sb);
                    return null;
                } catch (Throwable unused4) {
                    a(map, sb);
                    return null;
                }
            } catch (Exception unused5) {
                sb = null;
                map = null;
            } catch (Throwable unused6) {
                sb = null;
                map = null;
            }
        }
        return null;
    }

    static Map<String, String> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return hashMap;
    }

    private static StringBuilder a(List<com.mbridge.msdk.tracker.i> list) {
        com.mbridge.msdk.tracker.e d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.tracker.i iVar = list.get(i);
            if (iVar != null && (d = iVar.d()) != null) {
                JSONObject i2 = d.i();
                c.a(i2);
                if (i2 == null) {
                    i2 = new JSONObject();
                }
                try {
                    try {
                        i2.put("ts", d.l());
                        i2.put("rts", System.currentTimeMillis());
                        String i3 = iVar.i();
                        if (!TextUtils.isEmpty(i3)) {
                            i2.put("reason_lib", i3);
                        }
                        int h = iVar.h() - 1;
                        if (h >= 1) {
                            i2.put("retryed", h);
                        }
                        long d2 = d.d();
                        if (d2 > 0) {
                            i2.put(IronSourceConstants.EVENTS_DURATION, d2);
                        }
                    } catch (Exception e) {
                        if (com.mbridge.msdk.tracker.a.f9983a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e);
                        }
                    }
                    sb.append(b(i2));
                    if (i < list.size() - 1) {
                        sb.append("\n");
                    }
                } catch (Throwable th) {
                    sb.append(b(i2));
                    throw th;
                }
            }
        }
        return sb;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, C4761z5.O);
        } catch (Exception unused) {
            return str;
        }
    }
}
