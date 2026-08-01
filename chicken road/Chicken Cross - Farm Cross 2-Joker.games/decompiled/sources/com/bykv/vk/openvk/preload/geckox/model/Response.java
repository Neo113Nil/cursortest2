package com.bykv.vk.openvk.preload.geckox.model;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class Response {
    public ComponentModel data;
    public int status;

    public Response fromJson(String str) {
        JSONObject optJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("status")) {
                this.status = jSONObject.optInt("status");
            }
            if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                ComponentModel componentModel = new ComponentModel();
                this.data = componentModel;
                componentModel.fromJson(optJSONObject);
            }
        } catch (Throwable unused) {
        }
        return this;
    }
}
