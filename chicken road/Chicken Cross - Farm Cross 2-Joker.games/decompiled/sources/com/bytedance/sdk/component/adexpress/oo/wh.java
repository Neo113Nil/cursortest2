package com.bytedance.sdk.component.adexpress.oo;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class wh {
    public static boolean pcc(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean sf(String str) {
        return com.bytedance.sdk.component.adexpress.oo.sf() && pcc(str);
    }
}
