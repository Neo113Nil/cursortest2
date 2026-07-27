package com.bytedance.sdk.component.qf.gm;

import android.text.TextUtils;
import com.tiktok.util.UrlConst;

/* loaded from: classes4.dex */
public class wh {
    public static boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith(UrlConst.HTTPS);
    }
}
