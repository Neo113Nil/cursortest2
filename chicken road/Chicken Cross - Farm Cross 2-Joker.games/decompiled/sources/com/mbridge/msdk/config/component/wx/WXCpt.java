package com.mbridge.msdk.config.component.wx;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class WXCpt extends a {
    final String h = "400001";
    final String i = "400002";
    final String j = "400003";
    private com.mbridge.msdk.config.component.wx.model.a k;

    private void a(Context context, String str, String str2, String str3, String str4) {
        String message;
        int i = 0;
        boolean z = m0.G() == 1;
        boolean z2 = m0.E(context) == 1;
        if (!z || !z2) {
            a(0, "400002", "Wechat environment error.");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = str4;
            }
            Object d = m0.d(str);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object newInstance = cls.newInstance();
            cls.getField("userName").set(newInstance, str2);
            cls.getField("path").set(newInstance, str3);
            cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(d, newInstance);
            message = "";
            i = 1;
        } catch (Throwable th) {
            message = th.getMessage();
        }
        a(i, i != 0 ? "" : "400003", i == 0 ? message : "");
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        super.b(map);
        this.f = "907001";
        Object obj = map.get(c.c("144"));
        if (obj instanceof Map) {
            this.k = new com.mbridge.msdk.config.component.wx.model.a((Map) obj);
            if (e() != null) {
                this.k.a(e().getContext());
            } else {
                this.k.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } else {
            a(0, "400001", "WXInfo is empty");
        }
        a("907003", (HashMap<String, Object>) null);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.wx.model.a aVar = this.k;
        if (aVar != null) {
            a(aVar.b(), this.k.e(), this.k.c(), this.k.d(), this.k.a());
        }
    }

    private void a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(c.c("500"), String.valueOf(i));
        if (i == 0) {
            hashMap.put(c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), str);
            hashMap.put(c.c("reason"), str2);
        }
        a(a("907002", (Map<String, Object>) hashMap));
    }
}
