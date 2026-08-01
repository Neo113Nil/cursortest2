package com.bytedance.adsdk.ugeno.vy.qf;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class pcc extends com.bytedance.adsdk.ugeno.sf.pcc<com.bytedance.adsdk.ugeno.vy.sf.pcc> {
    public pcc(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                sf(str, str2);
                break;
        }
    }
}
