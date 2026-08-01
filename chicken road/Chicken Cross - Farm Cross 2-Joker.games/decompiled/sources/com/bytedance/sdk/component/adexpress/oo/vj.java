package com.bytedance.sdk.component.adexpress.oo;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class vj {
    public static boolean pcc(String str) {
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
