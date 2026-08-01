package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q0 implements com.fyber.inneractive.sdk.util.b1 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5276a = null;
    public UnitDisplayType b;
    public Boolean c;
    public Integer d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, ToolBar.REFRESH, this.f5276a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "unitDisplayType", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "close", this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "hideDelay", this.d);
        return jSONObject;
    }
}
