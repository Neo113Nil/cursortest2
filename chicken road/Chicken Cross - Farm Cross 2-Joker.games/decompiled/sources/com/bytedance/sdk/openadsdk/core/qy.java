package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qy implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene pcc;

    public qy(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.pcc = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        jsj.pcc(1, this.pcc, i);
        return com.bytedance.sdk.component.utils.pcc.pcc(jSONObject);
    }
}
