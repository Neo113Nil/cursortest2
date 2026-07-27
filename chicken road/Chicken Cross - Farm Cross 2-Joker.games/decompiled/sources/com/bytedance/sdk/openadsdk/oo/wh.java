package com.bytedance.sdk.openadsdk.oo;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh extends pcc {
    public static final SimpleDateFormat gm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public wh(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.oo.pcc
    public JSONObject oo() {
        return this.sf;
    }
}
