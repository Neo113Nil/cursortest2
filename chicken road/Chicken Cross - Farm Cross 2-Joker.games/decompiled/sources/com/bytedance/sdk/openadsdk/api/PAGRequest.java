package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes4.dex */
public class PAGRequest {
    private Bundle gm = null;
    private String pcc;
    private Map<String, Object> sf;

    public String getAdString() {
        return this.pcc;
    }

    public void setAdString(String str) {
        this.pcc = str;
    }

    public Map<String, Object> getExtraInfo() {
        return this.sf;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.sf = map;
    }

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.gm == null) {
            this.gm = new Bundle();
        }
        this.gm.putBundle(cls.getName(), bundle);
    }

    public Bundle getNetworkExtrasBundle() {
        return this.gm;
    }
}
