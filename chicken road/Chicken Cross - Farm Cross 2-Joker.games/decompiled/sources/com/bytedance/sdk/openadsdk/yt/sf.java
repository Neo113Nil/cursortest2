package com.bytedance.sdk.openadsdk.yt;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface sf {
    public static final pcc<JSONObject> pcc = new pcc<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.yt.sf.1
        @Override // com.bytedance.sdk.openadsdk.yt.sf.pcc
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public JSONObject sf(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
    };

    public interface pcc<T> {
        T sf(String str);
    }
}
