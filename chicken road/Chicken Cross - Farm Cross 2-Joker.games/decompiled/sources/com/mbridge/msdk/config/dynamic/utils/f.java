package com.mbridge.msdk.config.dynamic.utils;

import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.touch.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewUtil.java */
/* loaded from: classes6.dex */
public class f {
    public static void a(XMLView xMLView, Object obj, Map<String, Object> map) {
        HashMap<String, Object> a2;
        if (xMLView == null || xMLView.getXmlViewActionListener() == null) {
            return;
        }
        com.mbridge.msdk.config.dynamic.baseview.touch.a touchEventData = xMLView.getTouchEventData();
        HashMap hashMap = new HashMap();
        if (touchEventData != null && (a2 = touchEventData.a()) != null) {
            a.C1362a b = touchEventData.b();
            if (b != null) {
                a2.put("click_x", String.valueOf(b.b));
                a2.put("click_y", String.valueOf(b.c));
            }
            a2.put("click_time", String.valueOf(System.currentTimeMillis()));
            hashMap.putAll(a2);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        xMLView.getXmlViewActionListener().a(String.valueOf(obj), hashMap);
    }
}
